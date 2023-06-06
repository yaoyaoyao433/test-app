package com.meituan.android.neohybrid.v2.neo.bridge.presenter.kit;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.neohybrid.util.gson.b;
import com.meituan.android.neohybrid.v2.neo.bridge.handler.a;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DecryptBridgeHandler extends a {
    public static ChangeQuickRedirect d;

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.handler.b
    @NonNull
    public final String a() {
        return "pay_decrypt";
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.handler.a, com.meituan.android.neohybrid.v2.neo.bridge.handler.b
    public final void a(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36cf9eef61ccbcc29c45789373b3da47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36cf9eef61ccbcc29c45789373b3da47");
            return;
        }
        super.a(aVar, str);
        DecryptBean decryptBean = (DecryptBean) b.a().fromJson(str, (Class<Object>) DecryptBean.class);
        if (decryptBean == null) {
            a(-2, "params error", null);
        } else {
            new com.meituan.android.paybase.asynctask.a<DecryptBean, String, DecryptResult>() { // from class: com.meituan.android.neohybrid.v2.neo.bridge.presenter.kit.DecryptBridgeHandler.1
                public static ChangeQuickRedirect a;

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.meituan.android.paybase.asynctask.b
                public DecryptResult a(DecryptBean... decryptBeanArr) {
                    Object[] objArr2 = {decryptBeanArr};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c076134400eb320123b1fc004301b25b", RobustBitConfig.DEFAULT_VALUE)) {
                        return (DecryptResult) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c076134400eb320123b1fc004301b25b");
                    }
                    if (decryptBeanArr == null || decryptBeanArr.length != 1) {
                        return null;
                    }
                    DecryptBean decryptBean2 = decryptBeanArr[0];
                    try {
                        DecryptResult decryptResult = new DecryptResult();
                        decryptResult.decryptData = com.meituan.android.neohybrid.v2.neo.http.encrypt.a.a(new String(c.a(decryptBean2.aesKey)), decryptBean2.encryptRes);
                        DecryptBridgeHandler.this.a((JsonObject) b.a().toJsonTree(decryptResult));
                    } catch (PayException unused) {
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.addProperty("errorCode", (Number) (-1));
                        jsonObject.addProperty("errorMessage", "解密错误");
                        DecryptBridgeHandler.this.a(-2, "数据加载繁忙，请稍后再试", jsonObject);
                    } catch (Exception unused2) {
                        DecryptBridgeHandler.this.a(-2, "decrypt error", null);
                    }
                    return null;
                }
            }.b(decryptBean);
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static class DecryptBean implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("aes_key")
        private String aesKey;
        @SerializedName("encrypt_res")
        private String encryptRes;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static class DecryptResult implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("decrypt_data")
        private String decryptData;

        public DecryptResult() {
        }
    }
}
