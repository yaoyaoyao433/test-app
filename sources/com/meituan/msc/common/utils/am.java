package com.meituan.msc.common.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class am {
    public static ChangeQuickRedirect a;

    public static String a(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abc01bb9702590969ee542545cbf5346", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abc01bb9702590969ee542545cbf5346");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String trim = str.trim();
        if (!trim.startsWith("/")) {
            return "/" + trim;
        }
        while (i < trim.length() && File.separatorChar == trim.charAt(i)) {
            i++;
        }
        return "/" + trim.substring(i);
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7531aef7f78300116d07e72b6c2fb0cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7531aef7f78300116d07e72b6c2fb0cd");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String substring = Uri.parse("msc://www.meituan.com/" + str).getPath().substring(1);
        if (TextUtils.isEmpty(substring)) {
            return "";
        }
        int lastIndexOf = substring.lastIndexOf(CommonConstant.Symbol.DOT);
        return lastIndexOf > 0 ? substring.substring(0, lastIndexOf) : substring;
    }

    public static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8bc62fa84fcc129e2befae5ddd64748", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8bc62fa84fcc129e2befae5ddd64748");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse("msc://www.meituan.com/" + str);
        String query = MSCHornRollbackConfig.m() ? parse.getQuery() : parse.getEncodedQuery();
        return TextUtils.isEmpty(query) ? "" : query;
    }
}
