package com.sankuai.waimai.store.view.price;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.view.SpuHandPriceNewView;
import com.sankuai.waimai.store.view.price.bean.ActivityPriceInfo;
import com.sankuai.waimai.store.view.price.bean.ActualPriceInfo;
import com.sankuai.waimai.store.view.price.bean.UnifyPrice;
import com.sankuai.waimai.store.view.price.raptor.SCPriceViewMonitor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCPriceView extends LinearLayout {
    public static ChangeQuickRedirect a;
    public static Typeface b;
    private static Typeface c;
    private TextView d;
    private TextView e;
    private SpuHandPriceNewView f;

    public SCPriceView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "267ed98b3faba9e81aed567d01514c13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "267ed98b3faba9e81aed567d01514c13");
        }
    }

    public SCPriceView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68be2e26973227031b078401314f3140", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68be2e26973227031b078401314f3140");
        }
    }

    public SCPriceView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe17a6eedd87115b38076c51cab029ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe17a6eedd87115b38076c51cab029ce");
            return;
        }
        Context applicationContext = getContext().getApplicationContext();
        if (c == null) {
            try {
                c = Typeface.createFromAsset(applicationContext.getAssets(), "fonts/MeituanDigitalType-Bold.ttf");
            } catch (Exception unused) {
            }
        }
        if (b == null) {
            try {
                b = Typeface.createFromAsset(applicationContext.getAssets(), "fonts/MeituanDigitalType-Regular.ttf");
            } catch (Exception unused2) {
            }
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd459ce91f78328838e1b61bc8c3913f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd459ce91f78328838e1b61bc8c3913f");
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.wm_sc_price_view, this);
        this.d = (TextView) findViewById(R.id.sc_price_view_first_line);
        this.e = (TextView) findViewById(R.id.sc_price_view_second_line);
        this.f = (SpuHandPriceNewView) findViewById(R.id.sc_price_view_hand_price_view);
        if (c != null) {
            this.d.setTypeface(c);
            this.e.setTypeface(c);
            this.f.setTypeface(c);
        }
        this.f.setVisibility(8);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7792f4ca90a6fb3118aa53582a4bc01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7792f4ca90a6fb3118aa53582a4bc01");
        } else {
            super.onLayout(z, i, i2, i + getMeasuredWidth(), i2 + getMeasuredHeight());
        }
    }

    public final void a(int i, @Nullable UnifyPrice unifyPrice, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), unifyPrice, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68943286dca6785d69a4164eeeeed50b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68943286dca6785d69a4164eeeeed50b");
        } else {
            a(i, unifyPrice, i2, z, -1);
        }
    }

    public final void a(int i, @Nullable UnifyPrice unifyPrice, int i2, boolean z, int i3) {
        Object[] objArr = {Integer.valueOf(i), unifyPrice, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a4ecfe55865f6239675e6bb5b928f54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a4ecfe55865f6239675e6bb5b928f54");
        } else if (unifyPrice == null) {
            setVisibility(8);
        } else {
            ActivityPriceInfo activityPriceInfo = unifyPrice.activityInfo;
            if (activityPriceInfo == null || TextUtils.isEmpty(activityPriceInfo.activityPriceStr) || activityPriceInfo.activityPrice < 0.0d) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            b bVar = (TextUtils.isEmpty(unifyPrice.underlinedPriceStr) || unifyPrice.underlinedPrice == activityPriceInfo.activityPrice || unifyPrice.underlinedPrice < 0.0d) ? null : new b(unifyPrice.underlinedPrice, unifyPrice.underlinedPriceStr, 1, "");
            b bVar2 = new b(activityPriceInfo.activityPrice, activityPriceInfo.activityPriceStr, activityPriceInfo.activityPriceSource, activityPriceInfo.activityPriceSuffix);
            b bVar3 = (TextUtils.isEmpty(activityPriceInfo.secondaryActivityPriceStr) || activityPriceInfo.secondaryActivityPrice < 0.0d) ? null : new b(activityPriceInfo.secondaryActivityPrice, activityPriceInfo.secondaryActivityPriceStr, activityPriceInfo.secondaryActivityPriceSource, activityPriceInfo.secondaryActivityPriceSuffix);
            setAlpha(z ? 0.7f : 1.0f);
            a(i, bVar2, bVar, bVar3, i2, unifyPrice.actualPriceInfo, i3);
        }
    }

    private void a(int i, @NonNull b bVar, @Nullable b bVar2, @Nullable b bVar3, int i2, ActualPriceInfo actualPriceInfo, int i3) {
        boolean z;
        Object[] objArr = {Integer.valueOf(i), bVar, bVar2, bVar3, Integer.valueOf(i2), actualPriceInfo, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7f9c2a4a94e055a7f6aa9df553c7ce0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7f9c2a4a94e055a7f6aa9df553c7ce0");
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        c a2 = e.a(i2);
        d.a(getContext(), i, spannableStringBuilder, bVar, a2);
        spannableStringBuilder.append("space", new f(h.a(getContext(), 2.0f)), 33);
        switch (i) {
            case 1:
                if (bVar2 != null) {
                    d.a(i, spannableStringBuilder, bVar2, a2);
                }
                if (bVar3 != null) {
                    d.a(getContext(), i, spannableStringBuilder2, bVar3);
                }
                z = true;
                break;
            case 2:
                if (bVar2 == null) {
                    if (bVar3 != null) {
                        d.a(getContext(), i, spannableStringBuilder2, bVar3);
                    }
                    z = true;
                    break;
                } else {
                    d.a(i, spannableStringBuilder2, bVar2, a2);
                    z = false;
                    break;
                }
            case 3:
                if (bVar2 != null) {
                    d.a(i, spannableStringBuilder, bVar2, a2);
                }
                z = true;
                break;
            case 4:
                if (bVar2 != null) {
                    d.a(i, spannableStringBuilder, bVar2, a2);
                }
                if (bVar3 != null) {
                    d.a(getContext(), i, spannableStringBuilder, bVar3);
                }
                z = true;
                break;
            default:
                com.sankuai.waimai.store.util.monitor.b.a().a(SCPriceViewMonitor.SC_PRICE_VIEW_MONITOR).a(KnbConstants.PARAMS_SCENE, String.valueOf(i)).a();
                z = true;
                break;
        }
        this.d.setText(spannableStringBuilder);
        if (spannableStringBuilder2.length() > 0) {
            if (i3 > 0 && this.e != null) {
                ConstraintLayout.a aVar = (ConstraintLayout.a) this.e.getLayoutParams();
                aVar.topMargin = h.a(getContext(), i3);
                this.e.setLayoutParams(aVar);
            }
            u.a(this.e, spannableStringBuilder2);
        } else {
            u.a((View) this.e, 8);
        }
        if (z && bVar3 != null && bVar3.d == 2) {
            this.f.setVisibility(0);
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) this.f.getLayoutParams();
            if (i3 > 0) {
                aVar2.topMargin = h.a(getContext(), i3);
            } else if (i == 2) {
                aVar2.topMargin = h.a(getContext(), 1.0f);
            } else {
                aVar2.topMargin = h.a(getContext(), 2.0f);
            }
            this.f.setLayoutParams(aVar2);
            if (i == 1) {
                if (actualPriceInfo != null && !TextUtils.isEmpty(actualPriceInfo.sgActualPriceLongText)) {
                    this.f.a(bVar3.c, bVar3.e, actualPriceInfo.sgActualPriceLongText);
                    return;
                } else {
                    this.f.a(bVar3.c, bVar3.e, 0);
                    return;
                }
            } else if (actualPriceInfo != null && !TextUtils.isEmpty(actualPriceInfo.sgActualPriceShortText)) {
                this.f.a(bVar3.c, bVar3.e, actualPriceInfo.sgActualPriceShortText);
                return;
            } else {
                this.f.a(bVar3.c, bVar3.e, 1);
                return;
            }
        }
        this.f.setVisibility(8);
    }
}
