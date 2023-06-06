package com.sankuai.waimai.drug.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.drug.model.a;
import com.sankuai.waimai.store.drug.newwidgets.HorizontalFlowLayout;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.widgets.recycler.e;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends e {
    public static ChangeQuickRedirect a;
    public TextView b;
    public TextView c;
    public TextView d;
    public TextView e;
    public com.sankuai.waimai.drug.patch.adapter.a f;
    public List<GoodsSpu> g;
    com.sankuai.waimai.drug.patch.contract.a h;
    private RecyclerView i;
    private HorizontalFlowLayout j;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a k;

    public c(View view, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, com.sankuai.waimai.drug.patch.contract.a aVar2) {
        super(view);
        Object[] objArr = {view, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb37451cf7b54a4ef21632809c810236", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb37451cf7b54a4ef21632809c810236");
            return;
        }
        this.k = aVar;
        this.h = aVar2;
        this.i = (RecyclerView) view.findViewById(R.id.combination_layout_spu_list);
        view.setBackground(com.sankuai.waimai.store.util.e.b(view.getContext(), (int) R.color.wm_st_common_white, (int) R.dimen.wm_sc_common_dimen_12));
        this.f = new com.sankuai.waimai.drug.patch.adapter.a(this.k, this.h);
        this.i.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        this.i.setAdapter(this.f);
        this.b = (TextView) a(R.id.wm_st_shopcart_patchwork_layout_combination_buy);
        this.c = (TextView) a(R.id.wm_st_shopcart_patchwork_layout_combination_origin_price);
        this.d = (TextView) a(R.id.wm_st_shopcart_patchwork_layout_combination_price);
        this.e = (TextView) a(R.id.wm_st_shopcart_patchwork_layout_tag_detail);
        this.j = (HorizontalFlowLayout) a(R.id.wm_st_shopcart_patchwork_layout_tags);
        this.b.setBackground(com.sankuai.waimai.store.util.e.a(view.getContext(), new int[]{R.color.wm_st_common_theme_light, R.color.wm_st_common_FFC236}, (int) R.dimen.wm_sc_common_dimen_6));
        this.j.setVisibility(8);
    }

    public void a(com.sankuai.waimai.drug.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aba97595c43394efd5e927c81a02d3d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aba97595c43394efd5e927c81a02d3d4");
            return;
        }
        this.j.removeAllViews();
        Context context = this.itemView.getContext();
        int a2 = com.sankuai.shangou.stone.util.a.a((List) aVar.b);
        boolean z = false;
        for (int i = 0; i < a2; i++) {
            a.C0936a c0936a = aVar.b.get(i);
            if (c0936a != null && !TextUtils.isEmpty(c0936a.a)) {
                TextView textView = new TextView(context);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, h.a(context, 12.0f));
                textView.setTextSize(10.0f);
                textView.setTextColor(context.getResources().getColor(R.color.white));
                textView.setTypeface(Typeface.defaultFromStyle(1));
                textView.setBackground(com.sankuai.waimai.store.util.e.a(context, new int[]{R.color.wm_sg_color_FE9B5A, R.color.wm_sg_color_FE7235}, (int) R.dimen.wm_sc_common_dimen_4));
                int a3 = h.a(context, 1.0f);
                int a4 = h.a(context, 4.0f);
                textView.setLayoutParams(layoutParams);
                textView.setPadding(a4, a3, a4, a3);
                textView.setText(c0936a.a);
                this.j.addView(textView);
                z = true;
            }
        }
        if (z) {
            this.j.setVisibility(0);
        } else {
            this.j.setVisibility(8);
        }
    }

    public String b(com.sankuai.waimai.drug.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b19c1b1f6ee706d73d58dfeffa8b4b01", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b19c1b1f6ee706d73d58dfeffa8b4b01");
        }
        List<a.C0936a> list = aVar.b;
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return "";
        }
        for (a.C0936a c0936a : list) {
            if (c0936a != null && !TextUtils.isEmpty(c0936a.b)) {
                return c0936a.b;
            }
        }
        return "";
    }
}
