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
package entity;

/**
 * This class contains properties, constructor, getter, setter of Contact object
 * <p>
 * Bugs: None
 *
 * @author DINH PHUONG THAO
 */
public class Share {

    private String faceUrl;
    private String twitterUrl;
    private String googleUrl;
    private String iconFace;
    private String iconTwitter;
    private String iconGoogle;

    /**
     * Constructor has parameters used to initialize an object with information
     * passed in Parameters that need to be passed include faceUrl, twitterUrl,
     * googleUrl, iconFace, iconTwitter, iconGoogle
     *
     * @param faceUrl the faceUrl of Share. It is a
     * <code>java.lang.String</code> object
     * @param twitterUrl the twitterUrl of Share. It is a
     * <code>java.lang.String</code> object
     * @param googleUrl the googleUrl of Share. It is a
     * <code>java.lang.String</code> object
     * @param iconFace the iconFace of Share. It is a
     * <code>java.lang.String</code> object
     * @param iconTwitter the iconTwitter of Share. It is a
     * <code>java.lang.String</code> object
     * @param iconGoogle the iconGoogle of Share. It is a
     * <code>java.lang.String</code> object
     */
    public Share(String faceUrl, String twitterUrl, String googleUrl, String iconFace, String iconTwitter, String iconGoogle) {
        this.faceUrl = faceUrl;
        this.twitterUrl = twitterUrl;
        this.googleUrl = googleUrl;
        this.iconFace = iconFace;
        this.iconTwitter = iconTwitter;
        this.iconGoogle = iconGoogle;
    }

    /**
     * Parameterless constructor used to initialize a Share object
     */
    public Share() {
    }

    /**
     * Get value from faceUrl attribute of <code>Share</code> object
     *
     * @return faceUrl of object
     */
    public String getFaceUrl() {
        return faceUrl;
    }

    /**
     * Set value for faceUrl attribute of <code>Share</code> object
     *
     * @param faceUrl the faceUrl of object. It is a
     * <code>java.lang.String</code> object
     */
    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    /**
     * Get value from twitterUrl attribute of <code>Share</code> object
     *
     * @return twitterUrl of object
     */
    public String getTwitterUrl() {
        return twitterUrl;
    }

    /**
     * Set value for twitterUrl attribute of <code>Share</code> object
     *
     * @param twitterUrl the twitterUrl of object. It is a
     * <code>java.lang.String</code> object
     */
    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    /**
     * Get value from googleUrl attribute of <code>Share</code> object
     *
     * @return googleUrl of object
     */
    public String getGoogleUrl() {
        return googleUrl;
    }

    /**
     * Set value for googleUrl attribute of <code>Share</code> object
     *
     * @param googleUrl the googleUrl of object. It is a
     * <code>java.lang.String</code> object
     */
    public void setGoogleUrl(String googleUrl) {
        this.googleUrl = googleUrl;
    }

    /**
     * Get value from iconFace attribute of <code>Share</code> object
     *
     * @return iconFace of object
     */
    public String getIconFace() {
        return iconFace;
    }

    /**
     * Set value for iconFace attribute of <code>Share</code> object
     *
     * @param iconFace the iconFace of object. It is a
     * <code>java.lang.String</code> object
     */
    public void setIconFace(String iconFace) {
        this.iconFace = iconFace;
    }

    /**
     * Get value from iconTwitter attribute of <code>Share</code> object
     *
     * @return iconTwitter of object
     */
    public String getIconTwitter() {
        return iconTwitter;
    }

    /**
     * Set value for iconTwitter attribute of <code>Share</code> object
     *
     * @param iconTwitter the iconTwitter of object. It is a
     * <code>java.lang.String</code> object
     */
    public void setIconTwitter(String iconTwitter) {
        this.iconTwitter = iconTwitter;
    }

    /**
     * Get value from iconGoogle attribute of <code>Share</code> object
     *
     * @return iconGoogle of object
     */
    public String getIconGoogle() {
        return iconGoogle;
    }

    /**
     * Set value for iconGoogle attribute of <code>Share</code> object
     *
     * @param iconGoogle the iconGoogle of object. It is a
     * <code>java.lang.String</code> object
     */
    public void setIconGoogle(String iconGoogle) {
        this.iconGoogle = iconGoogle;
    }

}
