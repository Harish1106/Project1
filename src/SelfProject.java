import java.util.*;
import java.io.File;
import java.io.IOException;

public class SelfProject {
	public static void main(String args[]) throws IOException,NoSuchElementException {

		int choice = -1;


		do{

			Scanner s= new Scanner(System.in);
			System.out.println("1.files name");
			System.out.println("2.Add file");
			System.out.println("3.Delete a file");
			System.out.println("4.file search");		
			System.out.println("0.Exist");
			System.out.println("enter your choice : ");
			choice = s.nextInt();


			switch(choice) {

			case 1: //search for all file in the directory 
			{
				String path = "C:\\Users\\harish.dwivedi\\eclipse-workspace\\JavaSimplilearn";
				File file = new File(path);
				File downloadDir[] = file.listFiles();
				Arrays.sort(downloadDir);

				for(File e : downloadDir) {

					if(e.isFile()) {
						System.out.println("File: " + e.getName());

					}
				}
				break;
			}

			case 2: // For creating file
			{
				try
				{

					Scanner input = new Scanner(System.in);
					System.out.print("Enter the name of your file: ");
					String fileName = input.nextLine();
					fileName = fileName + ".txt";

					File files = new File(fileName);
					if(files.createNewFile());
					{
						System.out.println("File created sucessfully");
					}
				}

				catch(Exception e)
				{
					e.printStackTrace();

				}
				break;
			}

			case 3: // For delete a File
			{
				try
				{
					Scanner input = new Scanner(System.in);
					System.out.print("Enter the name of your file: ");
					String fileName = input.nextLine();
					fileName = fileName + ".txt";

					File f = new File(fileName);
					if(f.delete())
					{
						System.out.println(f.getName()+" Sucessfully deleted");

					}
					else
						System.out.println("failed");
				}

				catch(Exception e)
				{
					e.printStackTrace();
				}
				break;
			}	
			case 4: //For File Search
			{

				File directory = new File("C:\\Users\\harish.dwivedi\\eclipse-workspace\\JavaSimplilearn");

				// store all names with same name
				// with/without extension
				String[] flist = directory.list();
				int flag = 0;
				if (flist == null) {
					System.out.println("Empty directory.");
				}
				else {
					Scanner input = new Scanner(System.in);
					System.out.print("Enter the name of your file: ");
					String fileNames = input.nextLine();
					fileNames = fileNames + ".txt";
					System.out.println(fileNames);

					// Linear search in the array
					for (int i = 0; i < flist.length; i++) {
						String filename = flist[i];
						if (filename.equalsIgnoreCase(fileNames)) {
							System.out.println(filename + " found");
							flag = 1;

						}
					}
				}

				if (flag == 0) {
					System.out.println("File Not Found");
				}

			}		

			}
		}while (choice !=0);
	}
}












