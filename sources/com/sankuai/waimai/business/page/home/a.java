package com.sankuai.waimai.business.page.home;

import android.arch.lifecycle.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.HomeSecondFloorResponse;
import com.sankuai.waimai.business.page.home.preload.bean.NetBean;
import com.sankuai.waimai.business.page.home.preload.bean.RcmdNetBean;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.popup.ugc.UGCFeedGuideFullScreenDialog;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    HomePageFragment c;
    l<WMLocation> d;
    l<WmAddress> e;
    l<RcmdNetBean> f;
    l<NetBean> g;
    l<Boolean> h;
    l<HomeSecondFloorResponse> i;
    l<com.sankuai.waimai.business.page.home.model.e> j;
    l<com.sankuai.waimai.business.page.home.model.e> k;

    public static /* synthetic */ void a(a aVar, WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "b5565943efa09345c468a2279a12fe09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "b5565943efa09345c468a2279a12fe09");
            return;
        }
        if (aVar.c.B != null) {
            ad.b(aVar.c.B);
        } else {
            aVar.c.B = new Runnable() { // from class: com.sankuai.waimai.business.page.home.a.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6ed96b0a12fcac26e8fa6856b766a8d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6ed96b0a12fcac26e8fa6856b766a8d");
                    } else if (a.this.c.j != null) {
                        a.this.c.j.a();
                    }
                }
            };
        }
        ad.a(aVar.c.B, 1000L);
        aVar.c.j.a(true);
        if (aVar.c.C != null) {
            aVar.c.C.a(true);
        }
        aVar.c.j.a(wmAddress);
        if (com.sankuai.waimai.foundation.core.a.d() && aVar.c.m != null) {
            aVar.c.m.d(true);
        }
        HomePageFragment homePageFragment = aVar.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = HomePageFragment.d;
        if (PatchProxy.isSupport(objArr2, homePageFragment, changeQuickRedirect2, false, "aa94eb6b1fcbe52ca260000e2c73419a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, homePageFragment, changeQuickRedirect2, false, "aa94eb6b1fcbe52ca260000e2c73419a");
            return;
        }
        City n = g.a().n();
        if ((n == null ? "" : n.getCityCode()).equals(homePageFragment.s)) {
            return;
        }
        com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(new UGCFeedGuideFullScreenDialog.b());
        homePageFragment.c();
    }

    public a(HomePageFragment homePageFragment) {
        Object[] objArr = {homePageFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90ff405d866b80cf5bf4d3356a8db1d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90ff405d866b80cf5bf4d3356a8db1d4");
        } else {
            this.c = homePageFragment;
        }
    }
}
