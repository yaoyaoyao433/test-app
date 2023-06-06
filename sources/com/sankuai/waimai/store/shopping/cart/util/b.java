package com.sankuai.waimai.store.shopping.cart.util;

import android.support.annotation.NonNull;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull TextView textView, @NonNull TextView textView2, String str, boolean z) {
        Object[] objArr = {textView, textView2, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9003d5567d66d5781f319a799915cfe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9003d5567d66d5781f319a799915cfe6");
            return;
        }
        float f = 21.5f;
        float f2 = 10.0f;
        if (!t.a(str) && z) {
            int length = str.length();
            if (length == 5) {
                f = 18.0f;
            } else if (length == 6) {
                f = 14.0f;
            } else if (length >= 7) {
                f = 12.0f;
                f2 = 9.0f;
            }
        }
        u.d(textView2, h.a(textView2.getContext(), 2.0f), 0, 0, 0);
        textView.setTextSize(2, f);
        textView2.setTextSize(2, f2);
    }

    public static int a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7893508238914842843a55b8610d52e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7893508238914842843a55b8610d52e")).intValue();
        }
        if (t.a(str) || !z) {
            return 18;
        }
        int length = str.length();
        if (length == 5) {
            return 14;
        }
        if (length == 6) {
            return 10;
        }
        return length >= 7 ? 8 : 18;
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73227e345b61bcfaa347c9feee1acd01", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73227e345b61bcfaa347c9feee1acd01")).booleanValue() : b(str) < 4;
    }

    private static int b(String str) {
        char[] charArray;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8c725031c2ddcb95eb3bde53e50578f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8c725031c2ddcb95eb3bde53e50578f")).intValue();
        }
        if (t.a(str)) {
            return 0;
        }
        int i = 0;
        for (char c : str.toCharArray()) {
            if (c == '.' || (c >= '0' && c <= '9')) {
                i++;
            }
        }
        return i;
    }
}
