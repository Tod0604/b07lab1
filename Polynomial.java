public class Polynomial{
double [] coefficients;

public Polynomial(){
coefficients = new double [] {0};
}

public Polynomial(double [] number){
coefficients = number;
}

public Polynomial add(Polynomial p){
Polynomial new_poly = new Polynomial();
new_poly.coefficients = new double[Math.max(this.coefficients.length, p.coefficients.length)];
for(int i =0; i<=Math.min(this.coefficients.length, p.coefficients.length)-1;i++){
new_poly.coefficients[i] = this.coefficients[i]+p.coefficients[i];
} 
if(this.coefficients.length>=p.coefficients.length){
for(int i = p.coefficients.length;i<=this.coefficients.length-1;i++){
new_poly.coefficients[i] = this.coefficients[i];
}}
else{
for(int i = this.coefficients.length;i<= p.coefficients.length-1;i++){
new_poly.coefficients[i] = p.coefficients[i];
}}
return new_poly;
}

public double evaluate(double var){
double result = 0;
for(int i = 0; i<=this.coefficients.length-1;i++){
result += Math.pow(var,i)* this.coefficients[i];
}
return result;
}

public boolean hasRoot(double var){
return evaluate(var) == 0;
}
}



