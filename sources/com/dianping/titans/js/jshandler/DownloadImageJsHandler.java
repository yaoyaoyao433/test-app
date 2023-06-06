package com.dianping.titans.js.jshandler;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.titans.utils.ImageDownloadUtil;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DownloadImageJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68e3dd7bb65e2b7567da8d0e2e4444ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68e3dd7bb65e2b7567da8d0e2e4444ac");
            return;
        }
        final String sceneToken = getSceneToken();
        TitansPermissionUtil.checkSelfPermission(jsHost().getActivity(), PermissionGuard.PERMISSION_STORAGE, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.DownloadImageJsHandler.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.result.IRequestPermissionCallback
            public void onResult(boolean z, int i) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8807ec9c069778fe38cc6eec0b0b7e82", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8807ec9c069778fe38cc6eec0b0b7e82");
                } else if (!z) {
                    DownloadImageJsHandler downloadImageJsHandler = DownloadImageJsHandler.this;
                    downloadImageJsHandler.jsCallbackError(i, "application has no permission for external storage，sceneToken:" + sceneToken);
                } else if (DownloadImageJsHandler.this.jsHost() == null) {
                    DownloadImageJsHandler.this.jsCallbackError(5, "no host");
                } else {
                    Context context = DownloadImageJsHandler.this.jsHost().getContext();
                    if (context == null) {
                        DownloadImageJsHandler.this.jsCallbackError(5, "no context");
                        return;
                    }
                    String optString = DownloadImageJsHandler.this.jsBean().argsJson.optString("imageUrl");
                    if (TextUtils.isEmpty(optString)) {
                        DownloadImageJsHandler.this.jsCallbackError(KNBJsErrorInfo.Error_520_Params_Not_Enough.getErrorCode(), "imageUrl is null!");
                    } else {
                        ImageDownloadUtil.downloadFile(context, optString, sceneToken, new ImageDownloadUtil.DownloadCallback() { // from class: com.dianping.titans.js.jshandler.DownloadImageJsHandler.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.dianping.titans.utils.ImageDownloadUtil.DownloadCallback
                            public void onFail(KNBJsErrorInfo kNBJsErrorInfo) {
                                Object[] objArr3 = {kNBJsErrorInfo};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "d75414849008e08d56d2beffbbf2ed16", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "d75414849008e08d56d2beffbbf2ed16");
                                } else {
                                    DownloadImageJsHandler.this.jsCallbackError(kNBJsErrorInfo.getErrorCode(), kNBJsErrorInfo.getErrorMsg());
                                }
                            }

                            @Override // com.dianping.titans.utils.ImageDownloadUtil.DownloadCallback
                            public void onSuccess(String str) {
                                Object[] objArr3 = {str};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "0075a89689bb0abbb5df15e9648462f8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "0075a89689bb0abbb5df15e9648462f8");
                                } else {
                                    DownloadImageJsHandler.this.success(str);
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void success(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "304d797ce39fc7d6181392956afc7e7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "304d797ce39fc7d6181392956afc7e7d");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        jsCallback(jSONObject);
    }
}
