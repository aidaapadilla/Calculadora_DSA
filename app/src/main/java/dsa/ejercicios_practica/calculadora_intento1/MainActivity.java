package dsa.ejercicios_practica.calculadora_intento1;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import java.math.MathContext;

import dsa.ejercicios_practica.calculadora_intento1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private double numero1; //Primer numero que escribe
    private double numero2; //Segundo numero que escribe
    private int numeroclicks1=0;
    private int numeroclicks2=0;
    private String operacion;
    private boolean primernumero=false;
    private double resultado_numerico=0;
    private String texto_resultado;
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    // La idea es guardar les variables en dos posicions, aleshores si vol seguir operant ho guardarem a la primera i seguirem fent
    public void AñadirNumero(View view)
    {
        Button bt = (Button)view; //Esta v es un botón seguro sino peta por lo tanto te hago un cast para que funcione
        String texto= (String) bt.getText();
        TextView resultado =(TextView) findViewById(R.id.Resultado);
        if (texto.contentEquals("uno"))
        {
            if (primernumero==false) {
                if (numeroclicks1 != 0) { //Cuando quiere poner el 12, 13, 14
                    numero1 = numero1 *10 + 1;
                } else //Si es el primer numero que quiere escribir
                {
                    numero1 = 1;
                }
            }
            else {
                if (numeroclicks2 != 0) { //Cuando quiere poner el 12, 13, 14
                    numero2 = numero2 *10 + 1;
                } else //Si es el primer numero que quiere escribir
                {
                    numero2 = 1;
                }
            }
        }
        else if (texto.contentEquals("dos"))
        {
            if(primernumero==false) {
                if (numeroclicks1 != 0) {
                    numero1 = numero1 *10 + 2;
                } else {
                    numero1 = 2;
                }
            }
            else{
                if (numeroclicks2 != 0) {
                    numero2 = numero2 *10 + 2;
                } else {
                    numero2 = 2;
                }
            }
            
        }
        else if (texto.contentEquals("tres"))
        {
            if(primernumero==false) {
                if (numeroclicks1 != 0) {
                    numero1 = numero1 *10 + 3;
                } else {
                    numero1 = 3;
                }
            }
            else{
                if (numeroclicks2 != 0) {
                    numero2 = numero2 *10 + 3;
                } else {
                    numero2 = 3;
                }
            }
        }
        else if (texto.contentEquals("cuatro"))
        {
            if(primernumero==false) {
                if (numeroclicks1 != 0) {
                    numero1 = numero1 *10 + 4;
                } else {
                    numero1 = 4;
                }
            }
            else
            {
                if (numeroclicks2 != 0) {
                    numero2 = numero2 *10 + 4;
                } else {
                    numero2 = 4;
                }
            }
        }
        else if (texto.contentEquals("cinco"))
        {
            if (primernumero==false) {
                if (numeroclicks1 != 0) {
                    numero1 = numero1 *10 + 5;
                } else {
                    numero1 = 5;
                }
            }
            else {
                if (numeroclicks2 != 0) {
                    numero2 = numero2 *10 + 5;
                } else {
                    numero2 = 5;
                }
            }
        }
        else if (texto.contentEquals("seis"))
        {
            if(primernumero==false) {
                if (numeroclicks1 != 0) {
                    numero1 = numero1 *10 + 6;
                } else {
                    numero1 = 6;
                }
            }
            else
            {
                if (numeroclicks2 != 0) {
                    numero2 = numero2 *10 + 6;
                } else {
                    numero2 = 6;
                }
            }
        }
        else if (texto.contentEquals("siete"))
        {
            if(primernumero==false) {
                if (numeroclicks1 != 0) {
                    numero1 = numero1 *10 + 7;
                } else {
                    numero1 = 7;
                }
            }
            else{
                if (numeroclicks2 != 0) {
                    numero2 = numero2 *10 + 7;
                } else {
                    numero2 = 7;
                }
            }

        }
        else if (texto.contentEquals("ocho"))
        {
            if(primernumero==false) {
                if (numeroclicks1 != 0) {
                    numero1 = numero1 *10 + 8;
                } else {
                    numero1 = 8;
                }
            }
            else{
                if (numeroclicks2 != 0) {
                    numero2 = numero2 *10 + 8;
                } else {
                    numero2 = 8;
                }
            }
        }
        else if (texto.contentEquals("nueve"))
        {
            if(primernumero==false) {
                if (numeroclicks1 != 0) {
                    numero1 = numero1 *10 + 9;
                } else {
                    numero1 = 9;
                }
            }
            else{
                if (numeroclicks2 != 0) {
                    numero2 = numero2 *10 + 9;
                } else {
                    numero2 = 9;
                }
            }
        }
        else if (texto.contentEquals("cero"))
        {
            if (primernumero==false) {
                if (numeroclicks1 != 0) {
                    numero1 = numero1 *10 + 0;
                } else {
                    numero1 = 0;
                }
            }
            else{
                if (numeroclicks2 != 0) {
                    numero2 = numero2 *10 + 0;
                } else {
                    numero2 = 0;
                }
            }
        }
        else if (texto.contentEquals(null))
        {
            resultado.setText("no");
        }
        if (primernumero==false) {
            texto_resultado = Double.toString(numero1);
        }
        else if (primernumero==true){
            texto_resultado = texto_resultado + Double.toString(numero2);
        }
        resultado.setText(texto_resultado);

        if (primernumero==false) {
            numeroclicks1 = numeroclicks1 + 1;
        }
        else
        {
            numeroclicks2 =numeroclicks2 +1;
        }
    }

    public void Operar(View view)
    {
        Button bt = (Button)view; //Esta v es un botón seguro sino peta por lo tanto te hago un cast para que funcione
        String texto= (String) bt.getText();
        TextView resultado =(TextView) findViewById(R.id.Resultado);
        primernumero=true;

        if(numero1!=0 && numero2==0) { //Aqui només entrara si li dona al igual o intenta fer mes d'una operacio
            if (texto.contentEquals("+")) {
                operacion = "+";

            } else if (texto.contentEquals("-")) {
                operacion = "-";

            } else if (texto.contentEquals("x")) {
                operacion = "x";

            } else if (texto.contentEquals("/")) {
                operacion = "/";
            }
            else if(texto.contentEquals("Cosinus")){
                resultado_numerico=Math.cos(numero1);
                texto_resultado=Double.toString(resultado_numerico);
                numero1 = resultado_numerico;
                texto_resultado=Double.toString(resultado_numerico);
                numero2=0;
                numeroclicks2=0;
            }
            else if(texto.contentEquals("Sinus")){
                resultado_numerico=Math.sin(numero1);
                texto_resultado=Double.toString(resultado_numerico);
                numero1 = resultado_numerico;
                texto_resultado=Double.toString(resultado_numerico);
                numero2=0;
                numeroclicks2=0;
            }
            else if(texto.contentEquals("Tangent")) {
                resultado_numerico = Math.tan(numero1);
                texto_resultado=Double.toString(resultado_numerico);
                numero1 = resultado_numerico;
                texto_resultado=Double.toString(resultado_numerico);
                numero2=0;
                numeroclicks2=0;
            }
            else if (texto.contentEquals(null)){
                operacion="ERROR";
            }
            texto_resultado = texto_resultado + operacion;
            resultado.setText(texto_resultado);

        }
        else if(texto.contentEquals("=") && numero1!=0 && numero2!=0){
            if(operacion.contentEquals("+")){
                resultado_numerico=numero1+numero2;
            }
            else if(operacion.contentEquals("-")){
                resultado_numerico=numero1-numero2;
            }
            else if(operacion.contentEquals("x")){
                resultado_numerico=numero1*numero2;
            }
            else if(operacion.contentEquals("/")){
                resultado_numerico=numero1/numero2;
            }
            numero1=resultado_numerico; //Aqui es on es guarda sempre el altre resultat
            numero2=0;
            numeroclicks2=0;
            resultado.setText(String.valueOf(resultado_numerico));
        }
        else if (texto.contentEquals("AC")){
            numero1=0;
            numeroclicks1=0;
            numero2=0;
            numeroclicks2=0;
            primernumero=false;
            texto_resultado=null;
            resultado.setText("0");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}