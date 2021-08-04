/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import context.DBContext;
import dao.ImageDAO;
import entity.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * This class has methods for retrieving data from image tables in database. 
 * The method will return an object of the class
 * <code> java.lang.Exception</code> when there is any error querying the data.
 * <p>
 * Bugs: None
 *
 * @author DINH PHUONG THAO
 */
public class ImageDAOImpl extends DBContext implements ImageDAO {

    /**
     * Get the first Image. The first Image (sort by image id) with galleryID
     * will be returned. The result is a <code>Image</code> objects with id,
     * galery_id, image_url
     *
     * @param id the id of Gallery will get image. It is an int number
     * @param imgURL the imgURL of image will get image. It is an int number
     * @return a <code>Contact</code> objects.
     * @throws java.sql.SQLException
     * @throws java.lang.Exception
     */
    @Override
    public String getImageByGaleryID(int id, String imgURL) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "select top 1 image_url from image\n"
                    + "where galery_id = ?";
            if (imgURL.length() != 0) {
                query = query + " and image_url = '" + imgURL + "'";
            }
            conn = getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeRs(rs);
            closePs(ps);
            closeCon(conn);
        }
        return null;
    }

    /**
     * Count the number of Image in Gallery. The result is number of Image in
     * Gallery
     *
     * @param id the id of Gallery will get image
     * @return an integer number that has type is int
     * @throws java.lang.Exception
     */
    @Override
    public int countImage(int id) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT count(*) from image where galery_id = ?";
            conn = getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            int cout = 0;
            while (rs.next()) {
                cout = rs.getInt(1);
            }
            return cout;
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeRs(rs);
            closePs(ps);
            closeCon(conn);
        }
    }


   /**
     * get limit Image for page. All Image from row (pageSize*pageIndex -
     * (pageSize-1)) to (pageSize*pageIndex) row will be returned. The result
     * contain a list of <code>Image</code> objects with id, galery_id,
     * image_url
     *
     * @param galeryID the id of Gallery will get image. It is an int number
     * @param pageIndex the index of the page. It is an int number
     * @param pageSize maximum number of Gallery on one page. It is an int
     * number
     * @return a list of <code>Image</code> objects. It is a
     * <code>java.util.List</code> object
     * @throws java.lang.Exception
     */
    @Override
    public List<Image> getListImageWithPaging(int galeryID, int pageIndex, int pageSize) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Image> list = new ArrayList<>();
        int size = countImage(galeryID);
        try {
            String query = "select * from ( select ROW_NUMBER() over (order by id ASC) as rn , * from  image where galery_id = ?) "
                    + "as b where rn between ((?*?) - ?)and (?*?)";
            conn = getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, galeryID);
            ps.setInt(2, pageSize);
            ps.setInt(3, pageIndex);
            ps.setInt(4, pageSize - 1);
            ps.setInt(5, pageSize);
            ps.setInt(6, pageIndex);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Image(rs.getInt(2),
                        rs.getInt(3),
                        rs.getString(4)));
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeRs(rs);
            closePs(ps);
            closeCon(conn);
        }
        return list;
    }

}
