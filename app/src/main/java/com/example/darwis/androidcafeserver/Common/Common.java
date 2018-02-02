package com.example.darwis.androidcafeserver.Common;

import com.example.darwis.androidcafeserver.Model.User;

/**
 * Created by Dyah on 1/16/2018.
 */

public class Common {
    public static User currentUser;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code)
    {
        if (code.equals("0"))
            return "Placed";
        else if(code.equals("1"))
            return "Sedang Dalam Perjalanan";
        else
            return "Shipped";
    }
}
