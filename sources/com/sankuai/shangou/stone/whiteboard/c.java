package com.sankuai.shangou.stone.whiteboard;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public Pair<String, Object> b;
    public List<Pair<String, Object>> c;

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44758035b519605b057d10d3a1d24402", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44758035b519605b057d10d3a1d24402")).intValue() : super.hashCode();
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67d18b66a8d9c7391d585c58bc0dc7c9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67d18b66a8d9c7391d585c58bc0dc7c9")).booleanValue();
        }
        if (obj != null && (obj instanceof c)) {
            c cVar = (c) obj;
            if (this.b == cVar.b || this.b == null || this.b.equals(cVar.b)) {
                return this.c == cVar.c || this.c == null || this.c.equals(cVar.c);
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92add31d08b11c2856c1851d19d60d19", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92add31d08b11c2856c1851d19d60d19");
        }
        if (this.b != null) {
            return this.b.toString();
        }
        if (this.c != null) {
            return this.c.toString();
        }
        return super.toString();
    }
}
