package br.com.kakobotasso.bar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
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
        associarElementos();
        passarTelaAdm();
        passarTelaCarrinho();
        passarFecharPedido();
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
    
    // PASSAR TELAS ADM
    public void passarTelaAdm(){
    	this.btAdmHome.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				startActivity(itAdm);
			}
		});
    }
    
 // PASSAR TELAS CARRINHO
    public void passarTelaCarrinho(){
    	this.btCarrinhoHome.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				startActivity(itCarrinho);
			}
		});
    }

 // PASSAR TELAS FECHAR PEDIDO
    public void passarFecharPedido(){
    	this.btFecharPedidoHome.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				startActivity(itFecharPedido);
			}
		});
    }
    
}
