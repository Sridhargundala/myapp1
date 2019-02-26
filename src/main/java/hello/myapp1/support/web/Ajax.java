package hello.myapp1.support.web;

public class Ajax {

	private Ajax() {
	}

	public static boolean isAjaxRequest(String requestedWith) {
		return requestedWith != null ? "XMLHttpRequest".equals(requestedWith) : false;
	}
}
