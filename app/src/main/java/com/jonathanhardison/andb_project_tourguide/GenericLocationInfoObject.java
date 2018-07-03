package com.jonathanhardison.andb_project_tourguide;

public class GenericLocationInfoObject extends BaseInfoObject {
    private String PhoneNumber;

    /**
     * Generic location info object init wit objects and image
     * @param inName
     * @param inAddress
     * @param inDescription
     * @param inPhoneNumber
     * @param inImageID
     */
    public GenericLocationInfoObject(String inName, String inAddress, String inDescription, String inPhoneNumber, int inImageID) {
        super(inName, inAddress, inDescription, inImageID);
        PhoneNumber = inPhoneNumber;
    }

    /**
     * Get phone number of object.
     * @return
     */
    public String getPhoneNumber(){
        return PhoneNumber;
    }
}
