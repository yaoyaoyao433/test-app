package com.meituan.mmp.lib.api;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class ActivityApi extends InternalApi {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.AbsApi
    public boolean isActivityApi() {
        return true;
    }

    @Override // com.meituan.mmp.lib.api.InternalApi, com.meituan.mmp.lib.api.AbsApi
    public Context getContext() {
        return this.g;
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public Activity getActivity() {
        return this.g;
    }

    @NonNull
    public final com.meituan.mmp.lib.a a() {
        return this.f;
    }

    public JSONObject a(String str) throws d {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d9c0ccddc26149d7dbe86d7c0116e10", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d9c0ccddc26149d7dbe86d7c0116e10");
        }
        throw new d("no activity attached, and no fallback value returned");
    }
}
