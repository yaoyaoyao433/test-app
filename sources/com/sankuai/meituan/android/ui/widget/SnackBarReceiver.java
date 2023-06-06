package com.sankuai.meituan.android.ui.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SnackBarReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;
    public WeakReference<Activity> b;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29b55a2109dda41da6a6b2cfd92f3b75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29b55a2109dda41da6a6b2cfd92f3b75");
            return;
        }
        Activity activity = this.b.get();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        LocalBroadcastManager.getInstance(activity).unregisterReceiver(this);
        if (intent == null) {
            return;
        }
        String a2 = f.a(intent, "message");
        boolean a3 = f.a(intent, "showBottom", false);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        a.a(activity, a2, -1).e(a3 ? 81 : 17).a(0, 0, 0, a3 ? a.a(activity, 50.0f) : 0).a();
    }
}
