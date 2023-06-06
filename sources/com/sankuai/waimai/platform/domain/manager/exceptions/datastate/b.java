package com.sankuai.waimai.platform.domain.manager.exceptions.datastate;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b implements a {
    public static ChangeQuickRedirect a;
    private static b b;
    private ArrayList<a> c;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d3444688ffe896d674ef84e8aee1a0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d3444688ffe896d674ef84e8aee1a0b");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97c4258101f6b297c5de0bb09d2fdc43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97c4258101f6b297c5de0bb09d2fdc43");
            return;
        }
        this.c = new ArrayList<>();
        this.c.add((a) com.sankuai.waimai.router.a.a(a.class, "wm_rest"));
        this.c.add(new c());
    }

    @Override // com.sankuai.waimai.platform.domain.manager.exceptions.datastate.a
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25228dcc30fba2e072a17e81dc7411c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25228dcc30fba2e072a17e81dc7411c4");
        } else if (bundle != null) {
            try {
                Iterator<a> it = this.c.iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    if (next != null) {
                        next.a(bundle);
                    }
                }
            } catch (Throwable th) {
                com.sankuai.waimai.foundation.utils.log.a.a(th);
            }
        }
    }

    @Override // com.sankuai.waimai.platform.domain.manager.exceptions.datastate.a
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7be415de5a6d9b3d7612b018a027291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7be415de5a6d9b3d7612b018a027291");
        } else if (bundle != null) {
            try {
                Iterator<a> it = this.c.iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    if (next != null) {
                        next.b(bundle);
                    }
                }
            } catch (Throwable th) {
                com.sankuai.waimai.foundation.utils.log.a.a(th);
            }
        }
    }
}
