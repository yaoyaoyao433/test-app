package com.meituan.msc.modules.page.render;

import android.content.Context;
import com.meituan.msc.modules.manager.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static <T extends f> T a(com.meituan.msc.b bVar, Context context, com.meituan.msc.modules.engine.h hVar) {
        T hVar2;
        Object[] objArr = {bVar, context, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d7a0056b868ec86646fae9b995f3e1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d7a0056b868ec86646fae9b995f3e1c");
        }
        switch (bVar) {
            case RN:
                hVar2 = new com.meituan.msc.modules.page.render.rn.h();
                break;
            case NATIVE:
                hVar2 = new com.meituan.msc.modules.page.render.rn.b();
                break;
            case WEBVIEW:
                hVar2 = new com.meituan.msc.modules.page.render.webview.e();
                break;
            default:
                throw new p("not support rendererType" + bVar.toString());
        }
        if (hVar != null) {
            hVar2.a(context, hVar);
        }
        return hVar2;
    }
}
