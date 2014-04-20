package com.team8.framusicv2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ChooseLayoutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.screen_layout_setting);
		findViews();
		setListeners();
	}

	ImageButton layout3;
	Button next;
	
	private void findViews() {
		layout3 = (ImageButton) findViewById(R.id.layout3);
		next = (Button) findViewById(R.id.btn_next);
	}
	
	private void setListeners() {
		layout3.setOnClickListener(Layout3);
		next.setOnClickListener(button_next);
	}

	private ImageButton.OnClickListener Layout3 = new Button.OnClickListener()
    {
		public void onClick(View v)
		{
			Intent intent = new Intent(ChooseLayoutActivity.this, Layout3Activity.class);
        	startActivity(intent);
		}
    };
	
    private Button.OnClickListener button_next = new Button.OnClickListener()
    {
    	public void onClick(View v)
    	{
    		finish();
    	}
    };
	
	

}
