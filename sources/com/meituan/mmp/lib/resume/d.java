package com.meituan.mmp.lib.resume;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public Stack<com.meituan.mmp.lib.resume.a> b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(com.meituan.mmp.lib.resume.a aVar);
    }

    public static d a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "388a0e96ec3544227833b1d4537c1ae0", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "388a0e96ec3544227833b1d4537c1ae0");
        }
        d dVar = new d();
        dVar.b = c.a().b.get(str);
        return dVar;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ffca11aeb46fd8f52f6e362dc6e78ad", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ffca11aeb46fd8f52f6e362dc6e78ad")).booleanValue() : (this.b == null || this.b.isEmpty()) ? false : true;
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b1b5be6c9d534e0fe088e530b624477", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b1b5be6c9d534e0fe088e530b624477");
        } else if (a()) {
            aVar.a(this.b.pop());
        }
    }
}
