package com.meituan.msc.modules.exception;

import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends c {
    public static ChangeQuickRedirect c;

    public d(h hVar) {
        super(hVar);
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef13d871d7bba33a3be9945065709930", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef13d871d7bba33a3be9945065709930");
        }
    }

    @Override // com.meituan.msc.modules.exception.c, com.meituan.msc.jse.bridge.NativeModuleCallExceptionHandler
    public final void handleException(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa5c008b1ca012e95ae509eb9d7c0c5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa5c008b1ca012e95ae509eb9d7c0c5a");
            return;
        }
        try {
            JSONObject a = a(exc);
            if (a == null) {
                g.a("[MSCRenderExceptionHandler@handleException]", "jsonObject null");
            } else {
                this.b.p.b(a);
            }
        } catch (JSONException e) {
            g.a("[MSCRenderExceptionHandler@handleException]", e);
        }
    }
}
