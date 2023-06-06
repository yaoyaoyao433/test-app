package com.sankuai.waimai.store.drug.goods.list.utils;

import android.os.MessageQueue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements MessageQueue.IdleHandler {
    public static ChangeQuickRedirect a;
    private final Runnable b;

    private d(Runnable runnable) {
        this.b = runnable;
    }

    public static MessageQueue.IdleHandler a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76ce729bc19cf42a999e2a5e5b4f6e49", RobustBitConfig.DEFAULT_VALUE) ? (MessageQueue.IdleHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76ce729bc19cf42a999e2a5e5b4f6e49") : new d(runnable);
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        Object accessDispatch;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6ec83110a7a4699ad58ad101625a6f3", RobustBitConfig.DEFAULT_VALUE)) {
            accessDispatch = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6ec83110a7a4699ad58ad101625a6f3");
        } else {
            Runnable runnable = this.b;
            Object[] objArr2 = {runnable};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5fdaea48c362ddf494b990dbcb5993a7", RobustBitConfig.DEFAULT_VALUE)) {
                runnable.run();
                return false;
            }
            accessDispatch = PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5fdaea48c362ddf494b990dbcb5993a7");
        }
        return ((Boolean) accessDispatch).booleanValue();
    }
}
