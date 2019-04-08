
public class MathUtils implements MathUtilsInt{

    @Override
    public int max(int x, int y) {
        int max;if(x>y)max=x;
        else max=y;
       return max;}

    @Override
    public double max(double x, double y) {
      double max;if(x>y)max=x;
        else max=y;
       return max;}

    @Override
    public byte max(byte x, byte y) {
       byte max;if(x>y)max=x;
        else max=y;
       return max;}

    @Override
    public short max(short x, short y) {
        short max;if(x>y)max=x;
        else max=y;
       return max;}

    @Override
    public float max(float x, float y) {
        float max;if(x>y)max=x;
        else max=y;
       return max;
    }

    @Override
    public long max(long x, long y) {
      long max;if(x>y)max=x;
        else max=y;
       return max;
    }

    @Override
    public int median(int[] y) {
        int median = 0;
       if(y == null)
      throw new NullPointerException(" Araay is empty! ");
        for(int i=0;i<=y.length;i++){
            if(i==y.length/2)
              median=y[i];}
        return median;
       
    }

    @Override
    public double average(int[] y) {
         if(y == null)
      throw new NullPointerException(" Araay is empty! ");
        int average=0;
        for(int j=0;j<y.length;j++)
            average+=y[j];
       return average;
    }

    @Override
    public int[] sum(int[] y, int[] x) {
        int [] sum = null;
         for(int i=0;i<x.length;i++)
          for(int j=0;j<y.length;j++)
                 sum[i]=x[i]+y[j];
           return sum;}
         
   
    
}
