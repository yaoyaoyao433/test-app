package com.sankuai.waimai.business.restaurant.poicontainer.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Map<String, C0849a> b = new HashMap();

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.poicontainer.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0849a {
        public int a;
        public String b;
    }

    public static void a(String str, C0849a c0849a) {
        Object[] objArr = {str, c0849a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "858949ea4768f8d9bb50b78ef2edb469", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "858949ea4768f8d9bb50b78ef2edb469");
        } else {
            b.put(str, c0849a);
        }
    }

    public static C0849a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44e1475a76e83ca54117e1adc5eca9c2", RobustBitConfig.DEFAULT_VALUE) ? (C0849a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44e1475a76e83ca54117e1adc5eca9c2") : b.get(str);
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5fcf7f8e6e86017bf135d5bfdb439d42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5fcf7f8e6e86017bf135d5bfdb439d42");
        } else {
            b.remove(str);
        }
    }
}
