package com.sankuai.waimai.foundation.core.service.user;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IUserManagerService {
    public static final String KEY = "IUserManagerService";

    long getUserId();

    boolean isLogin();

    void loginWithAction(Context context, Runnable runnable);

    void loginWithAction(Context context, Runnable runnable, Runnable runnable2);

    void loginWithAction(Context context, Runnable runnable, Runnable runnable2, Runnable runnable3);

    void registerObserver(b bVar);

    void startLoginPage(Context context);

    void unregisterObserver(b bVar);
}
