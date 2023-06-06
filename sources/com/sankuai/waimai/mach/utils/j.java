package com.sankuai.waimai.mach.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.yoga.YogaEdge;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.widget.MachViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5803b80d9b3348af8f1b6a8208ddc09", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5803b80d9b3348af8f1b6a8208ddc09")).intValue() : (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b682e0b282325fbd1498a0661fcd03fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b682e0b282325fbd1498a0661fcd03fa")).intValue();
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                i2 = Math.max(i2, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
            }
            return i2;
        }
        return View.MeasureSpec.getSize(i);
    }

    public static int b(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbacb5c89abfd70bfdf9b7892649cec3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbacb5c89abfd70bfdf9b7892649cec3")).intValue();
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                i2 = Math.max(i2, childAt.getTop() + childAt.getMeasuredHeight() + childAt.getPaddingTop() + childAt.getPaddingBottom());
            }
            return i2;
        }
        return View.MeasureSpec.getSize(i);
    }

    public static ViewGroup a(View view) {
        int i;
        int i2;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c8f4134eb95d9f6ef66f019f90c5b6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c8f4134eb95d9f6ef66f019f90c5b6a");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i = layoutParams.width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            i2 = layoutParams.height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        } else {
            i = layoutParams.width;
            i2 = layoutParams.height;
        }
        MachViewGroup machViewGroup = new MachViewGroup(view.getContext());
        machViewGroup.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        machViewGroup.addView(view);
        return machViewGroup;
    }

    public static void a(ViewGroup viewGroup, com.facebook.yoga.d dVar) {
        Object[] objArr = {viewGroup, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "afb3d649dcf1292f22910ffc94981bef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "afb3d649dcf1292f22910ffc94981bef");
        } else {
            a(viewGroup, dVar, 0, 0);
        }
    }

    public static void a(ViewGroup viewGroup, com.facebook.yoga.d dVar, int i, int i2) {
        Object[] objArr = {viewGroup, dVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0b8762fae3b121088992f54f3bb7131", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0b8762fae3b121088992f54f3bb7131");
        } else if (viewGroup == null || dVar == null) {
        } else {
            int e = (int) dVar.e(YogaEdge.LEFT);
            int e2 = (int) dVar.e(YogaEdge.RIGHT);
            int e3 = (int) dVar.e(YogaEdge.TOP);
            int e4 = (int) dVar.e(YogaEdge.BOTTOM);
            if (e == 0 && e2 == 0 && e3 == 0 && e4 == 0) {
                return;
            }
            int measuredWidth = viewGroup.getMeasuredWidth();
            int measuredHeight = viewGroup.getMeasuredHeight();
            int s = ((int) dVar.s()) + e + e2;
            int t = ((int) dVar.t()) + e3 + e4;
            if (i <= 0) {
                i = measuredWidth != s ? s : 0;
            }
            if (i2 > 0) {
                t = i2;
            } else if (measuredHeight == t) {
                t = 0;
            }
            if (i <= 0 || t <= 0) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = t;
            viewGroup.setLayoutParams(layoutParams);
        }
    }
}
