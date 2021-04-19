package controller;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginInfo = new HashMap<>();

    public IDandPasswords(){
        loginInfo.put("Salli", "True");
    }

    protected HashMap getLoginInfo(){
        return loginInfo;
    }
}
