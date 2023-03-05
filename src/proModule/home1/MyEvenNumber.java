package proModule.home1;

public class MyEvenNumber {
    private int n;

    public MyEvenNumber(int n){
        try{
            if(n % 2 == 0){
                throw new MyCheckedException("Число четное");
            }else {
                this.n = n;
            }
        }catch(MyCheckedException e){
            System.err.println("Ошибка " + e);
        }

    }

    public int getN() {
        return n;
    }
}
