package com.wiley.readlworldjava.gitplay;

public class GitDemo {
    private String description;

   public GitDemo(String description) {
      this.description = description;
   }

   public void displayMessage() {
        System.out.println("Message: " + description);
    }

    public static void main(String[] args) {
       GitDemo demo = new GitDemo("Hello, Git!");

        // Display the initial message
        demo.displayMessage();
    }
}
