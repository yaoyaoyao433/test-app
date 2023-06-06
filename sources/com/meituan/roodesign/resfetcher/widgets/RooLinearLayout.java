package com.meituan.roodesign.resfetcher.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    private String b;

    public RooLinearLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "973af8359058bcc70c634a32c79761f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "973af8359058bcc70c634a32c79761f9");
        }
    }

    public RooLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f91bfba16644f2304201ddc8ff1a5a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f91bfba16644f2304201ddc8ff1a5a6");
        }
    }

    public RooLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63b1305e2027330850b2adc86fd51535", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63b1305e2027330850b2adc86fd51535");
        }
    }

    @TargetApi(21)
    public RooLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f1781a4f38fc2ccfb148bc2d78169db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f1781a4f38fc2ccfb148bc2d78169db");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842996, 16842997, R.attr.backgroundName, R.attr.project});
        String string = obtainStyledAttributes.getString(2);
        this.b = obtainStyledAttributes.getString(3);
        obtainStyledAttributes.getLayoutDimension(0, -2);
        obtainStyledAttributes.getLayoutDimension(1, -2);
        obtainStyledAttributes.recycle();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        a.a(this, this.b, string);
    }

    public void setBackgroundByResName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f7a53a1ab3f3c6e84126770ca797f1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f7a53a1ab3f3c6e84126770ca797f1a");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a.a(this, this.b, str);
        }
    }
}
