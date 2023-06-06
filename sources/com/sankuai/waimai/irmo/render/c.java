package com.sankuai.waimai.irmo.render;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.a;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerInfo;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends com.sankuai.waimai.mach.component.base.a<WMIrmoView> {
    public static ChangeQuickRedirect a;
    f b;
    private e c;
    private a d;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd8c80117ffd97f000a19fc745507b10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd8c80117ffd97f000a19fc745507b10");
            return;
        }
        this.c = new e() { // from class: com.sankuai.waimai.irmo.render.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.irmo.render.e
            public final void a(WMIrmoView wMIrmoView, b bVar, h hVar) {
                List<com.sankuai.waimai.mach.node.a> b;
                Object[] objArr2 = {wMIrmoView, bVar, hVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "642ce905beb35778f021d82f7848fbc0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "642ce905beb35778f021d82f7848fbc0");
                    return;
                }
                for (IrmoLayerInfo irmoLayerInfo : bVar.d.getLayers()) {
                    if (irmoLayerInfo.type == 1007) {
                        com.sankuai.waimai.foundation.utils.log.a.b("IRMO_BASE_ANIM", "find layer", new Object[0]);
                        if (c.this.n != null && (b = c.this.n.b()) != null && b.size() == 1) {
                            hVar.a(irmoLayerInfo, b.get(0).g());
                        }
                    }
                }
            }
        };
        this.d = new a() { // from class: com.sankuai.waimai.irmo.render.c.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.irmo.render.a
            public final void a(@NonNull a.EnumC0973a enumC0973a, @Nullable Map<String, Object> map) {
                Object[] objArr2 = {enumC0973a, map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0645fce0f8c375f7d79bc02f9c25a986", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0645fce0f8c375f7d79bc02f9c25a986");
                } else if (c.this.b == null || c.this.b.f == null || c.this.m == null) {
                } else {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(enumC0973a.name());
                    if (map != null) {
                        linkedList.add(map);
                    }
                    c.this.m.asyncCallJSMethod(c.this.b.f.b, linkedList);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    @Override // com.sankuai.waimai.mach.component.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(com.sankuai.waimai.irmo.render.WMIrmoView r14) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.irmo.render.c.a(android.view.View):void");
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ WMIrmoView b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3dfd194bc4921f0c19ab2c2b02ec3cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMIrmoView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3dfd194bc4921f0c19ab2c2b02ec3cd");
        }
        if (context == null) {
            return null;
        }
        WMIrmoView wMIrmoView = new WMIrmoView(context);
        wMIrmoView.a("mach");
        com.sankuai.waimai.irmo.utils.d.b("IrmoEffectComponent_Irmo getHostView " + this, new Object[0]);
        return wMIrmoView;
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "312f7bf42d740000dde2c52e40a9620c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "312f7bf42d740000dde2c52e40a9620c");
        } else if (this.m == null) {
        } else {
            this.b = new f(this.m, k());
            com.sankuai.waimai.irmo.utils.d.b("IrmoEffectComponent_Irmo onBind " + this, new Object[0]);
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40cdb966d5bbcd9c1377941dff825e3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40cdb966d5bbcd9c1377941dff825e3e");
            return;
        }
        WMIrmoView wMIrmoView = (WMIrmoView) this.o;
        if (wMIrmoView != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = WMIrmoView.a;
            if (PatchProxy.isSupport(objArr2, wMIrmoView, changeQuickRedirect2, false, "9c0cab6748cf710133edd41176fa73a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, wMIrmoView, changeQuickRedirect2, false, "9c0cab6748cf710133edd41176fa73a7");
            } else {
                if (wMIrmoView.b != null) {
                    d dVar = wMIrmoView.b;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "0ceb2baca8625475c680f5b21f1290f9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "0ceb2baca8625475c680f5b21f1290f9");
                    } else {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = d.a;
                        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "96a3a8b947a949a5f1fe0ce09bf57928", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "96a3a8b947a949a5f1fe0ce09bf57928");
                        } else {
                            Activity activity = dVar.h != null ? dVar.h.get() : null;
                            if (activity != null) {
                                activity.getApplication().unregisterActivityLifecycleCallbacks(dVar.p);
                            }
                        }
                        dVar.a();
                    }
                }
                if (!com.sankuai.waimai.foundation.utils.d.a(wMIrmoView.c)) {
                    wMIrmoView.c.clear();
                }
            }
        }
        com.sankuai.waimai.irmo.utils.d.b("IrmoEffectComponent_Irmo onUnbind " + this, new Object[0]);
        super.b();
    }
}
