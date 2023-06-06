package com.meituan.android.mrn.engine;

import android.text.TextUtils;
import com.meituan.android.mrn.engine.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static boolean a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56cb06d20f67e8e749000ece01a47973", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56cb06d20f67e8e749000ece01a47973")).booleanValue() : b(eVar) && c(eVar);
    }

    public static boolean b(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7aa8e127891e062ddb24d472af353227", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7aa8e127891e062ddb24d472af353227")).booleanValue();
        }
        if (eVar == null || TextUtils.isEmpty(eVar.c)) {
            com.meituan.android.mrn.utils.p.a("[MRNBundleUtils@checkBundle]", "mrnBundle is null");
            return false;
        } else if (eVar.d()) {
            return true;
        } else {
            com.meituan.android.mrn.utils.p.a("[MRNBundleUtils@checkBundle]", "bundle is not a file or not exists ");
            return false;
        }
    }

    private static boolean c(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab85d5f543d63bbb4bdca9c2b69db194", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab85d5f543d63bbb4bdca9c2b69db194")).booleanValue();
        }
        if (eVar == null) {
            return false;
        }
        List<e.a> list = eVar.n;
        if (list == null) {
            return true;
        }
        for (e.a aVar : list) {
            if (aVar == null || TextUtils.isEmpty(aVar.b) || TextUtils.isEmpty(aVar.c)) {
                com.meituan.android.mrn.utils.p.a("[MRNBundleUtils@checkBundleDependency]", "step1");
                return false;
            } else if (!b(MRNBundleManager.sharedInstance().getBundle(aVar.b, aVar.c))) {
                com.meituan.android.mrn.utils.p.a("[MRNBundleUtils@checkBundleDependency]", "step2");
                return false;
            }
        }
        return true;
    }
}
