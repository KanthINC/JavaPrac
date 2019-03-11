package in.kanth.multiThreading;

import java.util.List;
import java.util.concurrent.CompletableFuture;


import in.kanth.services.MarksMaths;
import in.kanth.services.MarksScience;
import in.kanth.services.MarksTelugu;
import in.kanth.services.StudentDetails;

public class CompletableFutureAverage {

	public static void main(String[] args) {

		MarksScience science = new MarksScience();
		MarksMaths maths = new MarksMaths();
		MarksTelugu telugu = new MarksTelugu();

		CompletableFuture<List<StudentDetails>> getfutureScience = CompletableFuture.supplyAsync(() -> {
			return science.getScienceMarks();
		});

		CompletableFuture<List<StudentDetails>> getfutureMaths = CompletableFuture.supplyAsync(() -> {
			return maths.getScienceMarks();
		});

		CompletableFuture<List<StudentDetails>> getfutureTelugu = CompletableFuture.supplyAsync(() -> {
			return telugu.getScienceMarks();
		});

/*		CompletableFuture<List<StudentDetails>> totalmarks = CompletableFuture
				.allOf(getfutureScience, getfutureMaths, getfutureTelugu)
				.thenApply(s -> combine(getfutureScience.join(), getfutureMaths.join(), getfutureTelugu.join()));*/

		// science.getScienceMarks().stream().map(s->s.getMarks()).forEach(System.out::println);

	}

}
