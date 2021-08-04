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

import entity.Contact;

/**
 * This interface will retrieve data from Contact table in the database
 * <p>
 * Bugs: None
 *
 * @author DINH PHUONG THAO
 */
public interface ContactDAO {
    /**
     * Get all contact information of photographer. All information about
     * contact of photographer will be returned. The result is a
     * <code>ContactInfor</code> objects with telephone, email, face_url
     * twitter_url, google_url, about, address, city, country, map_url,
     * image_main, main_des, icon_face, icon_twitter, icon_google
     *
     * @return a <code>Contact</code> objects.
     * @throws java.lang.Exception
     */
    public Contact getContact() throws Exception;
    
}
