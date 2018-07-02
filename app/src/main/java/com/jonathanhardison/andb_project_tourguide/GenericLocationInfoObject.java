package com.jonathanhardison.andb_project_tourguide;

public class GenericLocationInfoObject extends BaseInfoObject {
    private String PhoneNumber;
    private String Website;
    private String Hours;

    /**
     * Generic Location Info Object init with objects.
     * @param inName
     * @param inAddress
     * @param inDescription
     * @param inPhoneNumber
     * @param inWebsite
     * @param inHours
     */
    public GenericLocationInfoObject(String inName, String inAddress, String inDescription, String inPhoneNumber, String inWebsite, String inHours) {
        super(inName, inAddress, inDescription);
        PhoneNumber = inPhoneNumber;
        Website = inWebsite;
        Hours = inHours;
    }

    /**
     * Get phone number of object.
     * @return
     */
    public String getPhoneNumber(){
        return PhoneNumber;
    }

    /**
     * Get website of object.
     * @return
     */
    public String getWebsite(){
        return Website;
    }

    /**
     * Get hours of object.
     * @return
     */
    public String getHours(){
        return Hours;
    }
}
