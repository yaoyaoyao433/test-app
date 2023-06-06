package com.meituan.retrofit2.androidadapter;

import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.v4.content.Loader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.exception.c;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.waimai.launcher.util.aop.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class CallLoader<D> extends Loader<com.meituan.retrofit2.androidadapter.a<D>> implements f<D> {
    public static ChangeQuickRedirect a;
    private final boolean b;
    private Call<D> c;
    private com.meituan.retrofit2.androidadapter.a<D> d;
    private Call<D> e;
    private a<D> f;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a<D> {
        Call<D> a();
    }

    public CallLoader(@NonNull Context context, @NonNull Call<D> call, boolean z) {
        super(context);
        Object[] objArr = {context, call, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ead3264570682048cd7665c5c5e5558", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ead3264570682048cd7665c5c5e5558");
            return;
        }
        this.b = z;
        this.c = call;
    }

    @Override // android.support.v4.content.Loader
    public final void onStartLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "052db6db56780e492fe78787a8bb3da2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "052db6db56780e492fe78787a8bb3da2");
        } else if (this.c != null && this.c.c()) {
            deliverCancellation();
        } else if (this.d != null && (this.d.a() || !this.b)) {
            deliverResult(this.d);
        } else {
            this.d = null;
            if (this.c != null) {
                this.e = this.c.d();
                this.e.a(this);
            } else if (this.f != null) {
                b.a(AsyncTask.THREAD_POOL_EXECUTOR, new Runnable() { // from class: com.meituan.retrofit2.androidadapter.CallLoader.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0033e3f5285adf6a3ce6b0b642cf6df3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0033e3f5285adf6a3ce6b0b642cf6df3");
                        } else if (CallLoader.this.isAbandoned()) {
                        } else {
                            CallLoader.this.c = CallLoader.this.f.a();
                            if (CallLoader.this.c != null) {
                                CallLoader.this.e = CallLoader.this.c.d();
                                CallLoader.this.e.a(CallLoader.this);
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.sankuai.meituan.retrofit2.f
    public final void onResponse(Call<D> call, Response<D> response) {
        Object[] objArr = {call, response};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "886ebd09ba9cabe26038eaa960985f0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "886ebd09ba9cabe26038eaa960985f0d");
            return;
        }
        if (response != null && response.f()) {
            this.d = com.meituan.retrofit2.androidadapter.a.a(response.e());
        } else {
            this.d = com.meituan.retrofit2.androidadapter.a.a((Throwable) new c(response));
        }
        deliverResult(this.d);
    }

    @Override // com.sankuai.meituan.retrofit2.f
    public final void onFailure(Call<D> call, Throwable th) {
        Object[] objArr = {call, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3f5bb557495def86ad6c3d849d75737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3f5bb557495def86ad6c3d849d75737");
            return;
        }
        this.d = com.meituan.retrofit2.androidadapter.a.a(th);
        deliverResult(this.d);
    }

    @Override // android.support.v4.content.Loader
    public final void onAbandon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7c03381801b21a427d70d098fc33008", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7c03381801b21a427d70d098fc33008");
            return;
        }
        if (this.e != null) {
            if (!this.e.c()) {
                this.e.cancel();
            }
            this.e = null;
        }
        this.d = null;
    }
}
