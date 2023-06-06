package com.sankuai.eh.component.service.tools;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e<T extends Handler.Callback> extends Handler {
    public static ChangeQuickRedirect a;
    private WeakReference<T> b;

    public e(T t) {
        super(Looper.getMainLooper());
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b299807604dd5de4d87d1c8f8513d925", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b299807604dd5de4d87d1c8f8513d925");
        } else {
            this.b = new WeakReference<>(t);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f70168c458bb2e9b2173ffdab9212948", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f70168c458bb2e9b2173ffdab9212948");
            return;
        }
        T t = this.b.get();
        if (t != null) {
            t.handleMessage(message);
        }
    }
}
