package com.sankuai.waimai.bussiness.order.crossconfirm.block.promotionalinfo;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.helper.h;
import com.sankuai.waimai.foundation.utils.g;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    double e;
    c f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private LinearLayout l;
    private int m;
    private int n;
    private f o;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_report_price;
    }

    public static /* synthetic */ void a(b bVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "dd8e9156556c0cb24335d01be1641c6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "dd8e9156556c0cb24335d01be1641c6f");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("popup", "0");
            com.sankuai.waimai.foundation.router.a.a(bVar.c, str, hashMap);
        }
    }

    public b(Context context, f fVar) {
        super(context);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66b822a8ff9f04fa1acd9674eada2b3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66b822a8ff9f04fa1acd9674eada2b3a");
            return;
        }
        this.e = -1.0d;
        this.o = fVar;
        this.n = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_submit_price_num);
        this.m = context.getResources().getDimensionPixelSize(R.dimen.wm_order_confirm_font_size_submit_b_rmb_symbol);
        if (this.o.aM_()) {
            this.j.setTextSize(0, this.n);
            this.j.setTypeface(this.o.aN_());
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "322f1e544dbe8db906d6c3b96408b337", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "322f1e544dbe8db906d6c3b96408b337");
            return;
        }
        super.b();
        this.h = (TextView) this.b.findViewById(R.id.txt_total_price_discounts);
        this.i = (TextView) this.b.findViewById(R.id.txt_total_price_discounts_desc);
        this.j = (TextView) this.b.findViewById(R.id.txt_total_price_discounted);
        this.k = (TextView) this.b.findViewById(R.id.txt_price_total);
        this.g = (TextView) this.b.findViewById(R.id.txt_discount_rules);
        this.l = (LinearLayout) this.b.findViewById(R.id.txt_discount_rules_ll);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fe650edaa7a893e8b6c467c408e5ad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fe650edaa7a893e8b6c467c408e5ad9");
        } else if (!z) {
            this.b.setPadding(this.b.getPaddingLeft(), this.b.getPaddingTop(), this.b.getPaddingRight(), g.a(this.c, 6.0f));
        } else {
            this.b.setPadding(this.b.getPaddingLeft(), this.b.getPaddingTop(), this.b.getPaddingRight(), this.c.getResources().getDimensionPixelSize(R.dimen.wm_common_cell_padding_vertical));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e2cf512fed84f57fd28f4589d7b769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e2cf512fed84f57fd28f4589d7b769");
        } else if (z) {
            this.b.setBackground(this.c.getResources().getDrawable(R.drawable.wm_cross_order_confirm_promotion_bg));
        } else {
            this.b.setBackground(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(double d2, boolean z, boolean z2) {
        Object[] objArr = {Double.valueOf(d2), Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dae6382980a0523b7932d16bc101839", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dae6382980a0523b7932d16bc101839");
            return;
        }
        h.a(this.j, this.c.getString(R.string.wm_order_base_price_with_rmb_symbol, com.sankuai.waimai.foundation.utils.h.a(d2)), this.o.aN_(), this.m, this.n);
        this.j.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3845434377b851376ec139d4cb8e12b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3845434377b851376ec139d4cb8e12b3");
        } else if (d2 > 0.0d) {
            h.a(this.h, this.c.getString(R.string.wm_order_base_price_with_rmb_symbol, com.sankuai.waimai.foundation.utils.h.a(d2)), this.o.aN_(), -1, -1);
            this.h.setVisibility(0);
            this.i.setVisibility(0);
        } else {
            this.h.setVisibility(8);
            this.i.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58656ad20da78c38de837be17eaf52cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58656ad20da78c38de837be17eaf52cd");
        } else if (z) {
            e();
        } else if (this.f == null || TextUtils.isEmpty(this.f.i) || TextUtils.isEmpty(this.f.h)) {
            e();
        } else {
            this.l.setVisibility(0);
            this.g.setText(this.f.i);
            this.l.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.promotionalinfo.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab4444884afe500d75ab83029d18a9be", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab4444884afe500d75ab83029d18a9be");
                    } else {
                        b.a(b.this, b.this.f.h);
                    }
                }
            });
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e772bfe8c11c6eeb5159622620e2176a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e772bfe8c11c6eeb5159622620e2176a");
            return;
        }
        int b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.c, "pref_show", 0);
        String b2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.c, "pref_portal", "");
        String b3 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(this.c, "pref_url", "");
        if (b == 1 && !TextUtils.isEmpty(b2) && !TextUtils.isEmpty(b3)) {
            this.g.setText(b2);
            this.l.setVisibility(0);
            this.l.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.promotionalinfo.b.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72edd1648da9a7c53c3268056d1e4713", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72edd1648da9a7c53c3268056d1e4713");
                    } else {
                        b.a(b.this, com.sankuai.waimai.platform.capacity.persistent.sp.a.b(b.this.c, "pref_url", ""));
                    }
                }
            });
            return;
        }
        this.l.setVisibility(8);
    }
}
