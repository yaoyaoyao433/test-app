package com.sankuai.xm.base;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k implements g {
    public static ChangeQuickRedirect a;
    private volatile Set<Integer> b;

    @Override // com.sankuai.xm.base.g
    public final boolean a(int i) {
        return true;
    }

    @Override // com.sankuai.xm.base.g
    public final boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57b5a845785ce7ba90bb805417640035", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57b5a845785ce7ba90bb805417640035")).booleanValue();
        }
        if (com.sankuai.xm.login.a.a().d()) {
            return !com.sankuai.xm.base.util.b.a(this.b) && this.b.contains(Integer.valueOf(i));
        }
        return true;
    }
}
