package com.sankuai.waimai.bussiness.order;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.meituan.android.recce.props.gens.IsShow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a52d02c29f5a93b45c2378f32cbe1cb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a52d02c29f5a93b45c2378f32cbe1cb1");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cs_floating_status_action");
        intent.putExtra(IsShow.LOWER_CASE_NAME, true);
        intent.putExtra("type", "im");
        LocalBroadcastManager.getInstance(activity).sendBroadcast(intent);
    }

    public static void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e46fa58261dd494bf79de48de18961dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e46fa58261dd494bf79de48de18961dd");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cs_floating_status_action");
        intent.putExtra(IsShow.LOWER_CASE_NAME, false);
        intent.putExtra("type", "im");
        LocalBroadcastManager.getInstance(activity).sendBroadcast(intent);
    }
}
