package com.sankuai.waimai.drug.o2o;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.core.service.order.d;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.NetPriceCalculatorResult;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.sankuai.waimai.store.shopping.cart.ui.c {
    public static ChangeQuickRedirect a;
    protected TextView b;
    private com.sankuai.waimai.store.shopping.cart.pre.b c;

    public static /* synthetic */ void f(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "eaba4c722a68d70d703732db0eddeb03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "eaba4c722a68d70d703732db0eddeb03");
            return;
        }
        if (eVar.c == null) {
            eVar.c = com.sankuai.waimai.store.shopping.cart.pre.d.a((Activity) eVar.mContext, eVar.i, eVar.j);
        }
        eVar.c.a(new com.sankuai.waimai.store.shopping.cart.pre.c() { // from class: com.sankuai.waimai.drug.o2o.e.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.shopping.cart.pre.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a16bab7e1a5e6e3a852a034f956162eb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a16bab7e1a5e6e3a852a034f956162eb");
                } else {
                    e.g(e.this);
                }
            }
        });
    }

    public static /* synthetic */ void g(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "88ac22e6ed2e66bf5d267faa1ecb15a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "88ac22e6ed2e66bf5d267faa1ecb15a5");
        } else if (com.sankuai.waimai.store.manager.order.b.a((Activity) eVar.mContext, eVar.i.g(), eVar.i.h(), a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER)) {
            eVar.b.setEnabled(false);
            eVar.b();
        }
    }

    public e(@NonNull Activity activity, @NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar) {
        super(activity, aVar, null);
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5008f39d81271c1f16c00bc8910b3f12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5008f39d81271c1f16c00bc8910b3f12");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f06e6e91d9b100a27a85c120e299c7b8", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f06e6e91d9b100a27a85c120e299c7b8") : layoutInflater.inflate(R.layout.wm_drug_shopcart_o2o_submit_block, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        NetPriceCalculatorResult.SubmitBuyInfo submitBuyInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5584f9187e1867edd6c7fdfff048f0fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5584f9187e1867edd6c7fdfff048f0fb");
            return;
        }
        super.onViewCreated();
        this.b = (TextView) this.mView.findViewById(R.id.o2o_poi_dealInfo_submit_txt);
        final String str = "-999";
        com.sankuai.waimai.store.platform.domain.core.shopcart.b k = this.f.k(this.i.d());
        if (k != null && (submitBuyInfo = k.A) != null && !t.a(submitBuyInfo.submitTip)) {
            str = submitBuyInfo.submitTip;
        }
        com.sankuai.waimai.store.manager.judas.b.b(this.j.d, com.sankuai.waimai.store.manager.judas.b.a((Object) this.mContext), "b_waimai_taqlx63p_mv").a("poi_id", this.i.d()).a("stid", this.g.n()).a("tag", str).a();
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.drug.o2o.e.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3abd18b821cd2c829f6eda65c31bf1c3", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3abd18b821cd2c829f6eda65c31bf1c3");
                } else if (e.this.i == null) {
                } else {
                    com.sankuai.waimai.store.manager.judas.b.a(e.this.j.d, com.sankuai.waimai.store.manager.judas.b.a((Object) e.this.mContext), "b_waimai_taqlx63p_mc").a("poi_id", e.this.i.d()).a("stid", e.this.g.n()).a("tag", str).a();
                    e.f(e.this);
                }
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93cdd0d05b53d5430f4a9504d7ced60f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93cdd0d05b53d5430f4a9504d7ced60f");
            return;
        }
        b(false);
        c();
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.c
    public final void a() {
        com.sankuai.waimai.store.platform.domain.core.shopcart.b k;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "711784f7fe67cb405b9f66c413b27578", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "711784f7fe67cb405b9f66c413b27578");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36926df8e65f96aba8e5d3e655b265b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36926df8e65f96aba8e5d3e655b265b1");
        } else {
            if (this.i != null && !this.f.r(this.i.d()) && (k = this.f.k(this.i.d())) != null && k.A != null && k.A.status == 1) {
                z = true;
            }
            b(z);
        }
        c();
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d12fc4150058cbc454d0efeddaee3ef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d12fc4150058cbc454d0efeddaee3ef0");
            return;
        }
        int i = R.color.wm_sg_color_BCBCBD;
        int i2 = z ? R.color.wm_sg_color_FFED95 : R.color.wm_sg_color_BCBCBD;
        if (z) {
            i = R.color.wm_sg_color_FFDB94;
        }
        this.b.setBackground(com.sankuai.waimai.store.util.e.a().a(new int[]{-16842910}, new e.a().a(GradientDrawable.Orientation.TL_BR, new int[]{ContextCompat.getColor(this.mContext, i2), ContextCompat.getColor(this.mContext, i)}).a(h.a(this.mContext, 20.0f)).a()).a(new int[]{16842919}, new e.a().a(GradientDrawable.Orientation.TL_BR, new int[]{ContextCompat.getColor(this.mContext, R.color.wm_sg_color_FFED95), ContextCompat.getColor(this.mContext, R.color.wm_sg_color_FFDB94)}).a(h.a(this.mContext, 20.0f)).a()).a(new e.a().a(GradientDrawable.Orientation.TL_BR, new int[]{ContextCompat.getColor(this.mContext, R.color.wm_sg_color_FFE14D), ContextCompat.getColor(this.mContext, R.color.wm_sg_color_FFC34D)}).a(h.a(this.mContext, 20.0f)).a()).b);
        this.b.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{16842919}, new int[0]}, new int[]{ContextCompat.getColor(getContext(), z ? R.color.wm_sg_color_7B7C7D : R.color.wm_sg_color_FFFFFF), ContextCompat.getColor(getContext(), R.color.wm_sg_color_7B7C7D), ContextCompat.getColor(getContext(), R.color.wm_sg_color_222426)}));
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95598c2ef959a386c3c9b6095fb4a76d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95598c2ef959a386c3c9b6095fb4a76d");
        } else if (this.i == null) {
        } else {
            this.b.setTypeface(Typeface.DEFAULT_BOLD);
            if (!this.f.r(this.i.d())) {
                com.sankuai.waimai.store.platform.domain.core.shopcart.b k = this.f.k(this.i.d());
                if (k == null) {
                    return;
                }
                NetPriceCalculatorResult.SubmitBuyInfo submitBuyInfo = k.A;
                if (submitBuyInfo != null) {
                    if (submitBuyInfo.status == 1) {
                        this.b.setEnabled(true);
                    } else {
                        this.b.setEnabled(false);
                    }
                    if (t.a(submitBuyInfo.submitTip)) {
                        this.b.setText(submitBuyInfo.submitText);
                        return;
                    }
                    String str = submitBuyInfo.submitText;
                    a(this.mContext.getString(R.string.wm_st_dealInfo_submit_txt, str, submitBuyInfo.submitTip), str, submitBuyInfo.status == 1);
                    return;
                }
            }
            this.b.setEnabled(false);
            this.b.setText(this.mContext.getString(R.string.wm_st_dealInfo_min_fee_to_send, i.a(this.i.s())));
        }
    }

    private void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d22a0d88aaf3bee44524d026b98f8d78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d22a0d88aaf3bee44524d026b98f8d78");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.b.setTypeface(Typeface.DEFAULT);
            this.b.setMaxLines(2);
            if (z) {
                this.b.setEnabled(true);
            } else {
                this.b.setEnabled(false);
            }
            int length = t.a(str2) ? 0 : str2.length();
            int dimensionPixelSize = this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_14);
            int dimensionPixelSize2 = this.mContext.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_9);
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize), 0, length, 18);
            spannableString.setSpan(new StyleSpan(1), 0, length, 18);
            spannableString.setSpan(new AbsoluteSizeSpan(dimensionPixelSize2), length, str.length(), 33);
            this.b.setText(spannableString);
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.ui.c
    public final void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9310fb088b63ff62bb6c0ef7789c8c20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9310fb088b63ff62bb6c0ef7789c8c20");
        } else {
            aVar.e = this.b;
        }
    }
}
