package com.meituan.msi.api.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.meituan.android.cipstorage.q;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.lifecycle.a;
import com.meituan.msi.provider.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class StorageApi implements IMsiApi, a {
    public static ChangeQuickRedirect a;
    public f b;
    private final Context c;

    @Override // com.meituan.msi.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f361aa83021e507f33d169b39ca571c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f361aa83021e507f33d169b39ca571c");
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "171d72ed32694482449165926d7ee02a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "171d72ed32694482449165926d7ee02a");
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a551a905882340f2b5e9c0ac60edc126", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a551a905882340f2b5e9c0ac60edc126");
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc671708577b0c17b3fb61935df369c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc671708577b0c17b3fb61935df369c");
        }
    }

    public StorageApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d5d8e601b840a83410aeef4448c1bca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d5d8e601b840a83410aeef4448c1bca");
        } else {
            this.c = com.meituan.msi.a.f();
        }
    }

    private static Object a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50e58424bd5e4f235bd130e9ffe3e069", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50e58424bd5e4f235bd130e9ffe3e069");
        }
        try {
            JsonObject jsonObject = (JsonObject) new JsonParser().parse(str);
            if (jsonObject.has("data") && jsonObject.has("type")) {
                JsonElement jsonElement = jsonObject.get("data");
                return jsonElement == null ? JsonNull.INSTANCE : jsonElement;
            }
        } catch (Exception unused) {
        }
        return JsonNull.INSTANCE;
    }

    @MsiApiMethod(name = "setStorage", request = StorageApiParam.class)
    public void setStorageAsync(StorageApiParam storageApiParam, MsiContext msiContext) throws ApiException {
        Object[] objArr = {storageApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52191632f8387abeda738eacc6b4bd69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52191632f8387abeda738eacc6b4bd69");
        } else {
            a(storageApiParam, msiContext);
        }
    }

    @MsiApiMethod(name = "setStorageSync", request = StorageApiParam.class)
    public EmptyResponse setStorageSync(StorageApiParam storageApiParam, MsiContext msiContext) throws ApiException {
        Object[] objArr = {storageApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e9db5013a02607ee84f03e69f4e55d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e9db5013a02607ee84f03e69f4e55d2");
        }
        a(storageApiParam, msiContext);
        return EmptyResponse.INSTANCE;
    }

    private void a(StorageApiParam storageApiParam, MsiContext msiContext) throws ApiException {
        Object[] objArr = {storageApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1d1230d5e2e58b22ac82d6d6494ef23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1d1230d5e2e58b22ac82d6d6494ef23");
        } else if (TextUtils.isEmpty(storageApiParam.key)) {
            throw new ApiException(400, "invalid param");
        } else {
            this.b = msiContext.getSharedPreferencesProvider();
            String b = this.b.b();
            q a2 = q.a(this.c, b, 2);
            long k = a2.k();
            String jsonObject = a(storageApiParam.data).toString();
            if (storageApiParam.key.getBytes() != null && jsonObject != null && jsonObject.getBytes() != null) {
                long length = storageApiParam.key.getBytes().length + jsonObject.getBytes().length;
                long j = k + length;
                long c = this.b.c() < 0 ? 52428800L : this.b.c();
                if (j >= c) {
                    com.meituan.msi.log.a.a("cip start to trim");
                    if (a2.k() + length >= c) {
                        msiContext.onError("exceed storage max size " + (c / 1048576) + ErrorCode.ERROR_TYPE_M);
                        return;
                    }
                }
                this.b.a(b).edit().putString(storageApiParam.key, jsonObject).apply();
                msiContext.onSuccess("");
                return;
            }
            msiContext.onError("key or value is empty");
        }
    }

    @MsiApiMethod(name = "removeStorageSync", request = StorageApiParam.class, response = StorageResponse.class)
    public StorageResponse removeStorageSync(StorageApiParam storageApiParam, MsiContext msiContext) {
        Object[] objArr = {storageApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1c46b44544a76dc0ec1899bb2afdb03", RobustBitConfig.DEFAULT_VALUE) ? (StorageResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1c46b44544a76dc0ec1899bb2afdb03") : b(storageApiParam, msiContext);
    }

    @MsiApiMethod(name = "removeStorage", request = StorageApiParam.class, response = StorageResponse.class)
    public void removeStorageAsync(StorageApiParam storageApiParam, MsiContext msiContext) {
        Object[] objArr = {storageApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5777babfd8c84784fb2c7d7f2b7d2461", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5777babfd8c84784fb2c7d7f2b7d2461");
        } else {
            b(storageApiParam, msiContext);
        }
    }

    private StorageResponse b(StorageApiParam storageApiParam, MsiContext msiContext) {
        Object[] objArr = {storageApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "babc509497bfc78582854cff951142f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (StorageResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "babc509497bfc78582854cff951142f5");
        }
        this.b = msiContext.getSharedPreferencesProvider();
        SharedPreferences a2 = this.b.a(this.b.b());
        String string = a2.getString(storageApiParam.key, "");
        if (!TextUtils.isEmpty(string)) {
            a2.edit().remove(storageApiParam.key).apply();
        }
        StorageResponse storageResponse = new StorageResponse();
        storageResponse.data = TextUtils.isEmpty(string) ? "" : a(string);
        msiContext.onSuccess(storageResponse);
        return storageResponse;
    }

    @MsiApiMethod(name = "getStorageSync", request = StorageApiParam.class, response = StorageResponse.class)
    public StorageResponse getStorageSync(StorageApiParam storageApiParam, MsiContext msiContext) throws ApiException {
        Object[] objArr = {storageApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73c9ab5a90c7df3dea38356fc95f32c6", RobustBitConfig.DEFAULT_VALUE) ? (StorageResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73c9ab5a90c7df3dea38356fc95f32c6") : c(storageApiParam, msiContext);
    }

    @MsiApiMethod(name = "getStorage", request = StorageApiParam.class, response = StorageResponse.class)
    public void getStorageAsync(StorageApiParam storageApiParam, MsiContext msiContext) throws ApiException {
        Object[] objArr = {storageApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d36d2aeda5129216b0b211ba17030a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d36d2aeda5129216b0b211ba17030a7");
        } else {
            c(storageApiParam, msiContext);
        }
    }

    private StorageResponse c(StorageApiParam storageApiParam, MsiContext msiContext) throws ApiException {
        Object[] objArr = {storageApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae72526edca9c323d2092e0f1ddeb5bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (StorageResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae72526edca9c323d2092e0f1ddeb5bc");
        }
        String str = storageApiParam.key;
        if (TextUtils.isEmpty(str)) {
            throw new ApiException(400, "key is not be empty");
        }
        this.b = msiContext.getSharedPreferencesProvider();
        String string = this.b.a(this.b.b()).getString(str, "");
        StorageResponse storageResponse = new StorageResponse();
        storageResponse.data = TextUtils.isEmpty(string) ? "" : a(string);
        msiContext.onSuccess(storageResponse);
        return storageResponse;
    }

    @MsiApiMethod(name = "getStorageInfoSync", response = StorageInfoResponse.class)
    public StorageInfoResponse getStorageInfoSync(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85570916a15cf2af4168cedba62af9f3", RobustBitConfig.DEFAULT_VALUE) ? (StorageInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85570916a15cf2af4168cedba62af9f3") : a(msiContext);
    }

    @MsiApiMethod(name = "getStorageInfo", response = StorageInfoResponse.class)
    public void getStorageInfoAsync(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aa4504569bc3f393b1e7900eb86737d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aa4504569bc3f393b1e7900eb86737d");
        } else {
            a(msiContext);
        }
    }

    private StorageInfoResponse a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b92ffb6a0af5b6cc56d54849ef5e08a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (StorageInfoResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b92ffb6a0af5b6cc56d54849ef5e08a2");
        }
        StorageInfoResponse storageInfoResponse = new StorageInfoResponse();
        this.b = msiContext.getSharedPreferencesProvider();
        String b = this.b.b();
        q a2 = q.a(this.c, b, 2);
        if (a2 == null) {
            msiContext.onError("fail to get storage info");
            return storageInfoResponse;
        }
        long k = a2.k();
        Set<String> keySet = this.b.a(b).getAll().keySet();
        storageInfoResponse.keys = new ArrayList();
        storageInfoResponse.keys.addAll(keySet);
        if (k > 0 && k < 1024) {
            k = 1024;
        }
        storageInfoResponse.currentSize = k / 1024;
        storageInfoResponse.limitSize = (this.b.c() < 0 ? 52428800L : this.b.c()) / 1024;
        msiContext.onSuccess(storageInfoResponse);
        return storageInfoResponse;
    }

    @MsiApiMethod(name = "clearStorageSync", response = StorageInfoResponse.class)
    public EmptyResponse clearStorageSync(MsiContext msiContext) throws ApiException {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c01bcd0a023129cd3050b2a8cffdfa7", RobustBitConfig.DEFAULT_VALUE)) {
            return (EmptyResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c01bcd0a023129cd3050b2a8cffdfa7");
        }
        b(msiContext);
        return EmptyResponse.INSTANCE;
    }

    @MsiApiMethod(name = "clearStorage", response = StorageInfoResponse.class)
    public void clearStorageAsync(MsiContext msiContext) throws ApiException {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa4d5f82a2988f2c007365b9b23ee5d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa4d5f82a2988f2c007365b9b23ee5d2");
        } else {
            b(msiContext);
        }
    }

    private void b(MsiContext msiContext) throws ApiException {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd63cd8cda9d9ee8cec62a9f3b7cce48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd63cd8cda9d9ee8cec62a9f3b7cce48");
            return;
        }
        this.b = msiContext.getSharedPreferencesProvider();
        String b = this.b.b();
        this.b.a(b).edit().clear().apply();
        File b2 = b(b);
        if (b2 != null && b2.exists() && !b2.delete()) {
            throw new ApiException("clean storage failed");
        }
        msiContext.onSuccess(null);
    }

    private File b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "940463810b4752441816d31c5f2893a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "940463810b4752441816d31c5f2893a9");
        }
        return new File(this.c.getApplicationInfo().dataDir + "/shared_prefs/" + str + ".xml");
    }

    private JsonObject a(JsonElement jsonElement) {
        int i = 1;
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53f62b777c441e3964eae270706c3b67", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53f62b777c441e3964eae270706c3b67");
        }
        if (!(jsonElement instanceof JsonObject)) {
            if (jsonElement instanceof JsonArray) {
                i = 2;
            } else if (jsonElement instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
                if (jsonPrimitive.isBoolean()) {
                    i = 4;
                } else {
                    i = jsonPrimitive.isNumber() ? 5 : 0;
                }
            } else {
                i = 3;
            }
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("data", jsonElement);
        jsonObject.addProperty("type", Integer.valueOf(i));
        return jsonObject;
    }
}
