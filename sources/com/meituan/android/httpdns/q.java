package com.meituan.android.httpdns;

import com.meituan.android.httpdns.DnsRecord;
import com.meituan.android.httpdns.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class q {
    public static ChangeQuickRedirect a = null;
    public static int c = 300000;
    public volatile int b;
    h.a d;
    private Map<String, Long> e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    interface a {
        void a(List<DnsRecord.a> list);
    }

    public q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a923db95d83053c465e4ee6aed645cfd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a923db95d83053c465e4ee6aed645cfd");
        } else {
            this.e = new ConcurrentHashMap();
        }
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b38b60e22e2cd18f657c195f3b29cad", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b38b60e22e2cd18f657c195f3b29cad")).booleanValue();
        }
        Long l = this.e.get(str);
        return (l == null || this.d == null || ((float) (System.currentTimeMillis() - l.longValue())) / 1000.0f >= this.d.k) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized boolean a(List<String> list, List<String> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf994a4ad5c5d0eee343ff094954352d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf994a4ad5c5d0eee343ff094954352d")).booleanValue();
        }
        if (list != null && list2 != null) {
            ArrayList arrayList = new ArrayList(list2);
            list2.retainAll(list);
            if (list2.size() > 0) {
                arrayList.removeAll(list2);
                list2.addAll(arrayList);
                return true;
            }
            list2.addAll(arrayList);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(final List<DnsRecord.a> list, final a aVar) {
        Object[] objArr = {list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0c77917ed2b422ff1cff5dc376dc7a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0c77917ed2b422ff1cff5dc376dc7a6");
            return;
        }
        final int i = (int) (this.d.j * 1000.0f);
        final int[] iArr = {0};
        for (final DnsRecord.a aVar2 : list) {
            z.a(new Runnable() { // from class: com.meituan.android.httpdns.q.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85d12d8122be8823fbf16310bf82c9e9", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85d12d8122be8823fbf16310bf82c9e9");
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    boolean a2 = q.a(aVar2.b, i);
                    if (a2) {
                        aVar2.c = System.currentTimeMillis() - currentTimeMillis;
                    }
                    aVar2.e = a2;
                    synchronized (iArr) {
                        int[] iArr2 = iArr;
                        iArr2[0] = iArr2[0] + 1;
                        if (iArr[0] >= list.size()) {
                            aVar.a(list);
                        }
                    }
                }
            });
        }
    }

    public static boolean a(String str, int i) {
        Socket socket;
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        Socket socket2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2659d6968653c42e75b9c599b9037d6", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2659d6968653c42e75b9c599b9037d6")).booleanValue();
        }
        try {
            socket = new Socket();
            try {
                InetSocketAddress inetSocketAddress = new InetSocketAddress(str, 80);
                if (i <= 0) {
                    socket.connect(inetSocketAddress);
                } else {
                    socket.connect(inetSocketAddress, i);
                }
            } catch (Throwable th) {
                th = th;
                socket2 = socket;
                try {
                    z.a(th);
                    if (socket2 != null) {
                        socket2.close();
                    }
                    return false;
                } catch (Throwable th2) {
                    Socket socket3 = socket2;
                    if (socket3 != null) {
                        try {
                            socket3.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (socket.isConnected()) {
            try {
                socket.close();
            } catch (Throwable unused2) {
            }
            return true;
        }
        socket.close();
        return false;
    }

    public static int a(int i) {
        return (i + 1) / 2;
    }
}
