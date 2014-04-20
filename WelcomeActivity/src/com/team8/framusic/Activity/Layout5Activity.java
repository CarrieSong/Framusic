package com.team8.framusic.Activity;

import com.team8.framusic.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Layout5Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.layout5);
		findViews();
		setListeners();
	}
	
	Button btn1, btn2, btn3;
	ImageView image1, image2, image3;
	
	private void findViews() {
		btn1 = (Button)findViewById(R.id.btn5_1);
		btn2 = (Button)findViewById(R.id.btn5_2);
		btn3 = (Button)findViewById(R.id.btn5_3);
		image1 = (ImageView)findViewById(R.id.image5_1);
		image2 = (ImageView)findViewById(R.id.image5_2);
		image3 = (ImageView)findViewById(R.id.image5_3);
	}
	
	private void setListeners() {
		btn1.setOnClickListener(button1);
		btn2.setOnClickListener(button2);
		btn3.setOnClickListener(button3);
	}
	
	private Button.OnClickListener button1 = new Button.OnClickListener()
    {
		public void onClick(View v)
		{
			btn1.setVisibility(View.GONE);
			image1.setImageResource(R.drawable.sample_0);
			//Intent intent = new Intent(Layout1Activity.this, GridViewActivity.class);
			//startActivity(intent);
		}
    };
	
    private Button.OnClickListener button2 = new Button.OnClickListener()
    {
		public void onClick(View v)
		{
			btn2.setVisibility(View.GONE);
			image2.setImageResource(R.drawable.sample_1);
			//Intent intent = new Intent(Layout1Activity.this, GridViewActivity.class);
			//startActivity(intent);
		}
    };
    
    private Button.OnClickListener button3 = new Button.OnClickListener()
    {
		public void onClick(View v)
		{
			btn3.setVisibility(View.GONE);
			image3.setImageResource(R.drawable.sample_2);
			//Intent intent = new Intent(Layout1Activity.this, GridViewActivity.class);
			//startActivity(intent);
		}
    };
}
