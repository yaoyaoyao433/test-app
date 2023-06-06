package com.dianping.titans.js.jshandler;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.networklog.c;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.upload.OnUploadFileCompleted;
import com.sankuai.meituan.android.knb.upload.UploadFileManager;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class UploadFileJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "246492e84ef8ac951454ec39bc96d4b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "246492e84ef8ac951454ec39bc96d4b3");
        } else if (jsBean().argsJson == null) {
            jsCallbackError(520, UploadFileManager.ERROR_MSG_520);
        } else if (TextUtils.isEmpty(jsBean().argsJson.optString(QuickReportConstants.CONFIG_FILE_NAME))) {
            jsCallbackError(521, UploadFileManager.ERROR_MSG_521);
        } else {
            final String sceneToken = getSceneToken();
            final String url = jsHost().getUrl();
            TitansPermissionUtil.requestPermission(jsHost().getActivity(), PermissionGuard.PERMISSION_STORAGE_READ, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.UploadFileJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1b4db7165ac8e600cecd0a909154dd45", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1b4db7165ac8e600cecd0a909154dd45");
                    } else if (!z) {
                        UploadFileJsHandler uploadFileJsHandler = UploadFileJsHandler.this;
                        uploadFileJsHandler.jsCallbackError(i, "no permission for storage read，sceneToken:" + sceneToken);
                    } else {
                        UploadFileManager.uploadFile(url, UploadFileJsHandler.this.jsBean().argsJson, new OnUploadFileCompleted() { // from class: com.dianping.titans.js.jshandler.UploadFileJsHandler.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // com.sankuai.meituan.android.knb.upload.OnUploadFileCompleted
                            public Context getContext() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "fdd621ef1ead76e42ac5c27fcb60df2f", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "fdd621ef1ead76e42ac5c27fcb60df2f") : UploadFileJsHandler.this.jsHost().getContext();
                            }

                            @Override // com.sankuai.meituan.android.knb.upload.OnUploadFileCompleted
                            public void onSuccess(String str, String str2, String str3, int i2) {
                                Object[] objArr3 = {str, str2, str3, Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "cdaa64a13c2fb9ceb68379ef9de29e8b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "cdaa64a13c2fb9ceb68379ef9de29e8b");
                                    return;
                                }
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("status", "success");
                                    jSONObject.put("url", str2);
                                    jSONObject.put("venusToken", str3);
                                    jSONObject.put("errorCode", i2);
                                    if (str != null) {
                                        jSONObject.put("result", str);
                                    }
                                } catch (JSONException unused) {
                                }
                                UploadFileJsHandler.this.jsCallback(jSONObject);
                            }

                            @Override // com.sankuai.meituan.android.knb.upload.OnUploadFileCompleted
                            public void onError(String str, int i2, String str2, int i3) {
                                Object[] objArr3 = {str, Integer.valueOf(i2), str2, Integer.valueOf(i3)};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6d455e59a277bf235a4048e52d4c550f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6d455e59a277bf235a4048e52d4c550f");
                                    return;
                                }
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("status", "fail");
                                    jSONObject.put("serverCode", i3);
                                    jSONObject.put("serverMessage", str2);
                                    jSONObject.put("errorCode", i2);
                                    jSONObject.put("errMsg", str);
                                    c.a(jSONObject.toString(), 3, new String[]{"uploadfileerror"});
                                } catch (JSONException unused) {
                                }
                                UploadFileJsHandler.this.jsCallback(jSONObject);
                            }

                            @Override // com.sankuai.meituan.android.knb.upload.OnUploadFileCompleted
                            public String getSceneToken() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2c9c16abd15a37e8b34e8bc8fda28d32", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2c9c16abd15a37e8b34e8bc8fda28d32") : UploadFileJsHandler.this.getSceneToken();
                            }
                        });
                    }
                }
            });
        }
    }
}
