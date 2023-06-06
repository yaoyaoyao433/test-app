package com.meituan.android.mrn.module.jshandler;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.android.mrn.engine.u;
import com.meituan.android.mrn.engine.z;
import com.meituan.android.mrn.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MRNDeepPreLoadJsHandler extends MRNBaseJsHandler {
    public static final String KEY = "MRN.preLoadByPageURL";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d634410b733472ebad5ab6d616bfc2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d634410b733472ebad5ab6d616bfc2e");
            return;
        }
        JSONObject paramJSONObject = getParamJSONObject();
        if (paramJSONObject == null) {
            jsCallbackErrorMsg("MRNDeepPreLoadModule: paramsObj should not null");
            return;
        }
        String optString = paramJSONObject.optString("pageUrl");
        if (TextUtils.isEmpty(optString)) {
            jsCallbackErrorMsg("pageUrl is empty");
        }
        try {
            Uri parse = Uri.parse(optString);
            String queryParameter = parse.getQueryParameter("mrn_biz");
            String queryParameter2 = parse.getQueryParameter("mrn_entry");
            final String queryParameter3 = parse.getQueryParameter("mrn_component");
            if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(queryParameter2) && !TextUtils.isEmpty(queryParameter3)) {
                final String format = String.format("rn_%s_%s", queryParameter, queryParameter2);
                final Bundle bundle = new Bundle();
                for (String str : parse.getQueryParameterNames()) {
                    bundle.putString(str, parse.getQueryParameter(str));
                }
                final Context context = jsHost().getContext();
                Object[] objArr2 = {context, format, null, queryParameter3, bundle};
                ChangeQuickRedirect changeQuickRedirect3 = u.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "c3cd7f11135f9ed765f17717fab17e84", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "c3cd7f11135f9ed765f17717fab17e84");
                } else {
                    Object[] objArr3 = {context, format, null, null, queryParameter3, bundle};
                    ChangeQuickRedirect changeQuickRedirect4 = u.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect4, true, "d4aa2c2e178ebba707eedb124876607d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect4, true, "d4aa2c2e178ebba707eedb124876607d");
                    } else {
                        Object[] objArr4 = {context, format, null, null, queryParameter3, bundle, null};
                        ChangeQuickRedirect changeQuickRedirect5 = u.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect5, true, "cdb912a10c7c0a2bd4dc5e4d3a44ac59", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect5, true, "cdb912a10c7c0a2bd4dc5e4d3a44ac59");
                        } else if (context != null && !TextUtils.isEmpty(queryParameter3)) {
                            p.a("[MRNManger@preLoadJsBundleDeep]", format);
                            z.a(context);
                            MRNBundleManager.createInstance(context).executeWhenBaseInitialized(new Runnable() { // from class: com.meituan.android.mrn.engine.u.4
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "567f43a5da8e50b20f9823da3943bb26", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "567f43a5da8e50b20f9823da3943bb26");
                                    } else {
                                        w.a(context.getApplicationContext(), format, r3, queryParameter3, bundle, r6);
                                    }
                                }
                            });
                        }
                    }
                }
                jsCallback();
                return;
            }
            jsCallbackErrorMsg("query should not be null");
        } catch (Throwable th) {
            jsCallbackErrorMsg("Error:" + th.getMessage());
        }
    }
}
