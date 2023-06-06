package com.meituan.msc.views.modal;

import android.graphics.Point;
import com.meituan.msc.uimanager.ReactShadowNodeImpl;
import com.meituan.msc.views.view.RNLayoutShadowNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RNModalHostShadowNode extends RNLayoutShadowNode {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meituan.msc.uimanager.ReactShadowNodeImpl, com.meituan.msc.uimanager.aa
    public final void a(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        Object[] objArr = {reactShadowNodeImpl, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ce6d6d69ec0ba1529434e25509dde12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ce6d6d69ec0ba1529434e25509dde12");
            return;
        }
        super.a(reactShadowNodeImpl, i);
        Point a2 = a.a(t());
        reactShadowNodeImpl.a(a2.x);
        reactShadowNodeImpl.b(a2.y);
    }
}
