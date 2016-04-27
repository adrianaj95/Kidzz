

package com.example.d14141515.kidzz;


        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.provider.MediaStore;
        import android.support.v7.app.AppCompatActivity;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.TextView;



public class ThreeActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);


        ImageButton image = (ImageButton) findViewById(R.id.myButton2);
        image.setOnClickListener(this);

        ImageButton image = (ImageButton) findViewById(R.id.myButton3);
        image.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText("Dog goes woof");

        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText("Cat goes meow");
    }

    @Override
            protected void onCreate(Bundle savedInstantState) {
            super .onCreate(savedInstantState);
        setContentView(R.layout.activity_three);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.woof)

                ImageButton ib = (ImageButton) findViewById(R.id.ib)
                        ib.setOnClickListener(new View.OnClickListener());

        @Override
                public void onClick(View view)
        mp.start();


        }

    @Override
    protected void onCreate(Bundle savedInstantState) {
        super .onCreate(savedInstantState);
        setContentView(R.layout.activity_three);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.meow)

        ImageButton ib = (ImageButton) findViewById(R.id.ib)
        ib.setOnClickListener(new View.OnClickListener());

        @Override
        public void onClick(View view)
        mp.start();

        }
    }