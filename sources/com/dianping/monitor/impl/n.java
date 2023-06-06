package com.dianping.monitor.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.dianping.logreportswitcher.c;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes.dex */
public final class n implements com.dianping.monitor.metric.e {
    public static ChangeQuickRedirect a;
    public static boolean b = a.DEBUG;
    private static final Executor c = com.sankuai.android.jarvis.c.a("MetricSendManager", 1, 2, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private static volatile n d;
    private final Handler e;
    private final Object f;
    private final List<com.dianping.monitor.metric.a> g;
    private final Map<String, String> h;
    private Runnable i;

    public static n a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92e28402e7226ce35a55a89a91058b9b", 6917529027641081856L)) {
            return (n) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92e28402e7226ce35a55a89a91058b9b");
        }
        if (d == null) {
            synchronized (n.class) {
                if (d == null) {
                    n nVar = new n(context);
                    d = nVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, nVar, changeQuickRedirect2, false, "ee38afb6dee62c47dd4cb0de48fea384", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, nVar, changeQuickRedirect2, false, "ee38afb6dee62c47dd4cb0de48fea384");
                    } else {
                        com.sankuai.waimai.launcher.util.aop.b.a(c, new Runnable() { // from class: com.dianping.monitor.impl.n.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0902f9524b905313902187da0e8a7f4d", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0902f9524b905313902187da0e8a7f4d");
                                } else {
                                    com.dianping.monitor.metric.c.a().b();
                                }
                            }
                        });
                    }
                }
            }
        }
        return d;
    }

    private n(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9ad13985262a0590d778b0a3f301067", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9ad13985262a0590d778b0a3f301067");
            return;
        }
        this.f = new Object();
        this.g = new ArrayList();
        this.i = new Runnable() { // from class: com.dianping.monitor.impl.n.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "006f3bf276900fa08b1477940e3529d6", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "006f3bf276900fa08b1477940e3529d6");
                } else {
                    n.this.b();
                }
            }
        };
        this.e = new Handler(Looper.getMainLooper());
        this.h = new HashMap();
        this.h.put("platform", "1");
        this.h.put("sysVersion", com.dianping.monitor.h.b());
        this.h.put("appVersion", String.valueOf(com.dianping.monitor.h.a(context)));
        this.h.put("model", com.dianping.monitor.h.a());
    }

    @Override // com.dianping.monitor.metric.d
    public final int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6b1d8fbace691edeaf052b61af24886", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6b1d8fbace691edeaf052b61af24886")).intValue() : com.dianping.monitor.metric.c.a().a(str);
    }

    private JSONObject a(List<com.dianping.monitor.metric.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc4544889f743867f6ea4ce7461114e4", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc4544889f743867f6ea4ce7461114e4");
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (com.dianping.monitor.metric.a aVar : list) {
            JSONObject a2 = aVar.a();
            a2.remove("appId");
            jSONArray.put(a2);
        }
        try {
            jSONObject.put("commonTags", new JSONObject(this.h));
            jSONObject.put("data", jSONArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "978990fb551728fde60cc46ab7d29574", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "978990fb551728fde60cc46ab7d29574");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(c, new Runnable() { // from class: com.dianping.monitor.impl.n.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList<com.dianping.monitor.metric.a> arrayList;
                    List list;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbb979261f4d3d348c0c10a16daf1c96", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbb979261f4d3d348c0c10a16daf1c96");
                        return;
                    }
                    com.dianping.monitor.metric.c.a().b();
                    synchronized (n.this.f) {
                        arrayList = new ArrayList(n.this.g);
                        n.this.g.clear();
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    for (com.dianping.monitor.metric.a aVar : arrayList) {
                        String str = aVar.b + CommonConstant.Symbol.MINUS + aVar.c;
                        if (hashMap.containsKey(str)) {
                            list = (List) hashMap.get(str);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            hashMap.put(str, arrayList2);
                            list = arrayList2;
                        }
                        list.add(aVar);
                    }
                    for (List list2 : hashMap.values()) {
                        n.this.b(list2);
                    }
                }
            });
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(java.util.List<com.dianping.monitor.metric.a> r13) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.monitor.impl.n.b(java.util.List):boolean");
    }

    @Override // com.dianping.monitor.metric.d
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6e2008ef0c96053e7676f21baa34e32", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6e2008ef0c96053e7676f21baa34e32");
        } else {
            b();
        }
    }

    @Override // com.dianping.monitor.metric.d
    public final void a(com.dianping.monitor.metric.a aVar) {
        boolean z = true;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e63d4827ae5025948c7c159b0f83d5fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e63d4827ae5025948c7c159b0f83d5fe");
        } else if (c.b.a.a(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE) && c.b.a.a("metric") && aVar != null) {
            com.dianping.monitor.a.a(aVar);
            synchronized (this.f) {
                this.g.add(aVar);
                if (this.g.size() <= 15) {
                    z = false;
                }
            }
            this.e.removeCallbacks(this.i);
            if (z) {
                b();
            } else {
                this.e.postDelayed(this.i, 15000L);
            }
        }
    }
}
