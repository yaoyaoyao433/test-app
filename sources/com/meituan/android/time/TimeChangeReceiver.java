package com.meituan.android.time;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TimeChangeReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb8efb1164fca77c6f4b8c366ec1fda0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb8efb1164fca77c6f4b8c366ec1fda0");
        } else if (context == null) {
        } else {
            q.a(context, "mtplatform_sntpclock", 2).b("time_offset");
            c.a(context);
        }
    }
}
