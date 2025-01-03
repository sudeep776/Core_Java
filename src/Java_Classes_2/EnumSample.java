package Java_Classes_2;

public enum EnumSample implements MyInterface {
    MONDAY(101,"1st day of the week"),
    TUESDAY(102,"2nd day of the week"){
      @Override
      public void dummyMethod(){
          System.out.println("Tuesday method");
      }
    };

    private int val;
    private String comment;

    EnumSample(int val,String comment){
        this.val=val;
        this.comment=comment;
    }

    public int getVal() {
        return val;
    }

    public String getComment() {
        return comment;
    }

    public EnumSample getEnumfromValue(int value){
        for(EnumSample sample:EnumSample.values()){
            if(sample.val==value){
                return sample;
            }
        }return null;
    }

    public void dummyMethod(){
        System.out.println("Dummy method");
    }

    @Override
    public String toLowerCase(){
        return this.name().toLowerCase();
    }
}
