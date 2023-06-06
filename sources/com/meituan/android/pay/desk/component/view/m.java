package com.meituan.android.pay.desk.component.view;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class m {
    public static ChangeQuickRedirect a;

    @SuppressLint({"InflateParams"})
    public static void a(LinearLayout linearLayout, Object obj, int i) {
        Object[] objArr = {linearLayout, obj, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "846feec6fac5687b0a8a4c7b8c2cc76c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "846feec6fac5687b0a8a4c7b8c2cc76c");
            return;
        }
        View findViewWithTag = linearLayout.findViewWithTag(obj);
        if (findViewWithTag == null) {
            findViewWithTag = LayoutInflater.from(linearLayout.getContext()).inflate(i, (ViewGroup) linearLayout, false);
            findViewWithTag.setTag(obj);
            linearLayout.addView(findViewWithTag);
        }
        if (findViewWithTag.getVisibility() == 8) {
            findViewWithTag.setVisibility(0);
        }
    }

    public static void a(LinearLayout linearLayout, View view, Object obj) {
        Object[] objArr = {linearLayout, view, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c1dae39b0550006a1a73fe42854ce3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c1dae39b0550006a1a73fe42854ce3e");
        } else if (obj == null) {
            linearLayout.addView(view);
        } else {
            int indexOfChild = linearLayout.indexOfChild(linearLayout.findViewWithTag(obj));
            if (indexOfChild >= 0) {
                linearLayout.addView(view, indexOfChild + 1);
            }
        }
    }

    public static void a(LinearLayout linearLayout, Object obj) {
        Object[] objArr = {linearLayout, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "919761f4dc7fd4773c45e8720c316dda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "919761f4dc7fd4773c45e8720c316dda");
            return;
        }
        View findViewWithTag = linearLayout.findViewWithTag(obj);
        if (findViewWithTag != null) {
            findViewWithTag.setVisibility(8);
        }
    }

    public static void a(com.meituan.android.pay.desk.component.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b6e2ad0d380aa9bcf571a98729148a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b6e2ad0d380aa9bcf571a98729148a2");
        } else if (aVar.a()) {
            aVar.b();
            aVar.c();
        } else {
            aVar.d();
        }
    }
}
