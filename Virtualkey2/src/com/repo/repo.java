package com.repo;
public class repo {

	public static void main(String[] args) {
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("repo", "Haritha");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}