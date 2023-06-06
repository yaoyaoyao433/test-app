package com.meituan.android.neohybrid.v2.neo.bridge.presenter.kit;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.neohybrid.util.g;
import com.meituan.android.neohybrid.util.gson.b;
import com.meituan.android.neohybrid.v2.neo.bridge.handler.a;
import com.meituan.android.neohybrid.v2.neo.http.encrypt.b;
import com.meituan.android.paybase.utils.c;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class EncryptBridgeHandler extends a {
    public static ChangeQuickRedirect d;

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.handler.b
    @NonNull
    public final String a() {
        return "pay_encrypt";
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.handler.a, com.meituan.android.neohybrid.v2.neo.bridge.handler.b
    public final void a(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58b1bbb8654114121ca92b9ba504fae0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58b1bbb8654114121ca92b9ba504fae0");
            return;
        }
        super.a(aVar, str);
        Map<String, String> map = (Map) b.a().fromJson(str, g.d.b);
        if (i.a(map)) {
            a(-2, "params error", null);
        } else {
            new com.meituan.android.paybase.asynctask.a<Map<String, String>, String, b.a>() { // from class: com.meituan.android.neohybrid.v2.neo.bridge.presenter.kit.EncryptBridgeHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paybase.asynctask.b
                public final /* synthetic */ Object a(Object[] objArr2) {
                    Map[] mapArr = (Map[]) objArr2;
                    Object[] objArr3 = {mapArr};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "a57e4612bff2b4bfa797e197d110f86f", RobustBitConfig.DEFAULT_VALUE)) {
                        return (b.a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "a57e4612bff2b4bfa797e197d110f86f");
                    }
                    if (mapArr == null || mapArr.length != 1) {
                        return null;
                    }
                    return com.meituan.android.neohybrid.v2.neo.http.encrypt.b.a(mapArr[0]);
                }

                @Override // com.meituan.android.paybase.asynctask.b
                public final /* synthetic */ void a(Object obj) {
                    b.a aVar2 = (b.a) obj;
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa7eee8d44d252411076ce85b380841f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa7eee8d44d252411076ce85b380841f");
                        return;
                    }
                    super.a((AnonymousClass1) aVar2);
                    if (aVar2 == null) {
                        EncryptBridgeHandler.this.a(-2, "encrypt error", null);
                    } else if (!aVar2.a()) {
                        EncryptBridgeHandler.this.a(-2, "encrypt result error", null);
                    } else {
                        EncryptResult encryptResult = new EncryptResult();
                        encryptResult.aesKey = c.a(aVar2.b.getBytes());
                        encryptResult.encryptKey = aVar2.c;
                        encryptResult.encryptData = aVar2.e;
                        EncryptBridgeHandler.this.a((JsonObject) com.meituan.android.neohybrid.util.gson.b.a().fromJson(com.meituan.android.neohybrid.util.gson.b.a().toJson(encryptResult), (Class<Object>) JsonObject.class));
                    }
                }
            }.b(map);
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static class EncryptResult implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("aes_key")
        private String aesKey;
        @SerializedName("encrypt_data")
        private Map<String, String> encryptData;
        @SerializedName("encrypt_key")
        private String encryptKey;

        public EncryptResult() {
        }
    }
}
