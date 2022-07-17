/* InputMakers 
Programa para el control del brillo o intensidad de luz que
emite un led mediante un potenciómetro.*/
 
int led10 = 10;    // Variable asociada a el led. (pin pwm 10)
int brillo;    // Variables donde guardamos la intensidad de brillo.
int pot = 0;    // Variable donde guardamos la lectura del potenciómetro.
int potpin = A1; // Pin del potenciómetro conectado a la entrada analógica A1.
 
void setup() {
  Serial.begin(9600);
  pinMode (led10, OUTPUT);   // Definimos el pin que va conectado al led como salida.
}
 
void loop() {


  for( int j=255 ; j >=0 ;  j--){
    Serial.println("entre");
  analogWrite (led10,j);
    delay(100);
    Serial.println(j);
    j--;
    }
 
  for( int k=0 ; k <=255 ;  k++){
  analogWrite (led10, k);
    delay(100);
    Serial.println(k);
    k++;
    }
   
}
