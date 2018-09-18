package com.androidea.firebasechattutorial;

/**
 * Created by Administrator on 16-03-2017.
 */
//This is a data class, will help us to retrieve data from Database..
public class ShowDataItems {

    private String Image_URL,Image_Title;   //put this name same as Database Fields

    public ShowDataItems(String image_URL, String image_Title) {
        Image_URL = image_URL;
        Image_Title = image_Title;
    }

    public ShowDataItems()
    {
        //Require a Empty Constructor
    }

    public String getImage_URL() {
        return Image_URL;
    }

    public void setImage_URL(String image_URL) {
        Image_URL = image_URL;
    }

    public String getImage_Title() {
        return Image_Title;
    }

    public void setImage_Title(String image_Title) {
        Image_Title = image_Title;
    }
}
