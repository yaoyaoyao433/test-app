package com.sankuai.waimai.business.page.home;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    HomePageFragment b;
    boolean c;
    boolean d;
    long e;
    long f;
    long g;

    public b(HomePageFragment homePageFragment) {
        Object[] objArr = {homePageFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8933a5b5e1eb7febb86eac27c46ce57f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8933a5b5e1eb7febb86eac27c46ce57f");
            return;
        }
        this.c = false;
        this.d = false;
        this.e = 1800000L;
        this.f = Long.MAX_VALUE;
        this.g = Long.MAX_VALUE;
        this.b = homePageFragment;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eccdcb7a994fc1d46bfd8b4d6e859081", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eccdcb7a994fc1d46bfd8b4d6e859081");
            return;
        }
        WMLocation p = g.a().p();
        if (com.sankuai.waimai.platform.model.c.a().b() != 3 && (p == null || p.getLatitude() == 0.0d || p.getLongitude() == 0.0d)) {
            this.b.j.a(this.b);
            return;
        }
        this.b.e.post(new Runnable() { // from class: com.sankuai.waimai.business.page.home.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b013983954599a5f2daa835cf251ec8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b013983954599a5f2daa835cf251ec8");
                    return;
                }
                b.this.b.e.fling(0, 0);
                b.this.b.e.scrollToPosition(0);
                if (b.this.b.m != null) {
                    b.this.b.m.e(true);
                }
            }
        });
        if (i == 1 || i == 4 || i == 5 || i == 6) {
            this.b.m.T = true;
        }
        if ((i == 0 || i == 1 || i == 2 || i == 4 || i == 5 || i == 6) && this.b.m != null) {
            this.b.m.i(true);
        }
        this.b.h.a(i);
        if (this.b.m != null) {
            this.b.m.h(true);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddc7a66c35d0b6096ea6a7709c1c8c98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddc7a66c35d0b6096ea6a7709c1c8c98");
        } else if (this.b.getActivity() == null || this.b.getActivity().isFinishing() || this.b.f == null) {
        } else {
            if (g.a().p() != null || com.sankuai.waimai.platform.model.c.a().c()) {
                a(6);
                this.b.A = false;
            }
        }
    }
}
