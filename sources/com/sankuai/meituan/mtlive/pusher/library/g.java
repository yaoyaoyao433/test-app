package com.sankuai.meituan.mtlive.pusher.library;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends com.sankuai.meituan.mtlive.core.c {
    public static ChangeQuickRedirect h;
    Map<Integer, String> i;
    private List<Integer> j;
    private Map<Integer, String> k;
    private Map<Integer, String> l;

    public g() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        private static final g a = new g();
    }

    public static g e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5112e3eba18a0b968a5b6e99464093ff", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5112e3eba18a0b968a5b6e99464093ff") : a.a;
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "801daf217ef9600f4d0f19ba8a7ed9de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "801daf217ef9600f4d0f19ba8a7ed9de");
            return;
        }
        super.a();
        this.j = new ArrayList();
        this.j.add(Integer.valueOf(this.b));
        this.j.add(Integer.valueOf(this.c));
        this.k = new HashMap();
        this.k.put(Integer.valueOf(this.b), "com.sankuai.meituan.mtlive.engine.pusher.tx.TxPusherEngine");
        this.k.put(Integer.valueOf(this.c), "com.sankuai.meituan.mtlive.pusher.riverrun.RiverRunPusherEngine");
        this.l = new HashMap();
        this.l.put(Integer.valueOf(this.b), "com.sankuai.meituan.mtlive.pusher.mlvb.MTTxPusher");
        this.l.put(Integer.valueOf(this.c), "com.sankuai.meituan.mtlive.pusher.riverrun.MTRiverRunPusher");
        this.i = new HashMap();
        this.i.put(Integer.valueOf(this.b), "com.sankuai.meituan.mtlive.pusher.mlvb.MTTxPusherConfig");
        this.i.put(Integer.valueOf(this.c), "com.sankuai.meituan.mtlive.pusher.riverrun.MTRiverRunPusherConfig");
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final Map<Integer, String> c() {
        return this.k;
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final Map<Integer, String> d() {
        return this.l;
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final List<Integer> b() {
        return this.j;
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final int b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "216ed925ae0c334413b2dba777681a6e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "216ed925ae0c334413b2dba777681a6e")).intValue() : a(i, com.sankuai.meituan.mtlive.core.c.d, i2);
    }
}
