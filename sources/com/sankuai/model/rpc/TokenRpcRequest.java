package com.sankuai.model.rpc;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.rpc.BaseRpcResult;
import com.sankuai.model.userlocked.UserLockedAdapter;
import com.sankuai.model.userlocked.UserLockedErrorException;
import com.sankuai.model.userlocked.UserLockedHandler;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class TokenRpcRequest<T extends BaseRpcResult> extends RpcRequest<T> implements UserLockedHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final UserLockedAdapter userLockedAdapter;

    @Override // com.sankuai.model.rpc.RpcRequest
    public boolean tokenEnabled() {
        return true;
    }

    public TokenRpcRequest() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5935d1dc56d36d2fdf175b19d30da826", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5935d1dc56d36d2fdf175b19d30da826");
        } else {
            this.userLockedAdapter = new UserLockedAdapter(UserLockedAdapter.ApiType.RPC);
        }
    }

    @Override // com.sankuai.model.rpc.RpcRequest, com.sankuai.model.RequestBase, com.sankuai.model.Request
    public T convert(JsonElement jsonElement) throws IOException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93ca8c8c9d459605d36d220e9fe4459e", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93ca8c8c9d459605d36d220e9fe4459e");
        }
        if (!jsonElement.isJsonArray()) {
            throw new JsonParseException("Root is not JsonArray");
        }
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        if (asJsonArray == null || asJsonArray.size() <= 0) {
            throw new IOException("Fail to get data");
        }
        JsonObject asJsonObject = asJsonArray.get(0).getAsJsonObject();
        if (asJsonObject == null) {
            throw new IOException("Fail to get data");
        }
        handleUserLockedError(asJsonObject);
        return convertDataElement((JsonElement) asJsonObject);
    }

    @Override // com.sankuai.model.userlocked.UserLockedHandler
    public void handleUserLockedError(JsonElement jsonElement) throws UserLockedErrorException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c3214bf12ffce23a65d772e9fdd1667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c3214bf12ffce23a65d772e9fdd1667");
        } else {
            this.userLockedAdapter.handleUserLockedError(jsonElement);
        }
    }
}
