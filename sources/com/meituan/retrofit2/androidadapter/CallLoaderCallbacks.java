package com.meituan.retrofit2.androidadapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class CallLoaderCallbacks<D> implements LoaderManager.LoaderCallbacks<a<D>> {
    public static ChangeQuickRedirect c;
    private final Context a;

    public abstract Call<D> a(int i, Bundle bundle);

    public abstract void a(Loader loader, D d);

    @Override // android.support.v4.app.LoaderManager.LoaderCallbacks
    public void onLoaderReset(Loader loader) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.app.LoaderManager.LoaderCallbacks
    public /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        a aVar = (a) obj;
        Object[] objArr = {loader, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e13d7188f5b4bcd26f95f9dfe5b6d0bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e13d7188f5b4bcd26f95f9dfe5b6d0bb");
        } else if (aVar.a()) {
            a(loader, (Loader) aVar.b());
        }
    }

    public CallLoaderCallbacks(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54fc82a5df388d2a44b1f33d00d6903b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54fc82a5df388d2a44b1f33d00d6903b");
        } else {
            this.a = context;
        }
    }

    @Override // android.support.v4.app.LoaderManager.LoaderCallbacks
    public final Loader<a<D>> onCreateLoader(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86237299e1681ee104085ebf0acc87b6", RobustBitConfig.DEFAULT_VALUE) ? (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86237299e1681ee104085ebf0acc87b6") : new CallLoader(this.a, a(i, bundle), true);
    }
}
