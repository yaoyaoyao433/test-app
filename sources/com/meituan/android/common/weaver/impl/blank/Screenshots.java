package com.meituan.android.common.weaver.impl.blank;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.impl.blank.Screenshot;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Screenshots {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final AutoLooper mAutoLooper = new AutoLooper();

    public static Screenshot current() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ef5b05c3ff5a94763a6926dd897948b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Screenshot) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ef5b05c3ff5a94763a6926dd897948b0");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return new PixelCopyScreenshot(mAutoLooper);
        }
        return new DrawScreenshot();
    }

    public static Bitmap merge(@NonNull Bitmap bitmap, @NonNull List<Screenshot.SubBitmap> list) {
        Object[] objArr = {bitmap, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "447f25710c747cc5dffdb3a58e571e60", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "447f25710c747cc5dffdb3a58e571e60");
        }
        if (list.isEmpty()) {
            return bitmap;
        }
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        for (Screenshot.SubBitmap subBitmap : list) {
            canvas.drawBitmap(subBitmap.bitmap, subBitmap.x, subBitmap.y, paint);
            subBitmap.bitmap.recycle();
        }
        return bitmap;
    }
}
