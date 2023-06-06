package com.meituan.roodesign.resfetcher.widgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    private String b;

    public RooFrameLayout(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbc2e198e6564d27743575ad65683858", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbc2e198e6564d27743575ad65683858");
        }
    }

    private RooFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "256f91a25c3dd1e09e75d4cbeb9f512b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "256f91a25c3dd1e09e75d4cbeb9f512b");
        }
    }

    public RooFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1e4acd03e878807a5dd152a9e1a8623", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1e4acd03e878807a5dd152a9e1a8623");
        }
    }

    @TargetApi(21)
    private RooFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c99c15c2010e9ca98ced03b733c476a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c99c15c2010e9ca98ced03b733c476a");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842996, 16842997, R.attr.backgroundName, R.attr.project}, i, 0);
        String string = obtainStyledAttributes.getString(2);
        this.b = obtainStyledAttributes.getString(3);
        obtainStyledAttributes.getLayoutDimension(0, -2);
        obtainStyledAttributes.getLayoutDimension(1, -2);
        obtainStyledAttributes.recycle();
        String b = com.meituan.roodesign.resfetcher.utils.a.b(string);
        if (TextUtils.isEmpty(b)) {
            return;
        }
        a.a(this, this.b, b);
    }

    public void setBackgroundByResName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbb482222c46cad43beb75582dd287b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbb482222c46cad43beb75582dd287b5");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            a.a(this, this.b, str);
        }
    }
}
