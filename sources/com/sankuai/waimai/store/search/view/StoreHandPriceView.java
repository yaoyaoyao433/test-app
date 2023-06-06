package com.sankuai.waimai.store.search.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.util.b;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StoreHandPriceView extends LinearLayout {
    public static ChangeQuickRedirect a;
    public TextView b;
    public TextView c;
    private View d;

    public static /* synthetic */ void a(StoreHandPriceView storeHandPriceView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, storeHandPriceView, changeQuickRedirect, false, "55422f543029d10308c154fca3f42105", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, storeHandPriceView, changeQuickRedirect, false, "55422f543029d10308c154fca3f42105");
            return;
        }
        ViewGroup.LayoutParams layoutParams = storeHandPriceView.getLayoutParams();
        layoutParams.width = -1;
        storeHandPriceView.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = storeHandPriceView.b.getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams2.width = 0;
            ((LinearLayout.LayoutParams) layoutParams2).weight = 1.0f;
            storeHandPriceView.b.setLayoutParams(layoutParams2);
        }
    }

    public static /* synthetic */ void b(StoreHandPriceView storeHandPriceView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, storeHandPriceView, changeQuickRedirect, false, "f6a368b166d55476087c22dbda2559ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, storeHandPriceView, changeQuickRedirect, false, "f6a368b166d55476087c22dbda2559ca");
            return;
        }
        ViewGroup.LayoutParams layoutParams = storeHandPriceView.getLayoutParams();
        layoutParams.width = -2;
        storeHandPriceView.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = storeHandPriceView.b.getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams2.width = -2;
            ((LinearLayout.LayoutParams) layoutParams2).weight = 0.0f;
            storeHandPriceView.b.setLayoutParams(layoutParams2);
        }
    }

    public StoreHandPriceView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de055ce154e5841f97e0ca088357dce2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de055ce154e5841f97e0ca088357dce2");
        } else {
            a(context);
        }
    }

    public StoreHandPriceView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3367e23f067aee550df79bc163baa412", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3367e23f067aee550df79bc163baa412");
        } else {
            a(context);
        }
    }

    public StoreHandPriceView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d783933f7f1b44755dcb6c454c9ebff5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d783933f7f1b44755dcb6c454c9ebff5");
        } else {
            a(context);
        }
    }

    public StoreHandPriceView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28647ea320ceffaea215c1720cfcd8dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28647ea320ceffaea215c1720cfcd8dc");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c8e669b90eaa9578758b151a0833b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c8e669b90eaa9578758b151a0833b5");
            return;
        }
        this.d = LayoutInflater.from(context).inflate(R.layout.wm_sc_nox_search_store_hand_price_view, this);
        this.b = (TextView) this.d.findViewById(R.id.wm_store_search_hand_price);
        this.c = (TextView) this.d.findViewById(R.id.wm_store_search_hand_price_text_right);
        this.b.setBackground(new e.a().a(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{b.b(getContext(), R.color.wm_sc_nox_search_color_FF720D), b.b(getContext(), R.color.wm_sc_nox_search_color_FF4060)}).a());
    }

    public final boolean a(HandPriceInfo handPriceInfo, final int i) {
        Object[] objArr = {handPriceInfo, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d559107ab212ae6cc50ce8227d1e3e3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d559107ab212ae6cc50ce8227d1e3e3")).booleanValue();
        }
        if (handPriceInfo == null) {
            setVisibility(8);
            return false;
        }
        String valueOf = String.valueOf(i.a(handPriceInfo.handActivityPrice));
        if (TextUtils.isEmpty(valueOf) || TextUtils.isEmpty(handPriceInfo.handPriceLabel)) {
            setVisibility(8);
            return false;
        }
        setVisibility(0);
        this.b.setText(a(handPriceInfo, valueOf));
        this.c.setText(handPriceInfo.handPriceLabel);
        post(new Runnable() { // from class: com.sankuai.waimai.store.search.view.StoreHandPriceView.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 0;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42d11c749daa1350b2c8023ec012bffb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42d11c749daa1350b2c8023ec012bffb");
                    return;
                }
                ViewGroup.LayoutParams layoutParams = StoreHandPriceView.this.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i2 = 0 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                }
                if (StoreHandPriceView.this.getMeasuredWidth() >= i - i2) {
                    StoreHandPriceView.a(StoreHandPriceView.this);
                } else {
                    StoreHandPriceView.b(StoreHandPriceView.this);
                }
            }
        });
        return true;
    }

    public SpannableString a(HandPriceInfo handPriceInfo, String str) {
        Object[] objArr = {handPriceInfo, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "684319f0234050b6560e6d3d8fc73b80", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableString) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "684319f0234050b6560e6d3d8fc73b80");
        }
        boolean z = !TextUtils.isEmpty(handPriceInfo.handActivityPriceSuffixText);
        StringBuilder sb = new StringBuilder("¥");
        sb.append(str);
        sb.append(z ? handPriceInfo.handActivityPriceSuffixText : "");
        String sb2 = sb.toString();
        SpannableString spannableString = new SpannableString(sb2);
        spannableString.setSpan(new AbsoluteSizeSpan(9, true), 0, 1, 17);
        if (z) {
            spannableString.setSpan(new AbsoluteSizeSpan(10, true), sb2.indexOf(handPriceInfo.handActivityPriceSuffixText), sb2.length(), 17);
        }
        return spannableString;
    }
}
