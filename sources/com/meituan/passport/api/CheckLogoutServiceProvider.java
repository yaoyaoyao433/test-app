package com.meituan.passport.api;

import com.meituan.passport.pojo.LogoutInfo;
import com.meituan.passport.pojo.LogoutResult;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface CheckLogoutServiceProvider {
    void canLogoutAsync(String str, LogoutInfo logoutInfo, ICallbackBase<LogoutResult> iCallbackBase);
}
