package com.sankuai.xm.imui.common.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.constraint.R;
import android.util.TypedValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static int a(Context context, int i, int i2) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf((int) R.layout.xm_sdk_send_panel_input_bar_empty)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e40e8ddfe41d92c0c222e67f331dc3a3", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e40e8ddfe41d92c0c222e67f331dc3a3")).intValue();
        }
        if (i == 0) {
            return R.layout.xm_sdk_send_panel_input_bar_empty;
        }
        try {
            context.getResources().getLayout(i);
            return i;
        } catch (Exception unused) {
            return R.layout.xm_sdk_send_panel_input_bar_empty;
        }
    }

    public static int b(Context context, int i, int i2) {
        Object[] objArr = {context, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e9b8231fd4c2d9122a836cc550fbc2e", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e9b8231fd4c2d9122a836cc550fbc2e")).intValue();
        }
        try {
            context.getResources().getXml(i);
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static String c(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "879dfc197a082e8060c36323baf8ae51", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "879dfc197a082e8060c36323baf8ae51");
        }
        TypedValue typedValue = new TypedValue();
        try {
            context.getResources().getValue(i, typedValue, true);
        } catch (Exception e) {
            d.a(e);
        }
        if (typedValue.string == null) {
            return null;
        }
        return typedValue.string.toString();
    }

    public static String a(Context context, int i) {
        int lastIndexOf;
        int i2;
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e4b31d55c3c1df214b93f39a97484d3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e4b31d55c3c1df214b93f39a97484d3");
        }
        String c = c(context, i);
        if (c == null || (lastIndexOf = c.lastIndexOf(46)) < 0 || (i2 = lastIndexOf + 1) >= c.length()) {
            return null;
        }
        return c.substring(i2);
    }

    public static boolean a(TypedArray typedArray, int i) {
        int i2;
        Object[] objArr = {typedArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a85fb0d1664e3673fe92157d71f3adfc", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a85fb0d1664e3673fe92157d71f3adfc")).booleanValue();
        }
        Object[] objArr2 = {typedArray, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e8f37e54a5df163d90cf880d45b8055d", 6917529027641081856L)) {
            i2 = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e8f37e54a5df163d90cf880d45b8055d")).intValue();
        } else if (Build.VERSION.SDK_INT >= 21) {
            i2 = typedArray.getType(i);
        } else {
            TypedValue peekValue = typedArray.peekValue(i);
            i2 = peekValue == null ? 0 : peekValue.type;
        }
        return i2 >= 28 && i2 <= 31;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.sankuai.xm.imui.common.entity.a> b(android.content.Context r12, int r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.imui.common.util.h.b(android.content.Context, int):java.util.List");
    }
}
