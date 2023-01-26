
package project1;

import java.io.File;
import java.io.IOException;

public class Services


{


    public static void listAllfiles ()
    {
        String path = System.getProperty("user.dir");
        File folder = new File(path);
        String[] files;
        files = folder.list();

        if (files != null)
        {

            for (String file : files) {

                File temp = new File(file);

                if (temp.isFile()){
                    System.out.println(file);
                }
            }

        }else {
            System.out.println("Current directory is empty.");
        }

    }

    public static void addfile (String filename) throws IOException
    {
        String path = System.getProperty("user.dir");

        File file = new File( path , filename);

        if (file.exists()) {
            System.out.println("File already exists.");

        }else {
            if (file.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File could not be created.");
            }

        }
    }

    public static void deletefile (String filename)
    {
        String path = System.getProperty("user.dir");
        File file = new File(path, filename);

        if (!file.exists()) {
            System.out.println("File does not exists.");

        } else {
            if (file.delete()) {
                System.out.println("File deleted.");
            } else {
                System.out.println("File could not be deleted.");
            }

        }
    }

    public static void searchfile (String filename)
    {

        String path = System.getProperty("user.dir");
        File folder = new File(path);
        String[] files = folder.list();

        Integer found = 0;


        if (files != null) {

            for (String file : files) {
                if (file.equals(filename)) {
                    System.out.println(" ");
                    System.out.println(file);
                    found += 1;
                }
            }

            if (found.equals(0)) {

                System.out.println(" ");
                System.out.println("No file matching your input was found");

            }


        } else {

            System.out.println("Directory is Empty");
        }

    }

}

