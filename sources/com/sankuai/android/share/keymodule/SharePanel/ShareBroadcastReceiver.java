package com.sankuai.android.share.keymodule.SharePanel;

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
/* loaded from: classes3.dex */
public class ShareBroadcastReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;
    public WeakReference<Activity> b;

    public ShareBroadcastReceiver(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f309e670dff969d263c63b98b6a4961", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f309e670dff969d263c63b98b6a4961");
        } else {
            this.b = new WeakReference<>(activity);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c10102a0bc22adccdba74cb466f3ee4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c10102a0bc22adccdba74cb466f3ee4b");
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
        String a2 = intent.hasExtra("message") ? f.a(intent, "message") : "";
        boolean a3 = intent.hasExtra("showBottom") ? f.a(intent, "showBottom", false) : false;
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        new com.sankuai.meituan.android.ui.widget.a(activity, a2, -1).e(a3 ? 81 : 17).a(0, 0, 0, a3 ? com.sankuai.android.share.common.util.b.a(context, 50.0f) : 0).a();
    }
}
