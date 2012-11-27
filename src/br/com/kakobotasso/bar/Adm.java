package br.com.kakobotasso.bar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Adm extends Activity {
	Button btVoltar;
	Button btCadastroPais;
	Intent itVoltar;
	Intent itCadastroPais;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adm);
        associarElementos();
    }
	
	// ASSOCIAR ELEMENTOS
	public void associarElementos(){
		this.btVoltar = (Button) findViewById(R.id.btVoltar);
		this.btCadastroPais = (Button) findViewById(R.id.btCadastroPais);
		
		this.itVoltar = new Intent(this, Main.class);
		//this.itCadastroPais = new Intent(this, CadastroPais.class);
	}
	
	// PASSAR TELA HOME
	public void passaTelaHome(){
		this.btVoltar.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				startActivity(itVoltar);
			}
		});
	}
}
