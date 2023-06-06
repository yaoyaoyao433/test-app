package com.dianping.video.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements a {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.video.log.a
    public final void a(Class cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec54f1593c742f95afba1550ad0983e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec54f1593c742f95afba1550ad0983e5");
        }
    }

    @Override // com.dianping.video.log.a
    public final void a(Class cls, String str, String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85564ccce39cbf4d3a819e80124c2bdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85564ccce39cbf4d3a819e80124c2bdd");
        }
    }

    @Override // com.dianping.video.log.a
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04d794a750bfaf8f4ee1aa190a48e3d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04d794a750bfaf8f4ee1aa190a48e3d0");
        }
    }

    @Override // com.dianping.video.log.a
    public final void b(Class cls, String str, String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83162ad29e46ad2cb0127d302994d7bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83162ad29e46ad2cb0127d302994d7bc");
        }
    }
}
