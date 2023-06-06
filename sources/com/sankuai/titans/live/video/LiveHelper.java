package com.sankuai.titans.live.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.live.video.rtc.IRTC;
import com.sankuai.titans.live.video.rtc.RTCFragment;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class LiveHelper {
    public static final String KEY_WEB_URL = "KEY_WEB_URL";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static IRTC getRTC(Context context) {
        RTCFragment rTCFragment;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "589c91fbcf51df24cf1a3cf1ae19effb", RobustBitConfig.DEFAULT_VALUE)) {
            return (IRTC) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "589c91fbcf51df24cf1a3cf1ae19effb");
        }
        if (!(context instanceof VideoLiveActivity) || (rTCFragment = (RTCFragment) ((VideoLiveActivity) context).getSupportFragmentManager().findFragmentByTag(RTCFragment.class.getName())) == null) {
            return null;
        }
        return rTCFragment.getIRTC();
    }

    public static void toVideoLive(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c4ff857f87f65cd7fd41516f29d7801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c4ff857f87f65cd7fd41516f29d7801");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(KEY_WEB_URL, str);
        intent.setPackage(activity.getPackageName());
        intent.setAction("com.sankuai.titans.live.video");
        activity.startActivity(intent);
    }
}
