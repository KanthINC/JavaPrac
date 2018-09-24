package org.kanth.ocjp.loop.construct;

import org.kanth.ocjp.answers.Answer;

/**
 * @author ramakanth.b
 *
 */
public class LTest1 {

	public static void main(String[] args) {

		int count = 1, sum = 0;
		do {
			if (count % 3 == 0)
				continue;
			sum += count;
		} while (count++ < 11);
		System.out.println(sum);

		System.out.println(Answer.ltest1);
	}

}
