package com.sankuai.waimai.ugc.creator.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static int a(Intent intent, String str, int i) {
        Object[] objArr = {intent, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "978129a8eb7a6bc0ee01055c906e08bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "978129a8eb7a6bc0ee01055c906e08bb")).intValue();
        }
        if (intent == null) {
            return i;
        }
        Integer a2 = a(intent, str, (Integer) null);
        if (a2 == null) {
            return b(intent, str, i);
        }
        return a2.intValue();
    }

    public static String a(Intent intent, String str, String str2) {
        Object[] objArr = {intent, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61e4af0fb38b0eadc2ea71738fb97631", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61e4af0fb38b0eadc2ea71738fb97631");
        }
        if (intent == null) {
            return str2;
        }
        String c = c(intent, str, null);
        return c == null ? b(intent, str, str2) : c;
    }

    private static String b(Intent intent, String str, String str2) {
        String a2;
        Object[] objArr = {intent, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a420c4fe114cd2535e9292b74fd82248", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a420c4fe114cd2535e9292b74fd82248") : (intent == null || (a2 = com.sankuai.waimai.platform.utils.f.a(intent, str)) == null) ? str2 : a2;
    }

    private static int b(Intent intent, String str, int i) {
        Object[] objArr = {intent, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aee132053e45ac7f82348a949f2d3243", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aee132053e45ac7f82348a949f2d3243")).intValue() : intent != null ? com.sankuai.waimai.platform.utils.f.a(intent, str, i) : i;
    }

    private static String c(Intent intent, String str, String str2) {
        Object[] objArr = {intent, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "957a49692a86bffcfb066c750696a628", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "957a49692a86bffcfb066c750696a628");
        }
        if (str != null) {
            return d(intent, str, null);
        }
        return null;
    }

    private static Integer a(Intent intent, String str, Integer num) {
        Object[] objArr = {intent, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b9dc0a3162d7c805a2f7ebce7d4aa63", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b9dc0a3162d7c805a2f7ebce7d4aa63");
        }
        if (str != null) {
            return b(intent, str, (Integer) null);
        }
        return null;
    }

    private static String d(Intent intent, String str, String str2) {
        Object[] objArr = {intent, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3a4d3d3d09400263fcd9efff3219a18", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3a4d3d3d09400263fcd9efff3219a18");
        }
        Uri data = intent.getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter(str);
            if (!TextUtils.isEmpty(queryParameter)) {
                return queryParameter;
            }
        }
        return str2;
    }

    private static Integer b(Intent intent, String str, Integer num) {
        Object[] objArr = {intent, str, num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fc9ec97362b590fa393dd66b7bd2cfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fc9ec97362b590fa393dd66b7bd2cfe");
        }
        try {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter)) {
                    return Integer.valueOf(Integer.parseInt(queryParameter));
                }
            }
            return num;
        } catch (Exception unused) {
            return num;
        }
    }

    public static void a(Context context, String str, @Nullable Bundle bundle, int i) {
        Object[] objArr = {context, str, bundle, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c03330fc5ba18aceb4814662d19dc189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c03330fc5ba18aceb4814662d19dc189");
            return;
        }
        try {
            com.sankuai.waimai.foundation.router.a.a(context, str, bundle, i);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
    }
}
