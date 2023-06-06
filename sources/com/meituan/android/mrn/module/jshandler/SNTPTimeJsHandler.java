package com.meituan.android.mrn.module.jshandler;

import com.facebook.common.logging.a;
import com.meituan.android.time.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SNTPTimeJsHandler extends MRNBaseJsHandler {
    public static final String KEY = "MRN.currentSNTPTimeInterval";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "cm6chqQMBctTgsm+sfz/WykUqQFg/DvIFfiR4/WPiF4vzUlPzN+L8WhuDuvwbuyswDQgvGrYnEDT/BhjMXcbuA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a726142e752f790c9e1e72973c9f6ce1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a726142e752f790c9e1e72973c9f6ce1");
            return;
        }
        try {
            String valueOf = String.valueOf(c.b());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", valueOf);
            jsCallback(jSONObject);
        } catch (Exception e) {
            jsCallbackErrorMsg("MRNSntpJsHandler:" + e.getMessage());
            a.d("MRNSntpJsHandler", e.getMessage(), e);
        }
    }
}
