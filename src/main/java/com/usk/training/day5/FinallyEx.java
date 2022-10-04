package com.usk.training.day5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyEx {

	public static void main(String[] args) throws IOException {
		File file = null;
		BufferedReader br = null;
		try {
			file = new File("C:\\USK\\STS_Workspace\\test\\src\\com\\usk\\day5\\test");
			br = new BufferedReader(new FileReader(file));
			String str = br.readLine();
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
	}

}
