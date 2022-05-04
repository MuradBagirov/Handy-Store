package com.onlinestore.onlinestore.service.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.onlinestore.onlinestore.service.CloudinaryAdapter;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Service
public class CloudinaryAdapterImpl implements CloudinaryAdapter {

    private final Cloudinary cloudinary;

    public CloudinaryAdapterImpl() {
        this.cloudinary = new Cloudinary(com.cloudinary.utils.ObjectUtils.asMap(
                "cloud_name", "dytezynmr",
                "api_key", "354991321426811",
                "api_secret", "YONYkLL07n4YsndziAuxvhGE-DQ",
                "secure", true
        ));
    }

    @Override
    public Map uploadImageCloudinary(File file) throws Exception {
        try {
            return cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
        } catch (IOException exception) {
            throw new Exception(exception.getMessage());
        }
    }
}
