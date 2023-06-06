package com.sankuai.waimai.store.search.template.brand;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.search.adapterdelegates.b;
import com.sankuai.waimai.store.search.model.g;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.RoundedCornerImageView;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends b<g, C1299a> {
    public static ChangeQuickRedirect a;
    Map<String, Object> b;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1299a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4d7cd85f44f55e9b0d56710faa2bebd", RobustBitConfig.DEFAULT_VALUE) ? (C1299a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4d7cd85f44f55e9b0d56710faa2bebd") : new C1299a(layoutInflater.inflate(R.layout.wm_sc_nox_search_sg_model_card_item, viewGroup, false));
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull g gVar, @NonNull C1299a c1299a, int i) {
        final g gVar2 = gVar;
        C1299a c1299a2 = c1299a;
        Object[] objArr = {gVar2, c1299a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7de5a54031b7105bf6111139ba690abf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7de5a54031b7105bf6111139ba690abf");
            return;
        }
        Object[] objArr2 = {c1299a2, gVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "431a74bc0e1abc0de89943bdca8e6934", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "431a74bc0e1abc0de89943bdca8e6934");
        } else if (gVar2 != null) {
            if (this.k != null && this.k.getResources() != null) {
                if (!TextUtils.isEmpty(gVar2.f)) {
                    b.C0608b a2 = m.a(gVar2.f);
                    a2.b = this.k;
                    a2.l = true;
                    a2.e = 1;
                    a2.a(c1299a2.b);
                }
                if (!TextUtils.isEmpty(gVar2.j)) {
                    b.C0608b a3 = m.a(gVar2.j);
                    a3.b = this.k;
                    a3.l = true;
                    a3.e = 1;
                    a3.a((ImageView) c1299a2.c);
                }
                if (!TextUtils.isEmpty(gVar2.i)) {
                    b.C0608b a4 = m.a(gVar2.i);
                    a4.b = this.k;
                    a4.l = true;
                    a4.e = 1;
                    a4.a(c1299a2.d);
                }
            }
            if (!TextUtils.isEmpty(gVar2.b) && !TextUtils.isEmpty(gVar2.k)) {
                try {
                    c1299a2.i.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(gVar2.b), Color.parseColor(gVar2.k)}));
                } catch (Exception unused) {
                }
            }
            u.a(c1299a2.f, gVar2.h);
            u.a(c1299a2.e, gVar2.q);
            u.a(c1299a2.g, gVar2.g);
            u.a(c1299a2.h, gVar2.n);
            c1299a2.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.template.brand.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "951bc8315d206f4ed88abb0ea975c378", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "951bc8315d206f4ed88abb0ea975c378");
                        return;
                    }
                    if (!TextUtils.isEmpty(gVar2.d)) {
                        d.a(a.this.k, gVar2.d);
                    }
                    com.sankuai.waimai.store.manager.judas.b.a(a.this.k, "b_waimai_v5kel34y_mc").b(a.this.b).a();
                }
            });
        }
        Object[] objArr3 = {gVar2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "910f83a97326c6957e3f9c4a5622d949", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "910f83a97326c6957e3f9c4a5622d949");
        } else if (gVar2 != null) {
            this.b.put("keyword", this.l.h);
            this.b.put("index", Integer.valueOf(gVar2.getStatisticsIndex()));
            this.b.put("search_log_id", this.l.b(gVar2));
            this.b.put("template_type", Integer.valueOf(this.l.D));
            this.b.put("stid", com.sankuai.waimai.store.search.statistics.g.f(this.l));
            this.b.put("cat_id", Integer.valueOf(this.l.z));
            this.b.put("search_source", Integer.valueOf(this.l.aw));
            this.b.put("search_global_id", this.l.r);
            this.b.put("template_id", "sg_brand_sale_business_direct");
            this.b.put("project_id", gVar2.r);
            this.b.put("poi_id", gVar2.t);
        }
        if (gVar2.u) {
            return;
        }
        gVar2.u = true;
        com.sankuai.waimai.store.manager.judas.b.b(this.k, "b_waimai_v5kel34y_mv").b(this.b).a();
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27036dd8a3f39b32ea021c0372f2edbe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27036dd8a3f39b32ea021c0372f2edbe");
        } else {
            this.b = new HashMap();
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7efc1cf7a2650e247d6973d1f25e3934", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7efc1cf7a2650e247d6973d1f25e3934")).booleanValue() : str.equals("sg_brand_sale_business_direct");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.brand.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1299a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        ImageView b;
        RoundedCornerImageView c;
        ImageView d;
        TextView e;
        TextView f;
        TextView g;
        TextView h;
        ImageView i;
        ConstraintLayout j;

        public C1299a(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e6a0f63a6074e5fd12c9298c894ab4e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e6a0f63a6074e5fd12c9298c894ab4e");
                return;
            }
            this.j = (ConstraintLayout) view.findViewById(R.id.wm_sc_nox_search_brand_card);
            this.b = (ImageView) view.findViewById(R.id.wm_sc_nox_search_brand_bg);
            this.c = (RoundedCornerImageView) view.findViewById(R.id.wm_sc_nox_search_brand_logo);
            this.f = (TextView) view.findViewById(R.id.wm_sc_nox_search_brand_title);
            this.d = (ImageView) view.findViewById(R.id.wm_sc_nox_search_brand_title_label);
            this.e = (TextView) view.findViewById(R.id.wm_sc_nox_search_brand_slogan);
            this.g = (TextView) view.findViewById(R.id.wm_sc_nox_search_brand_near_shop);
            this.h = (TextView) view.findViewById(R.id.wm_sc_nox_search_brand_poi);
            this.i = (ImageView) view.findViewById(R.id.wm_sc_nox_search_brand_dark_layer);
        }
    }
}
