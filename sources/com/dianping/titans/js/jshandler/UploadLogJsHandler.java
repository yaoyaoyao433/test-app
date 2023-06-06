package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.dianping.networklog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class UploadLogJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static WeakReference<UploadLogJsHandler> jsHandlerWeakReference;
    private static c.a lisenterUploadStatus = new c.a() { // from class: com.dianping.titans.js.jshandler.UploadLogJsHandler.1
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.dianping.networklog.c.a
        public final void onLisenterUploadLogStatus(String str, int i) {
            UploadLogJsHandler uploadLogJsHandler;
            Object[] objArr = {str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92db13b36ec37aaa64c39fa85a2d7f8f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92db13b36ec37aaa64c39fa85a2d7f8f");
                return;
            }
            c.a("logan onLisenterUploadLogStatus name: " + str + " status: " + i, 35);
            c.a((c.a) null);
            if (UploadLogJsHandler.jsHandlerWeakReference == null || (uploadLogJsHandler = (UploadLogJsHandler) UploadLogJsHandler.jsHandlerWeakReference.get()) == null) {
                return;
            }
            if (i == -103) {
                uploadLogJsHandler.jsCallback();
            } else {
                uploadLogJsHandler.jsCallbackError(i, "Log upload fail");
            }
        }
    };

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74735de1669142c2a5d314e4561a0cb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74735de1669142c2a5d314e4561a0cb0");
            return;
        }
        JSONObject jSONObject = jsBean().argsJson;
        if (!"Logan".equals(jSONObject.optString("type", "Logan"))) {
            jsCallbackError(521, "no this component type!");
            return;
        }
        String optString = jSONObject.optString("bizId", "");
        if (TextUtils.isEmpty(optString)) {
            jsCallbackError(520, "bizId can not be empty");
            return;
        }
        String[] strArr = {jSONObject.optString("date", "")};
        String uuid = GetUUID.getInstance().getUUID(jsHost().getContext());
        jsHandlerWeakReference = new WeakReference<>(this);
        c.a(lisenterUploadStatus);
        c.a(strArr, uuid, optString);
    }
}
