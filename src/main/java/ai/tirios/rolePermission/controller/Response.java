package ai.tirios.rolePermission.controller;

import org.springframework.http.HttpStatus;

public class Response<T> {

	
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Error getError() {
		return error;
	}
	public void setError(Error error) {
		this.error = error;
	}
	private HttpStatus status;
	private T data;
	private Error error;
}

