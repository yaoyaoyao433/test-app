package com.sankuai.waimai.restaurant.shopcart.viewHolder;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.iconfont.c;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.shopcart.e;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.restaurant.shopcart.viewHolder.a {
    public static ChangeQuickRedirect f;
    final g g;
    k h;
    Activity i;
    a j;
    boolean k;
    ArrayList<com.sankuai.waimai.business.restaurant.base.shopcart.g> l;
    int m;
    com.sankuai.waimai.business.restaurant.base.shopcart.g n;
    private View o;
    private View p;
    private TextView q;
    private TextView r;
    private TextView s;
    private TextView t;
    private CheckBox u;
    private LinearLayout v;
    private FrameLayout w;
    private TextView x;
    private com.sankuai.waimai.restaurant.shopcart.config.a y;
    private View.OnClickListener z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);
    }

    public static /* synthetic */ void a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "4c16a7fb68c5d35eb9b13ae149af1208", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "4c16a7fb68c5d35eb9b13ae149af1208");
            return;
        }
        JudasManualManager.a a2 = JudasManualManager.a("b_vhcsyqyl").a(dVar.a());
        a2.b = AppUtil.generatePageInfoKey(dVar.i);
        if (!TextUtils.isEmpty(dVar.c)) {
            a2.a("poi_id", dVar.c);
        } else {
            a2.a("poi_id", dVar.g.f());
        }
        if (!TextUtils.isEmpty(dVar.d)) {
            a2.a("spu_id", dVar.d);
        }
        a2.a();
    }

    public d(@NonNull View view, Activity activity, g gVar, com.sankuai.waimai.restaurant.shopcart.config.a aVar, a aVar2) {
        super(view);
        Object[] objArr = {view, activity, gVar, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "338366f0814680562a0750c66a7bfd44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "338366f0814680562a0750c66a7bfd44");
            return;
        }
        this.h = k.a();
        this.k = false;
        this.z = new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.viewHolder.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2583e5c615d06ed80c14e8fc8c1961d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2583e5c615d06ed80c14e8fc8c1961d");
                    return;
                }
                if (d.this.n != null && !d.this.n.q && d.this.j != null) {
                    view2.announceForAccessibility("已选中");
                    d.this.j.a(d.this.m);
                }
                if (d.this.n != null) {
                    JudasManualManager.a a2 = JudasManualManager.a("b_waimai_cnxwczny_mc").a(d.this.a());
                    a2.b = AppUtil.generatePageInfoKey(d.this.i);
                    a2.a("is_empty", d.this.n.p ? "0" : "1").a();
                }
            }
        };
        this.g = gVar;
        this.y = aVar;
        this.i = activity;
        Object[] objArr2 = {view, activity};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6433f5302c95c02b48d22cec0fbc3ede", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6433f5302c95c02b48d22cec0fbc3ede");
        } else {
            this.o = view;
            this.p = view.findViewById(R.id.layout_pocket_divider_line);
            this.q = (TextView) view.findViewById(R.id.btn_clear);
            c.a aVar3 = new c.a(activity);
            aVar3.b = R.string.wm_c_iconfont_67shanchu;
            aVar3.h = R.color.roo_color_black_858687;
            aVar3.f = 11;
            this.q.setCompoundDrawables(aVar3.a(), null, null, null);
            this.q.setCompoundDrawablePadding(com.sankuai.waimai.foundation.utils.g.a(activity, 2.0f));
            this.r = (TextView) view.findViewById(R.id.txt_cart_name);
            this.t = (TextView) view.findViewById(R.id.txt_cart_fee);
            this.s = (TextView) view.findViewById(R.id.txt_cart_desc);
            this.x = (TextView) view.findViewById(R.id.txt_pocket_empty_tip_bottom);
            this.t.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.viewHolder.d.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr3 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cf8e98bd4d2f4764a8f06784d8891fb6", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cf8e98bd4d2f4764a8f06784d8891fb6");
                    } else if (d.this.k) {
                        d.a(d.this);
                        String string = d.this.i.getString(R.string.wm_restaurant_scheme_mrn_boxfee);
                        Bundle bundle = new Bundle();
                        bundle.putString("buckets", com.sankuai.waimai.business.restaurant.base.shopcart.g.a(d.this.l));
                        com.sankuai.waimai.foundation.router.a.a(d.this.i, string, bundle);
                    }
                }
            });
            this.u = (CheckBox) view.findViewById(R.id.checkbox_pocket);
            this.u.setClickable(false);
            this.v = (LinearLayout) view.findViewById(R.id.ll_checkbox_pocket);
            this.w = (FrameLayout) view.findViewById(R.id.fl_checkbox_container);
            this.v.setOnClickListener(this.z);
            if (com.sankuai.waimai.restaurant.shopcart.utils.g.a()) {
                view.setFocusable(false);
                view.setFocusableInTouchMode(false);
            }
        }
        this.j = aVar2;
    }

    public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.g gVar, int i, List<com.sankuai.waimai.business.restaurant.base.shopcart.g> list) {
        Object[] objArr = {gVar, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ded29322597e92880debbea2092cdc52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ded29322597e92880debbea2092cdc52");
        } else if (gVar == null) {
        } else {
            this.m = i;
            this.n = gVar;
            a(gVar);
            this.l = new ArrayList<>();
            this.l.addAll(list);
        }
    }

    private void a(com.sankuai.waimai.business.restaurant.base.shopcart.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fb22dbd59ba30c9bad838b01bf0e2b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fb22dbd59ba30c9bad838b01bf0e2b5");
        } else if (gVar == null) {
        } else {
            a(gVar.j, gVar.q);
            b(gVar);
            c(gVar);
            b(gVar.f);
            b(gVar.n);
            this.o.setOnClickListener(null);
            this.p.setVisibility(gVar.r ? 8 : 0);
        }
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30bbe4bca475af3ed53286a01feab608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30bbe4bca475af3ed53286a01feab608");
        } else if (z) {
            this.w.setVisibility(0);
        } else {
            this.r.setPadding(com.sankuai.waimai.platform.widget.filterbar.view.view.rangeseekbar.a.a(com.meituan.android.singleton.b.a, 16), 0, 0, 0);
            this.w.setVisibility(8);
        }
    }

    private void b(com.sankuai.waimai.business.restaurant.base.shopcart.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "799ef308473903450f8a855c592975db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "799ef308473903450f8a855c592975db");
            return;
        }
        if (!gVar.q && !gVar.p) {
            ah.a(this.s, gVar.m);
            CharSequence contentDescription = this.v.getContentDescription();
            String charSequence = contentDescription != null ? contentDescription.toString() : "";
            LinearLayout linearLayout = this.v;
            linearLayout.setContentDescription(charSequence + "，" + gVar.m);
        } else {
            this.s.setVisibility(8);
        }
        if (gVar.q && !gVar.p) {
            this.x.setVisibility(0);
        } else {
            this.x.setVisibility(8);
        }
    }

    private void c(com.sankuai.waimai.business.restaurant.base.shopcart.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc27de9bc916a2a4d76c1a1e6d2f5585", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc27de9bc916a2a4d76c1a1e6d2f5585");
        } else if (h.c(Double.valueOf(gVar.l), Double.valueOf(0.0d))) {
            this.t.setVisibility(8);
        } else {
            String str = "¥" + h.a(gVar.l);
            String format = String.format(com.meituan.android.singleton.b.a.getResources().getString(R.string.wm_shopcart_pocket_fee), str);
            SpannableString spannableString = new SpannableString(format);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FB4E44")), 6, str.length() + 6, 34);
            if (this.g == null || !this.g.i) {
                this.k = true;
                if (!com.sankuai.waimai.restaurant.shopcart.utils.a.a().b) {
                    c();
                }
                Drawable drawable = com.meituan.android.singleton.b.a.getResources().getDrawable(R.drawable.wm_restaurant_goods_detail_ic_price_mark);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                spannableString.setSpan(new com.sankuai.waimai.restaurant.shopcart.widget.span.a(drawable), format.length() - 2, format.length() - 1, 33);
            } else {
                this.k = false;
            }
            this.t.setText(spannableString);
            this.t.setVisibility(0);
        }
    }

    private void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c444ceb9d7346cbc4ceacebdeaf416e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c444ceb9d7346cbc4ceacebdeaf416e");
            return;
        }
        this.r.setText(str);
        this.u.setChecked(z);
        if (z) {
            LinearLayout linearLayout = this.v;
            linearLayout.setContentDescription(str + "，已选中");
            this.v.setClickable(false);
            return;
        }
        LinearLayout linearLayout2 = this.v;
        linearLayout2.setContentDescription(str + "，未选中");
        this.v.setClickable(true);
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de4d6c675682f32419ba7a357aab4e65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de4d6c675682f32419ba7a357aab4e65");
        } else if (i + 1 == 1) {
            this.q.setVisibility(0);
            b();
        } else {
            this.q.setVisibility(4);
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b771cf8682bf2c4018e9c008f3e14fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b771cf8682bf2c4018e9c008f3e14fd");
        } else {
            this.q.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.restaurant.shopcart.viewHolder.d.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0aa6da767e98fe462dbd0b97cc9cf415", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0aa6da767e98fe462dbd0b97cc9cf415");
                    } else {
                        d.this.h.a(d.this.g.f(), new e() { // from class: com.sankuai.waimai.restaurant.shopcart.viewHolder.d.3.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7698f7b1fd0abe6d7e166f013e8386a6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7698f7b1fd0abe6d7e166f013e8386a6");
                                }
                            }

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                            }

                            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                                Object[] objArr3 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f56b717a1b94df7e48c785add672891d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f56b717a1b94df7e48c785add672891d");
                                    return;
                                }
                                d.this.h.b(d.this.g.f());
                                d.this.h.e(d.this.g.f());
                            }
                        });
                    }
                }
            });
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a06872304082655268796022d483135", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a06872304082655268796022d483135") : this.y != null ? this.y.b() ? "c_u4fk4kw" : this.y.e() ? "c_1b9anm4" : this.y.d() ? "c_5y4tc0m" : "c_CijEL" : "c_CijEL";
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480facb622d4cfd41f3c02d598d720f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480facb622d4cfd41f3c02d598d720f2");
            return;
        }
        com.sankuai.waimai.restaurant.shopcart.utils.a.a().b = true;
        JudasManualManager.a a2 = JudasManualManager.b("b_89b8blys").a(a());
        a2.b = AppUtil.generatePageInfoKey(this.i);
        if (!TextUtils.isEmpty(this.c)) {
            a2.a("poi_id", this.c);
        } else {
            a2.a("poi_id", this.g.f());
        }
        if (!TextUtils.isEmpty(this.d)) {
            a2.a("spu_id", this.d);
        }
        a2.a();
    }
}
