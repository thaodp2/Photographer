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
package dao;

import entity.Gallery;
import java.util.List;

/**
 * This interface will retrieve data from Gallery table in the database
 * <p>
 * Bugs: None
 *
 * @author DINH PHUONG THAO
 */
public interface GalleryDAO {
     /**
     * Get Gallery by ID. Gallery based on Gallery_ID will be returned. The
     * result is a <code>Gallery</code> objects with ID, title, description,
     * name, image
     *
     * @param id the Gallery_ID. It is an int number
     * @return a <code>Digital</code> objects.
     * @throws java.lang.Exception
     */
    public Gallery getGaleryByID(int id) throws Exception;
     /**
     * Get value from View field in View table. The result is view of page
     *
     * @return number of view
     * @throws java.lang.Exception
     */
    public int getViews() throws Exception;
     /**
     * Update value of View field in View table. The value of View field will be
     * update when access page
     *
     * @throws java.lang.Exception
     */
    public void increaseView() throws Exception;
     /**
     * get limit Gallery for page. All Gallery from row (pageSize*pageIndex -
     * (pageSize-1)) to (pageSize*pageIndex) row will be returned. The result
     * contain a list of <code>Gallery</code> objects with iID, title,
     * description, name, image
     *
     * @param pageIndex the index of the page. It is an int number
     * @param pageSize maximum number of Gallery on one page. It is an int number
     * @return a list of <code>Gallery</code> objects. It is a
     * <code>java.util.List</code> object
     * @throws java.lang.Exception
     */
    public List<Gallery> getListGaleryWithPaging(int pageIndex, int pageSize) throws Exception;
    /**
     * Count the number of Gallery in database. The result is number of Gallery
     * in database
     *
     * @return number of gallery
     * @throws java.lang.Exception
     */
    public int count() throws Exception;
    /**
     * Get top (number) Gallery. (number) Gallery based on Gallery_ID and sorted by
     * ascending time will be returned. The result contain a list of
     * <code>Gallery</code> objects with ID, title, description, name, image
     *
     * @param number the number of latest news. It is an int number
     * @return a list of <code>Digital</code> objects. It is a
     * <code>java.util.List</code> object
     * @throws java.lang.Exception
     */
    public List<Gallery> getTopGalley(int number) throws Exception;
    
}
