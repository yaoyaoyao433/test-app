package com.dianping.networklog;

import android.text.TextUtils;
import android.util.Log;
import com.dianping.networklog.af;
import com.dianping.networklog.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class ah extends k {
    public static ChangeQuickRedirect g;
    private static com.meituan.android.cipstorage.q h;
    private static final byte[] i = new byte[0];
    private static final ExecutorService j = com.sankuai.android.jarvis.c.a("LoganSend2", 4, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public ah(af afVar) {
        super(afVar);
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca757f841755ad4e88aa1109086d90f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca757f841755ad4e88aa1109086d90f2");
        }
    }

    private boolean a(z.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43376eec91f85177f94daf0774c537be", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43376eec91f85177f94daf0774c537be")).booleanValue();
        }
        c.a(this.b.i, bVar != null ? bVar.d : null);
        int a = z.b.a(bVar);
        if (this.b.m == 2) {
            com.dianping.networklog.a.d.a().b((int) this.b.e, a);
        } else {
            com.dianping.networklog.a.d.a().a((int) this.b.e, a);
        }
        return bVar != null && bVar.b;
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15f730fb96d01cdeeeea120d9ee6fc23", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15f730fb96d01cdeeeea120d9ee6fc23")).booleanValue();
        }
        if (c.a() == null) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        try {
            synchronized (i) {
                if (h == null) {
                    h = com.meituan.android.cipstorage.q.a(c.a(), "LoganConfig", 2);
                }
                com.meituan.android.cipstorage.q qVar = h;
                long b = qVar.b("UploadFrequencyTime" + str, 0L);
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - b < c.x) {
                    return true;
                }
                com.meituan.android.cipstorage.q qVar2 = h;
                qVar2.a("UploadFrequencyTime" + str, currentTimeMillis);
                return false;
            }
        } catch (Throwable th) {
            if (c.e) {
                th.printStackTrace();
            }
            return false;
        }
    }

    private boolean b(af afVar) {
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83cec62edcf22b47704bddd8d5e3e8cf", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83cec62edcf22b47704bddd8d5e3e8cf")).booleanValue() : a(c(afVar));
    }

    private z.b c(af afVar) {
        z.b bVar;
        boolean z;
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53ece306011e0c7e5a4c219c302ce490", 6917529027641081856L)) {
            return (z.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53ece306011e0c7e5a4c219c302ce490");
        }
        z.b bVar2 = null;
        ArrayList<Future> arrayList = new ArrayList(afVar.q.size());
        for (af.a aVar : afVar.q) {
            final File file = aVar.a;
            final af clone = afVar.clone();
            clone.y = file.getAbsolutePath();
            clone.z = aVar.b;
            clone.A = aVar.c;
            clone.B = aVar.d;
            arrayList.add(j.submit(new Callable<z.b>() { // from class: com.dianping.networklog.ah.1
                public static ChangeQuickRedirect a;

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ z.b call() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "196813553891e66f81b81dc45028ed87", 6917529027641081856L)) {
                        return (z.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "196813553891e66f81b81dc45028ed87");
                    }
                    if (ah.this.a(clone)) {
                        int i2 = c.o ? 1 : 2;
                        for (int i3 = 0; i3 < i2; i3++) {
                            z.b a2 = ah.a(ah.this, clone);
                            if (a2 != null) {
                                if (a2.b) {
                                    file.delete();
                                    return a2;
                                }
                                if (!(a2.c != z.b.e)) {
                                    return null;
                                }
                            }
                        }
                        return null;
                    }
                    return null;
                }
            }));
        }
        boolean z2 = true;
        for (Future future : arrayList) {
            try {
                bVar = (z.b) future.get();
            } catch (Exception e) {
                e = e;
            }
            if (bVar != null) {
                try {
                } catch (Exception e2) {
                    e = e2;
                    bVar2 = bVar;
                    if (c.e) {
                        Log.w("LoganSend", "send exception", e);
                    }
                }
                if (bVar.b) {
                    z = true;
                    z2 &= z;
                    bVar2 = bVar;
                }
            }
            z = false;
            z2 &= z;
            bVar2 = bVar;
        }
        if (bVar2 != null) {
            bVar2.b = z2;
        }
        return bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.networklog.ah.run():void");
    }

    public static /* synthetic */ z.b a(ah ahVar, af afVar) {
        z.b a;
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, ahVar, changeQuickRedirect, false, "85b918e0404288a0ca3ca90deeb5a9e8", 6917529027641081856L)) {
            return (z.b) PatchProxy.accessDispatch(objArr, ahVar, changeQuickRedirect, false, "85b918e0404288a0ca3ca90deeb5a9e8");
        }
        int length = (int) new File(afVar.y).length();
        if (afVar.m == 2) {
            a = z.b.a(ahVar.c.c(afVar));
            com.dianping.networklog.a.d a2 = com.dianping.networklog.a.d.a();
            int a3 = z.b.a(a);
            Object[] objArr2 = {Integer.valueOf(length), Integer.valueOf(a3)};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.networklog.a.d.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "07c670c0ecf582aed5fcbfc66ff24240", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "07c670c0ecf582aed5fcbfc66ff24240");
            } else if (a2.c) {
                com.dianping.networklog.a.c.a("logan/v2/push_sharding_upload", length, a3);
            }
        } else {
            a = z.b.a(ahVar.c.b(afVar));
            com.dianping.networklog.a.d a4 = com.dianping.networklog.a.d.a();
            int a5 = z.b.a(a);
            Object[] objArr3 = {Integer.valueOf(length), Integer.valueOf(a5)};
            ChangeQuickRedirect changeQuickRedirect3 = com.dianping.networklog.a.d.a;
            if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect3, false, "c71ac91965cced0c3a64eda626ea591f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect3, false, "c71ac91965cced0c3a64eda626ea591f");
            } else if (a4.c) {
                com.dianping.networklog.a.c.a("logan/v2/sharding_upload", length, a5);
            }
        }
        return a;
    }
}
