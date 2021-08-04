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
package listioner;

import dao.GalleryDAO;
import dao.impl.GalleryDAOImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * This class implement HttpSessionListener, has method that catch
 * sessionCreated event to count the viewCount access page
 * <p>
 * Bugs: None
 *
 * @author DINH PHUONG THAO
 */
public class SessionListener implements HttpSessionListener {

    /**
     * Catch sessionCreated event. When session is created, this method will
     * catch that event, then update the viewCount in View table in database,
     * push list viewCount count to session
     *
     * @param se the session event. It is a
     * <code>javax.servlet.http.HttpSessionEvent</code> object
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        GalleryDAO galleryDAO = new GalleryDAOImpl();
        HttpSession session = se.getSession();
        session.getMaxInactiveInterval();
        try {
            galleryDAO.increaseView();
            int numberOfViews = galleryDAO.getViews();
            List<String> listViews = new ArrayList<>();
            String formatViews = String.format("%06d", numberOfViews);
            for (int i = formatViews.length() - 1; i >= 0; i--) {
                listViews.add(formatViews.charAt(i) + "");
            }
            session.setAttribute("numberOfViews", listViews);
        } catch (Exception ex) {
            Logger.getLogger(SessionListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Catch Destroyed event.
     *
     * @param se the session event. It is a
     * <code>javax.servlet.http.HttpSessionEvent;</code> object
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
