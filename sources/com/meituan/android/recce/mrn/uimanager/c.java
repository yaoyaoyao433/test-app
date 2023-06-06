package com.meituan.android.recce.mrn.uimanager;

import android.view.ViewGroup;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewGroupManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c<T extends ViewGroup, V extends ViewGroupManager<T>> extends f<T, LayoutShadowNode, V> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public c(T t, V v) {
        Object[] objArr = {t, v};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7af889cd25cd25c4a628f12cc9834d3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7af889cd25cd25c4a628f12cc9834d3f");
            return;
        }
        this.viewManager = v;
        this.view = t;
    }

    @Override // com.meituan.android.recce.props.a, com.meituan.android.recce.props.gens.PropVisitor
    public Void visitZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26146909d3347fe489f8cd9f1f192f54", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26146909d3347fe489f8cd9f1f192f54");
        }
        ((ViewGroupManager) this.viewManager).setZIndex((ViewGroup) this.view, f);
        return null;
    }
}
