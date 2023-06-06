package com.meituan.msc.modules.api;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.engine.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class InternalApi extends AbsApi {
    public static ChangeQuickRedirect a;
    protected static final Handler b = new Handler(Looper.getMainLooper());
    protected h c;
    @Nullable
    protected Activity d;

    @Override // com.meituan.msc.modules.api.AbsApi
    @NonNull
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00669c869b1acdb3d489442dff1c4bc2", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00669c869b1acdb3d489442dff1c4bc2") : MSCEnvHelper.getContext();
    }
}
