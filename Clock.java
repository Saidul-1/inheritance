public class Clock{
	public int getMinute(){
		String s=new java.util.Date().toString();
		return Integer.parseInt(s.substring(14,16));
	}
	public int getHour(){
		String s= new java.util.Date().toString();
		return Integer.parseInt(s.substring(11,13));
	}
	public String getTime(){
		System.out.println(getHour()+":"+getMinute());
		return getHour()+":"+getMinute();
	}
	public static void main(String[] args){
		Clock c=new Clock();
		System.out.println(c.getTime());
		WorldClock world = new WorldClock(6);
		System.out.println(world.getHour()+":"+c.getMinute());
	}
}
	