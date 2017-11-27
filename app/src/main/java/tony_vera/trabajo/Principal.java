package tony_vera.trabajo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Button boton = (Button) findViewById(R.id.button2);
        Button boton2 = (Button) findViewById(R.id.button);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iniciar = new Intent(Principal.this, iniciarsesion.class);
                startActivity(iniciar);
            }
        });
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrar = new Intent(Principal.this, registrarse.class);
                startActivity(registrar);
            }
        });
    }
}
