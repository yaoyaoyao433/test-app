package com.meituan.msc.modules.reporter.memory;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    @NonNull
    private static final ConcurrentHashMap<String, List<Object>> b = new ConcurrentHashMap<>();
    @NonNull
    private static final ConcurrentHashMap<String, List<Object>> c = new ConcurrentHashMap<>();
    @NonNull
    private static final ConcurrentHashMap<String, Long> d = new ConcurrentHashMap<>();

    public static void a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fff16164edc434c4ec12875972fe7a17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fff16164edc434c4ec12875972fe7a17");
        } else if (str == null) {
        } else {
            b.remove(str);
            c.remove(str);
            d.remove(str);
        }
    }
}
