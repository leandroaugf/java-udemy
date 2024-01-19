package model.exceptions;

public class genericException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public genericException() {
	}
	public genericException(String mensagem) {
		super(mensagem);
	}
}
