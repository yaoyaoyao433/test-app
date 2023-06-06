package com.meituan.android.base.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TextViewWithMaxLineCompat extends TextView {
    public static ChangeQuickRedirect a;
    private int b;

    public TextViewWithMaxLineCompat(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ce89235aabda8984bcec31c40b8c769", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ce89235aabda8984bcec31c40b8c769");
        } else {
            this.b = -1;
        }
    }

    public TextViewWithMaxLineCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8544b069a6f0c5f45c6f44aaa1e7e7b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8544b069a6f0c5f45c6f44aaa1e7e7b8");
        } else {
            this.b = -1;
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46763afdae0cd78fee104837f6c44649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46763afdae0cd78fee104837f6c44649");
            return;
        }
        super.setMaxLines(i);
        this.b = i;
    }

    public int getMaxLinesCompat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f0dbf01a6fe910ec5d9856e6150d68e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f0dbf01a6fe910ec5d9856e6150d68e")).intValue();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return getMaxLinesUpJellyBean();
        }
        return this.b;
    }

    @TargetApi(16)
    public int getMaxLinesUpJellyBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63ead9175289af4a8562a69b4edcfe9c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63ead9175289af4a8562a69b4edcfe9c")).intValue() : getMaxLines();
    }
}
