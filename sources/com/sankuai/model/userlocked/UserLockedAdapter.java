package com.sankuai.model.userlocked;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UserLockedAdapter implements UserLockedHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ApiType type;

    private boolean isLocked(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b107fc98a1849cadbc7472a02119640d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b107fc98a1849cadbc7472a02119640d")).booleanValue() : i == 405 || i == 404 || i == 403 || i == 402 || i == 401;
    }

    public UserLockedAdapter(ApiType apiType) {
        Object[] objArr = {apiType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3af18fad1f0f9e7ddc7254b89c24b633", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3af18fad1f0f9e7ddc7254b89c24b633");
        } else {
            this.type = apiType;
        }
    }

    @Override // com.sankuai.model.userlocked.UserLockedHandler
    public void handleUserLockedError(JsonElement jsonElement) throws UserLockedErrorException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4016cf2407730a2b3fc7c73ae0e50cc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4016cf2407730a2b3fc7c73ae0e50cc7");
            return;
        }
        switch (this.type) {
            case PASSPORT:
                handlePassportError(jsonElement);
                return;
            case RPC:
                handleRpcError(jsonElement);
                return;
            case GENERAL:
                handleGeneralError(jsonElement);
                return;
            default:
                return;
        }
    }

    private void handlePassportError(JsonElement jsonElement) throws UserLockedErrorException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcd65ed653482ed2ffc40e8c0d0c2bd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcd65ed653482ed2ffc40e8c0d0c2bd0");
        } else {
            checkError(jsonElement, "code", "message");
        }
    }

    private void handleRpcError(JsonElement jsonElement) throws UserLockedErrorException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d73dd6e115696c504e5467a27a7b74db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d73dd6e115696c504e5467a27a7b74db");
        } else {
            checkError(jsonElement, "code", "msg");
        }
    }

    private void handleGeneralError(JsonElement jsonElement) throws UserLockedErrorException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8316e350b23564b84947d47489dfccc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8316e350b23564b84947d47489dfccc");
        } else {
            checkError(jsonElement, "code", "message");
        }
    }

    private void checkError(JsonElement jsonElement, String str, String str2) throws UserLockedErrorException {
        Object[] objArr = {jsonElement, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad4b65ce8ca00a9f262c71226e0e1908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad4b65ce8ca00a9f262c71226e0e1908");
        } else if (jsonElement.isJsonObject()) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            int asInt = asJsonObject.has(str) ? asJsonObject.get(str).getAsInt() : -1;
            if (isLocked(asInt)) {
                throw new UserLockedErrorException(asInt, asJsonObject.has(str2) ? asJsonObject.get(str2).getAsString() : "");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum ApiType {
        PASSPORT,
        RPC,
        GENERAL;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        ApiType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acb3a3c95cac5d19adee4e759f3097a6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acb3a3c95cac5d19adee4e759f3097a6");
            }
        }

        public static ApiType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f40e41be78b1d32e4176a31e6b429fa8", RobustBitConfig.DEFAULT_VALUE) ? (ApiType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f40e41be78b1d32e4176a31e6b429fa8") : (ApiType) Enum.valueOf(ApiType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ApiType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a7909ac2221a10c852702e248fb16a03", RobustBitConfig.DEFAULT_VALUE) ? (ApiType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a7909ac2221a10c852702e248fb16a03") : (ApiType[]) values().clone();
        }
    }
}
