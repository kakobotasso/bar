package br.com.kakobotasso.bar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.Button;

public class Main extends Activity {
	Button btAdmHome;
	Button btCarrinhoHome;
	Button btFecharPedidoHome;
	Intent itAdm;
	Intent itCarrinho;
	Intent itFecharPedido;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    // ASSOCIAR ELEMENTOS
    public void associarElementos(){
    	// BOTOES
    	this.btAdmHome = (Button) findViewById(R.id.btAdmHome);
    	this.btCarrinhoHome = (Button) findViewById(R.id.btCarrinhoHome);
    	this.btFecharPedidoHome = (Button) findViewById(R.id.btFecharPedidoHome);
    	
    	// INTERACAO DE TELAS
    	this.itAdm = new Intent(this, Adm.class);
    	this.itCarrinho = new Intent(this, Carrinho.class);
    	this.itFecharPedido = new Intent(this, FecharPedido.class);
    }
    
}
