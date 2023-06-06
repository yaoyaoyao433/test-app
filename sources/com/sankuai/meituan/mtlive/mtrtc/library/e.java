package com.sankuai.meituan.mtlive.mtrtc.library;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.sankuai.meituan.mtlive.core.c {
    public static ChangeQuickRedirect h;
    private List<Integer> i;
    private Map<Integer, String> j;
    private Map<Integer, String> k;

    public e() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        private static final e a = new e();
    }

    public static e e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c91766754748b6d86f378f76f223dea6", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c91766754748b6d86f378f76f223dea6") : a.a;
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1565feca9c8101bf07e8f61219c8406e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1565feca9c8101bf07e8f61219c8406e");
            return;
        }
        super.a();
        this.i = new ArrayList();
        this.i.add(Integer.valueOf(this.b));
        this.j = new HashMap();
        this.j.put(Integer.valueOf(this.b), "com.sankuai.meituan.mtlive.engine.mtrtc.tx.TxTRTCEngine");
        this.k = new HashMap();
        this.k.put(Integer.valueOf(this.b), "com.sankuai.meituan.mtlive.mtrtc.tx.MTTxRTCCloud");
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final Map<Integer, String> c() {
        return this.j;
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final Map<Integer, String> d() {
        return this.k;
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final List<Integer> b() {
        return this.i;
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final int b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a54d8faa33e1f31760d3561c1e46068", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a54d8faa33e1f31760d3561c1e46068")).intValue() : a(i, com.sankuai.meituan.mtlive.core.c.f, i2);
    }
}
