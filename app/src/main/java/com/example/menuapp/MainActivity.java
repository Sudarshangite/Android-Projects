package com.example.menuapp;
        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;
        import android.annotation.SuppressLint;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuInflater;
        import android.view.MenuItem;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MenuItem r, g, b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = findViewById(R.id.r);
        g = findViewById(R.id.g);
        b = findViewById(R.id.b);
        r.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                finish();
                return false;
            }
        });

        g.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent i = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(i);
                finish();
                return false;
            }
        });

        b.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                Intent j = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(j);
                finish();
                return false;
            }
        });

    }
}




    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater m=getMenuInflater();
        m.inflate(R.menu.opetion,menu);
        return true;

    }
    public boolean onOpetionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.r:

                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                finish();

                return true;
            case R.id.g:
               Intent i=new Intent(MainActivity.this,MainActivity3.class);
               startActivity(i);
               finish();
                return true;
            case R.id.b:
                Intent j=new Intent(MainActivity.this,MainActivity4.class);
                startActivity(j);
                finish();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
*/