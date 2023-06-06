package com.sankuai.waimai.kit.share.util;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static byte[] a(@NonNull Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d025095e14a31d70ad19f97f3ebfd3e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d025095e14a31d70ad19f97f3ebfd3e3");
        }
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean compress = bitmap.compress(Bitmap.CompressFormat.PNG, 85, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        if (compress) {
            return byteArray;
        }
        return null;
    }

    public static Bitmap a(Bitmap bitmap, double d) {
        Object[] objArr = {bitmap, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4b50f3fe4a1bd862de8a65a051b8c82", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4b50f3fe4a1bd862de8a65a051b8c82");
        }
        if (bitmap == null) {
            return bitmap;
        }
        byte[] a2 = a(bitmap);
        double length = a2 != null ? a2.length : 0;
        if (length <= d) {
            return bitmap;
        }
        double d2 = length / d;
        return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / d2), (int) (bitmap.getHeight() / d2), true);
    }
}
