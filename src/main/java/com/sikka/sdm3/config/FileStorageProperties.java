package com.sikka.sdm3.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
	
	private String uploadDir;
	
	public String getUploadDir() {
		return uploadDir;
	}
	public void setupLoadDir(String upLoadDir) {
		this.uploadDir = upLoadDir;
	}

}
