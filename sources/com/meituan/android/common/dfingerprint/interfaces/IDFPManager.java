package com.meituan.android.common.dfingerprint.interfaces;

import android.content.Context;
import com.meituan.android.common.dfingerprint.store.SyncStoreManager;
import com.meituan.robust.ChangeQuickRedirect;
import okhttp3.Interceptor;
/* loaded from: classes2.dex */
public abstract class IDFPManager {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract Context getContext();

    public abstract ICypher getCypher();

    public abstract SyncStoreManager getIdStore();

    public abstract Interceptor getInterceptor();
}
