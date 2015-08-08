package com.example.animations;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class FreamAnimation extends Activity {
	
	AnimationDrawable animationDrawable;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.freamanimation);
		ImageView image = (ImageView) findViewById(R.id.ivfreamxml);
		Button btnstart = (Button) findViewById(R.id.btnstart);
		Button btnstop = (Button) findViewById(R.id.btnstop);
		animationDrawable = (AnimationDrawable) image.getBackground();
		animationDrawable.start();
		
		btnstart.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				animationDrawable.start();
			}
		});

		btnstop.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				animationDrawable.stop();
			}
		});
	}

}
