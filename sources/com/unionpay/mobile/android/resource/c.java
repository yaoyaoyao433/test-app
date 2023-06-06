package com.unionpay.mobile.android.resource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.tencent.open.SocialConstants;
import com.unionpay.mobile.android.utils.h;
import com.unionpay.mobile.android.utils.k;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class c {
    private static c c;
    private HashMap<Integer, WeakReference<Drawable.ConstantState>> a = new HashMap<>();
    private Context b;

    private c(Context context) {
        this.b = null;
        this.b = context;
    }

    public static c a(Context context) {
        if (c == null) {
            c = new c(context);
        }
        return c;
    }

    public final Drawable a(int i, int i2, int i3) {
        Drawable a;
        Drawable drawable;
        Drawable ninePatchDrawable;
        if (i < 0) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReference = this.a.get(Integer.valueOf(i));
        if (weakReference != null) {
            Drawable.ConstantState constantState = weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable();
            }
            this.a.remove(Integer.valueOf(i));
        }
        int i4 = (i / 1000) * 1000;
        int i5 = i - i4;
        if (i4 == 2000) {
            int[] iArr = b.a[i5];
            a = h.a(a(iArr[0], i2, i3), a(iArr[1], i2, i3), a(iArr[2], i2, i3), a(iArr[3], i2, i3));
        } else if (i4 != 3000) {
            a = i4 != 4000 ? null : h.a(b.f[i5], b.g[i5], b.h[i5]);
        } else {
            int i6 = b.e[i5];
            int[] iArr2 = b.d[i5];
            float[] fArr = b.b[i5];
            float[] fArr2 = b.c[i5];
            a = h.a(i6, iArr2, fArr, fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        }
        if (a == null) {
            InputStream resourceAsStream = a.class.getClassLoader().getResourceAsStream("assets/data.bin");
            DataInputStream dataInputStream = new DataInputStream(resourceAsStream);
            int i7 = (i - 1000) * 8;
            int i8 = i7;
            while (true) {
                long j = i8;
                try {
                    long skip = dataInputStream.skip(j);
                    if (skip >= j) {
                        break;
                    }
                    i8 = (int) (j - skip);
                } catch (IOException e) {
                    e.printStackTrace();
                    drawable = null;
                }
            }
            int readInt = dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            int i9 = readInt - (i7 + 8);
            while (true) {
                long j2 = i9;
                long skip2 = dataInputStream.skip(j2);
                if (skip2 >= j2) {
                    break;
                }
                i9 = (int) (j2 - skip2);
            }
            dataInputStream.mark(readInt2);
            Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(dataInputStream);
            Rect rect = new Rect();
            if (a2.getNinePatchChunk() == null) {
                if (-1 != i3 && -1 != i2) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a2, i2, i3, true);
                    if (createScaledBitmap != a2) {
                        a2.recycle();
                    }
                    drawable = new BitmapDrawable(this.b.getResources(), createScaledBitmap);
                } else if (-1 != i3 && -1 == i2) {
                    int width = (int) ((a2.getWidth() / a2.getHeight()) * i3);
                    k.a(SocialConstants.PARAM_IMG_URL, "w=" + width + ",h=" + i3);
                    Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(a2, width, i3, true);
                    if (createScaledBitmap2 != a2) {
                        a2.recycle();
                    }
                    drawable = new BitmapDrawable(this.b.getResources(), createScaledBitmap2);
                } else if (-1 == i2 || -1 != i3) {
                    ninePatchDrawable = new BitmapDrawable(this.b.getResources(), a2);
                } else {
                    Bitmap createScaledBitmap3 = Bitmap.createScaledBitmap(a2, i2, (int) ((a2.getHeight() / a2.getWidth()) * i2), true);
                    if (createScaledBitmap3 != a2) {
                        a2.recycle();
                    }
                    drawable = new BitmapDrawable(this.b.getResources(), createScaledBitmap3);
                }
                dataInputStream.close();
                resourceAsStream.close();
            } else {
                ninePatchDrawable = new NinePatchDrawable(this.b.getResources(), a2, a2.getNinePatchChunk(), rect, null);
            }
            drawable = ninePatchDrawable;
            dataInputStream.close();
            resourceAsStream.close();
        } else {
            drawable = a;
        }
        if (drawable != null) {
            this.a.put(Integer.valueOf(i), new WeakReference<>(drawable.getConstantState()));
        }
        return drawable;
    }

    public final void a() {
        for (WeakReference<Drawable.ConstantState> weakReference : this.a.values()) {
            Drawable.ConstantState constantState = weakReference.get();
            if (constantState != null) {
                Drawable newDrawable = constantState.newDrawable();
                if (newDrawable instanceof BitmapDrawable) {
                    ((BitmapDrawable) newDrawable).getBitmap().recycle();
                }
            }
        }
        this.a.clear();
        c = null;
    }
}
