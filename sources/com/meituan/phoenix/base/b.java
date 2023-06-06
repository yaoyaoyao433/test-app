package com.meituan.phoenix.base;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.phoenix.data.d;
import com.meituan.phoenix.data.e;
import com.meituan.phoenix.monitor.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.t;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b<Request, Executor, Response> {
    public static ChangeQuickRedirect b;
    private final String a;
    private final com.meituan.phoenix.monitor.b c;
    private com.meituan.phoenix.base_interface.a d;
    private Context e;

    public abstract Response a(Request request, String str, Executor executor) throws IOException;

    public abstract e b(@NonNull Response response);

    public b(Context context, @NonNull com.meituan.phoenix.core.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d65aaf82814288d32c767aa4f127247a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d65aaf82814288d32c767aa4f127247a");
            return;
        }
        this.e = context;
        this.a = aVar.a();
        this.c = new d(context);
        this.c.a(aVar.c);
        this.d = new c();
    }

    public final Response a(String str, int i, Request request, Executor executor) throws IOException {
        boolean z;
        com.meituan.phoenix.data.d dVar;
        d.a aVar;
        Response response;
        Object[] objArr = {str, Integer.valueOf(i), request, executor};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf2dfa691d4133b4f097e68aa0972b39", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf2dfa691d4133b4f097e68aa0972b39");
        }
        Context context = this.e;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.phoenix.util.c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2f32de558b664b6509cb38af8ad312c3", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2f32de558b664b6509cb38af8ad312c3")).booleanValue();
        } else {
            NetworkInfo a = com.meituan.phoenix.util.c.a(context);
            z = a != null && a.isAvailable();
        }
        if (z && !TextUtils.isEmpty(str)) {
            String f = t.e(str).f();
            if (TextUtils.isEmpty(f)) {
                return null;
            }
            if (com.meituan.phoenix.a.a) {
                com.meituan.phoenix.util.b.a("Phoenix", "----> Phoenix execute Start  Thread: " + Thread.currentThread().getName() + " phoenixKey: " + this.a, new Object[0]);
            }
            com.meituan.phoenix.data.b a2 = com.meituan.phoenix.data.b.a();
            String str2 = this.a;
            Object[] objArr3 = {str2};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.phoenix.data.b.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "256f4b34a20c3f43a5502835eb334e38", RobustBitConfig.DEFAULT_VALUE)) {
                dVar = (com.meituan.phoenix.data.d) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "256f4b34a20c3f43a5502835eb334e38");
            } else {
                dVar = TextUtils.isEmpty(str2) ? null : a2.b.get(str2);
            }
            if (dVar == null || dVar.c == null || dVar.c.size() == 0) {
                return null;
            }
            if (this.d == null || this.d.a(i, dVar.e)) {
                if (com.meituan.phoenix.a.a) {
                    com.meituan.phoenix.util.b.a("Phoenix", "----> Cur Data: " + dVar.toString(), new Object[0]);
                }
                Iterator<d.a> it = dVar.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = it.next();
                    if (aVar != null && aVar.d != null && aVar.d.contains(f)) {
                        break;
                    }
                }
                if (aVar == null) {
                    return null;
                }
                if (com.meituan.phoenix.a.a) {
                    com.meituan.phoenix.util.b.a("Phoenix", "----> Cur Match Item: " + aVar, new Object[0]);
                }
                com.meituan.phoenix.monitor.e a3 = com.meituan.phoenix.monitor.e.a();
                a3.l = SystemClock.elapsedRealtime();
                a3.i = i;
                a3.h = f;
                a3.g = str;
                a3.s = this.a;
                a3.q = dVar.b;
                CopyOnWriteArrayList<d.b> copyOnWriteArrayList = aVar.e;
                if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
                    return null;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Response response2 = null;
                int i2 = 0;
                while (true) {
                    if (i2 >= copyOnWriteArrayList.size()) {
                        response = response2;
                        break;
                    }
                    d.b bVar = copyOnWriteArrayList.get(i2);
                    if (bVar != null && !TextUtils.isEmpty(bVar.b)) {
                        response = a(bVar, (d.b) request, (Request) executor, a3);
                        if (response != null) {
                            a3.m = SystemClock.elapsedRealtime() - elapsedRealtime;
                            if (i2 != 0) {
                                Object[] objArr4 = {Integer.valueOf(i2), copyOnWriteArrayList};
                                ChangeQuickRedirect changeQuickRedirect4 = b;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c783314535a373b3e044f05dfe999744", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c783314535a373b3e044f05dfe999744");
                                } else if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 1 && i2 >= 0 && i2 < copyOnWriteArrayList.size()) {
                                    copyOnWriteArrayList.add(0, copyOnWriteArrayList.remove(i2));
                                    if (com.meituan.phoenix.a.a) {
                                        com.meituan.phoenix.util.b.a("Phoenix", "----> Dynamic Sort Phoenix Host List", new Object[0]);
                                    }
                                }
                            }
                        } else {
                            response2 = response;
                        }
                    }
                    i2++;
                }
                if (com.meituan.phoenix.a.a) {
                    com.meituan.phoenix.util.b.a("Phoenix", " Cur Record: " + a3.toString() + " Thread: " + Thread.currentThread().getName(), new Object[0]);
                }
                this.c.a(a3);
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.phoenix.monitor.e.a;
                if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "7e49011a2735fb2b73e13764432d2e6d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "7e49011a2735fb2b73e13764432d2e6d");
                } else {
                    a3.f = false;
                    a3.j = null;
                    a3.n.clear();
                    a3.o.clear();
                    a3.p.clear();
                    a3.h = null;
                    a3.q = "-1";
                    a3.i = -1;
                    a3.r = 0;
                    a3.s = "";
                    synchronized (com.meituan.phoenix.monitor.e.c) {
                        if (com.meituan.phoenix.monitor.e.d < 30) {
                            a3.e = com.meituan.phoenix.monitor.e.b;
                            com.meituan.phoenix.monitor.e.b = a3;
                            com.meituan.phoenix.monitor.e.d++;
                        }
                    }
                }
                return response;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.meituan.phoenix.base.b, java.lang.Object, com.meituan.phoenix.base.b<Request, Executor, Response>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r5v4 */
    private Response a(d.b bVar, Request request, Executor executor, com.meituan.phoenix.monitor.e eVar) {
        IOException iOException;
        Response response;
        int i;
        boolean z;
        Object[] objArr = {bVar, request, executor, eVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5010200230393d4a9170a6f4c794339b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5010200230393d4a9170a6f4c794339b");
        }
        Response response2 = null;
        if (bVar == null) {
            return null;
        }
        int i2 = 0;
        while (i2 < bVar.c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            eVar.r++;
            try {
                if (com.meituan.phoenix.a.a) {
                    com.meituan.phoenix.util.b.a("Phoenix", "----> Retry: " + bVar.b + " Thread: " + Thread.currentThread().getName() + " phoenixKey: " + this.a, new Object[0]);
                }
                response = (Response) a(request, bVar.b, executor);
                iOException = response2;
            } catch (IOException e) {
                iOException = e;
                response = response2;
            }
            if (response != null) {
                e b2 = b(response);
                z = b2.a;
                i = b2.b;
            } else {
                i = Integer.MAX_VALUE;
                z = false;
            }
            if (z) {
                if (com.meituan.phoenix.a.a) {
                    com.meituan.phoenix.util.b.a("Phoenix", "----> Retry:" + bVar.b + StringUtil.SPACE + i2 + " Success Thread: " + Thread.currentThread().getName() + " phoenixKey: " + this.a, new Object[0]);
                }
                eVar.j = bVar.b;
                eVar.f = true;
                return response;
            }
            if (com.meituan.phoenix.a.a) {
                com.meituan.phoenix.util.b.a("Phoenix", "----> Retry:" + bVar.b + StringUtil.SPACE + i2 + " Failed Thread: " + Thread.currentThread().getName() + " phoenixKey: " + this.a, new Object[0]);
            }
            eVar.p.add(Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            eVar.n.add(bVar.b);
            if (response != null && i != Integer.MAX_VALUE) {
                eVar.o.add(Integer.valueOf(i));
            } else if (iOException != 0) {
                eVar.o.add(Integer.valueOf(com.meituan.phoenix.util.a.a(iOException)));
            } else {
                eVar.o.add(Integer.valueOf(com.meituan.phoenix.util.a.a()));
            }
            i2++;
            response2 = null;
        }
        return response2;
    }
}
