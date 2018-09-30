package search.file.repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.Vector;

public class SearchFile {
	private String getNameWithoutExtension(File f) {
		if(f != null) {
			String filename = f.getName();
			int i = filename.lastIndexOf('.');
			if(i>0 && i<filename.length()-1) {
				return filename.substring(0,i);
			}
		}
		return "";
	} 
	private String getExtension(File f) {
		if(f != null) {
			String filename = f.getName();
			int i = filename.lastIndexOf('.');
			if(i>0 && i<filename.length()-1) {
				return filename.substring(i+1).toLowerCase();
			}
		}
		return "";
	} 
	private Vector<File> getFiles(File searchIn){
		File[] files = searchIn.listFiles();
		Vector<File> listOfFiles = new Vector<File>();
		for (File file : files) {
			listOfFiles.add(file);
			if (file.isDirectory()){
				listOfFiles.addAll(getFiles(file));
			}		
		}
		return listOfFiles;
	}
	public File searchFile(String fileToFind, File searchIn){
		Vector<File> listOfFiles = getFiles(searchIn);
		File filefounded = null;
		for(File file : listOfFiles){
			if(file.getName().equals(fileToFind) || getNameWithoutExtension(file).equals(fileToFind))
				filefounded=file;
		}
		return filefounded;
	}
	
	
	
	
	public boolean fileExist(String fileToFind, File searchIn) {
		File[] listOfFiles = searchIn.listFiles();
		Vector<File> listOfDirectories = new Vector<File>();
		Vector<File> listOfSimpleFiles = new Vector<File>();
		for (File file : listOfFiles) {
			if (file.isDirectory())
				listOfDirectories.add(file);
			else
				listOfSimpleFiles.add(file);		
		}
		boolean find = false;
		while (!find) {
			int i = 0;
			while (i < listOfSimpleFiles.size() && !find) {
				if (listOfSimpleFiles.get(i).getName()
						.equalsIgnoreCase(fileToFind)) {
					return true;
				} else
					i++;
			}
			int j = 0;
			while ((j < listOfDirectories.size()) && !find) {
				if(listOfDirectories.get(j).getName().equalsIgnoreCase(fileToFind))
					return true;
				else if(fileExist(fileToFind, listOfDirectories.get(j)))
					return true;
				else
					j++;
			}
			return false;
		}		
		return false;
	}
	public ArrayList scanDir ( String theDirectory ) //throws IOException 
		{ 
		File currDir = new File ( theDirectory ); 
		ArrayList finalListFiles = new ArrayList(); 
		// Return null if not a directory 
		if ( currDir.exists() && ! currDir.isDirectory() ) 
		{ 
			return null; 
		} 
	 
		String[] fileList = currDir.list(); 
	 
		for (int i=0; i<fileList.length; i++ ) 
		{ 
			Object temp = scanDir ( theDirectory + File.separator + fileList[i] ); 
			if ( temp == null ) {
				try {
					String toIndex = theDirectory + File.separator + fileList[i];
					File file_to_index=new File(toIndex);

					System.out.println(file_to_index.getName());
					System.out.println(file_to_index.getAbsoluteFile());
					System.out.println(file_to_index.getAbsolutePath());
					System.out.println(file_to_index.getParent());
					System.out.println(file_to_index.getParentFile());
					System.out.println("Indexation reussie");
					System.out.println("===========*****=============");
					}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
	 
				// --- Add the path of the current file 
				//finalListFiles.add(theDirectory + File.separator + fileList[i]); 
			}
			//else System.out.println("dans else");
			// --- Add the array list of the current directory 
		} 
		return finalListFiles; 
		}
}
