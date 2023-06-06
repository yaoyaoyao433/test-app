package com.dianping.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NetworkConnectChangedReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ae89ea614ebe236df8129c94d9a1a68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ae89ea614ebe236df8129c94d9a1a68");
        } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            g.b = false;
        }
    }
}
