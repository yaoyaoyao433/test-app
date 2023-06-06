package com.sankuai.waimai.popup.spfx.particle;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static long b = 33;
    public ViewGroup c;
    public ParticleField d;
    public final ArrayList<com.sankuai.waimai.popup.spfx.particle.a> e;
    public float f;
    public int g;
    public long h;
    public List<com.sankuai.waimai.popup.spfx.particle.initializers.b> i;
    public ScheduledExecutorService j;
    public final a k;
    public ScheduledFuture<?> l;
    public float m;
    public int[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    private int s;
    private Random t;
    private ArrayList<com.sankuai.waimai.popup.spfx.particle.a> u;
    private long v;
    private long w;
    private List<com.sankuai.waimai.popup.spfx.particle.modifiers.b> x;
    private ValueAnimator y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect a;
        private final WeakReference<b> b;

        public a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dca16d892326690c2a1c63ce48b63e8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dca16d892326690c2a1c63ce48b63e8");
            } else {
                this.b = new WeakReference<>(bVar);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b628b25475f3e73786644d3719fb48a9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b628b25475f3e73786644d3719fb48a9");
            } else if (this.b.get() != null) {
                b bVar = this.b.get();
                bVar.b(bVar.w);
                bVar.w += b.b;
            }
        }
    }

    private b(ViewGroup viewGroup, int i, long j) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c651fc95584e198ab9143710fa25923", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c651fc95584e198ab9143710fa25923");
            return;
        }
        this.e = new ArrayList<>();
        this.w = 0L;
        this.j = c.c("ParticleThread");
        this.k = new a(this);
        this.t = new Random();
        this.n = new int[2];
        Object[] objArr2 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3aec084d8df0e89e408404dad9e3fb83", RobustBitConfig.DEFAULT_VALUE)) {
            b bVar = (b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3aec084d8df0e89e408404dad9e3fb83");
        } else {
            this.c = viewGroup;
            if (this.c != null) {
                this.c.getLocationInWindow(this.n);
            }
        }
        this.x = new ArrayList();
        this.i = new ArrayList();
        this.s = i;
        this.u = new ArrayList<>();
        this.v = j;
        this.m = viewGroup.getContext().getResources().getDisplayMetrics().xdpi / 160.0f;
    }

    public b(ViewGroup viewGroup, int i, Drawable drawable, long j) {
        this(viewGroup, 60, 6000L);
        Bitmap createBitmap;
        Object[] objArr = {viewGroup, 60, drawable, 6000L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c51b01ec64879e3064bafb581819059b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c51b01ec64879e3064bafb581819059b");
            return;
        }
        if (drawable instanceof BitmapDrawable) {
            createBitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        for (int i2 = 0; i2 < this.s; i2++) {
            this.u.add(new com.sankuai.waimai.popup.spfx.particle.a(createBitmap));
        }
    }

    public final b a(com.sankuai.waimai.popup.spfx.particle.modifiers.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be423653329f6236ca440bf0b1b9cae1", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be423653329f6236ca440bf0b1b9cae1");
        }
        this.x.add(bVar);
        return this;
    }

    private void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf30265db6f0b8b6cc0b42196c89cb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf30265db6f0b8b6cc0b42196c89cb9");
            return;
        }
        com.sankuai.waimai.popup.spfx.particle.a remove = this.u.remove(0);
        remove.e = 1.0f;
        remove.h = 255;
        for (int i = 0; i < this.i.size(); i++) {
            this.i.get(i).a(remove, this.t);
        }
        remove.a(this.v, a(this.o, this.p), a(this.q, this.r));
        remove.a(j, this.x);
        this.e.add(remove);
        this.g++;
    }

    private int a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4545995d3ae9ea8e87f359df751f754a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4545995d3ae9ea8e87f359df751f754a")).intValue();
        }
        if (i == i2) {
            return i;
        }
        if (i < i2) {
            return this.t.nextInt(i2 - i) + i;
        }
        return this.t.nextInt(i - i2) + i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        int i = 0;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c646f804393ae3c641749c2ac9819cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c646f804393ae3c641749c2ac9819cb");
            return;
        }
        while (true) {
            if (((this.h <= 0 || j >= this.h) && this.h != -1) || this.u.isEmpty() || this.g >= this.f * ((float) j)) {
                break;
            }
            a(j);
        }
        synchronized (this.e) {
            while (i < this.e.size()) {
                if (!this.e.get(i).a(j)) {
                    i--;
                    this.u.add(this.e.remove(i));
                }
                i++;
            }
        }
        this.d.postInvalidate();
    }

    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95d8317b4b8289d1fd3a50eda997d357", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95d8317b4b8289d1fd3a50eda997d357");
            return;
        }
        if (this.y != null && this.y.isRunning()) {
            this.y.cancel();
        }
        if (this.l != null) {
            this.l.cancel(true);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52c936099d415d1b10b874c23372e835", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52c936099d415d1b10b874c23372e835");
                return;
            }
            this.c.removeView(this.d);
            this.d = null;
            this.c.postInvalidate();
            this.u.addAll(this.e);
        }
    }

    public void a(int i) {
        int i2 = 1;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8cc3532ea2b259a9a276255a874a98f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8cc3532ea2b259a9a276255a874a98f");
        } else if (i == 0) {
        } else {
            long j = (this.w / 1000) / i;
            if (j == 0) {
                return;
            }
            long j2 = this.w / j;
            while (true) {
                long j3 = i2;
                if (j3 > j) {
                    return;
                }
                b((j3 * j2) + 1);
                i2++;
            }
        }
    }
}
