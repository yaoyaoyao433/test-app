package com.dianping.sdk.pike.knb;

import android.text.TextUtils;
import com.dianping.sdk.pike.h;
import com.dianping.sdk.pike.i;
import com.dianping.sdk.pike.j;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class RemoveTunnelStateListenerJsHandler extends BaseJsHandler {
    private static final String TAG = "RemoveTunnelStateListenerJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "XbHKXqkogDSK45HtzjUeU18Hs8xVJosetjwNb4kRg2QBDqlcwGfoGd3s/N+DOd+0S7WTbfqTaD87brvgYOlaOA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30c88493f59acc349a38eba22ec5520b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30c88493f59acc349a38eba22ec5520b");
            return;
        }
        try {
            i.a(TAG, "knb remove tunnel state listener exec");
            String optString = jsBean().argsJson.optString("bzId");
            a a = a.a();
            Object[] objArr2 = {optString, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "a0eba075363549ef35b22dbea6e117af", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "a0eba075363549ef35b22dbea6e117af");
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                j jVar = a.d.get(optString);
                if (jVar != null) {
                    h.b(optString, jVar);
                    a.d.remove(optString);
                }
                jsCallback();
            }
        } catch (Throwable th) {
            i.a(TAG, "knb remove tunnel state listener state ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
