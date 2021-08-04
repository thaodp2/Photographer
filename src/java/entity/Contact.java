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
public class Contact {

    private String telephone;
    private String email;
    private String about;
    private String address;
    private String city;
    private String country;
    private String mapUrl;
    private String imageMain;

    /**
     * Parameterless constructor used to initialize a Contact object
     */
    public Contact() {
    }

    /**
     * Constructor has parameters used to initialize an object with information
     * passed in Parameters that need to be passed include telephone, email,
     * about, address, city, country, mapUrl, imageMain
     *
     * @param telephone the telephone of Contact. It is a
     * <code>java.lang.String</code> object
     * @param email the email of Contact. It is a <code>java.lang.String</code>
     * object
     * @param about the about information of Contact. It is a
     * <code>java.lang.String</code> object
     * @param address the address of Contact. It is a
     * <code>java.lang.String</code> object
     * @param city the city of Contact. It is a <code>java.lang.String</code>
     * object
     * @param country the country of Contact. It is a
     * <code>java.lang.String</code> object
     * @param mapUrl the mapUrl of Contact. It is a
     * <code>java.lang.String</code> object
     * @param imageMain the imageMain of Contact. It is a
     * <code>java.lang.String</code> object
     */
    public Contact(String telephone, String email, String about, String address, String city, String country, String mapUrl, String imageMain) {
        this.telephone = telephone;
        this.email = email;
        this.about = about;
        this.address = address;
        this.city = city;
        this.country = country;
        this.mapUrl = mapUrl;
        this.imageMain = imageMain;
    }

    /**
     * Get value from telephone attribute of <code>Contact</code> object
     *
     * @return telephone of object
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Set value for telephone attribute of <code>Contact</code> object
     *
     * @param telephone the telephone of object. It is a
     * <code>java.lang.String</code> object
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Get value from email attribute of <code>Contact</code> object
     *
     * @return email of object
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set value for email attribute of <code>Contact</code> object
     *
     * @param email the email of object. It is a <code>java.lang.String</code>
     * object
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get value from about attribute of <code>Contact</code> object
     *
     * @return about of object
     */
    public String getAbout() {
        return about;
    }

    /**
     * Set value for about attribute of <code>Contact</code> object
     *
     * @param about the about of object. It is a <code>java.lang.String</code>
     * object
     */
    public void setAbout(String about) {
        this.about = about;
    }

    /**
     * Get value from address attribute of <code>Contact</code> object
     *
     * @return address of object
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set value for address attribute of <code>Contact</code> object
     *
     * @param address the address of object. It is a
     * <code>java.lang.String</code> object
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get value from city attribute of <code>Contact</code> object
     *
     * @return city of object
     */
    public String getCity() {
        return city;
    }

    /**
     * Set value for city attribute of <code>Contact</code> object
     *
     * @param city the city of object. It is a <code>java.lang.String</code>
     * object
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get value from country attribute of <code>Contact</code> object
     *
     * @return country of object
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set value for country attribute of <code>Contact</code> object
     *
     * @param country the country of object. It is a
     * <code>java.lang.String</code> object
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Get value from mapUrl attribute of <code>Contact</code> object
     *
     * @return mapUrl of object
     */
    public String getMapUrl() {
        return mapUrl;
    }

    /**
     * Set value for mapUrl attribute of <code>Contact</code> object
     *
     * @param mapUrl the mapUrl of object. It is a <code>java.lang.String</code>
     * object
     */
    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
    }

    /**
     * Get value from imageMain attribute of <code>Contact</code> object
     *
     * @return imageMain of object
     */
    public String getImageMain() {
        return imageMain;
    }

    /**
     * Set value for imageMain attribute of <code>Contact</code> object
     *
     * @param imageMain the imageMain of object. It is a
     * <code>java.lang.String</code> object
     */
    public void setImageMain(String imageMain) {
        this.imageMain = imageMain;
    }

}
