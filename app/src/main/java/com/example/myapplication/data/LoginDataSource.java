package com.example.myapplication.data;

import android.util.JsonReader;
import com.example.myapplication.data.controller.PostUtils;
import com.example.myapplication.data.model.LoggedInUser;
import org.json.JSONObject;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {
            LoggedInUser user = new LoggedInUser(password.toString(),username);
            JSONObject msg = PostUtils.RegisterByPost(username, password);

            if (msg.get("code").equals(200)) {
                return new Result.Success<>(user);
            } else {
                return new Result.Error(new IOException("Error register in"));
            }

        } catch (Exception e) {
            return new Result.Error(new IOException("Error register in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}