package com.dianping.base.push.medusa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class d {
    public static ChangeQuickRedirect a;
    BroadcastReceiver b;

    public String a() {
        return "";
    }

    public abstract String b();

    public abstract String c();

    public void d() {
    }

    public abstract void e();

    public abstract void f();

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d86a8deb95b652b988fb353d25c7a2a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d86a8deb95b652b988fb353d25c7a2a0");
        } else {
            this.b = new BroadcastReceiver() { // from class: com.dianping.base.push.medusa.MedusaConfig$1
                public static ChangeQuickRedirect a;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Object[] objArr2 = {context, intent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4baeea55001236b20df9b5a830694bda", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4baeea55001236b20df9b5a830694bda");
                        return;
                    }
                    String action = intent.getAction();
                    com.dianping.base.push.pushservice.c.a("Medusa", "PushTokenReceiver onReceive, action: " + action);
                    if ("com.dianping.dpmtpush.RECEIVE_TOKEN".equals(action)) {
                        d.this.g();
                    }
                }
            };
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67899102f2baba496d04d953136a3612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67899102f2baba496d04d953136a3612");
            return;
        }
        b c = b.c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, c, changeQuickRedirect2, false, "939579cf4842b219e0b01c5d5e173ac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c, changeQuickRedirect2, false, "939579cf4842b219e0b01c5d5e173ac2");
            return;
        }
        com.dianping.base.push.pushservice.c.a("Medusa", "notifyDataChanged");
        if (c.b == null) {
            com.dianping.base.push.pushservice.c.d("Medusa", "medusa is not initialized!");
        } else if (c.c != null) {
            c.c.a(true);
        }
    }
}
