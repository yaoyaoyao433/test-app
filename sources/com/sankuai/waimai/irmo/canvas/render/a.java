package com.sankuai.waimai.irmo.canvas.render;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.taobao.gcanvas.GCanvasJNI;
import com.taobao.gcanvas.adapters.img.impl.picasso.GCanvasPicassoImageLoader;
import com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackDataFactory;
import com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap;
import com.taobao.gcanvas.bridges.spec.module.AbsGBridgeModule;
import com.taobao.gcanvas.bridges.spec.module.IGBridgeModule;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends AbsGBridgeModule<com.sankuai.waimai.irmo.canvas.data.a> {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final IJSCallbackDataFactory c;

    @Override // com.taobao.gcanvas.bridges.spec.module.IGBridgeModule
    public final void disable(String str) {
    }

    @Override // com.taobao.gcanvas.bridges.spec.module.IGBridgeModule
    public final String enable(JSONObject jSONObject) {
        return null;
    }

    @Override // com.taobao.gcanvas.bridges.spec.module.IGBridgeModule
    public final String extendCallNative(String str, String str2, int i) {
        return null;
    }

    @Override // com.taobao.gcanvas.bridges.spec.module.IGBridgeModule
    public final void render(String str, String str2) {
    }

    @Override // com.taobao.gcanvas.bridges.spec.module.AbsGBridgeModule
    public final /* synthetic */ void invokeCallback(com.sankuai.waimai.irmo.canvas.data.a aVar, Object obj) {
        com.sankuai.waimai.irmo.canvas.data.a aVar2 = aVar;
        Object[] objArr = {aVar2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba99f0c0d65db87da0b6604e625cc398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba99f0c0d65db87da0b6604e625cc398");
        } else if (aVar2 != null) {
            try {
                aVar2.invoke(obj);
                if ((obj instanceof IJSCallbackMap) && ((IJSCallbackMap) obj).hasKey("error")) {
                    com.sankuai.waimai.irmo.canvas.util.a.a(6, "INFEBridge callback error: %s", ((IJSCallbackMap) obj).getString("error"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public a(Context context, IJSCallbackDataFactory iJSCallbackDataFactory) {
        Object[] objArr = {context, iJSCallbackDataFactory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d159b48dc3494e6d866863b8f21439be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d159b48dc3494e6d866863b8f21439be");
            return;
        }
        this.b = context;
        this.c = iJSCallbackDataFactory;
        this.mImageLoader = new GCanvasPicassoImageLoader();
    }

    @Override // com.taobao.gcanvas.bridges.spec.module.AbsGBridgeModule
    public final IJSCallbackDataFactory getDataFactory() {
        return this.c;
    }

    @Override // com.taobao.gcanvas.bridges.spec.module.AbsGBridgeModule
    public final Context getContext() {
        return this.b;
    }

    @Override // com.taobao.gcanvas.bridges.spec.module.IGBridgeModule
    public final void setContextType(String str, IGBridgeModule.ContextType contextType) {
        Object[] objArr = {str, contextType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd31377a01c689853378259510a5d892", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd31377a01c689853378259510a5d892");
        } else {
            GCanvasJNI.setContextType(str, contextType.value(), false);
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.module.IGBridgeModule
    public final void setDevicePixelRatio(String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ef9c45487a81f1104d6398b220b1e05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ef9c45487a81f1104d6398b220b1e05");
        } else {
            GCanvasJNI.setDevicePixelRatio(str, d);
        }
    }
}
