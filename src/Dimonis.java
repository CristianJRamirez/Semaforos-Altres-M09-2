/**
 * Created by Dionis on 17/11/2015.
 */
public class Dimonis {

    public static void main(String[] args) {
        Thread[] f = new Thread[10];
        for (int i = 0; i < 10; i++) {
                f[i] = new Thread(){
                    int j = 10;
                    @Override
                    public void run() {
                        while( j>0){
                            System.out.println(j);
                            j--;
                        }
                    }
                };
                f[i].setDaemon(true);
                f[i].start();
        }
    }

}
