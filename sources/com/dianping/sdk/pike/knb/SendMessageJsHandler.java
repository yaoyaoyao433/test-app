package com.dianping.sdk.pike.knb;

import android.text.TextUtils;
import com.dianping.sdk.pike.d;
import com.dianping.sdk.pike.i;
import com.dianping.sdk.pike.message.g;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SendMessageJsHandler extends BaseJsHandler {
    private static final String TAG = "SendMessageJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "GSlOpBU6ybqJHyFQY1Rxvt+HRuzbdbmtTJAXo4BesY9WjSEF4sVLVTDIPJWqx6kPLb3nijKtDV/HFqk2+YDsDQ==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c07e0552d88aed02b743547e6c867b38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c07e0552d88aed02b743547e6c867b38");
            return;
        }
        try {
            i.a(TAG, "knb send message exec");
            String optString = jsBean().argsJson.optString("bzId");
            String optString2 = jsBean().argsJson.optString("alias");
            String optString3 = jsBean().argsJson.optString("content");
            final a a = a.a();
            Object[] objArr2 = {optString, optString2, optString3, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "29350868a088921cd136e009442f38af", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "29350868a088921cd136e009442f38af");
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                d dVar = a.b.get(optString);
                if (dVar != null) {
                    g gVar = new g();
                    gVar.b = optString2;
                    gVar.c = optString3.getBytes();
                    dVar.a(gVar, new com.dianping.sdk.pike.a() { // from class: com.dianping.sdk.pike.knb.a.11
                        public static ChangeQuickRedirect a;

                        @Override // com.dianping.sdk.pike.a
                        public final void a(String str) {
                            Object[] objArr3 = {str};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "564b75eea652fcd39dae1ce19c621ba8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "564b75eea652fcd39dae1ce19c621ba8");
                            } else {
                                this.jsCallback();
                            }
                        }

                        @Override // com.dianping.sdk.pike.a
                        public final void a(int i, String str) {
                            Object[] objArr3 = {Integer.valueOf(i), str};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "184fd44bda2627b9252b30e01f68b9be", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "184fd44bda2627b9252b30e01f68b9be");
                            } else {
                                this.jsCallbackError(i, str);
                            }
                        }
                    });
                    return;
                }
                jsCallbackErrorMsg("start client first");
            }
        } catch (Throwable th) {
            i.a(TAG, "knb send message ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
