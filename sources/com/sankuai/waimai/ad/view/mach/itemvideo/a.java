package com.sankuai.waimai.ad.view.mach.itemvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.view.mach.tierslide.b;
import com.sankuai.waimai.ad.view.mach.tierslide.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.platform.mach.videoextend.a implements b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.b
    public final String d() {
        return "wm-item-video";
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feef276dc3cb6c47343d2370715f66c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feef276dc3cb6c47343d2370715f66c9");
        } else if (this.c != null) {
            this.c.e = i;
            if (this.c.f()) {
                this.c.a("c_m84bv26", null);
                this.c.e();
            }
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.b
    public final void aa_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fad1defb16540fe662a4cc76f7b354b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fad1defb16540fe662a4cc76f7b354b4");
        } else if (this.c == null || this.c.f()) {
        } else {
            this.c.b();
            this.c.d();
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.b
    public final void ab_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "993824517a58f5be6ec23877d5838e46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "993824517a58f5be6ec23877d5838e46");
            return;
        }
        a(0);
        if (this.c == null) {
            return;
        }
        this.c.c();
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.b
    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fbaafb1458cb1968888a19ece22e1b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fbaafb1458cb1968888a19ece22e1b4")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.f();
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.b
    public final long a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e60c01422f18d7e4d8907a7643fb643", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e60c01422f18d7e4d8907a7643fb643")).longValue();
        }
        if (dVar == null) {
            return 0L;
        }
        return dVar.g;
    }
}
