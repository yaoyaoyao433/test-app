package com.meituan.android.mrn.module.jshandler.pageRouter;

import android.support.annotation.CallSuper;
import com.meituan.android.mrn.module.jshandler.MRNBaseJsHandler;
import com.meituan.android.mrn.router.e;
import com.meituan.android.mrn.router.f;
import com.meituan.android.mrn.utils.g;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class PageRouterBaseJsHandler extends MRNBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected f mPageRouter;

    public f getPageRouter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b590ae8ddef557337e3003528ade287f", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b590ae8ddef557337e3003528ade287f") : new f(getCurrentActivity());
    }

    public static e convertOpenPageOption(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "675f772b468fe89c72d9e6fda3f68952", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "675f772b468fe89c72d9e6fda3f68952") : convertOpenPageOption(jSONObject, false);
    }

    public static e convertOpenPageOption(JSONObject jSONObject, boolean z) {
        Object[] objArr = {jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86bfeb25b378273be6e79faa8facbcff", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86bfeb25b378273be6e79faa8facbcff");
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        e eVar = new e();
        eVar.a = jSONObject.optString("action", null);
        if (z) {
            jSONObject.remove("action");
        }
        eVar.b = jSONObject.optString("category", null);
        if (z) {
            jSONObject.remove("category");
        }
        eVar.c = jSONObject.optString("className", null);
        if (z) {
            jSONObject.remove("className");
        }
        eVar.d = jSONObject.optString("packageName", null);
        if (z) {
            jSONObject.remove("packageName");
        }
        eVar.e = jSONObject.optString("type", null);
        if (z) {
            jSONObject.remove("type");
        }
        eVar.f = jSONObject.optInt(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, 1);
        if (z) {
            jSONObject.remove(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY);
        }
        eVar.g = jSONObject.optBoolean("isPresent", false);
        if (z) {
            jSONObject.remove("isPresent");
        }
        eVar.h = jSONObject.optBoolean("isForResult", true);
        if (z) {
            jSONObject.remove("isForResult");
        }
        eVar.i = jSONObject.optBoolean("limitToPackage", true);
        if (z) {
            jSONObject.remove("limitToPackage");
        }
        eVar.j = g.b(jSONObject.optJSONObject("extraArgs"));
        if (z) {
            jSONObject.remove("extraArgs");
        }
        eVar.k = jSONObject.optBoolean("checkEncode", true);
        if (z) {
            jSONObject.remove("checkEncode");
        }
        eVar.l = jSONObject.optBoolean("overridePendingTransition", false);
        if (z) {
            jSONObject.remove("overridePendingTransition");
        }
        eVar.m = jSONObject.optString("enterAnim", null);
        if (z) {
            jSONObject.remove("enterAnim");
        }
        eVar.n = jSONObject.optString("exitAnim", null);
        if (z) {
            jSONObject.remove("exitAnim");
        }
        eVar.o = jSONObject.optBoolean("isTransparent", false);
        if (z) {
            jSONObject.remove("isTransparent");
        }
        eVar.p = jSONObject.optBoolean("hideLoading", false);
        if (z) {
            jSONObject.remove("hideLoading");
        }
        return eVar;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    @CallSuper
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ffc120103d39a8d4c71218ecc28caf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ffc120103d39a8d4c71218ecc28caf6");
        } else {
            this.mPageRouter = getPageRouter();
        }
    }
}
