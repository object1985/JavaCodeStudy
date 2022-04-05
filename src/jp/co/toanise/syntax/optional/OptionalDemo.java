package jp.co.toanise.syntax.optional;

import java.util.Optional;

/**
 * @author tonaise
 * @see https://www.youtube.com/watch?v=qR__x1Kr-_s
 */
public class OptionalDemo {
    public static void main(String[] args) {
	String email = "sample@example.com";

	// of, empty, ofNullable
	Optional<Object> empty = Optional.empty();
	System.out.println(empty);

//	Optional<String> emailOpitional = Optional.of(email);
//	System.out.println(emailOpitional);

	Optional<String> stringOptional = Optional.ofNullable(email);
	System.out.println(stringOptional);

	email = null;
	Optional<String> stringOptional2 = Optional.ofNullable(email);
	System.out.println(stringOptional2);

	if (stringOptional.isPresent()) {
	    System.out.println(stringOptional.get());
	} else {
	    System.out.println("no value present");
	}

	String defaultOptional = stringOptional2.orElse("default@example.com");
	System.out.println(defaultOptional);
	String defaultByLambda = stringOptional2.orElseGet(() -> "defaultByLambda@exaple.com");
	System.out.println(defaultByLambda);
//	stringOptional2.orElseThrow(() -> new IllegalArgumentException("Email is not exist"));

	String result = " ABC ";
	if (result != null && result.contains("abc")) {
	    System.out.println(result);
	}
	Optional<String> optionalStr = Optional.of(result);
	optionalStr.filter(res -> res.contains("abc")).ifPresent(res -> System.out.println(res));

	// map method in Optional provides a way to transform value in Optional from one type to another.

	optionalStr.filter(res -> res.contains(" abc ")).map(String::trim).ifPresent(res -> System.out.println(res));

    }
}
