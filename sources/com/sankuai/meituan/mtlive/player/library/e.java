package com.sankuai.meituan.mtlive.player.library;

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
    public static class a {
        private static final e a = new e();
    }

    public static e e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dcc7c6156cb03363d927178968e60f73", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dcc7c6156cb03363d927178968e60f73") : a.a;
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92dec1745582b1c6243a8cefc4ce100d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92dec1745582b1c6243a8cefc4ce100d");
            return;
        }
        super.a();
        this.i = new ArrayList();
        this.i.add(Integer.valueOf(this.b));
        this.i.add(Integer.valueOf(this.c));
        this.j = new HashMap();
        this.j.put(Integer.valueOf(this.b), "com.sankuai.meituan.mtlive.engine.player.tx.TxPlayerEngine");
        this.j.put(Integer.valueOf(this.c), "com.sankuai.meituan.riverrunplayer.engine.RiverRunPlayerEngine");
        this.k = new HashMap();
        this.k.put(Integer.valueOf(this.b), "com.sankuai.meituan.mtlive.player.mlvb.MTTxPlayer");
        this.k.put(Integer.valueOf(this.c), "com.sankuai.meituan.riverrunplayer.player.MTRiverRunPlayer");
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

    public final int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c134765029d5e95d3f4db88ee324b5af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c134765029d5e95d3f4db88ee324b5af")).intValue();
        }
        if ("com.sankuai.meituan.mtlive.player.mlvb.MTTxPlayer".equals(str)) {
            return this.b;
        }
        if ("com.sankuai.meituan.riverrunplayer.player.MTRiverRunPlayer".equals(str)) {
            return this.c;
        }
        return -1;
    }

    @Override // com.sankuai.meituan.mtlive.core.c
    public final int b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5146b536b1b0ac3258c58c9a08248207", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5146b536b1b0ac3258c58c9a08248207")).intValue() : a(i, com.sankuai.meituan.mtlive.core.c.e, i2);
    }
}
