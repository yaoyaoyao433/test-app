package com.sankuai.waimai.mach.manager_new.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.common.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class h {
    public static ChangeQuickRedirect a;
    private static volatile h b;
    private static volatile boolean c;
    private int d;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e49dc251cce5f6e811fb2a65117590ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e49dc251cce5f6e811fb2a65117590ca");
            return;
        }
        this.d = com.sankuai.waimai.mach.utils.f.a(i.a().c);
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            i.a().c.registerReceiver(new a(), intentFilter);
            c = true;
        } catch (Exception e) {
            c.b("registerReceiver | " + e.getMessage());
        }
    }

    public static h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f805cba603673c07bbdc19835d0bf7d", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f805cba603673c07bbdc19835d0bf7d");
        }
        if (b == null) {
            synchronized (h.class) {
                if (b == null) {
                    b = new h();
                }
            }
        }
        return b;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6b12467d808e2e8d6e06cf5cc7d7788", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6b12467d808e2e8d6e06cf5cc7d7788");
        }
        switch (c ? this.d : com.sankuai.waimai.mach.utils.f.a(i.a().c)) {
            case 1:
                return "WIFI";
            case 2:
                return "2G";
            case 3:
                return "3G";
            case 4:
                return "4G";
            default:
                return "Unknown";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58ec60a76a5034a0bbdec9fdb1786b83", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58ec60a76a5034a0bbdec9fdb1786b83");
            } else {
                h.this.d = com.sankuai.waimai.mach.utils.f.a(context);
            }
        }
    }
}
