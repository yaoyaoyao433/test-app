package android.support.v7.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    static final InterfaceC0009b f = new InterfaceC0009b() { // from class: android.support.v7.graphics.b.1
        @Override // android.support.v7.graphics.b.InterfaceC0009b
        public final boolean a(int i, float[] fArr) {
            if (!(fArr[2] >= 0.95f)) {
                if (!(fArr[2] <= 0.05f)) {
                    if (!(fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f)) {
                        return true;
                    }
                }
            }
            return false;
        }
    };
    final List<d> a;
    final List<android.support.v7.graphics.c> b;
    final SparseBooleanArray d = new SparseBooleanArray();
    final Map<android.support.v7.graphics.c, d> c = new ArrayMap();
    final d e = b();

    /* compiled from: ProGuard */
    /* renamed from: android.support.v7.graphics.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0009b {
        boolean a(int i, float[] fArr);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface c {
        void a(b bVar);
    }

    public static a a(Bitmap bitmap) {
        return new a(bitmap);
    }

    b(List<d> list, List<android.support.v7.graphics.c> list2) {
        this.a = list;
        this.b = list2;
    }

    @Nullable
    public final d a() {
        return this.c.get(android.support.v7.graphics.c.f);
    }

    private d b() {
        int size = this.a.size();
        int i = Integer.MIN_VALUE;
        d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar2 = this.a.get(i2);
            if (dVar2.b > i) {
                i = dVar2.b;
                dVar = dVar2;
            }
        }
        return dVar;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class d {
        final int a;
        final int b;
        private final int c;
        private final int d;
        private final int e;
        private boolean f;
        private int g;
        private int h;
        private float[] i;

        public d(@ColorInt int i, int i2) {
            this.c = Color.red(i);
            this.d = Color.green(i);
            this.e = Color.blue(i);
            this.a = i;
            this.b = i2;
        }

        public final float[] a() {
            if (this.i == null) {
                this.i = new float[3];
            }
            ColorUtils.RGBToHSL(this.c, this.d, this.e, this.i);
            return this.i;
        }

        private void b() {
            int alphaComponent;
            int alphaComponent2;
            if (this.f) {
                return;
            }
            int calculateMinimumAlpha = ColorUtils.calculateMinimumAlpha(-1, this.a, 4.5f);
            int calculateMinimumAlpha2 = ColorUtils.calculateMinimumAlpha(-1, this.a, 3.0f);
            if (calculateMinimumAlpha != -1 && calculateMinimumAlpha2 != -1) {
                this.h = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
                this.g = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                this.f = true;
                return;
            }
            int calculateMinimumAlpha3 = ColorUtils.calculateMinimumAlpha(-16777216, this.a, 4.5f);
            int calculateMinimumAlpha4 = ColorUtils.calculateMinimumAlpha(-16777216, this.a, 3.0f);
            if (calculateMinimumAlpha3 != -1 && calculateMinimumAlpha4 != -1) {
                this.h = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha3);
                this.g = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha4);
                this.f = true;
                return;
            }
            if (calculateMinimumAlpha != -1) {
                alphaComponent = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
            } else {
                alphaComponent = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha3);
            }
            this.h = alphaComponent;
            if (calculateMinimumAlpha2 != -1) {
                alphaComponent2 = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
            } else {
                alphaComponent2 = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha4);
            }
            this.g = alphaComponent2;
            this.f = true;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(getClass().getSimpleName());
            sb.append(" [RGB: #");
            sb.append(Integer.toHexString(this.a));
            sb.append(']');
            sb.append(" [HSL: ");
            sb.append(Arrays.toString(a()));
            sb.append(']');
            sb.append(" [Population: ");
            sb.append(this.b);
            sb.append(']');
            sb.append(" [Title Text: #");
            b();
            sb.append(Integer.toHexString(this.g));
            sb.append(']');
            sb.append(" [Body Text: #");
            b();
            sb.append(Integer.toHexString(this.h));
            sb.append(']');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && this.a == dVar.a;
        }

        public final int hashCode() {
            return (this.a * 31) + this.b;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a {
        final List<d> a;
        final Bitmap b;
        final List<android.support.v7.graphics.c> c = new ArrayList();
        int d = 16;
        int e = 12544;
        int f = -1;
        final List<InterfaceC0009b> g = new ArrayList();
        Rect h;

        public a(Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            this.g.add(b.f);
            this.b = bitmap;
            this.a = null;
            this.c.add(android.support.v7.graphics.c.a);
            this.c.add(android.support.v7.graphics.c.b);
            this.c.add(android.support.v7.graphics.c.c);
            this.c.add(android.support.v7.graphics.c.d);
            this.c.add(android.support.v7.graphics.c.e);
            this.c.add(android.support.v7.graphics.c.f);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [android.support.v7.graphics.b$a$1] */
        @NonNull
        public final AsyncTask<Bitmap, Void, b> a(final c cVar) {
            if (cVar == null) {
                throw new IllegalArgumentException("listener can not be null");
            }
            return new AsyncTask<Bitmap, Void, b>() { // from class: android.support.v7.graphics.b.a.1
                @Override // android.os.AsyncTask
                protected final /* synthetic */ void onPostExecute(b bVar) {
                    cVar.a(bVar);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // android.os.AsyncTask
                /* renamed from: a */
                public b doInBackground(Bitmap... bitmapArr) {
                    List<d> list;
                    int max;
                    try {
                        a aVar = a.this;
                        char c = 0;
                        if (aVar.b != null) {
                            Bitmap bitmap = aVar.b;
                            double d = -1.0d;
                            if (aVar.e > 0) {
                                int width = bitmap.getWidth() * bitmap.getHeight();
                                if (width > aVar.e) {
                                    d = Math.sqrt(aVar.e / width);
                                }
                            } else if (aVar.f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > aVar.f) {
                                d = aVar.f / max;
                            }
                            if (d > 0.0d) {
                                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
                            }
                            Rect rect = aVar.h;
                            if (bitmap != aVar.b && rect != null) {
                                double width2 = bitmap.getWidth() / aVar.b.getWidth();
                                rect.left = (int) Math.floor(rect.left * width2);
                                rect.top = (int) Math.floor(rect.top * width2);
                                rect.right = Math.min((int) Math.ceil(rect.right * width2), bitmap.getWidth());
                                rect.bottom = Math.min((int) Math.ceil(rect.bottom * width2), bitmap.getHeight());
                            }
                            android.support.v7.graphics.a aVar2 = new android.support.v7.graphics.a(aVar.a(bitmap), aVar.d, aVar.g.isEmpty() ? null : (InterfaceC0009b[]) aVar.g.toArray(new InterfaceC0009b[aVar.g.size()]));
                            if (bitmap != aVar.b) {
                                bitmap.recycle();
                            }
                            list = aVar2.c;
                        } else {
                            list = aVar.a;
                        }
                        b bVar = new b(list, aVar.c);
                        int size = bVar.b.size();
                        int i = 0;
                        while (i < size) {
                            android.support.v7.graphics.c cVar2 = bVar.b.get(i);
                            int length = cVar2.i.length;
                            float f = 0.0f;
                            float f2 = 0.0f;
                            for (int i2 = 0; i2 < length; i2++) {
                                float f3 = cVar2.i[i2];
                                if (f3 > 0.0f) {
                                    f2 += f3;
                                }
                            }
                            if (f2 != 0.0f) {
                                int length2 = cVar2.i.length;
                                for (int i3 = 0; i3 < length2; i3++) {
                                    if (cVar2.i[i3] > 0.0f) {
                                        float[] fArr = cVar2.i;
                                        fArr[i3] = fArr[i3] / f2;
                                    }
                                }
                            }
                            Map<android.support.v7.graphics.c, d> map = bVar.c;
                            int size2 = bVar.a.size();
                            int i4 = 0;
                            d dVar = null;
                            float f4 = 0.0f;
                            while (i4 < size2) {
                                d dVar2 = bVar.a.get(i4);
                                float[] a = dVar2.a();
                                if (a[1] >= cVar2.g[c] && a[1] <= cVar2.g[2] && a[2] >= cVar2.h[c] && a[2] <= cVar2.h[2] && !bVar.d.get(dVar2.a)) {
                                    float[] a2 = dVar2.a();
                                    int i5 = bVar.e != null ? bVar.e.b : 1;
                                    float abs = (cVar2.i[c] > f ? (1.0f - Math.abs(a2[1] - cVar2.g[1])) * cVar2.i[c] : 0.0f) + (cVar2.i[1] > f ? cVar2.i[1] * (1.0f - Math.abs(a2[2] - cVar2.h[1])) : 0.0f) + (cVar2.i[2] > 0.0f ? cVar2.i[2] * (dVar2.b / i5) : 0.0f);
                                    if (dVar == null || abs > f4) {
                                        f4 = abs;
                                        dVar = dVar2;
                                    }
                                }
                                i4++;
                                c = 0;
                                f = 0.0f;
                            }
                            if (dVar != null && cVar2.j) {
                                bVar.d.append(dVar.a, true);
                            }
                            map.put(cVar2, dVar);
                            i++;
                            c = 0;
                        }
                        bVar.d.clear();
                        return bVar;
                    } catch (Exception e) {
                        Log.e("Palette", "Exception thrown during async generate", e);
                        return null;
                    }
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.b);
        }

        int[] a(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            if (this.h == null) {
                return iArr;
            }
            int width2 = this.h.width();
            int height2 = this.h.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i = 0; i < height2; i++) {
                System.arraycopy(iArr, ((this.h.top + i) * width) + this.h.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }
    }
}
