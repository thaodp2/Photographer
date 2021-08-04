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

import entity.Image;
import java.util.List;

/**
 * This interface will retrieve data from Image table in the database
 * <p>
 * Bugs: None
 *
 * @author DINH PHUONG THAO
 */
public interface ImageDAO {
    /**
     * Get the first Image. The first Image (sort by image id) with galleryID
     * will be returned. The result is a <code>Image</code> objects with id,
     * galery_id, image_url
     *
     * @param id the id of Gallery will get image. It is an int number
     * @return a <code>Contact</code> objects.
     * @throws java.sql.SQLException
     * @throws java.lang.Exception
     */
    public String getImageByGaleryID(int id, String imgURL) throws Exception;
    
     /**
     * Count the number of Image in Gallery. The result is number of Image in
     * Gallery
     *
     * @param id the id of Gallery will get image
     * @return an integer number that has type is int
     * @throws java.lang.Exception
     */
    public int countImage(int id) throws Exception;
    
    /**
     * get limit Image for page. All Image from row (pageSize*pageIndex -
     * (pageSize-1)) to (pageSize*pageIndex) row will be returned. The result
     * contain a list of <code>Image</code> objects with id, galery_id,
     * image_url
     *
     * @param galeryID the id of Gallery will get image. It is an int number
     * @param pageIndex the index of the page. It is an int number
     * @param pageSize maximum number of Gallery on one page. It is an int number
     * @return a list of <code>Image</code> objects. It is a
     * <code>java.util.List</code> object
     * @throws java.lang.Exception
     */
       public List<Image> getListImageWithPaging(int galeryID, int pageIndex, int pageSize) throws Exception;
    
}
