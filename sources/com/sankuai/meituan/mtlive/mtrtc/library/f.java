package com.sankuai.meituan.mtlive.mtrtc.library;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.core.k;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static Map<Integer, Integer> b = new HashMap();

    public static void a(int i, k.a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca78efc47c3594a8104d05d7553a35bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca78efc47c3594a8104d05d7553a35bf");
        } else {
            e.e().a(i, aVar);
        }
    }

    public static b a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4290fe95fd6ca7d4b638a6325443a9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4290fe95fd6ca7d4b638a6325443a9d");
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "321ccbf1607c7385357917507f544232", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "321ccbf1607c7385357917507f544232")).booleanValue() : e.e().b(i)) {
            Object a2 = e.e().a(context, i, e.e().a(i));
            if (a2 instanceof b) {
                return (b) a2;
            }
        }
        return null;
    }
}
