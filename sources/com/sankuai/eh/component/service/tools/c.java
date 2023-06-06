package com.sankuai.eh.component.service.tools;

import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    public static JsonArray c;
    public static String d;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d1b66c5a7b8e7871692c2d9447eccb6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d1b66c5a7b8e7871692c2d9447eccb6")).booleanValue();
        }
        if (f.b()) {
            return b;
        }
        return false;
    }

    public static JsonArray b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6726cf5ed90dab27f53cabe57b00061f", RobustBitConfig.DEFAULT_VALUE) ? (JsonArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6726cf5ed90dab27f53cabe57b00061f") : c == null ? new JsonArray() : c;
    }
}
