package com.sankuai.waimai.alita.core.jsexecutor;

import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.model.Encoding;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e implements Encoding {
    public static ChangeQuickRedirect a;
    private h b;
    private String c;

    public e(String str, h hVar) {
        Object[] objArr = {str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b38f8c243a7cb55d67814517bf00641", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b38f8c243a7cb55d67814517bf00641");
            return;
        }
        this.c = str;
        this.b = hVar;
    }

    @Override // com.dianping.jscore.model.Encoding
    public final JSONObject encode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b3e3ba3b9f2f3a7e5ceb0db1b498148", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b3e3ba3b9f2f3a7e5ceb0db1b498148") : new JSONObject();
    }

    @Override // com.dianping.jscore.model.Encoding
    public final String[] getFunctionNames() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70da7c4bd7ea82ed5d8fe69b0a75662a", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70da7c4bd7ea82ed5d8fe69b0a75662a") : new String[]{"invokeNativeModule"};
    }

    @Override // com.dianping.jscore.model.Encoding
    public final JavaScriptInterface[] getFunctions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97117151b207a6859a8912a85fedffc2", RobustBitConfig.DEFAULT_VALUE) ? (JavaScriptInterface[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97117151b207a6859a8912a85fedffc2") : new JavaScriptInterface[]{new com.sankuai.waimai.alita.core.jsexecutor.jsinterface.a(this.c, this.b)};
    }
}
