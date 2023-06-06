package com.meituan.android.neohybrid.v2.util;

import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.d;
import android.arch.lifecycle.e;
import android.arch.lifecycle.f;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.android.neohybrid.v2.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RecycledHandler extends Handler implements e {
    public static ChangeQuickRedirect a;

    public RecycledHandler() {
        super(Looper.getMainLooper());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d993487af6cd31906f830198028c75ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d993487af6cd31906f830198028c75ac");
        }
    }

    public static RecycledHandler a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "970cadf7d4ce8f64e03b6204661d7b7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecycledHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "970cadf7d4ce8f64e03b6204661d7b7b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d00c153e13b8c5a6bd49fa694cfdd53", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d00c153e13b8c5a6bd49fa694cfdd53")).booleanValue();
        }
        if (message.obj == null) {
            message.obj = this;
        }
        return super.sendMessageAtTime(message, j);
    }

    @OnLifecycleEvent(d.a.ON_DESTROY)
    private void onDestroy(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc69d2777f79fa7cf7dbb5f3b478f95b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc69d2777f79fa7cf7dbb5f3b478f95b");
            return;
        }
        fVar.getLifecycle().b(this);
        removeCallbacksAndMessages(this);
    }
}
