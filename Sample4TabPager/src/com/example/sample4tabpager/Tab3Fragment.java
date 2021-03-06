package com.example.sample4tabpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class Tab3Fragment extends PagerFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Toast.makeText(getActivity(), "Tab3 onCreate", Toast.LENGTH_SHORT).show();
		setHasOptionsMenu(true);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.tab3_layout, container, false);
		Toast.makeText(getActivity(), "Tab3 onCreateView", Toast.LENGTH_SHORT).show();
		return v;
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		super.onCreateOptionsMenu(menu, inflater);
		inflater.inflate(R.menu.tab3_menu, menu);
	}
	@Override
	public void onPageCurrent() {
		super.onPageCurrent();
		getActivity().setTitle("Tab3Fragment");
	}
}
