package com.facebook.react.views.modal;

import android.graphics.Point;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ModalHostShadowNode extends LayoutShadowNode {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.af
    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        super.addChildAt(reactShadowNodeImpl, i);
        Point a = a.a(getThemedContext());
        reactShadowNodeImpl.setStyleWidth(a.x);
        reactShadowNodeImpl.setStyleHeight(a.y);
    }
}
