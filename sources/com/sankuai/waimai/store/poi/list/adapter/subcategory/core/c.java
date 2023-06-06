package com.sankuai.waimai.store.poi.list.adapter.subcategory.core;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.config.m;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.c;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.widgets.recycler.e;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.poi.list.adapter.subcategory.core.a<a> {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.store.param.a b;
    int c;
    Context d;
    int e;
    com.sankuai.waimai.store.poi.list.adapter.subcategory.a f;
    com.sankuai.waimai.store.poi.list.adapter.subcategory.b g;
    private List<CategoryInfo> h;
    private boolean i;
    private int j;

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        return 0;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final /* synthetic */ void a(e eVar, final int i) {
        GradientDrawable gradientDrawable;
        final a aVar = (a) eVar;
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "029090de74680f1898657d2c244d2403", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "029090de74680f1898657d2c244d2403");
            return;
        }
        final CategoryInfo categoryInfo = (CategoryInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) this.h, i);
        if (categoryInfo == null) {
            return;
        }
        Object[] objArr2 = {categoryInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d5f9aaf76d83723c88e17c0962ffce77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d5f9aaf76d83723c88e17c0962ffce77");
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) aVar.b.getLayoutParams();
        layoutParams.height = h.a(c.this.d, 45.0f);
        aVar.b.setGravity(80);
        aVar.b.setLayoutParams(layoutParams);
        aVar.g.setVisibility(8);
        aVar.f.setVisibility(8);
        if (c.this.f != null) {
            aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.poi.list.adapter.subcategory.core.c.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b4583252021077c8dbc6be12cd1878fa", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b4583252021077c8dbc6be12cd1878fa");
                    } else if (c.this.f != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("notice_type", Integer.valueOf(categoryInfo.tagIconType));
                        hashMap.put("template_type", Integer.valueOf(categoryInfo.template_code));
                        hashMap.put("index", Integer.valueOf(i));
                        hashMap.put("stid", c.this.b.c());
                        c.this.f.a(a.this.itemView, i, hashMap);
                    }
                }
            });
        }
        aVar.g.getLayoutParams().width = c.this.g.k;
        if (c.this.e == i) {
            aVar.c.setVisibility(0);
            aVar.e.setTextColor(c.this.g.e);
            aVar.e.setTextSize(c.this.g.c);
            u.a(aVar.e, true);
            if (c.this.g.m != null) {
                aVar.g.setBackground(c.this.g.m);
            } else {
                aVar.g.setBackgroundColor(c.this.g.l);
            }
            aVar.d.setBackground(c.this.g.n);
            aVar.f.setTextColor(c.this.g.j);
            if (m.a()) {
                gradientDrawable = (GradientDrawable) new e.a().a(GradientDrawable.Orientation.TL_BR, new int[]{c.this.g.g, c.this.g.h}).a(c.this.d.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10)).a();
            } else {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(c.this.d.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_10));
                gradientDrawable.setColor(c.this.g.e);
            }
            aVar.f.setBackground(gradientDrawable);
        } else {
            aVar.c.setVisibility(8);
            aVar.e.setTextColor(c.this.g.d);
            aVar.e.setTextSize(c.this.g.b);
            u.a(aVar.e, false);
            aVar.g.setBackgroundColor(com.sankuai.waimai.store.util.b.b(c.this.d, R.color.transparent));
            aVar.d.setBackground(ContextCompat.getDrawable(c.this.d, R.drawable.wm_st_poi_list_category_normal_bg));
            aVar.f.setTextColor(com.sankuai.waimai.store.util.b.b(c.this.d, R.color.wm_sg_color_999999));
            aVar.f.setBackgroundResource(R.color.wm_st_common_transparent);
        }
        TextView textView = aVar.e;
        String str = categoryInfo.name;
        Object[] objArr3 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "cf04b427b5dae12853de7902b421bd6a", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "cf04b427b5dae12853de7902b421bd6a");
        } else if (!TextUtils.isEmpty(str) && str.length() > 5) {
            str = str.substring(0, 4) + "...";
        }
        textView.setText(str);
        aVar.f.setText(categoryInfo.subName);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.rightMargin = 0;
        int a2 = h.a(c.this.d, 16.0f);
        int a3 = h.a(c.this.d, 23.0f);
        if (i == c.this.c - 1) {
            marginLayoutParams.leftMargin = a3;
            marginLayoutParams.rightMargin = a2;
        } else if (i == 0) {
            marginLayoutParams.leftMargin = a2;
        } else {
            marginLayoutParams.leftMargin = a3;
        }
        aVar.h.setLayoutParams(marginLayoutParams);
        u.c(aVar.d);
        View view = aVar.itemView;
        Object[] objArr4 = {view, categoryInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect4 = a.a;
        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "7dfd9cbee323b823ec4fc3edb615cb5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "7dfd9cbee323b823ec4fc3edb615cb5b");
        } else if (view != null && categoryInfo != null && (c.this.d instanceof com.sankuai.waimai.store.expose.v2.a)) {
            com.sankuai.waimai.store.expose.v2.entity.b a4 = com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) c.this.d, view);
            if (a4 == null) {
                a4 = new com.sankuai.waimai.store.expose.v2.entity.c("b_y8flufhi", view);
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) c.this.d, a4);
            } else {
                a4.g();
            }
            a4.e = "TabGrid" + c.this.b.c + String.valueOf(categoryInfo.code);
            a4.a("cat_id", Long.valueOf(c.this.b.c));
            a4.a("sec_cate_id", String.valueOf(categoryInfo.code));
            a4.a("notice_type", Integer.valueOf(categoryInfo.tagIconType));
            a4.a("stid", c.this.b.c());
            a4.a("media_type", 1);
            a4.a("template_type", Integer.valueOf(categoryInfo.template_code));
            a4.a("index", Integer.valueOf(i));
            a4.a("entry_type", Integer.valueOf(c.this.b.aS ? 1 : 0));
        }
        aVar.h.setVisibility(0);
    }

    public c(com.sankuai.waimai.store.param.a aVar, @NonNull c.a aVar2, Context context, int i) {
        Object[] objArr = {aVar, aVar2, context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0900228ece6bfda6c3e7055ce7d51dff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0900228ece6bfda6c3e7055ce7d51dff");
            return;
        }
        this.i = false;
        this.b = aVar;
        this.h = aVar2.a;
        this.c = a(aVar2.a);
        this.d = context;
        this.e = i;
        this.j = aVar2.c;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63c654d147cb44ac182cb4678dc6341b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63c654d147cb44ac182cb4678dc6341b")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.h);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final com.sankuai.waimai.store.widgets.recycler.e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "530f56e90b96bcaf50ecaea34966ec5e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.widgets.recycler.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "530f56e90b96bcaf50ecaea34966ec5e") : new a(LayoutInflater.from(this.d).inflate(R.layout.wm_st_common_layout_tab_layout_item, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.core.a
    public final void a(com.sankuai.waimai.store.poi.list.adapter.subcategory.a aVar) {
        this.f = aVar;
    }

    @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.core.a
    public final void a(com.sankuai.waimai.store.poi.list.model.b bVar) {
        com.sankuai.waimai.store.poi.list.adapter.subcategory.b bVar2;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a6d4f4812cbf9388ec38801ccd4acdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a6d4f4812cbf9388ec38801ccd4acdf");
            return;
        }
        Context context = this.d;
        PoiChannelBackgroundConfig poiChannelBackgroundConfig = bVar.a;
        PoiVerticalityDataResponse.Promotion promotion = bVar.d;
        boolean z = this.b.Y;
        Object[] objArr2 = {context, poiChannelBackgroundConfig, promotion, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.adapter.subcategory.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ea9fd06fca17bd88cf95f090c5a509b4", RobustBitConfig.DEFAULT_VALUE)) {
            bVar2 = (com.sankuai.waimai.store.poi.list.adapter.subcategory.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ea9fd06fca17bd88cf95f090c5a509b4");
        } else {
            com.sankuai.waimai.store.poi.list.adapter.subcategory.b bVar3 = new com.sankuai.waimai.store.poi.list.adapter.subcategory.b();
            bVar3.b = 16;
            bVar3.c = 22;
            bVar3.d = context.getResources().getColor(R.color.wm_sg_color_222426);
            bVar3.e = bVar3.d;
            bVar3.k = context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_20);
            bVar3.l = d.a(poiChannelBackgroundConfig == null ? null : poiChannelBackgroundConfig.iconSelectedFontColor, com.sankuai.waimai.store.util.b.b(context, R.color.wm_sg_color_FF9900));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(bVar3.l);
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_1);
            float f = dimensionPixelOffset * 2;
            float f2 = dimensionPixelOffset;
            gradientDrawable.setCornerRadii(new float[]{f, f, f, f, f2, f2, f2, f2});
            bVar3.m = gradientDrawable;
            if (poiChannelBackgroundConfig != null) {
                Integer a2 = d.a(poiChannelBackgroundConfig.iconSelectedColorFrm);
                Integer a3 = d.a(poiChannelBackgroundConfig.iconSelectedColorTo);
                if (a2 != null && a3 != null) {
                    bVar3.n = com.sankuai.waimai.store.util.e.a(context, new int[]{a2.intValue(), a3.intValue()}, R.dimen.wm_sc_common_dimen_30, GradientDrawable.Orientation.TOP_BOTTOM);
                }
            }
            bVar3.b = 16;
            bVar3.c = 22;
            bVar3.d = context.getResources().getColor(R.color.wm_sg_color_222426);
            bVar3.e = d.a(poiChannelBackgroundConfig == null ? null : poiChannelBackgroundConfig.iconSelectedFontColor, bVar3.d);
            bVar3.o = true;
            bVar3.p = false;
            bVar3.q = true;
            if (poiChannelBackgroundConfig != null) {
                bVar3.g = d.a(poiChannelBackgroundConfig.subCateTextSelectedBgColorFrm, -26367);
                bVar3.h = d.a(poiChannelBackgroundConfig.subCateTextSelectedBgColorTo, -32256);
                if (!TextUtils.isEmpty(poiChannelBackgroundConfig.subCatIndicatorUrl)) {
                    bVar3.r = poiChannelBackgroundConfig.subCatIndicatorUrl;
                }
            }
            if (promotion != null) {
                com.sankuai.waimai.store.poi.list.adapter.subcategory.b.a(promotion, z, bVar3, true);
            }
            bVar2 = bVar3;
        }
        this.g = bVar2;
        this.i = bVar.b;
    }

    @Override // com.sankuai.waimai.store.poi.list.adapter.subcategory.core.a
    public final void a(List<CategoryInfo> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0162c1953df880589fe116c58e6225e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0162c1953df880589fe116c58e6225e0");
            return;
        }
        this.e = i;
        this.c = a(list);
        this.h = list;
        m();
    }

    private int a(List<CategoryInfo> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50726040b1e04cbd1d0900cc6027f8f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50726040b1e04cbd1d0900cc6027f8f8")).intValue();
        }
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends com.sankuai.waimai.store.widgets.recycler.e {
        public static ChangeQuickRedirect a;
        public LinearLayout b;
        public ImageView c;
        public ImageView d;
        public TextView e;
        public TextView f;
        public View g;
        public View h;

        public a(View view) {
            super(view);
            Object[] objArr = {c.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df9450afdc4ad9d61017a541fc1cf4b9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df9450afdc4ad9d61017a541fc1cf4b9");
                return;
            }
            this.b = (LinearLayout) view.findViewById(R.id.ll_tablayout_item_desc);
            this.c = (ImageView) view.findViewById(R.id.iv_flower_sub_selected);
            this.d = (ImageView) view.findViewById(R.id.iv_poi_tab_image);
            this.e = (TextView) view.findViewById(R.id.tv_tablayout_item_name);
            this.f = (TextView) view.findViewById(R.id.tv_tablayout_item_describe);
            View findViewById = view.findViewById(R.id.v_tablayout_item_indicator);
            this.h = view.findViewById(R.id.rl_tab_layout_root);
            View findViewById2 = view.findViewById(R.id.v_tablayout_item_indicator_short);
            u.c(findViewById);
            u.a(findViewById2);
            this.g = findViewById2;
        }
    }
}
