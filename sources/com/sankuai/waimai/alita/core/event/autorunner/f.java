package com.sankuai.waimai.alita.core.event.autorunner;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.facade.a;
import com.sankuai.waimai.alita.core.utils.k;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f implements g {
    public static ChangeQuickRedirect a;
    private static final Handler d;
    final d b;
    public Runnable c;
    private final PriorityQueue<com.sankuai.waimai.alita.core.event.a> e;
    private boolean f;

    public static /* synthetic */ void a(f fVar, final List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "c3a5effb83ebdc03d32634eddaf30a38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "c3a5effb83ebdc03d32634eddaf30a38");
        } else {
            d.post(new Runnable() { // from class: com.sankuai.waimai.alita.core.event.autorunner.f.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ff75a0af1297fec533757adba1d4a25", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ff75a0af1297fec533757adba1d4a25");
                        return;
                    }
                    f.a(f.this, true);
                    Iterator it = f.this.e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if ("alita_ar_init".equals(((com.sankuai.waimai.alita.core.event.a) it.next()).a())) {
                                it.remove();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (!com.sankuai.waimai.alita.core.utils.f.a(list)) {
                        for (com.sankuai.waimai.alita.core.event.a aVar : list) {
                            if (!f.this.e.contains(aVar)) {
                                f.this.e.add(aVar);
                            }
                        }
                    }
                    com.sankuai.waimai.alita.core.event.a aVar2 = (com.sankuai.waimai.alita.core.event.a) f.this.e.peek();
                    long currentTimeMillis = aVar2 == null ? System.currentTimeMillis() : aVar2.f() - 50;
                    com.sankuai.waimai.alita.core.event.a a2 = a.C0703a.a(f.this.b.b).a();
                    a2.a(currentTimeMillis);
                    f.this.e.add(a2);
                    HashMap hashMap = new HashMap();
                    hashMap.put("bundle_id", f.this.b.b);
                    PriorityQueue priorityQueue = new PriorityQueue(f.this.e);
                    JSONArray jSONArray = new JSONArray();
                    while (!priorityQueue.isEmpty()) {
                        jSONArray.put(((com.sankuai.waimai.alita.core.event.a) priorityQueue.poll()).l());
                    }
                    hashMap.put("value", jSONArray.toString());
                    com.sankuai.waimai.alita.core.utils.c.b("alita_ar", (String) null, "backtrace_end", (Map<String, Object>) hashMap);
                    f.this.c.run();
                }
            });
        }
    }

    public static /* synthetic */ boolean a(f fVar, boolean z) {
        fVar.f = true;
        return true;
    }

    static {
        HandlerThread handlerThread = new HandlerThread("");
        handlerThread.start();
        d = new Handler(handlerThread.getLooper());
    }

    public f(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "358021746e378f1686f61a5cfe69572b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "358021746e378f1686f61a5cfe69572b");
            return;
        }
        this.e = new PriorityQueue<>(10, new Comparator<com.sankuai.waimai.alita.core.event.a>() { // from class: com.sankuai.waimai.alita.core.event.autorunner.f.1
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(com.sankuai.waimai.alita.core.event.a aVar, com.sankuai.waimai.alita.core.event.a aVar2) {
                com.sankuai.waimai.alita.core.event.a aVar3 = aVar;
                com.sankuai.waimai.alita.core.event.a aVar4 = aVar2;
                Object[] objArr2 = {aVar3, aVar4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "396570b96c653a97e457865b27425800", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "396570b96c653a97e457865b27425800")).intValue() : Long.compare(aVar3.f(), aVar4.f());
            }
        });
        this.c = new Runnable() { // from class: com.sankuai.waimai.alita.core.event.autorunner.f.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f8942c9cf3644df46ff804eba8fbb39", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f8942c9cf3644df46ff804eba8fbb39");
                } else if (f.this.e.isEmpty()) {
                } else {
                    com.sankuai.waimai.alita.core.event.a aVar = (com.sankuai.waimai.alita.core.event.a) f.this.e.remove();
                    com.sankuai.waimai.alita.core.event.a aVar2 = (com.sankuai.waimai.alita.core.event.a) f.this.e.peek();
                    if (aVar2 != null) {
                        f.d.postDelayed(this, Math.min(500L, aVar2.f() - aVar.f()));
                    }
                    f.this.b.b(aVar);
                }
            }
        };
        this.b = dVar;
    }

    @Override // com.sankuai.waimai.alita.core.event.autorunner.g
    public final void a(final com.sankuai.waimai.alita.core.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28b2fe238618742d714ded312ba5ffbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28b2fe238618742d714ded312ba5ffbd");
        } else {
            d.post(new Runnable() { // from class: com.sankuai.waimai.alita.core.event.autorunner.f.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca24bd3d6a37c40deb2d5992f7b99393", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca24bd3d6a37c40deb2d5992f7b99393");
                    } else if (!f.this.f || !f.this.e.isEmpty()) {
                        f.this.e.add(aVar);
                    } else {
                        f.this.b.b(aVar);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(Map<String, Object> map, String str) {
        Object obj;
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f68dbf051634547815d57280bb5f10f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f68dbf051634547815d57280bb5f10f");
        }
        if (!map.containsKey(str) || (obj = map.get(str)) == null) {
            return null;
        }
        return obj.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc182f67549e88a8710a2e53c4b02491", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc182f67549e88a8710a2e53c4b02491")).longValue();
        }
        try {
            String e = e(map, str);
            if (TextUtils.isEmpty(e)) {
                return 0L;
            }
            return Long.parseLong(e);
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3012dd1b9e12d27216060db10f933761", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3012dd1b9e12d27216060db10f933761")).intValue();
        }
        try {
            String e = e(map, str);
            if (TextUtils.isEmpty(e)) {
                return 0;
            }
            return Integer.parseInt(e);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> h(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b3a1e692ce53e72c26a8a6c35568544", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b3a1e692ce53e72c26a8a6c35568544");
        }
        try {
            String e = e(map, str);
            return TextUtils.isEmpty(e) ? Collections.emptyMap() : k.a(e);
        } catch (Exception unused) {
            return Collections.emptyMap();
        }
    }
}
