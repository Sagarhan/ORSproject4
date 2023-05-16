package in.co.rays.proj4.exception;
/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred
 *
 * @author Sagar Hans
 *
 */
public class DatabaseException extends Exception {
	/**
     *            : Error message
     */
	 public DatabaseException(String msg) {
	        super(msg);
	    }
}