package com.dianping.video.widget;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import com.dianping.video.log.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a {
    public static ChangeQuickRedirect a;
    final MediaMetadataRetriever b;
    final ThreadPoolExecutor c;
    final HashMap<Integer, Bitmap> d;
    final HashSet<Integer> e;
    b f;
    private final long g;
    private final int h;
    private final long i;
    private int j;
    private final Handler k;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        void a(int i, Bitmap bitmap);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.video.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0137a implements Runnable {
        public static ChangeQuickRedirect a;
        int b;

        public RunnableC0137a(int i) {
            Object[] objArr = {a.this, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d22501ffea0e860c8ec85f77de942960", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d22501ffea0e860c8ec85f77de942960");
            } else {
                this.b = i;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69807253a6ee7658f0f2925bae5df3a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69807253a6ee7658f0f2925bae5df3a0");
            } else if (a.this.c == null || a.this.c.isShutdown()) {
            } else {
                long j = (a.this.i + (a.this.g * this.b)) * 1000;
                Bitmap frameAtTime = a.this.b.getFrameAtTime(j, a.this.j);
                if (frameAtTime == null) {
                    frameAtTime = a.this.b.getFrameAtTime(j, 2);
                }
                Bitmap bitmap = frameAtTime;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                float f = a.this.h / width;
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                final Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                a.this.k.post(new Runnable() { // from class: com.dianping.video.widget.a.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4d10914c8ea1b571e22361d4178d50a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4d10914c8ea1b571e22361d4178d50a");
                            return;
                        }
                        a.this.d.put(Integer.valueOf(RunnableC0137a.this.b), createBitmap);
                        a.this.e.remove(Integer.valueOf(RunnableC0137a.this.b));
                        if (a.this.f != null) {
                            a.this.f.a(RunnableC0137a.this.b, createBitmap);
                        }
                    }
                });
            }
        }
    }

    public a(String str, long j, long j2, int i) {
        Object[] objArr = {str, new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "327661def745ff3597a49c9426e1e248", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "327661def745ff3597a49c9426e1e248");
            return;
        }
        this.b = new MediaMetadataRetriever();
        this.j = 2;
        this.c = new ThreadPoolExecutor(0, 10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.d = new HashMap<>();
        this.e = new HashSet<>();
        this.k = new Handler();
        try {
            this.b.setDataSource(str);
        } catch (Exception e) {
            e.printStackTrace();
            c a2 = c.a();
            a2.a(a.class, "setDataSource", "videoPath:" + str + " is exist=" + new File(str).exists() + " exception:" + com.dianping.util.exception.a.a(e));
        }
        this.g = j2;
        this.h = i;
        this.i = j;
    }
}
