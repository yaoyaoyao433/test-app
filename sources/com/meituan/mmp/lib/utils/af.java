package com.meituan.mmp.lib.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.rtmp.TXLiveConstants;
import java.io.FileOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class af {
    public static ChangeQuickRedirect a;

    public static void a(Bitmap bitmap, String str) throws Exception {
        int i;
        Object[] objArr = {bitmap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73f91ba2c2be882c07c959930e34f000", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73f91ba2c2be882c07c959930e34f000");
            return;
        }
        int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            i = TXLiveConstants.RENDER_ROTATION_180;
        } else if (attributeInt == 6) {
            i = 90;
        } else if (attributeInt != 8) {
            switch (attributeInt) {
                case 0:
                case 1:
                    bitmap.recycle();
                    return;
                default:
                    i = 0;
                    break;
            }
        } else {
            i = 270;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        FileOutputStream fileOutputStream = new FileOutputStream(str, false);
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
        x.a(fileOutputStream);
        try {
            createBitmap.recycle();
            bitmap.recycle();
        } catch (Exception unused) {
        }
    }

    public static int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        Object[] objArr = {options, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7d444bf2ff0a038bd54a580d393b5b5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7d444bf2ff0a038bd54a580d393b5b5")).intValue();
        }
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i4 > i2 || i5 > i) {
            int i6 = i4 / 2;
            int i7 = i5 / 2;
            i3 = 2;
            while (i6 / i3 >= i2 && i7 / i3 >= i) {
                i3 *= 2;
            }
        }
        return i3;
    }
}
