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
import androidx.recyclerview.widget.*;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
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


public class FoodListActivity extends AppCompatActivity {
	
	private double i1 = 0;
	private double length = 0;
	private double number = 0;
	private String value = "";
	
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	private ArrayList<String> liststring = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmap2 = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private RecyclerView recyclerview1;
	private ImageView imageview1;
	private TextView textview1;
	private ImageView imageview2;
	
	private Intent i = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.food_list);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = FoodListActivity.this.findViewById(R.id.linear1);
		linear2 = FoodListActivity.this.findViewById(R.id.linear2);
		recyclerview1 = FoodListActivity.this.findViewById(R.id.recyclerview1);
		imageview1 = FoodListActivity.this.findViewById(R.id.imageview1);
		textview1 = FoodListActivity.this.findViewById(R.id.textview1);
		imageview2 = FoodListActivity.this.findViewById(R.id.imageview2);
		
		imageview1.setOnClickListener(View _view -> {
			FoodListActivity.this.finish();
		});
	}
	
	private void initializeLogic() {
		try{
			java.io.InputStream inputstream1 = getAssets().open("food3.json");
			listmap = new Gson().fromJson(SketchwareUtil.copyFromInputStream(inputstream1), new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
			_search_listmap_by_delete(listmap, "department-E", getIntent().getStringExtra("section"));
		}catch(Exception e){
			SketchwareUtil.showMessage(FoodListActivity.this.getApplicationContext(), e.getMessage());
		}
	}
	
	public void _search_listmap_by_delete(final ArrayList<HashMap<String, Object>> _listmap, final String _key, final String _word) {
		if ((_word != null ? _word.length() : 0) > 0) {
			length = _listmap.size();
			number = length - 1;
			for(int _repeat19 = 0; _repeat19 < (int)(length); _repeat19++) {
				value = _listmap.get((int)number).get(_key).toString();
				if ((value.toLowerCase() != null && _word.toLowerCase() != null && value.toLowerCase().contains(_word.toLowerCase()))) {
					
				} else {
					_listmap.remove((int)(number));
				}
				number--;
			}
		}
		recyclerview1.setAdapter(new Recyclerview1Adapter(_listmap));
		recyclerview1.setLayoutManager(new LinearLayoutManager(FoodListActivity.this));
	}
	
	public class Recyclerview1Adapter extends RecyclerView.Adapter<Recyclerview1Adapter.ViewHolder> {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Recyclerview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
			LayoutInflater _inflater = LayoutInflater.from(parent.getContext());
			View _v = _inflater.inflate(R.layout.custom, parent, false);
			RecyclerView.LayoutParams _lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
			_v.setLayoutParams(_lp);
			return new ViewHolder(_v);
		}
		
		@Override
		public void onBindViewHolder(ViewHolder _holder, final int _position) {
			View _view = _holder.itemView;
			
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final androidx.cardview.widget.CardView cardview6 = _view.findViewById(R.id.cardview6);
			final LinearLayout linear36 = _view.findViewById(R.id.linear36);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final TextView name = _view.findViewById(R.id.name);
			final TextView description = _view.findViewById(R.id.description);
			final LinearLayout linear37 = _view.findViewById(R.id.linear37);
			final TextView price = _view.findViewById(R.id.price);
			final View view38 = _view.findViewById(R.id.view38);
			final LinearLayout rating_container = _view.findViewById(R.id.rating_container);
			final ImageView imageview18 = _view.findViewById(R.id.imageview18);
			final TextView rating = _view.findViewById(R.id.rating);
			
			cardview1.setOnClickListener(View _view -> {
				i.setClass(FoodListActivity.this.getApplicationContext(), FoodViewActivity.class);
				i.putExtra("name", _data.get((int)_position).get("food name").toString());
				i.putExtra("quantities", _data.get((int)_position).get("quantities").toString());
				i.putExtra("Preparation and cooking method", _data.get((int)_position).get("preparation and cooking methods").toString());
				i.putExtra("photo", (String.valueOf("Photo") + String.valueOf((String.valueOf((String.valueOf("/") + String.valueOf(_data.get((int)_position).get("department-E").toString()))) + String.valueOf((String.valueOf("/") + String.valueOf(_data.get((int)_position).get("picture").toString())))))));
				FoodListActivity.this.startActivity(i);
			});
			name.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/robotobold.ttf"), 0);
			name.setText(_data.get((int)_position).get("food name").toString());
			try {
				java.io.InputStream imageview1Input = getAssets().open((String.valueOf("Photo") + String.valueOf((String.valueOf((String.valueOf("/") + String.valueOf(_data.get((int)_position).get("department-E").toString()))) + String.valueOf((String.valueOf("/") + String.valueOf(_data.get((int)_position).get("picture").toString()))))))); 
				Drawable imageview1Draw = Drawable.createFromStream(imageview1Input, null);
				imageview1.setImageDrawable(imageview1Draw);
				imageview1Input.close();
			} catch(java.io.IOException ex) {}
		}
		
		@Override
		public int getItemCount() {
			return _data.size();
		}
		
		public class ViewHolder extends RecyclerView.ViewHolder {
			public ViewHolder(View v) {
				super(v);
			}
		}
	}
}