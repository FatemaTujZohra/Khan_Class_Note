import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date dt=new Date();
		//System.out.println(dt.getDate());
		
		System.out.println(dt);
		SimpleDateFormat sdf=new SimpleDateFormat("d/M/yyyy");
		System.out.println(sdf.format(dt));

	}

}
