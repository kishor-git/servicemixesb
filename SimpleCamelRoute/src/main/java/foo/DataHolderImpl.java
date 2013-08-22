package foo;

import org.springframework.stereotype.Service;

import com.esb.beans.Message;

@Service(value = "holder")
public class DataHolderImpl implements DataHolder {
	
	public DataHolderImpl() {
		System.out.println("DataHolderImpl initialized");
	}
	
	public Message holdInputMessage(Message p) {
		System.out.println("in method: " + p.toString());
		return p;
	}
}
