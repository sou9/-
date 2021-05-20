public class SingletonTest{

    public static void main (String[] args ){
        Renban renbanA = Renban.getInstance();
        Renban renbanB = Renban.getInstance();
        System.out.println( renbanA.getNumber () );
        System.out.println( renbanB.getNumber () );
        System.out.println( renbanB.getNumber () );
        System.out.println( renbanA.getNumber () );
        System.out.println( renbanB.getNumber () );
    }
}
class Renban{
    private static Renban instance = new Renban();
    private int number;
    private Renban (){
        //number を初期化する
        number=0000;
    }
    public static Renban getInstance (){
        return instance;
    }
    public String getNumber(){
        //number を 1 増やして 0001 っぽい 文字列に変換してから
        //retrun文でその文字列を返却する
        number+=1;
        String result = String.format("%04d",number);
        return result;
    }

}