package com.dianping.nvnetwork.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private Context b;
    private ConnectivityManager c;
    private MtTelephonyManager d;

    public j(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58626e287f0ddc68119ad170a4db6eab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58626e287f0ddc68119ad170a4db6eab");
        } else {
            this.b = context;
        }
    }

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e38f6808f44b2170191fba3ad4e47dc9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e38f6808f44b2170191fba3ad4e47dc9")).booleanValue();
        }
        if (context != null) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isAvailable();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private ConnectivityManager c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7ffcea4cb41d75d7c258f37b78fb473", 6917529027641081856L)) {
            return (ConnectivityManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7ffcea4cb41d75d7c258f37b78fb473");
        }
        if (this.c == null) {
            try {
                this.c = (ConnectivityManager) this.b.getSystemService("connectivity");
            } catch (Exception e) {
                g.a("network", "cannot get connectivity manager, maybe the permission is missing in AndroidManifest.xml?", e);
            }
        }
        return this.c;
    }

    private MtTelephonyManager d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cffb46a539d0dc59b7a205ec9c510ec7", 6917529027641081856L)) {
            return (MtTelephonyManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cffb46a539d0dc59b7a205ec9c510ec7");
        }
        if (this.d == null) {
            try {
                this.d = Privacy.createTelephonyManager(this.b, "jcyf-b0be16ca63b0ef3a");
            } catch (Exception e) {
                g.a("network", "cannot get telephony manager, maybe the permission is missing in AndroidManifest.xml?", e);
            }
        }
        return this.d;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02ed23f4253a9e31c1e3ef462abe4e30", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02ed23f4253a9e31c1e3ef462abe4e30");
        }
        if (b() == 0) {
            return "unknown";
        }
        if (b() == 1) {
            return "wifi";
        }
        MtTelephonyManager d = d();
        return d != null ? String.valueOf(d.getNetworkType()) : "unknown";
    }

    public final int b() {
        NetworkInfo activeNetworkInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce1f62c7f50c028c62c496627f802854", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce1f62c7f50c028c62c496627f802854")).intValue();
        }
        if (com.dianping.nvnetwork.h.h().ao) {
            return 1;
        }
        ConnectivityManager c = c();
        if (c == null) {
            return 0;
        }
        try {
            activeNetworkInfo = c.getActiveNetworkInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (activeNetworkInfo == null) {
            return 0;
        }
        switch (activeNetworkInfo.getType()) {
            case 0:
                MtTelephonyManager d = d();
                int networkType = d != null ? d.getNetworkType() : 0;
                if (networkType == 0) {
                    networkType = activeNetworkInfo.getSubtype();
                }
                switch (networkType) {
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
            case 1:
                return 1;
        }
        return 0;
    }
}
