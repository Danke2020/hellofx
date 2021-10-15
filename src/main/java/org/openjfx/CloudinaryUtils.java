package org.openjfx;

import com.cloudinary.Cloudinary;
import com.cloudinary.api.ApiResponse;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class CloudinaryUtils {
    private final static Map<Object, Object> CONFIG = new HashMap<>();

    static {
        CONFIG.put("cloud_name", "decker9527");
        CONFIG.put("api_key", "143267151362786");
        CONFIG.put("api_secret", "DJaEV3M5lV5saFFi7dtGUPym-IQ");
    }


    public static ApiResponseModel searchFolder(String folderName, String fileName) throws Exception {
        Cloudinary cloudinary = new Cloudinary(CONFIG);
        ApiResponse execute = cloudinary.search()
                .expression("resource_type:image AND folder=" + folderName + " AND filename:" + fileName + "*")
                .maxResults(30)
                .execute();
        Gson gson = new Gson();
        String json = gson.toJson(execute);
        return gson.fromJson(json, ApiResponseModel.class);
    }
}
