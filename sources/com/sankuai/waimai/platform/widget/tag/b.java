package com.sankuai.waimai.platform.widget.tag;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b {
    public static ChangeQuickRedirect a;
    public boolean b;

    public abstract void a();

    public abstract void b();

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b7bb352a35fd79500f8f106bc77384c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b7bb352a35fd79500f8f106bc77384c");
        } else if (this.b) {
        } else {
            this.b = true;
            a();
            try {
                b();
            } catch (Exception unused) {
            }
        }
    }
}
