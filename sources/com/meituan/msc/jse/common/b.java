package com.meituan.msc.jse.common;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    @Nullable
    private Thread b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abaa3a397edb4b52e3757e9e0a056a11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abaa3a397edb4b52e3757e9e0a056a11");
        } else {
            this.b = null;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c76a476aab6f35ffdf2dea5bb970faca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c76a476aab6f35ffdf2dea5bb970faca");
            return;
        }
        Thread currentThread = Thread.currentThread();
        if (this.b == null) {
            this.b = currentThread;
        }
        if (this.b != currentThread) {
            StringBuilder sb = new StringBuilder("expected thread ");
            sb.append(this.b != null ? this.b.getName() : StringUtil.NULL);
            sb.append(", actually thread ");
            sb.append(currentThread.getName());
            com.facebook.infer.annotation.a.a(false, sb.toString());
        }
    }
}
