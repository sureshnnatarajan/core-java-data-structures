package com.suresh.learnings.twentyseventeen.april;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVFileParser {

	private static final String CSV_FILE_PATH = "/Downloads/nsccl_ann19.csv";
	
	public static void main(String[] args) {

		List<Security> secList = readContentsFromCsv();
		System.out.println("secList ->" + secList);
	}

	private static List<Security> readContentsFromCsv() {
		BufferedReader br = null;
		List<Security> securityList = new ArrayList<Security>(10);
		Path pathToFile = Paths.get(CSV_FILE_PATH);
		try {
			br = Files.newBufferedReader(pathToFile, StandardCharsets.ISO_8859_1);
			String line = br.readLine();
			String[] attributes = null;
			while (line != null) {
				attributes = line.split(",");
				Security sec = createSecurity(attributes);
				securityList.add(sec);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return securityList;
	}

	private static Security createSecurity(String[] attributes) {
		Security sec = new Security();
		sec.setSymbol(attributes[1]);
		sec.setSecurityName(attributes[3]);
		sec.setIsActive(true);
		sec.setExchange("NSE");
		return sec;
	}
}
