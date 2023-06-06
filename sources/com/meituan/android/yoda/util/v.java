package com.meituan.android.yoda.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.AttrRes;
import android.support.annotation.StyleRes;
import android.support.annotation.StyleableRes;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class v {
    public static ChangeQuickRedirect a;
    private TypedArray b;

    private v(Context context, AttributeSet attributeSet, @StyleableRes int[] iArr, @AttrRes int i, @StyleRes int i2) {
        Object[] objArr = {context, attributeSet, iArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cbf2f5b171c14a04a356464ff0e3deb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cbf2f5b171c14a04a356464ff0e3deb");
        } else {
            this.b = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        }
    }

    public static v a(Context context, @StyleableRes int[] iArr) {
        Object[] objArr = {context, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82d822ee51b1f7f04e15e88fde253566", RobustBitConfig.DEFAULT_VALUE) ? (v) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82d822ee51b1f7f04e15e88fde253566") : new v(context, null, iArr, 0, 0);
    }

    public static v a(Context context, AttributeSet attributeSet, @StyleableRes int[] iArr) {
        Object[] objArr = {context, attributeSet, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7711db8973abec7d8843fae245df75ff", RobustBitConfig.DEFAULT_VALUE) ? (v) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7711db8973abec7d8843fae245df75ff") : new v(context, attributeSet, iArr, 0, 0);
    }

    public static v a(Context context, AttributeSet attributeSet, @StyleableRes int[] iArr, @AttrRes int i, @StyleRes int i2) {
        Object[] objArr = {context, null, iArr, 0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccce17be28ac650ccb87edb97febbaca", RobustBitConfig.DEFAULT_VALUE) ? (v) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccce17be28ac650ccb87edb97febbaca") : new v(context, null, iArr, 0, i2);
    }

    public final int a(@StyleableRes int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), -1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e381c9ded1932d956a0da0a4705793e4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e381c9ded1932d956a0da0a4705793e4")).intValue();
        }
        try {
            return this.b.getColor(i, -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    public final Drawable a(@StyleableRes int i) {
        Object[] objArr = {24};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39922e65252eecbecba331121da752b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39922e65252eecbecba331121da752b3");
        }
        try {
            return this.b.getDrawable(24);
        } catch (Exception unused) {
            return null;
        }
    }

    public final int b(@StyleableRes int i, int i2) {
        Object[] objArr = {1, -1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8a60b035a3690b923e62343a5372436", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8a60b035a3690b923e62343a5372436")).intValue();
        }
        try {
            return this.b.getInt(1, -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    public final int c(@StyleableRes int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), -1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d28eebfc9959fea36506e7fc5c7da29b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d28eebfc9959fea36506e7fc5c7da29b")).intValue();
        }
        try {
            return this.b.getResourceId(i, -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    public final boolean a(@StyleableRes int i, boolean z) {
        Object[] objArr = {0, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40428c9005d8e9563311fba9da707431", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40428c9005d8e9563311fba9da707431")).booleanValue();
        }
        try {
            return this.b.getBoolean(0, false);
        } catch (Exception unused) {
            return false;
        }
    }

    public final String b(@StyleableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4a19d31484facddb55d8c05e6b123bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4a19d31484facddb55d8c05e6b123bf");
        }
        try {
            return this.b.getString(i);
        } catch (Exception unused) {
            return "";
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8abdda34be9fad4c4682b5d251553b24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8abdda34be9fad4c4682b5d251553b24");
        } else {
            this.b.recycle();
        }
    }
}
