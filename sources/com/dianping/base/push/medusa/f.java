package com.dianping.base.push.medusa;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;
    a b;
    volatile ScheduledExecutorService c;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i, Object... objArr);
    }

    public f(@Nullable a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef66f53776fe8941db424a492612ae9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef66f53776fe8941db424a492612ae9d");
        } else {
            this.b = aVar;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7404dd0503f73ca7d562dd78621fd19f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7404dd0503f73ca7d562dd78621fd19f");
        } else if (this.c != null) {
            this.c.shutdown();
            this.c = null;
        }
    }
}
