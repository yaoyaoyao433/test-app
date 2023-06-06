package com.dianping.monitor.impl;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.logreportswitcher.c;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.meituan.android.knb.KNBWebManager;
import dianping.com.remoteshark.b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class e {
    public static ChangeQuickRedirect a = null;
    private static String i = "CatMonitorService";
    private static volatile e j;
    public final Handler b;
    Context c;
    a d;
    final ConcurrentLinkedQueue<d> e;
    final Runnable f;
    private final int g;
    private final com.dianping.monitor.impl.b h;
    private String k;
    private com.dianping.monitor.impl.a l;
    private int m;
    private com.dianping.monitor.g n;
    private final int o;
    private final int p;
    private final int q;
    private int r;
    private final Executor s;
    private final Executor t;
    private final boolean u;

    public static /* synthetic */ String a() {
        return i;
    }

    public static /* synthetic */ void a(e eVar, boolean z, long j2, int i2, int i3, int i4, Throwable th) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "21e61f74e8f2fa325e809f5e5aba08d2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "21e61f74e8f2fa325e809f5e5aba08d2");
            return;
        }
        r.a("commandbatch", com.dianping.monitor.b.h() ? TrafficRecord.Detail.TUNNEL_SHARK : "raptor", z ? 200 : i2, com.dianping.monitor.b.i() ? "h2" : "http1.1", i3, i4, System.currentTimeMillis() - j2, th);
    }

    public static /* synthetic */ boolean a(e eVar, String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "3b855afc1619d1837baf38682883868c", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "3b855afc1619d1837baf38682883868c")).booleanValue() : !(TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) && com.dianping.monitor.b.n() && (com.dianping.monitor.h.a(str, "command_cmd") || com.dianping.monitor.h.a(str2, "command_extra"));
    }

    public static /* synthetic */ String g(e eVar) {
        return eVar.k;
    }

    public static /* synthetic */ dianping.com.remoteshark.a h(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "d0965fc734ed4217c7853b386d3f6c3a", 6917529027641081856L)) {
            return (dianping.com.remoteshark.a) PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "d0965fc734ed4217c7853b386d3f6c3a");
        }
        dianping.com.remoteshark.a a2 = dianping.com.remoteshark.d.a(eVar.c);
        if (a2 == null) {
            com.dianping.monitor.a.a("none idle-shark version found or is not enable.");
        }
        return a2;
    }

    public static /* synthetic */ int i(e eVar) {
        return eVar.m;
    }

    public static /* synthetic */ com.dianping.monitor.impl.a j(e eVar) {
        return eVar.l;
    }

    public static /* synthetic */ int k(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "ef489dca6b5a5abf9223343e8efd049d", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "ef489dca6b5a5abf9223343e8efd049d")).intValue();
        }
        if (eVar.n.a() == 2) {
            return 30000;
        }
        return KNBWebManager.ISetting.DEFAULT_TIMEOUT;
    }

    public static /* synthetic */ boolean l(e eVar) {
        return eVar.u;
    }

    public static /* synthetic */ int m(e eVar) {
        return eVar.r;
    }

    public static /* synthetic */ com.dianping.monitor.impl.b n(e eVar) {
        return eVar.h;
    }

    private e(Context context, int i2, com.dianping.monitor.impl.a aVar) {
        Object[] objArr = {context, Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81052bd3f6c5cd3d9b36dd1c889b36c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81052bd3f6c5cd3d9b36dd1c889b36c9");
            return;
        }
        this.b = new Handler(Looper.getMainLooper());
        this.g = 4096;
        this.h = new com.dianping.monitor.impl.b(4096);
        this.k = "";
        this.o = 30;
        this.p = 100;
        this.q = 30000;
        this.s = com.sankuai.android.jarvis.c.a("CatMonitorServiceLoop", "bfe_basemonitor", 30L);
        this.t = com.sankuai.android.jarvis.c.a("CatMonitorService", 2, 3, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.e = new ConcurrentLinkedQueue<>();
        this.f = new Runnable() { // from class: com.dianping.monitor.impl.e.1
            public static ChangeQuickRedirect a;

            {
                e.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba7c8f332cc34773efaaaca4c38e2217", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba7c8f332cc34773efaaaca4c38e2217");
                } else if (e.this.d != null) {
                    e.this.d.a();
                }
            }
        };
        this.u = (context == null || com.dianping.networklog.j.a(context)) ? false : true;
        Object[] objArr2 = {context, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d34d07cacccba98d59068eddf6a198c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d34d07cacccba98d59068eddf6a198c0");
        } else {
            this.c = context.getApplicationContext();
            this.m = i2;
            this.n = new com.dianping.monitor.g(context);
            this.r = com.dianping.monitor.h.a(context);
            this.d = new a();
            com.sankuai.waimai.launcher.util.aop.b.a(this.s, this.d);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9f816f49a41243ae2c64e1c413bc64a0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9f816f49a41243ae2c64e1c413bc64a0");
            } else {
                com.dianping.monitor.b.a();
            }
        }
        this.l = aVar;
        this.k = Build.MODEL == null ? "unknown" : Build.MODEL.replace(StringUtil.SPACE, CommonConstant.Symbol.UNDERLINE).replace("\t", CommonConstant.Symbol.UNDERLINE);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        public final int b;
        public final Random c;
        private HashMap<g, List<String>> e;
        private String f;
        private ConcurrentHashMap<String, Integer> g;
        private volatile boolean h;
        private int i;
        private volatile boolean j;
        private final Object k;
        private volatile boolean l;

        private a() {
            e.this = r12;
            Object[] objArr = {r12};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c010f1cfbad590c76aff7f80aa3c101c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c010f1cfbad590c76aff7f80aa3c101c");
                return;
            }
            this.e = new HashMap<>();
            this.f = "";
            this.g = new ConcurrentHashMap<>();
            this.i = 0;
            this.j = true;
            this.k = new Object();
            this.b = 1001;
            this.c = new Random();
        }

        public static /* synthetic */ void b(a aVar) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "24f12ba1276e2febd5d9055637af35da", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "24f12ba1276e2febd5d9055637af35da");
            } else if (aVar.l) {
            } else {
                synchronized (aVar.k) {
                    aVar.k.notify();
                }
            }
        }

        private int a(String str) {
            Integer num;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20e0ce2ec8b77127a9d350f9a3cf4f67", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20e0ce2ec8b77127a9d350f9a3cf4f67")).intValue();
            }
            String str2 = "";
            String lowerCase = str.toLowerCase();
            Enumeration<String> keys = this.g.keys();
            while (true) {
                if (!keys.hasMoreElements()) {
                    break;
                }
                String nextElement = keys.nextElement();
                if (lowerCase.startsWith(nextElement)) {
                    str2 = nextElement;
                    break;
                }
            }
            if (!this.g.containsKey(str2) || (num = this.g.get(str2)) == null) {
                return -1;
            }
            return num.intValue();
        }

        private boolean c() {
            int a2;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f21c549d1bbfd9bc962f7c5c157ed37b", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f21c549d1bbfd9bc962f7c5c157ed37b")).booleanValue();
            }
            LinkedList linkedList = new LinkedList();
            synchronized (e.this.e) {
                linkedList.addAll(e.this.e);
                e.this.e.clear();
            }
            b();
            if (!linkedList.isEmpty()) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    dVar.b = dVar.b == 0 ? System.currentTimeMillis() : dVar.b;
                    if (dVar.d == 0) {
                        dVar.d = e.this.n.a();
                    }
                    if (dVar.f / 100 == -1 && !e.this.n.a(e.this.c)) {
                        dVar.f = -199;
                    }
                    String a3 = d.a(dVar);
                    int i = dVar.m * 10;
                    if (!TextUtils.isEmpty(dVar.c) && !this.g.isEmpty() && (a2 = a(dVar.c)) >= 0) {
                        i = a2;
                    }
                    if (dVar.o && dVar.r != null && !dVar.y) {
                        dVar.r.s = a3;
                        com.dianping.monitor.a.a(q.a(dVar.r), dVar.v, dVar.w, dVar.y);
                    }
                    if (i > 0) {
                        if (this.c.nextInt(1001) > i) {
                            if (!dVar.o) {
                                com.dianping.monitor.a.a("[noupload]" + a3, dVar.v, dVar.w, dVar.y);
                            }
                        } else {
                            if (!dVar.n) {
                                com.dianping.monitor.a.a(a3, dVar.v, dVar.w, dVar.y);
                            }
                            if (!e.a(e.this, dVar.c, dVar.l)) {
                                if (this.e.containsKey(dVar.q)) {
                                    this.e.get(dVar.q).add(a3);
                                    this.i++;
                                } else {
                                    LinkedList linkedList2 = new LinkedList();
                                    linkedList2.add(a3);
                                    this.i++;
                                    this.e.put(dVar.q, linkedList2);
                                }
                            }
                        }
                    } else if (!dVar.o) {
                        com.dianping.monitor.a.a("[noupload]" + a3, dVar.v, dVar.w, dVar.y);
                    }
                }
            }
            if (this.i >= com.dianping.monitor.b.k()) {
                this.i = 0;
                return true;
            } else if (!this.h || this.i <= 1) {
                return false;
            } else {
                this.h = false;
                this.i = 0;
                return true;
            }
        }

        public void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bce3ef509407cb2d62e3d1f2e6085ac6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bce3ef509407cb2d62e3d1f2e6085ac6");
            } else if (this.l) {
            } else {
                synchronized (this.k) {
                    this.h = true;
                    this.k.notify();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            String c;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7e253c1d65866a0e5ed344ecb60e73d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7e253c1d65866a0e5ed344ecb60e73d");
                return;
            }
            while (this.j) {
                synchronized (this.k) {
                    this.l = true;
                    try {
                        if (!c()) {
                            this.l = false;
                            this.k.wait();
                            this.l = true;
                        } else {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "163bd19127ab2df176c5bdb21bf1619f", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "163bd19127ab2df176c5bdb21bf1619f");
                            } else {
                                if (c.b.a.a(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE) && c.b.a.a("mobileapi")) {
                                    for (Map.Entry<g, List<String>> entry : this.e.entrySet()) {
                                        g key = entry.getKey();
                                        if (!TextUtils.isEmpty(key.b)) {
                                            c = key.b;
                                        } else {
                                            c = c.c();
                                        }
                                        String str = c;
                                        List<String> value = entry.getValue();
                                        if (value != null && !value.isEmpty()) {
                                            com.sankuai.waimai.launcher.util.aop.b.a(e.this.t, new b(value, str, key.c, key.d));
                                        }
                                    }
                                    this.e.clear();
                                    com.dianping.monitor.h.g();
                                }
                                this.e.clear();
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        if (e instanceof InterruptedIOException) {
                            this.j = false;
                            this.l = false;
                            e.this.d = new a();
                            com.sankuai.waimai.launcher.util.aop.b.a(e.this.s, e.this.d);
                        }
                    }
                }
            }
        }

        private void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b427dc5134f189cf0e1c720763a473b7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b427dc5134f189cf0e1c720763a473b7");
                return;
            }
            com.dianping.logreportswitcher.c cVar = c.b.a;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.dianping.logreportswitcher.c.a;
            String c = PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "b32467216e04de91563cef5e3062cd9c", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "b32467216e04de91563cef5e3062cd9c") : cVar.d.c("sample_config_key");
            if (TextUtils.isEmpty(c) || this.f.equals(c)) {
                return;
            }
            this.f = c;
            try {
                JSONArray jSONArray = new JSONArray(c);
                this.g.clear();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        String optString = jSONObject.optString("id");
                        int optDouble = (int) (jSONObject.optDouble("sample") * 1000.0d);
                        if (!TextUtils.isEmpty(optString)) {
                            this.g.put(optString.toLowerCase(), Integer.valueOf(optDouble));
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public static ChangeQuickRedirect a;
        private final List<String> c;
        private final String d;
        private final int e;
        private final String f;

        public b(List<String> list, String str, int i, String str2) {
            e.this = r11;
            Object[] objArr = {r11, list, str, Integer.valueOf(i), str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05544810d213d561482dc4f5689e5b8d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05544810d213d561482dc4f5689e5b8d");
                return;
            }
            this.c = list;
            this.d = str;
            this.e = i;
            this.f = str2 == null ? "" : str2;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // java.lang.Runnable
        public final void run() {
            /*
                Method dump skipped, instructions count: 486
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.monitor.impl.e.b.run():void");
        }

        private void a(String str, final int i, String str2) {
            Object[] objArr = {str, Integer.valueOf(i), str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6434783887bd6ca5e761bc8e70b40f8f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6434783887bd6ca5e761bc8e70b40f8f");
                return;
            }
            dianping.com.remoteshark.a h = e.h(e.this);
            if (h == null) {
                return;
            }
            String str3 = "v=" + this.e + "&p=" + e.this.m + "&unionId=" + str2 + "&c=\n" + str.toString();
            try {
                b.a aVar = new b.a();
                aVar.b = this.d;
                aVar.f = new ByteArrayInputStream(str3.getBytes("utf-8"));
                aVar.j = true;
                dianping.com.remoteshark.b a2 = aVar.a();
                a2.a("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM);
                h.b(a2).a(new rx.functions.b<dianping.com.remoteshark.c>() { // from class: com.dianping.monitor.impl.e.b.1
                    public static ChangeQuickRedirect a;

                    {
                        b.this = this;
                    }

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(dianping.com.remoteshark.c cVar) {
                        dianping.com.remoteshark.c cVar2 = cVar;
                        Object[] objArr2 = {cVar2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fcbad4eb87dfc8f8121b5bfe3eb77178", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fcbad4eb87dfc8f8121b5bfe3eb77178");
                        } else {
                            e.this.l.pv4(0L, "cat_upload", 0, 2, cVar2.e, 0, i, 0, "", "", 1);
                        }
                    }
                }, new rx.functions.b<Throwable>() { // from class: com.dianping.monitor.impl.e.b.2
                    public static ChangeQuickRedirect a;

                    {
                        b.this = this;
                    }

                    @Override // rx.functions.b
                    public final /* synthetic */ void call(Throwable th) {
                        Throwable th2 = th;
                        Object[] objArr2 = {th2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "30eead96cab86c900286c4242d12c4b7", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "30eead96cab86c900286c4242d12c4b7");
                            return;
                        }
                        com.dianping.monitor.impl.a aVar2 = e.this.l;
                        int i2 = i;
                        aVar2.pv4(0L, "cat_upload", 0, 2, 404, 0, i2, 0, "", th2.getMessage(), 1);
                    }
                });
            } catch (Exception unused) {
            }
        }

        public void a(Throwable th, f fVar, dianping.com.remoteshark.b bVar, int i) {
            Object[] objArr = {th, fVar, bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "978e6e042a41489658dd8029f230d46e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "978e6e042a41489658dd8029f230d46e");
                return;
            }
            com.dianping.monitor.a.a(th);
            fVar.a(bVar.a, 2, i, 0, "", 404, th);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        private void b(java.lang.String r27, int r28, java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 929
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.monitor.impl.e.b.b(java.lang.String, int, java.lang.String):void");
        }

        public void a(dianping.com.remoteshark.c cVar, f fVar, dianping.com.remoteshark.b bVar, int i) {
            Object[] objArr = {cVar, fVar, bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68f390161d729718aba7961f261b3056", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68f390161d729718aba7961f261b3056");
                return;
            }
            if (!cVar.g) {
                if (com.dianping.monitor.impl.a.DEBUG) {
                    Log.e(e.i, "Failed to send BaseMonitor Idle report");
                }
            } else {
                byte[] bArr = cVar.c;
                if (!com.dianping.logreportswitcher.utils.f.b(bArr)) {
                    String str = new String(bArr);
                    if (!"ok".equalsIgnoreCase(str) && !"error".equalsIgnoreCase(str)) {
                        try {
                            byte[] b = com.dianping.monitor.h.b(bArr);
                            if (!com.dianping.logreportswitcher.utils.f.b(b)) {
                                String str2 = new String(b);
                                com.dianping.monitor.a.c("Cat update config > " + str2);
                                com.dianping.monitor.a.a("Cat update config > " + str2);
                                c.b.a.b(str2);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                            Log.e(e.i, "Failed to send Idle report");
                        }
                    }
                }
                if (com.dianping.monitor.impl.a.DEBUG) {
                    String unused = e.i;
                }
            }
            fVar.a(bVar.a, cVar.a, i, h.a(cVar), cVar.b, cVar.e, cVar.d instanceof Throwable ? (Throwable) cVar.d : null);
        }
    }

    public static e a(Context context, int i2, com.dianping.monitor.impl.a aVar) {
        Object[] objArr = {context, Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce1b4f2dc3f3b7909317c373a8818b21", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce1b4f2dc3f3b7909317c373a8818b21");
        }
        if (j == null) {
            synchronized (e.class) {
                if (j == null) {
                    j = new e(context, i2, aVar);
                }
            }
        }
        return j;
    }
}
