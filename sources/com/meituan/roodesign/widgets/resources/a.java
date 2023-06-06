package com.meituan.roodesign.widgets.resources;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.util.TypedValue;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static int a(@NonNull Context context, @AttrRes int i, @NonNull String str) {
        Object[] objArr = {context, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        TypedValue typedValue = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0604c92000944527dead674dea85166d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0604c92000944527dead674dea85166d")).intValue();
        }
        Object[] objArr2 = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "07fb33683261808ee957b9a8d1c3ae48", RobustBitConfig.DEFAULT_VALUE)) {
            typedValue = (TypedValue) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "07fb33683261808ee957b9a8d1c3ae48");
        } else {
            TypedValue typedValue2 = new TypedValue();
            if (context.getTheme().resolveAttribute(i, typedValue2, true)) {
                typedValue = typedValue2;
            }
        }
        if (typedValue == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
        }
        return typedValue.data;
    }

    public static int a(@NonNull View view, @AttrRes int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d287f1eb9bba09a3b06953b96bf7e4be", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d287f1eb9bba09a3b06953b96bf7e4be")).intValue() : a(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
