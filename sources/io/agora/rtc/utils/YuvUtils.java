package io.agora.rtc.utils;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.util.Log;
import io.agora.rtc.gl.JavaI420Buffer;
import io.agora.rtc.gl.VideoFrame;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
@TargetApi(21)
/* loaded from: classes7.dex */
public class YuvUtils {
    public static final int I420 = 35;
    public static final int NV21 = 17;
    private static final String TAG = "YuvUtils";

    public static boolean supportedImageFormat(Image image) {
        int format = image.getFormat();
        return format == 17 || format == 35 || format == 842094169;
    }

    public static byte[] getImageData(Image image, int i) {
        Rect rect;
        int i2;
        int i3 = i;
        int i4 = 17;
        int i5 = 35;
        if (i3 != 35 && i3 != 17) {
            throw new IllegalArgumentException("only support COLOR_FormatI420 and COLOR_FormatNV21");
        }
        if (!supportedImageFormat(image)) {
            throw new RuntimeException("can't convert Image to byte array, format " + image.getFormat());
        }
        Rect cropRect = image.getCropRect();
        int format = image.getFormat();
        int width = cropRect.width();
        int height = cropRect.height();
        Image.Plane[] planes = image.getPlanes();
        int i6 = width * height;
        byte[] bArr = new byte[(ImageFormat.getBitsPerPixel(format) * i6) / 8];
        byte[] bArr2 = new byte[planes[0].getRowStride()];
        int i7 = 0;
        int i8 = 0;
        int i9 = 1;
        while (i7 < planes.length) {
            switch (i7) {
                case 0:
                    i8 = 0;
                    i9 = 1;
                    break;
                case 1:
                    if (i3 == i5) {
                        i8 = i6;
                        i9 = 1;
                        break;
                    } else if (i3 == i4) {
                        i8 = i6 + 1;
                        i9 = 2;
                        break;
                    }
                    break;
                case 2:
                    if (i3 == i5) {
                        i8 = (int) (i6 * 1.25d);
                        i9 = 1;
                        break;
                    } else if (i3 == i4) {
                        i8 = i6;
                        i9 = 2;
                        break;
                    }
                    break;
            }
            ByteBuffer buffer = planes[i7].getBuffer();
            int rowStride = planes[i7].getRowStride();
            int pixelStride = planes[i7].getPixelStride();
            int i10 = i7 == 0 ? 0 : 1;
            int i11 = width >> i10;
            int i12 = height >> i10;
            buffer.position(((cropRect.top >> i10) * rowStride) + ((cropRect.left >> i10) * pixelStride));
            int i13 = 0;
            while (i13 < i12) {
                if (pixelStride == 1 && i9 == 1) {
                    buffer.get(bArr, i8, i11);
                    i8 += i11;
                    rect = cropRect;
                    i2 = i11;
                } else {
                    rect = cropRect;
                    i2 = ((i11 - 1) * pixelStride) + 1;
                    buffer.get(bArr2, 0, i2);
                    int i14 = i8;
                    for (int i15 = 0; i15 < i11; i15++) {
                        bArr[i14] = bArr2[i15 * pixelStride];
                        i14 += i9;
                    }
                    i8 = i14;
                }
                if (i13 < i12 - 1) {
                    buffer.position((buffer.position() + rowStride) - i2);
                }
                i13++;
                cropRect = rect;
            }
            i7++;
            i3 = i;
            i4 = 17;
            i5 = 35;
        }
        return bArr;
    }

    public static boolean writeNV21ToFile(byte[] bArr, int i, int i2, String str) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        Rect rect = new Rect(0, 0, i, i2);
        try {
            File file = new File(str);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            yuvImage.compressToJpeg(rect, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (IOException e) {
            Log.e(TAG, e.toString());
            return false;
        }
    }

    public static void writeRawData(byte[] bArr, String str) {
        if (bArr != null) {
            if (bArr.length == 0) {
                return;
            }
            try {
                File file = new File(str);
                file.createNewFile();
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            } catch (IOException e) {
                Log.e(TAG, e.toString());
            }
        }
    }

    public static void write420ImageToFile(Image image, String str) {
        if (image == null) {
            return;
        }
        try {
            YuvImage yuvImage = new YuvImage(yuv420toNV21(image), 17, image.getWidth(), image.getHeight(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, image.getWidth(), image.getHeight()), 100, byteArrayOutputStream);
            File file = new File(str);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(byteArrayOutputStream.toByteArray());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e(TAG, e.toString());
        }
    }

    public static byte[] yuv420toNV21(Image image) {
        int i;
        Rect cropRect = image.getCropRect();
        int format = image.getFormat();
        int width = cropRect.width();
        int height = cropRect.height();
        Image.Plane[] planes = image.getPlanes();
        int i2 = width * height;
        byte[] bArr = new byte[(ImageFormat.getBitsPerPixel(format) * i2) / 8];
        byte[] bArr2 = new byte[planes[0].getRowStride()];
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < planes.length) {
            switch (i3) {
                case 0:
                    i4 = 0;
                    i5 = 1;
                    break;
                case 1:
                    i4 = i2 + 1;
                    i5 = 2;
                    break;
                case 2:
                    i4 = i2;
                    i5 = 2;
                    break;
            }
            ByteBuffer buffer = planes[i3].getBuffer();
            int rowStride = planes[i3].getRowStride();
            int pixelStride = planes[i3].getPixelStride();
            int i6 = i3 == 0 ? 0 : 1;
            int i7 = width >> i6;
            int i8 = height >> i6;
            int i9 = width;
            int i10 = height;
            buffer.position(((cropRect.top >> i6) * rowStride) + ((cropRect.left >> i6) * pixelStride));
            for (int i11 = 0; i11 < i8; i11++) {
                if (pixelStride == 1 && i5 == 1) {
                    buffer.get(bArr, i4, i7);
                    i4 += i7;
                    i = i7;
                } else {
                    i = ((i7 - 1) * pixelStride) + 1;
                    buffer.get(bArr2, 0, i);
                    int i12 = i4;
                    for (int i13 = 0; i13 < i7; i13++) {
                        bArr[i12] = bArr2[i13 * pixelStride];
                        i12 += i5;
                    }
                    i4 = i12;
                }
                if (i11 < i8 - 1) {
                    buffer.position((buffer.position() + rowStride) - i);
                }
            }
            i3++;
            width = i9;
            height = i10;
        }
        return bArr;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public static class Plane {
        private ByteBuffer buffer;
        private int pixelStride;
        private int rowStride;

        public Plane(ByteBuffer byteBuffer, int i, int i2) {
            this.buffer = byteBuffer;
            this.rowStride = i;
            this.pixelStride = i2;
        }

        public ByteBuffer getBuffer() {
            return this.buffer;
        }

        public int getRowStride() {
            return this.rowStride;
        }

        public int getPixelStride() {
            return this.pixelStride;
        }
    }

    public static byte[] yuv420toNV21(byte[] bArr, int i, int i2) {
        return yuv420toNV21(JavaI420Buffer.createYUV(bArr, i, i2), i, i2);
    }

    public static byte[] yuv420toNV21(VideoFrame.I420Buffer i420Buffer, int i, int i2) {
        int i3;
        int i4 = i;
        int i5 = i2;
        Rect rect = new Rect(0, 0, i4, i5);
        Plane[] planeArr = {new Plane(i420Buffer.getDataY(), i420Buffer.getStrideY(), 1), new Plane(i420Buffer.getDataU(), i420Buffer.getStrideU(), 1), new Plane(i420Buffer.getDataV(), i420Buffer.getStrideV(), 1)};
        int i6 = i4 * i5;
        byte[] bArr = new byte[(ImageFormat.getBitsPerPixel(35) * i6) / 8];
        byte[] bArr2 = new byte[planeArr[0].getRowStride()];
        int i7 = 0;
        int i8 = 0;
        int i9 = 1;
        for (int i10 = 3; i7 < i10; i10 = 3) {
            switch (i7) {
                case 0:
                    i8 = 0;
                    i9 = 1;
                    break;
                case 1:
                    i8 = i6 + 1;
                    i9 = 2;
                    break;
                case 2:
                    i8 = i6;
                    i9 = 2;
                    break;
            }
            ByteBuffer buffer = planeArr[i7].getBuffer();
            int rowStride = planeArr[i7].getRowStride();
            int pixelStride = planeArr[i7].getPixelStride();
            int i11 = i7 == 0 ? 0 : 1;
            int i12 = i4 >> i11;
            int i13 = i5 >> i11;
            buffer.position(((rect.top >> i11) * rowStride) + ((rect.left >> i11) * pixelStride));
            for (int i14 = 0; i14 < i13; i14++) {
                if (pixelStride == 1 && i9 == 1) {
                    buffer.get(bArr, i8, i12);
                    i8 += i12;
                    i3 = i12;
                } else {
                    i3 = ((i12 - 1) * pixelStride) + 1;
                    buffer.get(bArr2, 0, i3);
                    int i15 = i8;
                    for (int i16 = 0; i16 < i12; i16++) {
                        bArr[i15] = bArr2[i16 * pixelStride];
                        i15 += i9;
                    }
                    i8 = i15;
                }
                if (i14 < i13 - 1) {
                    buffer.position((buffer.position() + rowStride) - i3);
                }
            }
            i7++;
            i4 = i;
            i5 = i2;
        }
        return bArr;
    }

    public static void writeRgbaToFile(Buffer buffer, int i, int i2, String str) {
        try {
            File file = new File(str);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(buffer);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 50, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e(TAG, e.toString());
        }
    }
}
