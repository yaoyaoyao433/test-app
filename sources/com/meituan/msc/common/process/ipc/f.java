package com.meituan.msc.common.process.ipc;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static a b = new a();

    public static void b(String str, Map<String, String> map) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a {
        public static ChangeQuickRedirect a;
        int b;
        int c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64966a064a39928f67dfe427a920565b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64966a064a39928f67dfe427a920565b");
                return;
            }
            this.b = 0;
            this.c = 0;
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c59c47cccd0f80897270ea972435bc07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c59c47cccd0f80897270ea972435bc07");
            return;
        }
        b.b++;
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5e2b206a030b71304cfeb09df4485ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5e2b206a030b71304cfeb09df4485ba");
            return;
        }
        b.c++;
    }

    public static void a(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d516a14b55ad85f32af3eafacd6914b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d516a14b55ad85f32af3eafacd6914b");
        } else if (map == null || !map.containsKey("extra")) {
        } else {
            TextUtils.isEmpty(map.get("extra"));
        }
    }
}
