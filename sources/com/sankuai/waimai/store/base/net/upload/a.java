package com.sankuai.waimai.store.base.net.upload;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(Context context, Uri uri, @NonNull String str) {
        Object[] objArr = {context, uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b486ad57283780dc085b70069014e47", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b486ad57283780dc085b70069014e47");
        }
        if (!"content".equalsIgnoreCase(uri.getScheme())) {
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
            return uri.getPath();
        }
        Object[] objArr2 = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "908796576d0bccee8c2559da3e7f57ae", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "908796576d0bccee8c2559da3e7f57ae")).booleanValue() : "com.google.android.apps.photos.content".equals(uri.getAuthority())) {
            return uri.getLastPathSegment();
        }
        return a(context, uri, null, null, str);
    }

    private static String a(Context context, Uri uri, String str, String[] strArr, @NonNull String str2) {
        Cursor cursor;
        Object[] objArr = {context, uri, null, null, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db6ea5e823dffaed24b85c47c339ad53", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db6ea5e823dffaed24b85c47c339ad53");
        }
        try {
            cursor = Privacy.createContentResolver(context, str2).a(uri, new String[]{"_data"}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        int columnIndex = cursor.getColumnIndex("_data");
                        if (columnIndex == -1) {
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        }
                        String string = cursor.getString(columnIndex);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }
}
