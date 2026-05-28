package com.my.newproject;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;


public class RecipActivity extends AppCompatActivity {
	
	private CardView cardview1;
	private LinearLayout linear25;
	private ImageView imageview16;
	private LinearLayout layoutStats;
	private ScrollView vscroll1;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private ImageView imageview13;
	private TextView textview16;
	private ImageView imageview14;
	private TextView textview17;
	private ImageView imageview15;
	private TextView textview18;
	private LinearLayout constraint_layout20;
	private TextView name;
	private TextView tvRecipeSubtitle;
	private TextView tvIngredientsTitle;
	private LinearLayout linear24;
	private TextView textview21;
	private TextView preparation;
	private TextView quantities;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.recip);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		cardview1 = RecipActivity.this.findViewById(R.id.cardview1);
		linear25 = RecipActivity.this.findViewById(R.id.linear25);
		imageview16 = RecipActivity.this.findViewById(R.id.imageview16);
		layoutStats = RecipActivity.this.findViewById(R.id.layoutStats);
		vscroll1 = RecipActivity.this.findViewById(R.id.vscroll1);
		linear21 = RecipActivity.this.findViewById(R.id.linear21);
		linear22 = RecipActivity.this.findViewById(R.id.linear22);
		linear23 = RecipActivity.this.findViewById(R.id.linear23);
		imageview13 = RecipActivity.this.findViewById(R.id.imageview13);
		textview16 = RecipActivity.this.findViewById(R.id.textview16);
		imageview14 = RecipActivity.this.findViewById(R.id.imageview14);
		textview17 = RecipActivity.this.findViewById(R.id.textview17);
		imageview15 = RecipActivity.this.findViewById(R.id.imageview15);
		textview18 = RecipActivity.this.findViewById(R.id.textview18);
		constraint_layout20 = RecipActivity.this.findViewById(R.id.constraint_layout20);
		name = RecipActivity.this.findViewById(R.id.name);
		tvRecipeSubtitle = RecipActivity.this.findViewById(R.id.tvRecipeSubtitle);
		tvIngredientsTitle = RecipActivity.this.findViewById(R.id.tvIngredientsTitle);
		linear24 = RecipActivity.this.findViewById(R.id.linear24);
		textview21 = RecipActivity.this.findViewById(R.id.textview21);
		preparation = RecipActivity.this.findViewById(R.id.preparation);
		quantities = RecipActivity.this.findViewById(R.id.quantities);
	}
	
	private void initializeLogic() {
		name.setText(getIntent().getStringExtra("name"));
		quantities.setText(getIntent().getStringExtra("quantities"));
		preparation.setText(getIntent().getStringExtra("Preparation and cooking method"));
		layoutStats.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)5, (int)1, getResources().getColor(R.color.secondary_text), 0xFFFFFFFF));
		layoutStats.setElevation((float)6);
	}
	
}