package com.meituan.android.neohybrid.util;

import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.d;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RecycledHandler extends Handler implements android.arch.lifecycle.e {
    public static ChangeQuickRedirect a;

    public RecycledHandler() {
        super(Looper.getMainLooper());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93c11bb812bf7b807d1a77f13062b3d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93c11bb812bf7b807d1a77f13062b3d0");
        }
    }

    public static RecycledHandler a(com.meituan.android.neohybrid.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a78d89d86533c58559b7c50ce7357ed7", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecycledHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a78d89d86533c58559b7c50ce7357ed7");
        }
        if (aVar == null) {
            return new RecycledHandler();
        }
        RecycledHandler recycledHandler = new RecycledHandler();
        aVar.getLifecycle().a(recycledHandler);
        return recycledHandler;
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        Object[] objArr = {message, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a8113bee24ac4565fb47b6e25158241", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a8113bee24ac4565fb47b6e25158241")).booleanValue();
        }
        if (message.obj == null) {
            message.obj = this;
        }
        return super.sendMessageAtTime(message, j);
    }

    @OnLifecycleEvent(d.a.ON_DESTROY)
    private void onDestroy(android.arch.lifecycle.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae2393b34a818fef9a0e9cb6b220a17b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae2393b34a818fef9a0e9cb6b220a17b");
            return;
        }
        fVar.getLifecycle().b(this);
        removeCallbacksAndMessages(this);
    }
}
