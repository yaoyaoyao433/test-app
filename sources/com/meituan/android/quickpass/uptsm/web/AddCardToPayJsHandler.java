package com.meituan.android.quickpass.uptsm.web;

import com.meituan.android.quickpass.uptsm.common.utils.a;
import com.meituan.android.quickpass.uptsm.common.utils.h;
import com.meituan.android.quickpass.uptsm.manage.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AddCardToPayJsHandler extends TSMBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static AddCardToPayJsHandler reference;

    public static AddCardToPayJsHandler get() {
        return reference;
    }

    public AddCardToPayJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b73dfe47a31f4ad73aa509d94d0b9947", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b73dfe47a31f4ad73aa509d94d0b9947");
            return;
        }
        h.b("AddCardToPayJsHandler instance:" + this);
        reference = this;
    }

    @Override // com.meituan.android.quickpass.uptsm.web.TSMBaseJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7669a172fd9b83c165d6576cc78f3dc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7669a172fd9b83c165d6576cc78f3dc0");
            return;
        }
        super.exec();
        a.a("b_1d8194g3", "c_5ifn958x", (Object) null);
        jsHost().getActivity().getWindow().addFlags(128);
        b a = b.a.a();
        JSONObject jSONObject = jsBean().argsJson;
        int a2 = a.a(jSONObject.optString("primaryAccountNumber"), jSONObject.optString("phone"));
        if (a2 != 0) {
            a.a("b_ypkew9qw", "c_5ifn958x", "绑卡同步返回失败", a2);
            jsCallBackError(a2, "加密数据出错（" + a2 + "）");
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cd4e503773184c4a025b8d666bebc49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cd4e503773184c4a025b8d666bebc49");
            return;
        }
        super.onDestroy();
        reference = null;
        jsHost().getActivity().getWindow().clearFlags(128);
    }
}
