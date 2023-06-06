package com.sankuai.meituan.mapsdk.core.render.egl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import com.meituan.mtmap.rendersdk.RenderScheduler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.utils.f;
import com.sankuai.meituan.mapsdk.maps.interfaces.ab;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class d extends RenderScheduler {
    public static ChangeQuickRedirect c;
    private Thread a;
    private final ArrayList<Runnable> b;
    public a d;
    public GL10 e;
    public EGLConfig f;
    protected com.sankuai.meituan.mapsdk.core.d g;
    public ab h;
    protected com.sankuai.meituan.mapsdk.core.render.a i;
    public volatile boolean j;
    public volatile boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    volatile boolean p;
    private final Object q;
    private Bitmap r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private long w;
    private long x;
    private int y;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i);
    }

    public d(com.sankuai.meituan.mapsdk.core.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d2fb550a992c733de8dbf85680a510b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d2fb550a992c733de8dbf85680a510b");
            return;
        }
        this.b = new ArrayList<>();
        this.q = new Object();
        this.j = false;
        this.k = false;
        this.l = 1;
        this.m = 1;
        this.n = 0;
        this.o = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = 0L;
        this.x = 0L;
        this.y = 0;
        this.p = false;
        this.g = dVar;
        this.i = this.g.d;
    }

    public final void a(GL10 gl10, int i, int i2) {
        Object[] objArr = {gl10, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e101c29ee9de51202d35560929e66b3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e101c29ee9de51202d35560929e66b3a");
            return;
        }
        com.sankuai.meituan.mapsdk.mapcore.utils.c.b("MapRender onSurfaceChanged");
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.i.setMapSize(i, i2);
    }

    public final void a(GL10 gl10) {
        Runnable remove;
        Object[] objArr = {gl10};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "026a55254cd11e13ac9c6166f808c54a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "026a55254cd11e13ac9c6166f808c54a");
        } else if (!this.g.i && isRenderReady() && this.p) {
            if (this.a == null) {
                this.a = Thread.currentThread();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.x == 0) {
                this.x = elapsedRealtime;
            }
            synchronized (this.q) {
                if (!this.b.isEmpty() && (remove = this.b.remove(0)) != null) {
                    remove.run();
                }
            }
            f.a(new Runnable() { // from class: com.sankuai.meituan.mapsdk.core.render.egl.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0fe0795101b56a264d518eb1551bc11", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0fe0795101b56a264d518eb1551bc11");
                    } else if (d.this.g.i || d.this.g == null || d.this.g.f == null) {
                    } else {
                        d.this.g.f.c();
                    }
                }
            });
            this.i.d();
            if (this.j) {
                Bitmap g = this.i.g();
                if (g != null) {
                    Message obtain = Message.obtain();
                    obtain.what = 1;
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("map_bitmap", g);
                    obtain.setData(bundle);
                    this.g.q.sendMessage(obtain);
                }
                this.j = false;
            }
            if (this.k) {
                this.r = this.i.getMapPartialScreenShot(this.l, this.m, this.n, this.o);
                if (this.r != null) {
                    Message obtain2 = Message.obtain();
                    obtain2.what = 1;
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("map_bitmap", this.r);
                    obtain2.setData(bundle2);
                    this.g.q.sendMessage(obtain2);
                }
                this.k = false;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            com.sankuai.meituan.mapsdk.mapcore.utils.c.b("MapRender period: " + elapsedRealtime2 + "ms");
            this.t = this.t + 1;
            if (elapsedRealtime2 <= 0) {
                elapsedRealtime2 = 1;
            }
            int i = (int) (1000 / elapsedRealtime2);
            if (i > 0 && i < 30) {
                this.u++;
                int i2 = this.s + 1;
                this.s = i2;
                if (i2 >= 5 && !this.v) {
                    this.v = true;
                }
            } else if (i >= 30) {
                this.s = 0;
            }
            com.sankuai.meituan.mapsdk.mapcore.utils.c.b("MapRender frameRate: " + i);
            this.y = this.y + 1;
            if (this.d == null || SystemClock.elapsedRealtime() - this.x <= 1000) {
                return;
            }
            this.d.a(this.y);
            this.x = 0L;
            this.y = 0;
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a7ea323ac08313355a4a1aa3aeb7856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a7ea323ac08313355a4a1aa3aeb7856");
            return;
        }
        if (this.t > 0) {
            HashMap hashMap = new HashMap();
            Platform platform = this.g.getPlatform();
            hashMap.put("mapKey", this.g.o);
            hashMap.put("techType", com.sankuai.meituan.mapsdk.mapcore.report.f.a(platform));
            hashMap.put("mapVender", "3");
            double d = (this.u * 1.0d) / this.t;
            hashMap.put("status", d > 0.08333333333333333d ? "1" : "0");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("MTMapRenderFPSStatus", Float.valueOf((float) d));
            com.sankuai.meituan.mapsdk.mapcore.report.f.a(hashMap, hashMap2);
            com.sankuai.meituan.mapsdk.mapcore.report.f.a(com.sankuai.meituan.mapsdk.mapcore.a.a(), 3, this.g.o, getClass(), "reportRenderFps", 3001L, String.format(Locale.getDefault(), "stuck_count:%s,render_count:%s", Integer.valueOf(this.u), Integer.valueOf(this.t)), (String) null, 0.0f);
            com.sankuai.meituan.mapsdk.mapcore.utils.c.b("MapRender total: " + this.t + ", stuck: " + this.u);
        }
        this.t = 0;
        this.u = 0;
    }
}
