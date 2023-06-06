package com.sankuai.waimai.store.poi.list.refactor.card.actionbar;

import android.app.Activity;
import android.arch.lifecycle.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.im.api.msgcenter.a;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.refactor.event.k;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.MemberInfoEntity;
import com.sankuai.waimai.store.repository.model.NavigationTileConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.TitleMenuItemEntity;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.search.model.SearchCarouselText;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.viewblocks.MenuItemView;
import com.sankuai.waimai.store.viewblocks.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiChannelActionBar2 extends a implements a.b, d.a, com.sankuai.waimai.store.ocr.b {
    public static ChangeQuickRedirect x;
    protected View A;
    protected View B;
    protected View C;
    protected FrameLayout D;
    protected RelativeLayout E;
    protected ImageView F;
    protected TextView G;
    protected TextView H;
    protected TextView I;
    protected ViewGroup J;
    protected View K;
    protected Drawable L;
    protected View M;
    protected h N;
    protected List<TitleMenuItemEntity> O;
    protected TextView P;
    protected View Q;
    protected View R;
    protected View S;
    protected int T;
    protected TextView U;
    protected ImageView V;
    protected TextView W;
    protected ViewFlipper X;
    protected TextView Y;
    protected ImageView Z;
    private Drawable aA;
    private Drawable aB;
    private int aC;
    private int aD;
    private boolean aE;
    private final List<SearchCarouselText> aF;
    private PageEventHandler aG;
    private com.sankuai.waimai.store.base.statistic.a aH;
    private LinearLayout aa;
    private View ab;
    private ImageView ac;
    private String ad;
    private TextView ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private boolean an;
    private int ao;
    private int ap;
    private Drawable aq;
    private Drawable ar;
    private Drawable as;
    private Drawable at;
    private Drawable au;
    private Drawable av;
    private Drawable aw;
    private Drawable ax;
    private Drawable ay;
    private Drawable az;
    protected View y;
    protected View z;

    public static /* synthetic */ Map c(PoiChannelActionBar2 poiChannelActionBar2) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, poiChannelActionBar2, changeQuickRedirect, false, "76214d472236751b0f055ad47c458ff7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, poiChannelActionBar2, changeQuickRedirect, false, "76214d472236751b0f055ad47c458ff7");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tip_icon", 0);
        hashMap.put("category_code", Long.valueOf(poiChannelActionBar2.b.c));
        hashMap.put("sub_category_code", poiChannelActionBar2.b.f);
        hashMap.put("stid", poiChannelActionBar2.b.T);
        hashMap.put("entry_type", Integer.valueOf(poiChannelActionBar2.b.aS ? 1 : 0));
        return hashMap;
    }

    public PoiChannelActionBar2(@NonNull FragmentActivity fragmentActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.poi.list.callback.a aVar2) {
        super(fragmentActivity, aVar, aVar2);
        Object[] objArr = {fragmentActivity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ac97f0e4967e2f90b470051888b7166", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ac97f0e4967e2f90b470051888b7166");
            return;
        }
        this.T = 0;
        this.af = 0;
        this.ag = 0;
        this.ah = 0;
        this.ai = 0;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.am = 0;
        this.an = true;
        this.ao = -14539738;
        this.ap = -1;
        this.aC = -1;
        this.aE = false;
        this.aF = new ArrayList();
        this.ad = aVar.d();
        com.sankuai.waimai.business.im.api.msgcenter.a.a().registerMsgCenterUnreadChangeListener(this);
        this.aG = (PageEventHandler) q.a(fragmentActivity).a(PageEventHandler.class);
        this.aH = new com.sankuai.waimai.store.poi.list.logreport.a(a(), aVar);
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a, com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "776577928f8870af2422d017637135cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "776577928f8870af2422d017637135cf");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.business.im.api.msgcenter.a.a().unregisterMsgCenterUnreadChangeListener(this);
        r();
        com.sankuai.waimai.store.ocr.a.a().a(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5150a16de54f258d0b26005243a5f55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5150a16de54f258d0b26005243a5f55");
        } else if (this.N == null || !this.N.b()) {
        } else {
            this.N.a();
        }
    }

    @Subscribe
    public void onUnreadNumChange(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "291871a3a7d406439663edd13be446a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "291871a3a7d406439663edd13be446a1");
        } else if (kVar == null || this.N == null) {
        } else {
            this.N.a(kVar.a);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "890a287d3ff58c61be1031da92bc9318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "890a287d3ff58c61be1031da92bc9318");
            return;
        }
        if (this.P != null) {
            this.P.setVisibility(8);
        }
        if (this.J != null) {
            this.J.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d67b0f39727f3f8633707420af20d675", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d67b0f39727f3f8633707420af20d675");
        } else if (this.P != null) {
            this.P.setVisibility(0);
        }
    }

    public void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f20c739a2b8f8899949c30ca2672003", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f20c739a2b8f8899949c30ca2672003");
            return;
        }
        this.Q = this.y.findViewById(R.id.layout_actionbar_content);
        this.P = (TextView) this.y.findViewById(R.id.txt_title);
        this.ae = (TextView) this.y.findViewById(R.id.title_name);
        this.M = this.y.findViewById(R.id.location_line);
        this.U = (TextView) this.y.findViewById(R.id.location_address);
        this.V = (ImageView) this.y.findViewById(R.id.location_address_icon);
        this.ab = this.y.findViewById(R.id.rl_action_home_content);
        this.K = this.y.findViewById(R.id.address_layout);
        this.P.setText(this.ad);
        this.ae.setText(this.ad);
    }

    private void f(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e4f172b5175c554b579b562e944995b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e4f172b5175c554b579b562e944995b");
            return;
        }
        if (this.r != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.r.getLayoutParams();
            marginLayoutParams.leftMargin = com.sankuai.shangou.stone.util.h.a(getContext(), 10.0f);
            this.r.setLayoutParams(marginLayoutParams);
        }
        if (this.b.Z) {
            b(this.b.Y);
        }
        if (this.N == null) {
            this.N = new h(a(), 3, this.b);
            this.N.a(new PopupWindow.OnDismissListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2.4
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                }
            });
            this.N.i = new h.a() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.viewblocks.h.a
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e45f7de97c69cec8880b160e59858493", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e45f7de97c69cec8880b160e59858493");
                    } else {
                        PoiChannelActionBar2.this.a(PoiChannelActionBar2.this.getContext(), PoiChannelActionBar2.this.b, i);
                    }
                }

                @Override // com.sankuai.waimai.store.viewblocks.h.a
                public final void a(int i, List<Integer> list, SparseArray<MenuItemView> sparseArray) {
                    Object[] objArr2 = {Integer.valueOf(i), list, sparseArray};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad37b0c7faf3abf12f03e15493b1d403", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad37b0c7faf3abf12f03e15493b1d403");
                    } else {
                        PoiChannelActionBar2.this.b(PoiChannelActionBar2.this.mContext, PoiChannelActionBar2.this.b, "b_waimai_8797a5cl_mv");
                    }
                }

                @Override // com.sankuai.waimai.store.viewblocks.h.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c21f5a9d825f8530db9974e0e31cffc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c21f5a9d825f8530db9974e0e31cffc");
                    } else {
                        PoiChannelActionBar2.this.a(com.sankuai.waimai.store.config.k.d() ? PoiChannelActionBar2.this.c(PoiChannelActionBar2.this.e) : PoiChannelActionBar2.this.b(PoiChannelActionBar2.this.e));
                    }
                }
            };
        }
        if (poiVerticalityDataResponse.getNavigationBlock() != null && poiVerticalityDataResponse.getNavigationBlock().data != null) {
            this.O = poiVerticalityDataResponse.getNavigationBlock().data.functionEntranceList;
            if (this.N != null && com.sankuai.shangou.stone.util.a.c(this.O) > 0) {
                this.N.a(this.O);
                this.N.a(this.p);
            }
        }
        if (this.b.bc && this.ab != null) {
            this.ab.getLayoutParams().height = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_48) + (this.b.y ? this.T : 0) + this.o;
        }
        if (this.b.bc && this.S != null) {
            this.S.getLayoutParams().height = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_48) + this.T + this.o;
        }
        p();
    }

    public final void e(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1d67c5dac1ae8be8bf33f9cc628063b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1d67c5dac1ae8be8bf33f9cc628063b");
            return;
        }
        this.J = (ViewGroup) this.y.findViewById(R.id.ll_right_top_container);
        this.D = (FrameLayout) this.y.findViewById(R.id.fl_entrance_container);
        if (this.J == null || poiVerticalityDataResponse == null) {
            return;
        }
        u.c(this.J);
        u.c(this.D);
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a, com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30a907b2ea99a9669a36158f3538c281", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30a907b2ea99a9669a36158f3538c281") : super.onCreateView(layoutInflater, viewGroup);
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a, com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab6daaae6b183ba0b016498cea226d11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab6daaae6b183ba0b016498cea226d11");
            return;
        }
        super.onViewCreated();
        this.aD = com.sankuai.shangou.stone.util.h.a(getContext(), 14.0f);
        this.aq = ContextCompat.getDrawable(this.mView.getContext(), R.drawable.wm_sg_function_entrance_icon);
        this.ar = ContextCompat.getDrawable(this.mView.getContext(), R.drawable.wm_sg_member_entrance);
        this.as = ContextCompat.getDrawable(this.mView.getContext(), R.drawable.wm_sc_common_left_back_arrow);
        this.au = ContextCompat.getDrawable(this.mView.getContext(), R.drawable.wm_sc_search_shopcart_light);
        this.av = ContextCompat.getDrawable(this.mView.getContext(), R.drawable.wm_sc_search_more_information_light);
        this.ay = ContextCompat.getDrawable(this.mView.getContext(), R.drawable.wm_st_channel_action_bar_bg);
        this.aA = ContextCompat.getDrawable(this.mView.getContext(), R.drawable.wm_st_minutes_action_bar_bg);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "038066236f221e2373c8ce4d325b5d47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "038066236f221e2373c8ce4d325b5d47");
        } else {
            this.ac = (ImageView) findView(R.id.ocr_camera);
            this.ac.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2.7
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4afdde5b3da176893b6a9afeda970c37", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4afdde5b3da176893b6a9afeda970c37");
                    } else if (view.getContext() instanceof Activity) {
                        com.sankuai.waimai.store.ocr.a.a().a((Activity) view.getContext(), PoiChannelActionBar2.this);
                        com.sankuai.waimai.store.manager.judas.b.a(PoiChannelActionBar2.this.mContext, "b_waimai_sg_rj3ioc4p_mc").a("cat_id", t.a(String.valueOf(PoiChannelActionBar2.this.b.c)) ? "-999" : String.valueOf(PoiChannelActionBar2.this.b.c)).a("stid", "-999").a("page_type", 0).a();
                    }
                }
            });
        }
        p();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = x;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "256792ea2883073170bacfd19bce089d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "256792ea2883073170bacfd19bce089d");
        } else {
            this.y = ((ViewStub) b(R.id.vs_channel_location)).inflate();
            this.y.getLayoutParams().height = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_48) + (this.b.y ? this.T : 0);
            this.y.requestLayout();
        }
        n();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = x;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b52facd61b3d314e8a0ff0b1f8994dfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b52facd61b3d314e8a0ff0b1f8994dfa");
        } else {
            this.S = b(R.id.search_empty_view);
            int i = this.T;
            this.S.getLayoutParams().height = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_48) + i;
            if (this.Q != null) {
                ((ViewGroup.MarginLayoutParams) this.Q.getLayoutParams()).topMargin = i;
            }
            b(R.id.animate_home_action_search_outer).setVisibility(8);
            if (this.b.aS) {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = x;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0271bae79c565251cee4670132a4b978", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0271bae79c565251cee4670132a4b978");
                } else {
                    this.z = b(R.id.minutes_animate_action_search_outer);
                    this.A = b(R.id.minutes_animte_action_search);
                    this.B = b(R.id.minutes_search_layout);
                    this.r = (ImageView) b(R.id.minutes_search_shop_cart_img);
                    this.W = (TextView) b(R.id.minutes_tv_header_search_view);
                    this.X = (ViewFlipper) b(R.id.minutes_vf_search_carousel_text);
                    this.Y = (TextView) b(R.id.minutes_tv_header_search_button);
                    this.Z = (ImageView) b(R.id.minutes_iv_header_search_icon_left);
                    this.aa = (LinearLayout) b(R.id.minutes_buy_layout);
                    this.s = (ImageView) b(R.id.minutes_search_more_information_img);
                    u.a(this.s);
                }
                b(R.id.animate_channel_action_search_outer).setVisibility(8);
                b(R.id.minutes_animate_action_search_outer).setVisibility(0);
            } else {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = x;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "59240a8f3030f8d52e17b9d5bfe7ddd8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "59240a8f3030f8d52e17b9d5bfe7ddd8");
                } else {
                    this.z = b(R.id.animate_channel_action_search_outer);
                    this.A = b(R.id.animte_action_search);
                    this.W = (TextView) b(R.id.tv_header_search_view);
                    this.X = (ViewFlipper) b(R.id.vf_search_carousel_text);
                    this.Y = (TextView) b(R.id.tv_header_search_button);
                    this.Z = (ImageView) b(R.id.iv_header_search_icon_left);
                    this.aa = (LinearLayout) b(R.id.minutes_buy_layout);
                }
                b(R.id.animate_channel_action_search_outer).setVisibility(0);
                b(R.id.minutes_animate_action_search_outer).setVisibility(8);
            }
            this.C = b(R.id.layout_search_main);
            this.R = b(R.id.layout_title_container);
            this.A.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr7 = {view};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "db0a5290f78e694005ba3890ef0032a7", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "db0a5290f78e694005ba3890ef0032a7");
                        return;
                    }
                    SearchCarouselText searchCarouselText = null;
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) PoiChannelActionBar2.this.aF) && PoiChannelActionBar2.this.X != null) {
                        searchCarouselText = (SearchCarouselText) com.sankuai.shangou.stone.util.a.a((List<Object>) PoiChannelActionBar2.this.aF, PoiChannelActionBar2.this.X.getDisplayedChild());
                    }
                    if (PoiChannelActionBar2.this.c != null) {
                        PoiChannelActionBar2.this.c.a(searchCarouselText);
                    }
                }
            });
            if (this.r != null) {
                this.r.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr7 = {view};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "1eb956bd399d6aef7e2be33a4631a1a8", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "1eb956bd399d6aef7e2be33a4631a1a8");
                            return;
                        }
                        if (PoiChannelActionBar2.this.aH != null) {
                            PoiChannelActionBar2.this.m();
                            PoiChannelActionBar2.this.aH.a(PoiChannelActionBar2.c(PoiChannelActionBar2.this));
                        }
                        PoiChannelActionBar2.this.a(PoiChannelActionBar2.this.aG);
                    }
                });
            }
            if (this.s != null) {
                this.s.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr7 = {view};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "eef2c6c3788cb0bf741221d3eb85628c", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "eef2c6c3788cb0bf741221d3eb85628c");
                        } else if (PoiChannelActionBar2.this.N == null || com.sankuai.shangou.stone.util.a.c(PoiChannelActionBar2.this.O) <= 0) {
                        } else {
                            PoiChannelActionBar2.this.N.a(PoiChannelActionBar2.this.B);
                            PoiChannelActionBar2.this.a(PoiChannelActionBar2.this.mContext, PoiChannelActionBar2.this.b, "b_PKwLc");
                        }
                    }
                });
            }
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = x;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "0bf82b877eb04b8218ff2629503b622f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "0bf82b877eb04b8218ff2629503b622f");
        } else {
            this.t = (ImageView) this.y.findViewById(R.id.iv_back);
            c(-14539738);
            this.t.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr8 = {view};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "2fb39a40a738d72b5ca02391d11568d3", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "2fb39a40a738d72b5ca02391d11568d3");
                    } else if (PoiChannelActionBar2.this.c != null) {
                        PoiChannelActionBar2.this.c.bF_();
                    }
                }
            });
        }
        d(-14539738);
        f();
    }

    private void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "407d4548377777569c4b6ca5d062618d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "407d4548377777569c4b6ca5d062618d");
            return;
        }
        this.T = u.a();
        this.af = com.sankuai.shangou.stone.util.h.a((Context) a());
        this.ag = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12);
        this.ah = com.sankuai.shangou.stone.util.h.a(a(), this.b.aS ? 48.0f : 46.0f) + this.T + (this.b.bc ? this.o : 0);
        this.ai = this.af - (this.ag * 2);
        this.aj = com.sankuai.shangou.stone.util.h.a(a(), this.b.aS ? 33.0f : 35.0f);
        this.ak = com.sankuai.shangou.stone.util.h.a(a(), this.b.aS ? 32.0f : 34.0f);
        this.al = com.sankuai.shangou.stone.util.h.a(a(), 46.0f);
        this.am = com.sankuai.shangou.stone.util.h.a(a(), 46.0f);
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void a(int i, View view, View view2) {
        int dimensionPixelOffset;
        int i2;
        int i3;
        Object[] objArr = {Integer.valueOf(i), view, view2};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c808bcb651114c6ab7a3e881cb172c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c808bcb651114c6ab7a3e881cb172c5");
            return;
        }
        int abs = Math.abs(i);
        int height = ((this.y.getHeight() - (this.b.y ? this.T : 0)) - com.sankuai.shangou.stone.util.h.a(getContext(), 9.0f)) + this.n;
        if (height <= 0) {
            return;
        }
        int i4 = this.ag;
        this.ap = ((Integer) view.getTag()).intValue();
        if (abs >= 0) {
            float f = abs * 1.0f;
            float f2 = height;
            float min = Math.min(f / f2, 1.0f);
            float min2 = Math.min(f / (height + com.sankuai.shangou.stone.util.h.a(this.mContext, 25.0f)), 1.0f);
            int i5 = (int) (f2 * min);
            if (!this.b.Y) {
                d(min > 0.5f);
            }
            this.S.getLayoutParams().height = this.ah - i5;
            a(view, min2, this.R, this.ap);
            b(min);
            c(min);
            a(1.0f - min);
            int i6 = this.ai;
            Object[] objArr2 = {Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = x;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dedf43fe8f0aa9fdb6fe95429b59de1c", RobustBitConfig.DEFAULT_VALUE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dedf43fe8f0aa9fdb6fe95429b59de1c")).intValue();
            } else {
                int q = this.af - q();
                Object[] objArr3 = {Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = x;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7674452e7d4b7b2fe7f4fac96bac28b6", RobustBitConfig.DEFAULT_VALUE)) {
                    dimensionPixelOffset = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7674452e7d4b7b2fe7f4fac96bac28b6")).intValue();
                } else if ((this.E != null && this.E.getVisibility() == 0) || (this.H != null && this.H.getVisibility() == 0)) {
                    dimensionPixelOffset = this.J.getWidth() + ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).rightMargin + i4;
                } else {
                    boolean z = this.b.y;
                    dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12);
                }
                i2 = q - dimensionPixelOffset;
            }
            int i7 = i6 - ((int) ((i6 - i2) * min));
            int i8 = this.aj - ((int) ((i3 - this.ak) * min));
            int q2 = (int) ((q() - i4) * min);
            this.Y.getLayoutParams().width = this.al - ((int) ((this.al - this.am) * min));
            Object[] objArr4 = {Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(q2)};
            ChangeQuickRedirect changeQuickRedirect4 = x;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "58ab1c19970bf5661ce399929777ea8d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "58ab1c19970bf5661ce399929777ea8d");
            } else {
                ViewGroup.LayoutParams layoutParams = this.A.getLayoutParams();
                layoutParams.width = i7;
                layoutParams.height = i8;
                this.A.setTranslationX(q2);
            }
            this.A.requestLayout();
            if (abs == 0) {
                a(1.0f);
                b(0.0f);
                c(0.0f);
                a(view, 0.0f, this.R, this.ap);
            }
            e(abs);
        }
    }

    private void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e66dcd4b4871db00459d2bc5a5d9b16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e66dcd4b4871db00459d2bc5a5d9b16");
        } else if (this.b.Z && !this.b.Y) {
            int a = com.sankuai.waimai.store.poi.list.util.d.a(f);
            if (this.H != null && this.ar != null) {
                this.H.setCompoundDrawables(null, e.a(this.ar, a), null, null);
            }
            if (this.I != null && this.aq != null) {
                this.I.setBackground(e.a(this.aq, a));
            }
            if (this.as != null && this.b.aX) {
                if (this.at == null) {
                    this.at = e.a(this.as, a);
                } else {
                    DrawableCompat.setTintList(this.at, ColorStateList.valueOf(a));
                }
                this.t.setBackground(this.at);
            }
            if (this.r != null && this.au != null && this.b.aS && this.b.aX) {
                if (this.aw == null) {
                    this.aw = e.a(this.au, a);
                } else {
                    DrawableCompat.setTintList(this.aw, ColorStateList.valueOf(a));
                }
                this.r.setBackground(this.au);
            }
            if (this.b.bb && this.s != null && this.av != null && this.b.aS && this.b.aX) {
                if (this.ax == null) {
                    this.ax = e.a(this.av, a);
                } else {
                    DrawableCompat.setTintList(this.ax, ColorStateList.valueOf(a));
                }
                this.s.setBackground(this.av);
            }
        }
    }

    private void c(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cef71572027c5f84166f1ffe5e356d43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cef71572027c5f84166f1ffe5e356d43");
        } else if (this.b.ab || !this.b.aX || this.A == null) {
        } else {
            int b = com.sankuai.waimai.store.poi.list.util.d.b(f);
            if (this.b.aS) {
                if (this.aB == null) {
                    this.aB = e.a(this.aA, b);
                } else {
                    DrawableCompat.setTintList(this.aB, ColorStateList.valueOf(b));
                }
                this.A.setBackground(this.aA);
                return;
            }
            if (this.az == null) {
                this.az = e.a(this.ay, b);
            } else {
                DrawableCompat.setTintList(this.az, ColorStateList.valueOf(b));
            }
            this.A.setBackground(this.ay);
        }
    }

    private int q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6511b5258b3031187a7b7be7a01854d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6511b5258b3031187a7b7be7a01854d")).intValue() : (this.t.getWidth() - this.aD) + ((ViewGroup.MarginLayoutParams) this.t.getLayoutParams()).leftMargin + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_16);
    }

    public void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5c54bb0a28f02365d3987c4be49cefa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5c54bb0a28f02365d3987c4be49cefa");
            return;
        }
        if (this.P.getVisibility() == 0) {
            this.P.setAlpha(f);
        }
        if (this.g != null) {
            this.g.setAlpha(f);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void a(@Nullable MemberInfoEntity memberInfoEntity) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "304983d0eea61a934535dae212e8e429", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "304983d0eea61a934535dae212e8e429");
        } else {
            u.c(this.H);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa3451c27a15ff920fbdfa4f3f7998fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa3451c27a15ff920fbdfa4f3f7998fb");
            return;
        }
        d(this.b.Y);
        this.ao = i;
        if (this.P != null) {
            this.P.setTextColor(i);
        }
        if (this.H != null) {
            if (this.ar != null) {
                this.H.setCompoundDrawables(null, e.a(this.ar, i), null, null);
            }
            this.H.setTextColor(i);
        }
        com.sankuai.waimai.store.param.a aVar = this.b;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "07430b79341d13555dd1fc99eaee8e68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "07430b79341d13555dd1fc99eaee8e68");
        } else if (this.I != null && this.aq != null && aVar != null) {
            this.I.setBackground(e.a(this.aq, this.ao));
        }
        if (this.b.Z) {
            c(i);
        }
        f(i);
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9debca13afe7e67dfb813c45ecefa256", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9debca13afe7e67dfb813c45ecefa256");
        } else if (a() != null) {
            if (this.aC < 0) {
                this.aC = z ? 1 : 2;
                com.sankuai.waimai.platform.capacity.immersed.a.b(a(), z);
                return;
            }
            int i = z ? 1 : 2;
            if (i != this.aC) {
                this.aC = i;
                com.sankuai.waimai.platform.capacity.immersed.a.b(a(), z);
            }
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b06c8b2fc7a3aad3aeb226362ac9de13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b06c8b2fc7a3aad3aeb226362ac9de13");
        } else if (this.t == null || this.as == null) {
        } else {
            if (this.at == null) {
                this.at = e.a(this.as, i);
            } else {
                DrawableCompat.setTintList(this.at, ColorStateList.valueOf(i));
            }
            this.t.setBackground(this.at);
        }
    }

    public void f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d00702586be3dfac2baecc7d5e15d0fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d00702586be3dfac2baecc7d5e15d0fa");
            return;
        }
        if (this.ae != null) {
            this.ae.setTextColor(i);
        }
        if (this.M != null) {
            this.M.setBackgroundColor(this.b.Y ? 855638016 : 1728053247);
        }
        if (this.U != null) {
            this.U.setTextColor(i);
        }
        o();
    }

    public void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2967d67f3b1fec4057147eb9fd6e4149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2967d67f3b1fec4057147eb9fd6e4149");
            return;
        }
        Drawable drawable = ContextCompat.getDrawable(a(), R.drawable.wm_sc_poi_channel_arrow_right);
        if (this.V == null || drawable == null) {
            return;
        }
        this.V.setImageDrawable(e.a(drawable, this.b.Y ? 1713513510 : -1711276033));
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        int a;
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aa839a6c8e12863bb2f2978f3a607c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aa839a6c8e12863bb2f2978f3a607c0");
            return;
        }
        super.a(poiVerticalityDataResponse);
        if (poiVerticalityDataResponse == null) {
            return;
        }
        Object[] objArr2 = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b284a74be5f87c3f3ae95090ba17eb6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b284a74be5f87c3f3ae95090ba17eb6e");
        } else {
            BaseTile<BaseModuleDesc, NavigationTileConfig> navigationBlock = poiVerticalityDataResponse.getNavigationBlock();
            if (navigationBlock != null && navigationBlock.propsData != null && navigationBlock.data != null) {
                NavigationTileConfig navigationTileConfig = navigationBlock.propsData;
                BaseModuleDesc baseModuleDesc = navigationBlock.data;
                r();
                if (this.X != null && baseModuleDesc.searchCarouselTextInfo != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) baseModuleDesc.searchCarouselTextInfo.searchCarouselTextList) && baseModuleDesc.searchCarouselTextInfo.carouselTime > 0) {
                    u.a(this.X);
                    u.c(this.W);
                    if (this.b.aS) {
                        u.c(this.aa);
                    }
                    List<SearchCarouselText> list = baseModuleDesc.searchCarouselTextInfo.searchCarouselTextList;
                    int i = baseModuleDesc.searchCarouselTextInfo.carouselTime;
                    Object[] objArr3 = {list, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = x;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "725f21f4d30f2f13a0c540e22b44e3dc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "725f21f4d30f2f13a0c540e22b44e3dc");
                    } else {
                        this.aF.addAll(list);
                        if (this.X != null && !com.sankuai.shangou.stone.util.a.b(this.aF)) {
                            for (int i2 = 0; i2 < this.aF.size(); i2++) {
                                SearchCarouselText searchCarouselText = (SearchCarouselText) com.sankuai.shangou.stone.util.a.a((List<Object>) this.aF, i2);
                                if (searchCarouselText != null) {
                                    View inflate = getLayoutInflater().inflate(R.layout.search_carousel_text_item, (ViewGroup) null);
                                    TextView textView = (TextView) inflate.findViewById(R.id.tv_search_carousel_text_item_text);
                                    LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.search_minutes_layout);
                                    if (this.b.aS) {
                                        linearLayout.setVisibility(0);
                                    } else {
                                        linearLayout.setVisibility(8);
                                    }
                                    if (!t.a(searchCarouselText.text)) {
                                        u.a(textView, searchCarouselText.text);
                                        this.X.addView(inflate);
                                    }
                                }
                            }
                            this.X.setInAnimation(this.mContext, R.anim.search_carousel_text_in);
                            this.X.setOutAnimation(this.mContext, R.anim.search_carousel_text_out);
                            if (this.aF.size() == 1) {
                                g(0);
                            } else if (this.aF.size() > 1) {
                                this.X.setFlipInterval(i);
                                this.X.startFlipping();
                                this.X.getInAnimation().setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2.8
                                    public static ChangeQuickRedirect a;

                                    @Override // android.view.animation.Animation.AnimationListener
                                    public final void onAnimationEnd(Animation animation) {
                                    }

                                    @Override // android.view.animation.Animation.AnimationListener
                                    public final void onAnimationRepeat(Animation animation) {
                                    }

                                    @Override // android.view.animation.Animation.AnimationListener
                                    public final void onAnimationStart(Animation animation) {
                                        Object[] objArr4 = {animation};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a293f949e3a3315e757bf3e9ef0b59d8", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a293f949e3a3315e757bf3e9ef0b59d8");
                                        } else {
                                            PoiChannelActionBar2.this.g(PoiChannelActionBar2.this.X.getDisplayedChild());
                                        }
                                    }
                                });
                            }
                        }
                    }
                } else if (!TextUtils.isEmpty(baseModuleDesc.searchText)) {
                    u.a(this.W);
                    u.c(this.X);
                    if (this.b.aS) {
                        u.a(this.aa);
                    }
                    u.a(this.W, baseModuleDesc.searchText);
                }
                PoiVerticalityDataResponse.ButtonArea c = c();
                Integer a2 = com.sankuai.shangou.stone.util.d.a((c == null || t.a(c.endColor)) ? navigationTileConfig.searchIconColor : c.endColor);
                if (a2 != null) {
                    if (this.b.aX) {
                        this.Z.setBackground(e.a(getContext().getResources().getDrawable(R.drawable.wm_st_actionbar_search_white), com.sankuai.shangou.stone.util.d.a("#858687").intValue()));
                    } else {
                        this.Z.setBackground(e.a(getContext().getResources().getDrawable(R.drawable.wm_st_actionbar_search_white), a2.intValue()));
                    }
                }
                int a3 = com.sankuai.shangou.stone.util.d.a(navigationTileConfig.searchBarBgColor, -1);
                boolean isEmpty = TextUtils.isEmpty(navigationTileConfig.searchButtonBgFromColor);
                int i3 = R.dimen.wm_sc_common_dimen_16;
                if (!isEmpty) {
                    this.Y.setVisibility(0);
                    int a4 = com.sankuai.shangou.stone.util.d.a((c == null || t.a(c.startColor)) ? navigationTileConfig.searchButtonBgFromColor : c.startColor, -7859);
                    int a5 = com.sankuai.shangou.stone.util.d.a((c == null || t.a(c.endColor)) ? navigationTileConfig.searchButtonBgToColor : c.endColor, -15539);
                    if (!b()) {
                        com.sankuai.shangou.stone.util.d.a(navigationTileConfig.searchButtonTextColor, -1);
                    }
                    if (this.b.aX) {
                        e.a(getContext(), new int[]{com.sankuai.shangou.stone.util.d.a("#FAFAFA").intValue(), com.sankuai.shangou.stone.util.d.a("#FAFAFA").intValue()}, R.dimen.wm_sc_common_dimen_16, GradientDrawable.Orientation.TL_BR);
                    } else {
                        e.a(getContext(), new int[]{a4, a5}, R.dimen.wm_sc_common_dimen_16, GradientDrawable.Orientation.TL_BR);
                    }
                    if (!this.b.aS) {
                        this.Y.setTextColor(com.sankuai.shangou.stone.util.d.a(DiagnoseLog.COLOR_ERROR).intValue());
                    }
                } else {
                    this.Y.setTextColor(com.sankuai.shangou.stone.util.d.a(DiagnoseLog.COLOR_ERROR).intValue());
                }
                e.a aVar = new e.a();
                Resources resources = getContext().getResources();
                if (!this.b.aS) {
                    i3 = R.dimen.wm_sc_common_dimen_17;
                }
                e.a c2 = aVar.a(resources.getDimension(i3)).c(a3);
                if (c != null && !t.a(c.endColor)) {
                    c2.b(3).a(com.sankuai.shangou.stone.util.d.a(c.endColor, -15539));
                } else if (!t.a(navigationTileConfig.searchBarFrameColor)) {
                    if (!this.b.aS) {
                        c2.b(3).a(com.sankuai.shangou.stone.util.d.a(navigationTileConfig.searchBarFrameColor, -15539));
                    }
                } else {
                    c2.b(3).a(-15539);
                }
                if (this.b.aX) {
                    if (this.b.aS) {
                        a = com.sankuai.shangou.stone.util.d.a("#0F000000", -15539);
                    } else {
                        a = com.sankuai.shangou.stone.util.d.a("#FFFFFF", -15539);
                    }
                    c2.b(3).a(a);
                }
                if (this.b.aS) {
                    this.A.setBackground(c2.a());
                }
                this.W.setTextColor(com.sankuai.shangou.stone.util.d.a(navigationTileConfig.searchBarPlaceholderFontColor, -6711404));
                if (this.b.aS) {
                    this.r.setVisibility(d(poiVerticalityDataResponse) ? 0 : 8);
                    this.A.getLayoutParams().width = (this.ai - ((this.r == null || this.r.getVisibility() != 0) ? 0 : this.r.getWidth() + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_13))) - ((this.b.bb && this.s != null && this.s.getVisibility() == 0) ? this.s.getWidth() + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_10) : 0);
                    a(this.b);
                }
            }
        }
        if ("1".equals(this.b.ah)) {
            this.ac.setVisibility(0);
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_rj3ioc4p_mv", this.ac);
            bVar.a("cat_id", t.a(String.valueOf(this.b.c)) ? "-999" : String.valueOf(this.b.c));
            bVar.a("stid", "-999");
            bVar.a("page_type", 0);
            com.sankuai.waimai.store.expose.v2.b.a().a(a(), bVar);
        } else {
            this.ac.setVisibility(8);
        }
        if (this.b.bb) {
            f(poiVerticalityDataResponse);
        } else {
            u.c(this.s);
        }
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c32459cae4c8332fd06904d725ae5127", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c32459cae4c8332fd06904d725ae5127");
            return;
        }
        this.aF.clear();
        if (this.X != null) {
            this.X.stopFlipping();
            this.X.removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "583646cc44a34ccc8e4ea65796442e6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "583646cc44a34ccc8e4ea65796442e6e");
            return;
        }
        SearchCarouselText searchCarouselText = (SearchCarouselText) com.sankuai.shangou.stone.util.a.a((List<Object>) this.aF, i);
        if (searchCarouselText == null || this.c == null || searchCarouselText.isExposed) {
            return;
        }
        searchCarouselText.isExposed = true;
        searchCarouselText.index = i;
        this.c.b(searchCarouselText);
    }

    @Override // com.sankuai.waimai.business.im.api.msgcenter.a.b
    public final void a(boolean z, boolean z2, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fefc4dba813b9aac4fbd8da15bb4466", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fefc4dba813b9aac4fbd8da15bb4466");
        } else if (this.E == null || !com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
        } else {
            this.E.post(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar2.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47128e94821f53dda86d1c02d0c98e06", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47128e94821f53dda86d1c02d0c98e06");
                    } else {
                        com.sankuai.waimai.imbase.manager.b.a().a(PoiChannelActionBar2.this);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a514baf53957bd3de26d4ad1102621c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a514baf53957bd3de26d4ad1102621c");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc2c656519d94da6762cebe92fa64c70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc2c656519d94da6762cebe92fa64c70");
        } else if (this.aE && this.E != null && this.an) {
            if (i > 0) {
                u.a(this.G);
                this.G.setTag(1);
                u.c(this.F);
                this.F.setTag(-1);
                this.G.setText(i <= 99 ? String.valueOf(i) : "99+");
                return;
            }
            u.c(this.G);
            this.G.setTag(-1);
            if (com.sankuai.waimai.business.im.api.msgcenter.a.a().showMsgCenterDot()) {
                u.a(this.F);
            } else {
                u.c(this.F);
            }
            this.F.setTag(1);
        }
    }

    @Override // com.sankuai.waimai.store.ocr.b
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd8ca593d5010bf2b8fa519ae96a01e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd8ca593d5010bf2b8fa519ae96a01e4");
            return;
        }
        SearchCarouselText searchCarouselText = null;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.aF) && this.X != null) {
            searchCarouselText = (SearchCarouselText) com.sankuai.shangou.stone.util.a.a((List<Object>) this.aF, this.X.getDisplayedChild());
        }
        g.a(this.mContext, this.b, str, searchCarouselText, true, "");
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void b(int i, View view, @Nullable @org.jetbrains.annotations.Nullable View view2) {
        int dimensionPixelOffset;
        int i2;
        int i3;
        Object[] objArr = {Integer.valueOf(i), view, view2};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90fef7f15e646df23ced6dcc869ff3bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90fef7f15e646df23ced6dcc869ff3bf");
            return;
        }
        int abs = Math.abs(i);
        int height = ((this.y.getHeight() - (this.b.y ? this.T : 0)) - com.sankuai.shangou.stone.util.h.a(getContext(), 9.0f)) + this.n + (this.b.bc ? this.o : 0);
        if (height <= 0) {
            return;
        }
        int i4 = this.ag;
        this.ap = ((Integer) view.getTag()).intValue();
        if (abs >= 0) {
            float f = abs * 1.0f;
            float f2 = height;
            float min = Math.min(f / f2, 1.0f);
            float min2 = Math.min(f / (height + com.sankuai.shangou.stone.util.h.a(this.mContext, 25.0f)), 1.0f);
            int i5 = (int) (f2 * min);
            if (!this.b.Y) {
                d(min > 0.5f);
            }
            ViewGroup.LayoutParams layoutParams = this.S.getLayoutParams();
            layoutParams.height = this.ah - i5;
            a(view, min2, this.R, this.ap);
            b(min);
            c(min);
            a(1.0f - min);
            int width = (this.ai - ((this.r == null || this.r.getVisibility() != 0) ? 0 : this.r.getWidth() + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_13))) - ((this.b.bb && this.s != null && this.s.getVisibility() == 0) ? this.s.getWidth() + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_10) : 0);
            Object[] objArr2 = {Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = x;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c33084ee02bfa9f8b5c68fbf0259f52f", RobustBitConfig.DEFAULT_VALUE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c33084ee02bfa9f8b5c68fbf0259f52f")).intValue();
            } else {
                int q = this.af - q();
                Object[] objArr3 = {Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = x;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "25cf978966bc8bbd24e029cb8d3fc97b", RobustBitConfig.DEFAULT_VALUE)) {
                    dimensionPixelOffset = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "25cf978966bc8bbd24e029cb8d3fc97b")).intValue();
                } else {
                    dimensionPixelOffset = this.b.aS ? getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12) : i4;
                    if (this.b.aS && this.r != null && this.r.getVisibility() == 0) {
                        int width2 = dimensionPixelOffset + this.r.getWidth() + this.r.getPaddingLeft() + this.r.getPaddingRight();
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.r.getLayoutParams();
                        dimensionPixelOffset = width2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    }
                    if (this.b.bb && this.s != null && this.s.getVisibility() == 0) {
                        int width3 = dimensionPixelOffset + this.s.getWidth() + this.s.getPaddingLeft() + this.s.getPaddingRight();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.s.getLayoutParams();
                        dimensionPixelOffset = width3 + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                    }
                }
                i2 = q - dimensionPixelOffset;
            }
            int i6 = width - ((int) ((width - i2) * min));
            int i7 = this.aj - ((int) ((i3 - this.ak) * min));
            int q2 = (int) ((q() - i4) * min);
            this.Y.getLayoutParams().width = this.al - ((int) ((this.al - this.am) * min));
            Object[] objArr4 = {Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(q2)};
            ChangeQuickRedirect changeQuickRedirect4 = x;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4ad4e593f7b969b67ab3f80153af0fbe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4ad4e593f7b969b67ab3f80153af0fbe");
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.A.getLayoutParams();
                layoutParams2.width = i6;
                layoutParams2.height = i7;
                this.B.setTranslationX(q2);
            }
            this.A.requestLayout();
            if (abs == 0) {
                layoutParams.height = this.ah;
                a(1.0f);
                b(0.0f);
                c(0.0f);
                a(view, 0.0f, this.R, this.ap);
            }
            e(abs);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaf59fb16ff273a43d9d2fa92a514e3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaf59fb16ff273a43d9d2fa92a514e3f");
        } else {
            b(str);
        }
    }
}
