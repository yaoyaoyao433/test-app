package com.reactnativecommunity.art;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ao;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.d;
/* compiled from: ProGuard */
@ReactModule(name = ARTSurfaceViewManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class ARTSurfaceViewManager extends BaseViewManager<a, ARTSurfaceViewShadowNode> {
    private static final YogaMeasureFunction MEASURE_FUNCTION = new YogaMeasureFunction() { // from class: com.reactnativecommunity.art.ARTSurfaceViewManager.1
        @Override // com.facebook.yoga.YogaMeasureFunction
        public final long measure(d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            throw new IllegalStateException("SurfaceView should have explicit width and height set");
        }
    };
    public static final String REACT_CLASS = "ARTSurfaceView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    public void setBackgroundColor(a aVar, int i) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ARTSurfaceViewShadowNode createShadowNodeInstance() {
        ARTSurfaceViewShadowNode aRTSurfaceViewShadowNode = new ARTSurfaceViewShadowNode();
        aRTSurfaceViewShadowNode.setMeasureFunction(MEASURE_FUNCTION);
        return aRTSurfaceViewShadowNode;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<ARTSurfaceViewShadowNode> getShadowNodeClass() {
        return ARTSurfaceViewShadowNode.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(ao aoVar) {
        return new a(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(a aVar, Object obj) {
        ARTSurfaceViewShadowNode aRTSurfaceViewShadowNode = (ARTSurfaceViewShadowNode) obj;
        SurfaceTexture surfaceTexture = aVar.getSurfaceTexture();
        aVar.setSurfaceTextureListener(aRTSurfaceViewShadowNode);
        if (surfaceTexture == null || aRTSurfaceViewShadowNode.a != null) {
            return;
        }
        aRTSurfaceViewShadowNode.a = new Surface(surfaceTexture);
        aRTSurfaceViewShadowNode.a(true);
    }
}
