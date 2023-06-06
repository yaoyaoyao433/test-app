package com.sankuai.waimai.alita.core.engine;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static volatile d c;
    private AtomicLong b;
    private final ArrayList<com.sankuai.waimai.alita.core.jsexecutor.c> d;
    private final Map<String, Long> e;
    private final Map<String, a> f;
    private com.sankuai.waimai.alita.core.jsexecutor.g g;
    private Set<String> h;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0de689a62824f8c72a9be2d6c384b96c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0de689a62824f8c72a9be2d6c384b96c");
            return;
        }
        this.b = new AtomicLong(0L);
        this.h = new HashSet();
        this.d = new ArrayList<>();
        this.e = new HashMap();
        this.f = new HashMap();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a13b49de75c83c04c38b432b20e9028", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a13b49de75c83c04c38b432b20e9028");
        }
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    c = new d();
                }
            }
        }
        return c;
    }

    public final a a(String str) {
        a aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3cbc40e5e75a4b89cc786d4ad2a6053", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3cbc40e5e75a4b89cc786d4ad2a6053");
        }
        synchronized (this) {
            aVar = this.f.get(str);
        }
        return aVar;
    }

    public final synchronized int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "399b8cdae2fb944718c929055256f63d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "399b8cdae2fb944718c929055256f63d")).intValue();
        }
        try {
            if (this.f.containsKey(str)) {
                return this.f.get(str).d.d;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    private com.sankuai.waimai.alita.core.jsexecutor.c a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30214e452202021b2bd7429a25ffd770", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.alita.core.jsexecutor.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30214e452202021b2bd7429a25ffd770");
        }
        int i = (int) ((j - 1) % 3);
        if (this.d.size() < i + 1) {
            com.sankuai.waimai.alita.core.jsexecutor.c cVar = new com.sankuai.waimai.alita.core.jsexecutor.c(com.meituan.android.singleton.b.a, j);
            this.d.add(cVar);
            return cVar;
        }
        return this.d.get(i);
    }

    public final a a(com.sankuai.waimai.alita.bundle.model.a aVar) {
        com.sankuai.waimai.alita.core.jsexecutor.c cVar;
        a aVar2;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc7afc2a13a1356dcb47e807d49250ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc7afc2a13a1356dcb47e807d49250ff");
        }
        if (aVar == null || TextUtils.isEmpty(aVar.c) || TextUtils.isEmpty(aVar.b)) {
            return null;
        }
        synchronized (this) {
            String a2 = aVar.f ? "main" : c.a(aVar.c);
            if (this.f.containsKey(a2)) {
                aVar2 = this.f.get(a2);
            } else {
                a aVar3 = new a();
                aVar3.a(aVar);
                aVar3.b = a2;
                Object[] objArr2 = {a2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9401be4e2b035e5d40e5a891cebc5dba", RobustBitConfig.DEFAULT_VALUE)) {
                    cVar = (com.sankuai.waimai.alita.core.jsexecutor.c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9401be4e2b035e5d40e5a891cebc5dba");
                } else if (this.e.containsKey(a2)) {
                    cVar = a(this.e.get(a2).longValue());
                } else {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    long longValue = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "042bb5975bd38f3e0733a6983f93a0dd", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "042bb5975bd38f3e0733a6983f93a0dd")).longValue() : this.b.incrementAndGet();
                    com.sankuai.waimai.alita.core.jsexecutor.c a3 = a(longValue);
                    this.e.put(a2, Long.valueOf(longValue));
                    cVar = a3;
                }
                aVar3.c = cVar;
                aVar3.e = false;
                this.f.put(a2, aVar3);
                aVar2 = aVar3;
            }
            if (aVar.f && this.g != null) {
                aVar2.a(aVar);
                aVar2.e = false;
                aVar2.c = this.g;
                this.h.add(a2);
            }
        }
        return aVar2;
    }
}
