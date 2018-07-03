package com.jonathanhardison.andb_project_tourguide;

public class BaseInfoObject {
    private String Name;
    private String Address;
    private String Description;
    private int ImageID;

    //statics
    private static int NO_IMAGE_ID = -1;

    /**
     * Base init with objects and image id.
     * @param inName
     * @param inAddress
     * @param inDescription
     * @param inImageID
     */
    public BaseInfoObject(String inName, String inAddress, String inDescription, int inImageID){
        Name = inName;
        Address = inAddress;
        Description = inDescription;
        ImageID = inImageID;
    }

    /**
     * Return boolean of if object has an image id associated.
     * @return
     */
    public boolean hasImageID(){
        if(ImageID == NO_IMAGE_ID)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * Get objects image id.
     * @return
     */
    public int getImageID(){
        return ImageID;
    }

    /**
     * Returns the name of object.
     * @return
     */
    public String getName(){
        return Name;
    }

    /**
     * Returns the address of object.
     * @return
     */
    public String getAddress(){
        return Address;
    }

    /**
     * Returns description of object.
     * @return
     */
    public String getDescription(){
        return Description;
    }

}
