package com.meituan.roodesign.resfetcher.widgets;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.runtime.b;
import com.meituan.roodesign.resfetcher.runtime.c;
import com.meituan.roodesign.resfetcher.runtime.e;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(View view, String str, String str2) {
        int i;
        int i2;
        Object[] objArr = {view, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27fb82a24124a032d87fb8232f886fc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27fb82a24124a032d87fb8232f886fc1");
        } else if (b(view, str, str2)) {
        } else {
            Pair<Integer, Integer> a2 = com.meituan.roodesign.resfetcher.utils.a.a(str2);
            if (a2 != null) {
                int intValue = ((Integer) a2.first).intValue();
                i2 = ((Integer) a2.second).intValue();
                i = intValue;
            } else {
                i = 0;
                i2 = 0;
            }
            String b = com.meituan.roodesign.resfetcher.utils.a.b(str2);
            if (!view.isInEditMode()) {
                c.a(view, b, 0, 0, i, i2);
            } else {
                e.a(view, str, b, i, i2);
            }
        }
    }

    public static void a(View view, String str, String str2, final b bVar) {
        Object[] objArr = {view, str, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a15b25cdae25e236b856e3ec76741b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a15b25cdae25e236b856e3ec76741b7");
        } else if (b(view, str, str2)) {
        } else {
            if (!view.isInEditMode()) {
                c.a(view.getContext(), str2, new b() { // from class: com.meituan.roodesign.resfetcher.widgets.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.roodesign.resfetcher.runtime.b
                    public final void a(Drawable drawable, boolean z) {
                        Object[] objArr2 = {drawable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f1691e3e3ea2d28f327d238b4981a215", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f1691e3e3ea2d28f327d238b4981a215");
                        } else if (b.this != null) {
                            b.this.a(drawable, z);
                        }
                    }
                });
            } else {
                bVar.a(e.a(view.getContext(), str, str2, 0, 0), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(View view, String str, String str2) {
        Object[] objArr = {view, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "282352e1c10f2482541cea31aecbaced", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "282352e1c10f2482541cea31aecbaced")).booleanValue() : view == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2);
    }
}
