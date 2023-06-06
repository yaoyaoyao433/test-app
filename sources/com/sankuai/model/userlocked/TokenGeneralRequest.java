package com.sankuai.model.userlocked;

import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.RequestBaseAdapter;
import com.sankuai.model.userlocked.UserLockedAdapter;
import org.apache.http.client.HttpResponseException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class TokenGeneralRequest<T> extends RequestBaseAdapter<T> implements UserLockedHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final UserLockedAdapter userLockedAdapter;

    public TokenGeneralRequest() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48298a78a9e3f47b9319ac27a7705d49", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48298a78a9e3f47b9319ac27a7705d49");
        } else {
            this.userLockedAdapter = new UserLockedAdapter(UserLockedAdapter.ApiType.GENERAL);
        }
    }

    @Override // com.sankuai.model.RequestBase
    public void convertErrorElement(JsonElement jsonElement) throws HttpResponseException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0975911eb5f2c6a1aa0fea1329340cc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0975911eb5f2c6a1aa0fea1329340cc7");
            return;
        }
        handleUserLockedError(jsonElement);
        super.convertErrorElement(jsonElement);
    }

    @Override // com.sankuai.model.userlocked.UserLockedHandler
    public void handleUserLockedError(JsonElement jsonElement) throws UserLockedErrorException {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "067accb89eb6f5f5f89898c02e0ceda8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "067accb89eb6f5f5f89898c02e0ceda8");
        } else {
            this.userLockedAdapter.handleUserLockedError(jsonElement);
        }
    }
}
