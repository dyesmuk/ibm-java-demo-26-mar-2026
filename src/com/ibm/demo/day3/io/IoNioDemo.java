package com.ibm.demo.day3.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class IoNioDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Path.of("data.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (lines != null) {
			for (String line : lines)
				System.out.println(line);
			try {
				Files.write(Path.of("output.txt"), lines);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("End");
	}
}
