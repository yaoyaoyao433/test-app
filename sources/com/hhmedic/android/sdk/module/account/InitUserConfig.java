package com.hhmedic.android.sdk.module.account;

import com.google.gson.reflect.TypeToken;
import com.hhmedic.android.sdk.base.model.HHModel;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import com.hhmedic.android.sdk.base.user.UserExtension;
import java.lang.reflect.Type;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class InitUserConfig extends HHRequestConfig {
    @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
    public String serverApiPath() {
        return "/user/userInfo";
    }

    public InitUserConfig(HashMap<String, Object> hashMap) {
        super(hashMap, null);
    }

    @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
    public Type parserJsonType() {
        return new TypeToken<HHModel<UserExtension>>() { // from class: com.hhmedic.android.sdk.module.account.InitUserConfig.1
        }.getType();
    }
}
