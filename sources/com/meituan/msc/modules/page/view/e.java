package com.meituan.msc.modules.page.view;

import android.view.View;
import com.meituan.msc.modules.api.msi.components.coverview.k;
import com.meituan.msc.modules.page.view.coverview.CoverViewRootContainer;
import com.meituan.msc.modules.page.view.coverview.ViewBaseContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    private static CoverViewWrapper a(CoverViewWrapper coverViewWrapper, int i) {
        CoverViewWrapper a2;
        Object[] objArr = {coverViewWrapper, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7583e31964d6a0356e1a197f82ee56b", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7583e31964d6a0356e1a197f82ee56b");
        }
        if (coverViewWrapper == null) {
            return null;
        }
        if (coverViewWrapper.getId() == i) {
            return coverViewWrapper;
        }
        for (int i2 = 0; i2 < coverViewWrapper.getChildCount(); i2++) {
            View childAt = coverViewWrapper.getChildAt(i2);
            if (childAt instanceof CoverViewWrapper) {
                CoverViewWrapper a3 = a((CoverViewWrapper) childAt, i);
                if (a3 != null) {
                    return a3;
                }
            } else if ((childAt instanceof k) && (a2 = a((k) childAt, i)) != null) {
                return a2;
            }
        }
        return null;
    }

    private static CoverViewWrapper a(k kVar, int i) {
        CoverViewWrapper a2;
        Object[] objArr = {kVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be1c4670102d63b5980689b34eb59df1", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be1c4670102d63b5980689b34eb59df1");
        }
        for (int i2 = 0; i2 < kVar.getRootFrame().getChildCount(); i2++) {
            View childAt = kVar.getRootFrame().getChildAt(i2);
            if ((childAt instanceof CoverViewWrapper) && (a2 = a((CoverViewWrapper) childAt, i)) != null) {
                return a2;
            }
        }
        return null;
    }

    public static CoverViewWrapper a(CoverViewRootContainer coverViewRootContainer, int i) {
        Object[] objArr = {coverViewRootContainer, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd67fbba039550b632b42bff206289d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd67fbba039550b632b42bff206289d9");
        }
        if (coverViewRootContainer == null) {
            return null;
        }
        return coverViewRootContainer.a(i);
    }

    public static CoverViewWrapper a(ViewBaseContainer viewBaseContainer, int i) {
        CoverViewWrapper a2;
        Object[] objArr = {viewBaseContainer, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9edcf325c16b3ecc68c06239e6078303", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9edcf325c16b3ecc68c06239e6078303");
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
