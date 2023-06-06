package com.sankuai.waimai.store.mrn.af;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    protected static String b = File.separator;

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc1cf8eb67b77ac0cbf7c96fa52735e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc1cf8eb67b77ac0cbf7c96fa52735e6");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str + str2;
    }

    public static boolean a(Context context, String str, @Nullable String str2) {
        File file;
        Uri parse;
        boolean z;
        Cursor a2;
        String str3 = str;
        boolean z2 = true;
        Object[] objArr = {context, str3, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec91153ebcb53189f92678b0df0a522e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec91153ebcb53189f92678b0df0a522e")).booleanValue();
        }
        try {
            if (str3.startsWith(b)) {
                File file2 = new File(str3);
                return file2.exists() && file2.isFile();
            }
            Object[] objArr2 = {context, str3, str2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "12f9582356576700e7320157ed46e844", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "12f9582356576700e7320157ed46e844")).booleanValue();
            }
            if (str3 == null) {
                return false;
            }
            Object[] objArr3 = {str3};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a618e239a4e76483012b68b1cecf094a", RobustBitConfig.DEFAULT_VALUE)) {
                file = (File) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a618e239a4e76483012b68b1cecf094a");
            } else {
                if (str3 != null) {
                    if (!str3.startsWith(File.separator) && str3.contains("://")) {
                        if (str3.startsWith("file://")) {
                            file = new File(str3.substring(7));
                        }
                    }
                    file = new File(str3);
                }
                file = null;
            }
            if (file != null) {
                if (Build.VERSION.SDK_INT > 29) {
                    return file.exists() && file.canRead();
                }
                return file.exists();
            }
            Object[] objArr4 = {str3};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "b3010dff1659eaa37b15ebe79f3ef577", RobustBitConfig.DEFAULT_VALUE)) {
                parse = (Uri) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "b3010dff1659eaa37b15ebe79f3ef577");
            } else {
                if (TextUtils.isEmpty(str)) {
                    str3 = "";
                }
                if (str3.startsWith(File.separator)) {
                    parse = Uri.fromFile(new File(str3));
                } else {
                    parse = Uri.parse(str3);
                }
            }
            Object[] objArr5 = {parse};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "c549522a2d1efe7165434095d3862639", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "c549522a2d1efe7165434095d3862639")).booleanValue();
            } else {
                String scheme = parse.getScheme();
                if (!"content".equals(scheme) && !"android.resource".equals(scheme)) {
                    z = false;
                }
                z = true;
            }
            if (!z || (a2 = a(context, parse, str2)) == null) {
                return false;
            }
            if (a2.getCount() <= 0) {
                z2 = false;
            }
            if (a2 != null) {
                a2.close();
                return z2;
            }
            return z2;
        } catch (Exception unused) {
            return false;
        }
    }

    private static Cursor a(Context context, Uri uri, @NonNull String str) {
        Cursor cursor;
        Object[] objArr = {context, uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6abf173a7636ddc5db38c82f52bdc5a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6abf173a7636ddc5db38c82f52bdc5a1");
        }
        try {
            cursor = Privacy.createContentResolver(context, str).a(uri, null, null, null, null);
            if (cursor != null) {
                try {
                    cursor.moveToFirst();
                } catch (Throwable th) {
                    th = th;
                    com.sankuai.shangou.stone.util.log.a.a(th);
                    return cursor;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        return cursor;
    }
}
