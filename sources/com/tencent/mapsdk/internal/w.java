package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.tools.Util;
import com.tencent.mapsdk.engine.jni.models.IconImageInfo;
import com.tencent.mapsdk.internal.sh;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class w {
    private static final int f = -16711681;
    private static final int g = 16711680;
    private static final int h = -256;
    private static final int i = 255;
    public be a;
    public nw b;
    public float c;
    public Lock d = new ReentrantLock();
    public Lock e = new ReentrantLock();
    private WeakReference<Context> j;
    private ns k;
    private gs l;

    private static int a(int i2) {
        return (i2 & f & (-256)) | ((i2 & 255) << 16) | ((g & i2) >> 16);
    }

    public w(Context context, be beVar, nw nwVar, ns nsVar) {
        this.c = 1.0f;
        this.j = new WeakReference<>(context);
        this.a = beVar;
        this.b = nwVar;
        this.k = nsVar;
        this.c = hc.a(context);
        if (beVar.b() != null) {
            this.l = ((so) beVar.b()).aB.d;
        }
    }

    private be d() {
        return this.a;
    }

    private IconImageInfo b(String str) {
        IconImageInfo iconImageInfo = new IconImageInfo();
        iconImageInfo.scale = this.c;
        iconImageInfo.anchorPointX1 = 0.5f;
        iconImageInfo.anchorPointY1 = 0.5f;
        iconImageInfo.bitmap = a(str, Bitmap.Config.RGB_565);
        return iconImageInfo;
    }

    public final IconImageInfo a(String str) {
        String[] split;
        Bitmap bitmap = null;
        if (this.k == null) {
            return null;
        }
        IconImageInfo iconImageInfo = new IconImageInfo();
        iconImageInfo.anchorPointX1 = 0.5f;
        iconImageInfo.anchorPointY1 = 0.5f;
        if (str.startsWith("drawRoundRect")) {
            iconImageInfo.scale = 1.0f;
            String substring = str.substring(14);
            if (!hb.a(substring) && (split = substring.split(", ")) != null && split.length >= 5) {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                long parseLong = Long.parseLong(split[2]);
                long parseLong2 = Long.parseLong(split[3]);
                float parseFloat = Float.parseFloat(split[4]);
                if (parseInt >= 0 && parseInt2 >= 0) {
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setStrokeWidth(parseFloat);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setColor(a((int) parseLong2));
                    Bitmap createBitmap = Bitmap.createBitmap(parseInt, parseInt2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(a((int) parseLong));
                    RectF rectF = new RectF();
                    rectF.left = 0.0f;
                    rectF.top = 0.0f;
                    rectF.right = parseInt;
                    rectF.bottom = parseInt2;
                    canvas.drawRoundRect(rectF, parseInt >> 3, parseInt2 >> 3, paint);
                    bitmap = createBitmap;
                }
            }
            iconImageInfo.bitmap = bitmap;
            if (iconImageInfo.bitmap == null && this.l != null) {
                this.l.a().a(System.currentTimeMillis(), str);
            }
            return iconImageInfo;
        }
        try {
            this.e.lock();
            this.k.a(str, iconImageInfo);
            this.e.unlock();
            if (iconImageInfo.bitmap == null) {
                str.equals(ns.a);
            }
            if (iconImageInfo.bitmap == null && this.l != null) {
                this.l.a().a(System.currentTimeMillis(), str);
            }
            return iconImageInfo;
        } catch (Exception e) {
            e.printStackTrace();
            if (iconImageInfo.bitmap == null && this.l != null) {
                this.l.a().a(System.currentTimeMillis(), str);
            }
            return null;
        }
    }

    public final void a() {
        this.d.lock();
    }

    public final void b() {
        this.d.unlock();
    }

    private boolean a(String str, byte[] bArr) {
        if (this.b == null) {
            return false;
        }
        return a(new File(this.b.c()), str, bArr, this.d);
    }

    private boolean b(String str, byte[] bArr) {
        if (this.b == null) {
            return false;
        }
        return a(new File(this.b.e()), str, bArr, this.e);
    }

    public final void c() {
        sh f2 = this.a.f();
        f2.a(new sh.AnonymousClass99(""));
    }

    public final Bitmap a(String str, Bitmap.Config config) {
        if (!new File(str).exists() || this.j == null || this.j.get() == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = config;
        try {
            return com.sankuai.waimai.launcher.util.image.a.a(str, options);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static boolean a(File file, String str, byte[] bArr, Lock lock) {
        if (hb.a(str) || bArr == null || bArr.length == 0) {
            return false;
        }
        String str2 = str + CommonConstant.Symbol.UNDERLINE + Arrays.hashCode(bArr);
        try {
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str2);
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            kc.a(file2, bArr);
            try {
                if (!Util.getMD5String(bArr).equals(ks.a(file2))) {
                    return false;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            File file3 = new File(file, str);
            File file4 = new File(file, str + ".bak");
            if (file4.exists() && !file4.delete()) {
                file4.deleteOnExit();
                return false;
            }
            lock.lock();
            if (file3.exists() && !file3.renameTo(file4)) {
                if (!file2.delete()) {
                    file2.deleteOnExit();
                }
                lock.unlock();
                return false;
            } else if (!file2.renameTo(file3)) {
                file4.renameTo(file3);
                if (!file2.delete()) {
                    file2.deleteOnExit();
                }
                lock.unlock();
                return false;
            } else {
                if (!file4.delete()) {
                    file4.deleteOnExit();
                }
                lock.unlock();
                return true;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    private static Bitmap c(String str) {
        String[] split;
        String substring = str.substring(14);
        if (hb.a(substring) || (split = substring.split(", ")) == null || split.length < 5) {
            return null;
        }
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        long parseLong = Long.parseLong(split[2]);
        long parseLong2 = Long.parseLong(split[3]);
        float parseFloat = Float.parseFloat(split[4]);
        if (parseInt < 0 || parseInt2 < 0) {
            return null;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(parseFloat);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(a((int) parseLong2));
        Bitmap createBitmap = Bitmap.createBitmap(parseInt, parseInt2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(a((int) parseLong));
        RectF rectF = new RectF();
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = parseInt;
        rectF.bottom = parseInt2;
        canvas.drawRoundRect(rectF, parseInt >> 3, parseInt2 >> 3, paint);
        return createBitmap;
    }
}
