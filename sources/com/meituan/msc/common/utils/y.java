package com.meituan.msc.common.utils;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class y {
    public static ChangeQuickRedirect a;

    @Nullable
    public static String a(Intent intent, String str) {
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9229dd550a0efbfea38acb77a76ec758", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9229dd550a0efbfea38acb77a76ec758");
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
            com.meituan.msc.modules.reporter.g.a("exception when parsing intent: " + intent.toString(), e);
            return null;
        }
    }

    public static boolean a(Intent intent, String str, boolean z) {
        Object[] objArr = {intent, str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "942107ef61873db2831b44350a5f091d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "942107ef61873db2831b44350a5f091d")).booleanValue();
        }
        Boolean b = b(intent, str);
        if (b != null) {
            return b.booleanValue();
        }
        return false;
    }

    @Nullable
    private static Boolean b(Intent intent, String str) {
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "852fe064ba16849aaf02caf393dda5d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "852fe064ba16849aaf02caf393dda5d7");
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
        Object[] objArr = {intent, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c15b0bcc95e9420b6bb7a60d3ab496eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c15b0bcc95e9420b6bb7a60d3ab496eb")).intValue();
        }
        if (intent == null) {
            return i;
        }
        if (intent.hasExtra(str)) {
            return com.sankuai.waimai.platform.utils.f.a(intent, str, i);
        }
        Uri data = intent.getData();
        if (data == null || (queryParameter = data.getQueryParameter(str)) == null) {
            return i;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    @SuppressLint({"IntentExtraKey"})
    public static void a(Intent intent, Intent intent2, String str) {
        Object[] objArr = {intent, intent2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3b68bb068c84e27d6bed05746d427f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3b68bb068c84e27d6bed05746d427f0");
        } else {
            intent2.putExtra(str, a(intent, str));
        }
    }

    @SuppressLint({"IntentExtraKey"})
    public static void b(Intent intent, Intent intent2, String str) {
        Object[] objArr = {intent, intent2, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ceb0d6dfc859fa10aa3f710163f0a52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ceb0d6dfc859fa10aa3f710163f0a52");
            return;
        }
        Boolean b = b(intent, str);
        if (b != null) {
            intent2.putExtra(str, b);
        }
    }
}
