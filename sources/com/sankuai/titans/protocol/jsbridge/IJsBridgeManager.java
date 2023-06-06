package com.sankuai.titans.protocol.jsbridge;

import android.content.Context;
import com.sankuai.titans.protocol.adaptor.IAppTitansInfo;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IJsBridgeManager {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface VerifyCallback {
        void onFail(JsHandlerResultInfo jsHandlerResultInfo);

        void onSuccess();
    }

    void init(IAppTitansInfo iAppTitansInfo, Context context, String str);

    void verify(String str, String str2, boolean z, VerifyCallback verifyCallback);
}
