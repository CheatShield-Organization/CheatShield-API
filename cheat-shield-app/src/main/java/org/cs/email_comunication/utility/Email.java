package org.cs.email_comunication.utility;

import lombok.Getter;

import java.io.File;
import java.util.ArrayList;

@Getter
public class Email {

    private String title;

    private String context;

    private File file;

    private ArrayList<File> files;

    private String receiverAddress;


    private Email(EmailBuilder builder) {
        this.title = builder.title;
        this.context = builder.context;
        this.file = builder.file;
        this.files = builder.files;
        this.receiverAddress = builder.receiverEmailAddress;
    }


    public static class EmailBuilder{

        private String title;

        private String context;

        private File file;

        private ArrayList<File> files;

        private String receiverEmailAddress;

        public EmailBuilder(String receiverEmailAddress){
            this.receiverEmailAddress = receiverEmailAddress;
        }

        public EmailBuilder setTitle(String title) {
            this.title = title;
            return this;
        }


        public EmailBuilder setContext(String context) {
            this.context = context;
            return this;
        }


        public EmailBuilder setFile(File file) {
            this.file = file;
            return this;
        }


        public EmailBuilder setFiles(ArrayList<File> files) {
            this.files = files;
            return this;
        }

        public Email buildEmailBody(){
            return new Email(this);
        }
    }


}
