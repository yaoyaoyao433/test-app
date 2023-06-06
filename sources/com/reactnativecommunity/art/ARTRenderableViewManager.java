package com.reactnativecommunity.art;

import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.ao;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ARTRenderableViewManager extends ViewManager<View, af> {
    public static final String CLASS_GROUP = "ARTGroup";
    public static final String CLASS_SHAPE = "ARTShape";
    public static final String CLASS_TEXT = "ARTText";
    private final String mClassName;

    public static ARTRenderableViewManager createARTGroupViewManager() {
        return new ARTGroupViewManager();
    }

    public static ARTRenderableViewManager createARTShapeViewManager() {
        return new ARTShapeViewManager();
    }

    public static ARTRenderableViewManager createARTTextViewManager() {
        return new ARTTextViewManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ARTRenderableViewManager(String str) {
        this.mClassName = str;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public af createShadowNodeInstance() {
        if (CLASS_GROUP.equals(this.mClassName)) {
            return new ARTGroupShadowNode();
        }
        if (CLASS_SHAPE.equals(this.mClassName)) {
            return new ARTShapeShadowNode();
        }
        if (CLASS_TEXT.equals(this.mClassName)) {
            return new ARTTextShadowNode();
        }
        throw new IllegalStateException("Unexpected type " + this.mClassName);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends af> getShadowNodeClass() {
        if (CLASS_GROUP.equals(this.mClassName)) {
            return ARTGroupShadowNode.class;
        }
        if (CLASS_SHAPE.equals(this.mClassName)) {
            return ARTShapeShadowNode.class;
        }
        if (CLASS_TEXT.equals(this.mClassName)) {
            return ARTTextShadowNode.class;
        }
        throw new IllegalStateException("Unexpected type " + this.mClassName);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(ao aoVar) {
        throw new IllegalStateException("ARTShape does not map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
        throw new IllegalStateException("ARTShape does not map into a native view");
    }
}
