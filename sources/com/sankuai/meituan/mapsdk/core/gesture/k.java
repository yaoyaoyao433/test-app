package com.sankuai.meituan.mapsdk.core.gesture;

import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k extends Pair<Integer, Integer> {
    public static ChangeQuickRedirect a;

    public k(Integer num, Integer num2) {
        super(num, num2);
        Object[] objArr = {num, num2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d52add8064cf51bd43944b54979e284", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d52add8064cf51bd43944b54979e284");
        }
    }

    @Override // android.util.Pair
    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50da9bca45419d9093cf0a34f5ba43d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50da9bca45419d9093cf0a34f5ba43d1")).booleanValue();
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if ((((Integer) this.first).equals(kVar.first) && ((Integer) this.second).equals(kVar.second)) || (((Integer) this.first).equals(kVar.second) && ((Integer) this.second).equals(kVar.first))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.util.Pair
    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e4ca356d7bd220913eed3361e4b0dc6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e4ca356d7bd220913eed3361e4b0dc6")).intValue() : super.hashCode();
    }
}
