package com.dianping.nvtunnelkit.ext;

import android.content.Context;
import com.dianping.nvtunnelkit.ext.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j implements h.d {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final Map<String, c> c;

    public j(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdb3416a04b8d51b92720424511c414d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdb3416a04b8d51b92720424511c414d");
            return;
        }
        this.b = context.getApplicationContext();
        this.c = new ConcurrentHashMap();
        com.dianping.nvtunnelkit.utils.c.a(this.b);
    }

    @Override // com.dianping.nvtunnelkit.ext.h.d
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbacac7cca84f0ebb14d76caf1a85409", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbacac7cca84f0ebb14d76caf1a85409") : this.b.getApplicationInfo().dataDir;
    }

    @Override // com.dianping.nvtunnelkit.ext.h.d
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3370ef375f15e67cdfb2b4df6fc4e846", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3370ef375f15e67cdfb2b4df6fc4e846");
        } else if (this.c.containsKey(str)) {
        } else {
            this.c.put(str, new c(str, System.currentTimeMillis(), com.dianping.nvtunnelkit.utils.c.c()));
        }
    }

    @Override // com.dianping.nvtunnelkit.ext.h.d
    public final void a(Collection<String> collection) {
        Object[] objArr = {collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2b181164c042df0b241b3ac932deebc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2b181164c042df0b241b3ac932deebc");
        } else if (!com.dianping.nvtunnelkit.utils.a.b(collection)) {
            for (String str : collection) {
                if (this.c.containsKey(str)) {
                    this.c.remove(str);
                }
            }
        }
    }

    @Override // com.dianping.nvtunnelkit.ext.h.d
    public final List<c> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c48ff781663a55d960792c306c98746b", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c48ff781663a55d960792c306c98746b") : new ArrayList(this.c.values());
    }
}
