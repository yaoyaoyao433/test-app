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
public class StartClientJsHandler extends BaseJsHandler {
    private static final String TAG = "StartClientJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "rvHhIG8SOblxWzqzMk/BrtkL77kt7jY+Wrpo+fyWyX7/dkz5fI3/YlUZ8BYoTauI3vDo14UrOng0obxitPJvXg==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4568ff5c013f97416f81c6cacb6f18e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4568ff5c013f97416f81c6cacb6f18e7");
            return;
        }
        try {
            i.a(TAG, "knb start client exec");
            String optString = jsBean().argsJson.optString("bzId");
            a a = a.a();
            Object[] objArr2 = {optString, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "b520c0a863a7cfca42fcb5c03d33a44c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "b520c0a863a7cfca42fcb5c03d33a44c");
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                d dVar = a.b.get(optString);
                if (dVar != null) {
                    dVar.a();
                    jsCallback();
                    return;
                }
                jsCallbackErrorMsg("init client first");
            }
        } catch (Throwable th) {
            i.a(TAG, "knb start client ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
