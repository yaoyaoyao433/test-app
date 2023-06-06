package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.map.lib.callbacks.TileOverlayCallback;
import com.tencent.mapsdk.core.utils.cache.DiskCache;
import com.tencent.mapsdk.core.utils.cache.MemoryCache;
import com.tencent.mapsdk.internal.ji;
import com.tencent.mapsdk.internal.lg;
import com.tencent.tencentmap.mapsdk.maps.model.Tile;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.TileProvider;
import java.io.File;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class qc extends or implements TileOverlayCallback {
    static final String a = "%s" + File.separatorChar + "%d-%d-%d";
    static final String n = "/tile/";
    private static final long s = 1024;
    int o;
    public qh p;
    public TileOverlayOptions q;
    public ji<qe> r;
    private Map<String, Integer> t;
    private lg u;
    private BlockingQueue<Runnable> v;
    private final ll w;

    protected int b(int i) {
        return i + 100;
    }

    @Override // com.tencent.mapsdk.internal.av
    public final ap f_() {
        return null;
    }

    protected String h() {
        return n;
    }

    @Override // com.tencent.mapsdk.internal.av, com.tencent.tencentmap.mapsdk.maps.interfaces.Tappable
    public boolean onTap(float f, float f2) {
        return false;
    }

    @Override // com.tencent.map.lib.callbacks.TileOverlayCallback
    public void onWriteTile(int i, int i2, int i3, String str, byte[] bArr) {
    }

    private int i() {
        return this.o;
    }

    private qh t() {
        return this.p;
    }

    private TileProvider u() {
        return this.q.getTileProvider();
    }

    public final synchronized lg d() {
        if (this.u == null) {
            this.u = new lg();
            this.u.a(this.w);
            ThreadPoolExecutor c = hd.c();
            this.v = c.getQueue();
            this.u.b = c;
        }
        return this.u;
    }

    private qg v() {
        return new qg(this.p);
    }

    @Override // com.tencent.mapsdk.internal.or
    public final void h_() {
        if (this.p == null || this.o < 0) {
            return;
        }
        w();
        synchronized (this) {
            if (this.u != null) {
                this.u.a();
                this.u = null;
            }
        }
        qh qhVar = this.p;
        int i = this.o;
        if (qhVar.f != null) {
            qhVar.g.remove(Integer.valueOf(i));
            qhVar.f.d(i);
            kn.d(ki.b);
        }
    }

    public final void e() {
        if (this.p == null || this.o < 0) {
            return;
        }
        w();
        this.p.b(this.o);
        if (this.v != null) {
            this.v.clear();
        }
    }

    public final void a(int i) {
        if (this.p == null || this.o < 0) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.p.a(this.o, b(i));
    }

    public final void a(int i, int i2) {
        if (this.p == null || this.o < 0) {
            return;
        }
        this.p.a(this.o, i, i2);
    }

    private void w() {
        if (this.r == null) {
            return;
        }
        if (this.r instanceof jl) {
            ji a2 = ((jl) this.r).a(0);
            if (a2 instanceof MemoryCache) {
                a2.b();
            }
            ji a3 = ((jl) this.r).a(1);
            if (a3 instanceof DiskCache) {
                ((DiskCache) a3).f();
            }
        } else if (this.r instanceof MemoryCache) {
            this.r.b();
        }
        this.t.clear();
    }

    private void a(String str) {
        if (this.q == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.q.diskCacheDir(str);
        this.r = g();
    }

    public final void f() {
        if (this.r == null) {
            return;
        }
        this.r.b();
        this.t.clear();
    }

    public final ji<qe> g() {
        if (this.p == null) {
            return null;
        }
        MemoryCache.a aVar = new MemoryCache.a();
        aVar.b = this.q.getMaxMemoryCacheSize(this.p.h);
        aVar.c = new a((byte) 0);
        if (!TextUtils.isEmpty(this.p.i) && this.q != null && !TextUtils.isEmpty(this.q.getDiskCacheDir())) {
            DiskCache.c cVar = new DiskCache.c();
            if (!TextUtils.isEmpty(h())) {
                cVar.b();
            }
            String str = h() + this.q.getDiskCacheDir();
            cVar.c = new File(this.p.i);
            cVar.d = str;
            cVar.j = -1;
            cVar.k = new qd();
            cVar.e = new qf(this.p.i + File.separator + str);
            return jm.a(qe.class, aVar, cVar);
        }
        return jm.a(qe.class, aVar);
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof qc) && this.o == ((qc) obj).o;
    }

    @Override // com.tencent.map.lib.callbacks.TileOverlayCallback
    public void onLoadTileFinish(int i, int i2, int i3) {
        qe qeVar = (qe) jm.a(this.r).b(String.format(a, kc.b(this.q.getVersionInfo()), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)), qe.class);
        if (qeVar != null) {
            qeVar.d();
        }
    }

    @Override // com.tencent.map.lib.callbacks.TileOverlayCallback
    public Bitmap onLoadTile(int i, int i2, int i3, byte[] bArr) {
        int i4;
        if (this.q == null || this.q.getTileProvider() == null) {
            return null;
        }
        int i5 = 0;
        String format = String.format(a, kc.b(this.q.getVersionInfo()), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        int e = kn.e(ki.b, "load-count");
        int d = kn.d(ki.b, "cache-count");
        int d2 = kn.d(ki.b, "data-count");
        int d3 = kn.d(ki.b, "req-count");
        int d4 = kn.d(ki.b, "cancel-count");
        qe qeVar = (qe) jm.a(this.r).b(format, qe.class);
        if (qeVar != null) {
            d = kn.e(ki.b, "cache-count");
            i4 = qeVar.e;
            if (e == d3 + d2 + d + d4) {
                kn.e(ki.b);
            }
        } else {
            i4 = 0;
        }
        kn.a("get from cache of cacheId:".concat(String.valueOf(format)), "dataLength:".concat(String.valueOf(i4)), "loadCount:".concat(String.valueOf(e)), "reqCount:".concat(String.valueOf(d3)), "dataCount:".concat(String.valueOf(d2)), "cacheCount:".concat(String.valueOf(d)), "cancelCount:".concat(String.valueOf(d4)));
        if (qeVar != null) {
            this.t.remove(format);
            qeVar.e();
            return qeVar.c();
        }
        Integer num = this.t.get(format);
        if (num != null && num.intValue() > 10) {
            for (Map.Entry<String, Integer> entry : this.t.entrySet()) {
                if (entry.getValue().intValue() > 10) {
                    i5++;
                }
                if (i5 > 50) {
                    kj.c("超过50个瓦片请求大于10次，重新加载TileOverlay");
                    e();
                    return null;
                }
            }
            return null;
        }
        this.t.put(format, Integer.valueOf(num == null ? 0 : num.intValue() + 1));
        StringBuilder sb = new StringBuilder(128);
        sb.append("tileOverlay://getTile/");
        sb.append(this.o);
        sb.append("?x=");
        sb.append(i);
        sb.append("&y=");
        sb.append(i2);
        sb.append("&z=");
        sb.append(i3);
        byte[] bytes = sb.toString().getBytes();
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return null;
    }

    private byte[] a(int i, int i2, int i3) {
        if (this.q == null || this.q.getTileProvider() == null || i3 < 0) {
            kj.d(ki.b, "无效坐标，返回空瓦块");
            return gx.a();
        }
        String format = String.format(a, kc.b(this.q.getVersionInfo()), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        Tile tile = this.q.getTileProvider().getTile(i, i2, i3);
        if (tile == null) {
            kj.d(ki.b, "Provider没有瓦片数据，返回空瓦块");
            return gx.a();
        }
        byte[] bArr = tile.mData;
        if (bArr != null && bArr.length > 0) {
            kn.b(ki.b, "cacheId", (Object) format);
            qe qeVar = new qe(bArr);
            if (this.r != null) {
                jp a2 = jm.a(this.r);
                if (a2 != null) {
                    a2.b(format, (String) qeVar);
                } else {
                    this.r.a(format, (String) qeVar);
                }
            }
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a implements ji.b<qe> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        @Override // com.tencent.mapsdk.internal.ji.b
        public final /* synthetic */ boolean a(qe qeVar) {
            qe qeVar2 = qeVar;
            if (qeVar2 != null) {
                qeVar2.f();
                return true;
            }
            return true;
        }

        /* renamed from: a  reason: avoid collision after fix types in other method */
        private static boolean a2(qe qeVar) {
            if (qeVar != null) {
                qeVar.f();
                return true;
            }
            return true;
        }
    }

    public qc(qh qhVar, TileOverlayOptions tileOverlayOptions) {
        super((ba) qhVar.h.b);
        this.t = new Hashtable();
        this.w = new ll() { // from class: com.tencent.mapsdk.internal.qc.1
            @Override // com.tencent.mapsdk.internal.ll, com.tencent.mapsdk.internal.lf
            public final void b(String str) {
                lg lgVar = qc.this.u;
                if (lgVar != null) {
                    lg.a aVar = lgVar.a.get(str);
                    Runnable runnable = aVar != null ? aVar.a : null;
                    if (runnable != null) {
                        qc.this.v.remove(runnable);
                    }
                }
            }
        };
        this.p = qhVar;
        this.q = tileOverlayOptions;
        int i = -1;
        if (this.q == null) {
            this.o = -1;
            return;
        }
        this.r = g();
        qh qhVar2 = this.p;
        boolean isBetterQuality = this.q.isBetterQuality();
        if (qhVar2.f != null) {
            kn.c(ki.b);
            i = qhVar2.f.a(this, isBetterQuality);
        }
        this.o = i;
        a(this.q.getZIndex());
    }

    public int hashCode() {
        return this.b_.hashCode();
    }
}
