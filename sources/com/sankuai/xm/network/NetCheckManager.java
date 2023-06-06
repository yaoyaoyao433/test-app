package com.sankuai.xm.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class NetCheckManager {
    public static ChangeQuickRedirect a;
    private static volatile NetCheckManager e;
    public Context b;
    private final ArrayList<a> c;
    private NetworkReceiver d;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        void a(NetworkInfo networkInfo);
    }

    public NetCheckManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "976f4e350b66275848a0ae4e7714e6ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "976f4e350b66275848a0ae4e7714e6ed");
        } else {
            this.c = new ArrayList<>();
        }
    }

    public static NetCheckManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b19215fe2ad2ccabcc6065bdd80aaf3f", 6917529027641081856L)) {
            return (NetCheckManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b19215fe2ad2ccabcc6065bdd80aaf3f");
        }
        if (e == null) {
            synchronized (NetCheckManager.class) {
                if (e == null) {
                    e = new NetCheckManager();
                }
            }
        }
        return e;
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e44196f7904bf4481a8e211eecf8aaa2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e44196f7904bf4481a8e211eecf8aaa2");
            return;
        }
        synchronized (this.c) {
            this.c.add(aVar);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea06b50a263c4d79687cefbd5cc7e6b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea06b50a263c4d79687cefbd5cc7e6b4");
        } else if (this.b == null) {
        } else {
            try {
                if (this.d != null) {
                    this.b.unregisterReceiver(this.d);
                }
                this.d = new NetworkReceiver();
                this.b.registerReceiver(this.d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Exception e2) {
                b.d(e2.getMessage(), new Object[0]);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class NetworkReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        private NetworkReceiver() {
            Object[] objArr = {NetCheckManager.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "125c9f45aca8ed02a33c2e60abe7ab9d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "125c9f45aca8ed02a33c2e60abe7ab9d");
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            final NetworkInfo networkInfo;
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13f27cdba101b34492b2210b3d0e0197", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13f27cdba101b34492b2210b3d0e0197");
                return;
            }
            try {
                networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            } catch (Exception e) {
                b.d(e.getMessage(), new Object[0]);
                networkInfo = null;
            }
            com.sankuai.xm.base.util.net.d.a(com.sankuai.xm.base.util.net.d.a(networkInfo));
            Object[] objArr2 = {networkInfo};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d80e2d851f787c3c5ac7ec6090e282bd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d80e2d851f787c3c5ac7ec6090e282bd");
            } else {
                com.sankuai.xm.threadpool.scheduler.a.b().a(32, new Runnable() { // from class: com.sankuai.xm.network.NetCheckManager.NetworkReceiver.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        ArrayList arrayList;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7ff0fb8bd223a9123685c82faedf6bcd", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7ff0fb8bd223a9123685c82faedf6bcd");
                            return;
                        }
                        synchronized (NetCheckManager.this.c) {
                            arrayList = new ArrayList(NetCheckManager.this.c);
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((a) it.next()).a(networkInfo);
                        }
                    }
                });
            }
        }
    }
}
