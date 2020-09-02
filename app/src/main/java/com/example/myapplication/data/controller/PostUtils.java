package com.example.myapplication.data.controller;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class PostUtils {

    public static void RegisterByPost(final String number, final String passwd) {
        new Thread() {
            @Override
            public void run() {
                String LOGIN_URL = "http://baseserver-env.eba-cy7qyyst.us-east-1.elasticbeanstalk.com/register";
                String msg = "";
                try {
                    HttpURLConnection conn = (HttpURLConnection) new URL(LOGIN_URL).openConnection();
                    // set connection status
                    conn.setRequestMethod("POST");
                    conn.setDoInput(true);
                    conn.setDoOutput(true);
                    conn.setUseCaches(false);

                    // 我们请求的数据:
                    String data = "username=" + URLEncoder.encode(number, "UTF-8") + "&password=" + URLEncoder.encode(passwd, "UTF-8");
                    OutputStream out = conn.getOutputStream();
                    out.write(data.getBytes());
                    out.flush();
                    if (conn.getResponseCode() == 200) {
                        // 获取响应的输入流对象
                        InputStream is = conn.getInputStream();
                        // 创建字节输出流对象
                        ByteArrayOutputStream message = new ByteArrayOutputStream();
                        // 定义读取的长度
                        int len = 0;
                        // 定义缓冲区
                        byte buffer[] = new byte[1024];
                        // 按照缓冲区的大小，循环读取
                        while ((len = is.read(buffer)) != -1) {
                            // 根据读取的长度写入到os对象中
                            message.write(buffer, 0, len);
                        }
                        // 释放资源
                        is.close();
                        message.close();
                        // 返回字符串
                        msg = new String(message.toByteArray());
                        JSONObject jsonMsg = null;
                        try {
                            jsonMsg = new JSONObject(msg);
                        } catch (JSONException err) {
                            Log.d("Error", err.toString());
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
