package com.meituan.msc.modules.update.pkg;

import com.meituan.msc.common.utils.f;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static boolean a(List<PackageInfoWrapper> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "205a61720fc7321996f9492e7c532cf2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "205a61720fc7321996f9492e7c532cf2")).booleanValue();
        }
        if (f.a((List) list)) {
            return true;
        }
        for (PackageInfoWrapper packageInfoWrapper : list) {
            if (!packageInfoWrapper.isPackageInjected) {
                return false;
            }
        }
        return true;
    }
}
