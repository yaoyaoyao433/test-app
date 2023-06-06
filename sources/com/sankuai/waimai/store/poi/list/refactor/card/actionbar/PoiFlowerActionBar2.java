package com.sankuai.waimai.store.poi.list.refactor.card.actionbar;

import android.arch.lifecycle.q;
import android.content.Context;
import android.content.res.ColorStateList;
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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.MemberInfoEntity;
import com.sankuai.waimai.store.repository.model.NavigationTileConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.TitleMenuItemEntity;
import com.sankuai.waimai.store.search.model.SearchCarouselText;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.viewblocks.MenuItemView;
import com.sankuai.waimai.store.viewblocks.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiFlowerActionBar2 extends a implements View.OnClickListener, com.sankuai.waimai.store.i.locate.b {
    public static ChangeQuickRedirect x;
    protected View A;
    private View B;
    private View C;
    private TextView D;
    private TextView E;
    private TextView F;
    private ImageView G;
    private View H;
    private LinearLayout I;
    private ImageView J;
    private TextView K;
    private View L;
    private View M;
    private View N;
    private View O;
    private View P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private int X;
    private int Y;
    private Drawable Z;
    private Drawable aa;
    private Drawable ab;
    private Drawable ac;
    private Drawable ad;
    private Drawable ae;
    private int af;
    private int ag;
    private int ah;
    private PageEventHandler ai;
    private com.sankuai.waimai.store.base.statistic.a aj;
    private LinearLayout ak;
    protected h y;
    protected List<TitleMenuItemEntity> z;

    private int a(int i, int i2, float f) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "413504b91ba62398a4199dd495d2bcc4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "413504b91ba62398a4199dd495d2bcc4")).intValue() : i - ((int) ((i - i2) * f));
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void a(@Nullable MemberInfoEntity memberInfoEntity) {
    }

    public static /* synthetic */ Map b(PoiFlowerActionBar2 poiFlowerActionBar2) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, poiFlowerActionBar2, changeQuickRedirect, false, "c8828602b4b334fc19e20ec7d8071bf7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, poiFlowerActionBar2, changeQuickRedirect, false, "c8828602b4b334fc19e20ec7d8071bf7");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tip_icon", 0);
        hashMap.put("category_code", Long.valueOf(poiFlowerActionBar2.b.c));
        hashMap.put("sub_category_code", poiFlowerActionBar2.b.f);
        hashMap.put("stid", poiFlowerActionBar2.b.T);
        hashMap.put("entry_type", Integer.valueOf(poiFlowerActionBar2.b.aS ? 1 : 0));
        return hashMap;
    }

    public PoiFlowerActionBar2(@NonNull FragmentActivity fragmentActivity, @NonNull com.sankuai.waimai.store.param.a aVar, com.sankuai.waimai.store.poi.list.callback.a aVar2) {
        super(fragmentActivity, aVar, aVar2);
        Object[] objArr = {fragmentActivity, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c1dca04c32c0f386e98b390c3f080fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c1dca04c32c0f386e98b390c3f080fc");
            return;
        }
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.X = 0;
        this.Y = -1;
        this.af = -1;
        com.sankuai.waimai.store.locate.a.a(this);
        this.ai = (PageEventHandler) q.a((FragmentActivity) a()).a(PageEventHandler.class);
        this.aj = new com.sankuai.waimai.store.poi.list.logreport.a(a(), aVar);
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a, com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1b9816ad08722ea5bf56516145facb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1b9816ad08722ea5bf56516145facb9");
            return;
        }
        super.onViewCreated();
        this.ag = com.sankuai.shangou.stone.util.h.a(getContext(), 14.0f);
        this.Z = ContextCompat.getDrawable(this.mContext, R.drawable.wm_sc_common_left_back_arrow);
        this.ab = ContextCompat.getDrawable(this.mView.getContext(), R.drawable.wm_sc_search_shopcart_light);
        this.ad = ContextCompat.getDrawable(this.mView.getContext(), R.drawable.wm_sc_search_more_information_light);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27b9ae0426025299a3233f49366343bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27b9ae0426025299a3233f49366343bb");
        } else {
            this.Q = getContext().getResources().getDimensionPixelOffset(this.b.aS ? R.dimen.wm_sc_common_dimen_32 : R.dimen.wm_sc_common_dimen_34);
            this.S = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_46);
            this.R = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_6);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = x;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "57e6b79e456328e34c7c5b3b60600d65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "57e6b79e456328e34c7c5b3b60600d65");
            return;
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = x;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b87e3f0a70869147005e63c814997cb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b87e3f0a70869147005e63c814997cb4");
        } else {
            this.C = ((ViewStub) b(R.id.vs_flower_channel_location)).inflate();
            ViewGroup.LayoutParams layoutParams = this.C.getLayoutParams();
            layoutParams.height = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_48);
            this.C.setLayoutParams(layoutParams);
            this.t = (ImageView) this.C.findViewById(R.id.iv_back);
            c(-14539738);
            this.t.setOnClickListener(this);
            this.D = (TextView) this.C.findViewById(R.id.tv_title);
            if (!TextUtils.isEmpty(this.b.d())) {
                this.D.setText(this.b.d());
            }
            this.I = (LinearLayout) this.C.findViewById(R.id.ll_address_container);
            this.H = this.C.findViewById(R.id.mach_over_view);
            this.H.setClickable(false);
            this.H.setVisibility(8);
            this.I.setBackground(new e.a().a(com.sankuai.shangou.stone.util.h.a(getContext(), 36.0f)).c(-657930).a());
            if (this.b.aS) {
                this.I.setVisibility(8);
            }
            this.J = (ImageView) this.C.findViewById(R.id.iv_location);
            this.O = this.C.findViewById(R.id.fl_location_arrow_bg);
            this.O.setBackground(new e.a().a(36.0f).a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, -657930}).a());
            this.K = (TextView) this.C.findViewById(R.id.tv_delivery_address);
            this.I.setAlpha(0.0f);
            this.I.setVisibility(4);
            c(com.sankuai.waimai.store.locate.a.d());
            f();
        }
        this.B = b(R.id.search_empty_view);
        this.ah = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_48) + u.a();
        this.B.getLayoutParams().height = this.ah;
        this.N = b(R.id.layout_title_container);
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = x;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "165449ded0770dbf776a396243d9061f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "165449ded0770dbf776a396243d9061f");
        } else {
            View findViewById = this.C.findViewById(R.id.layout_actionbar_content);
            if (findViewById != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
                marginLayoutParams.topMargin = u.a();
                findViewById.setLayoutParams(marginLayoutParams);
            }
        }
        b(R.id.animate_home_action_search_outer).setVisibility(8);
        if (this.b.aS) {
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = x;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5c46888a259fc1caf692e24cabe91fb9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5c46888a259fc1caf692e24cabe91fb9");
            } else {
                this.L = b(R.id.minutes_animate_action_search_outer);
                this.M = b(R.id.minutes_animte_action_search);
                this.A = b(R.id.minutes_search_layout);
                this.F = (TextView) b(R.id.minutes_tv_header_search_view);
                this.E = (TextView) b(R.id.minutes_tv_header_search_button);
                this.G = (ImageView) b(R.id.minutes_iv_header_search_icon_left);
                this.r = (ImageView) b(R.id.minutes_search_shop_cart_img);
                this.ak = (LinearLayout) b(R.id.minutes_buy_layout);
                this.s = (ImageView) b(R.id.minutes_search_more_information_img);
                this.P = b(R.id.new_with_flowers_empty_layout);
                u.a(this.s);
            }
            b(R.id.animate_channel_action_search_outer).setVisibility(8);
            b(R.id.minutes_animate_action_search_outer).setVisibility(0);
        } else {
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = x;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "113103d7fd8d2bd60d6379dc3c6ac2f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "113103d7fd8d2bd60d6379dc3c6ac2f9");
            } else {
                this.L = b(R.id.animate_channel_action_search_outer);
                this.M = b(R.id.animte_action_search);
                this.F = (TextView) b(R.id.tv_header_search_view);
                this.E = (TextView) b(R.id.tv_header_search_button);
                this.G = (ImageView) b(R.id.iv_header_search_icon_left);
                this.ak = (LinearLayout) b(R.id.minutes_buy_layout);
            }
            b(R.id.animate_channel_action_search_outer).setVisibility(0);
            b(R.id.minutes_animate_action_search_outer).setVisibility(8);
        }
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = x;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "0723746eb5a35a3c0b6ed582322c61e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "0723746eb5a35a3c0b6ed582322c61e1");
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.E.getLayoutParams();
            marginLayoutParams2.width = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_46);
            marginLayoutParams2.topMargin = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_2);
            marginLayoutParams2.bottomMargin = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_2);
            this.E.setLayoutParams(marginLayoutParams2);
        }
        this.M.setOnClickListener(this);
        this.I.setOnClickListener(this);
        if (this.r != null) {
            this.r.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiFlowerActionBar2.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr9 = {view};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "80acc656464db5f863d1719c6f56b5c4", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "80acc656464db5f863d1719c6f56b5c4");
                        return;
                    }
                    if (PoiFlowerActionBar2.this.aj != null) {
                        PoiFlowerActionBar2.this.m();
                        PoiFlowerActionBar2.this.aj.a(PoiFlowerActionBar2.b(PoiFlowerActionBar2.this));
                    }
                    PoiFlowerActionBar2.this.a(PoiFlowerActionBar2.this.ai);
                }
            });
        }
        if (this.s != null) {
            this.s.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiFlowerActionBar2.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr9 = {view};
                    ChangeQuickRedirect changeQuickRedirect9 = a;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "1dac28155ee8db70e25ccb5e0bdb9d62", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "1dac28155ee8db70e25ccb5e0bdb9d62");
                    } else if (PoiFlowerActionBar2.this.y == null || com.sankuai.shangou.stone.util.a.c(PoiFlowerActionBar2.this.z) <= 0) {
                    } else {
                        PoiFlowerActionBar2.this.y.a(PoiFlowerActionBar2.this.A);
                        PoiFlowerActionBar2.this.a(PoiFlowerActionBar2.this.mContext, PoiFlowerActionBar2.this.b, "b_PKwLc");
                    }
                }
            });
        }
    }

    private void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faf69291dbec3a527a1d1d17573cf05a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faf69291dbec3a527a1d1d17573cf05a");
        } else if (this.b.be) {
            if (this.i != null) {
                this.i.setAlpha(f);
            }
            if (f > 0.0f) {
                u.c(this.h);
            } else {
                u.a(this.h);
            }
            if (f == 1.0f) {
                u.a(this.P);
            } else {
                u.c(this.P);
            }
        }
    }

    private void e(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a85581d8463a91d1da04a5debc5fb9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a85581d8463a91d1da04a5debc5fb9c");
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
        if (this.y == null) {
            this.y = new h(a(), 3, this.b);
            this.y.a(new PopupWindow.OnDismissListener() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiFlowerActionBar2.3
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                }
            });
            this.y.i = new h.a() { // from class: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiFlowerActionBar2.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.viewblocks.h.a
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87b789d364eec5ea3d3544657e3bc90e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87b789d364eec5ea3d3544657e3bc90e");
                    } else {
                        PoiFlowerActionBar2.this.a(PoiFlowerActionBar2.this.getContext(), PoiFlowerActionBar2.this.b, i);
                    }
                }

                @Override // com.sankuai.waimai.store.viewblocks.h.a
                public final void a(int i, List<Integer> list, SparseArray<MenuItemView> sparseArray) {
                    Object[] objArr2 = {Integer.valueOf(i), list, sparseArray};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57b8b4588320c47794f92a558cea99cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57b8b4588320c47794f92a558cea99cc");
                    } else {
                        PoiFlowerActionBar2.this.b(PoiFlowerActionBar2.this.mContext, PoiFlowerActionBar2.this.b, "b_waimai_8797a5cl_mv");
                    }
                }

                @Override // com.sankuai.waimai.store.viewblocks.h.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f3307ec5fb098f9b171242d35c2d7ddb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f3307ec5fb098f9b171242d35c2d7ddb");
                    } else {
                        PoiFlowerActionBar2.this.a(k.d() ? PoiFlowerActionBar2.this.c(PoiFlowerActionBar2.this.e) : PoiFlowerActionBar2.this.b(PoiFlowerActionBar2.this.e));
                    }
                }
            };
        }
        if (poiVerticalityDataResponse.getNavigationBlock() != null && poiVerticalityDataResponse.getNavigationBlock().data != null) {
            this.z = poiVerticalityDataResponse.getNavigationBlock().data.functionEntranceList;
            if (this.y != null && com.sankuai.shangou.stone.util.a.c(this.z) > 0) {
                this.y.a(this.z);
                this.y.a(this.p);
            }
        }
        if (!this.b.bc || this.C == null) {
            return;
        }
        this.C.getLayoutParams().height = getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_48) + this.o;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nonnull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a2ce59e69e779e7a22734c545dbf408", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a2ce59e69e779e7a22734c545dbf408");
        } else if (this.c != null) {
            if (view.getId() == R.id.ll_address_container) {
                this.c.bG_();
            } else if (view.getId() == R.id.iv_back) {
                this.c.bF_();
            } else if (view.getId() == R.id.animte_action_search || view.getId() == R.id.minutes_animte_action_search) {
                this.c.a((SearchCarouselText) null);
            }
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6eb331e5e5e604ae03dffa723f2a221", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6eb331e5e5e604ae03dffa723f2a221");
        } else if (this.D != null) {
            this.D.setVisibility(4);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86c3ca3866f901a581ddf1fce132cfac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86c3ca3866f901a581ddf1fce132cfac");
        } else if (this.D != null) {
            this.D.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.store.i.locate.b
    public final void a(WMLocation wMLocation, String str, boolean z) {
        Object[] objArr = {wMLocation, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f60da48a3c92a2522f366cd00ff8afe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f60da48a3c92a2522f366cd00ff8afe1");
        } else {
            c(str);
        }
    }

    private void c(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fcaaa6c1c77d128642ed2fdd3875aae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fcaaa6c1c77d128642ed2fdd3875aae");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_address_default);
        }
        this.K.setText(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0276  */
    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r21, android.view.View r22, @android.support.annotation.Nullable android.view.View r23) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poi.list.refactor.card.actionbar.PoiFlowerActionBar2.a(int, android.view.View, android.view.View):void");
    }

    private boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c072410e1a03f0815d9f4738a7562c5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c072410e1a03f0815d9f4738a7562c5")).booleanValue() : this.C.getHeight() > 0;
    }

    private int o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9316ab75bbe72e7db064dee4c03892da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9316ab75bbe72e7db064dee4c03892da")).intValue();
        }
        if (this.U > 0) {
            return this.U;
        }
        this.U = this.M.getHeight();
        return this.U;
    }

    private int p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d68ab095ed66952bbcd1b6153129aec6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d68ab095ed66952bbcd1b6153129aec6")).intValue();
        }
        if (this.V > 0) {
            return this.V;
        }
        this.V = this.E.getWidth();
        return this.V;
    }

    private int q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bb1d171f2eed3298dd69530b51cb0e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bb1d171f2eed3298dd69530b51cb0e2")).intValue();
        }
        if (this.X <= 0) {
            this.X = this.C.getHeight() + u.a();
        }
        return this.X;
    }

    private void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25725c9d35bf0952aa98ec1c621691b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25725c9d35bf0952aa98ec1c621691b7");
        } else {
            this.E.getLayoutParams().width = a(p(), this.S, f);
        }
    }

    private void c(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f82252bbf09cd6a8ade5851d42a43f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f82252bbf09cd6a8ade5851d42a43f1");
            return;
        }
        float f2 = 1.0f - f;
        this.D.setAlpha(f2);
        if (this.g != null) {
            this.g.setAlpha(f2);
        }
        a(f2);
    }

    private int r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3f7b77c62fd9273b511792bfbc9c686", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3f7b77c62fd9273b511792bfbc9c686")).intValue() : (this.t.getWidth() - this.ag) + ((ViewGroup.MarginLayoutParams) this.t.getLayoutParams()).leftMargin + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_16);
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Drawable drawable;
        int a;
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75b835cab38596f43256c267194a1b77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75b835cab38596f43256c267194a1b77");
            return;
        }
        super.a(poiVerticalityDataResponse);
        Object[] objArr2 = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4b51747750e3f5fc1be2ec5a4637865", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4b51747750e3f5fc1be2ec5a4637865");
        } else {
            BaseTile<BaseModuleDesc, NavigationTileConfig> navigationBlock = poiVerticalityDataResponse.getNavigationBlock();
            if (navigationBlock != null && navigationBlock.propsData != null && navigationBlock.data != null) {
                NavigationTileConfig navigationTileConfig = navigationBlock.propsData;
                BaseModuleDesc baseModuleDesc = navigationBlock.data;
                if (!TextUtils.isEmpty(baseModuleDesc.searchText)) {
                    u.a(this.F, baseModuleDesc.searchText);
                }
                if (this.b.aS) {
                    u.a(this.ak);
                } else {
                    u.c(this.ak);
                }
                PoiVerticalityDataResponse.ButtonArea c = c();
                Integer a2 = com.sankuai.shangou.stone.util.d.a((c == null || t.a(c.endColor)) ? navigationTileConfig.searchIconColor : c.endColor);
                if (a2 != null) {
                    if (this.b.aX) {
                        this.G.setBackground(e.a(getContext().getResources().getDrawable(R.drawable.wm_st_actionbar_search_white), com.sankuai.shangou.stone.util.d.a("#858687").intValue()));
                    } else {
                        this.G.setBackground(e.a(getContext().getResources().getDrawable(R.drawable.wm_st_actionbar_search_white), a2.intValue()));
                    }
                }
                e.a c2 = new e.a().a(getContext().getResources().getDimension(this.b.aS ? R.dimen.wm_sc_common_dimen_16 : R.dimen.wm_sc_common_dimen_17)).c(com.sankuai.shangou.stone.util.d.a(navigationTileConfig.searchBarBgColor, -1));
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
                    this.M.setBackground(c2.a());
                }
                if (!TextUtils.isEmpty(navigationTileConfig.searchButtonBgFromColor)) {
                    u.a(this.E);
                    int a3 = com.sankuai.shangou.stone.util.d.a((c == null || t.a(c.startColor)) ? navigationTileConfig.searchButtonBgFromColor : c.startColor, -7859);
                    int a4 = com.sankuai.shangou.stone.util.d.a((c == null || t.a(c.endColor)) ? navigationTileConfig.searchButtonBgToColor : c.endColor, -15539);
                    if (!b()) {
                        com.sankuai.shangou.stone.util.d.a(navigationTileConfig.searchButtonTextColor, -1);
                    }
                    int a5 = com.sankuai.shangou.stone.util.d.a((c == null || t.a(c.endColor)) ? navigationTileConfig.searchButtonBgToColor : c.endColor, -4978626);
                    Object[] objArr3 = {Integer.valueOf(a5)};
                    ChangeQuickRedirect changeQuickRedirect3 = x;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6cad5532250842d9184900778bb3d621", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6cad5532250842d9184900778bb3d621");
                    } else if (this.J != null && (drawable = ContextCompat.getDrawable(a(), R.drawable.wm_sc_poi_channel_flower_location_icon_new)) != null) {
                        this.J.setImageDrawable(e.a(drawable, a5));
                    }
                    if (this.b.aX) {
                        e.a(getContext(), new int[]{com.sankuai.shangou.stone.util.d.a("#FAFAFA").intValue(), com.sankuai.shangou.stone.util.d.a("#FAFAFA").intValue()}, R.dimen.wm_sc_common_dimen_16, GradientDrawable.Orientation.TL_BR);
                    } else {
                        e.a(getContext(), new int[]{a3, a4}, R.dimen.wm_sc_common_dimen_16, GradientDrawable.Orientation.TL_BR);
                    }
                    if (!this.b.aS) {
                        this.E.setTextColor(com.sankuai.shangou.stone.util.d.a(DiagnoseLog.COLOR_ERROR).intValue());
                    }
                } else {
                    this.E.setTextColor(com.sankuai.shangou.stone.util.d.a(DiagnoseLog.COLOR_ERROR).intValue());
                }
                this.F.setTextColor(com.sankuai.shangou.stone.util.d.a(navigationTileConfig.searchBarPlaceholderFontColor, -6711404));
                if (this.b.aS) {
                    this.r.setVisibility(d(poiVerticalityDataResponse) ? 0 : 8);
                    this.M.getLayoutParams().width = ((com.sankuai.shangou.stone.util.h.a((Context) a()) - ((this.r == null || this.r.getVisibility() != 0) ? 0 : getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_37))) - (getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12) * 2)) - ((this.b.bb && this.s != null && this.s.getVisibility() == 0) ? this.s.getWidth() + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_10) : 0);
                    a(this.b.Y);
                    b(this.b.Y);
                }
            }
        }
        if (this.b.bb) {
            e(poiVerticalityDataResponse);
        } else {
            u.c(this.s);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = x;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7249b2ee0cb6ac8f32a5dd36b672797d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7249b2ee0cb6ac8f32a5dd36b672797d");
        } else if (this.b.be) {
            u.c(this.A);
            u.a(this.P);
            u.c(this.h);
            if (this.b.Y) {
                a(-16777216, this.h);
                a(-16777216, this.j);
                a(-16777216, this.k);
            }
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d6c90103e6a0a1be49c7b0a8c6daf81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d6c90103e6a0a1be49c7b0a8c6daf81");
            return;
        }
        d(this.b.Y);
        if (this.b.Z) {
            c(i);
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91960542acb7e8ba1a2c6d23e6bdef64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91960542acb7e8ba1a2c6d23e6bdef64");
        } else if (this.D != null) {
            this.D.setTextColor(i);
        }
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dad4148c5e4356a366b7c5d6e2205576", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dad4148c5e4356a366b7c5d6e2205576");
        } else if (a() != null) {
            if (this.af < 0) {
                this.af = z ? 1 : 2;
                com.sankuai.waimai.platform.capacity.immersed.a.b(a(), z);
                return;
            }
            int i = z ? 1 : 2;
            if (i != this.af) {
                this.af = i;
                com.sankuai.waimai.platform.capacity.immersed.a.b(a(), z);
            }
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378c4934a21d6a6599eeb4926978eb9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378c4934a21d6a6599eeb4926978eb9c");
        } else if (this.t == null || this.Z == null) {
        } else {
            if (this.aa == null) {
                this.aa = e.a(this.Z, i);
            } else {
                DrawableCompat.setTintList(this.aa, ColorStateList.valueOf(i));
            }
            this.t.setBackground(this.aa);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a, com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bbe6dbefe5a9301cc3177b15ca867ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bbe6dbefe5a9301cc3177b15ca867ce");
            return;
        }
        com.sankuai.waimai.store.locate.a.b(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = x;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a7d956666f9a21c79655a3935c87ed3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a7d956666f9a21c79655a3935c87ed3");
        } else if (this.y != null && this.y.b()) {
            this.y.a();
        }
        super.onDestroy();
    }

    @Subscribe
    public void onUnreadNumChange(com.sankuai.waimai.store.poi.list.refactor.event.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa5c27f55ea9805c529a031bbf3dc264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa5c27f55ea9805c529a031bbf3dc264");
        } else if (kVar == null || this.y == null) {
        } else {
            this.y.a(kVar.a);
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void b(int i, View view, @Nullable @org.jetbrains.annotations.Nullable View view2) {
        int i2;
        int i3;
        int i4;
        Object[] objArr = {Integer.valueOf(i), view, view2};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abb277f58789722a8aeca22e08021110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abb277f58789722a8aeca22e08021110");
            return;
        }
        int abs = Math.abs(i);
        if (n()) {
            this.Y = ((Integer) view.getTag()).intValue();
            if (abs >= 0) {
                Object[] objArr2 = {Integer.valueOf(i), view};
                ChangeQuickRedirect changeQuickRedirect2 = x;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "80014be2e7e5bce2a181fa54d9e1e5ec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "80014be2e7e5bce2a181fa54d9e1e5ec");
                } else {
                    float min = Math.min((Math.abs(i) * 1.0f) / (this.C.getHeight() - (this.b.be ? com.sankuai.shangou.stone.util.h.a(this.mContext, 25.0f) : 0)), 1.0f);
                    if (!this.b.Y && !this.b.be) {
                        d(min > 0.5f);
                        if (!b() && !this.b.aS) {
                            c(com.sankuai.waimai.store.poi.list.util.d.a(min));
                        }
                    }
                    a(view, min, this.N, this.Y);
                    b(min);
                    c(min);
                    Object[] objArr3 = {Float.valueOf(min)};
                    ChangeQuickRedirect changeQuickRedirect3 = x;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9647879b54ca2b0533fa4286f6e7f83e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9647879b54ca2b0533fa4286f6e7f83e");
                    } else {
                        this.B.getLayoutParams().height = q() - ((int) ((this.C.getHeight() - com.sankuai.shangou.stone.util.h.a(getContext(), 9.0f)) * min));
                        this.A.setTranslationX((int) ((r() - (this.R * 2)) * min));
                        int a = a(o(), this.Q, min);
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = x;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c4d1596dd21a31de4d6ace582cd940ba", RobustBitConfig.DEFAULT_VALUE)) {
                            i2 = ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c4d1596dd21a31de4d6ace582cd940ba")).intValue();
                        } else {
                            this.T = ((com.sankuai.shangou.stone.util.h.a((Context) a()) - ((this.r == null || this.r.getVisibility() != 0) ? 0 : this.r.getWidth() + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_13))) - (getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12) * 2)) - ((this.b.bb && this.s != null && this.s.getVisibility() == 0) ? this.s.getWidth() + getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_10) : 0);
                            i2 = this.T;
                        }
                        int i5 = i2;
                        int i6 = this.R * 2;
                        Object[] objArr5 = {Integer.valueOf(i6)};
                        ChangeQuickRedirect changeQuickRedirect5 = x;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "de1b2877e4c415a45fabde57fc9ba929", RobustBitConfig.DEFAULT_VALUE)) {
                            i4 = ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "de1b2877e4c415a45fabde57fc9ba929")).intValue();
                        } else {
                            int a2 = com.sankuai.shangou.stone.util.h.a((Context) a()) - r();
                            Object[] objArr6 = {Integer.valueOf(i6)};
                            ChangeQuickRedirect changeQuickRedirect6 = x;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "64b98a8e9f60536e9c0ef92f4a4070e8", RobustBitConfig.DEFAULT_VALUE)) {
                                i3 = ((Integer) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "64b98a8e9f60536e9c0ef92f4a4070e8")).intValue();
                            } else {
                                int dimensionPixelOffset = this.b.aS ? getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12) : i6;
                                if (this.b.aS && this.r != null && this.r.getVisibility() == 0) {
                                    int width = dimensionPixelOffset + this.r.getWidth() + this.r.getPaddingLeft() + this.r.getPaddingRight();
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.r.getLayoutParams();
                                    dimensionPixelOffset = width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                                }
                                if (this.b.bb && this.s != null && this.s.getVisibility() == 0) {
                                    int width2 = dimensionPixelOffset + this.s.getWidth() + this.s.getPaddingLeft() + this.s.getPaddingRight();
                                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.s.getLayoutParams();
                                    dimensionPixelOffset = width2 + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                                }
                                i3 = dimensionPixelOffset;
                            }
                            i4 = a2 - i3;
                        }
                        int a3 = a(i5, i4, min);
                        ViewGroup.LayoutParams layoutParams = this.M.getLayoutParams();
                        layoutParams.height = a;
                        layoutParams.width = a3;
                    }
                }
                this.M.requestLayout();
                a(i);
                if (abs == 0) {
                    if (!this.b.Y && !b() && !this.b.aS) {
                        c(com.sankuai.waimai.store.poi.list.util.d.a(0.0f));
                    }
                    a(view, 0.0f, this.N, this.Y);
                    this.D.setAlpha(1.0f);
                    this.I.setAlpha(0.0f);
                    if (this.g != null) {
                        this.g.setAlpha(1.0f);
                    }
                    a(1.0f);
                }
                e(abs);
            }
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b4ee58d03ba6bdd96df1145b71c9387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b4ee58d03ba6bdd96df1145b71c9387");
        } else if (this.b.Z) {
            float min = Math.min((Math.abs(i) * 1.0f) / this.C.getHeight(), 1.0f);
            if (this.b.Y) {
                return;
            }
            int a = com.sankuai.waimai.store.poi.list.util.d.a(min);
            if ((this.Z != null && !b() && !this.b.aS) || (this.Z != null && this.b.aX && this.b.aS)) {
                if (this.aa == null) {
                    this.aa = e.a(this.Z, a);
                } else {
                    DrawableCompat.setTintList(this.aa, ColorStateList.valueOf(a));
                }
                this.t.setBackground(this.aa);
            }
            if (this.r != null && this.ab != null && this.b.aS && this.b.aX) {
                if (this.ac == null) {
                    this.ac = e.a(this.ab, a);
                } else {
                    DrawableCompat.setTintList(this.ac, ColorStateList.valueOf(a));
                }
                this.r.setBackground(this.ab);
            }
            if (this.b.bb && this.s != null && this.ad != null && this.b.aS && this.b.aX) {
                if (this.ae == null) {
                    this.ae = e.a(this.ad, a);
                } else {
                    DrawableCompat.setTintList(this.ae, ColorStateList.valueOf(a));
                }
                this.s.setBackground(this.ad);
            }
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.card.actionbar.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d75cb320f20bd41ad0eb8492f9df46c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d75cb320f20bd41ad0eb8492f9df46c");
        } else {
            b(str);
        }
    }
}
