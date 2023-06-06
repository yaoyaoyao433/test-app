package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    private static final char[] a = "0123456789abcdef".toCharArray();
    private static final char[] b = new char[64];
    private static final char[] c = new char[40];

    private static boolean b(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static String a(byte[] bArr) {
        String str;
        synchronized (b) {
            char[] cArr = b;
            for (int i = 0; i < bArr.length; i++) {
                int i2 = bArr[i] & 255;
                int i3 = i * 2;
                cArr[i3] = a[i2 >>> 4];
                cArr[i3 + 1] = a[i2 & 15];
            }
            str = new String(cArr);
        }
        return str;
    }

    @TargetApi(19)
    public static int a(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
            }
        }
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.bumptech.glide.util.h$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Bitmap.Config.values().length];

        static {
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static boolean a(int i, int i2) {
        return b(i) && b(i2);
    }

    public static void a() {
        if (!c()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static void b() {
        if (!d()) {
            throw new IllegalArgumentException("YOu must call this method on a background thread");
        }
    }

    public static boolean c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean d() {
        return !c();
    }

    public static <T> Queue<T> a(int i) {
        return new ArrayDeque(i);
    }

    public static <T> List<T> a(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            arrayList.add(t);
        }
        return arrayList;
    }

    public static boolean a(String str) {
        return "image/png".equals(str);
    }

    public static boolean b(String str) {
        return "image/webp".equals(str);
    }

    public static boolean c(String str) {
        return "image/webp".equals(str) || "image/png".equals(str);
    }

    public static Bitmap.CompressFormat a(String str, Bitmap bitmap) {
        if ("image/webp".equals(str)) {
            return Bitmap.CompressFormat.PNG;
        }
        if ("image/png".equals(str)) {
            return Bitmap.CompressFormat.PNG;
        }
        if (bitmap != null && bitmap.hasAlpha()) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public static int a(int i, int i2, Bitmap.Config config) {
        int i3;
        int i4 = i * i2;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        switch (AnonymousClass1.a[config.ordinal()]) {
            case 1:
                i3 = 1;
                break;
            case 2:
            case 3:
                i3 = 2;
                break;
            default:
                i3 = 4;
                break;
        }
        return i4 * i3;
    }
}
