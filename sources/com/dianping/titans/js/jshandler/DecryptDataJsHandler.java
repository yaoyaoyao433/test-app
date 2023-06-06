package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRuntime;
import com.sankuai.titans.CryptoManager;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DecryptDataJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65ad9d00a9e6e4c6c3751f4d6e924493", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65ad9d00a9e6e4c6c3751f4d6e924493");
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
                KNBRuntime.getRuntime().executeOnThreadPool(new Runnable() { // from class: com.dianping.titans.js.jshandler.DecryptDataJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        String decryptByAES;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "54529e64b3c802a4f17968fa37c57feb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "54529e64b3c802a4f17968fa37c57feb");
                            return;
                        }
                        try {
                            if (TextUtils.equals("RSA", optString3)) {
                                decryptByAES = CryptoManager.decryptByPublicKey(optString2, optString);
                            } else if (TextUtils.equals("AES", optString3)) {
                                decryptByAES = CryptoManager.decryptByAES(optString2, optString);
                            } else {
                                DecryptDataJsHandler decryptDataJsHandler = DecryptDataJsHandler.this;
                                decryptDataJsHandler.jsCallbackErrorMsg("illegal type = " + optString3);
                                return;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("data", decryptByAES);
                            DecryptDataJsHandler.this.jsCallback(jSONObject);
                        } catch (Exception e) {
                            DecryptDataJsHandler.this.jsCallbackErrorMsg(e.getMessage());
                        }
                    }
                });
            }
        }
    }
}
