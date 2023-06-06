package com.dianping.sdk.pike.knb;

import android.text.TextUtils;
import com.dianping.sdk.pike.d;
import com.dianping.sdk.pike.i;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AddAliasJsHandler extends BaseJsHandler {
    private static final String TAG = "AddAliasJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "Pjhi8MJ05s5BJxeXKT7qVlcuHbYISiGcs3UiGKswg9ypPMCDibIhBwzxLQIpUBC2e6uULcQXi+LVTN9OqskY+A==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6528f696ad3b026191905ad89ad7c111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6528f696ad3b026191905ad89ad7c111");
            return;
        }
        try {
            i.a(TAG, "knb add alias exec");
            String optString = jsBean().argsJson.optString("bzId");
            String optString2 = jsBean().argsJson.optString("alias");
            final a a = a.a();
            Object[] objArr2 = {optString, optString2, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "b7be6da440dfde67d4e05bfdccbf813a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "b7be6da440dfde67d4e05bfdccbf813a");
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                d dVar = a.b.get(optString);
                if (dVar != null) {
                    dVar.a(optString2, new com.dianping.sdk.pike.a() { // from class: com.dianping.sdk.pike.knb.a.7
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.sdk.pike.a
                        public final void a(String str) {
                            Object[] objArr3 = {str};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a78ad42e6054991e618aff64892d728d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a78ad42e6054991e618aff64892d728d");
                            } else {
                                this.jsCallback();
                            }
                        }

                        @Override // com.dianping.sdk.pike.a
                        public final void a(int i, String str) {
                            Object[] objArr3 = {Integer.valueOf(i), str};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f3a6a3ed14e315b2fe299fade655cfff", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f3a6a3ed14e315b2fe299fade655cfff");
                            } else {
                                this.jsCallbackError(i, str);
                            }
                        }
                    });
                } else {
                    jsCallbackErrorMsg("start client first");
                }
            }
        } catch (Throwable th) {
            i.a(TAG, "knb add alias ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
