package com.meituan.android.paybase.encrypt;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.paybase.utils.v;
import com.meituan.android.paybase.utils.y;
import com.meituan.android.payguard.RequestCryptUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.i;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c<T> implements i<ap, T> {
    public static ChangeQuickRedirect a;
    private static final JsonParser d = new JsonParser();
    private final TypeToken<T> b;
    private final String c;

    public c(TypeToken<T> typeToken, String str) {
        Object[] objArr = {typeToken, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a5668365c1622cf9fb9731c79a0270f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a5668365c1622cf9fb9731c79a0270f");
            return;
        }
        this.b = typeToken;
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.meituan.retrofit2.i
    public T a(ap apVar) throws IOException {
        T a2;
        Object[] objArr = {apVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67476622386911e2e6dd9b61609ef1eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67476622386911e2e6dd9b61609ef1eb");
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (apVar == null) {
                throw new IOException("Failed to get response's entity");
            }
            String string = apVar.string();
            if (string == null || string.length() == 0) {
                throw new IOException("Failed to get response's entity");
            }
            Object[] objArr2 = {string};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49a650b6db4515991f1a635a519b5332", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (T) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49a650b6db4515991f1a635a519b5332");
            } else {
                JsonElement parse = d.parse(string);
                if (!parse.isJsonObject()) {
                    throw new JsonParseException("Root is not JsonObject");
                }
                JsonObject asJsonObject = parse.getAsJsonObject();
                if (asJsonObject.has("data")) {
                    JsonElement jsonElement = asJsonObject.get("data");
                    if (jsonElement.isJsonNull()) {
                        throw new IOException("data is null");
                    }
                    a2 = a(jsonElement);
                } else {
                    if (asJsonObject.has("error")) {
                        JsonElement jsonElement2 = asJsonObject.get("error");
                        Object[] objArr3 = {jsonElement2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb311e96fc347addbfb9d605ee6b59a5", RobustBitConfig.DEFAULT_VALUE)) {
                            throw new PayException(jsonElement2);
                        }
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb311e96fc347addbfb9d605ee6b59a5");
                    }
                    throw new IOException("Fail to get data or error");
                }
            }
            return a2;
        } finally {
            if (!TextUtils.isEmpty(this.c)) {
                y.a(this.c, System.currentTimeMillis() - currentTimeMillis);
            }
        }
    }

    private T a(JsonElement jsonElement) throws IOException {
        String str;
        boolean z;
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00c71e83e6282b3bf1c348009d6b05e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00c71e83e6282b3bf1c348009d6b05e5");
        }
        String str2 = null;
        if (jsonElement.isJsonObject()) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            str = asJsonObject.has("encrypt_res") ? asJsonObject.get("encrypt_res").getAsString() : null;
            if (asJsonObject.has("encrypt_key")) {
                str2 = asJsonObject.get("encrypt_key").getAsString();
            }
        } else {
            str = null;
        }
        if (str != null && !TextUtils.isEmpty(str2)) {
            try {
                com.meituan.android.paybase.utils.c.b(str.getBytes());
                z = true;
            } catch (IOException e) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "EncryptResponseBodyConverter_convertDataElement").a("message", e.getMessage()).b);
                z = false;
            }
            if (!z) {
                com.meituan.android.paybase.common.analyse.cat.a.a("dataDecryptError", "数据解密失败");
                throw new PayException(-1, "数据加载繁忙，请稍后再试", 2, "");
            }
            String[] a2 = RequestCryptUtils.a(str2, new String[]{str});
            if (a2 == null) {
                com.meituan.android.paybase.common.analyse.cat.a.a("dataDecryptError", "数据解密失败");
                throw new PayException(-1, "数据加载繁忙，请稍后再试", 2, "");
            }
            return (T) n.a().fromJson(a2[0], this.b.getType());
        }
        return (T) n.a().fromJson(jsonElement, this.b.getType());
    }
}
