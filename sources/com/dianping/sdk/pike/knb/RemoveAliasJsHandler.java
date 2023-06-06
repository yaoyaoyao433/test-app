package com.dianping.sdk.pike.knb;

import com.dianping.sdk.pike.i;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class RemoveAliasJsHandler extends BaseJsHandler {
    private static final String TAG = "RemoveAliasJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "seO16t1fRmxsuFVq3IZY1Qcb9kv0GMJAZ8jqrwSt075Rta7my2ozc5uClqVJmFKToAtG33k2u6ECEyAnsI6H5w==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6c58c0dd899de0efa6e91e06e29ee85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6c58c0dd899de0efa6e91e06e29ee85");
            return;
        }
        try {
            i.a(TAG, "knb remove alias exec");
            a.a().a(jsBean().argsJson.optString("bzId"), jsBean().argsJson.optString("alias"), this);
        } catch (Throwable th) {
            i.a(TAG, "knb remove alias ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
