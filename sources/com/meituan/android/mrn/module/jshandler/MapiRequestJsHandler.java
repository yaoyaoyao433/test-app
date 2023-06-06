package com.meituan.android.mrn.module.jshandler;

import com.meituan.android.mrn.module.utils.a;
import com.meituan.android.mrn.module.utils.c;
import com.meituan.android.mrn.network.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MapiRequestJsHandler extends MRNBaseJsHandler {
    public static final String KEY = "MRN.mapi";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "crxM4XzefIXuLWP1CoDuYOtokJytHaC8TYRRiMmNDCxGM709WhglCZ0Ju8SW/tch2/WS2eD9mzajZaHLXXa5zw==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27d7d66c5eecc9b3ea6ed7f39e860edb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27d7d66c5eecc9b3ea6ed7f39e860edb");
            return;
        }
        JSONObject paramJSONObject = getParamJSONObject();
        if (paramJSONObject == null) {
            jsCallbackErrorMsg("MapiRequestJsHandler: paramsObj should not null");
        } else {
            new d(getCurrentActivity()).a(paramJSONObject, new c() { // from class: com.meituan.android.mrn.module.jshandler.MapiRequestJsHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.module.utils.c
                public final void a(JSONObject jSONObject) {
                    Object[] objArr2 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "afcecb0e6125bac99af94aa0c11379cb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "afcecb0e6125bac99af94aa0c11379cb");
                    } else {
                        MapiRequestJsHandler.this.jsCallback(jSONObject);
                    }
                }

                @Override // com.meituan.android.mrn.module.utils.c
                public final void a(String str, Throwable th, JSONObject jSONObject) {
                    Object[] objArr2 = {str, th, jSONObject};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "33a0eb5481525b8f182d58dd8ee02742", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "33a0eb5481525b8f182d58dd8ee02742");
                    } else {
                        MapiRequestJsHandler.this.jsCallback(a.a(str, th, jSONObject));
                    }
                }
            });
        }
    }
}
