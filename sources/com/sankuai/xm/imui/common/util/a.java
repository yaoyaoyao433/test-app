package com.sankuai.xm.imui.common.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.w;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static ConcurrentHashMap<Class<?>, Class<?>> b = new ConcurrentHashMap<>();
    private static volatile boolean c = false;

    public static Class<?> a(Context context, Class<?> cls) {
        boolean z = false;
        Object[] objArr = {context, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f98ad7691fba7c7b067a295201b40d9", 6917529027641081856L)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f98ad7691fba7c7b067a295201b40d9");
        }
        Object[] objArr2 = {context, cls};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "942717e0a57d3831d9eb631831b357b3", 6917529027641081856L)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "942717e0a57d3831d9eb631831b357b3")).booleanValue();
        } else if (cls != null && ((c || w.g(context)) && b.containsKey(cls))) {
            z = true;
        }
        if (z) {
            return b.get(cls);
        }
        return null;
    }
}
