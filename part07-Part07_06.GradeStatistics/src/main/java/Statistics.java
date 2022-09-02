
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yz
 */
public class Statistics {

    private ArrayList<Integer> grades;
    private int[] distrib;

    public Statistics() {
        this.grades = new ArrayList<>();
        this.distrib = new int[6];
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);
        }
        if (grade < 50){
            this.distrib[0]++;
        }
        if (grade < 60 && grade >= 50){
            this.distrib[1]++;
        }
        if (grade < 70 && grade > 59){
            this.distrib[2]++;
        }
        if (grade < 80 && grade > 69){
            this.distrib[3]++;
        }
        if (grade < 90 && grade > 79){
            this.distrib[4]++;
        }
        if (grade <= 100 && grade > 89){
            this.distrib[5]++;
        }
    }

    public double allAverage() {
        double sum = 0;
        for (int x : this.grades) {
            sum += x;
        }
        return sum / this.grades.size();
    }

    public double passingAverage() {
        double sum = 0;
        int passers = 0;
        for (int x : this.grades) {
            if (x >= 50) {
                sum += x;
                passers++;
            }
        }
        return sum / passers;
    }
    
    public double passPercentage(){
        int passers = 0;
        for (int x : this.grades){
            if (x >= 50){
                passers++;
            }
        }
        return 100 * (double)passers / this.grades.size();
    }
    
    public String gradeDistribution(){
        String distribb = "";
        distribb += "5: " + new String(new char[this.distrib[5]]).replace("\0", "*") + "\n";
        distribb += "4: " + new String(new char[this.distrib[4]]).replace("\0", "*") + "\n";
        distribb += "3: " + new String(new char[this.distrib[3]]).replace("\0", "*") + "\n";
        distribb += "2: " + new String(new char[this.distrib[2]]).replace("\0", "*") + "\n";
        distribb += "1: " + new String(new char[this.distrib[1]]).replace("\0", "*") + "\n";
        distribb += "0: " +new String(new char[this.distrib[0]]).replace("\0", "*") + "\n";
        return distribb;
    }
}
