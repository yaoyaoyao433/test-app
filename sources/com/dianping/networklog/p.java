package com.dianping.networklog;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import com.dianping.networklog.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class p extends BroadcastReceiver {
    public static ChangeQuickRedirect a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18ce9127fe7eb132e703352ead13db07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18ce9127fe7eb132e703352ead13db07");
        } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            final h hVar = new h(context);
            Executor a2 = com.sankuai.android.jarvis.c.a();
            Object[] objArr2 = {hVar, a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c93d2e4e218516b523e1d5e1cb8e7c7e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c93d2e4e218516b523e1d5e1cb8e7c7e");
            } else {
                com.sankuai.waimai.launcher.util.aop.b.a(a2, new Runnable() { // from class: com.dianping.networklog.p.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8eb3fe998d1d16d61f28cb68d007cabf", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8eb3fe998d1d16d61f28cb68d007cabf");
                            return;
                        }
                        try {
                            NetworkInfo a3 = hVar.a();
                            if (a3 == null || !a3.isConnected()) {
                                return;
                            }
                            for (ae aeVar : ai.a.a.a()) {
                                c.a(aeVar.e, aeVar.c, aeVar.b, aeVar.d, aeVar.g, true, aeVar.f, aeVar.j);
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        }
    }
}
