package fr.ubordeaux.ao.domain.exception;

public class BankNoteException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public BankNoteException(String msg) {
        super(msg);
    }
}