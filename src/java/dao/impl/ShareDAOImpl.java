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
package dao.impl;

import context.DBContext;
import dao.ShareDAO;
import entity.Share;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * This class has methods for retrieving data from share tables in database. 
 * The method will return an object of the class
 * <code> java.lang.Exception</code> when there is any error querying the data.
 * <p>
 * Bugs: None
 *
 * @author DINH PHUONG THAO
 */
public class ShareDAOImpl extends DBContext implements ShareDAO{

    /**
     * Get Share based from share field in share table.. The result is a
     * <code>Share</code> objects with faceUrl, twitterUrl, googleUrl, iconFace,
     * iconTwitter, iconGoogle
     *
     * @return a <code>Share</code> objects.
     * @throws java.lang.Exception
     */
    @Override
    public Share getShare() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT top 1 * from share";
            conn = getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Share(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
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

    
}
