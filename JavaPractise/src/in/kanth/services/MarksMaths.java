package in.kanth.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MarksMaths {

	private static final String MATHS = "Maths";

	public List<StudentDetails> getScienceMarks() {

		List<StudentDetails> marksList = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < 600; i++) {

			marksList.add(new StudentDetails(i + "", MATHS + i, random.ints(0, (100 + 1)).findFirst().getAsInt()));

		}

		return marksList;
	}

}
