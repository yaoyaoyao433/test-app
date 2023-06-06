package com.sankuai.waimai.store.poi.list.refactor.card.actionbar;

import android.app.Activity;
import android.arch.lifecycle.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.im.api.msgcenter.a;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.poi.list.refactor.event.k;
import com.sankuai.waimai.store.repository.model.MemberInfoEntity;
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
public class PoiChannelActionBar extends a implements a.b, d.a, com.sankuai.waimai.store.ocr.b {
    public static ChangeQuickRedirect x;
    protected View A;
    protected View B;
    protected View C;
    protected RelativeLayout D;
    protected ImageView E;
    protected TextView F;
    protected TextView G;
    protected TextView H;
    protected ViewGroup I;
    protected View J;
    protected Drawable K;
    protected View L;
    protected h M;
    protected List<TitleMenuItemEntity> N;
    protected TextView O;
    protected View P;
    protected View Q;
    protected View R;
    protected int S;
    public TextView T;
    public ImageView U;
    protected TextView V;
    protected ViewFlipper W;
    protected TextView X;
    protected ImageView Y;
    protected int Z;
    private com.sankuai.waimai.store.base.statistic.a aA;
    protected LinearLayout aa;
    protected Drawable ab;
    protected Drawable ac;
    private LinearLayout ad;
    private ImageView ae;
    private String af;
    private TextView ag;
    private int ah;
    private int ai;
    private int aj;
    private int ak;
    private int al;
    private int am;
    private int an;
    private boolean ao;
    private int ap;
    private int aq;
    private Drawable ar;
    private Drawable as;
    private Drawable at;
    private Drawable au;
    private int av;
    private int aw;
    private boolean ax;
    private final List<SearchCarouselText> ay;
    private PageEventHandler az;
    protected View y;
    protected View z;

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public void g() {
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public void h() {
    }

    public int n() {
        return R.id.vs_channel_location;
    }

    public static /* synthetic */ Map c(PoiChannelActionBar poiChannelActionBar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, poiChannelActionBar, changeQuickRedirect, false, "84662a9a85af874f8ba996668acce102", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, poiChannelActionBar, changeQuickRedirect, false, "84662a9a85af874f8ba996668acce102");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tip_icon", 0);
        hashMap.put("category_code", Long.valueOf(poiChannelActionBar.b.c));
        hashMap.put("sub_category_code", poiChannelActionBar.b.f);
        hashMap.put("stid", poiChannelActionBar.b.T);
        hashMap.put("entry_type", Integer.valueOf(poiChannelActionBar.b.aS ? 1 : 0));
        return hashMap;
    }

    public PoiChannelActionBar(@NonNull FragmentActivity fragmentActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.poi.list.callback.a aVar2) {
        super(fragmentActivity, aVar, aVar2);
        Object[] objArr = {fragmentActivity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "884c9a80b9220c160239b6251745569a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "884c9a80b9220c160239b6251745569a");
            return;
        }
        this.S = 0;
        this.ah = 0;
        this.ai = 0;
        this.aj = 0;
        this.Z = 0;
        this.ak = 0;
        this.al = 0;
        this.am = 0;
        this.an = 0;
        this.ao = true;
        this.ap = -14539738;
        this.aq = -1;
        this.av = -1;
        this.ax = false;
        this.ay = new ArrayList();
        this.af = aVar.d();
        com.sankuai.waimai.business.im.api.msgcenter.a.a().registerMsgCenterUnreadChangeListener(this);
        this.az = (PageEventHandler) q.a(fragmentActivity).a(PageEventHandler.class);
        this.aA = new com.sankuai.waimai.store.poi.list.logreport.a(a(), aVar);
        this.ac = new e.a().a(getContext().getResources().getDimension(R.dimen.wm_sc_common_dimen_16)).c(getContext().getResources().getColor(R.color.white)).b(3).a(getContext().getResources().getColor(R.color.wm_sg_home_search_bar_stroke_color)).a();
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a, com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "010228cc52a0fba17e7891d94964476c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "010228cc52a0fba17e7891d94964476c");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.business.im.api.msgcenter.a.a().unregisterMsgCenterUnreadChangeListener(this);
        q();
        com.sankuai.waimai.store.ocr.a.a().a(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fad1e7595b9d0a612444cb5b1c3d78ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fad1e7595b9d0a612444cb5b1c3d78ae");
        } else if (this.M == null || !this.M.b()) {
        } else {
            this.M.a();
        }
    }

    @Subscribe
    public void onUnreadNumChange(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6564b552d4e48249e90601919c5c879e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6564b552d4e48249e90601919c5c879e");
        } else if (kVar == null || this.M == null) {
        } else {
            this.M.a(kVar.a);
        }
    }

    public void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d800df9e9a139761c3ef7daedc013710", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d800df9e9a139761c3ef7daedc013710");
            return;
        }
        this.P = this.y.findViewById(R.id.layout_actionbar_content);
        this.O = (TextView) this.y.findViewById(R.id.txt_title);
        this.ag = (TextView) this.y.findViewById(R.id.title_name);
        this.L = this.y.findViewById(R.id.location_line);
        this.T = (TextView) this.y.findViewById(R.id.location_address);
        this.U = (ImageView) this.y.findViewById(R.id.location_address_icon);
        this.J = this.y.findViewById(R.id.address_layout);
        this.O.setText(this.af);
        this.ag.setText(this.af);
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a, com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbf91e532172e19af2cf727d3bef8ef3", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbf91e532172e19af2cf727d3bef8ef3") : super.onCreateView(layoutInflater, viewGroup);
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a, com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eb08da6957d0cfa19349373e20094ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eb08da6957d0cfa19349373e20094ee");
            return;
        }
        super.onViewCreated();
        this.aw = com.sankuai.shangou.stone.util.h.a(getContext(), 14.0f);
        this.ar = ContextCompat.getDrawable(this.mView.getContext(), R.drawable.wm_sg_function_entrance_icon);
        this.as = ContextCompat.getDrawable(this.mView.getContext(), R.drawable.wm_sg_member_entrance);
        this.at = ContextCompat.getDrawable(this.mView.getContext(), R.drawable.wm_sc_common_left_back_arrow);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fef5477e4e20f6dcd71d3cdd3a431484", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fef5477e4e20f6dcd71d3cdd3a431484");
        } else {
            this.ae = (ImageView) findView(R.id.ocr_camera);
            this.ae.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar.7
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79191214250917b4760ce01c64b14553", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79191214250917b4760ce01c64b14553");
                    } else if (view.getContext() instanceof Activity) {
                        com.sankuai.waimai.store.ocr.a.a().a((Activity) view.getContext(), PoiChannelActionBar.this);
                        com.sankuai.waimai.store.manager.judas.b.a(PoiChannelActionBar.this.mContext, "b_waimai_sg_rj3ioc4p_mc").a("cat_id", t.a(String.valueOf(PoiChannelActionBar.this.b.c)) ? "-999" : String.valueOf(PoiChannelActionBar.this.b.c)).a("stid", "-999").a("page_type", 0).a();
                    }
                }
            });
        }
        r();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = x;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0fb25d7773d288e3f208ce3bbcf4cc1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0fb25d7773d288e3f208ce3bbcf4cc1a");
        } else {
            this.y = ((ViewStub) b(n())).inflate();
            this.y.getLayoutParams().height = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_48) + (this.b.y ? this.S : 0);
            this.y.requestLayout();
        }
        o();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = x;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "07c70df555a9229bbfc146abc1589400", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "07c70df555a9229bbfc146abc1589400");
        } else {
            this.R = b(R.id.search_empty_view);
            int i = this.S;
            this.R.getLayoutParams().height = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_48) + i;
            if (this.P != null) {
                ((ViewGroup.MarginLayoutParams) this.P.getLayoutParams()).topMargin = i;
            }
            b(R.id.animate_channel_action_search_outer).setVisibility(8);
            if (this.b.aS) {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = x;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d95896bedf3d7e06c070c82f1dc80ac1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d95896bedf3d7e06c070c82f1dc80ac1");
                } else {
                    this.z = b(R.id.minutes_animate_action_search_outer);
                    this.A = b(R.id.minutes_animte_action_search);
                    this.B = b(R.id.minutes_search_layout);
                    this.V = (TextView) b(R.id.minutes_tv_header_search_view);
                    this.W = (ViewFlipper) b(R.id.minutes_vf_search_carousel_text);
                    this.X = (TextView) b(R.id.minutes_tv_header_search_button);
                    this.Y = (ImageView) b(R.id.minutes_iv_header_search_icon_left);
                    this.r = (ImageView) b(R.id.minutes_search_shop_cart_img);
                    this.ad = (LinearLayout) b(R.id.minutes_buy_layout);
                    this.aa = (LinearLayout) b(R.id.ll_minutes_search_divider);
                    this.s = (ImageView) b(R.id.minutes_search_more_information_img);
                    u.a(this.s);
                }
                b(R.id.animate_home_action_search_outer).setVisibility(8);
                b(R.id.minutes_animate_action_search_outer).setVisibility(0);
            } else {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = x;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "0fbd5356fd7ac556614926f20e2117fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "0fbd5356fd7ac556614926f20e2117fe");
                } else {
                    this.z = b(R.id.animate_home_action_search_outer);
                    this.A = b(R.id.animte_home_action_search);
                    this.V = (TextView) b(R.id.tv_home_header_search_view);
                    this.W = (ViewFlipper) b(R.id.vf_home_search_carousel_text);
                    this.X = (TextView) b(R.id.tv_home_header_search_button);
                    this.Y = (ImageView) b(R.id.iv_home_header_search_icon_left);
                    this.ad = (LinearLayout) b(R.id.minutes_buy_layout);
                    this.aa = (LinearLayout) b(R.id.ll_search_divider);
                }
                b(R.id.animate_home_action_search_outer).setVisibility(0);
                b(R.id.minutes_animate_action_search_outer).setVisibility(8);
            }
            this.C = b(R.id.layout_search_main);
            this.Q = b(R.id.layout_title_container);
            this.A.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr7 = {view};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "33d4073404b68b98ac8f2e11481ff271", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "33d4073404b68b98ac8f2e11481ff271");
                        return;
                    }
                    SearchCarouselText searchCarouselText = null;
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) PoiChannelActionBar.this.ay) && PoiChannelActionBar.this.W != null) {
                        searchCarouselText = (SearchCarouselText) com.sankuai.shangou.stone.util.a.a((List<Object>) PoiChannelActionBar.this.ay, PoiChannelActionBar.this.W.getDisplayedChild());
                    }
                    if (PoiChannelActionBar.this.c != null) {
                        PoiChannelActionBar.this.c.a(searchCarouselText);
                    }
                }
            });
            if (this.r != null) {
                this.r.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr7 = {view};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "c18e4fa7e40247df8eaea130fb82c11b", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "c18e4fa7e40247df8eaea130fb82c11b");
                            return;
                        }
                        if (PoiChannelActionBar.this.aA != null) {
                            PoiChannelActionBar.this.m();
                            PoiChannelActionBar.this.aA.a(PoiChannelActionBar.c(PoiChannelActionBar.this));
                        }
                        PoiChannelActionBar.this.a(PoiChannelActionBar.this.az);
                    }
                });
            }
            if (this.s != null) {
                this.s.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr7 = {view};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "9021dd6d767efad23361dd85d5871b40", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "9021dd6d767efad23361dd85d5871b40");
                        } else if (PoiChannelActionBar.this.M == null || com.sankuai.shangou.stone.util.a.c(PoiChannelActionBar.this.N) <= 0) {
                        } else {
                            PoiChannelActionBar.this.M.a(PoiChannelActionBar.this.B);
                            PoiChannelActionBar.this.a(PoiChannelActionBar.this.mContext, PoiChannelActionBar.this.b, "b_PKwLc");
                        }
                    }
                });
            }
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = x;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b803aa6f7c1710e9db076f71d7c4a072", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b803aa6f7c1710e9db076f71d7c4a072");
        } else {
            this.t = (ImageView) this.y.findViewById(R.id.iv_back);
            c(-14539738);
            this.t.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr8 = {view};
                    ChangeQuickRedirect changeQuickRedirect8 = a;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "79b2cf9b21eed4effb2738651c098463", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "79b2cf9b21eed4effb2738651c098463");
                    } else if (PoiChannelActionBar.this.c != null) {
                        PoiChannelActionBar.this.c.bF_();
                    }
                }
            });
        }
        d(-14539738);
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9de26dfb5496189e7f5ef1138d072b5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9de26dfb5496189e7f5ef1138d072b5f");
            return;
        }
        this.S = u.a();
        this.ah = com.sankuai.shangou.stone.util.h.a((Context) a());
        this.ai = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12);
        this.aj = com.sankuai.shangou.stone.util.h.a(a(), 48.0f) + this.S + (this.b.bc ? this.o : 0);
        this.Z = this.ah - (this.ai * 2);
        this.ak = com.sankuai.shangou.stone.util.h.a(a(), 33.0f);
        this.al = com.sankuai.shangou.stone.util.h.a(a(), 32.0f);
        this.am = com.sankuai.shangou.stone.util.h.a(a(), 46.0f);
        this.an = com.sankuai.shangou.stone.util.h.a(a(), 46.0f);
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void a(int i, View view, View view2) {
        int i2;
        int i3;
        Object[] objArr = {Integer.valueOf(i), view, view2};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a3cc38bb9307f6b2df3a1618ca5dec8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a3cc38bb9307f6b2df3a1618ca5dec8");
            return;
        }
        int abs = Math.abs(i);
        int height = ((this.y.getHeight() - (this.b.y ? this.S : 0)) - com.sankuai.shangou.stone.util.h.a(getContext(), 9.0f)) + this.n;
        if (height <= 0) {
            return;
        }
        int i4 = this.ai;
        this.aq = ((Integer) view.getTag()).intValue();
        if (abs >= 0) {
            float f = height;
            float min = Math.min((abs * 1.0f) / f, 1.0f);
            int i5 = (int) (f * min);
            if (!this.b.Y) {
                d(min > 0.5f);
            }
            ViewGroup.LayoutParams layoutParams = this.R.getLayoutParams();
            layoutParams.height = this.aj - i5;
            a(view, min, this.Q, this.aq);
            a(min);
            b(1.0f - min);
            int f2 = this.Z - ((int) ((i2 - f(i4)) * min));
            int i6 = this.ak - ((int) ((i3 - this.al) * min));
            int s = (int) ((s() - i4) * min);
            this.X.getLayoutParams().width = this.am - ((int) ((this.am - this.an) * min));
            Object[] objArr2 = {Integer.valueOf(f2), Integer.valueOf(i6), Integer.valueOf(s)};
            ChangeQuickRedirect changeQuickRedirect2 = x;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3aa37f0ca2fec4624b4382973ca1dff8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3aa37f0ca2fec4624b4382973ca1dff8");
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.A.getLayoutParams();
                layoutParams2.width = f2;
                layoutParams2.height = i6;
                this.A.setTranslationX(s);
            }
            this.A.requestLayout();
            if (abs == 0) {
                layoutParams.height = this.aj;
                b(1.0f);
                a(0.0f);
                a(view, 0.0f, this.Q, this.aq);
            }
            if (com.sankuai.waimai.store.goods.list.utils.e.b() && this.b.ba) {
                return;
            }
            if (this.b.y) {
                a(abs, min);
            }
            e(abs);
        }
    }

    private void a(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef759b7f12228666a200fef6bac83d1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef759b7f12228666a200fef6bac83d1f");
        } else if (i == 0) {
            this.A.setBackground(this.ac);
            this.X.getBackground().setAlpha(0);
            this.aa.setVisibility(0);
        } else {
            this.A.setBackground(this.ab);
            this.X.getBackground().setAlpha((int) (f * 255.0f));
            this.aa.setVisibility(8);
        }
    }

    public void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcfe525f221db614abb85abd8ac5d443", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcfe525f221db614abb85abd8ac5d443");
        } else if (this.b.Z && !this.b.Y) {
            int a = com.sankuai.waimai.store.poi.list.util.d.a(f);
            if (this.G != null && this.as != null) {
                this.G.setCompoundDrawables(null, e.a(this.as, a), null, null);
            }
            if (this.H != null && this.ar != null) {
                this.H.setBackground(e.a(this.ar, a));
            }
            if (this.at == null || b() || this.b.aS) {
                return;
            }
            if (this.au == null) {
                this.au = e.a(this.at, a);
            } else {
                DrawableCompat.setTintList(this.au, ColorStateList.valueOf(a));
            }
            this.t.setBackground(this.au);
        }
    }

    private int s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03c358e3ce7c64493c68aeb09434a4e6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03c358e3ce7c64493c68aeb09434a4e6")).intValue() : (this.t.getWidth() - this.aw) + ((ViewGroup.MarginLayoutParams) this.t.getLayoutParams()).leftMargin + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_16);
    }

    public int f(int i) {
        int dimensionPixelOffset;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1917224e05affcf167872a760cc9f2a4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1917224e05affcf167872a760cc9f2a4")).intValue();
        }
        int s = this.ah - s();
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f86fe8467db63ae9bc242a1157d1bcb", RobustBitConfig.DEFAULT_VALUE)) {
            dimensionPixelOffset = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f86fe8467db63ae9bc242a1157d1bcb")).intValue();
        } else if ((this.D != null && this.D.getVisibility() == 0) || (this.G != null && this.G.getVisibility() == 0)) {
            dimensionPixelOffset = i + this.I.getWidth() + ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).rightMargin;
        } else {
            boolean z = this.b.y;
            dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12);
        }
        return s - dimensionPixelOffset;
    }

    public void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e933ffba46755031ebf17cc26908bc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e933ffba46755031ebf17cc26908bc3");
        } else if (this.O.getVisibility() == 0) {
            this.O.setAlpha(f);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void a(@Nullable MemberInfoEntity memberInfoEntity) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "769ba15c1df7cc1f64f3a7ee28a34801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "769ba15c1df7cc1f64f3a7ee28a34801");
        } else {
            u.c(this.G);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fad3cd672908d2c2c7e06592d7a6e2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fad3cd672908d2c2c7e06592d7a6e2d");
            return;
        }
        d(this.b.Y);
        this.ap = i;
        if (this.O != null) {
            this.O.setTextColor(i);
        }
        if (this.G != null) {
            if (this.as != null) {
                this.G.setCompoundDrawables(null, e.a(this.as, i), null, null);
            }
            this.G.setTextColor(i);
        }
        com.sankuai.waimai.store.param.a aVar = this.b;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51d6b841c6f0fc531a45cf5b8865cb6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51d6b841c6f0fc531a45cf5b8865cb6b");
        } else if (this.H != null && this.ar != null && aVar != null) {
            this.H.setBackground(e.a(this.ar, this.ap));
        }
        if (this.b.Z) {
            c(i);
        }
        g(i);
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99d071b9b03a73f24706fc0ffb3504e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99d071b9b03a73f24706fc0ffb3504e5");
        } else if (a() != null) {
            if (this.av < 0) {
                this.av = z ? 1 : 2;
                com.sankuai.waimai.platform.capacity.immersed.a.b(a(), z);
                return;
            }
            int i = z ? 1 : 2;
            if (i != this.av) {
                this.av = i;
                com.sankuai.waimai.platform.capacity.immersed.a.b(a(), z);
            }
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b1e780bef5b40ef14c1091e8bafdbae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b1e780bef5b40ef14c1091e8bafdbae");
        } else if (this.t == null || this.at == null) {
        } else {
            if (this.au == null) {
                this.au = e.a(this.at, i);
            } else {
                DrawableCompat.setTintList(this.au, ColorStateList.valueOf(i));
            }
            this.t.setBackground(this.au);
        }
    }

    public void g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b197e5af098fe6075d509fb62c8c7d00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b197e5af098fe6075d509fb62c8c7d00");
            return;
        }
        if (this.ag != null) {
            this.ag.setTextColor(i);
        }
        if (this.L != null) {
            this.L.setBackgroundColor(this.b.Y ? 855638016 : 1728053247);
        }
        if (this.T != null) {
            this.T.setTextColor(i);
        }
        p();
    }

    public void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfcffd833e67471dc68080d7ae911a6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfcffd833e67471dc68080d7ae911a6f");
            return;
        }
        Drawable drawable = ContextCompat.getDrawable(a(), R.drawable.wm_sc_poi_channel_arrow_right);
        if (this.U == null || drawable == null) {
            return;
        }
        this.U.setImageDrawable(e.a(drawable, this.b.Y ? 1713513510 : -1711276033));
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "729f1150a72af7bcb03cb5e930c2b30f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "729f1150a72af7bcb03cb5e930c2b30f");
            return;
        }
        super.a(poiVerticalityDataResponse);
        if (poiVerticalityDataResponse == null) {
            return;
        }
        e(poiVerticalityDataResponse);
        if ("1".equals(this.b.ah)) {
            this.ae.setVisibility(0);
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sg_rj3ioc4p_mv", this.ae);
            bVar.a("cat_id", t.a(String.valueOf(this.b.c)) ? "-999" : String.valueOf(this.b.c));
            bVar.a("stid", "-999");
            bVar.a("page_type", 0);
            com.sankuai.waimai.store.expose.v2.b.a().a(a(), bVar);
        } else {
            this.ae.setVisibility(8);
        }
        if (!this.b.bb) {
            u.c(this.s);
            return;
        }
        Object[] objArr2 = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e79ab50878652d2c6918696302b932c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e79ab50878652d2c6918696302b932c0");
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
        if (this.M == null) {
            this.M = new h(a(), 3, this.b);
            this.M.a(new PopupWindow.OnDismissListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar.4
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                }
            });
            this.M.i = new h.a() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.viewblocks.h.a
                public final void a(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "200622caaa948d10fd20fe0c8f30b5c3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "200622caaa948d10fd20fe0c8f30b5c3");
                    } else {
                        PoiChannelActionBar.this.a(PoiChannelActionBar.this.getContext(), PoiChannelActionBar.this.b, i);
                    }
                }

                @Override // com.sankuai.waimai.store.viewblocks.h.a
                public final void a(int i, List<Integer> list, SparseArray<MenuItemView> sparseArray) {
                    Object[] objArr3 = {Integer.valueOf(i), list, sparseArray};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6f5fe37d504ca641c8c48b46a67bbe14", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6f5fe37d504ca641c8c48b46a67bbe14");
                    } else {
                        PoiChannelActionBar.this.b(PoiChannelActionBar.this.mContext, PoiChannelActionBar.this.b, "b_waimai_8797a5cl_mv");
                    }
                }

                @Override // com.sankuai.waimai.store.viewblocks.h.a
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a8b9dacff517d74720e4744d76ad827f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a8b9dacff517d74720e4744d76ad827f");
                    } else {
                        PoiChannelActionBar.this.a(com.sankuai.waimai.store.config.k.d() ? PoiChannelActionBar.this.c(PoiChannelActionBar.this.e) : PoiChannelActionBar.this.b(PoiChannelActionBar.this.e));
                    }
                }
            };
        }
        if (poiVerticalityDataResponse.getNavigationBlock() != null && poiVerticalityDataResponse.getNavigationBlock().data != null) {
            this.N = poiVerticalityDataResponse.getNavigationBlock().data.functionEntranceList;
            if (this.M != null && com.sankuai.shangou.stone.util.a.c(this.N) > 0) {
                this.M.a(this.N);
                this.M.a(this.p);
            }
        }
        if (this.b.bc && this.R != null) {
            this.R.getLayoutParams().height = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_48) + this.S + this.o;
        }
        r();
    }

    public void e(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f58b803214461a5ae0182a0deb98a34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f58b803214461a5ae0182a0deb98a34");
        } else {
            q();
        }
    }

    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "497b06620100e77e5f2c3fdc7579e7cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "497b06620100e77e5f2c3fdc7579e7cd");
            return;
        }
        this.ay.clear();
        if (this.W != null) {
            this.W.stopFlipping();
            this.W.removeAllViews();
        }
    }

    public final void a(@NonNull List<SearchCarouselText> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "352a812164f918e453c230e5d7f474ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "352a812164f918e453c230e5d7f474ca");
            return;
        }
        this.ay.addAll(list);
        if (this.W == null || com.sankuai.shangou.stone.util.a.b(this.ay)) {
            return;
        }
        for (int i2 = 0; i2 < this.ay.size(); i2++) {
            SearchCarouselText searchCarouselText = (SearchCarouselText) com.sankuai.shangou.stone.util.a.a((List<Object>) this.ay, i2);
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
                    this.W.addView(inflate);
                }
            }
        }
        this.W.setInAnimation(this.mContext, R.anim.search_carousel_text_in);
        this.W.setOutAnimation(this.mContext, R.anim.search_carousel_text_out);
        if (this.ay.size() == 1) {
            h(0);
        } else if (this.ay.size() > 1) {
            this.W.setFlipInterval(i);
            this.W.startFlipping();
            this.W.getInAnimation().setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar.8
                public static ChangeQuickRedirect a;

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    Object[] objArr2 = {animation};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca3528ec664e6f946407abc2a3de298f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca3528ec664e6f946407abc2a3de298f");
                    } else {
                        PoiChannelActionBar.this.h(PoiChannelActionBar.this.W.getDisplayedChild());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e4e357439d02b503851cb1213749054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e4e357439d02b503851cb1213749054");
            return;
        }
        SearchCarouselText searchCarouselText = (SearchCarouselText) com.sankuai.shangou.stone.util.a.a((List<Object>) this.ay, i);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37d5d8c9ad428eef9e6fd26a687a3ab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37d5d8c9ad428eef9e6fd26a687a3ab1");
        } else if (this.D == null || !com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
        } else {
            this.D.post(new Runnable() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiChannelActionBar.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8339699f2ffaeb046b06b0142a94e9fc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8339699f2ffaeb046b06b0142a94e9fc");
                    } else {
                        com.sankuai.waimai.imbase.manager.b.a().a(PoiChannelActionBar.this);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.imbase.manager.d.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b165540e1f4b624614a485d2f332522", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b165540e1f4b624614a485d2f332522");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb58aa5c8ace0ee257bf2271ee44c730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb58aa5c8ace0ee257bf2271ee44c730");
        } else if (this.ax && this.D != null && this.ao) {
            if (i > 0) {
                u.a(this.F);
                this.F.setTag(1);
                u.c(this.E);
                this.E.setTag(-1);
                this.F.setText(i <= 99 ? String.valueOf(i) : "99+");
                return;
            }
            u.c(this.F);
            this.F.setTag(-1);
            if (com.sankuai.waimai.business.im.api.msgcenter.a.a().showMsgCenterDot()) {
                u.a(this.E);
            } else {
                u.c(this.E);
            }
            this.E.setTag(1);
        }
    }

    @Override // com.sankuai.waimai.store.ocr.b
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52af38bdcda7b827aa889c090415fd4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52af38bdcda7b827aa889c090415fd4d");
            return;
        }
        SearchCarouselText searchCarouselText = null;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.ay) && this.W != null) {
            searchCarouselText = (SearchCarouselText) com.sankuai.shangou.stone.util.a.a((List<Object>) this.ay, this.W.getDisplayedChild());
        }
        g.a(this.mContext, this.b, str, searchCarouselText, true, "");
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public HashMap<String, Object> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9624c64d1c824a97fd403343285ba78e", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9624c64d1c824a97fd403343285ba78e") : super.k();
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void b(int i, View view, @Nullable @org.jetbrains.annotations.Nullable View view2) {
        int dimensionPixelOffset;
        int i2;
        int i3;
        Object[] objArr = {Integer.valueOf(i), view, view2};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32bc564451a293cc2fa7ea8fb0a10ffc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32bc564451a293cc2fa7ea8fb0a10ffc");
            return;
        }
        int abs = Math.abs(i);
        int height = ((this.y.getHeight() - (this.b.y ? this.S : 0)) - com.sankuai.shangou.stone.util.h.a(getContext(), 9.0f)) + this.n + (this.b.bc ? this.o : 0);
        if (height <= 0) {
            return;
        }
        int i4 = this.ai;
        this.aq = ((Integer) view.getTag()).intValue();
        if (abs >= 0) {
            float f = height;
            float min = Math.min((abs * 1.0f) / f, 1.0f);
            int i5 = (int) (f * min);
            if (!this.b.Y) {
                d(min > 0.5f);
            }
            ViewGroup.LayoutParams layoutParams = this.R.getLayoutParams();
            layoutParams.height = this.aj - i5;
            a(view, min, this.Q, this.aq);
            a(min);
            b(1.0f - min);
            int width = (this.Z - ((this.r == null || this.r.getVisibility() != 0) ? 0 : this.r.getWidth() + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_13))) - ((this.b.bb && this.s != null && this.s.getVisibility() == 0) ? this.s.getWidth() + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_10) : 0);
            Object[] objArr2 = {Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = x;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bcfcc2bea1eda78d5766689870cf7e2d", RobustBitConfig.DEFAULT_VALUE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bcfcc2bea1eda78d5766689870cf7e2d")).intValue();
            } else {
                int s = this.ah - s();
                Object[] objArr3 = {Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = x;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0a2e0586fb537ae206bfa42817b0c5ba", RobustBitConfig.DEFAULT_VALUE)) {
                    dimensionPixelOffset = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0a2e0586fb537ae206bfa42817b0c5ba")).intValue();
                } else {
                    dimensionPixelOffset = this.b.aS ? getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12) : i4;
                    if (this.r != null && this.r.getVisibility() == 0) {
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
                i2 = s - dimensionPixelOffset;
            }
            int i6 = width - ((int) ((width - i2) * min));
            int i7 = this.ak - ((int) ((i3 - this.al) * min));
            int s2 = (int) ((s() - i4) * min);
            this.X.getLayoutParams().width = this.am - ((int) ((this.am - this.an) * min));
            Object[] objArr4 = {Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(s2)};
            ChangeQuickRedirect changeQuickRedirect4 = x;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ae58ffe9947fe354bd70431e11da0362", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ae58ffe9947fe354bd70431e11da0362");
            } else {
                ViewGroup.LayoutParams layoutParams2 = this.A.getLayoutParams();
                layoutParams2.width = i6;
                layoutParams2.height = i7;
                this.B.setTranslationX(s2);
            }
            if (abs == 0) {
                layoutParams.height = this.aj;
                b(1.0f);
                a(0.0f);
                a(view, 0.0f, this.Q, this.aq);
            }
            this.A.requestLayout();
            if (this.b.y) {
                a(abs, min);
            }
            e(abs);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8da8640947909bc1482776a0f2325a04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8da8640947909bc1482776a0f2325a04");
        } else {
            b(str);
        }
    }
}
