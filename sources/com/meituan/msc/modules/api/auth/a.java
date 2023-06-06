package com.meituan.msc.modules.api.auth;

import android.content.Context;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static HashMap<String, List<InterfaceC0453a>> b = new LinkedHashMap();

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.modules.api.auth.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0453a {
        void a(int i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
        if (r12.equals("scope.userLocation") != false) goto L11;
     */
    @android.support.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.api.auth.a.a(java.lang.String):java.lang.String");
    }

    public static Map<String, Boolean> a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6556ea16c795f4bc9d984ee491a45380", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6556ea16c795f4bc9d984ee491a45380");
        }
        Map<String, ?> all = MSCEnvHelper.getSharedPreferences(context, "mmp_auth_" + str).getAll();
        HashMap hashMap = new HashMap();
        if (all != null) {
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if (!"scope.PhoneNumber".equals(entry.getKey()) && (entry.getValue() instanceof Integer)) {
                    hashMap.put(entry.getKey(), Boolean.valueOf(((Integer) entry.getValue()).intValue() == 1));
                }
            }
        }
        return hashMap;
    }

    public static void a(Context context, String str, String str2, boolean z) {
        Object[] objArr = {context, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "140bfddbdd866f1eb4140e4a88a181bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "140bfddbdd866f1eb4140e4a88a181bc");
            return;
        }
        MSCEnvHelper.getSharedPreferences(context, "mmp_auth_" + str).edit().putInt(str2, z ? 1 : -1).apply();
    }
}
