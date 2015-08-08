package com.example.animations;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class TweenAnimation extends Activity{

	private ImageView image;
	private Context context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tweenanimation);
		context = this;
		image = (ImageView) findViewById(R.id.image);
	}

	public void Alphaview(View view){
		Animation animation = AnimationUtils.loadAnimation(context, R.anim.alpha_demo);
		image.startAnimation(animation);
	}
	
	public void Rotate(View view){
		Animation animation = AnimationUtils.loadAnimation(context, R.anim.rotate_demo);
		image.startAnimation(animation);
	}
	
	public void Scale(View view){
		Animation animation = AnimationUtils.loadAnimation(context, R.anim.scale_demo);
		image.startAnimation(animation);
	}
	
	public void Translate(View view){
		Animation animation = AnimationUtils.loadAnimation(context, R.anim.translate_demo);
		image.startAnimation(animation);
	}
	
	public void All(View view){
		Animation animation = AnimationUtils.loadAnimation(context, R.anim.allanimation);
		image.startAnimation(animation);
	}
}
