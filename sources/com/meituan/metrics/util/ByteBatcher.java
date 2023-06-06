package com.meituan.metrics.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ByteBatcher {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final FlushReceiver flushReceiver;
    private int length;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface FlushReceiver {
        void receive(int i);
    }

    public ByteBatcher(FlushReceiver flushReceiver) {
        Object[] objArr = {flushReceiver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd671d54d45806f0acae71c0606646b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd671d54d45806f0acae71c0606646b1");
            return;
        }
        this.length = 0;
        this.flushReceiver = flushReceiver;
    }

    public final void addBytes(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61c51cfe5d460e09b7db7867e5c11643", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61c51cfe5d460e09b7db7867e5c11643");
        } else if (i >= 0) {
            this.length += i;
        }
    }

    public final void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a58bd8b5feb3140a9fe2d84b551a127c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a58bd8b5feb3140a9fe2d84b551a127c");
        } else if (this.flushReceiver != null) {
            this.flushReceiver.receive(this.length);
            this.length = 0;
        }
    }

    public final int getLength() {
        return this.length;
    }
}
