package com.sankuai.waimai.business.page.home.head.recommendwords;

import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.actionbar.HomeActionBarViewModel;
import com.sankuai.waimai.business.page.home.head.promotion.PromotionBgViewModel;
import com.sankuai.waimai.business.page.home.head.promotionbg.d;
import com.sankuai.waimai.business.page.home.model.v10.HomeNewHeadResponse;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.business.search.api.RollSearchKeyword;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.preload.e;
import com.sankuai.waimai.platform.widget.HorizontalFlowLayout;
import com.sankuai.waimai.router.core.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@DynamicBinder(modelType = HomeNewHeadResponse.class, nativeId = {"wm_home_head_hot_search"}, viewModel = c.class)
/* loaded from: classes4.dex */
public class a extends com.sankuai.waimai.business.page.common.arch.a<RecommendSearchWord> {
    public static ChangeQuickRedirect v;
    private LinearLayout A;
    private float B;
    private boolean C;
    private int D;
    @Nullable
    private b E;
    private boolean F;
    private boolean G;
    private RecommendSearchWord H;
    private PromotionBgViewModel I;
    private boolean J;
    private boolean K;
    private Context w;
    private ViewGroup x;
    private HorizontalFlowLayout y;
    private LayoutInflater z;

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final /* synthetic */ void d(RecommendSearchWord recommendSearchWord) {
        RecommendSearchWord recommendSearchWord2 = recommendSearchWord;
        Object[] objArr = {recommendSearchWord2};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19f4dd26a7ba472c23f9817b7e1b144f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19f4dd26a7ba472c23f9817b7e1b144f");
            return;
        }
        this.C = false;
        this.H = recommendSearchWord2;
        if (R()) {
            this.D = ((HomeActionBarViewModel) q.a(this.s).a(HomeActionBarViewModel.class)).b();
            P();
            if (com.sankuai.waimai.foundation.core.a.d()) {
                return;
            }
            Q();
        }
    }

    public static /* synthetic */ void a(a aVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "5418160feaa7cc4372d0e176233bb897", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "5418160feaa7cc4372d0e176233bb897");
        } else if (i > aVar.D && aVar.B > 0.0f && i - aVar.D <= aVar.B) {
            aVar.x.setAlpha(1.0f - ((i - aVar.D) / aVar.B));
        } else if (i == 0) {
            aVar.x.setAlpha(1.0f);
        }
    }

    public static /* synthetic */ boolean d(a aVar, boolean z) {
        aVar.C = false;
        return false;
    }

    public a(com.meituan.android.cube.pga.type.a aVar) {
        this((PageFragment) aVar.h());
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff59f68c91250994d22c7d4b2fea7528", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff59f68c91250994d22c7d4b2fea7528");
        }
    }

    private a(PageFragment pageFragment) {
        super(pageFragment);
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0dcda62b6277d0427e6f0d077feef64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0dcda62b6277d0427e6f0d077feef64");
            return;
        }
        this.C = false;
        this.w = pageFragment.getContext();
        this.z = LayoutInflater.from(this.w);
        this.E = new b(this.w, AppUtil.generatePageInfoKey(pageFragment));
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0586f07bbfe23660409ffd5fcc5123f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0586f07bbfe23660409ffd5fcc5123f8");
        }
        this.x = (ViewGroup) LayoutInflater.from(this.w).inflate(R.layout.wm_page_main_head_recommend_search_word, viewGroup, false);
        this.B = g.a(com.meituan.android.singleton.b.a, 15.0f);
        this.A = (LinearLayout) this.x.findViewById(R.id.recommend_words_container);
        this.K = com.sankuai.waimai.business.page.home.helper.b.a().c;
        if (R()) {
            this.I = (PromotionBgViewModel) q.a(this.s).a(PromotionBgViewModel.class);
            this.I.e.a(this.s, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.head.recommendwords.a.1
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr2 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "98830e6ec01a4136e10544b90e1df457", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "98830e6ec01a4136e10544b90e1df457");
                        return;
                    }
                    a.this.F = bool2.booleanValue();
                    a.this.P();
                    if (!com.sankuai.waimai.foundation.core.a.d() || a.this.C) {
                        return;
                    }
                    a.this.Q();
                }
            });
            this.I.f.a(this.s, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.head.recommendwords.a.2
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr2 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6305c480939b4aafd1cce1b8969cd687", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6305c480939b4aafd1cce1b8969cd687");
                        return;
                    }
                    a.this.J = bool2.booleanValue();
                    a.this.P();
                    if (!com.sankuai.waimai.foundation.core.a.d() || a.this.C) {
                        return;
                    }
                    a.this.Q();
                }
            });
            ((HomePageViewModel) q.a(this.s).a(HomePageViewModel.class)).i.a(this.s, new l<Integer>() { // from class: com.sankuai.waimai.business.page.home.head.recommendwords.a.3
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Integer num) {
                    Integer num2 = num;
                    Object[] objArr2 = {num2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25eca51c67864efb02a3cb06349d8903", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25eca51c67864efb02a3cb06349d8903");
                    } else if (num2 != null) {
                        a.a(a.this, num2.intValue());
                    }
                }
            });
            ((HomePageViewModel) q.a(this.s).a(HomePageViewModel.class)).F.a(this.s, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.head.recommendwords.a.4
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr2 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5717ea3105997507b573524d48c8f2cf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5717ea3105997507b573524d48c8f2cf");
                    } else {
                        a.this.G = bool2.booleanValue();
                    }
                }
            });
            ((HomePageViewModel) q.a(this.s).a(HomePageViewModel.class)).E.a(this.s, new l<RecommendSearchWord>() { // from class: com.sankuai.waimai.business.page.home.head.recommendwords.a.5
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable RecommendSearchWord recommendSearchWord) {
                    RecommendSearchWord recommendSearchWord2 = recommendSearchWord;
                    Object[] objArr2 = {recommendSearchWord2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9933456db03495e1ef6ae7726bf6e688", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9933456db03495e1ef6ae7726bf6e688");
                    } else if (recommendSearchWord2 != null) {
                        a.d(a.this, false);
                        a.this.H = recommendSearchWord2;
                        if (a.this.R()) {
                            a.this.D = ((HomeActionBarViewModel) q.a(a.this.s).a(HomeActionBarViewModel.class)).b();
                            a.this.P();
                            a.this.Q();
                        }
                    }
                }
            });
        }
        return this.x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        TextView textView;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4490867303cc63895fd549c082594b17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4490867303cc63895fd549c082594b17");
        } else if (this.H == null || !this.n.c().booleanValue()) {
            this.x.setVisibility(8);
        } else {
            this.H.isCache = this.n.b;
            List<RecommendedSearchKeyword> list = this.H.searchGuideKeywords;
            int a = d.a(this.w).a();
            boolean z = this.F ? a == 1 : true;
            boolean a2 = a(list);
            if (!a2) {
                this.x.setVisibility(4);
                this.A.removeAllViews();
                this.y = (HorizontalFlowLayout) this.z.inflate(R.layout.wm_page_home_head_recommend_words, (ViewGroup) null);
                this.A.addView(this.y);
            }
            for (int i = 0; i < list.size(); i++) {
                RecommendedSearchKeyword recommendedSearchKeyword = list.get(i);
                if (a2) {
                    textView = (TextView) this.y.getChildAt(i);
                } else {
                    textView = new TextView(this.w);
                    this.y.addView(textView);
                }
                a(a, z, recommendedSearchKeyword, i, textView);
            }
            this.x.setVisibility(0);
        }
    }

    private boolean a(List<RecommendedSearchKeyword> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b1d212033d50e12165c84cac45232da", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b1d212033d50e12165c84cac45232da")).booleanValue();
        }
        boolean z = com.sankuai.waimai.business.page.home.helper.b.a().c;
        if (this.K != z) {
            this.K = z;
            return false;
        } else if (list == null || list.size() <= 0 || this.A == null || this.A.getChildCount() != 1 || this.y == null || this.y.getChildCount() <= 0 || this.y.getChildCount() != list.size()) {
            return false;
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (!(this.y.getChildAt(i) instanceof TextView) || ((TextView) this.y.getChildAt(i)).getText() == null || list.get(i).viewKeyword == null || !list.get(i).viewKeyword.equals(((TextView) this.y.getChildAt(i)).getText().toString())) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb6f7fb34fe5053d9ff2669bee8f99b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb6f7fb34fe5053d9ff2669bee8f99b3");
        } else if (this.E == null || this.H == null) {
        } else {
            this.C = true;
            this.E.a(this.F);
            this.E.f = this.G;
            if (R()) {
                this.E.g = ((HomeActionBarViewModel) q.a(this.s).a(HomeActionBarViewModel.class)).m;
            }
            this.E.a(this.H.rcmdLogId);
            this.E.b(this.H.tgtStids);
            this.y.post(new Runnable() { // from class: com.sankuai.waimai.business.page.home.head.recommendwords.a.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "974aeea5e4db622d0226664e5b9c9cb3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "974aeea5e4db622d0226664e5b9c9cb3");
                        return;
                    }
                    List<RecommendedSearchKeyword> list = a.this.H.searchGuideKeywords;
                    ArrayList arrayList = new ArrayList(list);
                    int shownItemCount = a.this.y.getShownItemCount();
                    if (com.sankuai.waimai.foundation.utils.d.a(list) || shownItemCount <= 0) {
                        return;
                    }
                    int min = Math.min(shownItemCount, list.size());
                    a.this.E.a(list.subList(0, min), a.this.H);
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (i < min) {
                            ((RecommendedSearchKeyword) arrayList.get(i)).isExposed = true;
                        }
                        ((RecommendedSearchKeyword) arrayList.get(i)).exposedIndex = i;
                    }
                    if (a.this.R()) {
                        HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(a.this.s).a(HomePageViewModel.class);
                        Object[] objArr3 = {arrayList};
                        ChangeQuickRedirect changeQuickRedirect3 = HomePageViewModel.a;
                        if (PatchProxy.isSupport(objArr3, homePageViewModel, changeQuickRedirect3, false, "6502f6838b2488820d8b30d3142268c0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, homePageViewModel, changeQuickRedirect3, false, "6502f6838b2488820d8b30d3142268c0");
                        } else {
                            homePageViewModel.C.b((k<List<RecommendedSearchKeyword>>) arrayList);
                        }
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void a(com.meituan.android.cube.pga.viewmodel.a aVar) {
        boolean z = true;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c419f564dde9c3a44d6e0f48e391cc6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c419f564dde9c3a44d6e0f48e391cc6a");
            return;
        }
        super.a(aVar);
        if (aVar instanceof c) {
            c cVar = (c) aVar;
            if (R()) {
                ((HomeActionBarViewModel) q.a(this.s).a(HomeActionBarViewModel.class)).o = (cVar.e().rollSearchKeyword == null || cVar.e().rollSearchKeyword.enhanceShowStyle != 1) ? false : false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean R() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb3cd56f8d181fce6cc23e13a2b3f3b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb3cd56f8d181fce6cc23e13a2b3f3b")).booleanValue() : (this.s == null || this.s.F == null || !this.s.isAdded() || this.s.isDetached()) ? false : true;
    }

    @ColorInt
    private int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55ed556af1f989d89dedfebb771f9805", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55ed556af1f989d89dedfebb771f9805")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }

    private void a(int i, boolean z, final RecommendedSearchKeyword recommendedSearchKeyword, final int i2, final TextView textView) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), recommendedSearchKeyword, Integer.valueOf(i2), textView};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a361a15d9009c17812be905d1361c2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a361a15d9009c17812be905d1361c2c");
            return;
        }
        if (!this.F && !TextUtils.isEmpty(recommendedSearchKeyword.textColor)) {
            r1 = a(recommendedSearchKeyword.textColor, z ? -14539738 : -1);
        } else if (z) {
            r1 = -14539738;
        }
        textView.setTextColor(r1);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView.setTextSize(1, 11.0f);
        textView.setGravity(17);
        if (recommendedSearchKeyword.isIcon) {
            String str = this.F ? i == 1 ? "http://p1.meituan.net/scarlett/7fe501395530f5a3f68fb9016b450d92669.png" : "http://p0.meituan.net/scarlett/9b761f8e4b33b704f1410f17af8a7254433.png" : "http://p1.meituan.net/scarlett/90f436621d7461e41cf1e870daaf7bb5612.png";
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.c = str;
            c.a(new b.a() { // from class: com.sankuai.waimai.business.page.home.head.recommendwords.a.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de0fae9ad01f7151c7a123559c257051", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de0fae9ad01f7151c7a123559c257051");
                        return;
                    }
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                    bitmapDrawable.setBounds(0, 0, 19, 24);
                    textView.setCompoundDrawables(bitmapDrawable, null, null, null);
                }
            });
            textView.setCompoundDrawablePadding(g.a(this.w, 4.0f));
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(0);
        }
        GradientDrawable gradientDrawable = (GradientDrawable) this.w.getDrawable(R.drawable.wm_page_home_head_recommend_words_bg);
        if (gradientDrawable != null) {
            if (z && this.F) {
                gradientDrawable.setColor(-1711276033);
            } else if (!z && this.F) {
                gradientDrawable.setColor(1493172224);
            } else if (!z) {
                gradientDrawable.setColor(872415231);
            } else if (TextUtils.isEmpty(recommendedSearchKeyword.textBgColor)) {
                if (recommendedSearchKeyword.isIcon) {
                    gradientDrawable.setColor(452971571);
                } else {
                    gradientDrawable.setColor(-855310);
                }
            } else {
                gradientDrawable.setColor(a(recommendedSearchKeyword.textBgColor, -855310));
            }
            textView.setBackground(gradientDrawable);
        }
        String str2 = "";
        if (recommendedSearchKeyword != null && !TextUtils.isEmpty(recommendedSearchKeyword.viewKeyword)) {
            if (recommendedSearchKeyword.isIcon) {
                if (recommendedSearchKeyword.viewKeyword.length() > 5) {
                    str2 = recommendedSearchKeyword.viewKeyword.substring(0, 4) + "…";
                } else {
                    str2 = recommendedSearchKeyword.viewKeyword;
                }
            } else if (recommendedSearchKeyword.viewKeyword.length() > 7) {
                str2 = recommendedSearchKeyword.viewKeyword.substring(0, 6) + "…";
            } else {
                str2 = recommendedSearchKeyword.viewKeyword;
            }
        }
        textView.setText(str2);
        final Bundle bundle = new Bundle();
        bundle.putInt("global_search_from", 1);
        bundle.putBoolean("auto_search", true);
        bundle.putSerializable("recommended_search_keyword", recommendedSearchKeyword);
        bundle.putString("rcmd_s_log_id", this.H != null ? this.H.rcmdLogId : "");
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.head.recommendwords.a.8
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = 1;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "323c1837df6289fa26cf3541d64fb907", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "323c1837df6289fa26cf3541d64fb907");
                } else if (a.this.E != null) {
                    int intValue = textView.getTag() instanceof Integer ? ((Integer) textView.getTag()).intValue() : 0;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.preload.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4fe07d0e8cd380b67e03bdf9d9cedcbb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4fe07d0e8cd380b67e03bdf9d9cedcbb");
                    } else {
                        com.sankuai.waimai.platform.capacity.log.c.a().a(5000, "waimai_search_ftr", SystemClock.elapsedRealtime());
                    }
                    bundle.putInt("_wm_preload_page_id_overridable_", intValue);
                    bundle.putBoolean(RollSearchKeyword.IS_REQUEST_FRESH, a.this.G);
                    if (a.this.R()) {
                        HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(a.this.s).a(HomePageViewModel.class);
                        bundle.putSerializable("recommended_search_word_list", com.sankuai.waimai.business.search.api.a.a(homePageViewModel.C.a(), homePageViewModel.D.a()));
                        bundle.putString(RollSearchKeyword.TRIGGER_POI_ID, ((HomeActionBarViewModel) q.a(a.this.s).a(HomeActionBarViewModel.class)).m);
                    }
                    b bVar = a.this.E;
                    int i4 = i2;
                    RecommendedSearchKeyword recommendedSearchKeyword2 = recommendedSearchKeyword;
                    Bundle bundle2 = bundle;
                    RecommendSearchWord recommendSearchWord = a.this.H;
                    Object[] objArr4 = {Integer.valueOf(i4), recommendedSearchKeyword2, bundle2, recommendSearchWord};
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "9aff375ea4742b457b713ed2a6bdab78", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "9aff375ea4742b457b713ed2a6bdab78");
                        return;
                    }
                    com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-search");
                    if (!TextUtils.isEmpty(recommendedSearchKeyword2.scheme)) {
                        com.sankuai.waimai.foundation.router.a.a(bVar.h, recommendedSearchKeyword2.scheme);
                    } else {
                        com.sankuai.waimai.foundation.router.a.a(bVar.h, com.sankuai.waimai.foundation.router.interfaces.c.G, bundle2);
                    }
                    JudasManualManager.a a2 = JudasManualManager.a("b_by57tq7r").a("c_m84bv26");
                    a2.b = bVar.i;
                    JudasManualManager.a b = a2.a("rcmd_s_log_id", bVar.c).a("stid", bVar.d).a("keyword", recommendedSearchKeyword2.viewKeyword).a("index", i4).a("is_activity", bVar.e).a("rank_id", TextUtils.isEmpty(recommendedSearchKeyword2.traceInfo) ? "" : recommendedSearchKeyword2.traceInfo).a("word_page_type", !TextUtils.isEmpty(recommendedSearchKeyword2.scheme) ? 1 : 0).a("word_type", recommendedSearchKeyword2.wordType).a("cat_id", 0).a("is_fresh_request", bVar.f ? 1 : 0).a(RaptorUploaderImpl.IS_CACHE, (recommendSearchWord == null || !recommendSearchWord.isCache) ? 0 : 0).b(com.sankuai.waimai.mach.utils.b.a(recommendedSearchKeyword2.logData));
                    if (bVar.f) {
                        b.a(RollSearchKeyword.TRIGGER_POI_ID, bVar.g);
                    }
                    b.a();
                    String str3 = b.b;
                    com.sankuai.waimai.foundation.utils.log.a.b(str3, "onClick. RcmdWord=" + recommendedSearchKeyword2.searchKeyword + ". Index=" + i4, new Object[0]);
                }
            }
        });
        textView.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.page.home.head.recommendwords.a.9
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Object[] objArr2 = {view, motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5dd5e1a07fd72b92d88ac20ff99c59cb", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5dd5e1a07fd72b92d88ac20ff99c59cb")).booleanValue();
                }
                if (motionEvent.getAction() == 0) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.preload.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "626b40e17413addb818aa54900c2e556", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "626b40e17413addb818aa54900c2e556");
                    } else {
                        com.sankuai.waimai.platform.capacity.log.c.a().a(5001, "waimai_search_ftr", SystemClock.elapsedRealtime());
                    }
                    j jVar = new j(a.this.w, com.sankuai.waimai.foundation.router.interfaces.c.G);
                    Bundle bundle2 = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra", null);
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle2);
                    }
                    bundle2.putAll(bundle);
                    textView.setTag(Integer.valueOf(e.a().a(jVar)));
                }
                return false;
            }
        });
    }
}
