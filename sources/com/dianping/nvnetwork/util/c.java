package com.dianping.nvnetwork.util;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static ConnectivityManager d;
    private static boolean g;
    private static Object h;
    private static final Handler b = new Handler(Looper.getMainLooper());
    private static final Set<b> c = new CopyOnWriteArraySet();
    private static int e = -1;
    private static int f = -1;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public int b;
        public boolean c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        void a(int i, int i2, boolean z);
    }

    public static /* synthetic */ void a(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35d3ce67cb5b7f85c92de491bdfc05c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35d3ce67cb5b7f85c92de491bdfc05c2");
            return;
        }
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.dianping.nvnetwork.util.ConnectStateUtil$3
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context2, Intent intent) {
                Object[] objArr2 = {context2, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3013213ed835a367fce4123e6b5891a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3013213ed835a367fce4123e6b5891a");
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    c.b(context);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(broadcastReceiver, intentFilter);
        h = broadcastReceiver;
    }

    public static /* synthetic */ void b(Context context) {
        int i;
        NetworkInfo activeNetworkInfo;
        boolean z = false;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e291098d24de11ba9f19fd83d0b3334", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e291098d24de11ba9f19fd83d0b3334");
            return;
        }
        int i2 = -1;
        try {
            ConnectivityManager d2 = d(context);
            if (d2 == null || (activeNetworkInfo = d2.getActiveNetworkInfo()) == null) {
                i = -1;
            } else {
                int type = activeNetworkInfo.getType();
                try {
                    i = activeNetworkInfo.getSubtype();
                } catch (Exception e2) {
                    e = e2;
                    i2 = type;
                    i = -1;
                    g.b("NetworkStateUtil", "updateAndSendConnectionType", e);
                    b(i2, i, z);
                }
                try {
                    z = activeNetworkInfo.isConnected();
                    i2 = type;
                } catch (Exception e3) {
                    e = e3;
                    i2 = type;
                    g.b("NetworkStateUtil", "updateAndSendConnectionType", e);
                    b(i2, i, z);
                }
            }
        } catch (Exception e4) {
            e = e4;
        }
        b(i2, i, z);
    }

    public static void a(@NonNull Context context, @NonNull String str, b bVar) {
        Object[] objArr = {context, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d58e66e1c2d3f64c03e1792418cb02c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d58e66e1c2d3f64c03e1792418cb02c");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            c.add(bVar);
            if (h == null) {
                synchronized (c.class) {
                    if (h == null) {
                        final Context applicationContext = context.getApplicationContext();
                        Object[] objArr2 = {applicationContext};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0cf8845cebf84c94c28d8d983e8d3546", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0cf8845cebf84c94c28d8d983e8d3546");
                        } else {
                            c();
                            if (Build.VERSION.SDK_INT >= 24) {
                                e(applicationContext);
                            } else {
                                b.post(new Runnable() { // from class: com.dianping.nvnetwork.util.c.1
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "07c0f03e80d85ce0a64ff6ceb605dd93", 6917529027641081856L)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "07c0f03e80d85ce0a64ff6ceb605dd93");
                                            return;
                                        }
                                        try {
                                            if (c.h == null) {
                                                c.a(applicationContext);
                                            }
                                        } catch (Throwable th) {
                                            g.b("NetworkStateUtil", "registerNetworkCallback", th);
                                        }
                                    }
                                });
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ConnectivityManager d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46a1f8bd60f0f3ccb2ee8bbd19add20e", 6917529027641081856L)) {
            return (ConnectivityManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46a1f8bd60f0f3ccb2ee8bbd19add20e");
        }
        if (d == null && context != null) {
            synchronized (c.class) {
                if (d == null) {
                    try {
                        d = (ConnectivityManager) context.getSystemService("connectivity");
                    } catch (Exception e2) {
                        g.b("NetworkStateUtil", "getConnectivityManager", e2);
                    }
                }
            }
        }
        return d;
    }

    private static void c() {
        NetworkInfo activeNetworkInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87272aec008c724e986594fd888b1baa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87272aec008c724e986594fd888b1baa");
        } else if (e == -1) {
            try {
                ConnectivityManager d2 = d(com.dianping.nvnetwork.g.b());
                if (d2 == null || (activeNetworkInfo = d2.getActiveNetworkInfo()) == null) {
                    return;
                }
                e = activeNetworkInfo.getType();
                f = activeNetworkInfo.getSubtype();
                g = activeNetworkInfo.isConnected();
                com.dianping.nvtunnelkit.logger.b.b("NetworkStateUtil", "mConnectionType = " + e + ", subNetworkType = " + f + ", isConnected = " + g);
            } catch (Exception e2) {
                g.b("NetworkStateUtil", "init", e2);
            }
        }
    }

    @TargetApi(24)
    private static void e(@NonNull final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dcfe34b89519db988d7c381d03d1951", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dcfe34b89519db988d7c381d03d1951");
            return;
        }
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.dianping.nvnetwork.util.c.2
            public static ChangeQuickRedirect a;
            private Network c;
            private NetworkCapabilities d;

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                Object[] objArr2 = {network};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ba560a26c12e21c3bf8bba8e518dc78", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ba560a26c12e21c3bf8bba8e518dc78");
                    return;
                }
                try {
                    this.c = network;
                    this.d = c.d(context).getNetworkCapabilities(network);
                    a();
                } catch (Exception e2) {
                    g.b("NetworkStateUtil", "onAvailable", e2);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLosing(Network network, int i) {
                Object[] objArr2 = {network, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9f98b355602b44e0b2c15f2400b5983", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9f98b355602b44e0b2c15f2400b5983");
                    return;
                }
                try {
                    this.c = network;
                    this.d = c.d(context).getNetworkCapabilities(network);
                    a();
                } catch (Exception e2) {
                    g.b("NetworkStateUtil", "onLosing", e2);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                Object[] objArr2 = {network};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67daf443c9c086be82760ae64b9c1bd9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67daf443c9c086be82760ae64b9c1bd9");
                    return;
                }
                this.c = null;
                this.d = null;
                a();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onUnavailable() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b18775453b6fb287861c859077232add", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b18775453b6fb287861c859077232add");
                    return;
                }
                this.c = null;
                this.d = null;
                a();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                Object[] objArr2 = {network, networkCapabilities};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a63b2a70c2c3ea645b732c24cc6e6db", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a63b2a70c2c3ea645b732c24cc6e6db");
                    return;
                }
                this.c = network;
                this.d = networkCapabilities;
                a();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                Object[] objArr2 = {network, linkProperties};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3ee4c0649f4555c18caab751db6803f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3ee4c0649f4555c18caab751db6803f");
                    return;
                }
                try {
                    if (this.c != null) {
                        this.c = network;
                        this.d = c.d(context).getNetworkCapabilities(network);
                    }
                    a();
                } catch (Exception e2) {
                    g.b("NetworkStateUtil", "onLinkPropertiesChanged", e2);
                }
            }

            private void a() {
                int i;
                boolean z;
                int i2;
                boolean z2;
                boolean z3 = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d9d5d374277ada0dffb4c03c26e1c28", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d9d5d374277ada0dffb4c03c26e1c28");
                    return;
                }
                if (this.d != null) {
                    NetworkInfo networkInfo = null;
                    if (this.d.hasTransport(2)) {
                        i2 = 7;
                    } else if (this.d.hasTransport(0)) {
                        i2 = 0;
                    } else if (this.d.hasTransport(3)) {
                        i2 = 9;
                    } else if (this.d.hasTransport(1)) {
                        i2 = 1;
                    } else {
                        i2 = this.d.hasTransport(4) ? 17 : -1;
                    }
                    if (this.c != null) {
                        try {
                            networkInfo = c.d(context).getNetworkInfo(this.c);
                        } catch (Exception e2) {
                            g.b("NetworkStateUtil", "registerStateChangeCallback", e2);
                        }
                    }
                    r2 = networkInfo != null ? networkInfo.getSubtype() : -1;
                    if (Build.VERSION.SDK_INT >= 28) {
                        z2 = !this.d.hasCapability(21);
                    } else {
                        z2 = (this.c == null || networkInfo == null || networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED)) ? false : true;
                    }
                    if (this.d.hasCapability(12) && this.d.hasCapability(16) && !z2) {
                        z3 = true;
                    }
                    z = z3;
                    i = r2;
                    r2 = i2;
                } else {
                    i = -1;
                    z = false;
                }
                c.b(r2, i, z);
            }
        };
        try {
            ConnectivityManager d2 = d(context);
            if (d2 != null) {
                d2.registerDefaultNetworkCallback(networkCallback);
                h = networkCallback;
            }
        } catch (Throwable th) {
            g.b("NetworkStateUtil", "registerStateChangeCallback", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i, int i2, boolean z) {
        boolean z2 = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d13510a162499b8f2b1397698feba7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d13510a162499b8f2b1397698feba7a");
            return;
        }
        synchronized (c.class) {
            if (i != e || f != i2 || z != g) {
                e = i;
                f = i2;
                g = z;
                com.dianping.nvtunnelkit.logger.b.b("NetworkStateUtil", "checkConnectivityChanged = true, mConnectionType = " + e + ", subNetworkType = " + f + ", isConnected = " + g);
                z2 = true;
            }
        }
        if (z2) {
            c(i, i2, z);
        }
    }

    private static void c(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38aac213e10ffc5c0d975fd0aa4fe4e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38aac213e10ffc5c0d975fd0aa4fe4e9");
            return;
        }
        for (b bVar : c) {
            if (bVar != null) {
                bVar.a(i, i2, z);
            }
        }
    }

    @NonNull
    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43d0d08ed8f6cd91b1e75c115fac8fba", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43d0d08ed8f6cd91b1e75c115fac8fba");
        }
        a aVar = new a();
        aVar.a = e;
        aVar.b = f;
        aVar.c = g;
        return aVar;
    }
}
