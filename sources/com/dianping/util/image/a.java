package com.dianping.util.image;

import android.content.Context;
import android.media.ExifInterface;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.rtmp.TXLiveConstants;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a(Context context, String str, String str2) {
        ExifInterface exifInterface = null;
        Object[] objArr = {null, str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09aa23c4173d7f3415389bf256dd397f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09aa23c4173d7f3415389bf256dd397f")).intValue();
        }
        try {
            Object[] objArr2 = {null, str, null};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2f2c4d7b6b27973992daafd5cf08d281", RobustBitConfig.DEFAULT_VALUE)) {
                exifInterface = (ExifInterface) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2f2c4d7b6b27973992daafd5cf08d281");
            } else if (!TextUtils.isEmpty(str) && (Build.VERSION.SDK_INT < 24 || !str.startsWith("content://"))) {
                exifInterface = new ExifInterface(str);
            }
            int attributeInt = exifInterface.getAttributeInt("Orientation", 1);
            if (attributeInt != 3) {
                if (attributeInt != 6) {
                    return attributeInt != 8 ? 0 : 270;
                }
                return 90;
            }
            return TXLiveConstants.RENDER_ROTATION_180;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }
}
