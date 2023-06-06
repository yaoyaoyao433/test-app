package com.meituan.msc.uimanager;

import android.view.View;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ae {
    public static ChangeQuickRedirect a;

    public static ad a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a9a4d34ff5a78fb8abb6feb476c82ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (ad) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a9a4d34ff5a78fb8abb6feb476c82ff");
        }
        while (!(view instanceof ad)) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return null;
            }
            com.facebook.infer.annotation.a.a(parent instanceof View);
            view = (View) parent;
        }
        return (ad) view;
    }
}
