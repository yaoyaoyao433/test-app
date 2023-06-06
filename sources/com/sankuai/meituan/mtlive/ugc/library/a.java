package com.sankuai.meituan.mtlive.ugc.library;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.meituan.mtlive.core.c {
    public static ChangeQuickRedirect h;
    Map<Integer, String> i;
    Map<Integer, String> j;
    Map<Integer, String> k;
    private List<Integer> l;
    private Map<Integer, String> m;
    private Map<Integer, String> n;
    private Map<Integer, String> o;
    private Map<Integer, String> p;

    public a() {
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mtlive.ugc.library.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0616a {
        private static final a a = new a();
    }

    public static a e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68e78e0826a72e577f47dba43333895e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68e78e0826a72e577f47dba43333895e") : C0616a.a;
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea98e95e07326bcb66edc1b5584f2306", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea98e95e07326bcb66edc1b5584f2306");
            return;
        }
        super.a();
        this.l = new ArrayList();
        this.l.add(Integer.valueOf(this.b));
        this.m = new HashMap();
        this.m.put(Integer.valueOf(this.b), "com.sankuai.meituan.mtlive.engine.ugc.tx.TxUgcEngine");
        this.n = new HashMap();
        this.n.put(Integer.valueOf(this.b), "");
        this.i = new HashMap();
        this.i.put(Integer.valueOf(this.b), "com.sankuai.meituan.mtlive.ugc.tx.MTTxUgcVideoInfoReader");
        this.o = new HashMap();
        this.o.put(Integer.valueOf(this.b), "com.sankuai.meituan.mtlive.ugc.tx.MTTxUgcPartsManager");
        this.j = new HashMap();
        this.j.put(Integer.valueOf(this.b), "com.sankuai.meituan.mtlive.ugc.tx.MTTxUgcRecord");
        this.p = new HashMap();
        this.p.put(Integer.valueOf(this.b), "com.sankuai.meituan.mtlive.ugc.tx.MTTxUgcVideoJoiner");
        this.k = new HashMap();
        this.k.put(Integer.valueOf(this.b), "com.sankuai.meituan.mtlive.ugc.tx.MTTxUgcVideoEditor");
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final Map<Integer, String> c() {
        return this.m;
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final Map<Integer, String> d() {
        return this.n;
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final List<Integer> b() {
        return this.l;
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final int b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "978e6efcffff8df8e3289fe143b9c58d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "978e6efcffff8df8e3289fe143b9c58d")).intValue() : a(i, com.sankuai.meituan.mtlive.core.c.g, i2);
    }
}
