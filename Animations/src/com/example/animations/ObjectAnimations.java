package com.example.animations;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class ObjectAnimations extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.objeceanimation);
	}

	public void rotateyAnimRun(final View view) {
		ObjectAnimator.ofFloat(view, "rotationX", 0.0f, 360.0f)
				.setDuration(1000).start();

		ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view,
				"animation", 1.0f, 0.0f).setDuration(2000);
		objectAnimator.start();
		objectAnimator.addUpdateListener(new AnimatorUpdateListener() {

			@Override
			public void onAnimationUpdate(ValueAnimator animation) {
				// TODO Auto-generated method stub
				float value = (Float) animation.getAnimatedValue();
				view.setAlpha(value);
				view.setScaleX(value);
				view.setScaleY(value);
			}
		});

	}

//	public void propertyValuesHolder(View view)
//
//	{
//
//		PropertyValuesHolder pvhX = PropertyValuesHolder.ofFloat("alpha", 1f,
//
//		0f, 1f);
//
//		PropertyValuesHolder pvhY = PropertyValuesHolder.ofFloat("scaleX", 1f,
//
//		0, 1f);
//
//		PropertyValuesHolder pvhZ = PropertyValuesHolder.ofFloat("scaleY", 1f,
//
//		0, 1f);
//
//		ObjectAnimator.ofPropertyValuesHolder(view, pvhX, pvhY, pvhZ)
//				.setDuration(1000).start();
//
//	}

}
