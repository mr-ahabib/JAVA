
class BlockTest{
    public void show(){
        System.out.println("This is method .");
    }
    {
        System.out.println("This is block.");
    }
    public BlockTest(){
        System.out.println("This is constructor.");
    }
}



public class Test {
    public static void main(String[] args) {
        BlockTest bb=new BlockTest();
        bb.show();
    }
}
