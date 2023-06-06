package com.meituan.mmp.lib.api.update;

import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.api.d;
import com.meituan.mmp.lib.engine.b;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UpdateManageApi extends ServiceApi {
    public static ChangeQuickRedirect a;
    private final b.a h;

    public UpdateManageApi(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3460b62b9451687c52ad85877f780235", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3460b62b9451687c52ad85877f780235");
        } else {
            this.h = aVar;
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af24400fc8698609e5cb224ca7c06454", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af24400fc8698609e5cb224ca7c06454") : new String[]{"applyUpdate"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a573d7882d1f964f2ad3c7055dc86a01", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a573d7882d1f964f2ad3c7055dc86a01") : new String[]{"applyUpdate", "onCheckForUpdate", "onUpdateReady", "onUpdateFailed"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) throws d {
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a2aea1a9b4e2de4f985d31d9d05fdd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a2aea1a9b4e2de4f985d31d9d05fdd9");
            return;
        }
        char c = 65535;
        if (str.hashCode() == -1812996649 && str.equals("applyUpdate")) {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        Object[] objArr2 = {jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b64223ffb72959ffd3c03dc18660da86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b64223ffb72959ffd3c03dc18660da86");
        } else {
            this.h.a(iApiCallback);
        }
    }
}
