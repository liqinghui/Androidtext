package com.example.animations;

import android.os.Bundle;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	private Button btn1, btn2, btn3, btn4;
	private Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context = this;
		btn1 = (Button) findViewById(R.id.btn1);
		btn2 = (Button) findViewById(R.id.btn2);
		btn3 = (Button) findViewById(R.id.btn3);
		btn4 = (Button) findViewById(R.id.btn4);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn1:
			Intent intent = new Intent(context, TweenAnimation.class);
			startActivity(intent);
			break;

		case R.id.btn2:
			Intent intent1 = new Intent(context, FreamAnimation.class);
			startActivity(intent1);
			break;

		case R.id.btn3:
			Intent intent3 = new Intent(context, ObjectAnimations.class);
			startActivity(intent3);
			break;

		case R.id.btn4:
			Intent intent4 = new Intent(context, LayoutAnimation.class);
			startActivity(intent4);
			break;
		default:
			break;
		}
	}
}
