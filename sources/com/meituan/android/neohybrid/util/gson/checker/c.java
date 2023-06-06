package com.meituan.android.neohybrid.util.gson.checker;

import com.meituan.android.neohybrid.util.gson.annotation.Range;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements a<Range> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.neohybrid.util.gson.checker.a
    public final /* synthetic */ String a(Range range, Object obj) {
        Range range2 = range;
        Object[] objArr = {range2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "747dcb9684659d2a861df77f1d591953", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "747dcb9684659d2a861df77f1d591953");
        }
        if (range2 == null || obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Integer)) {
            long parseLong = Long.parseLong(String.valueOf(obj));
            if (parseLong < range2.min() || parseLong > range2.max()) {
                return "RangeChecker: range is[" + range2.min() + ", " + range2.max() + "], current is " + obj;
            }
        }
        return null;
    }
}
