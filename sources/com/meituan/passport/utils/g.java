package com.meituan.passport.utils;

import android.os.Handler;
import android.os.Message;
import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class g extends Handler {
    public static ChangeQuickRedirect a;
    private WeakReference<Handler.Callback> b;

    public static Handler a(Handler.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd0bcce3f662586d53c5a725d12ed2b5", RobustBitConfig.DEFAULT_VALUE) ? (Handler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd0bcce3f662586d53c5a725d12ed2b5") : new g(callback);
    }

    private g(Handler.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec39f2170a26318fafd61da9d6c60f07", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec39f2170a26318fafd61da9d6c60f07");
        } else {
            this.b = new WeakReference<>(callback);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cb693a2da699b841ceef73c383b6619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cb693a2da699b841ceef73c383b6619");
            return;
        }
        super.handleMessage(message);
        Handler.Callback callback = this.b.get();
        if (callback != null) {
            callback.handleMessage(message);
        }
    }
}
