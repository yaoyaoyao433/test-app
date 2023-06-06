package com.sankuai.waimai.business.user.api.user;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ae;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    private static String c(Context context) {
        boolean z;
        boolean z2 = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d839bcdbf68c7886f8caf77a82d06aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d839bcdbf68c7886f8caf77a82d06aa");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1d22a5d4bbe2c1342885e346e94cdaf4", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1d22a5d4bbe2c1342885e346e94cdaf4")).booleanValue();
        } else {
            String externalStorageState = Environment.getExternalStorageState();
            z = externalStorageState != null && externalStorageState.equals("mounted");
        }
        if (!z || context == null) {
            ae.a(context, (int) R.string.wm_platform_system_error_read_file);
            return "";
        }
        try {
            String absolutePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath();
            try {
                String str = absolutePath + File.separator + "PIC_" + System.currentTimeMillis() + ".JPG";
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2b09c9b9b827204b6530c6ceba74f0e2", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2b09c9b9b827204b6530c6ceba74f0e2")).booleanValue();
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        File file = new File(str);
                        if (!file.isDirectory()) {
                            if (file.getParentFile() != null && !file.getParentFile().exists()) {
                                file.getParentFile().mkdirs();
                            }
                            if (file.exists()) {
                                if (file.delete()) {
                                }
                            }
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    return str;
                }
                ae.a(context, (int) R.string.wm_platform_system_error_read_file);
                return "";
            } catch (Exception unused) {
                return absolutePath;
            }
        } catch (Exception unused2) {
            return "";
        }
    }

    public static Uri a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95f6e0259b243cf915763b3c66f0faa1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95f6e0259b243cf915763b3c66f0faa1");
        }
        String c = c(context);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        return a(context, c);
    }

    @Nullable
    private static Uri a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fe2a14295c397c45d5c8739b6687399", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fe2a14295c397c45d5c8739b6687399");
        }
        try {
            File file = new File(str);
            ContentResolver contentResolver = context.getContentResolver();
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("_data", file.getAbsolutePath());
            return contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Uri b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c5db93ecc544217a9780fc94cafd3f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c5db93ecc544217a9780fc94cafd3f7");
        }
        if (TextUtils.isEmpty(c(context))) {
            return null;
        }
        return Uri.fromFile(new File(c(context)));
    }
}
