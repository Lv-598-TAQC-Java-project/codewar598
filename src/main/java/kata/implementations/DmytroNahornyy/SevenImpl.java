package kata.implementations.DmytroNahornyy;

import kata.Seven;

public class SevenImpl implements Seven{

	@Override
	public long newAvg(double[] arr, double navg) {
		double sum =0;

		for(int i = 0; i <= arr.length - 1; i++){
			sum+=arr[i];
			if(arr[i] < 0){
				throw new IllegalArgumentException("Non positive");
			}
		}
		long result = (long)Math.ceil(navg * (arr.length + 1) - sum);
		if(result <= 0){
			throw new IllegalArgumentException("Non positive");
		}
		return result;
	}

	@Override
	public String seriesSum(int n) {
		String res;
	    double result=0;
	    double dod = 0;
	    for(int i=1; i<=n; i++){
								dod= 1/(1+(i-1)*3d);
								result += dod;
		        }
		        
				res = String.format("%.2f", result);	    
				return res;
	}

	@Override
	public int whereIsHe(int p, int bef, int aft) {
		  int result =0;
	      for (int i = 1; i <= p; i++){
	        if ((bef<i)&&((p-aft)<=i)){
	          result++;
	        }
	      }return result;
	
	}

	
	
	
	
}
