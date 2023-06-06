package com.sankuai.waimai.irmo.canvas.render;

import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.data.d;
import com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackArray;
import com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackDataFactory;
import com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public a b;
    public final c c;
    public boolean d;

    public b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d475b7ae5a562e3a56b44eaf58375d16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d475b7ae5a562e3a56b44eaf58375d16");
            return;
        }
        this.d = false;
        this.c = cVar;
        final com.sankuai.waimai.irmo.canvas.data.c dataFactory = cVar.dataFactory();
        this.b = new a(cVar.context(), new IJSCallbackDataFactory() { // from class: com.sankuai.waimai.irmo.canvas.render.b.1
            public static ChangeQuickRedirect a;

            @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackDataFactory
            public final IJSCallbackArray createJSCallbackArray() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e241331ce28a678efe0c21ac92985ed", RobustBitConfig.DEFAULT_VALUE)) {
                    return (IJSCallbackArray) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e241331ce28a678efe0c21ac92985ed");
                }
                if (dataFactory != null) {
                    return dataFactory.a();
                }
                return null;
            }

            @Override // com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackDataFactory
            public final IJSCallbackMap createJSCallbackMap() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d454d4e79aa8d9d67becfab37b4a6f72", RobustBitConfig.DEFAULT_VALUE)) {
                    return (IJSCallbackMap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d454d4e79aa8d9d67becfab37b4a6f72");
                }
                if (dataFactory != null) {
                    return dataFactory.b();
                }
                return null;
            }
        });
    }

    public String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12147586f2923b27c7190684ffffd882", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12147586f2923b27c7190684ffffd882");
        }
        if (b() != null) {
            return b().getCanvasKey();
        }
        return null;
    }

    public final void a(String str, com.sankuai.waimai.irmo.canvas.data.b bVar) {
        com.sankuai.waimai.irmo.canvas.view.a b;
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0702e46928e48c5d7bcef3949b50da2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0702e46928e48c5d7bcef3949b50da2");
        } else if (this.d && (b = b()) != null) {
            String canvasKey = b.getCanvasKey();
            for (int i = 0; i < bVar.size(); i++) {
                d dVar = (d) bVar.getMap(i);
                String string = dVar.getString(RaptorUploaderImpl.SRC);
                int i2 = dVar.getInt("imageId");
                if (b.hasBindTexture(i2)) {
                    return;
                }
                this.b.bindImageTexture(b, canvasKey, string, i2);
            }
        }
    }

    public com.sankuai.waimai.irmo.canvas.view.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19022480ea46a3d10a8d1e1ed1867f58", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.irmo.canvas.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19022480ea46a3d10a8d1e1ed1867f58");
        }
        if (this.c != null) {
            return this.c.obtainView();
        }
        return null;
    }
}
