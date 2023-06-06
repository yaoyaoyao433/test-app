package com.sankuai.waimai.rocks.view;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.rocks.view.recyclerview.RocksLinearLayoutManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.rocks.node.b b;
    boolean c;
    private Context d;
    private int e;
    private int f;
    private boolean g;

    public b(Context context, int i, int i2, boolean z) {
        Object[] objArr = {context, Integer.valueOf(i), 0, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a49e31e3aa4a390537f9cb35aeb41280", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a49e31e3aa4a390537f9cb35aeb41280");
            return;
        }
        this.d = context;
        this.e = i;
        this.f = 0;
        this.g = z;
    }

    public final RecyclerView.LayoutManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fa9fcf80141d86cbc6bdd1cfc49ba3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.LayoutManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fa9fcf80141d86cbc6bdd1cfc49ba3b");
        }
        if (this.b == null) {
            RocksLinearLayoutManager rocksLinearLayoutManager = new RocksLinearLayoutManager(this.d);
            rocksLinearLayoutManager.setOrientation(1);
            return rocksLinearLayoutManager;
        } else if (this.g) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
            staggeredGridLayoutManager.setGapStrategy(0);
            return staggeredGridLayoutManager;
        } else {
            String str = this.b.a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3094652) {
                if (hashCode != 3135355) {
                    if (hashCode == 3322014 && str.equals(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)) {
                        c = 2;
                    }
                } else if (str.equals("fall")) {
                    c = 0;
                }
            } else if (str.equals("dual")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = new StaggeredGridLayoutManager(2, 1);
                    staggeredGridLayoutManager2.setGapStrategy(0);
                    return staggeredGridLayoutManager2;
                case 1:
                    return new GridLayoutManager(this.d, 2);
                default:
                    RocksLinearLayoutManager rocksLinearLayoutManager2 = new RocksLinearLayoutManager(this.d);
                    rocksLinearLayoutManager2.setOrientation(1);
                    return rocksLinearLayoutManager2;
            }
        }
    }

    public final void a(com.sankuai.waimai.rocks.node.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "116ea963fee438a9c1a5bfb0eae7e31c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "116ea963fee438a9c1a5bfb0eae7e31c");
        } else if (this.b == null) {
            throw new IllegalArgumentException("Root Rocks Node is null");
        } else {
            int i2 = this.b.q.a + this.b.q.b + this.b.q.e + this.b.q.f;
            int i3 = aVar.q.a + aVar.q.b + aVar.q.e + aVar.q.f;
            String str = this.b.a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3094652) {
                if (hashCode != 3135355) {
                    if (hashCode == 3322014 && str.equals(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)) {
                        c = 2;
                    }
                } else if (str.equals("fall")) {
                    c = 0;
                }
            } else if (str.equals("dual")) {
                c = 1;
            }
            switch (c) {
                case 0:
                case 1:
                    aVar.q.m = ((g.a(this.d) - g.a(this.d, i2 + this.b.q.i)) / 2) - g.a(this.d, i3);
                    if (this.c) {
                        aVar.q.g = (i == 0 || i == 1) ? this.b.q.k : this.b.q.j;
                    } else {
                        aVar.q.g = (i == 0 || i == 1) ? this.b.q.g : this.b.q.j;
                    }
                    aVar.q.f = this.b.q.i;
                    return;
                case 2:
                    aVar.q.m = (g.a(this.d) - g.a(this.d, i2)) - g.a(this.d, i3);
                    aVar.q.g = this.b.q.g;
                    aVar.q.l = this.b.q.l;
                    if (this.c) {
                        aVar.q.c = i == 0 ? this.b.q.k : this.b.q.j;
                    } else {
                        aVar.q.c = i == 0 ? this.b.q.c : this.b.q.j;
                    }
                    aVar.q.d = this.b.q.d;
                    a(aVar, i2, i3);
                    return;
                default:
                    return;
            }
        }
    }

    private void a(com.sankuai.waimai.rocks.node.a aVar, int i, int i2) {
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e175e6538a240471683698df4343bdf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e175e6538a240471683698df4343bdf0");
        } else if (aVar.b()) {
            for (com.sankuai.waimai.rocks.node.a aVar2 : aVar.k) {
                aVar2.q.m = (g.a(this.d) - g.a(this.d, i)) - g.a(this.d, i2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r2.equals("fall") != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.sankuai.waimai.rocks.model.a b() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.rocks.view.b.a
            java.lang.String r10 = "b8f07b857d4f1e273319bf9f97d104ad"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            com.sankuai.waimai.rocks.model.a r0 = (com.sankuai.waimai.rocks.model.a) r0
            return r0
        L1b:
            com.sankuai.waimai.rocks.model.a r1 = new com.sankuai.waimai.rocks.model.a
            r1.<init>()
            com.sankuai.waimai.rocks.node.b r2 = r11.b
            if (r2 == 0) goto Lc7
            com.sankuai.waimai.rocks.node.b r2 = r11.b
            com.sankuai.waimai.rocks.model.a r2 = r2.q
            if (r2 == 0) goto Lc7
            com.sankuai.waimai.rocks.node.b r2 = r11.b
            com.sankuai.waimai.rocks.model.a r2 = r2.q
            int r2 = r2.e
            r1.e = r2
            r1.g = r0
            com.sankuai.waimai.rocks.node.b r2 = r11.b
            com.sankuai.waimai.rocks.model.a r2 = r2.q
            int r2 = r2.h
            r1.h = r2
            com.sankuai.waimai.rocks.node.b r2 = r11.b
            java.lang.String r2 = r2.a
            r3 = -1
            int r4 = r2.hashCode()
            r5 = 3094652(0x2f387c, float:4.336531E-39)
            if (r4 == r5) goto L69
            r5 = 3135355(0x2fd77b, float:4.393568E-39)
            if (r4 == r5) goto L60
            r0 = 3322014(0x32b09e, float:4.655133E-39)
            if (r4 == r0) goto L55
            goto L73
        L55:
            java.lang.String r0 = "list"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L73
            r0 = 2
            goto L74
        L60:
            java.lang.String r4 = "fall"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L73
            goto L74
        L69:
            java.lang.String r0 = "dual"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L73
            r0 = 1
            goto L74
        L73:
            r0 = -1
        L74:
            switch(r0) {
                case 0: goto L80;
                case 1: goto L80;
                default: goto L77;
            }
        L77:
            com.sankuai.waimai.rocks.node.b r0 = r11.b
            com.sankuai.waimai.rocks.model.a r0 = r0.q
            int r0 = r0.f
            r1.f = r0
            goto L8f
        L80:
            com.sankuai.waimai.rocks.node.b r0 = r11.b
            com.sankuai.waimai.rocks.model.a r0 = r0.q
            int r0 = r0.f
            com.sankuai.waimai.rocks.node.b r2 = r11.b
            com.sankuai.waimai.rocks.model.a r2 = r2.q
            int r2 = r2.i
            int r0 = r0 - r2
            r1.f = r0
        L8f:
            com.sankuai.waimai.rocks.node.b r0 = r11.b
            com.sankuai.waimai.rocks.model.a r0 = r0.q
            int r0 = r0.a
            r1.a = r0
            com.sankuai.waimai.rocks.node.b r0 = r11.b
            com.sankuai.waimai.rocks.model.a r0 = r0.q
            int r0 = r0.c
            r1.c = r0
            com.sankuai.waimai.rocks.node.b r0 = r11.b
            com.sankuai.waimai.rocks.model.a r0 = r0.q
            int r0 = r0.b
            r1.b = r0
            com.sankuai.waimai.rocks.node.b r0 = r11.b
            com.sankuai.waimai.rocks.model.a r0 = r0.q
            int r0 = r0.d
            r1.d = r0
            com.sankuai.waimai.rocks.node.b r0 = r11.b
            com.sankuai.waimai.rocks.model.a r0 = r0.q
            int r0 = r0.i
            r1.i = r0
            com.sankuai.waimai.rocks.node.b r0 = r11.b
            com.sankuai.waimai.rocks.model.a r0 = r0.q
            int r0 = r0.j
            r1.j = r0
            com.sankuai.waimai.rocks.node.b r0 = r11.b
            com.sankuai.waimai.rocks.model.a r0 = r0.q
            int r0 = r0.l
            r1.l = r0
        Lc7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.rocks.view.b.b():com.sankuai.waimai.rocks.model.a");
    }
}
