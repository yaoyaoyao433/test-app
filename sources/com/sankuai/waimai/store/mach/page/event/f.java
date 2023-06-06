package com.sankuai.waimai.store.mach.page.event;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static volatile f c;
    public final List<e> b;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14b865b6541773b70247ee046feb2751", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14b865b6541773b70247ee046feb2751");
        } else {
            this.b = new ArrayList();
        }
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7029cc0c60933e4f72e35254ab94947", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7029cc0c60933e4f72e35254ab94947");
        }
        if (c == null) {
            synchronized (f.class) {
                if (c == null) {
                    c = new f();
                }
            }
        }
        return c;
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ec45826dac1cd56cf2db328d769a69c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ec45826dac1cd56cf2db328d769a69c");
        } else if (this.b.contains(eVar)) {
        } else {
            this.b.add(eVar);
        }
    }

    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1e48e8eb6191fa65fdc6f19d1d5eabd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1e48e8eb6191fa65fdc6f19d1d5eabd");
            return;
        }
        for (e eVar : this.b) {
            eVar.a(str, map);
        }
    }
}
