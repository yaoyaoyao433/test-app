package com.dianping.monitor;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private static ConnectivityManager d;
    private static MtTelephonyManager e;
    private static NetworkInfo f;
    private static int g;
    private static AtomicBoolean i = new AtomicBoolean(false);
    private final Context c;
    private boolean h;

    public g(Context context) {
        AtomicBoolean atomicBoolean;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f402fdc177c7681d469823fa1653edfa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f402fdc177c7681d469823fa1653edfa");
            return;
        }
        this.c = context;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f4be4e493f875d89e10c2ca336e93a1d", 6917529027641081856L)) {
            atomicBoolean = (AtomicBoolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f4be4e493f875d89e10c2ca336e93a1d");
        } else {
            if (context != null && i.compareAndSet(false, true)) {
                b(context.getApplicationContext());
            }
            atomicBoolean = i;
        }
        this.h = atomicBoolean.get();
    }

    public final boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fe5813472a22317bec5a63981ba6164", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fe5813472a22317bec5a63981ba6164")).booleanValue();
        }
        NetworkInfo d2 = d();
        return d2 != null && d2.isAvailable();
    }

    private ConnectivityManager b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c207fe9b51f501d1a073b6ed31b9a4cc", 6917529027641081856L)) {
            return (ConnectivityManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c207fe9b51f501d1a073b6ed31b9a4cc");
        }
        if (d == null) {
            try {
                d = (ConnectivityManager) this.c.getSystemService("connectivity");
            } catch (Exception unused) {
            }
        }
        return d;
    }

    private MtTelephonyManager c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf44bbac910a035543b771c591bc029", 6917529027641081856L)) {
            return (MtTelephonyManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf44bbac910a035543b771c591bc029");
        }
        if (e == null) {
            try {
                e = Privacy.createTelephonyManager(this.c, "jcyf-b0be16ca63b0ef3a");
            } catch (Exception unused) {
            }
        }
        return e;
    }

    private NetworkInfo d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd2d663d8d3d4c52746e41c9b99bf2e2", 6917529027641081856L)) {
            return (NetworkInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd2d663d8d3d4c52746e41c9b99bf2e2");
        }
        if (b && f != null) {
            return f;
        }
        f = b().getActiveNetworkInfo();
        MtTelephonyManager c = c();
        if (c != null) {
            g = c.getNetworkType();
        }
        if (com.dianping.monitor.impl.a.DEBUG) {
            new StringBuilder("networkTypeCache:").append(g);
        }
        if (this.h) {
            b = true;
        }
        return f;
    }

    public final int a() {
        NetworkInfo d2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d211ceb83a3ff3ac15572d5417af1c69", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d211ceb83a3ff3ac15572d5417af1c69")).intValue();
        }
        if (b() == null) {
            return 0;
        }
        try {
            d2 = d();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (d2 == null) {
            return 0;
        }
        switch (d2.getType()) {
            case 0:
                int i2 = g;
                if (i2 != 20) {
                    switch (i2) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return 2;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return 3;
                        case 13:
                            return 4;
                    }
                }
                return 5;
            case 1:
                return 1;
        }
        return 0;
    }

    private static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c6aba961aed2fe28eae98b8f7e1864c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c6aba961aed2fe28eae98b8f7e1864c");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            context.registerReceiver(new NetworkConnectChangedReceiver(), intentFilter);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
