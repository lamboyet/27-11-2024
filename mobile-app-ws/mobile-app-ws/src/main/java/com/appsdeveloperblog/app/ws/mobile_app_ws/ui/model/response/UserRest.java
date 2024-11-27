package com.appsdeveloperblog.app.ws.mobile_app_ws.ui.model.response;

public class UserRest {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;

 /**request model different from response model. you don't want
            //sensitive information passwords in response

  user details sent back as confirmation that user details have been stored in db
            */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
