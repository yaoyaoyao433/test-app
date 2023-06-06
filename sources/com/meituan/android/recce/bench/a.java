package com.meituan.android.recce.bench;

import android.os.Trace;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static String b = "BenchTrace";
    private static int c;

    public static void a(String str, int i) {
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b5eec46babbc0d6d13f55ac476a37d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b5eec46babbc0d6d13f55ac476a37d9");
            return;
        }
        c++;
        Trace.beginSection(str);
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c779f7835669ecb0c32fa1e9e8cfdf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c779f7835669ecb0c32fa1e9e8cfdf3");
            return;
        }
        c--;
        Trace.endSection();
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a300669477c077c3df76dbb185a5dac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a300669477c077c3df76dbb185a5dac");
        } else if (c != 0) {
            String str = b;
            Log.e(str, "Bench Error: " + c);
        }
    }
}
