public class WorldClock extends Clock{
	private int timeOffset;
	public WorldClock(int timeOffset){
		this.timeOffset=timeOffset;
	}
	@Override
	public int getHour(){
		int hour = super.getHour()+timeOffset;
		if(hour>23){
			hour=hour-24;
		}
		if(hour<0){
			hour=24+hour;
		}
		return hour;
	}
}