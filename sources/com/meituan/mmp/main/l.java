package com.meituan.mmp.main;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class l {
    private static final Map<Class<?>, Integer> a = new ConcurrentHashMap();
    public static ChangeQuickRedirect g;
    private final String b;
    private final int c;

    public l(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e2e782913b2aed6f21c000ec3b6cf1f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e2e782913b2aed6f21c000ec3b6cf1f");
            return;
        }
        Integer num = a.get(getClass());
        num = num == null ? 0 : num;
        this.b = str;
        this.c = num.intValue();
        a.put(getClass(), Integer.valueOf(num.intValue() + 1));
    }

    private int b(l lVar) {
        return this.c - lVar.c;
    }

    public final boolean a(l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "171b9fd349bfad0f49e5434efead92ea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "171b9fd349bfad0f49e5434efead92ea")).booleanValue() : b(lVar) >= 0;
    }

    @NonNull
    public String toString() {
        return this.b;
    }
}
