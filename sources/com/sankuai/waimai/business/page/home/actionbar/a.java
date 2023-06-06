package com.sankuai.waimai.business.page.home.actionbar;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.arch.lifecycle.d;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.utils.f;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.LocationUtils;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.log.i;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.business.page.common.arch.a {
    public static ChangeQuickRedirect v;
    private ViewGroup A;
    private ViewGroup B;
    private TextView C;
    private TextView D;
    private TextView E;
    private ViewGroup F;
    private int G;
    private TextView H;
    private Button I;
    private int J;
    private int K;
    private float L;
    private float M;
    private List<List<RecommendedSearchKeyword>> N;
    private RecommendedSearchKeyword O;
    private int P;
    private boolean Q;
    private PageFragment R;
    private ArgbEvaluator S;
    private HomeActionBarViewModel T;
    private ElderHomeActionBarViewModel U;
    private String V;
    private final String W;
    private boolean X;
    private View.OnClickListener Y;
    private View.OnClickListener Z;
    public com.sankuai.waimai.business.page.home.im.a w;
    private final String x;
    private View y;
    private View z;

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "8ad62c472f27d31da12deace8cce95b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "8ad62c472f27d31da12deace8cce95b4");
        } else if (g.e() == null) {
            ae.a((Activity) aVar.R.getActivity(), (int) R.string.wm_page_poiList_actionbar_search_unknown_location);
            WmAddress k = com.sankuai.waimai.foundation.location.v2.g.a().k();
            if (k != null) {
                i.d(new com.sankuai.waimai.business.page.common.log.a().a("home_page_jump_to_global_search").c(k.getAddress()).b());
            }
        } else {
            com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-search");
            Bundle bundle = new Bundle();
            bundle.putInt("global_search_from", 1);
            bundle.putSerializable("recommended_search_keyword", aVar.O);
            if (aVar.N != null && aVar.N.size() != 0 && aVar.N.get(aVar.P) != null && aVar.N.get(aVar.P).size() == 2) {
                bundle.putSerializable("recommended_search_keywordroll_search_keyword", aVar.N.get(aVar.P).get(1));
            }
            bundle.putSerializable("search_entrance_style", Boolean.valueOf(aVar.T.k));
            bundle.putInt("search_box_color", aVar.G);
            new com.sankuai.waimai.router.common.b(aVar.R.getActivity(), com.sankuai.waimai.foundation.router.interfaces.c.G).a(bundle).g();
            aVar.R.getActivity().overridePendingTransition(17432576, 17432577);
        }
    }

    public static /* synthetic */ void a(a aVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "88db4f9e99a22afeae2cac5208bf89c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "88db4f9e99a22afeae2cac5208bf89c6");
            return;
        }
        int i2 = aVar.T.b;
        if (i2 <= 0) {
            i2 = 0;
        }
        aVar.a(i, i2);
    }

    public static /* synthetic */ void a(a aVar, String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "aaf91f56720162156855680a28683156", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "aaf91f56720162156855680a28683156");
        } else {
            aVar.C.setText(str);
        }
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e4cc847cb366f0b66cd8b60d57df7915", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e4cc847cb366f0b66cd8b60d57df7915");
            return;
        }
        JudasManualManager.a(z ? "b_G73OZ" : "b_UDdde").a("c_m84bv26").a(aVar.R).b(aVar.a(true, z)).a();
        if (aVar.O == null || aVar.O.viewKeyword == null || !aVar.O.viewKeyword.equals("输入商家/商品名")) {
            return;
        }
        JudasManualManager.a("b_Bq0iH").a("c_m84bv26").a(aVar.R).a();
    }

    public static /* synthetic */ void d(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "2cf7914d830a249990d609d28edde766", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "2cf7914d830a249990d609d28edde766");
        } else {
            aVar.T.d = true;
        }
    }

    public a(PageFragment pageFragment, String str) {
        Object[] objArr = {pageFragment, str};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4debc8a1cfda5307bf149f769a313bf2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4debc8a1cfda5307bf149f769a313bf2");
            return;
        }
        this.G = 255;
        this.J = -1;
        this.K = -1;
        this.L = -1.0f;
        this.M = -1.0f;
        this.P = 0;
        this.Q = false;
        this.W = com.sankuai.waimai.business.search.api.b.a(com.meituan.android.singleton.b.a);
        this.X = false;
        this.Y = new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.actionbar.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "43ab925db77663fe93bcab6527cda0c0", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "43ab925db77663fe93bcab6527cda0c0");
                    return;
                }
                a.a(a.this, view.getId() == R.id.button_search);
                a.a(a.this);
                com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-search");
            }
        };
        this.Z = new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.actionbar.a.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16993270d6cdd417cd381a7c1b47dffd", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16993270d6cdd417cd381a7c1b47dffd");
                } else if (a.this.T.d) {
                    HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(a.this.R).a(HomePageViewModel.class);
                    homePageViewModel.N = true;
                    if (com.sankuai.waimai.foundation.location.v2.g.a().p() == null) {
                        homePageViewModel.O = true;
                    } else {
                        homePageViewModel.O = false;
                    }
                    WmAddress k = com.sankuai.waimai.foundation.location.v2.g.a().k();
                    WMLocation i = com.sankuai.waimai.foundation.location.v2.g.a().i();
                    if (i != null) {
                        i.getLongitude();
                        i.getLatitude();
                    }
                    String address = k != null ? k.getAddress() : "";
                    if (i != null) {
                        LocationUtils.TransformData a2 = LocationUtils.a(i.getLongitude(), i.getLatitude());
                        JudasManualManager.a("b_waimai_rwrrf4bo_mc").a("c_m84bv26").a(GearsLocator.ADDRESS, address).a("ji", a2.ji).a("jf", a2.jf).a("wi", a2.wi).a("wf", a2.wf).a(a.this.R).a();
                    }
                    a.this.T.d = false;
                    a.this.T.a(a.this.R.getActivity());
                }
            }
        };
        this.x = str;
        this.R = pageFragment;
        a(pageFragment);
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void a(final PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a38383c84a9788011786246b8340412e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a38383c84a9788011786246b8340412e");
            return;
        }
        this.T = (HomeActionBarViewModel) q.a(pageFragment).a(HomeActionBarViewModel.class);
        this.U = (ElderHomeActionBarViewModel) q.a(pageFragment).a(ElderHomeActionBarViewModel.class);
        this.T.e.a(pageFragment, new l<Pair<Integer, Integer>>() { // from class: com.sankuai.waimai.business.page.home.actionbar.a.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Pair<Integer, Integer> pair) {
                Pair<Integer, Integer> pair2 = pair;
                Object[] objArr2 = {pair2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "568454883c8789728d5df81c8d3ee6ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "568454883c8789728d5df81c8d3ee6ab");
                } else if (pair2 != null) {
                    a.this.a(pair2.first.intValue(), pair2.second.intValue());
                }
            }
        });
        HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(pageFragment).a(HomePageViewModel.class);
        homePageViewModel.i.a(this.R, new l<Integer>() { // from class: com.sankuai.waimai.business.page.home.actionbar.a.4
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a47295ec420db94063df9b807209588", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a47295ec420db94063df9b807209588");
                } else if (num2 != null) {
                    a.a(a.this, -num2.intValue());
                }
            }
        });
        homePageViewModel.m.a(pageFragment, new l<Pair<String, Boolean>>() { // from class: com.sankuai.waimai.business.page.home.actionbar.a.5
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Pair<String, Boolean> pair) {
                Pair<String, Boolean> pair2 = pair;
                Object[] objArr2 = {pair2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7053faccb93f8cfcc310d2a167163cee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7053faccb93f8cfcc310d2a167163cee");
                } else if (pair2 != null) {
                    a.a(a.this, pair2.first, pair2.second.booleanValue());
                }
            }
        });
        homePageViewModel.f.a(new l<d.a>() { // from class: com.sankuai.waimai.business.page.home.actionbar.a.6
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable d.a aVar) {
                d.a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e155b7726af68dec776bb92814aaf06", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e155b7726af68dec776bb92814aaf06");
                } else if (aVar2 == null || !aVar2.equals(d.a.ON_RESUME)) {
                } else {
                    a.d(a.this);
                }
            }
        });
        homePageViewModel.x.a(pageFragment, new l<Integer>() { // from class: com.sankuai.waimai.business.page.home.actionbar.a.7
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "955b46ac21685428c8067614a89b994f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "955b46ac21685428c8067614a89b994f");
                } else if (a.this.C == null || num2 == null) {
                } else {
                    if (num2.intValue() <= 880 || HomePageFragment.a(pageFragment.getActivity())) {
                        a.this.C.setMaxEms(6);
                    } else {
                        a.this.C.setMaxEms(8);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4784c80be968fa71507ec5fb1ed97f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4784c80be968fa71507ec5fb1ed97f5");
        } else {
            b(i, i2);
        }
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcf0e75dc7a40221197af16e2ace798d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcf0e75dc7a40221197af16e2ace798d");
        }
        this.y = viewGroup.findViewById(R.id.action_bar_background_elderly);
        this.z = viewGroup.findViewById(R.id.action_bar_root_elderly);
        if (this.R.getActivity() != null && com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) this.R.getActivity())) {
            this.z.setPadding(0, com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a), 0, 0);
        }
        this.B = (ViewGroup) this.z.findViewById(R.id.layout_location_box);
        this.C = (TextView) this.B.findViewById(R.id.txt_location);
        this.D = (TextView) this.B.findViewById(R.id.img_location);
        this.E = (TextView) this.B.findViewById(R.id.img_location_arrow);
        this.F = (ViewGroup) this.z.findViewById(R.id.layout_search_box_normal);
        this.H = (TextView) this.F.findViewById(R.id.txt_search_normal);
        this.I = (Button) this.F.findViewById(R.id.button_search);
        this.I.setVisibility(8);
        this.A = (ViewGroup) this.z.findViewById(R.id.layout_search_box_container);
        this.F.setOnClickListener(this.Y);
        this.I.setOnClickListener(this.Y);
        this.B.setOnClickListener(this.Z);
        this.w = new com.sankuai.waimai.business.page.home.im.a(this.R.getActivity(), AppUtil.generatePageInfoKey(this.R));
        this.w.a(this.z);
        this.S = new ArgbEvaluator();
        boolean z = this.Q;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = v;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cfa36a76a6a306671ea9f63ff26eda16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cfa36a76a6a306671ea9f63ff26eda16");
        } else {
            this.Q = z;
            this.z.setBackground(this.R.getActivity().getResources().getDrawable(R.drawable.wm_page_home_actionbar_bg));
            this.y.getBackground().mutate().setAlpha(255);
            this.z.getBackground().mutate().setAlpha((int) (this.M >= 0.0f ? (1.0f - this.M) * 255.0f : 0.0f));
            ((GradientDrawable) this.F.getBackground()).setColor(this.R.getActivity().getResources().getColor(R.color.wm_page_home_search_box_bg_a));
            this.A.setBackgroundResource(R.drawable.wm_page_home_search_box_bg);
            this.G = this.R.getActivity().getResources().getColor(R.color.wm_page_home_search_box_bg);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = v;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b887d29415ac61e13f04cb6ba9356937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b887d29415ac61e13f04cb6ba9356937");
        } else {
            int a = com.sankuai.waimai.business.page.home.head.promotionbg.d.a(com.meituan.android.singleton.b.a).a();
            this.C.setTextColor(Color.parseColor("#33312D"));
            com.meituan.roodesign.widgets.iconfont.b.a(this.D, R.string.wm_c_iconfont_14dingwei, R.color.roo_default_color_gray_dim);
            com.meituan.roodesign.widgets.iconfont.b.a(this.E, R.string.wm_c_iconfont_arrow_right_small, R.color.roo_default_color_gray_dim);
            this.w.a(false, a);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = v;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e351a4494e2189295e7b1c9186475632", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e351a4494e2189295e7b1c9186475632");
        } else {
            JudasManualManager.b("b_dmKcT").a("c_m84bv26").a(this.R).b(a(false, false)).a();
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = v;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "781735d6ed78eba8982f0bd8c0481bd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "781735d6ed78eba8982f0bd8c0481bd1");
        } else {
            JudasManualManager.b("b_waimai_ocn7sgla_mv").a("c_m84bv26").a(this.R).b(a(false, true)).a();
        }
        return this.z;
    }

    private void b(int i, int i2) {
        GradientDrawable gradientDrawable;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d217fdb2c17cbeced258d8f6d203c86f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d217fdb2c17cbeced258d8f6d203c86f");
            return;
        }
        if (!this.X && i != 0) {
            f.a();
            this.X = true;
        }
        int a = this.U.a(i);
        if (this.J != a || this.K != i2) {
            this.K = i2;
            this.J = a;
            this.T.b = this.K;
            ViewGroup.LayoutParams layoutParams = this.A.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((View) this.z.getParent()).setY(i2);
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = -a;
                this.A.setLayoutParams(layoutParams);
                int[] iArr = {Color.parseColor("#FFD54D"), Color.parseColor("#FFC34D")};
                if (a == this.U.b()) {
                    gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, iArr);
                    gradientDrawable.setCornerRadius(com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 15.0f));
                    if (!this.Q) {
                        this.I.setVisibility(0);
                    }
                    this.I.setBackground(gradientDrawable);
                } else {
                    gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(Color.parseColor("#ffcc33"));
                    gradientDrawable.setCornerRadius(com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 15.0f));
                    if (!this.Q) {
                        this.I.setVisibility(0);
                    }
                }
                this.I.setBackground(gradientDrawable);
            }
        }
        float b = this.T.b(i);
        if (this.M != b) {
            this.M = b;
            float f = 1.0f - b;
            this.B.setAlpha(f);
            this.z.getBackground().mutate().setAlpha((int) (f * 255.0f));
        }
    }

    private Map<String, Object> a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aaa1af98578f1e5731cb7402537b3e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aaa1af98578f1e5731cb7402537b3e0");
        }
        Map<String, Object> a = com.sankuai.waimai.business.page.common.util.a.a(this.O, "输入商家/商品名");
        a.put("index", Integer.valueOf(this.P));
        a.put("rcmd_s_log_id", this.V);
        a.put("stid", this.W);
        if (this.N != null && this.P >= 0 && this.P < this.N.size() && this.N.get(this.P) != null && this.N.get(this.P).size() > 1) {
            RecommendedSearchKeyword recommendedSearchKeyword = this.N.get(this.P).get(1);
            a.put("keyword1", recommendedSearchKeyword.searchKeyword);
            a.put("label_word1", recommendedSearchKeyword.viewKeyword);
        }
        if (z) {
            a.put("spread", this.T.c ? "1" : "0");
        }
        if (z2) {
            a.put("location_page", 1);
            a.put("qw_type_id", Integer.valueOf((int) XPlayerConstants.FFP_MSG_RECEIVE_SEI_FRAME));
            a.put("click_type", 2);
            a.put("word_page_type", 1);
            if (this.O == null) {
                a.put("label_type", "");
            } else {
                a.put("label_type", Integer.valueOf(this.O.type));
            }
        }
        a.put("cat_id", 0);
        return a;
    }
}
