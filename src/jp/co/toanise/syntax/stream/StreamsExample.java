package jp.co.toanise.syntax.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author tonaise
 * @see https://www.youtube.com/watch?v=t1-YZ6bF-g0
 *
 */
public class StreamsExample {
    public static void main(String[] args) {
	// 1.stream sample
	System.out.println("= 1.stream sample");
	IntStream.range(1, 10).forEach(System.out::print);
	System.out.println();

	// 2.skip in stream
	System.out.println("= 2.skip in stream");
	IntStream.range(1, 10).skip(5).forEach(e -> System.out.println(e));

	// 3.sum
	System.out.println("= 3.sum");
	System.out.println(IntStream.range(1, 10).sum());

	// 4.sort
	System.out.println("= 4.sort");
	Stream.of("Cert", "Ben", "Alberto").sorted().findFirst().ifPresent(System.out::println);

	// 5.sort filter
	String[] names = { "ai", "sneek", "ankit", "kush", "Bred", "sarisa", "hans", "Shivika", "Seeked" };
	System.out.println("= 5.sort filter");
	Arrays.stream(names).filter(s -> s.toLowerCase().startsWith("s")).sorted().forEach(System.out::println);
	System.out.println("= 5.sort filter (reverseOrder version)");
	Arrays.stream(names).filter(s -> s.toLowerCase().startsWith("s")).sorted(Comparator.reverseOrder())
		.forEach(System.out::println);

	// 6.average of squares of an int array
	System.out.println("= 6.average");
	Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x + x).average().ifPresent(System.out::println);

	// 7.Stream from List, filer
	List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivikit", "Agre",
		"Ablaham", "", "Aaaa", "beech", "Shilat", "Crea", "ameldo", "sonia", "awer");
	Stream<String> map = people.stream().map(String::toLowerCase);
	map.filter(x -> x.startsWith("a")).forEach(System.out::println);

	// 8.Reduction sum
	double total = Stream.of(7.3, 1.5, 4.8).reduce(0.0, (Double a, Double b) -> a + b);
	System.out.println("Total:" + total);

	// 9.Reduction Summary statistics
	IntSummaryStatistics summary = IntStream.of(7, 2, 19, 28, 73, 4, 10).summaryStatistics();
	System.out.println(summary);
    }
}
