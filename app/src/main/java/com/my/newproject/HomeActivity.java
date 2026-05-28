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
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.card.*;
import com.google.android.material.imageview.ShapeableImageView;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;


public class HomeActivity extends AppCompatActivity {
	
	private ArrayList<String> liststring = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	
	private CoordinatorLayout coordinator_layout17;
	private NestedScrollView vscroll2;
	private BottomNavigationView bottomNavigation;
	private LinearLayout bg;
	private LinearLayout topBarLayout;
	private TextView mainHeaderText;
	private MaterialCardView searchCardView;
	private LinearLayout categoriesSectionHeader;
	private HorizontalScrollView categoriesHorizontalScroll;
	private LinearLayout recentSectionHeader;
	private LinearLayout recentItemsContainer;
	private ImageView menuIcon;
	private View view18;
	private ShapeableImageView profileImage;
	private LinearLayout linear19;
	private ImageView searchIcon;
	private EditText searchEditText;
	private TextView categoriesViewMore;
	private TextView categoriesTitle;
	private LinearLayout linear20;
	private MaterialCardView riceCardView;
	private MaterialCardView meatCardView;
	private MaterialCardView dessertsCardView;
	private MaterialCardView pastryCardView;
	private FrameLayout frame_layout21;
	private ImageView imageview9;
	private View view22;
	private TextView textview9;
	private FrameLayout frame_layout23;
	private ImageView imageview10;
	private View view24;
	private TextView textview10;
	private FrameLayout frame_layout25;
	private ImageView imageview11;
	private View view26;
	private TextView textview11;
	private FrameLayout frame_layout27;
	private ImageView imageview12;
	private View view28;
	private TextView textview12;
	private TextView recentViewMore;
	private TextView recentTitle;
	private MaterialCardView recentItem1;
	private MaterialCardView recentItem2;
	private LinearLayout linear29;
	private MaterialCardView cardview3;
	private LinearLayout linear30;
	private ImageView imageview14;
	private ImageView imageview13;
	private TextView textview13;
	private TextView textview14;
	private LinearLayout linear31;
	private MaterialCardView cardview4;
	private LinearLayout linear32;
	private ImageView imageview16;
	private ImageView imageview15;
	private TextView textview15;
	private TextView textview16;
	
	private Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		coordinator_layout17 = HomeActivity.this.findViewById(R.id.coordinator_layout17);
		vscroll2 = HomeActivity.this.findViewById(R.id.vscroll2);
		bottomNavigation = HomeActivity.this.findViewById(R.id.bottomNavigation);
		bg = HomeActivity.this.findViewById(R.id.bg);
		topBarLayout = HomeActivity.this.findViewById(R.id.topBarLayout);
		mainHeaderText = HomeActivity.this.findViewById(R.id.mainHeaderText);
		searchCardView = HomeActivity.this.findViewById(R.id.searchCardView);
		categoriesSectionHeader = HomeActivity.this.findViewById(R.id.categoriesSectionHeader);
		categoriesHorizontalScroll = HomeActivity.this.findViewById(R.id.categoriesHorizontalScroll);
		recentSectionHeader = HomeActivity.this.findViewById(R.id.recentSectionHeader);
		recentItemsContainer = HomeActivity.this.findViewById(R.id.recentItemsContainer);
		menuIcon = HomeActivity.this.findViewById(R.id.menuIcon);
		view18 = HomeActivity.this.findViewById(R.id.view18);
		profileImage = HomeActivity.this.findViewById(R.id.profileImage);
		linear19 = HomeActivity.this.findViewById(R.id.linear19);
		searchIcon = HomeActivity.this.findViewById(R.id.searchIcon);
		searchEditText = HomeActivity.this.findViewById(R.id.searchEditText);
		categoriesViewMore = HomeActivity.this.findViewById(R.id.categoriesViewMore);
		categoriesTitle = HomeActivity.this.findViewById(R.id.categoriesTitle);
		linear20 = HomeActivity.this.findViewById(R.id.linear20);
		riceCardView = HomeActivity.this.findViewById(R.id.riceCardView);
		meatCardView = HomeActivity.this.findViewById(R.id.meatCardView);
		dessertsCardView = HomeActivity.this.findViewById(R.id.dessertsCardView);
		pastryCardView = HomeActivity.this.findViewById(R.id.pastryCardView);
		frame_layout21 = HomeActivity.this.findViewById(R.id.frame_layout21);
		imageview9 = HomeActivity.this.findViewById(R.id.imageview9);
		view22 = HomeActivity.this.findViewById(R.id.view22);
		textview9 = HomeActivity.this.findViewById(R.id.textview9);
		frame_layout23 = HomeActivity.this.findViewById(R.id.frame_layout23);
		imageview10 = HomeActivity.this.findViewById(R.id.imageview10);
		view24 = HomeActivity.this.findViewById(R.id.view24);
		textview10 = HomeActivity.this.findViewById(R.id.textview10);
		frame_layout25 = HomeActivity.this.findViewById(R.id.frame_layout25);
		imageview11 = HomeActivity.this.findViewById(R.id.imageview11);
		view26 = HomeActivity.this.findViewById(R.id.view26);
		textview11 = HomeActivity.this.findViewById(R.id.textview11);
		frame_layout27 = HomeActivity.this.findViewById(R.id.frame_layout27);
		imageview12 = HomeActivity.this.findViewById(R.id.imageview12);
		view28 = HomeActivity.this.findViewById(R.id.view28);
		textview12 = HomeActivity.this.findViewById(R.id.textview12);
		recentViewMore = HomeActivity.this.findViewById(R.id.recentViewMore);
		recentTitle = HomeActivity.this.findViewById(R.id.recentTitle);
		recentItem1 = HomeActivity.this.findViewById(R.id.recentItem1);
		recentItem2 = HomeActivity.this.findViewById(R.id.recentItem2);
		linear29 = HomeActivity.this.findViewById(R.id.linear29);
		cardview3 = HomeActivity.this.findViewById(R.id.cardview3);
		linear30 = HomeActivity.this.findViewById(R.id.linear30);
		imageview14 = HomeActivity.this.findViewById(R.id.imageview14);
		imageview13 = HomeActivity.this.findViewById(R.id.imageview13);
		textview13 = HomeActivity.this.findViewById(R.id.textview13);
		textview14 = HomeActivity.this.findViewById(R.id.textview14);
		linear31 = HomeActivity.this.findViewById(R.id.linear31);
		cardview4 = HomeActivity.this.findViewById(R.id.cardview4);
		linear32 = HomeActivity.this.findViewById(R.id.linear32);
		imageview16 = HomeActivity.this.findViewById(R.id.imageview16);
		imageview15 = HomeActivity.this.findViewById(R.id.imageview15);
		textview15 = HomeActivity.this.findViewById(R.id.textview15);
		textview16 = HomeActivity.this.findViewById(R.id.textview16);
		
		categoriesSectionHeader.setOnClickListener((View _view) -> {
			intent.setClass(HomeActivity.this.getApplicationContext(), SectionsActivity.class);
			HomeActivity.this.startActivity(intent);
		});
		
		imageview9.setOnClickListener((View _view) -> {
			intent.setClass(HomeActivity.this.getApplicationContext(), FoodListActivity.class);
			intent.putExtra("section", "02_rice");
			HomeActivity.this.startActivity(intent);
		});
		
		imageview11.setOnClickListener((View _view) -> {
			intent.setClass(HomeActivity.this.getApplicationContext(), FoodListActivity.class);
			intent.putExtra("section", "10_foreign_sweets");
			HomeActivity.this.startActivity(intent);
		});
	}
	
	private void initializeLogic() {
	}
	
}