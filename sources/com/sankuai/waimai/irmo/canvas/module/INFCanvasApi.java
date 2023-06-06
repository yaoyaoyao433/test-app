package com.sankuai.waimai.irmo.canvas.module;

import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.irmo.canvas.bridge.INFJSCallBack;
import com.sankuai.waimai.irmo.canvas.bridge.jscallbak.CanvasArray;
import com.sankuai.waimai.irmo.canvas.bridge.jscallbak.CanvasMap;
import com.sankuai.waimai.irmo.canvas.instance.INFContext;
import com.sankuai.waimai.irmo.canvas.render.b;
import com.sankuai.waimai.irmo.canvas.render.c;
import com.sankuai.waimai.irmo.utils.d;
import com.taobao.gcanvas.GCanvasJNI;
import com.taobao.gcanvas.bridges.spec.module.IGBridgeModule;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class INFCanvasApi implements c {
    public static ChangeQuickRedirect changeQuickRedirect;
    private b infeRenderer;
    private INFContext mInfContext;

    public void destroy() {
    }

    public INFCanvasApi(@NonNull INFContext iNFContext) {
        Object[] objArr = {iNFContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bcc4a11ccb3416502c51f6db748fa16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bcc4a11ccb3416502c51f6db748fa16");
            return;
        }
        this.mInfContext = iNFContext;
        this.infeRenderer = new b(this);
    }

    public void enable(CanvasMap canvasMap) {
        Object[] objArr = {canvasMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3aae7b5bf9bfd9c443590fe45bd19391", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3aae7b5bf9bfd9c443590fe45bd19391");
            return;
        }
        d.a("Java inf_canvas_log:  call enable  , map: " + canvasMap.toString(), new Object[0]);
    }

    public void setContextType(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db9a8db34a17487088ae7d300ea62ebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db9a8db34a17487088ae7d300ea62ebb");
            return;
        }
        d.a("Java inf_canvas_log:  call setContextType, canvasId:" + str + ", contextType: " + i, new Object[0]);
        b bVar = this.infeRenderer;
        Object[] objArr2 = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "f610c17e61c3306f353dbedb5e99f68d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "f610c17e61c3306f353dbedb5e99f68d");
        } else if (GCanvasJNI.GCanvaslibEnable) {
            com.sankuai.waimai.irmo.canvas.util.a.a(4, "GCanvas Lib enable", new Object[0]);
            bVar.d = true;
            bVar.b.setContextType(bVar.a(), i == 1 ? IGBridgeModule.ContextType._3D : IGBridgeModule.ContextType._2D);
        } else {
            com.sankuai.waimai.irmo.canvas.util.a.a(6, "GCanvas Lib unable!!", new Object[0]);
        }
    }

    private void subscribeEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "969de66b5ec1c333b0bc0ca0439a3bef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "969de66b5ec1c333b0bc0ca0439a3bef");
            return;
        }
        com.sankuai.waimai.irmo.canvas.instance.a iNFContext = this.mInfContext.getInstance();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.canvas.instance.a.a;
        if (PatchProxy.isSupport(objArr2, iNFContext, changeQuickRedirect3, false, "02a614f5f18cd41360c50d8be7ad36a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iNFContext, changeQuickRedirect3, false, "02a614f5f18cd41360c50d8be7ad36a0");
            return;
        }
        d.a("Java inf_canvas_log:  INFInstance subscribeEvent() , eventName: " + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        iNFContext.i.add(str);
    }

    private void unsubscribeEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "775566903d8e7865e0e0ebd7b253699b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "775566903d8e7865e0e0ebd7b253699b");
            return;
        }
        com.sankuai.waimai.irmo.canvas.instance.a iNFContext = this.mInfContext.getInstance();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.canvas.instance.a.a;
        if (PatchProxy.isSupport(objArr2, iNFContext, changeQuickRedirect3, false, "cb3fedd287eedce7d62ebcf652dfd179", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iNFContext, changeQuickRedirect3, false, "cb3fedd287eedce7d62ebcf652dfd179");
            return;
        }
        d.a("Java inf_canvas_log:  INFInstance unsubscribeEvent() , eventName: " + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        iNFContext.i.remove(str);
    }

    public String render(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4292b45b4d903a4e9b326e9cbac0e22", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4292b45b4d903a4e9b326e9cbac0e22");
        }
        b bVar = this.infeRenderer;
        Object[] objArr2 = {str2, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "0997b50bddad940dad8c2a8b3b9403bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "0997b50bddad940dad8c2a8b3b9403bb");
        }
        if (bVar.d) {
            return GCanvasJNI.render(bVar.a(), str2, i);
        }
        return null;
    }

    public void setDevicePixelRatio(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa7ea764e0b56e620f7fcb69141f6818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa7ea764e0b56e620f7fcb69141f6818");
            return;
        }
        double d = 0.0d;
        try {
            d = Double.parseDouble(obj.toString());
        } catch (Exception unused) {
        }
        d.a("Java inf_canvas_log:  setDevicePixelRatio  canvasId: " + str + " ratio: " + d, new Object[0]);
        b bVar = this.infeRenderer;
        Object[] objArr2 = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "4f3c0bc634da41fc126797491960844e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "4f3c0bc634da41fc126797491960844e");
        } else if (bVar.d) {
            bVar.b.setDevicePixelRatio(bVar.a(), d);
        }
    }

    public void preLoadImage(CanvasArray canvasArray, INFJSCallBack iNFJSCallBack) {
        Object[] objArr = {canvasArray, iNFJSCallBack};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdc039b41cb7285b41d4a2873b219b91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdc039b41cb7285b41d4a2873b219b91");
            return;
        }
        d.a("Java inf_canvas_log:  call preLoadImage, " + canvasArray.toString(), new Object[0]);
        b bVar = this.infeRenderer;
        Object[] objArr2 = {canvasArray, iNFJSCallBack};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "1113d4e519cc67695a2009f9df766df3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "1113d4e519cc67695a2009f9df766df3");
            return;
        }
        try {
            bVar.b.preLoadImage(com.sankuai.waimai.irmo.canvas.view.b.a(canvasArray), iNFJSCallBack);
        } catch (Exception e) {
            com.sankuai.waimai.irmo.canvas.util.a.a(6, "INFERenderer preLoadImage exception: %s", e.getMessage());
        }
    }

    public void bindImageTexture(String str, CanvasArray canvasArray) {
        Object[] objArr = {str, canvasArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3dea679c7e7ae1c93b3e3953e64f758f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3dea679c7e7ae1c93b3e3953e64f758f");
            return;
        }
        d.a("Java inf_canvas_log:  call bindImageTexture, canvasId:" + str + " src: " + canvasArray, new Object[0]);
        this.infeRenderer.a(str, canvasArray);
    }

    public void setLogLevel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62b40d2d01399c9a14e1e18c1c2f28d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62b40d2d01399c9a14e1e18c1c2f28d2");
            return;
        }
        d.a("Java inf_canvas_log:  call setLogLevel, level:" + i, new Object[0]);
        b bVar = this.infeRenderer;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "e7530d8ab5bc222102511b49c38620b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "e7530d8ab5bc222102511b49c38620b1");
        } else if (bVar.d) {
            bVar.b.setLogLevel(i);
        }
    }

    public void texImage2D(String str, int i, int i2, int i3, int i4, int i5, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e17043cfafbcb1c480551906d9d7bfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e17043cfafbcb1c480551906d9d7bfb");
            return;
        }
        d.a("Java inf_canvas_log:  texImage2D, canvasId:" + str + " target: " + i + " level: " + i2 + " internalformat: " + i3 + " format: " + i4 + " type: " + i5 + " path: " + str2, new Object[0]);
        b bVar = this.infeRenderer;
        Object[] objArr2 = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str2};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "ea53e488cb334cfa24b6c44621fbbe7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "ea53e488cb334cfa24b6c44621fbbe7b");
        } else if (bVar.d) {
            bVar.b.texImage2D(bVar.a(), i, i2, i3, i4, i5, str2);
        }
    }

    public void texSubImage2D(String str, int i, int i2, int i3, int i4, int i5, int i6, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31b9b07a852dfa27ca7aa7ff8a3fe93d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31b9b07a852dfa27ca7aa7ff8a3fe93d");
            return;
        }
        d.a("Java inf_canvas_log:  texSubImage2D, canvasId:" + str + " target: " + i + " level: " + i2 + " xOffset: " + i3 + " yOffset: " + i4 + "format: " + i5 + "type:" + i6 + " path:" + str2, new Object[0]);
        b bVar = this.infeRenderer;
        Object[] objArr2 = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "b535c73d0c38b40611d70fae8d9aa362", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "b535c73d0c38b40611d70fae8d9aa362");
        } else if (bVar.d) {
            bVar.b.texSubImage2D(bVar.a(), i, i2, i3, i4, i5, i6, str2);
        }
    }

    public void dispatchEvent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47431c7c99bed9c9403cfed42ccc2fc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47431c7c99bed9c9403cfed42ccc2fc0");
            return;
        }
        d.a("Java inf_canvas_log:  call dispatchEvent  eventName : " + str, new Object[0]);
    }

    public float width() {
        float width;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9b143a0400e19bfad270d9bf31391d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9b143a0400e19bfad270d9bf31391d9")).floatValue();
        }
        Context context = context();
        b bVar = this.infeRenderer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "29604da898ff00c260691ea833b3664e", RobustBitConfig.DEFAULT_VALUE)) {
            width = ((Float) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "29604da898ff00c260691ea833b3664e")).floatValue();
        } else {
            com.sankuai.waimai.irmo.canvas.view.a b = bVar.b();
            if (b == null) {
                width = 0.0f;
            } else {
                com.sankuai.waimai.irmo.canvas.util.a.a(3, "INFERenderer width: " + b.getWidth(), new Object[0]);
                width = (float) b.getWidth();
            }
        }
        return g.c(context, width);
    }

    public float height() {
        float height;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "950e76b552d4bd4d833075e890c8f481", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "950e76b552d4bd4d833075e890c8f481")).floatValue();
        }
        Context context = context();
        b bVar = this.infeRenderer;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "07a55ea225fe9aa3537406289ea56c18", RobustBitConfig.DEFAULT_VALUE)) {
            height = ((Float) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "07a55ea225fe9aa3537406289ea56c18")).floatValue();
        } else {
            com.sankuai.waimai.irmo.canvas.view.a obtainView = bVar.c.obtainView();
            if (obtainView == null) {
                height = 0.0f;
            } else {
                com.sankuai.waimai.irmo.canvas.util.a.a(3, "INFERenderer height: " + obtainView.getHeight(), new Object[0]);
                height = (float) obtainView.getHeight();
            }
        }
        return g.c(context, height);
    }

    public void reportRaptorResult(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8781b385d50efcb044fb8961d1692ea8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8781b385d50efcb044fb8961d1692ea8");
            return;
        }
        d.a("Java inf_canvas_log:  call reportRaptorResult, errorCode: " + i + " msg: " + str2, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.sankuai.waimai.irmo.mach.c.a(str, this.mInfContext == null ? null : this.mInfContext.getBundle(), i, str2);
    }

    @Override // com.sankuai.waimai.irmo.canvas.render.c
    public com.sankuai.waimai.irmo.canvas.view.a obtainView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c7bdd06cb7d360a0e14b3d78233776c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.irmo.canvas.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c7bdd06cb7d360a0e14b3d78233776c");
        }
        if (this.mInfContext.getBodyComponent() != null) {
            return this.mInfContext.getBodyComponent().getView();
        }
        return null;
    }

    @Override // com.sankuai.waimai.irmo.canvas.render.c
    public Context context() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99b172c206d7eebb9f7e45e7db2e71b2", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99b172c206d7eebb9f7e45e7db2e71b2") : this.mInfContext.getContext();
    }

    @Override // com.sankuai.waimai.irmo.canvas.render.c
    public com.sankuai.waimai.irmo.canvas.data.c dataFactory() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b0a3d34d877c3508303c91b226c0835", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.irmo.canvas.data.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b0a3d34d877c3508303c91b226c0835") : new a();
    }
}
