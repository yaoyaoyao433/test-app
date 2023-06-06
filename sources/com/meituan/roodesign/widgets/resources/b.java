package com.meituan.roodesign.widgets.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StyleableRes;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    @Nullable
    public static ColorStateList a(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int color;
        int resourceId;
        ColorStateList a2;
        Object[] objArr = {context, typedArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0f6a97c411078006ea234701b1adee6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ColorStateList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0f6a97c411078006ea234701b1adee6");
        }
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a2 = android.support.v7.content.res.b.a(context, resourceId)) == null) {
            if (Build.VERSION.SDK_INT <= 15 && (color = typedArray.getColor(i, -1)) != -1) {
                return ColorStateList.valueOf(color);
            }
            return typedArray.getColorStateList(i);
        }
        return a2;
    }

    @Nullable
    public static Drawable b(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        Drawable b;
        Object[] objArr = {context, typedArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "926ca09ceaa4aa794e524cbb98188042", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "926ca09ceaa4aa794e524cbb98188042") : (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = android.support.v7.content.res.b.b(context, resourceId)) == null) ? typedArray.getDrawable(i) : b;
    }
}
