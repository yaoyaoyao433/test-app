package com.meituan.msc.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.uimanager.an;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static void a(ViewGroup viewGroup, float f, float f2) {
        Object[] objArr = {viewGroup, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b1dfc0dd97f931fd95f7a03c2536ea9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b1dfc0dd97f931fd95f7a03c2536ea9");
        } else {
            a(viewGroup, i.SCROLL, f, f2);
        }
    }

    public static void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9cdb852392981832b8d50e506f0dcb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9cdb852392981832b8d50e506f0dcb3");
        } else {
            a(viewGroup, i.BEGIN_DRAG);
        }
    }

    public static void b(ViewGroup viewGroup, float f, float f2) {
        Object[] objArr = {viewGroup, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6577830f5a41dc3a454b0abf411173aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6577830f5a41dc3a454b0abf411173aa");
        } else {
            a(viewGroup, i.END_DRAG, f, f2);
        }
    }

    public static void a(ViewGroup viewGroup, int i, int i2) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03102502bfa13ec5ba1b07ee12b0a315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03102502bfa13ec5ba1b07ee12b0a315");
        } else {
            a(viewGroup, i.MOMENTUM_BEGIN, i, i2);
        }
    }

    public static void b(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66f61407e91e3f0f37c7470b00bc76c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66f61407e91e3f0f37c7470b00bc76c1");
        } else {
            a(viewGroup, i.MOMENTUM_END);
        }
    }

    private static void a(ViewGroup viewGroup, i iVar) {
        Object[] objArr = {viewGroup, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db0159b3f47cc9554f5976c6993c20d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db0159b3f47cc9554f5976c6993c20d5");
        } else {
            a(viewGroup, iVar, 0.0f, 0.0f);
        }
    }

    private static void a(ViewGroup viewGroup, i iVar, float f, float f2) {
        Object[] objArr = {viewGroup, iVar, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70623bed304ae915d04edbc54ead7977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70623bed304ae915d04edbc54ead7977");
            return;
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null) {
            return;
        }
        an.a((ReactContext) viewGroup.getContext(), viewGroup.getId()).a(h.a(viewGroup.getId(), iVar, viewGroup.getScrollX(), viewGroup.getScrollY(), f, f2, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
    }

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "683527c6253a50ac8c59de91f835c506", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "683527c6253a50ac8c59de91f835c506")).intValue();
        }
        if (str == null || str.equals(FpsEvent.TYPE_SCROLL_AUTO)) {
            return 1;
        }
        if (str.equals("always")) {
            return 0;
        }
        if (str.equals("never")) {
            return 2;
        }
        throw new JSApplicationIllegalArgumentException("wrong overScrollMode: " + str);
    }
}
