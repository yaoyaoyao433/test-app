package com.sankuai.waimai.store.drug.home.new_home.filter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.widgets.filterbar.home.model.SortItem;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends g<SortItem, e> {
    public static ChangeQuickRedirect a;
    View b;
    public com.sankuai.waimai.store.expose.v2.entity.b c;
    com.sankuai.waimai.store.param.a d;
    CategoryInfo e;
    private TextView f;
    private int g;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_drug_filter_bar_item;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(SortItem sortItem, final int i) {
        boolean z;
        final SortItem sortItem2 = sortItem;
        int i2 = 0;
        Object[] objArr = {sortItem2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ada7fb27e9900ebfbfa7e1c6b7ac4968", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ada7fb27e9900ebfbfa7e1c6b7ac4968");
            return;
        }
        this.e = ((e) this.o).c();
        boolean z2 = sortItem2.code == ((e) this.o).a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85e1408472b8fb8bdd4c21c4d341d4e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85e1408472b8fb8bdd4c21c4d341d4e1");
            z = z2;
        } else {
            Context context = this.f.getContext();
            int color = ContextCompat.getColor(context, R.color.wm_sg_color_575859);
            int color2 = ContextCompat.getColor(context, R.color.wm_sg_color_FFFFFF);
            int color3 = ContextCompat.getColor(context, R.color.wm_sg_color_FFE14D);
            int color4 = ContextCompat.getColor(context, R.color.wm_sg_color_FFC34D);
            int color5 = ContextCompat.getColor(context, R.color.wm_sg_color_222426);
            z = z2;
            this.f.setBackground(com.sankuai.waimai.store.util.e.a().a(new int[]{16842913}, new e.a().a(GradientDrawable.Orientation.BL_TR, new int[]{color3, color4}).a(h.a(context, 14.0f)).a()).a(new e.a().c(color2).a(h.a(context, 14.0f)).a()).b);
            this.f.setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[0]}, new int[]{color5, color}));
        }
        this.f.setText(sortItem2.name);
        final boolean z3 = z;
        this.f.setSelected(z3);
        this.f.getPaint().setFakeBoldText(z3);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.home.new_home.filter.f.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4b252d4dc2470b5ca0f2dd1498c5215a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4b252d4dc2470b5ca0f2dd1498c5215a");
                    return;
                }
                if (com.sankuai.waimai.store.manager.user.a.a().b()) {
                    ((e) f.this.o).a(sortItem2, !z3);
                } else {
                    com.sankuai.waimai.store.manager.user.a.a(view.getContext());
                }
                f fVar = f.this;
                SortItem sortItem3 = sortItem2;
                int i3 = i;
                Object[] objArr4 = {sortItem3, Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect4 = f.a;
                if (PatchProxy.isSupport(objArr4, fVar, changeQuickRedirect4, false, "c7602d45d2592cb68e5a0b7c213bee0b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, fVar, changeQuickRedirect4, false, "c7602d45d2592cb68e5a0b7c213bee0b");
                } else if (fVar.c == null || sortItem3 == null || fVar.e == null) {
                } else {
                    com.sankuai.waimai.store.manager.judas.b.a(TextUtils.isEmpty(fVar.d.G) ? "" : fVar.d.G, AppUtil.generatePageInfoKey(fVar.b.getContext()), "b_waimai_zpdapk6e_mc").a(AppUtil.generatePageInfoKey(fVar.b.getContext())).a("stid", TextUtils.isEmpty(fVar.d.T) ? "" : fVar.d.T).a("trace_id", TextUtils.isEmpty(fVar.d.aF) ? "" : fVar.d.aF).a("cat_id", Long.valueOf(fVar.d.c)).a("sec_cat_id", fVar.e.code).a("sec_cat_name", fVar.e.name).a("third_cat_id", Long.valueOf(sortItem3.code)).a("third_cat_name", sortItem3.name).a("index", Integer.valueOf(i3)).a();
                }
            }
        });
        if (this.b.getLayoutParams() instanceof RecyclerView.g) {
            RecyclerView.g gVar = (RecyclerView.g) this.b.getLayoutParams();
            gVar.leftMargin = i == 0 ? h.a(this.b.getContext(), 8.0f) : 0;
            if (i == this.g - 1 && this.g > 3) {
                i2 = h.a(this.b.getContext(), 50.0f);
            }
            gVar.rightMargin = i2;
            this.b.setLayoutParams(gVar);
        }
        if (this.c == null || this.d == null || this.e == null) {
            return;
        }
        com.sankuai.waimai.store.expose.v2.entity.b a2 = this.c.a("stid", TextUtils.isEmpty(this.d.T) ? "" : this.d.T).a("trace_id", TextUtils.isEmpty(this.d.aF) ? "" : this.d.aF).a("cat_id", Long.valueOf(this.d.c)).a("sec_cat_id", this.e.code).a("sec_cat_name", this.e.name).a("third_cat_id", Long.valueOf(sortItem2.code)).a("third_cat_name", sortItem2.name).a("index", Integer.valueOf(i));
        a2.e = "b_waimai_zpdapk6e_mv" + i;
    }

    public f(@NonNull e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9c5697d66441c0a180565b8f614a5ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9c5697d66441c0a180565b8f614a5ae");
            return;
        }
        this.o = eVar;
        this.g = i;
        this.d = ((e) this.o).b();
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33dc9573ee70ccc959247e083adc4f29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33dc9573ee70ccc959247e083adc4f29");
            return;
        }
        this.b = view;
        this.f = (TextView) view.findViewById(R.id.tv_filter_name);
        Context context = view.getContext();
        if (this.d == null || !(context instanceof com.sankuai.waimai.store.expose.v2.a)) {
            return;
        }
        this.c = new com.sankuai.waimai.store.expose.v2.entity.b(TextUtils.isEmpty(this.d.G) ? "" : this.d.G, "b_waimai_zpdapk6e_mv", AppUtil.generatePageInfoKey(view.getContext()), view);
        com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) context, this.c);
    }
}
