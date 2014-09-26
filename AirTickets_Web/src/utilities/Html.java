package utilities;


public class Html {
	String content	= "text/html";
	String title 	= null;
	String docType 	= "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
	String beg = null;
	String end = "</body></html>";
	
	public String getContent() {
		return content;
	}

	public String getTitle() {
		return title;
	}

	public String getDocType() {
		return docType;
	}

	public String getBeg() {
		return beg;
	}

	public String getEnd() {
		return end;
	}

	public Html(String title) {
		this.title = title;
		this.beg = title + docType;
	}
}
