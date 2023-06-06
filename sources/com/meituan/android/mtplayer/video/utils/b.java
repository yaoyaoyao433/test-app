package com.meituan.android.mtplayer.video.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static volatile b b;
    private Context c;
    private EnumC0300b d;
    private CopyOnWriteArrayList<Object> e;
    private Handler f;
    private Runnable g;
    private Runnable h;
    private boolean i;

    public static /* synthetic */ void a(b bVar, a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "213a94dd1861d4696d374d69cdb55cb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "213a94dd1861d4696d374d69cdb55cb2");
        } else if (bVar.e != null) {
            Iterator<Object> it = bVar.e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public static synchronized b a(Context context) {
        synchronized (b.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf12e0f7de5b4e6b6005a882d8d8bf74", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf12e0f7de5b4e6b6005a882d8d8bf74");
            }
            if (b == null) {
                synchronized (b.class) {
                    if (b == null) {
                        b = new b(context.getApplicationContext());
                    }
                }
            }
            return b;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mtplayer.video.utils.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0300b {
        NONE,
        WIFI,
        MOBILE;
        
        public static ChangeQuickRedirect a;

        EnumC0300b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "112adfab705fa3fb17e11567d38d9fac", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "112adfab705fa3fb17e11567d38d9fac");
            }
        }

        public static EnumC0300b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7049931771c4c5a692c9653fa07155fe", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0300b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7049931771c4c5a692c9653fa07155fe") : (EnumC0300b) Enum.valueOf(EnumC0300b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0300b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0778e762bffef7247a23619ecb83c497", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0300b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0778e762bffef7247a23619ecb83c497") : (EnumC0300b[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        EV_CONNECT_WIFI,
        EV_CONNECT_MOBILE,
        EV_MOBILE_TO_WIFI,
        EV_WIFI_TO_MOBILE,
        EV_DISCONNECT_WIFI,
        EV_DISCONNECT_MOBILE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b18ffb63826668a5469c01111d6411d2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b18ffb63826668a5469c01111d6411d2");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "daa72ddeaf48e50ff5d3a5e16b71222b", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "daa72ddeaf48e50ff5d3a5e16b71222b") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c700ccc704fdad66c14690a8f448bef9", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c700ccc704fdad66c14690a8f448bef9") : (a[]) values().clone();
        }
    }

    private b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a10c8af824c2f473a3c30c8562d885", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a10c8af824c2f473a3c30c8562d885");
            return;
        }
        this.e = new CopyOnWriteArrayList<>();
        this.f = new Handler(Looper.getMainLooper());
        this.g = new Runnable() { // from class: com.meituan.android.mtplayer.video.utils.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8b12729aca6791b317a6e12f76b8856a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8b12729aca6791b317a6e12f76b8856a");
                    return;
                }
                b.a(b.this, a.EV_DISCONNECT_WIFI);
                b.this.d = EnumC0300b.NONE;
            }
        };
        this.h = new Runnable() { // from class: com.meituan.android.mtplayer.video.utils.b.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "147463ae2a5d53655e793327e66ae9a2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "147463ae2a5d53655e793327e66ae9a2");
                    return;
                }
                b.a(b.this, a.EV_DISCONNECT_MOBILE);
                b.this.d = EnumC0300b.NONE;
            }
        };
        this.i = false;
        this.c = context.getApplicationContext();
        this.d = a();
    }

    public final EnumC0300b a() {
        ConnectivityManager connectivityManager;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1368b64619f8eaf7b27554fbb15bee5", RobustBitConfig.DEFAULT_VALUE)) {
            return (EnumC0300b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1368b64619f8eaf7b27554fbb15bee5");
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b56eb62cdc6323ac189d3c7f01428eb", RobustBitConfig.DEFAULT_VALUE)) {
                connectivityManager = (ConnectivityManager) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b56eb62cdc6323ac189d3c7f01428eb");
            } else {
                connectivityManager = this.c == null ? null : (ConnectivityManager) this.c.getSystemService("connectivity");
            }
        } catch (Throwable unused) {
        }
        if (connectivityManager == null) {
            return EnumC0300b.NONE;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && !activeNetworkInfo.isRoaming()) {
            switch (activeNetworkInfo.getType()) {
                case 0:
                    return EnumC0300b.MOBILE;
                case 1:
                    return EnumC0300b.WIFI;
                default:
                    return EnumC0300b.NONE;
            }
        }
        return EnumC0300b.NONE;
    }
}
