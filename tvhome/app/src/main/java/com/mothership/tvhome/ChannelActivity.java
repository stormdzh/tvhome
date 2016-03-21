package com.mothership.tvhome;

import android.os.Bundle;

import com.tv.ui.metro.model.DisplayItem;
import com.video.ui.loader.video.GenericAlbumLoader;

/**
 * Created by liuhuadonbg on 3/21/16.
 */
public class ChannelActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //please override this fun
    protected void createTabsLoader() {
        if(item == null){
            item = new DisplayItem();
            item.ns    = "home";
            item.type  = "album";
            item.title = "home";
        }

        mLoader = GenericAlbumLoader.generateTabsLoader(getBaseContext(), item);
    }
}
