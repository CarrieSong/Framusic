package com.team8.framusic.Activity;

import com.team8.framusic.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Layout2Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.layout2);
		findViews();
		setListeners();
	}

	Button btn1, btn2;
	ImageView image1, image2;
	
	private void findViews() {
		
		btn1 = (Button)findViewById(R.id.btn2_1);
		btn2 = (Button)findViewById(R.id.btn2_2);
		image1 = (ImageView)findViewById(R.id.image2_1);
		image2 = (ImageView)findViewById(R.id.image2_2);
	}
	
	private void setListeners() {
		
		btn1.setOnClickListener(button1);
		btn2.setOnClickListener(button2);
	}
	
	private Button.OnClickListener button1 = new Button.OnClickListener()
    {
		public void onClick(View v)
		{
			Intent intent = new Intent(Layout2Activity.this, GridViewActivity.class);
			startActivity(intent);
		}
    };
	
    private Button.OnClickListener button2 = new Button.OnClickListener()
    {
		public void onClick(View v)
		{
			Intent intent = new Intent(Layout2Activity.this, GridViewActivity.class);
			startActivity(intent);
		}
    };
	
}
