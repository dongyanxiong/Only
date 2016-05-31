package com.liuguilin.only.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.liuguilin.only.R;

/**
 * 我的信息
 * Created by LGL on 2016/5/11.
 */
public class UserFragment extends Fragment {

    private ListView mListView;
    private String[] data = {"姓名：刘桂林", "性别：男", "生日：1995.10.05", "职业：Android工程师"};
    private ArrayAdapter<String> adapter ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, null);
        findView(view);
        return view;
    }

    /**
     * 初始化
     *
     * @param view
     */
    private void findView(View view) {
        mListView = (ListView) view.findViewById(R.id.mListView);
        adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,data);
        mListView.setAdapter(adapter);
    }
}
