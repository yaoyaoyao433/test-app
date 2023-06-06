package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRuntime;
import com.sankuai.titans.CryptoManager;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class EncryptDataJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ecdceadc874672a8d0e408319132aa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ecdceadc874672a8d0e408319132aa6");
        } else if (jsBean().argsJson == null) {
            jsCallbackErrorMsg("no argsJson");
        } else {
            final String optString = jsBean().argsJson.optString("key");
            if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("no key");
                return;
            }
            final String optString2 = jsBean().argsJson.optString("data");
            if (TextUtils.isEmpty(optString2)) {
                jsCallbackErrorMsg("no data");
                return;
            }
            final String optString3 = jsBean().argsJson.optString("type");
            if (TextUtils.isEmpty(optString3)) {
                jsCallbackErrorMsg("no type");
            } else {
                KNBRuntime.getRuntime().executeOnThreadPool(new Runnable() { // from class: com.dianping.titans.js.jshandler.EncryptDataJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        String encryptByAES;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5f28a32e33fd446ac60a8c5c2b314147", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5f28a32e33fd446ac60a8c5c2b314147");
                            return;
                        }
                        try {
                            if (TextUtils.equals("RSA", optString3)) {
                                encryptByAES = CryptoManager.encryptByPublicKey(optString2, optString);
                            } else if (TextUtils.equals("AES", optString3)) {
                                encryptByAES = CryptoManager.encryptByAES(optString2, optString);
                            } else {
                                EncryptDataJsHandler encryptDataJsHandler = EncryptDataJsHandler.this;
                                encryptDataJsHandler.jsCallbackErrorMsg("illegal type = " + optString3);
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("data", encryptByAES);
                            EncryptDataJsHandler.this.jsCallback(jSONObject);
                        } catch (Exception e) {
                            EncryptDataJsHandler.this.jsCallbackErrorMsg(Log.getStackTraceString(e));
                        }
                    }
                });
            }
        }
    }
}
