package com.meituan.android.common.aidata.cep;

import com.meituan.robust.ChangeQuickRedirect;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CustomCepContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String cepUniqueId;
    public String cepVer;
    public JSONObject mReturnResult;

    public JSONObject getReturnResult() {
        return this.mReturnResult;
    }
}
