package com.dianping.sdk.pike.knb;

import android.text.TextUtils;
import com.dianping.sdk.pike.i;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class JoinAggClientJsHandler extends BaseJsHandler {
    private static final String TAG = "JoinAggClientJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "QfiPSL0cIicq4ISV40YhPPkA3VCjeSR3YNNyO7/45yN0qhY99S8ANRV3e2QNg+s5GGq/Fwv0zuP+w5w5yF2ZWA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27d913fae2da697022dd6fc51cf57168", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27d913fae2da697022dd6fc51cf57168");
            return;
        }
        try {
            i.a(TAG, "knb join agg client exec");
            String optString = jsBean().argsJson.optString("bzId");
            String optString2 = jsBean().argsJson.optString("aggId");
            final a a = a.a();
            Object[] objArr2 = {optString, optString2, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "39dfe4905f6a7418a3890e5c0c4e1b94", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "39dfe4905f6a7418a3890e5c0c4e1b94");
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                com.dianping.sdk.pike.agg.a aVar = a.c.get(optString);
                if (aVar != null) {
                    aVar.a();
                    aVar.b(optString2, new com.dianping.sdk.pike.a() { // from class: com.dianping.sdk.pike.knb.a.2
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.sdk.pike.a
                        public final void a(String str) {
                            Object[] objArr3 = {str};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ebd0ddc0e6a81623cef1978a40141bbc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ebd0ddc0e6a81623cef1978a40141bbc");
                            } else {
                                this.jsCallback();
                            }
                        }

                        @Override // com.dianping.sdk.pike.a
                        public final void a(int i, String str) {
                            Object[] objArr3 = {Integer.valueOf(i), str};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c11551f0c8f2f4733ab62425bec27ec1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c11551f0c8f2f4733ab62425bec27ec1");
                            } else {
                                this.jsCallbackError(i, str);
                            }
                        }
                    });
                    return;
                }
                jsCallbackErrorMsg("init agg client first");
            }
        } catch (Throwable th) {
            i.a(TAG, "knb join agg client ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
