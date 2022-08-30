
public class Statistics {
    private int count;
    private int sum;
    
    public void addNumber(int number){
        this.count++;
        this.sum += number;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public int sum(){
        return this.sum;
    }
    
    public double average(){
        if (this.count == 0){
            return 0;
        }
        return (double)this.sum / this.count;
    }
}
