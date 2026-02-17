package org.cs.blob_storage;

import org.cs.abstraction.CloudStorage;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class VercelCloudStorage implements CloudStorage {



    @Override
    public void uploadFileStorage() {

    }

    @Override
    public void downloadFileFromStorage() {

    }

    @Override
    public void deleteFileFromStorage() {

    }

    @Override
    public File getFileFromStorage() {
        return null;
    }
}
