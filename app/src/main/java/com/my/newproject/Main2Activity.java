package com.my.newproject;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;


public class Main2Activity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private LinearLayout bg;
	private LinearLayout bottom;
	private LinearLayout top;
	private ImageView imageview1;
	private LinearLayout linear1;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private TextView textview1;
	private TextView textview3;
	private TextView textview2;
	
	private TimerTask timer;
	private Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main2);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		bg = Main2Activity.this.findViewById(R.id.bg);
		bottom = Main2Activity.this.findViewById(R.id.bottom);
		top = Main2Activity.this.findViewById(R.id.top);
		imageview1 = Main2Activity.this.findViewById(R.id.imageview1);
		linear1 = Main2Activity.this.findViewById(R.id.linear1);
		linear3 = Main2Activity.this.findViewById(R.id.linear3);
		linear4 = Main2Activity.this.findViewById(R.id.linear4);
		linear5 = Main2Activity.this.findViewById(R.id.linear5);
		textview1 = Main2Activity.this.findViewById(R.id.textview1);
		textview3 = Main2Activity.this.findViewById(R.id.textview3);
		textview2 = Main2Activity.this.findViewById(R.id.textview2);
		
		linear4.setOnClickListener((View _view) -> {
			intent.setClass(Main2Activity.this.getApplicationContext(), HomeActivity.class);
			Main2Activity.this.startActivity(intent);
			Main2Activity.this.finish();
		});
	}
	
	private void initializeLogic() {
		_hieght(bottom, SketchwareUtil.getDip(Main2Activity.this.getApplicationContext(), (int)(400)));
		_setBackground(linear4, 20, 2, "#5B65F5", true);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) { 
			Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
			w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(0xFF008375); w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); }
		textview2.setTypeface(Typeface.DEFAULT, 0);
		textview1.setTypeface(Typeface.DEFAULT, 1);
		textview3.setTypeface(Typeface.DEFAULT, 1);
		_anim();
	}
	
	public void _setHeight(final View _view, final double _heightValue, final double _widthValue) {
		_view.getLayoutParams().height = (int)_heightValue;
		_view.requestLayout();
		_view.getLayoutParams().width = (int)_widthValue;
		_view.requestLayout();
	}
	
	
	public void _hieght(final View _view, final double _heightvalue) {
		_view.getLayoutParams().height = (int)_heightvalue;
		_view.requestLayout();
	}
	
	
	public void _setBackground(final View _view, final double _radius, final double _shadow, final String _color, final boolean _ripple) {
		if (_ripple) {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setElevation((int)_shadow);
			
			android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#212121")});
			android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrb , gd, null);
			_view.setClickable(true);
			_view.setBackground(ripdrb);
		} else {
			
		}
	}
	
	
	public void _anim() {
		bottom.setVisibility(View.VISIBLE);
		_Animator(bottom, "translationY", 450, 0);
		_Animator(bottom, "alpha", 0, 0);
		timer = new TimerTask() {
			@Override
			public void run() {
				Main2Activity.this.runOnUiThread(() -> {
					_Animator(bottom, "translationY", 0, 1000);
					_Animator(bottom, "alpha", 1, 800);
				});
			}
		};
		_timer.schedule(timer, (int)(100));
		_Animator(textview1, "alpha", 0, 0);
		_Animator(textview2, "alpha", 1, 0);
		_Animator(linear4, "alpha", 0, 0);
		_Animator(textview3, "alpha", 0, 0);
		_Animator(textview1, "translationX", -300, 0);
		_Animator(textview3, "translationX", -300, 0);
		timer = new TimerTask() {
			@Override
			public void run() {
				Main2Activity.this.runOnUiThread(() -> {
					_Animator(textview1, "alpha", 1, 500);
					_Animator(textview1, "translationX", 0, 900);
				});
			}
		};
		_timer.schedule(timer, (int)(1200));
		timer = new TimerTask() {
			@Override
			public void run() {
				Main2Activity.this.runOnUiThread(() -> {
					_Animator(textview3, "alpha", 1, 500);
					_Animator(textview3, "translationX", 0, 900);
				});
			}
		};
		_timer.schedule(timer, (int)(2100));
		timer = new TimerTask() {
			@Override
			public void run() {
				Main2Activity.this.runOnUiThread(() -> {
					_Animator(linear4, "alpha", 1, 300);
					_Animator(linear4, "scaleX", 1, 500);
					_Animator(linear4, "scaleY", 1, 500);
				});
			}
		};
		_timer.schedule(timer, (int)(3000));
		_Animator(linear4, "scaleX", .8d, 0);
		_Animator(linear4, "scaleY", .8d, 0);
	}
	
	
	public void _Animator(final View _view, final String _propertyName, final double _value, final double _duration) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_view);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long)_duration);
		anim.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
		anim.start();
	}
	
	
	public void _Fade(final View _view, final double _value, final double _duration, final double _start) {
		timer = new TimerTask() {
			@Override
			public void run() {
				Main2Activity.this.runOnUiThread(() -> {
					_Animator(_view, "alpha", _value, _duration);
					_Animator(_view, "scaleX", _value, _duration);
					_Animator(_view, "scaleY", _value, _duration);
				});
			}
		};
		_timer.schedule(timer, (int)(_start));
	}
	
}