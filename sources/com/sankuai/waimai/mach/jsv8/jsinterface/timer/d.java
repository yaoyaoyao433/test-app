package com.sankuai.waimai.mach.jsv8.jsinterface.timer;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static volatile d c;
    public Map<Long, c> b;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51d1ce619ba3d7ac0d56904cef9b67e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51d1ce619ba3d7ac0d56904cef9b67e8");
        } else {
            this.b = new ConcurrentHashMap();
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d92e590ba3a85c70cbb4c903accea60", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d92e590ba3a85c70cbb4c903accea60");
        }
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    c = new d();
                }
            }
        }
        return c;
    }

    public final void a(Long l, c cVar) {
        Object[] objArr = {l, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7c8cd47143759384844abfc7919dcfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7c8cd47143759384844abfc7919dcfe");
        } else if (this.b.containsKey(l)) {
        } else {
            this.b.put(l, cVar);
        }
    }

    public final void a(Long l) {
        Object[] objArr = {l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40dd1cba78d73a2062edee0853a74da5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40dd1cba78d73a2062edee0853a74da5");
        } else {
            this.b.remove(l);
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "825d6f844101a143ce0d966c2b2ce66f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "825d6f844101a143ce0d966c2b2ce66f");
            return;
        }
        c b = b(j);
        if (b != null) {
            b.d();
            a(Long.valueOf(j));
        }
    }

    private c b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9c9bfbeff84eb2172553a7ec7adc43a", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9c9bfbeff84eb2172553a7ec7adc43a");
        }
        if (this.b.containsKey(Long.valueOf(j))) {
            return this.b.get(Long.valueOf(j));
        }
        return null;
    }
}
