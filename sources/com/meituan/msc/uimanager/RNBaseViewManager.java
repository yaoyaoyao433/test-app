package com.meituan.msc.uimanager;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewParent;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.views.view.RNLayoutShadowNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class RNBaseViewManager<T extends View, C extends RNLayoutShadowNode> extends BaseViewManager<T, C> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.uimanager.b
    @ReactProp(name = "zIndex")
    public void setZIndex(@NonNull T t, float f) {
        Object[] objArr = {t, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2953cb45581eb4b2df06d0458b0bc2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2953cb45581eb4b2df06d0458b0bc2f");
            return;
        }
        RNViewGroupManager.a((View) t, Math.round(f));
        ViewParent parent = t.getParent();
        if (parent instanceof ac) {
            ((ac) parent).b();
        }
    }
}
