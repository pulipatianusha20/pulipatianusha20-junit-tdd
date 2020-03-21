package junitmaven.junit_tdd;

public class remove1char {

	public String delete(String s) {
		// TODO Auto-generated method stub
		char a[]=s.toCharArray();
		int n=a.length;
		if(a[0]=='A' && a[1]!='A') {
			char b[]=new char[n-1];
			for(int i=1;i<n;i++) {
				b[i-1]=a[i];
			}
			String s1=new String(b);
			return s1;
		}
		else if(a[0]!='A' && a[1]=='A') {
			char b[]=new char[n-1];
			b[0]=a[0];
			for(int i=2;i<n;i++) {
				b[i-1]=a[i];
			}
			String s1=new String(b);
			return s1;
		}
		else if(a[0]=='A' && a[1]=='A') {
			char b[]=new char[n-2];
			for(int i=2;i<n;i++) {
				b[i-2]=a[i];
			}
			String s1=new String(b);
			return s1;
		}
		else {
			char b[]=new char[n];
			b=a;
			String s1=new String(b);
			return s1;
		}	
	}

}
