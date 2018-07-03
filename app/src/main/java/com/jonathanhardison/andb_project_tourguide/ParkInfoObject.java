package com.jonathanhardison.andb_project_tourguide;


public class ParkInfoObject extends BaseInfoObject {
    private String Amenities;

    /**
     * ParkInfo Object init with objects and image.
     * @param inName
     * @param inAddress
     * @param inAmenities
     * @param inImageID
     */
    public ParkInfoObject(String inName, String inAddress, String inAmenities, String inDescription, int inImageID) {
        super(inName, inAddress, inDescription, inImageID);
        Amenities = inAmenities;
    }

    /**
     * Get amenities
     * @return
     */
    public String getAmenities(){
        return Amenities;
    }
}
