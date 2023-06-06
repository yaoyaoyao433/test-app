package com.facebook.react.views.text.glidesupport;

import android.content.Context;
import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ao;
import com.meituan.android.picassohelper.c;
/* compiled from: ProGuard */
@ReactModule(name = GlideBasedReactTextInlineImageViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class GlideBasedReactTextInlineImageViewManager extends ViewManager<View, GlideBasedReactTextInlineImageShadowNode> {
    protected static final String REACT_CLASS = "RCTTextInlineImage";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    public GlideBasedReactTextInlineImageViewManager(Context context) {
        c.a(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(ao aoVar) {
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public GlideBasedReactTextInlineImageShadowNode createShadowNodeInstance() {
        return new GlideBasedReactTextInlineImageShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends GlideBasedReactTextInlineImageShadowNode> getShadowNodeClass() {
        return GlideBasedReactTextInlineImageShadowNode.class;
    }
}
