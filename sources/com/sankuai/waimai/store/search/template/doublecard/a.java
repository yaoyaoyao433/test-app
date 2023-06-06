package com.sankuai.waimai.store.search.template.doublecard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
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
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.adapterdelegates.b;
import com.sankuai.waimai.store.search.model.PicElement;
import com.sankuai.waimai.store.search.model.SearchResultBanner;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b<SearchResultBanner, C1302a> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1302a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5246b58dcae6fbdf7f157e0e3e6f1e55", RobustBitConfig.DEFAULT_VALUE) ? (C1302a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5246b58dcae6fbdf7f157e0e3e6f1e55") : new C1302a(layoutInflater.inflate(R.layout.wm_sc_nox_search_list_item_double_card_banner, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull SearchResultBanner searchResultBanner, @NonNull C1302a c1302a, int i) {
        final SearchResultBanner searchResultBanner2 = searchResultBanner;
        final C1302a c1302a2 = c1302a;
        Object[] objArr = {searchResultBanner2, c1302a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f64007db5597dd7ea3c7396e24dd170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f64007db5597dd7ea3c7396e24dd170");
            return;
        }
        Object[] objArr2 = {searchResultBanner2};
        ChangeQuickRedirect changeQuickRedirect2 = C1302a.a;
        if (PatchProxy.isSupport(objArr2, c1302a2, changeQuickRedirect2, false, "6fb6ab4b5ef38ef0160715e5c7785a28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c1302a2, changeQuickRedirect2, false, "6fb6ab4b5ef38ef0160715e5c7785a28");
        } else if (searchResultBanner2 != null) {
            if (com.sankuai.shangou.stone.util.a.a((List) searchResultBanner2.picElementList) >= 2) {
                c1302a2.a(c1302a2.g, searchResultBanner2.picElementList, 0);
                c1302a2.a(c1302a2.h, searchResultBanner2.picElementList, 1);
            } else {
                ViewGroup.LayoutParams layoutParams = c1302a2.c.getLayoutParams();
                layoutParams.height = 0;
                c1302a2.c.setLayoutParams(layoutParams);
            }
            c1302a2.j.put("cat_id", Integer.valueOf(c1302a2.k.z));
            c1302a2.j.put("search_log_id", c1302a2.k.b(searchResultBanner2));
            c1302a2.j.put("stid", g.f(c1302a2.k));
            c1302a2.j.put("template_type", Integer.valueOf(c1302a2.k.D));
            c1302a2.j.put("index", Integer.valueOf(searchResultBanner2.getStatisticsIndex()));
            c1302a2.j.put("keyword", c1302a2.k.h);
            c1302a2.j.put("search_source", Integer.valueOf(c1302a2.k.aw));
            c1302a2.j.put("search_global_id", c1302a2.k.r);
            if (searchResultBanner2.searchPlatformStid != null) {
                c1302a2.j.put("content_id", TextUtils.isEmpty(searchResultBanner2.searchPlatformStid.contentId) ? "-999" : searchResultBanner2.searchPlatformStid.contentId);
                c1302a2.j.put(NetLogConstants.Details.CONTENT_TYPE, Integer.valueOf(searchResultBanner2.searchPlatformStid.contentType != 0 ? searchResultBanner2.searchPlatformStid.contentType : 2));
                c1302a2.j.put("content_tag", TextUtils.isEmpty(searchResultBanner2.searchPlatformStid.contentTag) ? "-999" : searchResultBanner2.searchPlatformStid.contentTag);
                c1302a2.j.put("template_id", Integer.valueOf(searchResultBanner2.searchPlatformStid.templateId));
            } else {
                c1302a2.j.put("content_id", "-999");
                c1302a2.j.put(NetLogConstants.Details.CONTENT_TYPE, "-999");
                c1302a2.j.put("content_tag", "-999");
            }
            if (!searchResultBanner2.isExposed) {
                com.sankuai.waimai.store.manager.judas.b.b("c_nfqbfvw", "b_waimai_sg_v683na93_mv").b(c1302a2.j).a();
                searchResultBanner2.isExposed = true;
            }
            if (TextUtils.isEmpty(searchResultBanner2.channelIconUrl)) {
                c1302a2.d.setVisibility(8);
            } else {
                c1302a2.d.setVisibility(0);
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = c1302a2.b;
                a2.c = searchResultBanner2.channelIconUrl;
                a2.h = new b.c() { // from class: com.sankuai.waimai.store.search.template.doublecard.a.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2e073b9ce41d18aafdad5e1c3948313a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2e073b9ce41d18aafdad5e1c3948313a");
                        } else {
                            u.a(C1302a.this.d);
                        }
                    }

                    @Override // com.sankuai.meituan.mtimageloader.config.b.c
                    public final void b() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2dafbe5ed3e7c437284036397de259d6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2dafbe5ed3e7c437284036397de259d6");
                        } else {
                            u.c(C1302a.this.d);
                        }
                    }
                };
                a2.a(c1302a2.d);
            }
            c1302a2.e.setVisibility(TextUtils.isEmpty(searchResultBanner2.channelName) ? 8 : 0);
            c1302a2.e.setText(searchResultBanner2.channelName);
            c1302a2.f.setVisibility((TextUtils.isEmpty(searchResultBanner2.channelSchemeDesc) || TextUtils.isEmpty(searchResultBanner2.channelScheme)) ? 8 : 0);
            c1302a2.f.setText(searchResultBanner2.channelSchemeDesc);
            c1302a2.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.doublecard.a.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c7c6d1e7547ada6046813260457bba27", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c7c6d1e7547ada6046813260457bba27");
                        return;
                    }
                    if (!TextUtils.isEmpty(searchResultBanner2.channelScheme)) {
                        d.a(C1302a.this.b, searchResultBanner2.channelScheme);
                    }
                    com.sankuai.waimai.store.manager.judas.b.a("c_nfqbfvw", "b_waimai_sg_lgupb9ik_mc").b(C1302a.this.j).a();
                }
            });
            if (TextUtils.isEmpty(searchResultBanner2.subscriptIcon)) {
                c1302a2.i.setVisibility(8);
                return;
            }
            c1302a2.i.setVisibility(0);
            c1302a2.i.setText(searchResultBanner2.subscriptIcon);
            c1302a2.i.setBackground(new e.a().c(ContextCompat.getColor(c1302a2.b, R.color.wm_sc_nox_search_color_25000000)).b(1).a(c1302a2.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_8), 0.0f, c1302a2.b.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_8), 0.0f).a());
        }
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22aadc0d11e7ab3bcc7b760271f9323c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22aadc0d11e7ab3bcc7b760271f9323c");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b18dc348a255137a2cbb1fe759ca1a2f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b18dc348a255137a2cbb1fe759ca1a2f")).booleanValue() : str.equals("sg_search_double_card_business_directcard");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.doublecard.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1302a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        Context b;
        View c;
        ImageView d;
        TextView e;
        TextView f;
        UniversalImageView g;
        UniversalImageView h;
        TextView i;
        Map<String, Object> j;
        SearchShareData k;
        private View l;
        private int m;

        public C1302a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7672d7456976bb8589e94ce6d6afe105", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7672d7456976bb8589e94ce6d6afe105");
                return;
            }
            this.j = new HashMap();
            this.m = 0;
            this.l = view;
            this.b = this.l.getContext();
            this.c = view.findViewById(R.id.search_banner_fl_main);
            this.d = (ImageView) view.findViewById(R.id.search_banner_channel_icon);
            this.e = (TextView) view.findViewById(R.id.search_banner_channel_name);
            this.f = (TextView) view.findViewById(R.id.search_banner_channel_link);
            this.g = (UniversalImageView) view.findViewById(R.id.search_banner_image);
            this.h = (UniversalImageView) view.findViewById(R.id.search_banner_image2);
            this.i = (TextView) view.findViewById(R.id.search_banner_iv_ad);
            this.k = SearchShareData.a(this.b);
        }

        void a(UniversalImageView universalImageView, List<PicElement> list, final int i) {
            final PicElement picElement;
            Object[] objArr = {universalImageView, list, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4868e8e6ab517df6bd332653e0409d69", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4868e8e6ab517df6bd332653e0409d69");
                return;
            }
            universalImageView.setCornerRadius(h.a(this.b, 8.0f));
            if (list == null || list.size() <= i || (picElement = list.get(i)) == null || TextUtils.isEmpty(picElement.scheme) || TextUtils.isEmpty(picElement.pic)) {
                return;
            }
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.b;
            a2.c = picElement.pic;
            a2.i = R.drawable.wm_sc_nox_search_product_label_rank_default_icon;
            a2.j = R.drawable.wm_sc_nox_search_product_label_rank_default_icon;
            a2.a((ImageView) universalImageView);
            universalImageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.doublecard.a.a.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "879c89b322a4441178333c205732e124", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "879c89b322a4441178333c205732e124");
                        return;
                    }
                    if (i == 0) {
                        com.sankuai.waimai.store.manager.judas.b.a("c_nfqbfvw", "b_waimai_sg_x3km01lg_mc").b(C1302a.this.j).a();
                    } else if (i == 1) {
                        com.sankuai.waimai.store.manager.judas.b.a("c_nfqbfvw", "b_waimai_sg_kv0lkgqj_mc").b(C1302a.this.j).a();
                    }
                    d.a(C1302a.this.b, picElement.scheme);
                }
            });
        }
    }
}
