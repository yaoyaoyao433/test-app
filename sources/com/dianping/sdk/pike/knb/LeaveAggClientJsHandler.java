package com.dianping.sdk.pike.knb;

import android.text.TextUtils;
import com.dianping.sdk.pike.i;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LeaveAggClientJsHandler extends BaseJsHandler {
    private static final String TAG = "LeaveAggClientJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "tp0Emo7Iu6H8TvCwVXNBeEAuzNP/4XI57kJrF51pUjcG3sfDLMZ0fdleuT97pQjmzj/J1h9ILBvtefSEMlOKmg==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a64e5e0f8cb702b9947071a6c17f2bd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a64e5e0f8cb702b9947071a6c17f2bd7");
            return;
        }
        try {
            i.a(TAG, "knb leave agg client exec");
            String optString = jsBean().argsJson.optString("bzId");
            final a a = a.a();
            Object[] objArr2 = {optString, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "5c75c020fe800bf089dc31b6fdc34310", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "5c75c020fe800bf089dc31b6fdc34310");
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                com.dianping.sdk.pike.agg.a aVar = a.c.get(optString);
                if (aVar != null) {
                    aVar.b(new com.dianping.sdk.pike.a() { // from class: com.dianping.sdk.pike.knb.a.3
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.sdk.pike.a
                        public final void a(String str) {
                            Object[] objArr3 = {str};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "887f5aa5038edfdadff460f73167898f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "887f5aa5038edfdadff460f73167898f");
                            } else {
                                this.jsCallback();
                            }
                        }

                        @Override // com.dianping.sdk.pike.a
                        public final void a(int i, String str) {
                            Object[] objArr3 = {Integer.valueOf(i), str};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a511d9678ac2ab6be536778daa2a24da", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a511d9678ac2ab6be536778daa2a24da");
                            } else {
                                this.jsCallbackError(i, str);
                            }
                        }
                    });
                } else {
                    jsCallbackErrorMsg("init agg client first");
                }
            }
        } catch (Throwable th) {
            i.a(TAG, "knb leave agg client ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
