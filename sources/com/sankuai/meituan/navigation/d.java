package com.sankuai.meituan.navigation;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    @NonNull
    public static a a(@NonNull View view) {
        a aVar;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        a aVar2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "adee4e572045c3465d99fe16a8ba5f5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "adee4e572045c3465d99fe16a8ba5f5a");
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "925f2d640ab3ff182a03aae21842b279", RobustBitConfig.DEFAULT_VALUE)) {
            View view2 = view;
            while (true) {
                if (view2 == null) {
                    break;
                }
                Object[] objArr3 = {view2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f0f7969a969fb52f888656e0065a589a", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar = (a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f0f7969a969fb52f888656e0065a589a");
                } else {
                    Object tag = view2.getTag(R.id.nav_controller_view_tag);
                    if (tag instanceof WeakReference) {
                        aVar = (a) ((WeakReference) tag).get();
                    } else {
                        aVar = tag instanceof a ? (a) tag : null;
                    }
                }
                if (aVar != null) {
                    aVar2 = aVar;
                    break;
                }
                ViewParent parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
            }
        } else {
            aVar2 = (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "925f2d640ab3ff182a03aae21842b279");
        }
        if (aVar2 != null) {
            return aVar2;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
