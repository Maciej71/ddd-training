package pro.buildmysoftware.ddd.certit2;

public class CannotRescheduleExamException extends RuntimeException {
	public CannotRescheduleExamException(String message) {
		super(message);
	}

	public CannotRescheduleExamException(String message, Throwable cause) {
		super(message, cause);
	}
}
