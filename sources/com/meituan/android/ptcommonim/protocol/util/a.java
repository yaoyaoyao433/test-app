package com.meituan.android.ptcommonim.protocol.util;

import com.dianping.networklog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "914aec275dedceb2a5c4cc55635e7902", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "914aec275dedceb2a5c4cc55635e7902");
            return;
        }
        try {
            c.a("ptcommonim-logan-tag--" + str, 47);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23c00fa41cf79ed5a8375a719154b069", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23c00fa41cf79ed5a8375a719154b069");
            return;
        }
        try {
            c.a(str + "--" + str2, 47);
        } catch (Throwable unused) {
        }
    }
}
