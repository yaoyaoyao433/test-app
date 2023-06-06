package com.meituan.msc.uimanager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Comparator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class aq {
    public static ChangeQuickRedirect a;
    public static Comparator<aq> b = new Comparator<aq>() { // from class: com.meituan.msc.uimanager.aq.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(aq aqVar, aq aqVar2) {
            return aqVar.d - aqVar2.d;
        }
    };
    public final int c;
    public final int d;

    public aq(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39d5bafb0d485d48c83ba0df5d59dcf2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39d5bafb0d485d48c83ba0df5d59dcf2");
            return;
        }
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33390bf41a5770e946cac041f1148046", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33390bf41a5770e946cac041f1148046")).booleanValue();
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        aq aqVar = (aq) obj;
        return this.d == aqVar.d && this.c == aqVar.c;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19cdffef4058b2529601d026312f3d10", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19cdffef4058b2529601d026312f3d10");
        }
        return "[" + this.c + ", " + this.d + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
    }
}
