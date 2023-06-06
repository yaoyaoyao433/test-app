package com.meituan.msc.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ak {
    public static ChangeQuickRedirect a;
    private static final float[] b = new float[2];
    private static final PointF c = new PointF();
    private static final float[] d = new float[2];
    private static final Matrix e = new Matrix();

    public static int a(float f, float f2, ViewGroup viewGroup) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "408dacaa0ba39cb0d0faa39f5abc03fe", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "408dacaa0ba39cb0d0faa39f5abc03fe")).intValue() : a(f, f2, viewGroup, b, (int[]) null);
    }

    public static int a(float f, float f2, ViewGroup viewGroup, float[] fArr, @Nullable int[] iArr) {
        View a2;
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), viewGroup, fArr, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e0c601bba8147bdd79298bc54206a34", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e0c601bba8147bdd79298bc54206a34")).intValue();
        }
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        fArr[0] = f;
        fArr[1] = f2;
        View a3 = a(fArr, viewGroup);
        return (a3 == null || (a2 = a(a3)) == null) ? id : a(a2, fArr[0], fArr[1]);
    }

    public static void a(float f, float f2, ViewGroup viewGroup, float[] fArr, com.meituan.msc.mmpviews.list.event.g gVar) {
        View a2;
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), viewGroup, fArr, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "473aec7e411b9543c7eb8fe8032b5b0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "473aec7e411b9543c7eb8fe8032b5b0a");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        fArr[0] = f;
        fArr[1] = f2;
        View a3 = a(fArr, viewGroup);
        if (a3 != null && (a2 = a(a3)) != null) {
            gVar.c = a(a2, fArr[0], fArr[1]);
            a3 = a2;
        }
        gVar.i = a3;
    }

    private static View a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfa19c98d99cdfd01221517d45c7a5d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfa19c98d99cdfd01221517d45c7a5d8");
        }
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b6, code lost:
        if (((com.meituan.msc.uimanager.x) r6).a(r23[0], r23[1]) != r6.getId()) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.view.View a(float[] r23, android.view.ViewGroup r24) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.ak.a(float[], android.view.ViewGroup):android.view.View");
    }

    private static int a(View view, float f, float f2) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "440ed48097854a6e02c64fee998e9a6c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "440ed48097854a6e02c64fee998e9a6c")).intValue();
        }
        if (view instanceof x) {
            return ((x) view).a(f, f2);
        }
        return view.getId();
    }
}
