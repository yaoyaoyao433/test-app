package com.sankuai.waimai.platform.domain.manager.ugc;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.meituan.android.mtplayer.video.h;
import com.meituan.android.mtplayer.video.l;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface IContentFeedListProvider {
    public static final int CONTENT_FEED_SCENE_BOTTOM_TAB = 2;
    public static final int CONTENT_FEED_SCENE_KINGKONG = 1;
    public static final String CONTENT_PICK_ME_KEY = "wm_content_pick_me";
    public static final String CONTENT_ROUTER_KEY = "wm_content";

    Class getContentFeedListFragmentClass();

    h getMediaPlayerManager(Fragment fragment);

    l getPlayerType(Fragment fragment);

    void onBubbleClicked(Fragment fragment);

    void onContentFeedFragmentCreate(Fragment fragment, int i);

    void onDestroy(Activity activity, Fragment fragment);

    void onTabClick(Fragment fragment, boolean z, Activity activity);

    void onTabExpose(Activity activity, String str);

    void reloadData(Fragment fragment, boolean z);
}
