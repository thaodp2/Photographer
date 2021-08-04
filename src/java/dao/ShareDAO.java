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

import entity.Share;

/**
 * This interface will retrieve data from Share table in the database
 * <p>
 * Bugs: None
 *
 * @author DINH PHUONG THAO
 */
public interface ShareDAO {
    /**
     * Get Share based from share field in share table.. The result is a
     * <code>Share</code> objects with faceUrl, twitterUrl, googleUrl, iconFace,
     * iconTwitter, iconGoogle
     *
     * @return a <code>Share</code> objects.
     * @throws java.lang.Exception
     */
    public Share getShare() throws Exception;

}
