package com.meituan.msc.modules.exception;

import android.util.Pair;
import com.meituan.msc.common.utils.o;
import com.meituan.msc.jse.bridge.NativeModuleCallExceptionHandler;
import com.meituan.msc.jse.devsupport.JSException;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.manager.m;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c implements NativeModuleCallExceptionHandler {
    public static ChangeQuickRedirect a;
    protected final h b;

    public c(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3510da4de8e7bbce07815fc05da576a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3510da4de8e7bbce07815fc05da576a3");
        } else {
            this.b = hVar;
        }
    }

    @Override // com.meituan.msc.jse.bridge.NativeModuleCallExceptionHandler
    public void handleException(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9b476b0b4cb01d3b437583e604fa946", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9b476b0b4cb01d3b437583e604fa946");
            return;
        }
        try {
            JSONObject a2 = a(exc);
            if (a2 == null) {
                g.a("[MSCModuleCallExceptionHandler@handleException]", "jsonObject null");
            } else {
                this.b.p.a(a2);
            }
        } catch (JSONException e) {
            g.a("[MSCModuleCallExceptionHandler@handleException]", e);
        }
    }

    public final JSONObject a(Exception exc) throws JSONException {
        a aVar;
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "097c662aad5884b0b1ecaea353409993", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "097c662aad5884b0b1ecaea353409993");
        }
        if (this.b == null || exc == null) {
            return null;
        }
        if (this.b.v && (exc instanceof m)) {
            return null;
        }
        com.meituan.crashreporter.c.a(exc, "MSC", false);
        Pair<String, Throwable> b = b(exc);
        if (b.d() && (aVar = (a) this.b.d(a.class)) != null) {
            aVar.a((String) b.first, (Throwable) b.second);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("message", "[SystemError]" + ((String) b.first));
        jSONObject.put("nativeStack", o.b(exc));
        jSONObject.put("isFatal", false);
        jSONObject.put("isNativeError", true);
        return jSONObject;
    }

    private Pair<String, Throwable> b(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adbe07fa98827b27075c5ace6476cd0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adbe07fa98827b27075c5ace6476cd0b");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(exc.getMessage() == null ? "Exception in native call from JS" : exc.getMessage());
        Throwable cause = exc.getCause();
        Throwable th = exc;
        while (cause != null) {
            sb.append("\n\n");
            sb.append(cause.getMessage());
            cause = cause.getCause();
            th = th.getCause();
        }
        if (exc instanceof JSException) {
            String str = ((JSException) exc).b;
            sb.append("\n\n");
            sb.append(str);
        }
        return new Pair<>(sb.toString(), th);
    }
}
