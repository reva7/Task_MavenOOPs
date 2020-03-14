package nygift.task;

public class Kitkat extends NewYearGifts{
	static int wt=0;

	 @Override
	 public int weightOfGift(int w) {
		 totalWeight+=w;
		 wt+=w;
		 return totalWeight;
	 }

}
