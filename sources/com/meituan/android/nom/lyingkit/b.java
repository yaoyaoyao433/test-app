package com.meituan.android.nom.lyingkit;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect a;
    public static Context b;
    public static Application c;
    public static final /* synthetic */ boolean d = !b.class.desiredAssertionStatus();
    private static Map<String, com.meituan.android.nom.base.a> e = new HashMap();
    private static Map<String, Method> f = new HashMap();
    private static Map<String, Object> g = new HashMap();
    private static final ExecutorService h = com.sankuai.android.jarvis.c.a("lyingkit-executor", 5);

    public static synchronized void a(@NonNull Context context) {
        synchronized (b.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c23011323190e05509624bef20f33da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c23011323190e05509624bef20f33da");
            } else if (b == null || c == null) {
                if (context != null) {
                    Context applicationContext = context.getApplicationContext();
                    b = applicationContext;
                    c = (Application) applicationContext;
                    a.a(b);
                    c.a(c);
                    a("share");
                    return;
                }
                throw new RuntimeException("调用Lyingkit初始化方法失败");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ea, code lost:
        if (r8.length == 3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0294 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028a  */
    @android.support.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(final com.meituan.android.nom.lyingkit.LyingkitZone r32, java.lang.String r33, java.lang.Object... r34) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.nom.lyingkit.b.a(com.meituan.android.nom.lyingkit.LyingkitZone, java.lang.String, java.lang.Object[]):java.lang.Object");
    }

    private static com.meituan.android.nom.base.a a(String str) {
        com.meituan.android.nom.base.a aVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be842d92a91cf32cee1b745e63a5278e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.nom.base.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be842d92a91cf32cee1b745e63a5278e");
        }
        synchronized (str) {
            aVar = e.get(str);
            if (aVar == null) {
                try {
                    com.meituan.android.nom.base.a aVar2 = (com.meituan.android.nom.base.a) Class.forName("com.meituan.android.nom.LyingkitKernel_" + str).newInstance();
                    if (aVar2 != null) {
                        try {
                            e.put(str, aVar2);
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
                        }
                    }
                    aVar = aVar2;
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused2) {
                }
            }
        }
        return aVar;
    }
}
