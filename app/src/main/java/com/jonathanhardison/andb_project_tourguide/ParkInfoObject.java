package com.jonathanhardison.andb_project_tourguide;

public class ParkInfoObject extends BaseInfoObject {
    private String Ammenities;

    /**
     * ParkInfo Object init with objects.
     * @param inName
     * @param inAddress
     * @param inDescription
     * @param inAmenities
     */
    public ParkInfoObject(String inName, String inAddress, String inDescription, String inAmenities) {
        super(inName, inAddress, inDescription);
        Ammenities = inAmenities;
    }

    /**
     * Get amenities
     * @return
     */
    public String getAmenities(){
        return Ammenities;
    }
}
