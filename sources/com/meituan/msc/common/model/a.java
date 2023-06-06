package com.meituan.msc.common.model;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static final Map<Class<?>, Integer> c = new ConcurrentHashMap();
    public final String b;
    private final int d;

    public a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c035a3d40a1fe26f01c56ab6213a8f23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c035a3d40a1fe26f01c56ab6213a8f23");
            return;
        }
        Integer num = c.get(getClass());
        num = num == null ? 0 : num;
        this.b = str;
        this.d = num.intValue();
        c.put(getClass(), Integer.valueOf(num.intValue() + 1));
    }

    @NonNull
    public String toString() {
        return this.b;
    }

    public final boolean a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8aa05fe26e30f4d98f445b79f5eb0fd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8aa05fe26e30f4d98f445b79f5eb0fd")).booleanValue() : this.d - aVar.d >= 0;
    }
}
