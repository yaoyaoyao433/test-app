package com.dianping.picassomodule.widget.grid;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect a;
    private List<T> b;

    public abstract View a(int i);

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9e180f5b4c6b71c31a53d04a6d27d0a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9e180f5b4c6b71c31a53d04a6d27d0a")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.size();
    }
}
