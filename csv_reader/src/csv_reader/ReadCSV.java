package csv_reader;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadCSV {
	// Simple CSV reading class to test CSV parsing 
	public static void main(String[] args)
	{
		String csvString;
		String splitCriteria = ",";
		try
		{
			BufferedReader csvReader = new BufferedReader(new FileReader("C:\\Users\\Abrah\\Desktop\\Fall 2022\\CMPE 202\\Individual Project - Abraham\\input_file-1.csv"));
			while ((csvString = csvReader.readLine())!= null)
			{
				String[] cardDetails = csvString.split(splitCriteria);
				System.out.println(cardDetails[0]+ " " +cardDetails[1] + " " + cardDetails[2] );
						
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
