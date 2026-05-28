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
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;


public class SectionsActivity extends AppCompatActivity {
	
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	
	private LinearLayout linear3;
	private LinearLayout linear2;
	private GridView gridview1;
	private ImageView imageview1;
	private TextView textview1;
	private ImageView imageview2;
	
	private Intent i = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.sections);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear3 = SectionsActivity.this.findViewById(R.id.linear3);
		linear2 = SectionsActivity.this.findViewById(R.id.linear2);
		gridview1 = SectionsActivity.this.findViewById(R.id.gridview1);
		imageview1 = SectionsActivity.this.findViewById(R.id.imageview1);
		textview1 = SectionsActivity.this.findViewById(R.id.textview1);
		imageview2 = SectionsActivity.this.findViewById(R.id.imageview2);
		
		imageview1.setOnClickListener(View _view -> {
			SectionsActivity.this.finish();
		});
	}
	
	private void initializeLogic() {
		try{
			java.io.InputStream inputstream1 = getAssets().open("sections.json");
			listmap = new Gson().fromJson(SketchwareUtil.copyFromInputStream(inputstream1), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		}catch(Exception e){
			SketchwareUtil.showMessage(SectionsActivity.this.getApplicationContext(), e.getMessage());
		}
		gridview1.setAdapter(new Gridview1Adapter(listmap));
		gridview1.setNumColumns((int)2);
	}
	
	public void _asset_view_background(final View _vi, final String _dir) {
		try {
			java.io.InputStream _viInput = getAssets().open(_dir); 
			Drawable _viDraw = Drawable.createFromStream(_viInput, null);
			_vi.setBackgroundDrawable(_viDraw);
			_viInput.close();
		} catch(java.io.IOException ex) {}
		
		
	}
	
	public class Gridview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Gridview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.main_sec, null);
			}
			
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear13 = _view.findViewById(R.id.linear13);
			final TextView textview4 = _view.findViewById(R.id.textview4);
			
			textview4.setText(_data.get((int)_position).get("department").toString());
			textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/robotobold.ttf"), 0);
			cardview1.setOnClickListener(View _view -> {
				i.setClass(SectionsActivity.this.getApplicationContext(), FoodListActivity.class);
				i.putExtra("section", _data.get((int)_position).get("department-E ").toString());
				SectionsActivity.this.startActivity(i);
			});
			if (String.valueOf(_data.get((int)_position).get("department-E ").toString()).equals(String.valueOf("01_altabikh"))) {
				linear13.setBackgroundResource(R.drawable.rice);
			} else {
				
			}
			if (String.valueOf(_data.get((int)_position).get("department-E ").toString()).equals(String.valueOf("02_rice"))) {
				linear13.setBackgroundResource(R.drawable.rice);
			} else {
				
			}
			if (String.valueOf(_data.get((int)_position).get("department-E ").toString()).equals(String.valueOf("03_pasta"))) {
				linear13.setBackgroundResource(R.drawable.rice);
			} else {
				
			}
			if (String.valueOf(_data.get((int)_position).get("department-E ").toString()).equals(String.valueOf("01_altabikh"))) {
				linear13.setBackgroundResource(R.drawable.rice);
			} else {
				
			}
			if (String.valueOf(_data.get((int)_position).get("department-E ").toString()).equals(String.valueOf("02_rice"))) {
				linear13.setBackgroundResource(R.drawable.rice);
			} else {
				
			}
			if (String.valueOf(_data.get((int)_position).get("department-E ").toString()).equals(String.valueOf("03_pasta"))) {
				linear13.setBackgroundResource(R.drawable.rice);
			} else {
				
			}
			if (String.valueOf(_data.get((int)_position).get("department-E ").toString()).equals(String.valueOf("01_altabikh"))) {
				linear13.setBackgroundResource(R.drawable.rice);
			} else {
				
			}
			if (String.valueOf(_data.get((int)_position).get("department-E ").toString()).equals(String.valueOf("02_rice"))) {
				linear13.setBackgroundResource(R.drawable.rice);
			} else {
				
			}
			if (String.valueOf(_data.get((int)_position).get("department-E ").toString()).equals(String.valueOf("03_pasta"))) {
				linear13.setBackgroundResource(R.drawable.rice);
			} else {
				
			}
			if (String.valueOf(_data.get((int)_position).get("department-E ").toString()).equals(String.valueOf("01_altabikh"))) {
				linear13.setBackgroundResource(R.drawable.rice);
			} else {
				
			}
			if (String.valueOf(_data.get((int)_position).get("department-E ").toString()).equals(String.valueOf("02_rice"))) {
				linear13.setBackgroundResource(R.drawable.rice);
			} else {
				
			}
			if (String.valueOf(_data.get((int)_position).get("department-E ").toString()).equals(String.valueOf("03_pasta"))) {
				linear13.setBackgroundResource(R.drawable.rice);
			} else {
				
			}
			
			return _view;
		}
	}
}