package com.meituan.android.pay.common.selectdialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.android.paybase.screen.AutoFitLinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LimitedHeightLinearLayout extends AutoFitLinearLayout {
    public static ChangeQuickRedirect a;
    private int c;

    public LimitedHeightLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec9a8cf056d9fc281be703adc15d5758", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec9a8cf056d9fc281be703adc15d5758");
        } else {
            this.c = 0;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45c50bf88398468e80a50d58574be8a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45c50bf88398468e80a50d58574be8a2");
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE && this.c > 0 && size > this.c) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.c, mode);
        }
        super.onMeasure(i, i2);
    }

    public int getLimitedHeight() {
        return this.c;
    }

    public void setLimitedHeight(int i) {
        this.c = i;
    }
}
