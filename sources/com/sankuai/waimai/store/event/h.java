package com.sankuai.waimai.store.event;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class h {
    public static ChangeQuickRedirect a;
    private static volatile h b;
    private g c;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b37db306348fb33e932752fa710e9099", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b37db306348fb33e932752fa710e9099");
        } else {
            this.c = new g();
        }
    }

    public static h a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "552ab2e7d6f4ffa9d991e3fc915b5c6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "552ab2e7d6f4ffa9d991e3fc915b5c6a");
        }
        if (b == null) {
            synchronized (h.class) {
                if (b == null) {
                    b = new h();
                }
            }
        }
        return b;
    }

    public final void a(@NonNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31b03c8db3f4308de5758cb8934e6590", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31b03c8db3f4308de5758cb8934e6590");
        } else {
            this.c.a(obj);
        }
    }

    public final void b(@NonNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee2f761d0913d9a3cecad7a57d42b218", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee2f761d0913d9a3cecad7a57d42b218");
        } else {
            this.c.b(obj);
        }
    }

    public final <T extends d> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da52ab971e392125580f8e04517486df", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da52ab971e392125580f8e04517486df") : (T) this.c.a((Class<d>) cls);
    }
}
