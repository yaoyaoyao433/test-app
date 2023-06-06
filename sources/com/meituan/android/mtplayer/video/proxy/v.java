package com.meituan.android.mtplayer.video.proxy;

import android.content.Context;
import android.os.Environment;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class v {
    public static ChangeQuickRedirect a;

    public static File a(Context context) {
        String str;
        File b;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f216df288a503fe58e02455b14186472", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f216df288a503fe58e02455b14186472");
        }
        if (context != null && Privacy.createPermissionGuard().a(context, PermissionGuard.PERMISSION_STORAGE_WRITE, "pt-c64228d5c1740ec9") > 0) {
            try {
                str = Environment.getExternalStorageState();
            } catch (NullPointerException unused) {
                str = "";
            }
            if ("mounted".equals(str) && (b = com.meituan.android.cipstorage.q.b(context, "homepage_mtplayer", "", com.meituan.android.cipstorage.u.b)) != null && (b.exists() || b.mkdirs())) {
                File file = new File(b, "video-cache");
                if (file.exists() || file.mkdir()) {
                    return file;
                }
            }
        }
        return null;
    }
}
