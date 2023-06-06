package com.sankuai.waimai.bussiness.order.list.knb;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.model.c;
import com.sankuai.waimai.platform.utils.l;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetAppModel extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "e3S+s+fTXbASRXJ0b1rR1LkF3hJSqm/Yck84uzcGTGFKVgIU8k7DncJNzMai9KJ8P7WqWS6jBsDYfi6FFD07kQ==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "719de29c844a3c7043c5ecb9fd45f63a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "719de29c844a3c7043c5ecb9fd45f63a");
        } else {
            l.b(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.list.knb.GetAppModel.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "91b80128c354ffd9e732fe3929115199", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "91b80128c354ffd9e732fe3929115199");
                        return;
                    }
                    try {
                        int b = c.a().b();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("appModel", b);
                        GetAppModel.this.jsCallback(jSONObject);
                    } catch (Exception unused) {
                        GetAppModel.this.jsCallback(new JSONObject());
                    }
                }
            }, "");
        }
    }
}
