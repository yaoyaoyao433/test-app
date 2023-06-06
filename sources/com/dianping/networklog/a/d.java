package com.dianping.networklog.a;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.logreportswitcher.c;
import com.dianping.networklog.aj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dianping.com.nvlinker.NVLinker;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public boolean c;
    private b e;
    private com.dianping.networklog.a.a f;
    private a g;
    private int h;
    private static final d d = new d();
    public static final Executor b = com.sankuai.android.jarvis.c.a("LoganMonitor");

    /* loaded from: classes.dex */
    public interface a {
        long a(long j);
    }

    public static d a() {
        return d;
    }

    private void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d58fd568666b6334ef08dc8b39c8b86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d58fd568666b6334ef08dc8b39c8b86");
        } else if (this.g == null) {
        } else {
            int i = this.h;
            while (i > 0) {
                i--;
                j -= 86400000;
                long a2 = this.g.a(j);
                if (a2 > 0) {
                    c.a("logan/v2/filesize", (int) aj.b(a2), 0);
                    return;
                }
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "960addacf264abe99a50b25227107217", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "960addacf264abe99a50b25227107217");
        } else if (this.c) {
            c.a("logan/v2/query", 0, i);
        }
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c367a21e612fb6d8df36db667530014d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c367a21e612fb6d8df36db667530014d");
        } else if (this.c) {
            c.a("logan/v2/upload", i, i2);
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9096e92580ad508b40a8a0b2292e2e36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9096e92580ad508b40a8a0b2292e2e36");
        } else if (this.c) {
            c.a("logan/v2/contentsize", (int) j, 0);
        }
    }

    public final void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a244c194c89050040f1a1da88112ea9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a244c194c89050040f1a1da88112ea9");
        } else if (this.c) {
            c.a("logan/v2/push_upload", i, i2);
        }
    }

    public static /* synthetic */ void a(d dVar, Context context, a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "1e3b6bbbef3e4cee3a3ed7c98c055c78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "1e3b6bbbef3e4cee3a3ed7c98c055c78");
            return;
        }
        dVar.c = true;
        dVar.g = aVar;
        dVar.h = 7;
        try {
            String b2 = c.b.a.b();
            if (!TextUtils.isEmpty(b2)) {
                JSONArray jSONArray = new JSONArray(b2);
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject.has("configId") && "logan_monitor".equals(jSONObject.get("configId"))) {
                            dVar.c = jSONObject.optBoolean("content", true);
                        }
                        if (jSONObject.has("configId") && "logan_saveTime".equals(jSONObject.get("configId"))) {
                            dVar.h = jSONObject.optInt("content", 7);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (!dVar.c) {
            com.dianping.networklog.c.a("logan monitor is disabled.", 1);
            return;
        }
        dVar.e = new b(context);
        dVar.f = new com.dianping.networklog.a.a();
        b bVar = dVar.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        long longValue = PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "e92a5e79824bac04f1b5fd5211abe84f", 6917529027641081856L) ? ((Long) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "e92a5e79824bac04f1b5fd5211abe84f")).longValue() : bVar.b.getLong("file_create_time_day", -1L);
        long b3 = aj.b();
        b bVar2 = dVar.e;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        Map<Integer, Integer> a2 = PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "5c88cb449503d95dea2044f1c2962a55", 6917529027641081856L) ? (Map) PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "5c88cb449503d95dea2044f1c2962a55") : bVar2.a("log_type_count_");
        b bVar3 = dVar.e;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b.a;
        Map<Integer, Integer> a3 = PatchProxy.isSupport(objArr4, bVar3, changeQuickRedirect4, false, "ac706b11e65a72818e017527454f3f68", 6917529027641081856L) ? (Map) PatchProxy.accessDispatch(objArr4, bVar3, changeQuickRedirect4, false, "ac706b11e65a72818e017527454f3f68") : bVar3.a("log_type_size_");
        if (b3 < longValue || b3 - longValue >= 86400000) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            c.a(a2);
            c.b(a3);
            dVar.b(b3);
            b bVar4 = dVar.e;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = b.a;
            if (PatchProxy.isSupport(objArr5, bVar4, changeQuickRedirect5, false, "d19ed0c3386f06e6a5ce0c7ddb127585", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr5, bVar4, changeQuickRedirect5, false, "d19ed0c3386f06e6a5ce0c7ddb127585");
            } else {
                bVar4.b.edit().clear().commit();
            }
            b bVar5 = dVar.e;
            Object[] objArr6 = {new Long(b3)};
            ChangeQuickRedirect changeQuickRedirect6 = b.a;
            if (PatchProxy.isSupport(objArr6, bVar5, changeQuickRedirect6, false, "70b8f18f2ae9bf46b37185e560d2b0fc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr6, bVar5, changeQuickRedirect6, false, "70b8f18f2ae9bf46b37185e560d2b0fc");
            } else {
                bVar5.b.edit().putLong("file_create_time_day", b3).apply();
            }
        } else {
            com.dianping.networklog.a.a aVar2 = dVar.f;
            Object[] objArr7 = {a2};
            ChangeQuickRedirect changeQuickRedirect7 = com.dianping.networklog.a.a.a;
            if (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "e6754dc1e04fca12c9e4f55f096d354e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "e6754dc1e04fca12c9e4f55f096d354e");
            } else if (a2 != null) {
                aVar2.b.putAll(a2);
            }
            com.dianping.networklog.a.a aVar3 = dVar.f;
            Object[] objArr8 = {a3};
            ChangeQuickRedirect changeQuickRedirect8 = com.dianping.networklog.a.a.a;
            if (PatchProxy.isSupport(objArr8, aVar3, changeQuickRedirect8, false, "f6690e640054f849d0251bf093b24353", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr8, aVar3, changeQuickRedirect8, false, "f6690e640054f849d0251bf093b24353");
            } else if (a3 != null) {
                aVar3.c.putAll(a3);
            }
        }
        NVLinker.registerBackgroundStateListener(new NVLinker.AppBackgroundStateListener() { // from class: com.dianping.networklog.a.d.3
            public static ChangeQuickRedirect a;

            @Override // dianping.com.nvlinker.NVLinker.AppBackgroundStateListener
            public final void onBackgroundStateChanged(boolean z) {
                Object[] objArr9 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "4788912b0856a49d6dc054871cde4645", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "4788912b0856a49d6dc054871cde4645");
                } else if (z) {
                    d.b(d.this);
                }
            }
        });
    }

    public static /* synthetic */ void a(d dVar, int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "228e0ef4e7adb74ed403062550396e61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "228e0ef4e7adb74ed403062550396e61");
        } else if (dVar.f != null) {
            com.dianping.networklog.a.a aVar = dVar.f;
            Integer valueOf = Integer.valueOf(i);
            Object[] objArr2 = {valueOf};
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.networklog.a.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "4cd1481219eb1ebf269573e0a1a70122", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "4cd1481219eb1ebf269573e0a1a70122");
            } else {
                aVar.b.put(valueOf, Integer.valueOf((aVar.b.containsKey(valueOf) ? aVar.b.get(valueOf).intValue() : 0) + 1));
            }
            com.dianping.networklog.a.a aVar2 = dVar.f;
            Integer valueOf2 = Integer.valueOf(i);
            Object[] objArr3 = {valueOf2, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect3 = com.dianping.networklog.a.a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "dd42f0bc0225d75b7194a86fceaa4d24", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "dd42f0bc0225d75b7194a86fceaa4d24");
            } else {
                aVar2.c.put(valueOf2, Integer.valueOf((aVar2.c.containsKey(valueOf2) ? aVar2.c.get(valueOf2).intValue() : 0) + i2));
            }
        }
    }

    public static /* synthetic */ void b(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "6bf5ff73514f18a57048a2da9d815405", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "6bf5ff73514f18a57048a2da9d815405");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.dianping.networklog.a.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84d97677c09e90ac4e2bb7b4c194e0af", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84d97677c09e90ac4e2bb7b4c194e0af");
                    } else if (!d.this.c || d.this.e == null || d.this.f == null) {
                    } else {
                        b bVar = d.this.e;
                        Map<Integer, Integer> map = d.this.f.b;
                        Object[] objArr3 = {map};
                        ChangeQuickRedirect changeQuickRedirect3 = b.a;
                        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "f6158d7fce951e18978aa902503583e2", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "f6158d7fce951e18978aa902503583e2");
                        } else {
                            bVar.a("log_type_count_", map);
                        }
                        b bVar2 = d.this.e;
                        Map<Integer, Integer> map2 = d.this.f.c;
                        Object[] objArr4 = {map2};
                        ChangeQuickRedirect changeQuickRedirect4 = b.a;
                        if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "02f9fb619b7c948639fb75a3c22f8b74", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "02f9fb619b7c948639fb75a3c22f8b74");
                        } else {
                            bVar2.a("log_type_size_", map2);
                        }
                    }
                }
            });
        }
    }
}
