package com.sankuai.waimai.sa.ui.assistant.chat.multiperson;

import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.sa.model.l;
import com.sankuai.waimai.sa.ui.assistant.view.MultiPersonMealFooterRelativeLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class MultiPersonFooterController implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private MultiPersonMealFooterRelativeLayout b;
    private l c;
    private long d;
    private com.sankuai.waimai.sa.ui.assistant.a e;
    private int f;
    private String g;
    private int h;
    private int i;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface FromPage {
        public static final int DETAIL = 1;
        public static final int TEMPLATE = 0;
    }

    public MultiPersonFooterController(MultiPersonMealFooterRelativeLayout multiPersonMealFooterRelativeLayout) {
        Object[] objArr = {multiPersonMealFooterRelativeLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76747e7eb6ffe0caa9ae82b9f77aafff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76747e7eb6ffe0caa9ae82b9f77aafff");
            return;
        }
        this.b = multiPersonMealFooterRelativeLayout;
        MultiPersonMealFooterRelativeLayout multiPersonMealFooterRelativeLayout2 = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = MultiPersonMealFooterRelativeLayout.a;
        if (PatchProxy.isSupport(objArr2, multiPersonMealFooterRelativeLayout2, changeQuickRedirect2, false, "1f73ec535864c665af8eb3804a8f8d04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, multiPersonMealFooterRelativeLayout2, changeQuickRedirect2, false, "1f73ec535864c665af8eb3804a8f8d04");
            return;
        }
        multiPersonMealFooterRelativeLayout2.b = (TextView) multiPersonMealFooterRelativeLayout2.findViewById(R.id.wm_smart_assistant_multi_person_merchant_on_sale);
        multiPersonMealFooterRelativeLayout2.c = (TextView) multiPersonMealFooterRelativeLayout2.findViewById(R.id.wm_smart_assistant_multi_person_discount_price);
        multiPersonMealFooterRelativeLayout2.d = (TextView) multiPersonMealFooterRelativeLayout2.findViewById(R.id.wm_smart_assistant_multi_person_merchant_actual_price);
        multiPersonMealFooterRelativeLayout2.e = (TextView) multiPersonMealFooterRelativeLayout2.findViewById(R.id.wm_smart_assistant_multi_person_merchant_original_price);
        multiPersonMealFooterRelativeLayout2.g = (TextView) multiPersonMealFooterRelativeLayout2.findViewById(R.id.wm_smart_assistant_multi_person_merchant_buy_package);
        multiPersonMealFooterRelativeLayout2.j = (TextView) multiPersonMealFooterRelativeLayout2.findViewById(R.id.wm_smart_assistant_multi_person_merchant_package_fee);
        multiPersonMealFooterRelativeLayout2.i = (ViewGroup) multiPersonMealFooterRelativeLayout2.findViewById(R.id.wm_smart_assistant_multi_person_merchant_on_sale_container);
        multiPersonMealFooterRelativeLayout2.h = (TextView) multiPersonMealFooterRelativeLayout2.findViewById(R.id.wm_smart_assistant_multi_person_merchant_detail_buy_package);
        multiPersonMealFooterRelativeLayout2.f = (TextView) multiPersonMealFooterRelativeLayout2.findViewById(R.id.wm_smart_assistant_multi_person_merchant_detail_original_price);
    }

    public final void a(l lVar, long j, com.sankuai.waimai.sa.ui.assistant.a aVar, int i, String str, int i2, int i3) {
        int i4;
        int i5;
        Object[] objArr = {lVar, new Long(j), aVar, Integer.valueOf(i), str, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceff43f5834321d2eb4f31b2b4371a64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceff43f5834321d2eb4f31b2b4371a64");
            return;
        }
        this.c = lVar;
        this.d = j;
        this.e = aVar;
        this.f = i;
        this.g = str;
        this.i = i3;
        if (Math.abs(lVar.i - lVar.j) < 0.009999999776482582d) {
            this.b.getOriginPrice().setVisibility(8);
            this.b.getDetailOriginPrice().setVisibility(8);
        } else if (i2 == 0) {
            this.b.getOriginPrice().setVisibility(0);
            this.b.getDetailOriginPrice().setVisibility(8);
        } else {
            this.b.getDetailOriginPrice().setVisibility(0);
            this.b.getOriginPrice().setVisibility(8);
        }
        if (lVar.j < 0.01d) {
            i4 = 4;
            this.b.getPrice().setVisibility(4);
            i5 = 0;
        } else {
            i4 = 4;
            i5 = 0;
            this.b.getPrice().setVisibility(0);
        }
        if (lVar.i < 0.01d) {
            this.b.getPrice().setVisibility(i4);
        } else {
            this.b.getPrice().setVisibility(i5);
        }
        this.b.getOriginPrice().setPaintFlags(this.b.getOriginPrice().getPaintFlags() | 16);
        this.b.getOriginPrice().setText(this.b.getContext().getString(R.string.wm_sa_price_string, h.a(lVar.i)));
        this.b.getDetailOriginPrice().setPaintFlags(this.b.getDetailOriginPrice().getPaintFlags() | 16);
        this.b.getDetailOriginPrice().setText(this.b.getContext().getString(R.string.wm_sa_price_string, h.a(lVar.i)));
        this.b.getPrice().setText(String.format(Locale.US, "¥%s", h.a(lVar.j)));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.b.getOriginPrice().getLayoutParams();
        if (i2 == 0) {
            layoutParams.addRule(0, R.id.wm_smart_assistant_multi_person_merchant_buy_package);
            this.b.getBuyTxtFromeTemplate().setOnClickListener(this);
            this.b.getBuyTxtFromeTemplate().setVisibility(0);
            this.b.getBuyTxtFromeDetail().setVisibility(i4);
            this.b.getDiscountPriceFromDetail().setVisibility(i4);
            if (!TextUtils.isEmpty(lVar.m)) {
                this.b.getOnSaleFromTemplate().setText(lVar.m);
                this.b.getOnSaleContainer().setVisibility(0);
            } else {
                this.b.getOnSaleContainer().setVisibility(i4);
            }
        } else {
            layoutParams.addRule(0, R.id.wm_smart_assistant_multi_person_merchant_detail_buy_package);
            this.b.getBuyTxtFromeDetail().setOnClickListener(this);
            this.b.getBuyTxtFromeTemplate().setVisibility(i4);
            this.b.getBuyTxtFromeDetail().setVisibility(0);
            this.b.getOnSaleContainer().setVisibility(i4);
            if (lVar.s > 0.0d) {
                this.b.getDiscountPriceFromDetail().setText(this.b.getContext().getString(R.string.wm_sa_has_discount_price, h.a(lVar.s)));
                this.b.getDiscountPriceFromDetail().setVisibility(0);
            } else {
                this.b.getDiscountPriceFromDetail().setVisibility(i4);
            }
        }
        this.b.getOriginPrice().setLayoutParams(layoutParams);
        this.h = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8b7b2db932519df72c196f366d4940d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8b7b2db932519df72c196f366d4940d");
        } else if (view.getId() == R.id.wm_smart_assistant_multi_person_merchant_buy_package || view.getId() == R.id.wm_smart_assistant_multi_person_merchant_detail_buy_package) {
            a.a(view.getContext(), this.c, this.e, String.valueOf(this.d), this.f, this.g, this.h, this.i);
        }
    }
}
