package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.dianping.titans.offline.OfflineCenter;
import com.dianping.titans.offline.OfflineException;
import com.dianping.titans.offline.entity.OfflineHornConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetOfflineBundleJsHandler extends BaseJsHandler {
    private static final String KEY_ENV = "env";
    private static final String KEY_NAME = "bundleName";
    private static final String KEY_SCOPE = "scope";
    private static final String KEY_TEST = "test";
    private static final String KEY_VERSION = "bundleVersion";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24fa4af9dffece5f5c85f0f7e94dd57b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24fa4af9dffece5f5c85f0f7e94dd57b");
            return;
        }
        String optString = jsBean().argsJson.optString("bundleName");
        String optString2 = jsBean().argsJson.optString(KEY_VERSION);
        String optString3 = jsBean().argsJson.optString("env", "test");
        String optString4 = jsBean().argsJson.optString("scope");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2) || TextUtils.isEmpty(optString4)) {
            jsCallbackError(1103, "args error");
            return;
        }
        OfflineHornConfig offlineHornConfig = new OfflineHornConfig();
        offlineHornConfig.setScope(optString4);
        offlineHornConfig.setBundleName(optString);
        offlineHornConfig.setVersion(optString2);
        offlineHornConfig.setListener(new OfflineHornConfig.IRequestListener() { // from class: com.dianping.titans.js.jshandler.GetOfflineBundleJsHandler.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.titans.offline.entity.OfflineHornConfig.IRequestListener
            public void onFinished(OfflineHornConfig offlineHornConfig2, Throwable th) {
                Object[] objArr2 = {offlineHornConfig2, th};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cea5f093e2f38426d2f97a56d360925f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cea5f093e2f38426d2f97a56d360925f");
                } else if (th == null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("bundleName", offlineHornConfig2.getBundleName());
                        jSONObject.put(GetOfflineBundleJsHandler.KEY_VERSION, offlineHornConfig2.getVersion());
                        GetOfflineBundleJsHandler.this.jsCallback(jSONObject);
                    } catch (Exception e) {
                        GetOfflineBundleJsHandler.this.jsCallbackError(1103, e.getMessage());
                    }
                } else if (th instanceof OfflineException) {
                    GetOfflineBundleJsHandler.this.jsCallbackError(((OfflineException) th).getCode(), th.getMessage());
                } else {
                    GetOfflineBundleJsHandler.this.jsCallbackError(1103, th.getMessage());
                }
            }
        });
        OfflineCenter.getInstance().downLoadBundle(Collections.singletonList(offlineHornConfig), optString3.equals("test"), true);
    }
}
