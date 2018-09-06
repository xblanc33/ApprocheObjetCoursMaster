package fr.ubordeaux.ao.domain.exception;

public class ReferenceManagementException extends RuntimeException {
    private static final long serialVersionUID = 1L;

	public ReferenceManagementException(String msg) {
        super(msg);
    }
}