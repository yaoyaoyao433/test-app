package com.dianping.agentsdk.framework;

import android.widget.FrameLayout;
import com.dianping.shield.node.adapter.DisplayNodeContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public FrameLayout.LayoutParams b;
    public a c;
    public DisplayNodeContainer d;
    public int e;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void onLayoutParamCalFinish(DisplayNodeContainer displayNodeContainer, FrameLayout.LayoutParams layoutParams);
    }

    public e(DisplayNodeContainer displayNodeContainer, FrameLayout.LayoutParams layoutParams, int i, a aVar) {
        Object[] objArr = {displayNodeContainer, layoutParams, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67528b39c7c862a9ac531d10c410297d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67528b39c7c862a9ac531d10c410297d");
            return;
        }
        this.e = -1;
        this.d = displayNodeContainer;
        this.b = layoutParams;
        this.e = i;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d951d566dfae0ec73b7fdb62c4cc2f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d951d566dfae0ec73b7fdb62c4cc2f4")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.e == eVar.e && !aq.a(this.b, eVar.b) && this.b.gravity == eVar.b.gravity && Objects.equals(this.c, eVar.c);
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "607186a870b52a372168cdd617f736cb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "607186a870b52a372168cdd617f736cb")).intValue() : Objects.hash(this.b, this.c, Integer.valueOf(this.e));
    }
}
