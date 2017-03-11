package kg.app.kuba.ifelseifelse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main extends AppCompatActivity {
    Button button;
    TextView tv;
    EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button = (Button)findViewById(R.id.button);
        et = (EditText)findViewById(R.id.editText);
        tv = (TextView)findViewById(R.id.textView);
    }

    public void season (View view){
        int s = Integer.parseInt(et.getText().toString());
        if (s==1){
            tv.setText(getString(R.string.zima)+".  Январь");
            tv.setBackgroundResource(R.color.colorZima);
            tv.setTextColor(0xFFFFFFFF);
        }else if (s==2){
            tv.setText(getString(R.string.zima)+".  Февраль");
            tv.setBackgroundResource(R.color.colorZima);
            tv.setTextColor(0xFFFFFFFF);
        }else if (s==3){
            tv.setText(getString(R.string.vesna)+".  Март");
            tv.setBackgroundResource(R.color.colorVesna);
            tv.setTextColor(0xFFFFFFFF);
        }else if (s==4){
            tv.setText(getString(R.string.vesna)+".  Апрель");
            tv.setBackgroundResource(R.color.colorVesna);
            tv.setTextColor(0xFFFFFFFF);
        }else if (s==5){
            tv.setText(getString(R.string.vesna)+".  Май");
            tv.setBackgroundResource(R.color.colorVesna);
            tv.setTextColor(0xFFFFFFFF);
        }else if (s==6){
            tv.setText(getString(R.string.leto)+".  Июнь");
            tv.setBackgroundResource(R.color.colorLeto);
            tv.setTextColor(0xFFFC000D);
        }else if (s==7){
            tv.setText(getString(R.string.leto)+".  Июль");
            tv.setBackgroundResource(R.color.colorLeto);
            tv.setTextColor(0xFFFC000D);
        }else if (s==8){
            tv.setText(getString(R.string.leto)+".  Август");
            tv.setBackgroundResource(R.color.colorLeto);
            tv.setTextColor(0xFFFC000D);
        }else if (s==9){
            tv.setText(getString(R.string.osen)+",  Сентябрь");
            tv.setBackgroundResource(R.color.colorOsen);
            tv.setTextColor(0xFFFBFF02);
        }else if (s==10){
            tv.setText(getString(R.string.osen)+".  Октябрь");
            tv.setBackgroundResource(R.color.colorOsen);
            tv.setTextColor(0xFFFBFF02);
        }else if (s==11){
            tv.setText(getString(R.string.osen)+".  Ноябрь");
            tv.setBackgroundResource(R.color.colorOsen);
            tv.setTextColor(0xFFFBFF02);
        }else if (s==12){
            tv.setText(getString(R.string.zima)+".  Декабрь");
            tv.setBackgroundResource(R.color.colorZima);
            tv.setTextColor(0xFFFFFFFF);
        }else
            tv.setText(R.string.netsezona);
    }
    public void zodiac (View view){
        String z = et.getText().toString();
        if (z.equals("Овен")){
            Intent i = new Intent(this, Oven.class);
            startActivity(i);
        }else if (z.equals("Телец")){
            Intent i = new Intent(this, Telec.class);
            startActivity(i);
        }else if (z.equals("Близнецы")){
            Intent i = new Intent(this, Bliznecy.class);
            startActivity(i);
        }else if (z.equals("Рак")){
            Intent i = new Intent(this, Rak.class);
            startActivity(i);
        }else if (z.equals("Лев")){
            Intent i = new Intent(this, Lev.class);
            startActivity(i);
        }else if (z.equals("Дева")){
            Intent i = new Intent(this, Deva.class);
            startActivity(i);
        }else if (z.equals("Весы")){
            Intent i = new Intent(this, Vesy.class);
            startActivity(i);
        }else if (z.equals("Скорпион")){
            Intent i = new Intent(this, Scorpion.class);
            startActivity(i);
        }else if (z.equals("Стрелец")){
            Intent i = new Intent(this, Strelec.class);
            startActivity(i);
        }else if (z.equals("Козерог")){
            Intent i = new Intent(this, Cozeroc.class);
            startActivity(i);
        }else if (z.equals("Водолей")){
            Intent i = new Intent(this, Vodoley.class);
            startActivity(i);
        }else if (z.equals("Рыба")){
            Intent i = new Intent(this, Ryba.class);
            startActivity(i);
        }else
            tv.setText(R.string.netzodiac);
    }
    public void login (View view){
        int login = Integer.parseInt(et.getText().toString());
        if (login==1){
            Intent i = new Intent(this, Login1.class);
            startActivity(i);
        }else if (login==2){
            Intent i = new Intent(this, Login2.class);
            startActivity(i);
        }else
            tv.setText(R.string.netemail);
    }
}
