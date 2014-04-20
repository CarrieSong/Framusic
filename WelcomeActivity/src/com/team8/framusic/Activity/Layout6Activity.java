package com.team8.framusic.Activity;



import com.team8.framusic.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Layout6Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.layout6);
		findViews();
		setListeners();
	}
	
	Button btn1,btn2, btn3, btn4;
	ImageView image1, image2, image3, image4;
	
	private void findViews() {
		btn1 = (Button)findViewById(R.id.btn6_1);
		btn2 = (Button)findViewById(R.id.btn6_2);
		btn3 = (Button)findViewById(R.id.btn6_3);
		btn4 = (Button)findViewById(R.id.btn6_4);
		image1 = (ImageView)findViewById(R.id.image6_1);
		image2 = (ImageView)findViewById(R.id.image6_2);
		image3 = (ImageView)findViewById(R.id.image6_3);
		image4 = (ImageView)findViewById(R.id.image6_4);
	}
	
	private void setListeners() {
		btn1.setOnClickListener(button1);
		btn2.setOnClickListener(button2);
		btn3.setOnClickListener(button3);
		btn4.setOnClickListener(button4);
	}
	
	private Button.OnClickListener button1 = new Button.OnClickListener()
    {
		public void onClick(View v)
		{
			btn1.setVisibility(View.INVISIBLE);
			image1.setImageResource(R.drawable.cat);
			//Intent intent = new Intent(Layout1Activity.this, GridViewActivity.class);
			//startActivity(intent);
		}
    };
    
    private Button.OnClickListener button2 = new Button.OnClickListener()
    {
		public void onClick(View v)
		{
			btn2.setVisibility(View.INVISIBLE);
			image2.setImageResource(R.drawable.cat);
			//Intent intent = new Intent(Layout1Activity.this, GridViewActivity.class);
			//startActivity(intent);
		}
    };
    
    private Button.OnClickListener button3 = new Button.OnClickListener()
    {
		public void onClick(View v)
		{
			btn3.setVisibility(View.INVISIBLE);
			image3.setImageResource(R.drawable.cat);
			//Intent intent = new Intent(Layout1Activity.this, GridViewActivity.class);
			//startActivity(intent);
		}
    };
    
    private Button.OnClickListener button4 = new Button.OnClickListener()
    {
		public void onClick(View v)
		{
			btn4.setVisibility(View.INVISIBLE);
			image4.setImageResource(R.drawable.cat);
			//Intent intent = new Intent(Layout1Activity.this, GridViewActivity.class);
			//startActivity(intent);
		}
    };
    
}
