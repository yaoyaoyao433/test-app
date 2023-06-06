package com.sankuai.waimai.business.page.kingkong.future.network;

import android.text.TextUtils;
import com.meituan.android.cube.pga.common.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.common.net.request.a;
import com.sankuai.waimai.business.page.home.utils.k;
import com.sankuai.waimai.business.page.kingkong.future.ai.a;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.rocks.view.recyclerview.b b;
    public com.sankuai.waimai.business.page.kingkong.future.ai.a c;
    public a.b d;
    int e;
    public long f;
    private double g;
    private double h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private com.sankuai.waimai.business.page.common.net.request.a n;
    private com.sankuai.waimai.business.page.kingkong.a o;

    public e(com.sankuai.waimai.business.page.kingkong.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "347dd9a14a87048f4fb380c24ea1c0d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "347dd9a14a87048f4fb380c24ea1c0d7");
            return;
        }
        this.g = 40.032609d;
        this.h = 116.417441d;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 20;
        this.e = 0;
        this.o = aVar;
        aVar.bK.a(new com.meituan.android.cube.pga.action.b<com.sankuai.waimai.rocks.view.recyclerview.b>() { // from class: com.sankuai.waimai.business.page.kingkong.future.network.e.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(com.sankuai.waimai.rocks.view.recyclerview.b bVar) {
                com.sankuai.waimai.rocks.view.recyclerview.b bVar2 = bVar;
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ef318ff3f95e308011f9f330b7f15e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ef318ff3f95e308011f9f330b7f15e3");
                } else {
                    e.this.b = bVar2;
                }
            }
        });
        aVar.aa.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.page.kingkong.future.network.e.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f5fa2eef7a555b74fbb387ce90727b7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f5fa2eef7a555b74fbb387ce90727b7");
                } else {
                    e.this.e = num2.intValue();
                }
            }
        });
    }

    public final com.sankuai.waimai.business.page.common.net.request.a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fa2276cecb0f3a2b9e813d452ae9240", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.page.common.net.request.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fa2276cecb0f3a2b9e813d452ae9240");
        }
        if (this.n == null) {
            this.n = a(false, i);
        }
        com.sankuai.waimai.business.page.kingkong.future.ai.b.a().e = this.n;
        this.k = d(i);
        if (this.k == 0) {
            this.j = 0;
            this.i = 0;
            this.o.aa.a((j<Integer>) 0);
            this.n.p = "";
        } else {
            this.j++;
            this.i++;
        }
        this.n.q = a();
        if (this.b != null) {
            com.sankuai.waimai.business.page.kingkong.future.ai.b.a().b(this.b.u());
        }
        this.n.t = c(i);
        this.n.d = this.i;
        this.n.e = this.l;
        this.n.r = this.j;
        this.n.s = this.k;
        KingkongInfo kingkongInfo = this.o.w.a().b;
        if (kingkongInfo != null) {
            this.n.i = kingkongInfo.g;
            this.n.u = com.sankuai.waimai.business.page.kingkong.b.a(kingkongInfo) == com.sankuai.waimai.business.page.kingkong.b.FOOD ? 1 : 2;
        }
        com.sankuai.waimai.business.page.kingkong.future.ai.b.a().a(this.n.i);
        if (i == 1) {
            this.n.k = "";
            this.n.l = "";
            this.n.f = com.sankuai.waimai.platform.privacy.a.a().b() ? 1L : 0L;
        } else {
            com.sankuai.waimai.business.page.common.model.b bVar = this.o.C.a().b;
            if (bVar != null) {
                this.n.k = com.sankuai.waimai.business.page.common.model.b.a(bVar != null ? bVar.c : null);
                this.n.l = com.sankuai.waimai.business.page.common.model.b.b(bVar != null ? bVar.e : null);
                this.n.f = bVar.f;
            }
        }
        this.m = i;
        return this.n;
    }

    private String c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a9b009f7669494e082d1fcc7897d6a0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a9b009f7669494e082d1fcc7897d6a0") : com.sankuai.waimai.business.page.kingkong.future.ai.b.a().a(i);
    }

    private com.sankuai.waimai.business.page.common.net.request.a a(boolean z, int i) {
        Object[] objArr = {(byte) 0, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c97afcc3d03665c5fdb30f615848c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.page.common.net.request.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c97afcc3d03665c5fdb30f615848c7");
        }
        double[] e = g.e();
        if (e != null) {
            this.g = e[0];
            this.h = e[1];
        }
        long j = (long) (this.g * 1000000.0d);
        long j2 = (long) (this.h * 1000000.0d);
        if (i == 6) {
            i = 3;
        }
        String str = (i != 3 || this.n == null) ? "" : this.n.p;
        KingkongInfo kingkongInfo = this.o.w.a().b;
        if (kingkongInfo == null) {
            kingkongInfo = new KingkongInfo();
        }
        com.sankuai.waimai.business.page.common.model.b bVar = this.o.C.a().b;
        a.C0763a g = new a.C0763a().a(j).b(j2).c(bVar != null ? bVar.f : 0L).d(kingkongInfo.b).e(0L).f(kingkongInfo.g).g(kingkongInfo.d);
        g.k = com.sankuai.waimai.business.page.common.model.b.a(bVar != null ? bVar.c : null);
        g.l = com.sankuai.waimai.business.page.common.model.b.b(bVar != null ? bVar.e : null);
        g.m = i;
        g.n = 0;
        g.o = "";
        g.p = str;
        g.s = a();
        return g.a();
    }

    public final com.sankuai.waimai.business.page.common.net.request.a b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "294c5686ecec1bb59cad793811da5955", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.page.common.net.request.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "294c5686ecec1bb59cad793811da5955");
        }
        if (this.n == null) {
            this.n = a(false, i);
        }
        return this.n;
    }

    private String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db5f93f16b94434a67ce6169a4b850d5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db5f93f16b94434a67ce6169a4b850d5");
        }
        if (this.k == 0 || this.n == null) {
            return TextUtils.isEmpty(a.g) ? ListIDHelper.a.a.a() : a.g;
        }
        ListIDHelper listIDHelper = ListIDHelper.a.a;
        return listIDHelper.a("page", k.l + CommonConstant.Symbol.UNDERLINE + this.n.i);
    }

    private int d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3132aa504cf0fe4e612b6b4bb4d057a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3132aa504cf0fe4e612b6b4bb4d057a9")).intValue();
        }
        if (this.d == null) {
            if ((i == 3 || i == 6) && this.b != null) {
                return this.b.u();
            }
            return 0;
        } else if (i == 3) {
            return this.d.d - this.e;
        } else {
            if (i == 6) {
                return this.d.c + 1 + com.sankuai.waimai.business.page.common.list.ai.g.a().b;
            }
            return 0;
        }
    }
}
