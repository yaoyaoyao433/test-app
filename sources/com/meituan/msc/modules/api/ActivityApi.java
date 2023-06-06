package com.meituan.msc.modules.api;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ActivityApi extends InternalApi {
    @Override // com.meituan.msc.modules.api.AbsApi
    public boolean isActivityApi() {
        return true;
    }

    @Override // com.meituan.msc.modules.api.InternalApi, com.meituan.msc.modules.api.AbsApi
    @NonNull
    public Context getContext() {
        return this.d;
    }

    @Override // com.meituan.msc.modules.api.AbsApi
    public Activity getActivity() {
        return this.d;
    }
}
