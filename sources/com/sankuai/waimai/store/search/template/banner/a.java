package com.sankuai.waimai.store.search.template.banner;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v4.internal.view.SupportMenu;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.adapterdelegates.b;
import com.sankuai.waimai.store.search.model.SearchPlatformStid;
import com.sankuai.waimai.store.search.model.SearchResultBanner;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.e;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b<SearchResultBanner, C1298a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1298a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f327173a4217c08db32f6186cf731fc", RobustBitConfig.DEFAULT_VALUE) ? (C1298a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f327173a4217c08db32f6186cf731fc") : new C1298a(layoutInflater.inflate(R.layout.wm_sc_nox_search_list_item_banner, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull SearchResultBanner searchResultBanner, @NonNull C1298a c1298a, int i) {
        final SearchResultBanner searchResultBanner2 = searchResultBanner;
        final C1298a c1298a2 = c1298a;
        Object[] objArr = {searchResultBanner2, c1298a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "461d3a6b1d0c20c1ab35eb5672526431", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "461d3a6b1d0c20c1ab35eb5672526431");
            return;
        }
        Object[] objArr2 = {searchResultBanner2};
        ChangeQuickRedirect changeQuickRedirect2 = C1298a.a;
        if (PatchProxy.isSupport(objArr2, c1298a2, changeQuickRedirect2, false, "78ac8f20440fb8f38c56288b92ac233e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c1298a2, changeQuickRedirect2, false, "78ac8f20440fb8f38c56288b92ac233e");
        } else if (searchResultBanner2 != null) {
            c1298a2.a(c1298a2.j);
            c1298a2.n.put("keyword", c1298a2.o.h);
            c1298a2.n.put("cat_id", Integer.valueOf(c1298a2.o.z));
            c1298a2.n.put("search_log_id", c1298a2.o.b(searchResultBanner2));
            c1298a2.n.put("search_global_id", c1298a2.o.r);
            c1298a2.n.put("stid", g.f(c1298a2.o));
            c1298a2.n.put("service_type", searchResultBanner2.hitResultType);
            c1298a2.n.put("template_type", Integer.valueOf(c1298a2.o.D));
            c1298a2.n.put("search_source", Integer.valueOf(c1298a2.o.aw));
            c1298a2.n.put("index", Integer.valueOf(searchResultBanner2.getStatisticsIndex()));
            SearchPlatformStid searchPlatformStid = searchResultBanner2.searchPlatformStid;
            if (searchPlatformStid != null) {
                c1298a2.n.put("content_id", TextUtils.isEmpty(searchPlatformStid.contentId) ? "-999" : searchPlatformStid.contentId);
                c1298a2.n.put("template_id", Integer.valueOf(searchPlatformStid.templateId));
                c1298a2.n.put(NetLogConstants.Details.CONTENT_TYPE, Integer.valueOf(searchPlatformStid.contentType == 0 ? 2 : searchPlatformStid.contentType));
                c1298a2.n.put("content_tag", TextUtils.isEmpty(searchPlatformStid.contentTag) ? "-999" : searchPlatformStid.contentTag);
            } else {
                c1298a2.n.put("content_id", "-999");
                c1298a2.n.put("template_id", "-999");
                c1298a2.n.put(NetLogConstants.Details.CONTENT_TYPE, "-999");
                c1298a2.n.put("content_tag", "-999");
            }
            if (!searchResultBanner2.isExposed) {
                com.sankuai.waimai.store.manager.judas.b.b("c_nfqbfvw", "b_waimai_j9pvljst_mv").b(c1298a2.n).a();
                searchResultBanner2.isExposed = true;
            }
            Object[] objArr3 = {searchResultBanner2};
            ChangeQuickRedirect changeQuickRedirect3 = C1298a.a;
            if (PatchProxy.isSupport(objArr3, c1298a2, changeQuickRedirect3, false, "f110bb53aaecb5601f80709f99bd9172", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, c1298a2, changeQuickRedirect3, false, "f110bb53aaecb5601f80709f99bd9172");
            } else {
                int a2 = com.sankuai.waimai.foundation.utils.g.a(c1298a2.b, 10.0f);
                int a3 = com.sankuai.waimai.foundation.utils.g.a(c1298a2.b, 12.0f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1298a2.i.getLayoutParams();
                if (!searchResultBanner2.searchNoResult() || (TextUtils.isEmpty(searchResultBanner2.channelIconUrl) && TextUtils.isEmpty(searchResultBanner2.channelName) && TextUtils.isEmpty(searchResultBanner2.channelScheme) && TextUtils.isEmpty(searchResultBanner2.channelSchemeDesc))) {
                    c1298a2.c.setVisibility(8);
                    c1298a2.j.setVisibility(8);
                    marginLayoutParams.leftMargin = a3;
                    marginLayoutParams.topMargin = a3;
                    marginLayoutParams.rightMargin = a3;
                    marginLayoutParams.bottomMargin = a3 / 2;
                } else {
                    c1298a2.c.setVisibility(0);
                    c1298a2.j.setVisibility(0);
                    marginLayoutParams.leftMargin = a3;
                    marginLayoutParams.topMargin = a2;
                    marginLayoutParams.rightMargin = a3;
                    marginLayoutParams.bottomMargin = a3;
                }
            }
            if (TextUtils.isEmpty(searchResultBanner2.channelIconUrl)) {
                c1298a2.d.setVisibility(8);
            } else {
                c1298a2.d.setVisibility(0);
                b.C0608b a4 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a4.b = c1298a2.b;
                a4.c = searchResultBanner2.channelIconUrl;
                a4.h = new b.c() { // from class: com.sankuai.waimai.store.search.template.banner.a.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "348cc8300bc86dcf74086b11df969fe2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "348cc8300bc86dcf74086b11df969fe2");
                        } else {
                            u.a(C1298a.this.d);
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void b() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5a125b1dde107f40532fc1aaffb44e8d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5a125b1dde107f40532fc1aaffb44e8d");
                        } else {
                            u.c(C1298a.this.d);
                        }
                    }
                };
                a4.a(c1298a2.d);
            }
            c1298a2.e.setVisibility(TextUtils.isEmpty(searchResultBanner2.channelName) ? 8 : 0);
            c1298a2.e.setText(searchResultBanner2.channelName);
            c1298a2.f.setVisibility((TextUtils.isEmpty(searchResultBanner2.channelSchemeDesc) || TextUtils.isEmpty(searchResultBanner2.channelScheme)) ? 8 : 0);
            c1298a2.f.setText(searchResultBanner2.channelSchemeDesc);
            c1298a2.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.banner.a.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "26e1ac87b2ffde23775f3b70273acf2e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "26e1ac87b2ffde23775f3b70273acf2e");
                        return;
                    }
                    if (!TextUtils.isEmpty(searchResultBanner2.channelScheme)) {
                        d.a(C1298a.this.b, searchResultBanner2.channelScheme);
                    }
                    com.sankuai.waimai.store.manager.judas.b.a("c_nfqbfvw", "b_waimai_zsbn6fks_mc").b(C1298a.this.n).a();
                }
            });
            c1298a2.i.setVisibility(TextUtils.isEmpty(searchResultBanner2.bannerPicUrl) ? 8 : 0);
            if (TextUtils.isEmpty(searchResultBanner2.subscriptIcon)) {
                c1298a2.h.setVisibility(8);
            } else {
                c1298a2.h.setVisibility(0);
                c1298a2.h.setText(searchResultBanner2.subscriptIcon);
                c1298a2.h.setBackground(new e.a().c(ContextCompat.getColor(c1298a2.b, R.color.wm_sc_nox_search_color_20000000)).b(1).a(c1298a2.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_6), 0.0f, c1298a2.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12), 0.0f).a());
            }
            c1298a2.g.setAdjustViewBounds(true);
            c1298a2.g.setScaleType(ImageView.ScaleType.FIT_XY);
            b.C0608b a5 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a5.b = c1298a2.b;
            a5.c = searchResultBanner2.bannerPicUrl;
            a5.i = R.drawable.wm_sc_nox_search_banner_default;
            a5.j = R.drawable.wm_sc_nox_search_banner_default;
            a5.a(c1298a2.g);
            c1298a2.g.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.banner.a.a.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "01ba115204bc31598c1fff23a13028da", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "01ba115204bc31598c1fff23a13028da");
                        return;
                    }
                    if (!TextUtils.isEmpty(searchResultBanner2.bannerPicScheme)) {
                        d.a(C1298a.this.b, searchResultBanner2.bannerPicScheme);
                    }
                    com.sankuai.waimai.store.manager.judas.b.a("c_nfqbfvw", "b_waimai_r0m7sme0_mc").b(C1298a.this.n).a();
                }
            });
            c1298a2.k.setVisibility(TextUtils.isEmpty(searchResultBanner2.hightRiskDurgName) ? 8 : 0);
            c1298a2.k.setText(searchResultBanner2.hightRiskDurgName);
            c1298a2.l.setVisibility(TextUtils.isEmpty(searchResultBanner2.highRiskCategory) ? 8 : 0);
            c1298a2.l.setText(searchResultBanner2.highRiskCategory);
            c1298a2.l.setTextColor(ColorUtils.a(searchResultBanner2.highRiskTextColor, -1));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(com.sankuai.waimai.foundation.utils.g.a(c1298a2.b, 4.0f));
            gradientDrawable.setColor(ColorUtils.a(searchResultBanner2.highRiskBackgroundColor, ColorUtils.a("#FE6D27", (int) SupportMenu.CATEGORY_MASK)));
            c1298a2.l.setBackground(gradientDrawable);
            c1298a2.m.setVisibility(TextUtils.isEmpty(searchResultBanner2.highRiskDrugDesc) ? 8 : 0);
            c1298a2.m.setText(searchResultBanner2.highRiskDrugDesc);
        }
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8716d5367759050153fbf1acf43564f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8716d5367759050153fbf1acf43564f3");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f95a832929541fe685eeb679be564c8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f95a832929541fe685eeb679be564c8")).booleanValue() : str.equals("new_wm_search_direct_card");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.banner.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1298a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        Context b;
        ViewGroup c;
        ImageView d;
        TextView e;
        TextView f;
        ImageView g;
        TextView h;
        View i;
        ViewGroup j;
        TextView k;
        TextView l;
        TextView m;
        Map<String, Object> n;
        SearchShareData o;
        private View p;

        public C1298a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f2dc947cebc0fca504aae552293bf05", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f2dc947cebc0fca504aae552293bf05");
                return;
            }
            this.n = new HashMap();
            this.p = view;
            this.b = this.p.getContext();
            this.c = (ViewGroup) view.findViewById(R.id.search_list_item_layout_top);
            this.d = (ImageView) view.findViewById(R.id.search_banner_channel_icon);
            this.e = (TextView) view.findViewById(R.id.search_banner_channel_name);
            this.f = (TextView) view.findViewById(R.id.search_banner_channel_link);
            this.g = (ImageView) view.findViewById(R.id.search_banner_image);
            this.h = (TextView) view.findViewById(R.id.search_banner_iv_ad);
            this.i = view.findViewById(R.id.search_banner_img_container);
            this.j = (ViewGroup) view.findViewById(R.id.search_list_item_layout_bottom);
            this.k = (TextView) view.findViewById(R.id.high_risk_drug_name);
            this.l = (TextView) view.findViewById(R.id.high_risk_drug_category);
            this.m = (TextView) view.findViewById(R.id.high_risk_drug_desc);
            this.o = SearchShareData.a(this.b);
        }

        void a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ba8c61dc834f10742df1da66f44662e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ba8c61dc834f10742df1da66f44662e");
                return;
            }
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt);
                } else {
                    childAt.forceLayout();
                }
            }
        }
    }
}
