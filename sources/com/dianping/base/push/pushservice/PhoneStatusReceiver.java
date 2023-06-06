package com.dianping.base.push.pushservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PhoneStatusReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;
    protected String b;

    public PhoneStatusReceiver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b722a03422496f08deda61163b6557b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b722a03422496f08deda61163b6557b1");
        } else {
            this.b = PhoneStatusReceiver.class.getSimpleName();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean z = false;
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e38b83b4dc93ecc77b10a32fd5c145c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e38b83b4dc93ecc77b10a32fd5c145c");
            return;
        }
        String str = this.b;
        StringBuilder sb = new StringBuilder("PhoneStatusReceiver:onReceive ");
        sb.append(intent == null ? "" : intent.getAction());
        c.a(str, sb.toString());
        NetworkInfo networkInfo = null;
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception e) {
            c.d(this.b, e.toString());
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            z = true;
        }
        if (Build.VERSION.SDK_INT < 26) {
            if (z) {
                f.a(context, intent.getAction());
            } else {
                f.c(context);
            }
        }
    }
}
