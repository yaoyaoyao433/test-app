package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.meituan.android.clipboard.a;
import com.meituan.android.clipboard.b;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetClipboardJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "541bfc879ffd34c69fb24933d75f0e8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "541bfc879ffd34c69fb24933d75f0e8d");
            return;
        }
        final String sceneToken = getSceneToken();
        TitansPermissionUtil.checkSelfPermission(jsHost().getActivity(), PermissionGuard.PERMISSION_CLIPBOARD, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.GetClipboardJsHandler.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.result.IRequestPermissionCallback
            public void onResult(boolean z, int i) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2743d9dfa63216c7d204402ac1c5eb66", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2743d9dfa63216c7d204402ac1c5eb66");
                } else if (!z) {
                    GetClipboardJsHandler getClipboardJsHandler = GetClipboardJsHandler.this;
                    getClipboardJsHandler.jsCallbackError(i, "no permission for clipboard，sceneToken:" + sceneToken);
                } else {
                    CharSequence a = a.a(GetClipboardJsHandler.this.getSceneToken(), "knb", (b) null);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        boolean isEmpty = TextUtils.isEmpty(a);
                        String str = a;
                        if (isEmpty) {
                            str = "";
                        }
                        jSONObject.put("data", str);
                        GetClipboardJsHandler.this.jsCallback(jSONObject);
                    } catch (Exception e) {
                        GetClipboardJsHandler.this.jsCallbackError(3200, e.getMessage());
                    }
                }
            }
        });
    }
}
