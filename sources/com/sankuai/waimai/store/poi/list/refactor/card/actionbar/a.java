package com.sankuai.waimai.store.poi.list.refactor.card.actionbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.mrn.SGUtilsModule;
import com.sankuai.waimai.store.platform.domain.core.tip.SCShareTip;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock;
import com.sankuai.waimai.store.repository.model.MemberInfoEntity;
import com.sankuai.waimai.store.repository.model.NavigationTileConfig;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.monitor.monitor.SGChannelTitleMonitor;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    private final ChannelNavMachViewBlock.c A;
    private com.sankuai.waimai.store.im.number.b B;
    protected final com.sankuai.waimai.store.param.a b;
    protected final com.sankuai.waimai.store.poi.list.callback.a c;
    protected final FragmentActivity d;
    protected PoiVerticalityDataResponse e;
    protected boolean f;
    protected ViewGroup g;
    protected ImageView h;
    protected LinearLayout i;
    protected ImageView j;
    protected ImageView k;
    protected ChannelNavMachViewBlock l;
    protected LottieAnimationView m;
    protected int n;
    protected int o;
    protected int p;
    protected String q;
    protected ImageView r;
    protected ImageView s;
    protected ImageView t;
    protected boolean u;
    boolean v;
    String w;
    private String x;
    private boolean y;
    private ChannelNavMachViewBlock.b z;

    public abstract void a(int i, View view, @Nullable View view2);

    public abstract void a(@Nullable MemberInfoEntity memberInfoEntity);

    public void a(PoiVerticalityDataResponse.Promotion promotion, @Nullable NavigationTileConfig navigationTileConfig) {
    }

    public abstract void a(String str);

    public abstract void b(int i, View view, @Nullable View view2);

    public abstract void c(int i);

    public abstract void d(int i);

    public void e(String str) {
    }

    public abstract void g();

    public abstract void h();

    public a(@NonNull FragmentActivity fragmentActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.poi.list.callback.a aVar2) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eba600fb7faa7644d5f80bf894e3f5b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eba600fb7faa7644d5f80bf894e3f5b0");
            return;
        }
        this.q = "";
        this.u = true;
        this.v = false;
        this.A = new ChannelNavMachViewBlock.c() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b08f1c25aa851399074378fcf4f983a5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b08f1c25aa851399074378fcf4f983a5");
                } else {
                    a.this.g();
                }
            }

            @Override // com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.c
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79816761a3dccc47443dc2dd3e3746c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79816761a3dccc47443dc2dd3e3746c6");
                    return;
                }
                a.this.g.setVisibility(4);
                a.this.h();
            }

            @Override // com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.c
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51a9f8e37f02598e825b0a77e613aa48", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51a9f8e37f02598e825b0a77e613aa48");
                    return;
                }
                a.this.i();
                a.this.j();
            }

            @Override // com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.c
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de11c6f7fbaf6b9789547564119ba353", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de11c6f7fbaf6b9789547564119ba353");
                } else {
                    a.this.a(k.d() ? a.this.c(a.this.e) : a.this.b(a.this.e));
                }
            }
        };
        this.B = new com.sankuai.waimai.store.im.number.b() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.im.number.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "343c5e8fe0b177073b3b5ec0659ec4f8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "343c5e8fe0b177073b3b5ec0659ec4f8");
                    return;
                }
                a.this.p = i;
                com.meituan.android.bus.a.a().c(new com.sankuai.waimai.store.poi.list.refactor.event.k(i));
            }
        };
        this.d = fragmentActivity;
        this.b = aVar;
        this.c = aVar2;
        this.f = true;
        this.n = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_2);
        this.o = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_10);
        com.meituan.android.bus.a.a().a(this);
        com.sankuai.waimai.store.im.number.d.a().a(this.B);
        this.z = new ChannelNavMachViewBlock.b() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poi.list.newp.sg.ChannelNavMachViewBlock.b
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f16d0d6c632fcc32a2954ea94322e7bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f16d0d6c632fcc32a2954ea94322e7bd");
                    return;
                }
                a.this.v = true;
                a.this.w = str;
                if (!a.this.u || TextUtils.isEmpty(str)) {
                    return;
                }
                a.this.a(str);
            }
        };
    }

    public final SCBaseActivity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4de3c21dd1662f8c826baeda5eea73d", RobustBitConfig.DEFAULT_VALUE)) {
            return (SCBaseActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4de3c21dd1662f8c826baeda5eea73d");
        }
        if (this.d instanceof SCBaseActivity) {
            return (SCBaseActivity) this.d;
        }
        throw new RuntimeException("Activity of cube block must be SCBaseActivity!");
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f88d3fad127b461b6fabbb23d8363a5a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f88d3fad127b461b6fabbb23d8363a5a") : layoutInflater.inflate(R.layout.wm_st_poi_channel_actionbar_main, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3c37f82cd40f32ac5e7524b0381e93e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3c37f82cd40f32ac5e7524b0381e93e");
            return;
        }
        super.onResume();
        if (this.l != null) {
            this.l.onResume();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae5daff22730b8c8c71ab853ff14ac42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae5daff22730b8c8c71ab853ff14ac42");
        } else {
            super.onViewCreated();
        }
    }

    public final void b(String str) {
        int i;
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e00618bcf633aa846dd338b4b88f414a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e00618bcf633aa846dd338b4b88f414a");
            return;
        }
        if (str.equals("1")) {
            i = -1;
            z = false;
        } else {
            i = -14539738;
        }
        a(z);
        b(z);
        c(i);
    }

    public final void a(com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "694cbfe1794c685065b99fffcf75e5b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "694cbfe1794c685065b99fffcf75e5b5");
        } else if (aVar.Z) {
            a(aVar.Y);
            b(aVar.Y);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "063a093404f4584a1797cb33a3061809", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "063a093404f4584a1797cb33a3061809");
        } else if (this.r == null || this.r.getVisibility() != 0) {
        } else {
            this.r.setBackgroundResource(z ? R.drawable.wm_sc_search_shopcart_dark : R.drawable.wm_sc_search_shopcart_light);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6af0db2b7d830e7ba449cafb71791a85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6af0db2b7d830e7ba449cafb71791a85");
        } else if (this.s == null || this.s.getVisibility() != 0) {
        } else {
            this.s.setBackgroundResource(z ? R.drawable.wm_sc_search_more_information_dark : R.drawable.wm_sc_search_more_information_light);
        }
    }

    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d09b424223858531456f102326b4b78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d09b424223858531456f102326b4b78");
            return;
        }
        if (this.mView != null) {
            this.m = (LottieAnimationView) this.mView.findViewById(R.id.sg_img_top_bg);
            ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
            layoutParams.height = h.a(a(), 48.0f) + u.a();
            this.m.setLayoutParams(layoutParams);
        }
        if (this.mView != null) {
            View findViewById = this.mView.findViewById(R.id.minutes_animate_action_search_outer);
            if (!this.b.aS) {
                if (this.b.y) {
                    findViewById = this.mView.findViewById(R.id.animate_home_action_search_outer);
                } else {
                    findViewById = this.mView.findViewById(R.id.animate_channel_action_search_outer);
                }
            }
            if (findViewById != null) {
                findViewById.setPadding(findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight(), h.a(getContext(), !z ? 10.0f : 0.0f));
            }
        }
    }

    public final <T extends View> T b(@IdRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49ff9e966926d6374e4016c5b38a1322", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49ff9e966926d6374e4016c5b38a1322");
        }
        if (getView() == null) {
            return null;
        }
        return (T) getView().findViewById(i);
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2724d58ad749f1e4f8650f2adf8b251", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2724d58ad749f1e4f8650f2adf8b251");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(this.b.G, "b_hrjso8hz").a("cat_id", str).a("cate_id", str).a("stid", this.b.T).a("has_word", Integer.valueOf(this.b.U)).a("entry_type", Integer.valueOf(this.b.aS ? 1 : 0)).a();
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "721cda4159408f50cdbc269a67d9c26c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "721cda4159408f50cdbc269a67d9c26c");
            return;
        }
        super.onDestroy();
        if (this.l != null) {
            this.l.onDestroy();
        }
        com.meituan.android.bus.a.a().b(this);
        com.sankuai.waimai.store.im.number.d.a().b(this.B);
    }

    public void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        List<PoiVerticalityDataResponse.BannerPic> list;
        int c;
        boolean z;
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f15e2fa074d79c988ebe80afd03c82d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f15e2fa074d79c988ebe80afd03c82d");
            return;
        }
        this.e = poiVerticalityDataResponse;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d6ac05a6d48299928aff0e5cc4e0a91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d6ac05a6d48299928aff0e5cc4e0a91");
        } else if (this.f && this.l != null) {
            BaseModuleDesc baseModuleDesc = new BaseModuleDesc();
            baseModuleDesc.templateId = "supermarket-home-nav";
            baseModuleDesc.moduleId = "supermarket-home-nav";
            baseModuleDesc.jsonData = k();
            if (this.e != null && this.e.getNavigationBlock() != null && this.e.getNavigationBlock().data != null) {
                baseModuleDesc.functionEntranceList = this.e.getNavigationBlock().data.functionEntranceList;
            }
            this.l.b((ChannelNavMachViewBlock) baseModuleDesc);
            ChannelNavMachViewBlock channelNavMachViewBlock = this.l;
            PoiVerticalityDataResponse poiVerticalityDataResponse2 = this.e;
            Object[] objArr3 = {poiVerticalityDataResponse2};
            ChangeQuickRedirect changeQuickRedirect3 = ChannelNavMachViewBlock.a;
            if (PatchProxy.isSupport(objArr3, channelNavMachViewBlock, changeQuickRedirect3, false, "4e7187f18802a76f589c28fe8c68ca13", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, channelNavMachViewBlock, changeQuickRedirect3, false, "4e7187f18802a76f589c28fe8c68ca13");
            } else if (poiVerticalityDataResponse2 != null && poiVerticalityDataResponse2.getBackgroundPromotion() != null && (c = com.sankuai.shangou.stone.util.a.c((list = poiVerticalityDataResponse2.getBackgroundPromotion().bannerBackgroundPicList))) != 0) {
                channelNavMachViewBlock.i.clear();
                for (int i = 0; i < c; i++) {
                    PoiVerticalityDataResponse.BannerPic bannerPic = list.get(i);
                    channelNavMachViewBlock.i.add(bannerPic == null ? "-1" : bannerPic.topBarColor);
                }
                if (channelNavMachViewBlock.i != null && channelNavMachViewBlock.i.size() > 0) {
                    channelNavMachViewBlock.a(0);
                }
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e71ba38218191f37cb3e7aad3957e3da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e71ba38218191f37cb3e7aad3957e3da");
        } else if (this.e != null) {
            NavigationTileConfig navigationTileConfig = this.e.getNavigationBlock() != null ? this.e.getNavigationBlock().propsData : null;
            if (navigationTileConfig != null) {
                com.sankuai.waimai.store.param.a aVar = this.b;
                PoiVerticalityDataResponse poiVerticalityDataResponse3 = this.e;
                Object[] objArr5 = {poiVerticalityDataResponse3};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3468bab1bb474723d50950fd27d10a5b", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3468bab1bb474723d50950fd27d10a5b")).booleanValue();
                } else {
                    if (poiVerticalityDataResponse3 != null) {
                        NavigationTileConfig navigationTileConfig2 = poiVerticalityDataResponse3.getNavigationBlock() != null ? poiVerticalityDataResponse3.getNavigationBlock().propsData : null;
                        if (navigationTileConfig2 != null && navigationTileConfig2.include_maicai_poi == 1) {
                            z = true;
                        }
                    }
                    z = false;
                }
                aVar.aO = z;
                if (!TextUtils.isEmpty(navigationTileConfig.mt_globalcart_scheme)) {
                    this.b.aM = navigationTileConfig.mt_globalcart_scheme;
                }
                if (TextUtils.isEmpty(navigationTileConfig.mtMsgScheme)) {
                    this.b.aN = navigationTileConfig.mtMsgScheme;
                }
                this.b.bb = this.b.aS && navigationTileConfig.isShowTitlePointPic == 1;
                this.b.bc = this.b.aS && navigationTileConfig.isShowTitlePointPic == 1 && !(t.a(navigationTileConfig.interestPointPic) && t.a(navigationTileConfig.interestPointPicDark));
            }
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "fd0886bf784353f8c3fd3d4e77a9996b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "fd0886bf784353f8c3fd3d4e77a9996b");
        } else if (this.e != null) {
            NavigationTileConfig navigationTileConfig3 = this.e.getNavigationBlock() != null ? this.e.getNavigationBlock().propsData : null;
            if (navigationTileConfig3 == null || !this.b.be) {
                return;
            }
            this.g.getLayoutParams().height = 0;
            this.g.getLayoutParams().width = 1;
            u.c(this.g);
            g();
            this.h = (ImageView) b(R.id.iv_new_with_flowers_title);
            u.a(this.h);
            this.i = (LinearLayout) b(R.id.ll_new_with_flowers_container);
            u.a(this.i);
            this.j = (ImageView) b(R.id.iv_new_with_flowers_main_title);
            this.k = (ImageView) b(R.id.iv_new_with_flowers_sub_title);
            a(navigationTileConfig3.centerTitlePic, this.j);
            a(navigationTileConfig3.centerSubTitlePic, this.k);
            a(navigationTileConfig3.pageTitleUrl, this.h);
        }
    }

    public final boolean b() {
        PoiVerticalityDataResponse.Promotion backgroundPromotion;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a6c3c93a955b88c89074bc21ed02213", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a6c3c93a955b88c89074bc21ed02213")).booleanValue() : (this.e == null || (backgroundPromotion = this.e.getBackgroundPromotion()) == null || backgroundPromotion.buttonArea == null) ? false : true;
    }

    public final PoiVerticalityDataResponse.ButtonArea c() {
        PoiVerticalityDataResponse.Promotion backgroundPromotion;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba8001fe9d78aa311bdce366e604a836", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiVerticalityDataResponse.ButtonArea) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba8001fe9d78aa311bdce366e604a836");
        }
        if (this.e == null || (backgroundPromotion = this.e.getBackgroundPromotion()) == null) {
            return null;
        }
        return backgroundPromotion.buttonArea;
    }

    public final int d() {
        return this.b.Y ? -14539738 : -1;
    }

    public final int e() {
        View findViewById;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "587b528f94fd20636a90d27d17c876b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "587b528f94fd20636a90d27d17c876b5")).intValue();
        }
        if (this.mView != null) {
            if (this.b.y) {
                findViewById = this.mView.findViewById(R.id.animate_home_action_search_outer);
            } else {
                findViewById = this.mView.findViewById(R.id.animate_channel_action_search_outer);
            }
            if (this.b.aS) {
                findViewById = this.mView.findViewById(R.id.minutes_animate_action_search_outer);
            }
            if (findViewById != null) {
                int[] iArr = new int[2];
                findViewById.getLocationInWindow(iArr);
                return (int) (iArr[1] + (findViewById.getHeight() * 0.65f));
            }
            return -1;
        }
        return -1;
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "143202188c663ee049f70f12dc50ecbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "143202188c663ee049f70f12dc50ecbe");
            return;
        }
        this.g = (ViewGroup) b(R.id.nav_mach_content);
        if (this.f) {
            this.g.setVisibility(0);
            this.l = new ChannelNavMachViewBlock((SCBaseActivity) this.d, this.g, this.b);
            this.l.l = this.A;
            this.l.bindView(this.g);
            this.l.j = this.z;
            g();
            return;
        }
        this.g.setVisibility(4);
    }

    private void a(String str, ImageView imageView) {
        Object[] objArr = {str, imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "342badcb5540c7d1968f0114b939bdb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "342badcb5540c7d1968f0114b939bdb6");
        } else if (t.a(str) || imageView == null || this.mContext == null) {
        } else {
            b.C0608b a2 = m.a(str, h.a(this.mContext), ImageQualityUtil.a());
            a2.g = false;
            a2.k = 4;
            a2.a(imageView);
        }
    }

    public final void a(int i, ImageView imageView) {
        Object[] objArr = {-16777216, imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69fdf9b6dc4425e53dea062029b22c31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69fdf9b6dc4425e53dea062029b22c31");
        } else if (imageView != null) {
            imageView.setColorFilter(-16777216);
        }
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eff18f8fea1dc2d2266d2a72d33a328b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eff18f8fea1dc2d2266d2a72d33a328b");
        } else if (this.l != null) {
            if (this.x == null || !TextUtils.equals(this.x, this.q)) {
                HashMap hashMap = new HashMap();
                hashMap.put(GearsLocator.ADDRESS, this.q);
                this.x = this.q;
                this.l.a("home_nav_change_location", hashMap);
            }
        }
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50ae514ce6e1824a5a3fdb738cdf500e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50ae514ce6e1824a5a3fdb738cdf500e");
        } else if (this.l == null || this.y) {
        } else {
            this.y = true;
            new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "873fd00d28ed9291e47957323d023555", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "873fd00d28ed9291e47957323d023555");
                        return;
                    }
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put(GearsLocator.ADDRESS, a.this.q);
                        a.this.l.a("home_nav_change_location", hashMap);
                    } catch (Exception unused) {
                    }
                }
            }, 4000L);
        }
    }

    public HashMap<String, Object> k() {
        String str;
        String str2;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd46694c16d59793d3fee132eebfc87f", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd46694c16d59793d3fee132eebfc87f");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        PoiVerticalityDataResponse poiVerticalityDataResponse = this.e;
        Object[] objArr2 = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "306775472609b64c34ea5ac6c3b0d5f4", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "306775472609b64c34ea5ac6c3b0d5f4");
        } else {
            str = "";
            if (poiVerticalityDataResponse != null) {
                NavigationTileConfig navigationTileConfig = poiVerticalityDataResponse.getNavigationBlock() != null ? poiVerticalityDataResponse.getNavigationBlock().propsData : null;
                if (navigationTileConfig != null && !TextUtils.isEmpty(navigationTileConfig.pageTitle)) {
                    str = navigationTileConfig.pageTitle;
                }
            }
        }
        hashMap.put("title", str);
        hashMap.put("msgNum", 0);
        hashMap.put("is_minute_buy", Integer.valueOf(this.b.aS ? 1 : 0));
        PoiVerticalityDataResponse poiVerticalityDataResponse2 = this.e;
        Object[] objArr3 = {poiVerticalityDataResponse2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8b196fde6f66da7ad501d0392d0a7d61", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8b196fde6f66da7ad501d0392d0a7d61");
        } else {
            str2 = "";
            if (poiVerticalityDataResponse2 != null) {
                PoiVerticalityDataResponse.Promotion backgroundPromotion = poiVerticalityDataResponse2.getBackgroundPromotion();
                NavigationTileConfig navigationTileConfig2 = poiVerticalityDataResponse2.getNavigationBlock() != null ? poiVerticalityDataResponse2.getNavigationBlock().propsData : null;
                if (backgroundPromotion != null && !TextUtils.isEmpty(backgroundPromotion.pageTitleUrl)) {
                    str2 = backgroundPromotion.pageTitleUrl;
                } else if (navigationTileConfig2 != null && !TextUtils.isEmpty(navigationTileConfig2.pageTitleUrl)) {
                    str2 = navigationTileConfig2.pageTitleUrl;
                }
                String str3 = str2;
                Object[] objArr4 = {str3, navigationTileConfig2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4b1ffbc59cfd5d2f261b0191b7f5ebda", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4b1ffbc59cfd5d2f261b0191b7f5ebda");
                } else {
                    String str4 = "";
                    if (navigationTileConfig2 != null && !TextUtils.isEmpty(navigationTileConfig2.pageTitle)) {
                        str4 = navigationTileConfig2.pageTitle;
                    }
                    z = (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3)) ? true : true;
                    com.sankuai.waimai.store.util.monitor.b.a().a(z ? SGChannelTitleMonitor.HasTitle : SGChannelTitleMonitor.NotTitleError).c(this.b.y ? "home" : "channel").a(z).a("channel_code", String.valueOf(this.b.c)).a();
                }
                str2 = str3;
            }
        }
        hashMap.put("title_url", str2);
        hashMap.put("showLocate", Integer.valueOf(this.b.e() ? 1 : 0));
        hashMap.put(GearsLocator.ADDRESS, this.q);
        hashMap.put("navigation", n());
        hashMap.put("background", o());
        return hashMap;
    }

    private Object n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c818c45811c228770094e2ff25d71053", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c818c45811c228770094e2ff25d71053");
        }
        try {
            return TextUtils.isEmpty((this.e == null || this.e.getNavigationBlock() == null) ? null : this.e.getNavigationBlock().jsonStr) ? new JSONObject() : new JSONObject(this.e.getNavigationBlock().jsonStr);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        }
    }

    private Object o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "166724c9cb4621855adcb7d5252985d2", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "166724c9cb4621855adcb7d5252985d2");
        }
        try {
            boolean a2 = j.h().a(SCConfigPath.HOME_BACKGROUND_TILE_OPT, false);
            String str = (this.e == null || this.e.pageConfig == null) ? null : this.e.pageConfig.jsonStr;
            String str2 = (this.e == null || this.e.getBackgroundBlock() == null) ? null : this.e.getBackgroundBlock().jsonStr;
            if (!a2) {
                str = str2;
            }
            return TextUtils.isEmpty(str) ? new JSONObject() : new JSONObject(str);
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        }
    }

    public final SCShareTip b(@Nullable PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "506da33ef5467f360273e2136d09ea2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (SCShareTip) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "506da33ef5467f360273e2136d09ea2f");
        }
        if (poiVerticalityDataResponse != null) {
            NavigationTileConfig navigationTileConfig = poiVerticalityDataResponse.getNavigationBlock() != null ? poiVerticalityDataResponse.getNavigationBlock().propsData : null;
            if (navigationTileConfig != null && !TextUtils.isEmpty(navigationTileConfig.shareInfoWM)) {
                return (SCShareTip) i.a(navigationTileConfig.shareInfoWM, new TypeToken<SCShareTip>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a.4
                }.getType());
            }
        }
        return null;
    }

    public final SCShareTip c(@Nullable PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17314c2186768b6ce93a9e19964a0f80", RobustBitConfig.DEFAULT_VALUE)) {
            return (SCShareTip) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17314c2186768b6ce93a9e19964a0f80");
        }
        if (poiVerticalityDataResponse != null) {
            NavigationTileConfig navigationTileConfig = poiVerticalityDataResponse.getNavigationBlock() != null ? poiVerticalityDataResponse.getNavigationBlock().propsData : null;
            if (navigationTileConfig != null && !TextUtils.isEmpty(navigationTileConfig.shareInfoMT)) {
                return (SCShareTip) i.a(navigationTileConfig.shareInfoMT, new TypeToken<SCShareTip>() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a.5
                }.getType());
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r21, float r22, android.view.View r23, int r24) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a.a(android.view.View, float, android.view.View, int):void");
    }

    private void a(final String str, final int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e86fa254760efb5264e88a4a0f580b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e86fa254760efb5264e88a4a0f580b8");
        } else if (this.m != null) {
            b.C0608b a2 = m.a(str, h.a(this.mContext), ImageQualityUtil.a());
            a2.g = false;
            a2.k = 4;
            a2.a(new b.a() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Matrix matrix;
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a22c35c66af484f55b26806ba63a5e3a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a22c35c66af484f55b26806ba63a5e3a");
                        return;
                    }
                    a aVar = a.this;
                    LottieAnimationView lottieAnimationView = a.this.m;
                    Object[] objArr3 = {bitmap, lottieAnimationView};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "56d1485db1f71c6915d8341173586a63", RobustBitConfig.DEFAULT_VALUE)) {
                        matrix = (Matrix) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "56d1485db1f71c6915d8341173586a63");
                    } else {
                        Matrix matrix2 = new Matrix();
                        Object[] objArr4 = {bitmap, lottieAnimationView};
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        float floatValue = PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "0d153364aa1b13f13460a22367427a0c", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "0d153364aa1b13f13460a22367427a0c")).floatValue() : (lottieAnimationView.getWidth() * 1.0f) / bitmap.getWidth();
                        Object[] objArr5 = {bitmap, lottieAnimationView};
                        ChangeQuickRedirect changeQuickRedirect5 = a.a;
                        float max = Math.max(floatValue, PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "623c6a3d5cab87811ce2454d2a28c84c", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "623c6a3d5cab87811ce2454d2a28c84c")).floatValue() : (lottieAnimationView.getHeight() * 1.0f) / bitmap.getHeight());
                        matrix2.setScale(max, max);
                        Object[] objArr6 = {bitmap, Float.valueOf(max), lottieAnimationView};
                        ChangeQuickRedirect changeQuickRedirect6 = a.a;
                        matrix2.postTranslate(PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "04595c804745f90ad7a07340016d73eb", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "04595c804745f90ad7a07340016d73eb")).floatValue() : (-((bitmap.getWidth() * max) - lottieAnimationView.getWidth())) / 2.0f, 0.0f);
                        matrix = matrix2;
                    }
                    a.this.m.setScaleType(ImageView.ScaleType.MATRIX);
                    a.this.m.setImageMatrix(matrix);
                    a.this.m.setImageAlpha(i);
                    b.C0608b a3 = m.a(str, h.a(a.this.mContext), ImageQualityUtil.a());
                    a3.g = false;
                    a3.k = 4;
                    a3.a((ImageView) a.this.m);
                }
            });
        }
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dc97cc1453ff08a6594795f490dd513", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dc97cc1453ff08a6594795f490dd513");
        } else if (this.e == null) {
        } else {
            if (this.b.aS || !this.b.y) {
                String str = "";
                String str2 = "";
                PoiChannelBackgroundConfig backgroundConfig = this.e.getBackgroundConfig();
                if (backgroundConfig != null) {
                    str = backgroundConfig.minuteHeadDefBgUrl;
                    str2 = backgroundConfig.minuteHeadTopBgUrl;
                }
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    return;
                }
                a(str2, 255);
            }
        }
    }

    private void a(View view, int i, int i2, int i3) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6e956da65c535f0601d28174f1f01ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6e956da65c535f0601d28174f1f01ad");
            return;
        }
        Drawable a2 = e.a(this.mContext, new int[]{i2, i3}, R.dimen.wm_sc_common_dimen_0, GradientDrawable.Orientation.TL_BR);
        a2.setAlpha(i);
        view.setBackground(a2);
    }

    public final void a(SCShareTip sCShareTip) {
        Object[] objArr = {sCShareTip};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc2f4e63cedeed2ea693c24f9fbe634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc2f4e63cedeed2ea693c24f9fbe634");
        } else if (sCShareTip == null) {
        } else {
            if (k.b()) {
                sCShareTip.setMiniprogramType(0);
            } else {
                sCShareTip.setMiniprogramType(2);
            }
            String screenShot = SGUtilsModule.getScreenShot((SCBaseActivity) this.mContext);
            if (!t.a(screenShot)) {
                sCShareTip.setIcon(screenShot);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("source", 11);
            HashMap hashMap = new HashMap();
            hashMap.put("channel_id", sCShareTip.getChannels());
            com.sankuai.waimai.store.manager.share.a.a((SCBaseActivity) this.mContext, sCShareTip, null, null, bundle, hashMap);
        }
    }

    public final boolean d(@Nullable PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3221e8bee8064213af204b236aa38cac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3221e8bee8064213af204b236aa38cac")).booleanValue();
        }
        if (poiVerticalityDataResponse != null) {
            NavigationTileConfig navigationTileConfig = poiVerticalityDataResponse.getNavigationBlock() != null ? poiVerticalityDataResponse.getNavigationBlock().propsData : null;
            return navigationTileConfig != null && navigationTileConfig.hide_globalcart == 0;
        }
        return false;
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0c9ce2f8f9d7454063d18c356b973a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0c9ce2f8f9d7454063d18c356b973a1");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bid", this.b.aO ? "b_waimai_v7hjhkuz_mc" : "b_ay8J4");
        hashMap.put("cat_id", Long.valueOf(this.b.c));
        hashMap.put("stid", this.b.T);
        com.sankuai.waimai.store.manager.judas.b.a(this.b.G, hashMap);
    }

    public final void a(PageEventHandler pageEventHandler) {
        Object[] objArr = {pageEventHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "983e6c1d3f1a3f73f01d2ee3bd397107", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "983e6c1d3f1a3f73f01d2ee3bd397107");
            return;
        }
        pageEventHandler.a((PageEventHandler) new com.sankuai.waimai.store.poi.list.newp.block.rxevent.c((Activity) this.mContext));
        com.sankuai.waimai.store.manager.user.a.a(this.mContext, new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "341f2115efa0b2ba7f518e3cf6df5a3e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "341f2115efa0b2ba7f518e3cf6df5a3e");
                } else if (k.d() && !TextUtils.isEmpty(a.this.b.aM)) {
                    Context context = a.this.getContext();
                    String str = a.this.b.aM;
                    Object[] objArr3 = {context, str};
                    ChangeQuickRedirect changeQuickRedirect3 = g.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "db4a6d2218b2649fae7e10388f772e10", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "db4a6d2218b2649fae7e10388f772e10");
                    } else {
                        com.sankuai.waimai.store.router.d.a(context, str);
                    }
                } else if (!TextUtils.isEmpty(a.this.b.aL)) {
                    g.a(a.this.getContext(), a.this.b.aL);
                } else {
                    g.a(a.this.getContext());
                }
            }
        });
    }

    public final void a(Context context, com.sankuai.waimai.store.param.a aVar, String str) {
        Object[] objArr = {context, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6655e22db598ee46fd56b67228d6c4d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6655e22db598ee46fd56b67228d6c4d4");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cat_id", Long.valueOf(aVar.c));
        hashMap.put("entry_type", Integer.valueOf(aVar.aS ? 1 : 0));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bid", str);
        hashMap2.put("cat_id", Long.valueOf(aVar.c));
        com.sankuai.waimai.store.manager.judas.b.a(aVar.G, hashMap2);
        com.sankuai.waimai.store.manager.judas.b.a(context, str).b(hashMap).a();
    }

    public final void a(Context context, com.sankuai.waimai.store.param.a aVar, int i) {
        String str;
        Object[] objArr = {context, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "519319e663004ec8b143ba317f332cf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "519319e663004ec8b143ba317f332cf8");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cat_id", Long.valueOf(aVar.c));
        hashMap.put("entry_type", Integer.valueOf(aVar.aS ? 1 : 0));
        HashMap hashMap2 = new HashMap();
        boolean z = aVar.aO;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a786f40b8758c65c9c705c2006a270f", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a786f40b8758c65c9c705c2006a270f");
        } else if (i == 4) {
            str = "b_kSuht";
        } else if (i == 11) {
            str = z ? "b_waimai_1xehriwk_mc" : "b_waimai_h6lkdgkx_mc";
        } else if (i != 18) {
            switch (i) {
                case 15:
                    if (!z) {
                        str = "b_waimai_ka2ljjp4_mc";
                        break;
                    } else {
                        str = "b_waimai_el74u5ia_mc";
                        break;
                    }
                case 16:
                    if (!z) {
                        str = "b_waimai_3g7qvms6_mc";
                        break;
                    } else {
                        str = "b_waimai_b84oei0u_mc";
                        break;
                    }
                default:
                    str = "";
                    break;
            }
        } else {
            str = "b_waimai_8797a5cl_mc";
        }
        hashMap2.put("bid", str);
        hashMap2.put("cat_id", Long.valueOf(aVar.c));
        com.sankuai.waimai.store.manager.judas.b.a(aVar.G, hashMap2);
        com.sankuai.waimai.store.manager.judas.b.a(context, str).b(hashMap).a();
    }

    public final void b(Context context, com.sankuai.waimai.store.param.a aVar, String str) {
        Object[] objArr = {context, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90bfa095402263d53fe8cbbcf9ee5ab0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90bfa095402263d53fe8cbbcf9ee5ab0");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cat_id", Long.valueOf(aVar.c));
        hashMap.put("entry_type", Integer.valueOf(aVar.aS ? 1 : 0));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bid", str);
        hashMap2.put("cat_id", Long.valueOf(aVar.c));
        com.sankuai.waimai.store.manager.judas.b.a(aVar.G, hashMap2);
        com.sankuai.waimai.store.manager.judas.b.b(context, str).b(hashMap).a();
    }

    public final void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c310ec29ad52c6507ec1628a711f79e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c310ec29ad52c6507ec1628a711f79e");
        } else if (this.v) {
            if (i == 0) {
                this.l.k = true;
                this.u = true;
                if (TextUtils.isEmpty(this.w)) {
                    return;
                }
                a(this.w);
                this.l.b(this.w, true);
                return;
            }
            this.l.k = false;
            this.u = false;
            c(-14539738);
            a(true);
            b(true);
            this.l.b("0", true);
        }
    }
}
