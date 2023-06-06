package com.sankuai.eh.component.web.bridge.local;

import android.os.Looper;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected com.sankuai.eh.component.web.module.c b;
    public JsonObject c;

    public abstract void b();

    public final void a(com.sankuai.eh.component.web.module.c cVar) {
        this.b = cVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0898c2e3708a84f2ae3c8c036077324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0898c2e3708a84f2ae3c8c036077324");
            return;
        }
        try {
            b();
        } catch (Exception e) {
            com.sankuai.eh.component.service.tools.d.a(e);
        }
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e85f954f42b0e7bfeaec88c27d8b3d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e85f954f42b0e7bfeaec88c27d8b3d5");
            return;
        }
        Object[] objArr2 = new Object[2];
        Object[] objArr3 = {"callbackId"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        objArr2[0] = PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "a7ca5ee36127998bfc578d184dd415f7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "a7ca5ee36127998bfc578d184dd415f7") : com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(this.c, "callbackId"), "");
        objArr2[1] = str;
        String format = String.format("javascript:window.ehcNativeCallbackObj && window.ehcNativeCallbackObj.callback && window.ehcNativeCallbackObj.callback('%s', %s)", objArr2);
        if (this.b != null) {
            if (this.b.k != null) {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    this.b.k.evaluateJavascript(format, null);
                } else {
                    com.sankuai.eh.component.service.utils.thread.b.a().a(b.a(this, format));
                }
            } else if (this.b.m != null) {
                this.b.m.loadJs(format, null);
            }
        }
    }

    public static /* synthetic */ void a(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96e96f4a0a3edf0b177c84a6cf8f1381", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96e96f4a0a3edf0b177c84a6cf8f1381");
        } else {
            aVar.b.k.evaluateJavascript(str, null);
        }
    }

    public final void a(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "758228fb1eaa7a14bb6c65ad63c9f032", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "758228fb1eaa7a14bb6c65ad63c9f032");
            return;
        }
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        b.a aVar = new b.a(jsonObject);
        if (!jsonObject.has("status")) {
            aVar.a("status", "success");
        }
        if (!jsonObject.has("statusCode")) {
            aVar.a("statusCode", 1L);
        }
        b(aVar.toString());
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbfe493c2331e3cd57c8d648c2703740", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbfe493c2331e3cd57c8d648c2703740");
            return;
        }
        b.a aVar = new b.a();
        aVar.a("status", "fail");
        aVar.a("statusCode", 0L);
        aVar.a("errorMsg", str);
        b(aVar.toString());
    }
}
