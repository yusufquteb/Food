package com.my.newproject;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
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
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.*;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;


public class FoodViewActivity extends AppCompatActivity {
	
	private boolean b = false;
	
	private CoordinatorLayout coordinator_layout28;
	private AppBarLayout appBarLayout;
	private NestedScrollView nestedScrollView;
	private Toolbar toolbar;
	private LinearLayout linear11;
	private ImageView logoImageView;
	private TextView titleTextView;
	private LinearLayout mainContainer;
	private FrameLayout frame_layout12;
	private CardView detailsCardView;
	private TextView textview18;
	private RecyclerView relatedRecipesRecyclerView;
	private ImageView foodImage;
	private View view13;
	private LinearLayout cardContent;
	private LinearLayout titleSection;
	private View divider;
	private TextView ingredientsLabelTextView;
	private TextView ingredientsContentTextView;
	private TextView preparationLabelTextView;
	private TextView preparationContentTextView;
	private TextView nutritionLabelTextView;
	private LinearLayout linear16;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private TextView foodNameTextView;
	private TextView foodSizeTextView;
	private ImageView likeButton;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private TextView textview10;
	private TextView textview11;
	private TextView textview12;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private TextView textview17;
	
	private Intent sf = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.food_view);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		coordinator_layout28 = FoodViewActivity.this.findViewById(R.id.coordinator_layout28);
		appBarLayout = FoodViewActivity.this.findViewById(R.id.appBarLayout);
		nestedScrollView = FoodViewActivity.this.findViewById(R.id.nestedScrollView);
		toolbar = FoodViewActivity.this.findViewById(R.id.toolbar);
		linear11 = FoodViewActivity.this.findViewById(R.id.linear11);
		logoImageView = FoodViewActivity.this.findViewById(R.id.logoImageView);
		titleTextView = FoodViewActivity.this.findViewById(R.id.titleTextView);
		mainContainer = FoodViewActivity.this.findViewById(R.id.mainContainer);
		frame_layout12 = FoodViewActivity.this.findViewById(R.id.frame_layout12);
		detailsCardView = FoodViewActivity.this.findViewById(R.id.detailsCardView);
		textview18 = FoodViewActivity.this.findViewById(R.id.textview18);
		relatedRecipesRecyclerView = FoodViewActivity.this.findViewById(R.id.relatedRecipesRecyclerView);
		foodImage = FoodViewActivity.this.findViewById(R.id.foodImage);
		view13 = FoodViewActivity.this.findViewById(R.id.view13);
		cardContent = FoodViewActivity.this.findViewById(R.id.cardContent);
		titleSection = FoodViewActivity.this.findViewById(R.id.titleSection);
		divider = FoodViewActivity.this.findViewById(R.id.divider);
		ingredientsLabelTextView = FoodViewActivity.this.findViewById(R.id.ingredientsLabelTextView);
		ingredientsContentTextView = FoodViewActivity.this.findViewById(R.id.ingredientsContentTextView);
		preparationLabelTextView = FoodViewActivity.this.findViewById(R.id.preparationLabelTextView);
		preparationContentTextView = FoodViewActivity.this.findViewById(R.id.preparationContentTextView);
		nutritionLabelTextView = FoodViewActivity.this.findViewById(R.id.nutritionLabelTextView);
		linear16 = FoodViewActivity.this.findViewById(R.id.linear16);
		linear14 = FoodViewActivity.this.findViewById(R.id.linear14);
		linear15 = FoodViewActivity.this.findViewById(R.id.linear15);
		foodNameTextView = FoodViewActivity.this.findViewById(R.id.foodNameTextView);
		foodSizeTextView = FoodViewActivity.this.findViewById(R.id.foodSizeTextView);
		likeButton = FoodViewActivity.this.findViewById(R.id.likeButton);
		linear17 = FoodViewActivity.this.findViewById(R.id.linear17);
		linear18 = FoodViewActivity.this.findViewById(R.id.linear18);
		linear19 = FoodViewActivity.this.findViewById(R.id.linear19);
		linear20 = FoodViewActivity.this.findViewById(R.id.linear20);
		textview10 = FoodViewActivity.this.findViewById(R.id.textview10);
		textview11 = FoodViewActivity.this.findViewById(R.id.textview11);
		textview12 = FoodViewActivity.this.findViewById(R.id.textview12);
		textview13 = FoodViewActivity.this.findViewById(R.id.textview13);
		textview14 = FoodViewActivity.this.findViewById(R.id.textview14);
		textview15 = FoodViewActivity.this.findViewById(R.id.textview15);
		textview16 = FoodViewActivity.this.findViewById(R.id.textview16);
		textview17 = FoodViewActivity.this.findViewById(R.id.textview17);
		
		logoImageView.setOnClickListener(View _view -> {
			FoodViewActivity.this.finish();
		});
	}
	
	private void initializeLogic() {
		foodNameTextView.setText(getIntent().getStringExtra("name"));
		ingredientsContentTextView.setText(getIntent().getStringExtra("quantities"));
		preparationContentTextView.setText(getIntent().getStringExtra("Preparation and cooking method"));
		try {
			java.io.InputStream foodImageInput = getAssets().open(getIntent().getStringExtra("photo")); 
			Drawable foodImageDraw = Drawable.createFromStream(foodImageInput, null);
			foodImage.setImageDrawable(foodImageDraw);
			foodImageInput.close();
		} catch(java.io.IOException ex) {}
	}
	
}