package com.meituan.mmp.lib.utils;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class z {
    public static ChangeQuickRedirect a;

    public static HashMap<String, Object> a(Intent intent, String str) {
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90dbf4f56915445b6eeaf02a4d16e451", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90dbf4f56915445b6eeaf02a4d16e451");
        }
        if (intent == null) {
            return null;
        }
        try {
            if (intent.hasExtra(str)) {
                return (HashMap) com.sankuai.waimai.platform.utils.f.c(intent, str);
            }
            return null;
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.a("exception when parsing intent: " + intent.toString(), e);
            return null;
        }
    }

    @Nullable
    public static String b(Intent intent, String str) {
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f56b61fa7c18b0aa51acc341f142c36", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f56b61fa7c18b0aa51acc341f142c36");
        }
        if (intent == null) {
            return null;
        }
        try {
            if (intent.hasExtra(str)) {
                return com.sankuai.waimai.platform.utils.f.a(intent, str);
            }
            Uri data = intent.getData();
            if (data != null) {
                return data.getQueryParameter(str);
            }
            return null;
        } catch (Exception e) {
            com.meituan.mmp.lib.trace.b.a("exception when parsing intent: " + intent.toString(), e);
            return null;
        }
    }

    public static boolean a(Intent intent, String str, boolean z) {
        Object[] objArr = {intent, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7520140f78d03e1a7876b8f1e419cbe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7520140f78d03e1a7876b8f1e419cbe")).booleanValue();
        }
        Boolean c = c(intent, str);
        return c != null ? c.booleanValue() : z;
    }

    @Nullable
    private static Boolean c(Intent intent, String str) {
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "074bd4bb913425f2435154bbcc6bf59b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "074bd4bb913425f2435154bbcc6bf59b");
        }
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Object obj = extras.get(str);
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof String) {
                String lowerCase = ((String) obj).toLowerCase(Locale.ROOT);
                if ("false".equals(lowerCase) || "0".equals(lowerCase)) {
                    return Boolean.FALSE;
                }
                if ("true".equals(lowerCase) || "1".equals(lowerCase)) {
                    return Boolean.TRUE;
                }
            }
        }
        Uri data = intent.getData();
        if (data == null || data.getQueryParameter(str) == null) {
            return null;
        }
        return Boolean.valueOf(data.getBooleanQueryParameter(str, false));
    }

    public static int a(Intent intent, String str, int i) {
        String queryParameter;
        Object[] objArr = {intent, str, 1001};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ceb36d5f4f70a39de11f3b4acef81d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ceb36d5f4f70a39de11f3b4acef81d1")).intValue();
        }
        if (intent == null) {
            return 1001;
        }
        if (intent.hasExtra(str)) {
            return com.sankuai.waimai.platform.utils.f.a(intent, str, 1001);
        }
        Uri data = intent.getData();
        if (data == null || (queryParameter = data.getQueryParameter(str)) == null) {
            return 1001;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException unused) {
            return 1001;
        }
    }

    public static void a(Intent intent, Intent intent2, String str) {
        Object[] objArr = {intent, intent2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b90271a9bf9b7d4455d58fb4c6a3735f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b90271a9bf9b7d4455d58fb4c6a3735f");
        } else {
            intent2.putExtra(str, b(intent, str));
        }
    }

    public static void b(Intent intent, Intent intent2, String str) {
        Object[] objArr = {intent, intent2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b30eec112da5a209a0f307ea1e7e1ac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b30eec112da5a209a0f307ea1e7e1ac0");
            return;
        }
        Boolean c = c(intent, str);
        if (c != null) {
            intent2.putExtra(str, c);
        }
    }
}
