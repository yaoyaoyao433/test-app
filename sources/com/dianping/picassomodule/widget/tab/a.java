package com.dianping.picassomodule.widget.tab;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a<T> implements f<T> {
    public static ChangeQuickRedirect a;
    protected List<T> b;

    public a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c37ed83370f4edb298d6b9755c50ced", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c37ed83370f4edb298d6b9755c50ced");
        } else {
            this.b = list;
        }
    }

    public final void a(List<T> list) {
        this.b = list;
    }

    @Override // com.dianping.picassomodule.widget.tab.f
    public int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fbc7d4d87c6830a96e3775ab061beb4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fbc7d4d87c6830a96e3775ab061beb4")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.size();
    }
}
