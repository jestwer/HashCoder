package org;

import org.webservice.service.HashCoder;
import org.webservice.service.HashCoderService;

import java.io.File;
import java.io.FileInputStream;

public class HashCodeSender {
    private String filePath;

    public HashCodeSender(String filePath) {
        this.filePath = filePath;
    }

    public String sendDataToServer() {
        HashCoderService service = new HashCoderService();
        HashCoder coder = service.getHashCoderPort();
        return coder.getHashCode(getArrayOfBytes());
    }

    private byte[] getArrayOfBytes(){
        try {
            FileInputStream fis = new FileInputStream(filePath);
            byte[] buffer = new byte[(int) new File(filePath).length()];
            fis.read(buffer);
            return buffer;
        }
        catch (Exception e){
            System.out.println("ERROR");
            return new byte[1024];
        }


    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
