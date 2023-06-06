package com.sankuai.waimai.bussiness.order.confirm.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FixedAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    public static ChangeQuickRedirect a;
    private int b;

    public FixedAutoCompleteTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da86b6fb028926c4fd1ba4a616432d6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da86b6fb028926c4fd1ba4a616432d6b");
        } else {
            this.b = 0;
        }
    }

    public FixedAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb5893be3672ed638eed7e54cb58e4ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb5893be3672ed638eed7e54cb58e4ae");
        } else {
            this.b = 0;
        }
    }

    public FixedAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f6640e0038be86d1276f473b13a743a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f6640e0038be86d1276f473b13a743a");
        } else {
            this.b = 0;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i) {
        if (i < 0) {
            i = 0;
        }
        this.b = i;
    }

    @Override // android.widget.AutoCompleteTextView
    public int getThreshold() {
        return this.b;
    }

    @Override // android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c7ca1ebbff19cf72e72956248afac89", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c7ca1ebbff19cf72e72956248afac89")).booleanValue() : getText().length() >= this.b;
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "896df0bd542036fad0e00f4a0da91e76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "896df0bd542036fad0e00f4a0da91e76");
            return;
        }
        try {
            super.showDropDown();
        } catch (Throwable th) {
            a.a(th);
        }
    }
}
