package exception;

public class StartWithCapitalLetterException extends RuntimeException {

	public StartWithCapitalLetterException(String message) {
		super(message);
	}
}