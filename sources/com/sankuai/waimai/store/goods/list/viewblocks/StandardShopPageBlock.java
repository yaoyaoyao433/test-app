package com.sankuai.waimai.store.goods.list.viewblocks;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.SuperscriptSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.goods.list.adapter.StandardShopPageAdapter;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.view.standard.FlashTab;
import com.sankuai.waimai.store.view.standard.FlashTabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StandardShopPageBlock extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    FlashTab b;
    ViewPager c;
    ImageView d;
    StandardShopPageAdapter e;
    RestMenuResponse f;
    boolean g;
    int h;
    boolean i;
    boolean j;
    private final com.sankuai.waimai.store.goods.list.delegate.e k;
    private Map<View, com.sankuai.waimai.store.expose.v2.entity.b> l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(int i) {
        return i == 5 || i == 11;
    }

    public static /* synthetic */ int a(StandardShopPageBlock standardShopPageBlock, int i) {
        standardShopPageBlock.h = 0;
        return 0;
    }

    public static /* synthetic */ void a(StandardShopPageBlock standardShopPageBlock, FlashTabLayout.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, standardShopPageBlock, changeQuickRedirect, false, "1f258f03e26a8c7c78773e035dfeb8f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, standardShopPageBlock, changeQuickRedirect, false, "1f258f03e26a8c7c78773e035dfeb8f9");
        } else if (standardShopPageBlock.i) {
        } else {
            int i = eVar.h;
            RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) standardShopPageBlock.f.navigationBars, i);
            if (bVar == null || !a(bVar.c)) {
                return;
            }
            standardShopPageBlock.b.a(i, standardShopPageBlock.j);
        }
    }

    public static /* synthetic */ boolean a(StandardShopPageBlock standardShopPageBlock, boolean z) {
        standardShopPageBlock.g = false;
        return false;
    }

    public static /* synthetic */ void b(StandardShopPageBlock standardShopPageBlock, FlashTabLayout.e eVar) {
        RestMenuResponse.b bVar;
        View findViewById;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, standardShopPageBlock, changeQuickRedirect, false, "40320d28b9aa238dda6bd09bcbfe1368", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, standardShopPageBlock, changeQuickRedirect, false, "40320d28b9aa238dda6bd09bcbfe1368");
        } else if (standardShopPageBlock.i || (bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) standardShopPageBlock.f.navigationBars, eVar.h)) == null || !a(bVar.c) || eVar.i == null || (findViewById = eVar.i.findViewById(R.id.iv_back_to_top)) == null || findViewById.getVisibility() != 0) {
        } else {
            standardShopPageBlock.a();
        }
    }

    public StandardShopPageBlock(com.sankuai.waimai.store.goods.list.delegate.e eVar) {
        super(eVar.k());
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6622e5cd8e82da514d50f37b6c327aba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6622e5cd8e82da514d50f37b6c327aba");
            return;
        }
        this.g = true;
        this.h = 0;
        this.i = true;
        this.j = false;
        this.k = eVar;
        this.l = new HashMap();
        this.g = true;
        com.meituan.android.bus.a.a().a(this);
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b3f03336383a4dde4de22fac7164fb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b3f03336383a4dde4de22fac7164fb4");
            return;
        }
        super.onViewCreated();
        this.b = (FlashTab) findView(R.id.wm_sc_standard_shop_content_tab);
        this.c = (ViewPager) findView(R.id.wm_sc_standard_shop_content_pager);
        this.d = (ImageView) findView(R.id.wm_sc_standard_shop_content_to_top);
        this.b.setOnTabSelectedListener(new FlashTabLayout.b() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.StandardShopPageBlock.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
            public final void a(FlashTabLayout.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9c1f243eff1f7706c695fdd608ed7ce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9c1f243eff1f7706c695fdd608ed7ce");
                } else if (StandardShopPageBlock.this.f == null || eVar == null) {
                } else {
                    RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) StandardShopPageBlock.this.f.navigationBars, eVar.h);
                    if (bVar != null) {
                        if (!StandardShopPageBlock.this.g) {
                            com.sankuai.waimai.store.manager.judas.b.a(StandardShopPageBlock.this.k.k(), "b_waimai_sdv8t367_mc").a("poi_id", StandardShopPageBlock.this.k.d().d()).a("title", bVar.b).a("codes", Integer.valueOf(bVar.c)).a("type", Integer.valueOf(StandardShopPageBlock.this.h)).a("stid", StandardShopPageBlock.this.k.d().b.abExpInfo).a();
                        }
                        StandardShopPageBlock.a(StandardShopPageBlock.this, false);
                        StandardShopPageBlock.a(StandardShopPageBlock.this, 0);
                    }
                    StandardShopPageBlock.this.c.setCurrentItem(eVar.h);
                    StandardShopPageBlock.a(StandardShopPageBlock.this, eVar);
                }
            }

            @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
            public final void b(FlashTabLayout.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15e385887ef62c5e112b4beb76275788", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15e385887ef62c5e112b4beb76275788");
                } else if (StandardShopPageBlock.this.i) {
                } else {
                    StandardShopPageBlock.this.b.a(eVar.h, false);
                }
            }

            @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.b
            public final void c(FlashTabLayout.e eVar) {
                Object[] objArr2 = {eVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6658bfabbdf540b89d0b45cfa030714", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6658bfabbdf540b89d0b45cfa030714");
                } else {
                    StandardShopPageBlock.b(StandardShopPageBlock.this, eVar);
                }
            }
        });
        this.b.setRelationMove(true);
        this.c.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.StandardShopPageBlock.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26e5c66e841da9ad746315431ae63243", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26e5c66e841da9ad746315431ae63243");
                } else {
                    StandardShopPageBlock.this.b.a(i, f);
                }
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5b66006194138898030bf9484710b13", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5b66006194138898030bf9484710b13");
                } else {
                    StandardShopPageBlock.this.b.setSelectIndex(i);
                }
            }
        });
        this.e = new StandardShopPageAdapter(this.mContext, this.k, this.mContext instanceof FragmentActivity ? ((FragmentActivity) this.mContext).getSupportFragmentManager() : null);
        this.c.setAdapter(this.e);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.StandardShopPageBlock.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c953588b6366133a0bb05ed70ea99a24", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c953588b6366133a0bb05ed70ea99a24");
                } else {
                    StandardShopPageBlock.this.a();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b1e76ccc3b64bf6336ddf3835212ae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b1e76ccc3b64bf6336ddf3835212ae6");
            return;
        }
        this.k.e().fullScroll(33);
        this.k.e().scrollTo(0, 0);
        this.e.b(this.c.getCurrentItem());
    }

    @Override // com.sankuai.waimai.store.base.b
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcd522577dfe37da0a0c0f780b4b9c9f", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcd522577dfe37da0a0c0f780b4b9c9f") : layoutInflater.inflate(R.layout.wm_sc_shop_content_standard_page_block, viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(@NonNull RestMenuResponse restMenuResponse) {
        Context context;
        float f;
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3eb0741d4c2b6e6acdeaed5d37d8f34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3eb0741d4c2b6e6acdeaed5d37d8f34");
            return;
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) restMenuResponse.navigationBars);
        ArrayList arrayList = new ArrayList();
        String[] strArr = new String[a2];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < a2; i3++) {
            RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) restMenuResponse.navigationBars, i3);
            if (bVar != null && !TextUtils.isEmpty(bVar.b)) {
                strArr[i3] = bVar.f != null ? bVar.f.bubbleIcon : "";
                if (bVar.d) {
                    i = i3;
                }
                FlashTab.b bVar2 = new FlashTab.b();
                bVar2.b = a(restMenuResponse, bVar);
                bVar2.a = i2;
                if (bVar.f != null) {
                    bVar2.c = bVar.f.promotionSelectedPic;
                    bVar2.d = bVar.f.promotionUnselectedPic;
                    bVar2.g = 1;
                    if ((TextUtils.isEmpty(bVar.b) ? 0 : bVar.b.length()) > 2) {
                        context = this.mContext;
                        f = 74.0f;
                    } else {
                        context = this.mContext;
                        f = 45.0f;
                    }
                    bVar2.e = com.sankuai.shangou.stone.util.h.a(context, f);
                    bVar2.f = com.sankuai.shangou.stone.util.h.a(this.mContext, 6.0f);
                }
                arrayList.add(bVar2);
                i2++;
            }
        }
        final List<RestMenuResponse.b> list = restMenuResponse.navigationBars;
        this.b.setTabCreateListener(new FlashTabLayout.a() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.StandardShopPageBlock.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.view.standard.FlashTabLayout.a
            public final void a(View view, int i4) {
                Object[] objArr2 = {view, Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fc79fa43639c3f14acf6638778f1112", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fc79fa43639c3f14acf6638778f1112");
                } else if (StandardShopPageBlock.this.k.k() == null) {
                } else {
                    com.sankuai.waimai.store.expose.v2.entity.b bVar3 = (com.sankuai.waimai.store.expose.v2.entity.b) StandardShopPageBlock.this.l.get(view);
                    if (bVar3 == null) {
                        bVar3 = new com.sankuai.waimai.store.expose.v2.entity.b("b_waimai_sdv8t367_mv", view);
                        StandardShopPageBlock.this.l.put(view, bVar3);
                        com.sankuai.waimai.store.expose.v2.b.a().a(StandardShopPageBlock.this.k.k(), bVar3);
                    }
                    RestMenuResponse.b bVar4 = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i4);
                    if (bVar4 == null) {
                        return;
                    }
                    bVar3.e = i4 + CommonConstant.Symbol.UNDERLINE + bVar4.hashCode();
                    bVar3.a("poi_id", StandardShopPageBlock.this.k.d().d()).a("title", bVar4.b).a("codes", Integer.valueOf(bVar4.c)).a("stid", StandardShopPageBlock.this.k.d().b.abExpInfo);
                }
            }
        });
        if (restMenuResponse.getPoi() != null) {
            if (TextUtils.equals(restMenuResponse.getPoi().newStandardPage(), "D")) {
                com.sankuai.waimai.store.util.m.b("http://p0.meituan.net/scarlett/df189fd717f57f5c8d64ffa268697a85318.png").a(this.d);
            } else if (TextUtils.equals(restMenuResponse.getPoi().newStandardPage(), "E") || TextUtils.equals(restMenuResponse.getPoi().newStandardPage(), "F")) {
                this.i = false;
                this.b.setHasTabRightIcon(true);
            }
        }
        this.b.setTabs(arrayList);
        int c = com.sankuai.shangou.stone.util.a.c(strArr);
        for (int i4 = 0; i4 < c; i4++) {
            String str = (String) com.sankuai.shangou.stone.util.a.a(strArr, i4);
            if (!t.a(str)) {
                ImageView imageView = new ImageView(getContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.b.a(i4, true, imageView);
                com.sankuai.waimai.store.util.m.b(str, imageView, com.sankuai.shangou.stone.util.h.a(this.mContext, 17.0f));
            }
        }
        this.e.a(restMenuResponse);
        this.b.setSelectIndex(i);
        this.c.setCurrentItem(i);
        this.c.setOffscreenPageLimit(1);
    }

    private CharSequence a(@NonNull RestMenuResponse restMenuResponse, @NonNull RestMenuResponse.b bVar) {
        Object[] objArr = {restMenuResponse, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11096e346622ab6883728942228555d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11096e346622ab6883728942228555d9");
        }
        if (bVar.f == null) {
            return bVar.b;
        }
        if (bVar.c == 6 && restMenuResponse.is776AnchorStrategy()) {
            double d = this.k.d().b.score;
            if (d > 0.0d) {
                StringBuilder sb = new StringBuilder();
                sb.append(bVar.b);
                if (com.sankuai.shangou.stone.util.i.d(Double.valueOf(d), Double.valueOf(5.0d))) {
                    d = 5.0d;
                }
                sb.append(d);
                SpannableString spannableString = new SpannableString(sb.toString());
                int b = com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_858687);
                AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(com.sankuai.waimai.store.util.b.c(getContext(), R.dimen.wm_sc_common_dimen_textsize_12));
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(b);
                int length = bVar.b.length();
                int length2 = spannableString.length();
                spannableString.setSpan(absoluteSizeSpan, length, length2, 34);
                spannableString.setSpan(foregroundColorSpan, length, length2, 34);
                return spannableString;
            }
        } else if (!TextUtils.isEmpty(bVar.f.commentCount)) {
            SpannableString spannableString2 = new SpannableString(bVar.b + bVar.f.commentCount);
            int b2 = com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_BCBCBD);
            AbsoluteSizeSpan absoluteSizeSpan2 = new AbsoluteSizeSpan(com.sankuai.waimai.store.util.b.c(getContext(), R.dimen.wm_sc_common_dimen_textsize_11));
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(b2);
            SuperscriptSpan superscriptSpan = new SuperscriptSpan();
            int length3 = bVar.b.length();
            int length4 = spannableString2.length();
            spannableString2.setSpan(superscriptSpan, length3, length4, 34);
            spannableString2.setSpan(absoluteSizeSpan2, length3, length4, 34);
            spannableString2.setSpan(foregroundColorSpan2, length3, length4, 34);
            return spannableString2;
        }
        return bVar.b;
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f0a1394b986e989cb21b2978e00fc2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f0a1394b986e989cb21b2978e00fc2b");
        } else if (this.e != null) {
            StandardShopPageAdapter standardShopPageAdapter = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = StandardShopPageAdapter.b;
            if (PatchProxy.isSupport(objArr2, standardShopPageAdapter, changeQuickRedirect2, false, "57902adc658fe50636dd4b7937636307", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, standardShopPageAdapter, changeQuickRedirect2, false, "57902adc658fe50636dd4b7937636307");
                return;
            }
            int size = standardShopPageAdapter.d.size();
            for (int i = 0; i < size; i++) {
                com.sankuai.waimai.store.base.b valueAt = standardShopPageAdapter.d.valueAt(i);
                if (valueAt != null) {
                    valueAt.onResume();
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1c0380aee2bff6600cc84c59bb6be11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1c0380aee2bff6600cc84c59bb6be11");
            return;
        }
        if (this.c != null) {
            this.c.setAdapter(null);
        }
        if (this.e != null) {
            StandardShopPageAdapter standardShopPageAdapter = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = StandardShopPageAdapter.b;
            if (PatchProxy.isSupport(objArr2, standardShopPageAdapter, changeQuickRedirect2, false, "67079fc79eafe7b8d422cde235184495", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, standardShopPageAdapter, changeQuickRedirect2, false, "67079fc79eafe7b8d422cde235184495");
            } else {
                standardShopPageAdapter.a();
                standardShopPageAdapter.d.clear();
            }
        }
        com.meituan.android.bus.a.a().b(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAnchorSecondCategoryEvent(com.sankuai.waimai.store.coupons.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca63f6356f4f9a95ec1f524e0f220ba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca63f6356f4f9a95ec1f524e0f220ba9");
        } else if (aVar == null || TextUtils.isEmpty(aVar.a)) {
        } else {
            Object[] objArr2 = {0L};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a74e83b0d849577a550a73669991f93", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a74e83b0d849577a550a73669991f93")).booleanValue();
                return;
            }
            int d = this.e.d(5);
            if (d == -1) {
                return;
            }
            this.c.setCurrentItem(d);
            StandardShopPageAdapter standardShopPageAdapter = this.e;
            Object[] objArr3 = {new Long(0L)};
            ChangeQuickRedirect changeQuickRedirect3 = StandardShopPageAdapter.b;
            if (PatchProxy.isSupport(objArr3, standardShopPageAdapter, changeQuickRedirect3, false, "4b7d07e0fb20a6c76cdad4f4390e56bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, standardShopPageAdapter, changeQuickRedirect3, false, "4b7d07e0fb20a6c76cdad4f4390e56bb");
                return;
            }
            com.sankuai.waimai.store.base.b c = standardShopPageAdapter.c(5);
            if (c instanceof com.sankuai.waimai.store.goods.list.templet.newmarket.h) {
                com.sankuai.waimai.store.goods.list.templet.newmarket.h hVar = (com.sankuai.waimai.store.goods.list.templet.newmarket.h) c;
                Object[] objArr4 = {new Long(0L)};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.goods.list.templet.newmarket.h.a;
                if (PatchProxy.isSupport(objArr4, hVar, changeQuickRedirect4, false, "6c3e25fbabe34f6e7d1e947b38fb6c3e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, hVar, changeQuickRedirect4, false, "6c3e25fbabe34f6e7d1e947b38fb6c3e");
                } else {
                    hVar.b.a(0L);
                }
            }
        }
    }
}
