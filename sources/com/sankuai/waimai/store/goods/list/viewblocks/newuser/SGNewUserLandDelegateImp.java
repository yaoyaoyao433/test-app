package com.sankuai.waimai.store.goods.list.viewblocks.newuser;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.goods.list.model.SGNewUserOptModel;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserStickLayout;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.atmosphere.SGNewUserOutLinkEvent;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.d;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.raptor.SGNewUserLocationRate;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.raptor.SGNewUserOutLinkRate;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.raptor.SGNewUserStickEvent;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.PrioritySmoothNestedScrollView;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.platform.domain.core.goods.SGNewUserLandResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.SGLocationUtils;
import com.sankuai.waimai.store.util.aa;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.a;
import com.sankuai.waimai.store.view.standard.FlashDialog;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGNewUserLandDelegateImp implements com.sankuai.waimai.store.base.a, d.b, e, j, com.sankuai.waimai.store.i.user.a, c.a {
    public static ChangeQuickRedirect a;
    private String A;
    private String B;
    private String C;
    private String D;
    private String E;
    private volatile boolean F;
    private boolean G;
    private String H;
    private SGNewUserOptModel I;
    private String J;
    private boolean K;
    private boolean L;
    private final MetricsSpeedMeterTask M;
    private SGNewUserAnchorUtils N;
    private View O;
    private SGNewUserStickLayout P;
    private int Q;
    private int R;
    private Dialog S;
    SCBaseActivity b;
    com.sankuai.waimai.store.manager.marketing.a c;
    h d;
    public String e;
    public String f;
    public String g;
    private NetInfoLoadView h;
    private View i;
    private FrameLayout j;
    private PrioritySmoothNestedScrollView k;
    private FrameLayout l;
    private RelativeLayout m;
    private ImageView n;
    private ImageView o;
    private ImageView p;
    private ImageView q;
    private TextView r;
    private SCRecyclerView s;
    private SGNewUserLandAdapter t;
    private GridLayoutManager u;
    private TextView v;
    private ImageView w;
    private com.sankuai.waimai.store.poi.list.newp.block.helper.a x;
    private String y;
    private String z;

    public static String m() {
        return "c_waimai_baopinnative";
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void a(int i, int i2, Intent intent) {
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void b(Intent intent) {
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void b(Bundle bundle) {
    }

    public static /* synthetic */ void b(SGNewUserLandDelegateImp sGNewUserLandDelegateImp, final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, sGNewUserLandDelegateImp, changeQuickRedirect, false, "347aef8e72005b6a6737f503303d1b2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGNewUserLandDelegateImp, changeQuickRedirect, false, "347aef8e72005b6a6737f503303d1b2c");
        } else if (sGNewUserLandDelegateImp.s == null || sGNewUserLandDelegateImp.u == null || sGNewUserLandDelegateImp.t == null) {
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.15
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    int i2;
                    int i3 = 0;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8ccabe97549e646154bd30f082257ea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8ccabe97549e646154bd30f082257ea");
                        return;
                    }
                    SGNewUserAnchorUtils sGNewUserAnchorUtils = SGNewUserLandDelegateImp.this.N;
                    List<T> list = SGNewUserLandDelegateImp.this.t.f;
                    int i4 = i;
                    Object[] objArr3 = {list, Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect3 = SGNewUserAnchorUtils.a;
                    if (PatchProxy.isSupport(objArr3, sGNewUserAnchorUtils, changeQuickRedirect3, false, "9674e3f1e0e53895c121d7abd0ef6ce7", RobustBitConfig.DEFAULT_VALUE)) {
                        i2 = ((Integer) PatchProxy.accessDispatch(objArr3, sGNewUserAnchorUtils, changeQuickRedirect3, false, "9674e3f1e0e53895c121d7abd0ef6ce7")).intValue();
                    } else {
                        if (!com.sankuai.shangou.stone.util.a.b(list)) {
                            for (T t : list) {
                                i3++;
                                if (t != null) {
                                    if (t.q == 4 && i4 == 2) {
                                        i2 = i3;
                                        break;
                                    }
                                    if (t.q == 7) {
                                        if (i4 == 3) {
                                            i2 = i3;
                                            break;
                                        }
                                    }
                                    if (t.q == 7 && i4 == 0) {
                                        i2 = i3;
                                        break;
                                    }
                                }
                            }
                        }
                        i2 = -1;
                    }
                    if (i2 > 0) {
                        SGNewUserLandDelegateImp.this.u.scrollToPositionWithOffset(i2, com.sankuai.shangou.stone.util.h.a(SGNewUserLandDelegateImp.this.b, 36.0f));
                    }
                }
            }, 128L);
        }
    }

    public SGNewUserLandDelegateImp(SCBaseActivity sCBaseActivity) {
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "969fe79b6d6622c23e3d2f99f9068918", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "969fe79b6d6622c23e3d2f99f9068918");
            return;
        }
        this.x = new com.sankuai.waimai.store.poi.list.newp.block.helper.a(false);
        this.F = false;
        this.G = false;
        this.K = true;
        this.L = true;
        this.M = MetricsSpeedMeterTask.createCustomSpeedMeterTask("sgc_newuser_land_page");
        this.R = 0;
        this.b = sCBaseActivity;
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void a(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e926a2a4cd9114052704e845e8ea44d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e926a2a4cd9114052704e845e8ea44d6");
            return;
        }
        this.M.recordStep("activity_create");
        h.a(fragmentActivity, "sg.newuser.ready.native");
        com.sankuai.waimai.store.fsp.a.a().a(this.b, "ffp_start");
        this.d = new h(this);
        this.j = (FrameLayout) fragmentActivity.findViewById(R.id.framelayout);
        this.s = (SCRecyclerView) fragmentActivity.findViewById(R.id.rc_container);
        this.m = (RelativeLayout) fragmentActivity.findViewById(R.id.new_user_header_layout);
        this.n = (ImageView) fragmentActivity.findViewById(R.id.new_user_header_background);
        this.o = (ImageView) fragmentActivity.findViewById(R.id.new_user_header_back);
        this.p = (ImageView) fragmentActivity.findViewById(R.id.new_user_header_logo);
        this.q = (ImageView) fragmentActivity.findViewById(R.id.new_user_header_top_logo);
        this.r = (TextView) fragmentActivity.findViewById(R.id.new_user_header_address);
        this.w = (ImageView) fragmentActivity.findViewById(R.id.iv_float_img);
        this.i = fragmentActivity.findViewById(R.id.ll_skeleton);
        this.k = (PrioritySmoothNestedScrollView) fragmentActivity.findViewById(R.id.sc_container);
        this.l = (FrameLayout) fragmentActivity.findViewById(R.id.fr_header_view);
        this.v = new TextView(fragmentActivity);
        this.v.setGravity(17);
        this.v.setText(fragmentActivity.getResources().getString(R.string.wm_sc_common_goods_no_more));
        this.v.setTextSize(1, 11.0f);
        this.v.setTextColor(-4408131);
        this.v.setPadding(0, com.sankuai.shangou.stone.util.h.a(fragmentActivity, 16.0f), 0, com.sankuai.shangou.stone.util.h.a(fragmentActivity, 16.0f));
        Drawable drawable = ContextCompat.getDrawable(this.b, R.drawable.wm_sc_common_right_arrow);
        int dimensionPixelOffset = this.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_9);
        DrawableCompat.setTintList(drawable, ColorStateList.valueOf(this.b.getResources().getColor(R.color.wm_st_common_white)));
        drawable.setBounds(0, 0, dimensionPixelOffset, dimensionPixelOffset);
        this.r.setCompoundDrawables(null, null, drawable, null);
        this.h = (NetInfoLoadView) fragmentActivity.findViewById(R.id.wm_sc_new_user_net_info);
        this.h.setReloadClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b34a1ee082e2cc4d8668b65434194a85", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b34a1ee082e2cc4d8668b65434194a85");
                    return;
                }
                try {
                    if (SGNewUserLandDelegateImp.this.h.getReloadTextView() != null && TextUtils.equals(SGNewUserLandDelegateImp.this.h.getReloadTextView().getText(), SGNewUserLandDelegateImp.this.b.getResources().getString(R.string.wm_sg_new_user_land_reload_address))) {
                        if (SGNewUserLandDelegateImp.this.d == null || !SGNewUserLandDelegateImp.this.d.e()) {
                            return;
                        }
                        com.sankuai.waimai.store.router.d.a(SGNewUserLandDelegateImp.this.b, com.sankuai.waimai.store.router.c.j);
                        return;
                    }
                    SGNewUserLandDelegateImp.this.c(h.x);
                } catch (Throwable unused) {
                    SGNewUserLandDelegateImp.this.c(h.x);
                }
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a820c8e3296fcfdb3b63023d6ea19ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a820c8e3296fcfdb3b63023d6ea19ad");
        } else {
            this.r.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.9
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "16cb7e68662e9790b3e9a1ce71615316", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "16cb7e68662e9790b3e9a1ce71615316");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(SGNewUserLandDelegateImp.m(), com.sankuai.waimai.store.manager.judas.b.a((Object) SGNewUserLandDelegateImp.this.b), "b_waimai_location_mc").a("source_id", SGNewUserLandDelegateImp.this.f).a("supply", "-999").a();
                    if (SGNewUserLandDelegateImp.this.d == null || !SGNewUserLandDelegateImp.this.d.e()) {
                        return;
                    }
                    com.sankuai.waimai.store.router.d.a(SGNewUserLandDelegateImp.this.b, com.sankuai.waimai.store.router.c.j);
                }
            });
        }
        Object[] objArr3 = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "316d16c6b6b10e2d29f27e857664fb4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "316d16c6b6b10e2d29f27e857664fb4f");
        } else {
            this.P = (SGNewUserStickLayout) fragmentActivity.findViewById(R.id.new_user_stick_layout);
            this.N = new SGNewUserAnchorUtils(fragmentActivity);
            if (this.P != null) {
                this.P.setSticky(com.sankuai.waimai.store.goods.list.utils.e.a());
                this.P.setOnStickyChangedListener(new SGNewUserStickLayout.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.8
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserStickLayout.a
                    public final void a(int i, int i2) {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a167eac3fdf248448a1770dc4f802029", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a167eac3fdf248448a1770dc4f802029");
                        } else if (SGNewUserLandDelegateImp.this.t == null || SGNewUserLandDelegateImp.this.N == null || !com.sankuai.waimai.store.goods.list.utils.e.a()) {
                        } else {
                            int a2 = SGNewUserLandDelegateImp.this.N.a((List<b>) SGNewUserLandDelegateImp.this.t.f, i2 == 16);
                            if (a2 >= 0) {
                                SGNewUserLandDelegateImp.this.t.notifyItemChanged(a2);
                            }
                        }
                    }
                });
            }
            com.sankuai.waimai.store.manager.coupon.c.a().a(this);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a60b0f84fd19555a138c89fd5387649c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a60b0f84fd19555a138c89fd5387649c");
        } else {
            this.u = new GridLayoutManager(this.b, 6);
            this.u.g = new GridLayoutManager.c() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.10
                public static ChangeQuickRedirect b;

                @Override // android.support.v7.widget.GridLayoutManager.c
                public final int a(int i) {
                    Object[] objArr5 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect5 = b;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ec8c8f6dc19240cee756bdbb91b85549", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ec8c8f6dc19240cee756bdbb91b85549")).intValue();
                    }
                    int itemViewType = SGNewUserLandDelegateImp.this.t.getItemViewType(SGNewUserLandDelegateImp.this.s.a(i));
                    if (SGNewUserLandDelegateImp.this.d != null) {
                        h hVar = SGNewUserLandDelegateImp.this.d;
                        Object[] objArr6 = {Integer.valueOf(itemViewType)};
                        ChangeQuickRedirect changeQuickRedirect6 = h.c;
                        if (PatchProxy.isSupport(objArr6, hVar, changeQuickRedirect6, false, "99918b78f2fc803ced97fa6664f4342d", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Integer) PatchProxy.accessDispatch(objArr6, hVar, changeQuickRedirect6, false, "99918b78f2fc803ced97fa6664f4342d")).intValue();
                        }
                        if (itemViewType == 5 || itemViewType == 15) {
                            return 3;
                        }
                        return itemViewType == 8 ? 2 : 6;
                    }
                    return 1;
                }
            };
            if (this.t == null) {
                this.t = new SGNewUserLandAdapter(this, this.b, this.N, this.u);
                this.P.setmAdapter(this.t);
                final SGNewUserStickLayout sGNewUserStickLayout = this.P;
                SCRecyclerView sCRecyclerView = this.s;
                Object[] objArr5 = {sCRecyclerView};
                ChangeQuickRedirect changeQuickRedirect5 = SGNewUserStickLayout.a;
                if (PatchProxy.isSupport(objArr5, sGNewUserStickLayout, changeQuickRedirect5, false, "004654bed4e9ea2a637f5c4f0d456e73", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, sGNewUserStickLayout, changeQuickRedirect5, false, "004654bed4e9ea2a637f5c4f0d456e73");
                } else {
                    sGNewUserStickLayout.b = sCRecyclerView;
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = SGNewUserStickLayout.a;
                    if (PatchProxy.isSupport(objArr6, sGNewUserStickLayout, changeQuickRedirect6, false, "743ac2b3d75583b0f2185ef27d7aba48", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, sGNewUserStickLayout, changeQuickRedirect6, false, "743ac2b3d75583b0f2185ef27d7aba48");
                    } else {
                        sGNewUserStickLayout.b.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserStickLayout.1
                            public static ChangeQuickRedirect a;

                            @Override // android.support.v7.widget.RecyclerView.k
                            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                                Object[] objArr7 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "4bedada4bc13c68da77ebc68f111c493", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "4bedada4bc13c68da77ebc68f111c493");
                                } else if (sGNewUserStickLayout.k) {
                                    sGNewUserStickLayout.a(false);
                                }
                            }
                        });
                    }
                    sGNewUserStickLayout.b();
                    sGNewUserStickLayout.a();
                }
            }
            this.t.b = this;
            this.s.setLayoutManager(this.u);
            this.s.setAdapter((com.sankuai.waimai.store.newwidgets.list.f<?, ?>) this.t);
            this.k.setMatchSizeChild(this.s);
            this.k.setOnHomePageSmoothNestedScrollListener(new com.sankuai.waimai.store.widgets.smoothnestedscroll.base.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.11
                public static ChangeQuickRedirect a;
                public int b;

                {
                    this.b = com.sankuai.shangou.stone.util.h.a(SGNewUserLandDelegateImp.this.b, 132.0f);
                }

                @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.a
                public final void a(View view, int i, boolean z) {
                    Object[] objArr7 = {view, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "15326717b695264b46af0207b3fc397d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "15326717b695264b46af0207b3fc397d");
                    } else if (i == 0) {
                        SGNewUserLandDelegateImp.this.x.c();
                    } else {
                        SGNewUserLandDelegateImp.this.x.b();
                    }
                }

                @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.a
                public final void a(View view, int i) {
                    Object[] objArr7 = {view, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "cf44e584c3eb995c71cd91645c8c3e72", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "cf44e584c3eb995c71cd91645c8c3e72");
                        return;
                    }
                    if (i >= this.b) {
                        if (!p.a(SGNewUserLandDelegateImp.this.p) && !p.a(SGNewUserLandDelegateImp.this.q)) {
                            u.a((View) SGNewUserLandDelegateImp.this.p, 8);
                            u.a((View) SGNewUserLandDelegateImp.this.q, 0);
                        }
                    } else if (!p.a(SGNewUserLandDelegateImp.this.p) && !p.a(SGNewUserLandDelegateImp.this.q)) {
                        u.a((View) SGNewUserLandDelegateImp.this.p, 0);
                        u.a((View) SGNewUserLandDelegateImp.this.q, 8);
                    }
                    SGNewUserLandDelegateImp.this.R = i;
                    if (SGNewUserLandDelegateImp.this.N != null) {
                        SGNewUserAnchorUtils sGNewUserAnchorUtils = SGNewUserLandDelegateImp.this.N;
                        int i2 = SGNewUserLandDelegateImp.this.R;
                        int i3 = this.b;
                        View view2 = SGNewUserLandDelegateImp.this.O;
                        Object[] objArr8 = {Integer.valueOf(i2), Integer.valueOf(i3), view2};
                        ChangeQuickRedirect changeQuickRedirect8 = SGNewUserAnchorUtils.a;
                        if (PatchProxy.isSupport(objArr8, sGNewUserAnchorUtils, changeQuickRedirect8, false, "abf527575e41f72bf129b2bcbb996a20", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, sGNewUserAnchorUtils, changeQuickRedirect8, false, "abf527575e41f72bf129b2bcbb996a20");
                        } else if (i2 < i3) {
                            u.c(view2);
                        } else {
                            u.a(view2);
                        }
                    }
                }
            });
        }
        this.M.recordStep("read_intent");
        Intent intent = this.b.getIntent();
        Object[] objArr7 = {intent};
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "a5f7c7c073915b8356f1c47a39aba822", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "a5f7c7c073915b8356f1c47a39aba822");
        } else {
            this.y = com.sankuai.waimai.store.router.d.a(intent, "category_code", "category_code", "-999");
            this.z = com.sankuai.waimai.store.router.d.a(intent, "second_category_type", "second_category_type", "-999");
            this.e = com.sankuai.waimai.store.router.d.a(intent, "page_sourse_type", "page_sourse_type", "-999");
            this.A = com.sankuai.waimai.store.router.d.a(intent, "spu_id", "spu_id", "-999");
            this.B = com.sankuai.waimai.store.router.d.a(intent, "sku_id", "sku_id", "-999");
            this.C = com.sankuai.waimai.store.router.d.a(intent, FoodDetailNetWorkPreLoader.URI_POI_STR, FoodDetailNetWorkPreLoader.URI_POI_STR, "-999");
            this.f = com.sankuai.waimai.store.router.d.a(intent, "source_id", "source_id", "-999");
            this.D = com.sankuai.waimai.store.router.d.a(intent, "extra", "extra", "");
            this.E = aa.a(intent, "key_pre_request_cache", "");
            this.H = com.sankuai.waimai.store.router.d.a(intent, "_isDspColdStart", "_isDspColdStart", "0");
            this.g = com.sankuai.waimai.store.router.d.a(intent, "g_source", "g_source", "-999");
            this.I = com.sankuai.waimai.store.goods.list.utils.e.a(intent);
            this.I.skuId = this.B;
            this.I.spuId = this.A;
            this.M.recordStep("getLocation");
            ae.a("SGNewUserLandPresenter", "getLocation");
            this.d.b();
            com.sankuai.waimai.store.fsp.a.a().a(this.b, "ffp_location_start");
            com.sankuai.waimai.store.goods.list.utils.e.a(SGNewUserLocationRate.SGNewUserLocation, k(), true, "");
        }
        com.sankuai.waimai.store.manager.user.a.a().b((com.sankuai.waimai.store.i.user.a) this);
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = a;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "30dbca724d2c5723d64c7e4a7f03ed9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "30dbca724d2c5723d64c7e4a7f03ed9a");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("_isDspColdStart", this.H);
            hashMap.put("page_sourse_type", this.e);
            com.sankuai.waimai.store.goods.list.utils.e.a(SGNewUserOutLinkRate.SGNewUserOutLinkOpen, hashMap, true, "");
        }
        com.meituan.android.bus.a.a().a(this);
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "780396a3ed31475c8f571670e39b0528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "780396a3ed31475c8f571670e39b0528");
        } else if (this.c != null) {
            this.c.h();
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "834a31884ffac6c951825d9803be5800", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "834a31884ffac6c951825d9803be5800");
            return;
        }
        if (this.d != null) {
            h hVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h.c;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "80cf1bae5212c6deaf8ae2bd9d0cf300", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "80cf1bae5212c6deaf8ae2bd9d0cf300");
            } else {
                hVar.e.clear();
            }
        }
        com.sankuai.waimai.store.manager.judas.d.a(this.b);
        com.sankuai.waimai.store.manager.judas.d.b(this.b, "c_waimai_baopinnative").a("page_source_type", this.e).a("source_id", this.f).a("sku_id", this.B).a("g_source", this.g).a("upc", !t.a(this.I.originUpc) ? this.I.originUpc : -999).a("third_category", !t.a(this.I.originThirdCategoryCode) ? this.I.originThirdCategoryCode : -999).a();
        com.sankuai.waimai.store.manager.judas.d.a(this.b, "c_waimai_baopinnative");
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1512da3b1da3b3fb85b458284fe21a6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1512da3b1da3b3fb85b458284fe21a6b");
        } else {
            com.sankuai.waimai.store.manager.judas.d.d(this.b, "c_waimai_baopinnative");
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca49b04db79bc6c95b4d799993782d32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca49b04db79bc6c95b4d799993782d32");
        } else if (this.c != null) {
            this.c.i();
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2945609733e7d89d6e92dcb19271d24e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2945609733e7d89d6e92dcb19271d24e");
            return;
        }
        if (this.c != null) {
            this.c.j();
        }
        if (this.d != null) {
            h hVar = this.d;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h.c;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "c80803491a014aa93d055694e9f757d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "c80803491a014aa93d055694e9f757d0");
            } else {
                hVar.e.clear();
                com.sankuai.waimai.store.locate.a.b(hVar);
                if (hVar.A != null) {
                    com.sankuai.waimai.store.poilist.preload.b.a().b.b(hVar.A);
                }
                if (hVar.B != null) {
                    com.sankuai.waimai.store.poilist.preload.b.a().c.b(hVar.B);
                }
            }
        }
        com.meituan.android.bus.a.a().b(this);
        com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b8401907f9564126222741af40ba4b09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b8401907f9564126222741af40ba4b09");
        } else {
            com.sankuai.waimai.store.base.preload.e.a().a(this.E);
            if (!TextUtils.isEmpty(this.E)) {
                com.sankuai.waimai.store.base.net.c.a(this.E);
            }
            com.sankuai.waimai.store.base.preload.f.a(this.E);
        }
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
        if (this.P != null) {
            SGNewUserStickLayout sGNewUserStickLayout = this.P;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = SGNewUserStickLayout.a;
            if (PatchProxy.isSupport(objArr4, sGNewUserStickLayout, changeQuickRedirect4, false, "afa668721398f6822610c2b9646561b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, sGNewUserStickLayout, changeQuickRedirect4, false, "afa668721398f6822610c2b9646561b8");
                return;
            }
            RecyclerView.s a2 = sGNewUserStickLayout.a(10);
            if (a2 instanceof f.c) {
                f.c cVar = (f.c) a2;
                if (cVar.b != null) {
                    cVar.b.g();
                }
            }
            RecyclerView.s a3 = sGNewUserStickLayout.a(16);
            if (a3 instanceof f.c) {
                f.c cVar2 = (f.c) a3;
                if (cVar2.b != null) {
                    cVar2.b.g();
                }
            }
        }
    }

    @Subscribe
    public void dialogAnimatorEvent(SGNewUserOutLinkEvent sGNewUserOutLinkEvent) {
        Object[] objArr = {sGNewUserOutLinkEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3e4354e4eda7e42997f598887b2a8aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3e4354e4eda7e42997f598887b2a8aa");
        } else if (sGNewUserOutLinkEvent != null) {
            if (sGNewUserOutLinkEvent.step == 1 && !t.a(this.J) && this.d != null) {
                this.d.a(this.J);
            }
            if (sGNewUserOutLinkEvent.step == 2 && com.sankuai.waimai.store.config.i.h().a(SCConfigPath.NEW_USE_LAND_PRICE_SHOW, false)) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d77a43931e3ac16f70c9c640e2ad172d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d77a43931e3ac16f70c9c640e2ad172d");
                } else if (this.t != null) {
                    SGNewUserLandAdapter sGNewUserLandAdapter = this.t;
                    Object[] objArr3 = {0, 10};
                    ChangeQuickRedirect changeQuickRedirect3 = SGNewUserLandAdapter.a;
                    if (PatchProxy.isSupport(objArr3, sGNewUserLandAdapter, changeQuickRedirect3, false, "b9479c3df323e0cb35d5d89fffa99b4b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, sGNewUserLandAdapter, changeQuickRedirect3, false, "b9479c3df323e0cb35d5d89fffa99b4b");
                        return;
                    }
                    List<T> list = sGNewUserLandAdapter.f;
                    if (com.sankuai.shangou.stone.util.a.b(list)) {
                        return;
                    }
                    int a2 = 10 > com.sankuai.shangou.stone.util.a.a((List) list) ? com.sankuai.shangou.stone.util.a.a((List) list) : 10;
                    for (int i = 0; i < a2; i++) {
                        b bVar = (b) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
                        if (bVar != null) {
                            bVar.k = true;
                        }
                    }
                    sGNewUserLandAdapter.notifyItemRangeChanged(0, a2);
                }
            }
        }
    }

    private void a(String str, View view) {
        Object[] objArr = {str, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a6b256e7f1ec0e21d5eaa49f2d766e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a6b256e7f1ec0e21d5eaa49f2d766e9");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("source_id", this.f);
        hashMap.put("supply", this.d.z);
        hashMap.put("undertake", this.d.E);
        hashMap.put("g_source", this.g);
        com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b(str, view, str);
        bVar.b(hashMap);
        com.sankuai.waimai.store.expose.v2.b.a().a(this.b, bVar);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final void a(@Nullable List<b> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e17757c13d0d3668eeaa3a7f00539976", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e17757c13d0d3668eeaa3a7f00539976");
        } else if (com.sankuai.shangou.stone.util.a.b(list) || this.t == null) {
        } else {
            u.a(this.s);
            if (i == h.j) {
                h.a(this.b, "sg.newuser.apiend2.native");
                this.t.b(list);
                this.s.post(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.12
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7da431e25456532f59900d45193dbf73", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7da431e25456532f59900d45193dbf73");
                        } else {
                            h.a(SGNewUserLandDelegateImp.this.b, "sg.newuser.setdataend2.native");
                        }
                    }
                });
                return;
            }
            com.sankuai.waimai.store.fsp.a.a().a(this.b, "ffp_render_start");
            com.sankuai.waimai.store.fsp.a.a().a(this.b, "first_screen_render_type", this.d.z);
            h.a(this.b, "sg.newuser.apiend.native");
            this.Q++;
            this.t.a(list);
            SGNewUserLandResponse.HotSaleProductTabs a2 = this.N.a((List<b>) this.t.f);
            if (a2 != null && i != h.l) {
                this.d.a(list, a2);
            }
            this.s.post(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.13
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "271ca336f79661b06ed9e3ec7cf2b4cb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "271ca336f79661b06ed9e3ec7cf2b4cb");
                    } else {
                        h.a(SGNewUserLandDelegateImp.this.b, "sg.newuser.setdataend.native");
                    }
                }
            });
        }
    }

    private void u() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7e67155c9f2aa3c7150e083583c308b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7e67155c9f2aa3c7150e083583c308b");
        } else if (com.sankuai.waimai.store.goods.list.utils.e.a() && this.d != null) {
            SGNewUserAnchorUtils sGNewUserAnchorUtils = this.N;
            List<T> list = this.t.f;
            int i = this.d.C;
            Object[] objArr2 = {list, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = SGNewUserAnchorUtils.a;
            if (PatchProxy.isSupport(objArr2, sGNewUserAnchorUtils, changeQuickRedirect2, false, "bcf66f716df0288c2fad2610eaa554b7", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, sGNewUserAnchorUtils, changeQuickRedirect2, false, "bcf66f716df0288c2fad2610eaa554b7")).booleanValue();
            } else {
                if (!com.sankuai.shangou.stone.util.a.b(list) && i != -1 && i != 1) {
                    int i2 = -1;
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    for (int i7 = 0; i7 < com.sankuai.shangou.stone.util.a.a((List) list); i7++) {
                        b bVar = (b) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i7);
                        if (bVar != null) {
                            int i8 = bVar.q;
                            if (i8 == 5) {
                                i4++;
                            } else if (i8 == 8) {
                                i5++;
                            } else if (i8 != 11) {
                                switch (i8) {
                                    case 1:
                                        i2 = i7;
                                        continue;
                                    case 2:
                                        i3++;
                                        continue;
                                }
                            } else {
                                i6++;
                            }
                        }
                    }
                    if (i != 2 ? (i == 3 || i == 0) && ((i2 >= 0 || i3 > 0 || i4 > 0) && (i5 > 0 || i6 > 0)) : i2 >= 0 && i3 >= 2) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                final int i9 = this.d.C;
                Object[] objArr3 = {Integer.valueOf(i9)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fef7fc96facf4b2d8471e0ac8286a46b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fef7fc96facf4b2d8471e0ac8286a46b");
                } else {
                    ad.a(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.14
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ebd89013b826ce333db5e5c50b21f837", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ebd89013b826ce333db5e5c50b21f837");
                            } else if (SGNewUserLandDelegateImp.this.k != null) {
                                SGNewUserLandDelegateImp.this.k.scrollTo(0, com.sankuai.shangou.stone.util.h.a(SGNewUserLandDelegateImp.this.b, 221.0f));
                                SGNewUserLandDelegateImp.b(SGNewUserLandDelegateImp.this, i9);
                            }
                        }
                    }, 128L);
                }
                this.d.C = -1;
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final void a(@NotNull SGNewUserLandResponse sGNewUserLandResponse) {
        Object[] objArr = {sGNewUserLandResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46db276246fe3c9946bb8333411ede0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46db276246fe3c9946bb8333411ede0e");
            return;
        }
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bcce10dde6c9768f9d01c165a1ad71a8", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bcce10dde6c9768f9d01c165a1ad71a8");
                } else {
                    SGNewUserLandDelegateImp.this.b.onBackPressed();
                }
            }
        });
        if (p.a(sGNewUserLandResponse) || p.a(sGNewUserLandResponse.bgInfo)) {
            return;
        }
        SGNewUserLandResponse.BgInfo bgInfo = sGNewUserLandResponse.bgInfo;
        m.a(bgInfo.banner, com.sankuai.shangou.stone.util.h.a((Context) this.b), ImageQualityUtil.a()).a(this.n);
        m.a(bgInfo.topBarLogo, com.sankuai.shangou.stone.util.h.a((Context) this.b), ImageQualityUtil.a()).a(this.p);
        m.a(bgInfo.hookBarLogo, com.sankuai.shangou.stone.util.h.a((Context) this.b), ImageQualityUtil.a()).a(this.q);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final void b(@NotNull final SGNewUserLandResponse sGNewUserLandResponse) {
        Object[] objArr = {sGNewUserLandResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd8d7ac3e0a4b83f9d7522c95719647", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd8d7ac3e0a4b83f9d7522c95719647");
        } else if (p.a(sGNewUserLandResponse)) {
        } else {
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.wm_sc_new_user_land_header_layout, (ViewGroup) null);
            this.O = inflate.findViewById(R.id.stick_shadow);
            if (!p.a(sGNewUserLandResponse.bgInfo)) {
                SGNewUserLandResponse.BgInfo bgInfo = sGNewUserLandResponse.bgInfo;
                ImageView imageView = (ImageView) inflate.findViewById(R.id.header_background);
                String str = bgInfo.headPicV2;
                String str2 = bgInfo.headPic;
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86e70885f7d6bda31eba976f2bd4a7ad", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86e70885f7d6bda31eba976f2bd4a7ad");
                } else if (t.a(str)) {
                    str = str2;
                }
                b.C0608b a2 = m.a(str, com.sankuai.shangou.stone.util.h.a((Context) this.b), ImageQualityUtil.a());
                a2.j = R.drawable.wm_sc_common_poi_error;
                a2.a(imageView);
            }
            if (!p.a(sGNewUserLandResponse.crossLine)) {
                final SGNewUserLandResponse.CrossLine crossLine = sGNewUserLandResponse.crossLine;
                ((LinearLayout) inflate.findViewById(R.id.header_cross_line_layout)).setBackground(new e.a().a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(this.b, R.color.wm_sg_color_B3FFFFFF), ContextCompat.getColor(this.b, R.color.wm_sg_color_B3FFFFFF)}).a(com.sankuai.shangou.stone.util.h.a(this.b, 15.0f)).a());
                TextView textView = (TextView) inflate.findViewById(R.id.header_rule);
                textView.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(this.b, 6.0f), 0.0f, 0.0f, com.sankuai.shangou.stone.util.h.a(this.b, 6.0f)).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(this.b, R.color.wm_sc_black12), ContextCompat.getColor(this.b, R.color.wm_sc_black12)}).a());
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e66bbeee7c7488651756bd1967dfa01f", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e66bbeee7c7488651756bd1967dfa01f");
                            return;
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(SGNewUserLandDelegateImp.m(), com.sankuai.waimai.store.manager.judas.b.a((Object) SGNewUserLandDelegateImp.this.b), "b_waimai_rules_mc").a();
                        if (t.a(sGNewUserLandResponse.ruleContent)) {
                            return;
                        }
                        try {
                            FlashDialog.a aVar = new FlashDialog.a(SGNewUserLandDelegateImp.this.b);
                            String str3 = sGNewUserLandResponse.ruleContent.split(">")[1].split("<")[0];
                            Object[] objArr4 = {str3};
                            ChangeQuickRedirect changeQuickRedirect4 = FlashDialog.a.a;
                            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "8abe3cdb70fb60e0154c8875f3690268", RobustBitConfig.DEFAULT_VALUE)) {
                                aVar = (FlashDialog.a) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "8abe3cdb70fb60e0154c8875f3690268");
                            } else {
                                aVar.b.d = str3;
                            }
                            FlashDialog.a a3 = aVar.a(sGNewUserLandResponse.ruleContent.split(">")[2]);
                            Object[] objArr5 = {Integer.valueOf((int) GravityCompat.START)};
                            ChangeQuickRedirect changeQuickRedirect5 = FlashDialog.a.a;
                            if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "70aa025a725f4c4d97b1090fe78a1571", RobustBitConfig.DEFAULT_VALUE)) {
                                a3 = (FlashDialog.a) PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "70aa025a725f4c4d97b1090fe78a1571");
                            } else {
                                a3.b.l = GravityCompat.START;
                            }
                            a3.a();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                TextView textView2 = (TextView) inflate.findViewById(R.id.header_cross_line_button);
                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ll_header_cross_btn_right);
                e.a a3 = new e.a().a(com.sankuai.shangou.stone.util.h.a(this.b, 12.0f)).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{ContextCompat.getColor(this.b, R.color.wm_sg_color_FFE14D), ContextCompat.getColor(this.b, R.color.wm_sg_color_FFC34D)});
                e.a a4 = new e.a().a(com.sankuai.shangou.stone.util.h.a(this.b, 12.0f)).a(GradientDrawable.Orientation.TL_BR, new int[]{ContextCompat.getColor(this.b, R.color.wm_st_common_white), ContextCompat.getColor(this.b, R.color.wm_sg_color_FFC34D)});
                linearLayout.setBackground(a3.a());
                ((RelativeLayout) inflate.findViewById(R.id.rl_header_cross_btn_right)).setBackground(a4.a());
                a("b_waimai_ehbxz43y_mv", textView2);
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2ae643a37d914aab6b1f6dc09639485c", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2ae643a37d914aab6b1f6dc09639485c");
                            return;
                        }
                        com.sankuai.waimai.store.manager.judas.b.a(SGNewUserLandDelegateImp.m(), com.sankuai.waimai.store.manager.judas.b.a((Object) SGNewUserLandDelegateImp.this.b), "b_waimai_ehbxz43y_mc").a("source_id", SGNewUserLandDelegateImp.this.f).a("supply", SGNewUserLandDelegateImp.this.d.z).a();
                        if (t.a(crossLine.jumpScheme)) {
                            return;
                        }
                        com.sankuai.waimai.store.router.d.a(SGNewUserLandDelegateImp.this.b, crossLine.jumpScheme);
                    }
                });
                m.a(crossLine.crossLineIcon, com.sankuai.shangou.stone.util.h.a((Context) this.b), ImageQualityUtil.a()).a((ImageView) inflate.findViewById(R.id.header_cross_line_left_icon));
                u.a((TextView) inflate.findViewById(R.id.header_cross_line_text), crossLine.crossLineText);
                u.a(textView2, crossLine.jumpText);
                ((ImageView) inflate.findViewById(R.id.iv_header_cross_btn_right_arrow)).setImageDrawable(com.sankuai.waimai.store.view.a.a(this.b, R.dimen.wm_sc_common_dimen_4, R.dimen.wm_sc_common_dimen_7, R.color.wm_sc_color_222426, R.dimen.wm_sc_common_dimen_1, a.EnumC1338a.RIGHT));
            }
            if (this.l != null) {
                this.l.removeAllViews();
                this.l.addView(inflate);
            }
            d(h.t);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final void a(SGNewUserLandResponse sGNewUserLandResponse, @Nullable final SGNewUserLandResponse.SideBarEntry sideBarEntry) {
        Object[] objArr = {sGNewUserLandResponse, sideBarEntry};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dabba2de69234460e393e1a14e90085", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dabba2de69234460e393e1a14e90085");
        } else if (sideBarEntry != null && !t.a(sideBarEntry.picUrl)) {
            this.x.a();
            m.a(sideBarEntry.picUrl, ImageQualityUtil.a()).a(this.w);
            a("b_waimai_8r6altum_mv", this.w);
            u.a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f131cd5abd69863f3af664a2b1d39728", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f131cd5abd69863f3af664a2b1d39728");
                        return;
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(SGNewUserLandDelegateImp.m(), com.sankuai.waimai.store.manager.judas.b.a((Object) SGNewUserLandDelegateImp.this.b), "b_waimai_8r6altum_mc").a("source_id", SGNewUserLandDelegateImp.this.f).a("supply", SGNewUserLandDelegateImp.this.d.z).a();
                    if (t.a(sideBarEntry.scheme)) {
                        return;
                    }
                    com.sankuai.waimai.store.router.d.a().a(SGNewUserLandDelegateImp.this.b, sideBarEntry.scheme);
                }
            }, this.w);
            this.x.a(this.b, this.w);
            u.a(this.w);
        } else {
            this.x.a();
            u.c(this.w);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d847840b8a6e473c76718c332b54f4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d847840b8a6e473c76718c332b54f4b");
            return;
        }
        a(true);
        d(i);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final void a(@Nullable List<b> list, int i, int i2) {
        SGNewUserLandResponse.HotSaleProductTabs a2;
        Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07de1976436a630dc32bf6c590ccb6a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07de1976436a630dc32bf6c590ccb6a6");
            return;
        }
        if (i2 == h.j) {
            this.t.b(list);
            this.Q++;
        } else {
            SGNewUserLandAdapter sGNewUserLandAdapter = this.t;
            Object[] objArr2 = {list, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = SGNewUserLandAdapter.a;
            if (PatchProxy.isSupport(objArr2, sGNewUserLandAdapter, changeQuickRedirect2, false, "dec8423b9ea63cba8b639cc9aa03784f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, sGNewUserLandAdapter, changeQuickRedirect2, false, "dec8423b9ea63cba8b639cc9aa03784f");
            } else {
                List<T> list2 = sGNewUserLandAdapter.f;
                if (i <= com.sankuai.shangou.stone.util.a.a((List) list2) && i >= 0) {
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
                        list2.addAll(i, list);
                    }
                    sGNewUserLandAdapter.notifyDataSetChanged();
                }
            }
            if (!com.sankuai.shangou.stone.util.a.b(this.t.f) && (a2 = this.N.a((List<b>) this.t.f)) != null && i2 != h.l) {
                this.d.a(list, a2);
            }
        }
        if (this.Q == 2) {
            u();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final void a(SGNewUserLandResponse.HotSaleProductTabs hotSaleProductTabs, int i) {
        Object[] objArr = {hotSaleProductTabs, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ec80623ecc52d0b6ab128da888237a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ec80623ecc52d0b6ab128da888237a2");
            return;
        }
        List<T> list = this.t.f;
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.q == 16 && !p.a(hotSaleProductTabs)) {
                for (SGNewUserLandResponse.TabItem tabItem : hotSaleProductTabs.tabs) {
                    if (tabItem != null) {
                        tabItem.selectPos = i;
                    }
                }
                hotSaleProductTabs.selectPos = i;
                bVar.n = hotSaleProductTabs;
            }
            if (bVar.q == 5 || bVar.q == 17) {
                it.remove();
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03878bb83d3c39786fb485aa37790e05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03878bb83d3c39786fb485aa37790e05");
            return;
        }
        if (i == h.h) {
            if (this.d != null) {
                this.d.a();
            }
        } else if (i == h.j) {
            this.s.b(this.v);
        } else if (i == h.k) {
            this.t.notifyDataSetChanged();
        }
        this.F = false;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final void a(String str) {
        String str2 = str;
        Object[] objArr = {str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f3946007a553dd3636bc337546b9662", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f3946007a553dd3636bc337546b9662");
        } else if (this.G) {
        } else {
            this.J = str2;
            this.G = true;
            String str3 = this.f;
            String str4 = this.e;
            if (t.a(str)) {
                str2 = "";
            }
            Object[] objArr2 = {str3, str4, str2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d885d71620f582ff0beb483febc445af", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d885d71620f582ff0beb483febc445af");
            } else {
                if (this.c == null) {
                    boolean a2 = com.sankuai.waimai.store.config.i.h().a(SCConfigPath.NEW_USE_LAND_DIALOG_HIDE, false);
                    String b = com.sankuai.waimai.store.goods.list.utils.e.b("dialog_down_grade_switch");
                    if (!a2 && "0".equals(b)) {
                        com.sankuai.waimai.store.manager.marketing.c.a("sg_new_user_out_link_dialog", com.sankuai.waimai.store.goods.list.viewblocks.newuser.atmosphere.a.class);
                    }
                    this.c = new com.sankuai.waimai.store.manager.marketing.a(this.b, this.j, 2000);
                    this.c.a(true);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("page_type", "2000");
                hashMap.put("source_id", str3);
                hashMap.put("page_sourse_type", str4);
                hashMap.put("extra_data", str2);
                this.c.a(hashMap, this.b.w());
            }
            if (TextUtils.equals("1", this.d.z)) {
                com.sankuai.waimai.store.goods.list.utils.e.a(SGNewUserOutLinkRate.SGNewUserHasNewProduct, k(), true, "");
            } else {
                com.sankuai.waimai.store.goods.list.utils.e.a(SGNewUserOutLinkRate.SGNewUserNoneNewProduct, k(), true, "");
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final SCBaseActivity a() {
        return this.b;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final void a(@Nullable String str, @Nullable WMLocation wMLocation) {
        Object[] objArr = {str, wMLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "290b3b3f67043241b493d093a5513fb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "290b3b3f67043241b493d093a5513fb3");
        } else if (t.a(str)) {
            u.a(this.r, this.b.getResources().getString(R.string.wm_sc_locating_unknown));
        } else {
            u.a(this.r, str);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final SGNewUserLandAdapter b() {
        return this.t;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7143ddfed4cfbb1b13418ea9a1afd24f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7143ddfed4cfbb1b13418ea9a1afd24f");
        } else if (this.F) {
        } else {
            d(h.s);
            if (this.k != null) {
                this.k.scrollTo(0, 0);
            }
            if (this.t != null) {
                this.t.a((List<b>) null);
            }
            if (this.s != null) {
                SCRecyclerView sCRecyclerView = this.s;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = SCRecyclerView.b;
                if (PatchProxy.isSupport(objArr2, sCRecyclerView, changeQuickRedirect2, false, "7a4ca8761a132ddf59e507e570bb1325", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, sCRecyclerView, changeQuickRedirect2, false, "7a4ca8761a132ddf59e507e570bb1325");
                } else {
                    com.sankuai.waimai.store.newwidgets.list.i iVar = sCRecyclerView.c;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.newwidgets.list.i.a;
                    if (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect3, false, "8a1981ee4f85490380a470e92a35ee78", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect3, false, "8a1981ee4f85490380a470e92a35ee78");
                    } else {
                        iVar.b.clear();
                        iVar.notifyDataSetChanged();
                    }
                }
                SCRecyclerView sCRecyclerView2 = this.s;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = SCRecyclerView.b;
                if (PatchProxy.isSupport(objArr4, sCRecyclerView2, changeQuickRedirect4, false, "a3cbc4b918b889bb6dad0644197862fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, sCRecyclerView2, changeQuickRedirect4, false, "a3cbc4b918b889bb6dad0644197862fc");
                } else {
                    com.sankuai.waimai.store.newwidgets.list.i iVar2 = sCRecyclerView2.c;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.newwidgets.list.i.a;
                    if (PatchProxy.isSupport(objArr5, iVar2, changeQuickRedirect5, false, "3e3b2ef7d5f2821995f5a593d05cb74a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, iVar2, changeQuickRedirect5, false, "3e3b2ef7d5f2821995f5a593d05cb74a");
                    } else {
                        iVar2.c.clear();
                        iVar2.notifyDataSetChanged();
                    }
                }
            }
            if (this.l != null) {
                this.l.removeAllViews();
            }
            this.F = true;
            this.d.a(this.E, this.y, this.z, this.e, com.sankuai.waimai.store.goods.list.utils.e.c(this.I.spuId), com.sankuai.waimai.store.goods.list.utils.e.c(this.I.skuId), com.sankuai.waimai.store.goods.list.utils.e.c(this.C), this.f, this.D, i, this.I);
        }
    }

    private void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33e122985f43729d6c3c249094fbc50a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33e122985f43729d6c3c249094fbc50a");
            return;
        }
        if (i == h.s) {
            u.a(this.i);
            this.h.e();
        } else if (i == h.t) {
            u.c(this.i);
            this.h.e();
            v();
            this.M.recordStep("request_success");
        } else if (i == h.v) {
            u.c(this.i);
            this.h.a(this.b.getResources().getString(R.string.wm_sg_new_user_land_params_error), 2);
            this.h.setReloadButtonText(R.string.wm_sg_new_user_land_reload_address);
            this.M.recordStep("request_failed");
        } else {
            u.c(this.i);
            this.h.a(this.b.getResources().getString(R.string.wm_sc_common_net_error_info), 1);
            this.h.setReloadButtonText(R.string.wm_sc_common_reload);
            a(false);
            this.M.recordStep("request_failed");
        }
        if (i != h.s) {
            com.sankuai.meituan.takeoutnew.util.aop.h.a(this.M);
            com.sankuai.waimai.store.goods.list.utils.e.a(this.I);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final void a(int i, @Nullable String str, @Nullable WMLocation wMLocation, String str2, WMLocation wMLocation2) {
        Object[] objArr = {Integer.valueOf(i), str, wMLocation, str2, wMLocation2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea0526fb0824d7e8379111351de6023c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea0526fb0824d7e8379111351de6023c");
            return;
        }
        HashMap hashMap = new HashMap();
        switch (i) {
            case 0:
                ae.a("SGNewUserLandPresenter", "get_cache_location_success");
                this.M.recordStep("get_cache_location_success");
                c(h.w);
                this.M.recordStep("start_request");
                com.sankuai.waimai.store.goods.list.utils.e.a(SGNewUserLocationRate.SGNewUserLocationCacheSuccess, k(), true, "");
                a(str, wMLocation);
                hashMap.put("cache_location", "1");
                com.sankuai.waimai.store.fsp.a.a().a(this.b, hashMap);
                com.sankuai.waimai.store.fsp.a.a().a(this.b, "ffp_location_end");
                return;
            case 1:
                this.M.recordStep("get_cache_location_failed");
                ae.a("SGNewUserLandPresenter", "get_cache_location_failed");
                h.a(this.b, "sg.newuser.locationstart.native");
                a(this.b.getResources().getString(R.string.wm_sc_progressbar_locating), wMLocation);
                com.sankuai.waimai.store.goods.list.utils.e.a(SGNewUserLocationRate.SGNewUserLocationCacheFailed, k(), false, l());
                this.M.recordStep("start_location");
                this.d.d();
                hashMap.put("cache_location", "2");
                com.sankuai.waimai.store.fsp.a.a().a(this.b, hashMap);
                return;
            case 2:
                this.M.recordStep("start_location_success");
                ae.a("SGNewUserLandPresenter", "start_location_success");
                if (k.c()) {
                    if (SGLocationUtils.a(wMLocation2, str2) || this.t == null || com.sankuai.shangou.stone.util.a.b(this.t.f)) {
                        c(h.w);
                    }
                } else {
                    c(h.w);
                }
                a(str, wMLocation);
                com.sankuai.waimai.store.goods.list.utils.e.a(SGNewUserLocationRate.SGNewUserLocationSuccess, k(), true, "");
                h.a(this.b, "sg.newuser.locationend.native");
                com.sankuai.waimai.store.fsp.a.a().a(this.b, "ffp_location_end");
                return;
            case 3:
                ae.a("SGNewUserLandPresenter", "start_location_failed");
                h.a(this.b, "sg.newuser.locationend.native");
                this.M.recordStep("start_location_failed");
                d(h.v);
                com.sankuai.waimai.store.goods.list.utils.e.a(SGNewUserLocationRate.SGNewUserLocationFailed, k(), false, l());
                com.sankuai.waimai.store.fsp.a.a().a(this.b, "ffp_location_end");
                return;
            default:
                return;
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "239a7c4484faadcd866c008e2f1d9986", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "239a7c4484faadcd866c008e2f1d9986");
        } else if (com.sankuai.waimai.store.util.b.a(this.b)) {
        } else {
            com.sankuai.waimai.foundation.core.utils.d.a(this.S);
            this.S = com.sankuai.waimai.foundation.core.utils.d.a((Activity) this.b);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c6bc18b583472f834f5f325effa4b7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c6bc18b583472f834f5f325effa4b7c");
        } else if (com.sankuai.waimai.store.util.b.a(this.b)) {
        } else {
            com.sankuai.waimai.foundation.core.utils.d.a(this.S);
            this.S = null;
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final void j() {
        final int b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2724355139e4e58c7a1b62c8cff986dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2724355139e4e58c7a1b62c8cff986dd");
            return;
        }
        if (this.k != null) {
            this.k.scrollTo(0, com.sankuai.shangou.stone.util.h.a(this.b, 221.0f));
        }
        if (this.s == null || this.t == null || (b = this.N.b(this.t.f)) < 0) {
            return;
        }
        ad.a(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8b161222da428e5da280aa11234c26f0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8b161222da428e5da280aa11234c26f0");
                } else if (SGNewUserLandDelegateImp.this.u != null) {
                    SGNewUserLandDelegateImp.this.u.scrollToPositionWithOffset(b, -8);
                    if (SGNewUserLandDelegateImp.this.P == null || !com.sankuai.waimai.store.goods.list.utils.e.a()) {
                        return;
                    }
                    SGNewUserLandDelegateImp.this.P.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.6.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f70587ebf9cb2e1424284664599b41c9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f70587ebf9cb2e1424284664599b41c9");
                                return;
                            }
                            SGNewUserStickLayout sGNewUserStickLayout = SGNewUserLandDelegateImp.this.P;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = SGNewUserStickLayout.a;
                            if (PatchProxy.isSupport(objArr4, sGNewUserStickLayout, changeQuickRedirect4, false, "36f1a181442b62d216c1f8d06461553a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, sGNewUserStickLayout, changeQuickRedirect4, false, "36f1a181442b62d216c1f8d06461553a");
                            } else {
                                sGNewUserStickLayout.a(true);
                            }
                        }
                    }, 64L);
                }
            }
        }, 64L);
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.e
    public final boolean n() {
        return !this.F;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.e
    public final com.sankuai.waimai.store.poilist.mach.a o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d89e815bf74e88b274b76809e10d93c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.poilist.mach.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d89e815bf74e88b274b76809e10d93c");
        }
        if (this.d != null) {
            return this.d.d;
        }
        return null;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.e
    public final HashMap<String, Object> p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f4918c103ceebfdb76f637097b59cf0", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f4918c103ceebfdb76f637097b59cf0");
        }
        if (this.d != null) {
            return this.d.f;
        }
        return null;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.e
    public final boolean q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3ae25dcbb1c6aab5f6fc056c4f56320", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3ae25dcbb1c6aab5f6fc056c4f56320")).booleanValue();
        }
        SGNewUserLandResponse.HotSaleProductTabs a2 = this.N.a((List<b>) this.t.f);
        if (a2 != null) {
            return a2.hasNext;
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.e
    public final void a(int i, float f, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48c7bdd3a8dc5ba0e749a3afa294d5a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48c7bdd3a8dc5ba0e749a3afa294d5a2");
            return;
        }
        SGNewUserLandResponse.HotSaleProductTabs a2 = this.N.a((List<b>) this.t.f);
        if (p.a(a2)) {
            return;
        }
        a2.firstVisibleItemPosition = i;
        a2.offsetX = f;
        a2.isTop = z;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.e
    public final SCBaseActivity r() {
        return this.b;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.e
    public final String s() {
        return this.f;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.e
    public final String t() {
        return this.d != null ? this.d.E : "-999";
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.j
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bc850eb8f77aea32df8d2dc2c760f52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bc850eb8f77aea32df8d2dc2c760f52");
        } else if (this.d != null) {
            if (i == h.q) {
                SGNewUserLandResponse.HotSaleProductTabs a2 = this.N.a((List<b>) this.t.f);
                if (a2 != null) {
                    this.d.a(2, i2, a2);
                }
            } else {
                this.d.a(i, i2);
            }
            this.F = false;
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.j
    public final void a(SGNewUserLandResponse.SGNewUserItemData sGNewUserItemData, String str) {
        Object[] objArr = {sGNewUserItemData, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a87f41bad292482fdfc8f7de90e94786", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a87f41bad292482fdfc8f7de90e94786");
        } else if (!com.sankuai.waimai.store.manager.user.a.a().b()) {
            com.sankuai.waimai.store.manager.user.a.a((Context) this.b);
        } else {
            this.d.a(sGNewUserItemData, str);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.j
    public final void a(SGNewUserLandResponse.HotSaleProductTabs hotSaleProductTabs, int i, int i2) {
        Object[] objArr = {hotSaleProductTabs, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b212d368bd57e709d7847862d1c228ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b212d368bd57e709d7847862d1c228ff");
        } else if (this.d != null) {
            this.d.a(2, i + 1, hotSaleProductTabs, i2);
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.EnumC1205a enumC1205a) {
        Object[] objArr = {enumC1205a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "688e1025f7d7b77820cc2c0fc49e4cbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "688e1025f7d7b77820cc2c0fc49e4cbd");
        } else if (enumC1205a == a.EnumC1205a.LOGIN || enumC1205a == a.EnumC1205a.LOGOUT) {
            c(h.y);
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edd3138a70d9b893c31027ecf169b3b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edd3138a70d9b893c31027ecf169b3b3");
        } else {
            c(h.y);
        }
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(final Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c65199d371cf6415c9554660b63bc79c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c65199d371cf6415c9554660b63bc79c");
        } else if (!com.sankuai.waimai.store.goods.list.utils.e.a() || this.t == null || this.N == null) {
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserLandDelegateImp.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4ca0b7d298b57d3bbb13d5de752369d9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4ca0b7d298b57d3bbb13d5de752369d9");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    try {
                        hashMap.put("coupon_id", Long.valueOf(poiCouponItem.mCouponId));
                        hashMap.put("coupon_status", Integer.valueOf(poiCouponItem.mCouponStatus));
                        int a2 = SGNewUserLandDelegateImp.this.N.a((List<b>) SGNewUserLandDelegateImp.this.t.f, poiCouponItem);
                        if (a2 >= 0) {
                            SGNewUserLandDelegateImp.this.t.notifyItemChanged(a2, "UPDATE");
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                    }
                }
            }, 64L);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void syncRecycleViewScrollStatus(SGNewUserStickEvent sGNewUserStickEvent) {
        int b;
        Object[] objArr = {sGNewUserStickEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91f66251226f8f3fea5cdb33fb27a755", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91f66251226f8f3fea5cdb33fb27a755");
        } else if (this.N == null || this.t == null || (b = this.N.b(this.t.f)) < 0) {
        } else {
            this.t.notifyItemChanged(b);
        }
    }

    private void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4a8d27e66d8a486e8e3472374445bdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4a8d27e66d8a486e8e3472374445bdd");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("_isDspColdStart", this.H);
        hashMap.put("page_sourse_type", this.e);
        if (this.L) {
            hashMap.put("isFirstRequest", "1");
            this.L = false;
        } else {
            hashMap.put("isFirstRequest", "0");
        }
        com.sankuai.waimai.store.goods.list.utils.e.a(SGNewUserOutLinkRate.SGNewUserOutLinkRender, hashMap, true, "");
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final Map<String, Object> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f345d2974d5f52784f209b986e3993ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f345d2974d5f52784f209b986e3993ae");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("_isDspColdStart", this.H);
        hashMap.put("page_sourse_type", this.e);
        return hashMap;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.newuser.d.b
    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d6ef68bdb70193bf6f530fe44e2a4d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d6ef68bdb70193bf6f530fe44e2a4d3");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("categoryCode=");
        sb.append(this.y);
        sb.append("secondCategory=");
        sb.append(this.z);
        sb.append("pageSourceTypeIntent=");
        sb.append(this.e);
        sb.append("spuId=" + this.B);
        sb.append("skuId=" + this.B);
        sb.append("sourceIdIntent=" + this.f);
        sb.append("extraIntent=" + this.D);
        sb.append("page_sourse_type=" + this.e);
        if (this.b != null && this.b.getIntent() != null && this.b.getIntent().getData() != null) {
            sb.append("data uri=");
            sb.append(this.b.getIntent().getData().toString());
        }
        return sb.toString();
    }

    private String a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be85dfcee9129e2fff6a87cf0d963b8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be85dfcee9129e2fff6a87cf0d963b8f");
        }
        WMLocation i = com.sankuai.waimai.foundation.location.v2.g.a().i();
        if (i != null && i.getLatitude() > 0.0d) {
            map.put("hasActLocation", "1");
            return "hasActLocation=1-" + i.getLongitude() + CommonConstant.Symbol.MINUS + i.getLatitude();
        }
        map.put("hasActLocation", "2");
        return "hasActLocation=2";
    }

    private String b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6341434e85ccba3fe5c9f5645188f05d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6341434e85ccba3fe5c9f5645188f05d");
        }
        WMLocation p = com.sankuai.waimai.foundation.location.v2.g.a().p();
        if (p != null) {
            try {
                String valueOf = String.valueOf((long) (p.getLatitude() * 1000000.0d));
                String valueOf2 = String.valueOf((long) (p.getLongitude() * 1000000.0d));
                map.put("hasLocation", "1");
                return "hasLocation=1-" + valueOf + CommonConstant.Symbol.MINUS + valueOf2;
            } catch (NullPointerException unused) {
                map.put("hasLocation", "2");
                return "hasLocation=2";
            }
        }
        map.put("hasLocation", "2");
        return "hasLocation=2";
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "108785df315935ca75aa53e790c9c80c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "108785df315935ca75aa53e790c9c80c");
            return;
        }
        Map<String, Object> k = k();
        k.put("_isDspColdStart", this.H);
        k.put("page_sourse_type", this.e);
        String a2 = a(k);
        String b = b(k);
        if (this.K) {
            k.put("isFirstRequest", "1");
            this.K = false;
        } else {
            k.put("isFirstRequest", "0");
        }
        String str = l() + a2 + CommonConstant.Symbol.MINUS + b;
        com.sankuai.waimai.store.goods.list.utils.e.a(z ? SGNewUserOutLinkRate.SGNewUserRequestEmpty : SGNewUserOutLinkRate.SGNewUserRequestFail, k, false, str);
        ae.a("SGNewUserLandPresenter", str);
    }
}
