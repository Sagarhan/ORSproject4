package in.co.rays.proj4.exception;
/**
 * RecordNotFoundException thrown when a record not found occurred
 *
 * @author Sagar Hans
 */
public class RecordNotFoundException extends Exception {
	/**
     *            : Error message
     */
	public RecordNotFoundException(String msg) {
        super(msg);

    }
}