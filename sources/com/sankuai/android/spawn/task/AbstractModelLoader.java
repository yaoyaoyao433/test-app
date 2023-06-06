package com.sankuai.android.spawn.task;

import android.support.v4.content.ConcurrentTaskLoader;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbstractModelLoader<D> extends ConcurrentTaskLoader<D> {
    public static ChangeQuickRedirect a;
    protected D b;
    Exception c;

    public abstract D a() throws IOException;

    @Override // android.support.v4.content.AsyncTaskLoader
    public D loadInBackground() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c883485073775b572efcea79ce7319a", 6917529027641081856L)) {
            return (D) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c883485073775b572efcea79ce7319a");
        }
        try {
            D a2 = a();
            this.c = null;
            return a2;
        } catch (RuntimeException e) {
            Log.e(getClass().getSimpleName(), e.toString());
            this.c = e;
            return null;
        } catch (Throwable th) {
            if (th instanceof Exception) {
                this.c = (Exception) th;
            } else {
                this.c = new Exception(th);
            }
            return null;
        }
    }

    @Override // android.support.v4.content.Loader
    public void onStartLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76cc8ebd2b6eaf488db0ff1af3b7af20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76cc8ebd2b6eaf488db0ff1af3b7af20");
            return;
        }
        if (this.b != null) {
            deliverResult(this.b);
        }
        if (takeContentChanged() || this.b == null) {
            try {
                forceLoad();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.support.v4.content.Loader
    public void deliverResult(D d) {
        Object[] objArr = {d};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b5b4769e3cd1e22b836e5480c0f7f4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b5b4769e3cd1e22b836e5480c0f7f4d");
        } else if (isReset()) {
        } else {
            this.b = d;
            super.deliverResult(d);
        }
    }

    @Override // android.support.v4.content.Loader
    public void onReset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a64e97d0bf98c4809122ad51d150b451", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a64e97d0bf98c4809122ad51d150b451");
            return;
        }
        super.onReset();
        onStopLoading();
        this.b = null;
    }
}
