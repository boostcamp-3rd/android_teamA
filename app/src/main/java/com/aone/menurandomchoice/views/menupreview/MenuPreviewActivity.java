package com.aone.menurandomchoice.views.menupreview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.aone.menurandomchoice.R;
import com.aone.menurandomchoice.repository.model.MenuDetail;
import com.aone.menurandomchoice.utils.GlideUtil;

public class MenuPreviewActivity extends AppCompatActivity {

    public static final String EXTRA_MENU_DETAIL_ITEM = "EXTRA_MENU_DETAIL_ITEM";

    /**
     * 이 코드들은 단순 확인을 위한 샘플코드입니다.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_preview);

        View view = findViewById(R.id.preview_item_layout);
        ImageView iv = view.findViewById(R.id.item_menu_select_iv);
        TextView title = view.findViewById(R.id.item_menu_select_title_tv);
        TextView guide = view.findViewById(R.id.item_menu_select_guide_tv);
        TextView price = view.findViewById(R.id.item_menu_select_price_tv);
        TextView category = view.findViewById(R.id.item_menu_select_category_tv);

        Intent intent = getIntent();
        MenuDetail menuDetail = intent.getParcelableExtra(EXTRA_MENU_DETAIL_ITEM);
        GlideUtil.loadImageWithSkipCache(iv, menuDetail.getPhotoUrl());
        title.setText(menuDetail.getName());
        guide.setText(menuDetail.getDescription());
        price.setText(menuDetail.getPrice()+"");
        category.setText(menuDetail.getCategory()+"");
    }
}
