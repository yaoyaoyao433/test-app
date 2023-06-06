package com.meituan.mmp.lib.api.share;

import android.text.TextUtils;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.ab;
import com.meituan.mmp.lib.api.ActivityApi;
import com.meituan.mmp.lib.api.d;
import com.meituan.mmp.lib.api.s;
import com.meituan.mmp.lib.config.a;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.utils.bd;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShareUiApi extends ActivityApi {
    public static ChangeQuickRedirect h;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fed9e44e9a1df21eab140c29666cdb07", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fed9e44e9a1df21eab140c29666cdb07") : new String[]{"showShareMenu", "hideShareMenu", "buttonShare"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48dd6560755beaba92640919975cf364", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48dd6560755beaba92640919975cf364") : new String[]{"showShareMenu", "hideShareMenu", "buttonShare", "onShare"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) throws d {
        char c;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f801468cd8aaedd4af990ead19ca6155", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f801468cd8aaedd4af990ead19ca6155");
        } else if (a().a() && !DebugHelper.p && ("showShareMenu".equals(str) || "hideShareMenu".equals(str))) {
            throw new s();
        } else {
            int hashCode = str.hashCode();
            if (hashCode == -1770854451) {
                if (str.equals("buttonShare")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != -1333141828) {
                if (hashCode == 2071405409 && str.equals("showShareMenu")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (str.equals("hideShareMenu")) {
                    c = 1;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                    Object[] objArr2 = {jSONObject, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect2 = h;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3da0348f31c3b24162a1168d06858fc2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3da0348f31c3b24162a1168d06858fc2");
                        return;
                    }
                    a appConfig = getAppConfig();
                    MMPAppProp mMPAppProp = appConfig != null ? appConfig.l : null;
                    if (mMPAppProp == null || mMPAppProp.isEmpty() || TextUtils.isEmpty(mMPAppProp.mmpSdk.d)) {
                        iApiCallback.onFail(codeJson(-1, "invocation fail, appconfig is null"));
                        return;
                    } else if (bd.a(mMPAppProp.mmpSdk.d, "5.11.1") < 0 && !getAppConfig().h()) {
                        iApiCallback.onFail(codeJson(-1, "invocation is blocked, share button is disabled in appconfig"));
                        return;
                    } else {
                        String optString = jSONObject.optString("eventFrom", ShieldMonitorKey.TAG_BUSINESS);
                        if (!"framework".equals(optString) || getAppConfig().h()) {
                            boolean optBoolean = jSONObject.optBoolean("withShareTicket", false);
                            ab pageManager = getPageManager();
                            if (pageManager != null) {
                                pageManager.a(a(jSONObject), optBoolean, ShieldMonitorKey.TAG_BUSINESS.equals(optString));
                            }
                            iApiCallback.onSuccess(null);
                            return;
                        }
                        iApiCallback.onFail(codeJson(-1, "invocation from framework is blocked, share button is disabled in appconfig"));
                        return;
                    }
                case 1:
                    Object[] objArr3 = {jSONObject, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect3 = h;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3743ccd1cfe24c548d6c1dd8bb81fbe3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3743ccd1cfe24c548d6c1dd8bb81fbe3");
                        return;
                    }
                    String optString2 = jSONObject.optString("eventFrom", ShieldMonitorKey.TAG_BUSINESS);
                    if (!"framework".equals(optString2) || getAppConfig().h()) {
                        ab pageManager2 = getPageManager();
                        if (pageManager2 != null) {
                            pageManager2.c(a(jSONObject), ShieldMonitorKey.TAG_BUSINESS.equals(optString2));
                        }
                        iApiCallback.onSuccess(null);
                        return;
                    }
                    iApiCallback.onFail(codeJson(-1, "invocation from framework is blocked, share button is disabled in appconfig"));
                    return;
                case 2:
                    Object[] objArr4 = {jSONObject, iApiCallback};
                    ChangeQuickRedirect changeQuickRedirect4 = h;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "91cbb8b55e3041c26928cdb62864d756", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "91cbb8b55e3041c26928cdb62864d756");
                        return;
                    } else if (jSONObject != null) {
                        ab pageManager3 = getPageManager();
                        a("onShare", jSONObject.toString(), pageManager3 != null ? pageManager3.b() : -1);
                        iApiCallback.onSuccess(null);
                        return;
                    } else {
                        iApiCallback.onFail();
                        return;
                    }
                default:
                    return;
            }
        }
    }
}
