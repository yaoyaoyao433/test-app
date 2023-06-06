package com.meituan.mmp.lib;

import android.view.View;
import com.meituan.mmp.lib.page.coverview.CoverViewRootContainer;
import com.meituan.mmp.lib.page.coverview.ViewBaseContainer;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ae {
    public static ChangeQuickRedirect a;

    private static CoverViewWrapper a(CoverViewWrapper coverViewWrapper, int i) {
        CoverViewWrapper a2;
        Object[] objArr = {coverViewWrapper, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfd7db16f8ffba796afb3bedaebd8d9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfd7db16f8ffba796afb3bedaebd8d9f");
        }
        if (coverViewWrapper == null || coverViewWrapper.getId() != i) {
            for (int i2 = 0; i2 < coverViewWrapper.getChildCount(); i2++) {
                View childAt = coverViewWrapper.getChildAt(i2);
                if (childAt instanceof CoverViewWrapper) {
                    CoverViewWrapper a3 = a((CoverViewWrapper) childAt, i);
                    if (a3 != null) {
                        return a3;
                    }
                } else if ((childAt instanceof com.meituan.mmp.lib.api.coverview.a) && (a2 = a((com.meituan.mmp.lib.api.coverview.a) childAt, i)) != null) {
                    return a2;
                }
            }
            return null;
        }
        return coverViewWrapper;
    }

    private static CoverViewWrapper a(com.meituan.mmp.lib.api.coverview.a aVar, int i) {
        CoverViewWrapper a2;
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18c23aadf7e94d973909b3bb6a61826a", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18c23aadf7e94d973909b3bb6a61826a");
        }
        for (int i2 = 0; i2 < aVar.getRootFrame().getChildCount(); i2++) {
            View childAt = aVar.getRootFrame().getChildAt(i2);
            if ((childAt instanceof CoverViewWrapper) && (a2 = a((CoverViewWrapper) childAt, i)) != null) {
                return a2;
            }
        }
        return null;
    }

    public static CoverViewWrapper a(CoverViewRootContainer coverViewRootContainer, int i) {
        Object[] objArr = {coverViewRootContainer, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "50818e2bc435d338ce7709a3f5943bba", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "50818e2bc435d338ce7709a3f5943bba");
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = CoverViewRootContainer.a;
        if (PatchProxy.isSupport(objArr2, coverViewRootContainer, changeQuickRedirect2, false, "38d151f4fea9ed3e8556d3b897826d13", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr2, coverViewRootContainer, changeQuickRedirect2, false, "38d151f4fea9ed3e8556d3b897826d13");
        }
        CoverViewWrapper a2 = a(coverViewRootContainer.c, i);
        return a2 == null ? a(coverViewRootContainer.d, i) : a2;
    }

    public static CoverViewWrapper a(ViewBaseContainer viewBaseContainer, int i) {
        CoverViewWrapper a2;
        Object[] objArr = {viewBaseContainer, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9a00d5b00f2c12f1f79e12f1fc7d0f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9a00d5b00f2c12f1f79e12f1fc7d0f2");
        }
        for (int i2 = 0; i2 < viewBaseContainer.getChildCount(); i2++) {
            View childAt = viewBaseContainer.getChildAt(i2);
            if ((childAt instanceof CoverViewWrapper) && (a2 = a((CoverViewWrapper) childAt, i)) != null) {
                return a2;
            }
        }
        return null;
    }
}
