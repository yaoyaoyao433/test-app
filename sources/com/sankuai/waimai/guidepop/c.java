package com.sankuai.waimai.guidepop;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.guidepop.GuidePopInfo;
import com.sankuai.waimai.guidepop.b;
import com.sankuai.waimai.guidepop.utils.d;
import com.sankuai.waimai.platform.utils.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements b.InterfaceC0954b {
    public static ChangeQuickRedirect a;
    GuidePopInfo b;
    a c;
    int d;
    private c e;
    private Activity f;
    private boolean g;
    private q h;
    private Map<Long, Integer> i;
    private b j;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(com.sankuai.waimai.guidepop.b bVar);

        void a(com.sankuai.waimai.guidepop.b bVar, boolean z);

        void b(com.sankuai.waimai.guidepop.b bVar);
    }

    private c(Activity activity, GuidePopInfo guidePopInfo, a aVar) {
        Object[] objArr = {activity, guidePopInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53d814f1e0a27e69510c4c99ec0737c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53d814f1e0a27e69510c4c99ec0737c8");
            return;
        }
        this.d = 0;
        this.j = new b();
        this.b = guidePopInfo;
        this.f = activity;
        this.c = aVar;
        this.h = q.a(activity.getApplicationContext(), "waimai_guide_pop", 1);
    }

    private boolean e() {
        return this.e != null;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "776978046784d10c9468491d57975288", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "776978046784d10c9468491d57975288");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        boolean z = true;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94da10e571998e7fbc01abd9c8c0f782", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94da10e571998e7fbc01abd9c8c0f782")).booleanValue();
        } else {
            GuidePopInfo.DSPStrategy dSPStrategy = this.b.viewData.dspStrategy;
            if (dSPStrategy != null && dSPStrategy.frequency != null) {
                String str = dSPStrategy.frequency.frequencyKey;
                long j = dSPStrategy.frequency.time;
                int i = dSPStrategy.frequency.count;
                com.sankuai.waimai.guidepop.utils.b.a("[GuidePopQueue - isWithinFrequency],frequencyKey：" + str + "，count:" + i + "，time:" + j);
                if (!TextUtils.isEmpty(str) && j != 0 && i != 0 && a(str) >= i) {
                    z = false;
                }
            }
        }
        if (!z) {
            com.sankuai.waimai.guidepop.utils.b.a("[GuidePopTaskQueue] is not within frequency");
            com.sankuai.waimai.guidepop.utils.b.a("GuidePopOverFrequency", Float.valueOf(1.0f), this.b.viewData.locationArea, this.b.viewData.locationFlag);
            f();
        } else if (d()) {
            c();
        } else if (!this.g) {
            b();
        } else if (this.c != null) {
            this.c.a();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc4d89b3849501ee515b39a05c73ab48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc4d89b3849501ee515b39a05c73ab48");
            return;
        }
        com.sankuai.waimai.guidepop.utils.b.a("[GuidePopQueue - showDelay]");
        this.g = true;
        l.a(new Runnable() { // from class: com.sankuai.waimai.guidepop.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "becbff6f0fd6505472d2048550ad8828", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "becbff6f0fd6505472d2048550ad8828");
                    return;
                }
                c.this.d++;
                com.sankuai.waimai.guidepop.utils.b.a("[GuidePopQueue - showDelay tryTimes:]" + c.this.d);
                if (c.this.d()) {
                    c.this.c();
                } else if (c.this.d < 4) {
                    c.this.b();
                } else {
                    if (c.this.c != null) {
                        c.this.c.a();
                    }
                    com.sankuai.waimai.guidepop.utils.b.a("GuidePopAnchorRenderTimeout", Float.valueOf(1.0f), c.this.b.viewData.locationArea, c.this.b.viewData.locationFlag);
                }
            }
        }, 500, "GUIDE_POP_WAIT_TASK");
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f38ea217709515f0416c75a3d0bbe36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f38ea217709515f0416c75a3d0bbe36");
            return;
        }
        com.sankuai.waimai.guidepop.utils.b.a("[GuidePopQueue - showDialogNow]");
        b.a aVar = new b.a(this.f, this.b);
        aVar.c = this;
        com.sankuai.waimai.guidepop.b a2 = aVar.a();
        if (a2.a()) {
            g();
            if (this.c != null) {
                this.c.a(a2);
                return;
            }
            return;
        }
        f();
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80fa9297d71039d86ee5e9fd7214153e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80fa9297d71039d86ee5e9fd7214153e");
            return;
        }
        com.sankuai.waimai.guidepop.utils.b.a("[GuidePopTaskQueue] showNext");
        if (e()) {
            this.e.g = this.g;
            this.e.a();
        } else if (this.c != null) {
            this.c.a();
        }
    }

    private int a(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77aa68747bca604a3888d826d77c3564", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77aa68747bca604a3888d826d77c3564")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        Map<Long, Integer> b2 = b(str);
        if (b2 != null && !b2.isEmpty()) {
            Iterator<Map.Entry<Long, Integer>> it = b2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Long, Integer> next = it.next();
                if (next.getKey().compareTo(Long.valueOf(System.currentTimeMillis() / 1000)) < 0) {
                    it.remove();
                    com.sankuai.waimai.guidepop.utils.b.a("[GuidePopQueue - getCacheCount],时间过期，remove countEntry:" + next);
                } else {
                    i += next.getValue().intValue();
                }
            }
        }
        com.sankuai.waimai.guidepop.utils.b.a("[GuidePopQueue - getCacheCount],cacheCount:" + i);
        return i;
    }

    private Map<Long, Integer> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2460dc1356a9c8f108b0e75996f5414b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2460dc1356a9c8f108b0e75996f5414b");
        }
        if (this.i == null) {
            this.i = (Map) this.h.a(str, this.j);
        }
        return this.i;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2a88e0112bfaeff2ee91a26446f0398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2a88e0112bfaeff2ee91a26446f0398");
            return;
        }
        GuidePopInfo.DSPStrategy dSPStrategy = this.b.viewData.dspStrategy;
        if (dSPStrategy == null || dSPStrategy.frequency == null || TextUtils.isEmpty(dSPStrategy.frequency.frequencyKey)) {
            return;
        }
        long j = dSPStrategy.frequency.time;
        String str = dSPStrategy.frequency.frequencyKey;
        if (a(str) == 0) {
            HashMap hashMap = new HashMap();
            hashMap.put(Long.valueOf(j), 1);
            this.h.a(str, (String) hashMap, (ag<String>) this.j);
            com.sankuai.waimai.guidepop.utils.b.a("[GuidePopQueue - saveCount],cacheCountMap(new):" + hashMap);
            return;
        }
        Map<Long, Integer> b2 = b(str);
        Integer num = b2.get(Long.valueOf(j));
        if (num == null || num.intValue() == 0) {
            b2.put(Long.valueOf(j), 1);
        } else {
            b2.put(Long.valueOf(j), Integer.valueOf(num.intValue() + 1));
        }
        this.h.a(str, (String) b2, (ag<String>) this.j);
        com.sankuai.waimai.guidepop.utils.b.a("[GuidePopQueue - saveCount],cacheCountMap:" + b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements ag<Map<Long, Integer>> {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // com.meituan.android.cipstorage.ag
        public final /* synthetic */ Map<Long, Integer> deserializeFromString(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6b06be36ae5136a029fbe61a5fbcaa0", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6b06be36ae5136a029fbe61a5fbcaa0") : (Map) d.a(str, new TypeToken<Map<Long, Integer>>() { // from class: com.sankuai.waimai.guidepop.c.b.1
            }.getType());
        }

        @Override // com.meituan.android.cipstorage.ag
        public final /* synthetic */ String serializeAsString(Map<Long, Integer> map) {
            Map<Long, Integer> map2 = map;
            Object[] objArr = {map2};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "084c7912a46d7b117836a12d252e6e1b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "084c7912a46d7b117836a12d252e6e1b") : d.a(map2);
        }
    }

    boolean d() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7514a615c1b1a18e979f01638e2cd3ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7514a615c1b1a18e979f01638e2cd3ec")).booleanValue();
        }
        View a2 = com.sankuai.waimai.guidepop.utils.c.a(this.f.getWindow().getDecorView(), this.b.viewData.locationArea.split(";")[0]);
        if (a2 != null && a2.getVisibility() == 0 && a2.getHeight() != 0) {
            z = true;
        }
        com.sankuai.waimai.guidepop.utils.b.a("[GuidePopQueue - showDialog] areaViewIsVisible:" + z);
        return z;
    }

    @Override // com.sankuai.waimai.guidepop.b.InterfaceC0954b
    public final void a(com.sankuai.waimai.guidepop.b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81c9fb82f0fd5d8991347146991e30dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81c9fb82f0fd5d8991347146991e30dc");
        } else if (this.c != null) {
            this.c.a(bVar, z);
        }
    }

    @Override // com.sankuai.waimai.guidepop.b.InterfaceC0954b
    public final void a(com.sankuai.waimai.guidepop.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d3818073193e5a281a4ee9a043f1b7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d3818073193e5a281a4ee9a043f1b7a");
        } else if (this.c != null) {
            this.c.b(bVar);
        }
    }

    public static c a(Activity activity, List<GuidePopInfo> list, a aVar) {
        Object[] objArr = {activity, list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        c cVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f89c13fa765cbf313c0ff96c03e62b45", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f89c13fa765cbf313c0ff96c03e62b45");
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            GuidePopInfo guidePopInfo = list.get(size);
            if (guidePopInfo != null) {
                GuidePopInfo.GuidePopData guidePopData = guidePopInfo.viewData;
                if (guidePopData == null || TextUtils.isEmpty(guidePopData.locationArea) || TextUtils.isEmpty(guidePopData.locationFlag) || TextUtils.isEmpty(guidePopData.mainPic)) {
                    com.sankuai.waimai.guidepop.utils.b.a("[GuidePopTaskQueue - buildChain] guidePopData error.");
                } else {
                    c cVar2 = new c(activity, guidePopInfo, aVar);
                    cVar2.e = cVar;
                    cVar = cVar2;
                }
            }
        }
        return cVar;
    }
}
