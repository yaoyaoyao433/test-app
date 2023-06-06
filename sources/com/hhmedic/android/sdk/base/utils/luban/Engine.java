package com.hhmedic.android.sdk.base.utils.luban;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.sankuai.waimai.launcher.util.image.a;
import com.tencent.rtmp.TXLiveConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Engine {
    private ExifInterface srcExif;
    private int srcHeight;
    private final String srcImg;
    private int srcWidth;
    private final File tagImg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Engine(String str, File file) throws IOException {
        if (Checker.isJPG(str)) {
            this.srcExif = new ExifInterface(str);
        }
        this.tagImg = file;
        this.srcImg = str;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        a.a(str, options);
        this.srcWidth = options.outWidth;
        this.srcHeight = options.outHeight;
    }

    private int computeSize() {
        this.srcWidth = this.srcWidth % 2 == 1 ? this.srcWidth + 1 : this.srcWidth;
        this.srcHeight = this.srcHeight % 2 == 1 ? this.srcHeight + 1 : this.srcHeight;
        int max = Math.max(this.srcWidth, this.srcHeight);
        float min = Math.min(this.srcWidth, this.srcHeight) / max;
        if (min > 1.0f || min <= 0.5625d) {
            double d = min;
            if (d <= 0.5625d && d > 0.5d) {
                int i = max / 1280;
                if (i == 0) {
                    return 1;
                }
                return i;
            }
            return (int) Math.ceil(max / (1280.0d / d));
        } else if (max < 2000) {
            return 1;
        } else {
            if (max < 2000 || max >= 4990) {
                if (max <= 4990 || max >= 10240) {
                    int i2 = max / 1280;
                    if (i2 == 0) {
                        return 1;
                    }
                    return i2;
                }
                return 4;
            }
            return 2;
        }
    }

    private Bitmap rotatingImage(Bitmap bitmap) {
        if (this.srcExif == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int i = 0;
        int attributeInt = this.srcExif.getAttributeInt("Orientation", 1);
        if (attributeInt == 3) {
            i = TXLiveConstants.RENDER_ROTATION_180;
        } else if (attributeInt == 6) {
            i = 90;
        } else if (attributeInt == 8) {
            i = 270;
        }
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File compress() throws Exception {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = computeSize();
        Bitmap a = a.a(this.srcImg, options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap rotatingImage = rotatingImage(a);
        if (rotatingImage == null) {
            rotatingImage = a.a(this.srcImg, options);
        }
        rotatingImage.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
        rotatingImage.recycle();
        FileOutputStream fileOutputStream = new FileOutputStream(this.tagImg);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.flush();
        fileOutputStream.close();
        byteArrayOutputStream.close();
        return this.tagImg;
    }
}
