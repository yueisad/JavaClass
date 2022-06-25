import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class NameChanger {
    public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//variables 
		
		//for file input
		String fileName; 		//hold current file to be altered
		FileInputStream fileStream;
		Scanner fileScanner;
		
		//open the input file 
		fileStream = new FileInputStream("ParkPhotos.txt");
		fileScanner = new Scanner(fileStream);
		
		//for file output
		PrintWriter outputFile = new PrintWriter("ParkPhotosMod.txt");
		
		//for each line in the input file, read in the filename and output the modified filename into the output file
		
		while (fileScanner.hasNext()) {
			fileName = fileScanner.next();
			
			//replace the _photo.jpg with _info.gif
			
			fileName = fileName.replace("_photo.jpg", "_info.gif");
			
			//write modified filename to the output file
			
			outputFile.println(fileName);
		} //end while loop 
		
		//close 
		fileScanner.close();
		outputFile.close();
		fileStream.close();
		
		System.out.print("DONE");
		
	}

}