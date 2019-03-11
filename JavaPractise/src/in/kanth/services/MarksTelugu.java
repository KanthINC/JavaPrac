package in.kanth.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MarksTelugu {

	private static final String TELUGU = "Telugu";

	public List<StudentDetails> getScienceMarks() {

		List<StudentDetails> marksList = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < 600; i++) {

			marksList.add(new StudentDetails(i + "", TELUGU + i, random.ints(0, (100 + 1)).findFirst().getAsInt()));

		}

		return marksList;
	}

}
