/**
 * Copyright(C) 2021, DINH PHUONG THAO
 * J3.L.P0017
 * Photographer
 *
 * Record of change:
 * DATE            Version             AUTHOR           DESCRIPTION
 * 2021-07-11      1.0                 THAODP           First Implement
 * 2021-07-11      2.0                 THAODP           Second Implement
 */
package controller;

import dao.ContactDAO;
import dao.GalleryDAO;
import dao.ImageDAO;
import dao.ShareDAO;
import dao.impl.ContactDAOImpl;
import dao.impl.GalleryDAOImpl;
import dao.impl.ImageDAOImpl;
import dao.impl.ShareDAOImpl;
import entity.Image;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class contains a method that gets top3 Gallery, list paging Image, Contact,
 * a total image of gallery, main image, gallery from PhotoDAOImpl, get parameter galeryID, indexPage
 * and find maxPage then forward to the "Gallery.jsp".
 * Servlet will directly respond to "Error.jsp" when any error occurs
 * <p>
 * Bugs: None
 *
 * @author DINH PHUONG THAO
 */
@WebServlet(name = "GalleryController", urlPatterns = {"/GalleryController"})
public class GalleryController extends HttpServlet {

    /**
     * The method gets top3 Gallery, list paging Image, Contact, a total image of gallery,
     * main image, gallery from GalleryDAOImpl, get parameter galeryID, indexPage
     * and find maxPage then forward to the "Gallery.jsp".
     * Each page will have a maximum of 8 Image of Gallery.
     * Servlet will directly responds to "Error.jsp" when any error occurs
     *
     * @param request stores attributes like: top3Gallery, listPagingGallery,
     * listPagingImage, maxPage, index, image, contact, error to send to JSP. It is a <code> javax.servlet.http.HttpServletRequest
     * </code>
     * @param response provide HTTP-specific functionality in sending a response
     * to client's web browser. It is a <code> javax.servlet.http.HttpServletResponse
     * </code>
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try {
            GalleryDAO galleryDAO = new  GalleryDAOImpl();
            ContactDAO contactDAO = new ContactDAOImpl();
            ShareDAO shareDAO = new ShareDAOImpl();
            ImageDAO imageDAO = new ImageDAOImpl();
            request.setAttribute("share", shareDAO.getShare());
            request.setAttribute("listTop3Gallery", galleryDAO.getTopGalley(3));
            String galleryId = request.getParameter("galeryID");
            String imageChoice = request.getParameter("imageChoice");
            imageChoice = imageChoice == null ?"":imageChoice;
            int galleryIdInt = 0;
            if (galleryId != null) {
                galleryIdInt = Integer.parseInt(galleryId);
            } else {
                galleryIdInt = 1;
            }
            int pageSize = 8;
            int totalRecord = imageDAO.countImage(galleryIdInt);
            if (totalRecord <= 0) {
                request.setAttribute("error", "No image in galery!!");
            }
            int maxPage = totalRecord / pageSize;
            if ((totalRecord % pageSize) != 0) {
                maxPage++;
            }
            String pageIndex = request.getParameter("index");
            int index = 0;
            if (pageIndex != null) {
                index = Integer.parseInt(pageIndex);
            } else {
                index = 1;
            }
            if (index > maxPage || index < 1) {
                request.setAttribute("error", "Don't have this Page");
            }
            List<Image> imagelList = imageDAO.getListImageWithPaging(galleryIdInt, index, pageSize);
            request.setAttribute("listImage", imagelList);
            request.setAttribute("mainImage", imageDAO.getImageByGaleryID(galleryIdInt,imageChoice));
            request.setAttribute("index", index);
            request.setAttribute("maxPage", maxPage);
            request.setAttribute("galeryID", galleryIdInt);
            request.setAttribute("galery", galleryDAO.getGaleryByID(galleryIdInt));
            request.setAttribute("active", galleryIdInt);
            request.getRequestDispatcher("Gallery.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("Error.jsp").forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request provides important information about a client request to a
     * servlet. It is a <code> javax.servlet.http.HttpServletRequest </code>
     * @param response respond to an HTTP Request to the browser It is a <code> javax.servlet.http.HttpServletResponse
     * </code>
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request provides important information about a client request to a
     * servlet. It is a <code> javax.servlet.http.HttpServletRequest </code>
     * @param response respond to an HTTP Request to the browser It is a <code> javax.servlet.http.HttpServletResponse
     * </code>
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
