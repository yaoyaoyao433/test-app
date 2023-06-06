package com.meituan.android.elderly.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ElderlyCashierScrollView extends ScrollView {
    public static ChangeQuickRedirect a;
    private boolean b;

    public ElderlyCashierScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "503ade42a6bc17260f26ef712bfe754a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "503ade42a6bc17260f26ef712bfe754a");
        }
    }

    public ElderlyCashierScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "985c0a8f23692f227bd37ab511b7c111", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "985c0a8f23692f227bd37ab511b7c111");
        }
    }

    public ElderlyCashierScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e3a454ecf1479c6aadee2721da4cc81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e3a454ecf1479c6aadee2721da4cc81");
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public void scrollTo(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e5f4b73f702d9716fba6751a7e6913", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e5f4b73f702d9716fba6751a7e6913");
        } else if (this.b) {
            super.scrollTo(i, i2);
        }
    }

    public void setScrollable(boolean z) {
        this.b = z;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b4dad3402ed11364678dcbb500fd98d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b4dad3402ed11364678dcbb500fd98d");
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }
}
