package com.sankuai.waimai.business.page.home.head.majorcategory;

import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.head.majorcategory.indicator.DotsIndicator;
import com.sankuai.waimai.business.page.home.head.promotion.PromotionBgViewModel;
import com.sankuai.waimai.business.page.home.helper.e;
import com.sankuai.waimai.business.page.home.model.NavigateItem;
import com.sankuai.waimai.business.page.home.model.v10.HomeNewHeadResponse;
import com.sankuai.waimai.business.page.home.preload.bean.RcmdNetBean;
import com.sankuai.waimai.foundation.utils.g;
import java.util.List;
/* compiled from: ProGuard */
@DynamicBinder(modelType = HomeNewHeadResponse.class, nativeId = {"wm_home_head_poi_category"}, viewModel = c.class)
/* loaded from: classes4.dex */
public class MajorCategoryBlock extends com.sankuai.waimai.business.page.common.arch.a<b> implements ViewPager.OnPageChangeListener {
    public static ChangeQuickRedirect v;
    private MajorCategoryViewPager A;
    private MajorCategoryPageAdapter B;
    private DotsIndicator C;
    private b D;
    private boolean E;
    private MajorCategoryViewModel F;
    private int G;
    private PromotionBgViewModel H;
    private HomePageViewModel I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private float O;
    private int P;
    private int Q;
    private int R;
    private final Context w;
    private final PageFragment x;
    private ViewGroup y;
    private View z;

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void a(PageFragment pageFragment) {
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final /* synthetic */ void d(@Nullable b bVar) {
        boolean z;
        List<NavigateItem> list;
        List<NavigateItem> list2;
        Context context;
        float f;
        b bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "130af93f0889d131f60ef56f916d61aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "130af93f0889d131f60ef56f916d61aa");
        } else if (bVar2 != null) {
            this.E = com.sankuai.waimai.business.page.home.helper.b.a().c;
            this.D = bVar2;
            b bVar3 = this.D;
            Object[] objArr2 = {Byte.valueOf(this.E ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar3, changeQuickRedirect2, false, "a76ec9302546befed17d56c3dee5656f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar3, changeQuickRedirect2, false, "a76ec9302546befed17d56c3dee5656f");
            } else {
                bVar3.a();
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "4a9a3fdec2c6f64b53809c5f98534762", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "4a9a3fdec2c6f64b53809c5f98534762")).booleanValue();
            } else {
                z = (TextUtils.isEmpty(bVar2.h) || bVar2.g == null || bVar2.g.size() <= 1) ? false : true;
            }
            if (z) {
                this.C.setVisibility(0);
            } else {
                this.C.setVisibility(8);
            }
            this.y.setVisibility(0);
            this.F.a(bVar2);
            MajorCategoryViewModel majorCategoryViewModel = this.F;
            boolean z2 = this.E;
            Object[] objArr4 = {bVar2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect4 = MajorCategoryViewModel.a;
            if (PatchProxy.isSupport(objArr4, majorCategoryViewModel, changeQuickRedirect4, false, "538c32d0eb6ab7ec3ffd9141a611c8c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, majorCategoryViewModel, changeQuickRedirect4, false, "538c32d0eb6ab7ec3ffd9141a611c8c7");
            } else if (bVar2 != null && bVar2.g != null && (list = bVar2.g.get(0)) != null) {
                int a = majorCategoryViewModel.a(list.size());
                majorCategoryViewModel.d = majorCategoryViewModel.a(true, z2) + (a > 0 ? (a - 1) * majorCategoryViewModel.a(false, z2) : 0);
                if (bVar2.b() && bVar2.g.size() > 1 && (list2 = bVar2.g.get(1)) != null) {
                    majorCategoryViewModel.e = majorCategoryViewModel.a(list2.size()) * majorCategoryViewModel.a(false, z2);
                }
            }
            this.P = this.F.d;
            this.Q = this.F.e;
            if (bVar2.b()) {
                context = com.meituan.android.singleton.b.a;
                f = 16.0f;
            } else {
                context = com.meituan.android.singleton.b.a;
                f = 10.0f;
            }
            this.R = g.a(context, f);
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = v;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8979855940392cd455c750b4e98834af", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8979855940392cd455c750b4e98834af");
            } else if (this.A != null) {
                this.A.setCurrentItem(0);
                a(0, 0.0f);
            }
            if (this.B == null) {
                this.B = new MajorCategoryPageAdapter(bVar2, this.x, this.E);
                this.B.d = this.F;
                this.A.setAdapter(this.B);
                final DotsIndicator dotsIndicator = this.C;
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = DotsIndicator.a;
                if (PatchProxy.isSupport(objArr6, dotsIndicator, changeQuickRedirect6, false, "c90afdbf73f42e9f7f32dc454ab3eb3d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, dotsIndicator, changeQuickRedirect6, false, "c90afdbf73f42e9f7f32dc454ab3eb3d");
                } else if (dotsIndicator.b.getAdapter() != null) {
                    dotsIndicator.b.getAdapter().registerDataSetObserver(new DataSetObserver() { // from class: com.sankuai.waimai.business.page.home.head.majorcategory.indicator.DotsIndicator.4
                        public static ChangeQuickRedirect a;

                        @Override // android.database.DataSetObserver
                        public final void onChanged() {
                            Object[] objArr7 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "7c2edc846e57ab8a5cada778f9afd8eb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "7c2edc846e57ab8a5cada778f9afd8eb");
                                return;
                            }
                            super.onChanged();
                            dotsIndicator.a();
                        }
                    });
                }
            } else {
                MajorCategoryPageAdapter majorCategoryPageAdapter = this.B;
                boolean z3 = this.E;
                Object[] objArr7 = {bVar2, Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect7 = MajorCategoryPageAdapter.a;
                if (PatchProxy.isSupport(objArr7, majorCategoryPageAdapter, changeQuickRedirect7, false, "0cf646ddb49b1e63d7d07b6abec0d2c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, majorCategoryPageAdapter, changeQuickRedirect7, false, "0cf646ddb49b1e63d7d07b6abec0d2c3");
                } else {
                    majorCategoryPageAdapter.b = bVar2;
                    majorCategoryPageAdapter.c = z3;
                    majorCategoryPageAdapter.notifyDataSetChanged();
                }
            }
            List<NavigateItem> list3 = bVar2.b;
            Object[] objArr8 = {list3};
            ChangeQuickRedirect changeQuickRedirect8 = e.a;
            if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "6067634e0125cc7ccafb77c2495d3e02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "6067634e0125cc7ccafb77c2495d3e02");
            } else if (!com.sankuai.waimai.foundation.utils.d.a(list3)) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "major_category_cache_new", e.a(list3));
            }
            com.sankuai.waimai.business.page.home.preload.e.a("WaimaiHomePage", "Category", RcmdNetBean.SOURCE_FROM_MT_HOMEPAGE_PRE_REQUEST.equals(((HomePageViewModel) q.a(this.x).a(HomePageViewModel.class)).Q) ? 2 : 0, null);
            this.B.a(this.G);
        }
    }

    public MajorCategoryBlock(com.meituan.android.cube.pga.type.a aVar) {
        this((PageFragment) aVar.h());
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4021fad02838ed220f402ed1c6807bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4021fad02838ed220f402ed1c6807bf");
        }
    }

    public MajorCategoryBlock(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f19d5b6f5c4f60cf5fef982359d18baa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f19d5b6f5c4f60cf5fef982359d18baa");
            return;
        }
        this.G = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0.0f;
        this.w = pageFragment.getActivity();
        this.x = pageFragment;
        this.F = (MajorCategoryViewModel) q.a(pageFragment).a(MajorCategoryViewModel.class);
        this.H = (PromotionBgViewModel) q.a(pageFragment).a(PromotionBgViewModel.class);
        this.I = (HomePageViewModel) q.a(pageFragment).a(HomePageViewModel.class);
        this.I.i.a(pageFragment, new l<Integer>() { // from class: com.sankuai.waimai.business.page.home.head.majorcategory.MajorCategoryBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e3155a8eee22fc6ff5c752008d827ad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e3155a8eee22fc6ff5c752008d827ad");
                } else {
                    MajorCategoryBlock.this.J = num2.intValue();
                }
            }
        });
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3504423ec47c1b4e2ef595364e779798", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3504423ec47c1b4e2ef595364e779798");
        }
        this.y = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_page_home_head_kingkong, viewGroup, false);
        this.A = (MajorCategoryViewPager) this.y.findViewById(R.id.vp_major_category);
        this.C = (DotsIndicator) this.y.findViewById(R.id.major_category_indicator);
        this.C.setViewPager(this.A);
        this.A.addOnPageChangeListener(this);
        this.z = this.y.findViewById(R.id.major_category_bg);
        this.z.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.business.page.home.head.majorcategory.MajorCategoryBlock.2
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e01580eacc30d62d55cef7af17f6845", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e01580eacc30d62d55cef7af17f6845");
                } else if (MajorCategoryBlock.this.J == 0 && MajorCategoryBlock.this.z != null) {
                    int[] iArr = new int[2];
                    MajorCategoryBlock.this.z.getLocationOnScreen(iArr);
                    int i = iArr[1];
                    PromotionBgViewModel promotionBgViewModel = MajorCategoryBlock.this.H;
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = PromotionBgViewModel.a;
                    if (PatchProxy.isSupport(objArr3, promotionBgViewModel, changeQuickRedirect3, false, "b1a6b0d1461dcc23169f0ac6234c53c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, promotionBgViewModel, changeQuickRedirect3, false, "b1a6b0d1461dcc23169f0ac6234c53c6");
                    } else {
                        promotionBgViewModel.o.b((k<Integer>) Integer.valueOf(i));
                    }
                }
            }
        });
        return this.y;
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f738c71f1a7b1c4d55895820a65cccb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f738c71f1a7b1c4d55895820a65cccb5");
        } else {
            super.y();
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f72f789be31792e743f7b949a25aff3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f72f789be31792e743f7b949a25aff3");
        } else {
            a(i, f);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f99c83b26589469ca26630f38a8c0b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f99c83b26589469ca26630f38a8c0b3");
            return;
        }
        this.G = i;
        if (this.B != null) {
            this.B.a(i);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        this.M = i;
    }

    private void a(int i, float f) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53962c78c62d99e43a78709a2f69d23d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53962c78c62d99e43a78709a2f69d23d");
            return;
        }
        if (f < 0.0f || f > 1.0f) {
            f = this.O;
        }
        this.L = this.P + this.R;
        if (this.A == null || this.L == 0 || this.P == 0 || this.Q == 0) {
            return;
        }
        this.K = this.Q - this.P;
        ViewGroup.LayoutParams layoutParams = this.A.getLayoutParams();
        if (i == 0 && f == 0.0f) {
            b(0);
        }
        if (i == 1 && f == 0.0f) {
            b(2);
        }
        if (this.M == 0 && f != 0.0f) {
            b(1);
        }
        if (this.M == 2 && f != 0.0f) {
            b(3);
        }
        if (this.M == 1 || this.M == 3) {
            layoutParams.height = this.L + ((int) (this.K * f));
        } else if (this.M == 0) {
            layoutParams.height = this.L;
        } else if (this.M == 2) {
            layoutParams.height = this.L + this.K;
        }
        this.A.setLayoutParams(layoutParams);
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f8cde74553a9b604e799de89fbcf829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f8cde74553a9b604e799de89fbcf829");
        } else if (this.M != i) {
            this.N = this.M;
            this.M = i;
        }
    }
}
