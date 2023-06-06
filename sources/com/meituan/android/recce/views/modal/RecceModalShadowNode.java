package com.meituan.android.recce.views.modal;

import android.graphics.Point;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.meituan.android.recce.mrn.uimanager.a;
import com.meituan.android.recce.mrn.uimanager.e;
import com.meituan.android.recce.props.gens.PropVisitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RecceModalShadowNode extends LayoutShadowNode implements e {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        Object[] objArr = {reactShadowNodeImpl, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b4d725778249e0eae918d8e779cc15b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b4d725778249e0eae918d8e779cc15b");
            return;
        }
        super.addChildAt(reactShadowNodeImpl, i);
        Point modalHostSize = RecceModalHelper.getModalHostSize(getThemedContext());
        reactShadowNodeImpl.setStyleWidth(modalHostSize.x);
        reactShadowNodeImpl.setStyleHeight(modalHostSize.y);
    }

    @Override // com.meituan.android.recce.mrn.uimanager.e
    public PropVisitor<Void> getVisitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b2a1bd16b6e78c3460a79128d450d9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (PropVisitor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b2a1bd16b6e78c3460a79128d450d9f");
        }
        a aVar = new a();
        aVar.shadowNode = this;
        return aVar;
    }
}
