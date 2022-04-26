package FunctionalPages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class VideoStatusValidation {
	
	public static int code;
    public static int returnCode;

    public void OutputFiles() throws FileNotFoundException
    {

                   ArrayList<String> a=  readURLFromFile();
                   PrintStream out= new PrintStream(new FileOutputStream ("C:\\Users\\kirank1\\Desktop\\Automation Scripts\\videoOutput"));
                   for (String b: a){

                                  try {
									returnCode=getResponseCode(b);
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
                                  System.setOut(out);
                                  }
                   out.close();
    }
    
    public static ArrayList<String> readURLFromFile() throws FileNotFoundException{
                   Scanner s = new Scanner(new File("C:\\Users\\kirank1\\Desktop\\Automation Scriptst\\output.txt"));
                   ArrayList<String> list = new ArrayList<String>();
                   while (s.hasNext()){
                                  list.add(s.next());
                   }
                   s.close();

                   return list;
    }

    public static int getResponseCode(String newURL){

                   try
                   {
                                  URL url = new URL(newURL);
                                  HttpURLConnection connection = (HttpURLConnection)url.openConnection();
                                  connection.setRequestMethod("GET");
                                  connection.connect();
                                  code = connection.getResponseCode();
                                  System.out.println(newURL + " - " +code);
                                  
                   }
                   catch(Exception e)
                   {
                                  e.printStackTrace();
                   }
                   return code;
    }

}
