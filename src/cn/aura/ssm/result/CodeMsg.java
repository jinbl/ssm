package cn.aura.ssm.result;

public class CodeMsg {

	private int code;
	private String msg;
	private Object obj;
	
	public CodeMsg(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public CodeMsg(int code, String msg,Object obj) {
		this.code = code;
		this.msg = msg;
		this.obj = obj;
	}
	
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
