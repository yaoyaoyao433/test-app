package com.sankuai.meituan.mapsdk.core.annotations;

import android.opengl.GLSurfaceView;
import com.meituan.mtmap.rendersdk.IZoomUtil;
import com.meituan.mtmap.rendersdk.style.layer.CustomDrawParameters;
import com.meituan.mtmap.rendersdk.style.layer.CustomLayer;
import com.meituan.mtmap.rendersdk.style.layer.Layer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class w extends CustomLayer {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ boolean e = !w.class.desiredAssertionStatus();
    public GLSurfaceView.Renderer b;
    public CustomDrawParameters c;
    public IZoomUtil d;
    private GL10 f;
    private EGLConfig g;

    public w(Layer.LayerType layerType, String str, GL10 gl10, EGLConfig eGLConfig, GLSurfaceView.Renderer renderer, IZoomUtil iZoomUtil) {
        super(layerType, str, "");
        Object[] objArr = {layerType, str, gl10, eGLConfig, renderer, iZoomUtil};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f935d53517eb460e5217b026adc28b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f935d53517eb460e5217b026adc28b0");
            return;
        }
        this.f = gl10;
        this.g = eGLConfig;
        this.b = renderer;
        this.d = iZoomUtil;
        this.c = new CustomDrawParameters();
        setOrder(30010.0f, Layer.LayerOrderType.OrderSymbol);
    }

    @Override // com.meituan.mtmap.rendersdk.style.layer.CustomLayer
    public final void onInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01e85acb9858458659b360e7d733c0dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01e85acb9858458659b360e7d733c0dc");
            return;
        }
        super.onInit();
        if (this.b != null) {
            this.b.onSurfaceCreated(this.f, this.g);
        }
    }

    @Override // com.meituan.mtmap.rendersdk.style.layer.CustomLayer
    public final void onDraw(CustomDrawParameters customDrawParameters) {
        Object[] objArr = {customDrawParameters};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9298151d5af3df048e21ea3848c3a51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9298151d5af3df048e21ea3848c3a51");
            return;
        }
        super.onDraw(customDrawParameters);
        if (this.b == null) {
            return;
        }
        if (this.c != null && (this.c.width != customDrawParameters.width || this.c.height != customDrawParameters.height)) {
            this.b.onSurfaceChanged(this.f, (int) customDrawParameters.width, (int) customDrawParameters.height);
        }
        if (!e && this.c == null) {
            throw new AssertionError();
        }
        this.c.width = customDrawParameters.width;
        this.c.height = customDrawParameters.height;
        this.c.latitude = customDrawParameters.latitude;
        this.c.longitude = customDrawParameters.longitude;
        if (this.d != null) {
            this.c.zoom = this.d.fromRenderZoom(customDrawParameters.zoom);
        } else {
            this.c.zoom = customDrawParameters.zoom;
        }
        this.c.bearing = customDrawParameters.bearing;
        this.c.pitch = customDrawParameters.pitch;
        this.c.fieldOfView = customDrawParameters.fieldOfView;
        this.c.eyePosition = customDrawParameters.eyePosition;
        this.c.viewMatrix = customDrawParameters.viewMatrix;
        this.c.projectionMatrix = customDrawParameters.projectionMatrix;
        if (this.b != null) {
            this.b.onDrawFrame(this.f);
        }
    }

    @Override // com.meituan.mtmap.rendersdk.style.layer.CustomLayer
    public final void onClean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88f0bd069fff9fa121ea5aa8421f9676", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88f0bd069fff9fa121ea5aa8421f9676");
        } else {
            super.onClean();
        }
    }

    @Override // com.meituan.mtmap.rendersdk.style.layer.CustomLayer
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6acfb74500b97e85271af99fd8642f2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6acfb74500b97e85271af99fd8642f2b");
        } else {
            super.onDestroy();
        }
    }
}
