package com.meituan.android.common.locate.locator;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class d {
    private static volatile d a;
    public static ChangeQuickRedirect changeQuickRedirect;
    private e b;

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "57adf3d3a12295e1abf17ae1fb4e4c54", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "57adf3d3a12295e1abf17ae1fb4e4c54");
        }
        if (a == null) {
            synchronized (d.class) {
                if (a == null) {
                    a = new d();
                }
            }
        }
        return a;
    }

    public void a(e eVar) {
        this.b = eVar;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e93644dd667c4b0d44611efb18dda09a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e93644dd667c4b0d44611efb18dda09a");
        } else if (this.b != null) {
            this.b.a();
        }
    }
}
