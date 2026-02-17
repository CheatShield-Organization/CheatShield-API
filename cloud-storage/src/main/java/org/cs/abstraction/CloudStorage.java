package org.cs.confinguration;

import java.io.File;


public interface ICloudStorage {

    public void uploadFileStorage();

    public void uploadFilesToStorage();

    public void deleteFileFromStorage();

    public File getFileFromStorage();

}
