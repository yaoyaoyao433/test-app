package com.sankuai.waimai.business.page.home.actionbar;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.utils.LocationUtils;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.business.page.common.arch.a {
    public static ChangeQuickRedirect v;
    private TextView A;
    private int B;
    private View C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private View.OnClickListener I;
    private HomePageFragment w;
    private View x;
    private View y;
    private HomeActionBarViewModel z;

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "bb3af7d8f0a5ea4ee931756999ccf9f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "bb3af7d8f0a5ea4ee931756999ccf9f9");
        } else {
            cVar.z.d = true;
        }
    }

    public c(HomePageFragment homePageFragment) {
        Object[] objArr = {homePageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8004f63a27bba52332ae894c95611a78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8004f63a27bba52332ae894c95611a78");
            return;
        }
        this.B = -1;
        this.I = new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.actionbar.c.5
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb3a144329387e2d1da005c84da2e6e1", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb3a144329387e2d1da005c84da2e6e1");
                } else if (c.this.z.d) {
                    HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(c.this.w).a(HomePageViewModel.class);
                    homePageViewModel.N = true;
                    if (g.a().p() == null) {
                        homePageViewModel.O = true;
                    } else {
                        homePageViewModel.O = false;
                    }
                    WmAddress k = g.a().k();
                    WMLocation i = g.a().i();
                    String address = k != null ? k.getAddress() : "";
                    if (i != null) {
                        LocationUtils.TransformData a2 = LocationUtils.a(i.getLongitude(), i.getLatitude());
                        JudasManualManager.a("b_waimai_rwrrf4bo_mc").a("c_m84bv26").a(GearsLocator.ADDRESS, address).a("ji", a2.ji).a("jf", a2.jf).a("wi", a2.wi).a("wf", a2.wf).a(c.this.w).a();
                    }
                    c.this.z.d = false;
                    c.this.z.a(c.this.w.getActivity());
                }
            }
        };
        this.w = homePageFragment;
        a((PageFragment) homePageFragment);
        this.D = this.w.getResources().getDimensionPixelSize(R.dimen.wm_privacy_action_bar_max_height);
        this.E = this.w.getResources().getDimensionPixelSize(R.dimen.wm_privacy_action_bar_min_height);
        this.F = this.w.getResources().getDimensionPixelSize(R.dimen.wm_privacy_action_bar_height_gap);
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void a(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "217d66ccc642f4b8ddf84b1f0b8808c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "217d66ccc642f4b8ddf84b1f0b8808c4");
            return;
        }
        this.z = (HomeActionBarViewModel) q.a(pageFragment).a(HomeActionBarViewModel.class);
        HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(pageFragment).a(HomePageViewModel.class);
        homePageViewModel.f.a(new l<d.a>() { // from class: com.sankuai.waimai.business.page.home.actionbar.c.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable d.a aVar) {
                d.a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2101a08a91609aefc4c54e7ba63ffefc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2101a08a91609aefc4c54e7ba63ffefc");
                } else if (aVar2 == null || !aVar2.equals(d.a.ON_RESUME)) {
                } else {
                    c.a(c.this);
                }
            }
        });
        homePageViewModel.i.a(pageFragment, new l<Integer>() { // from class: com.sankuai.waimai.business.page.home.actionbar.c.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Integer num) {
                ViewGroup.LayoutParams layoutParams;
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3abf2dda941c9c02e5d732d8a22b8d34", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3abf2dda941c9c02e5d732d8a22b8d34");
                } else if (num2 != null) {
                    if (num2.intValue() > c.this.F) {
                        num2 = Integer.valueOf(c.this.F);
                    }
                    if (c.this.y == null || (layoutParams = c.this.y.getLayoutParams()) == null) {
                        return;
                    }
                    if (num2.intValue() >= 0) {
                        layoutParams.height = c.this.G - num2.intValue();
                        c.a(c.this, c.this.G - num2.intValue());
                    } else {
                        layoutParams.height = c.this.H - num2.intValue();
                    }
                    c.this.y.setLayoutParams(layoutParams);
                }
            }
        });
        this.z.e.a(pageFragment, new l<Pair<Integer, Integer>>() { // from class: com.sankuai.waimai.business.page.home.actionbar.c.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Pair<Integer, Integer> pair) {
                Pair<Integer, Integer> pair2 = pair;
                Object[] objArr2 = {pair2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79d53a9ea5c5f20c706a58a260cd171c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79d53a9ea5c5f20c706a58a260cd171c");
                } else if (pair2 == null || c.this.B == pair2.second.intValue()) {
                } else {
                    c.this.B = pair2.second.intValue();
                    c.this.x.setY(pair2.second.intValue());
                }
            }
        });
        homePageViewModel.m.a(pageFragment, new l<Pair<String, Boolean>>() { // from class: com.sankuai.waimai.business.page.home.actionbar.c.4
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Pair<String, Boolean> pair) {
                Pair<String, Boolean> pair2 = pair;
                Object[] objArr2 = {pair2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "875673fbc6be08c9200a06d4b8d645b3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "875673fbc6be08c9200a06d4b8d645b3");
                } else if (pair2 == null || c.this.A == null) {
                } else {
                    c.this.A.setText(pair2.first);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe2714eb4c16cdcab4acc903ff773bb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe2714eb4c16cdcab4acc903ff773bb3");
        }
        this.x = viewGroup.findViewById(R.id.antion_bar_background_privicy);
        this.y = viewGroup.findViewById(R.id.action_bar_root_privacy);
        if (this.w.getActivity() != null && com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) this.w.getActivity())) {
            int e = com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a);
            this.y.measure(0, 0);
            this.y.getMeasuredHeight();
            ViewGroup.LayoutParams layoutParams = this.y.getLayoutParams();
            layoutParams.height += e;
            this.G = layoutParams.height;
            this.H = this.G;
            this.y.setLayoutParams(layoutParams);
            this.y.setPadding(0, e, 0, 0);
        }
        viewGroup.findViewById(R.id.layout_location_box_privacy).setOnClickListener(this.I);
        this.A = (TextView) viewGroup.findViewById(R.id.txt_location);
        this.C = viewGroup.findViewById(R.id.view_corner_bg);
        return this.x;
    }

    public static /* synthetic */ void a(c cVar, int i) {
        if (i < cVar.H) {
            cVar.H = i;
        }
    }
}
