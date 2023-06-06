package com.tencent.mapsdk.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.tencent.map.lib.callbacks.TileOverlayCallback;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Tile;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import java.io.File;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class qh {
    public static final String a = "tileOverlay";
    public static final String b = "getTile";
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 100;
    private static final String j = "x";
    private static final String k = "y";
    private static final String l = "z";
    public sh f;
    public Map<Integer, qc> g = new Hashtable(4);
    public mn h;
    String i;
    private qj m;
    private Context n;

    public qh(Context context, mn mnVar) {
        this.n = context;
        this.h = mnVar;
        this.f = mnVar.g;
        this.i = mi.a(context, (TencentMapOptions) null).b().getPath();
    }

    public final qc a(int i) {
        if (i >= 0) {
            return this.g.get(Integer.valueOf(i));
        }
        return null;
    }

    private Context a() {
        return this.n;
    }

    private mn b() {
        return this.h;
    }

    public final void a(qc qcVar) {
        if (qcVar == null || qcVar.o <= 0) {
            return;
        }
        this.g.put(Integer.valueOf(qcVar.o), qcVar);
    }

    public final qc a(TileOverlayOptions tileOverlayOptions) {
        if (this.m == null) {
            this.m = new qj(this);
        }
        return this.m.a(tileOverlayOptions);
    }

    public final TileOverlay b(TileOverlayOptions tileOverlayOptions) {
        qc a2 = a(tileOverlayOptions);
        kn.b(ki.b);
        return new az(a2);
    }

    private boolean c() {
        return this.f.t();
    }

    private void a(boolean z) {
        this.f.h(z);
    }

    private void d() {
        if (this.g == null || this.g.isEmpty()) {
            return;
        }
        for (qc qcVar : (qc[]) this.g.values().toArray(new qc[this.g.keySet().size()])) {
            qcVar.remove();
        }
    }

    private int a(TileOverlayCallback tileOverlayCallback, boolean z) {
        if (this.f == null) {
            return -1;
        }
        kn.c(ki.b);
        return this.f.a(tileOverlayCallback, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        if (this.f == null) {
            return;
        }
        this.f.b(i, i2);
    }

    public final void a(int i, int i2, int i3) {
        if (this.f == null) {
            return;
        }
        this.f.a(i, i2, i3);
    }

    private void c(int i) {
        if (this.f == null) {
            return;
        }
        this.g.remove(Integer.valueOf(i));
        this.f.d(i);
        kn.d(ki.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        if (this.f == null) {
            return;
        }
        this.f.e(i);
    }

    public final byte[] a(String str) {
        int a2;
        qc qcVar;
        try {
            Uri parse = Uri.parse(str);
            if (!hb.a(parse.getAuthority(), b) || (a2 = a(parse)) == -1 || (qcVar = this.g.get(Integer.valueOf(a2))) == null) {
                return null;
            }
            int a3 = a(parse, "x");
            int a4 = a(parse, "y");
            int a5 = a(parse, l);
            if (qcVar.q != null && qcVar.q.getTileProvider() != null && a5 >= 0) {
                String format = String.format(qc.a, kc.b(qcVar.q.getVersionInfo()), Integer.valueOf(a3), Integer.valueOf(a4), Integer.valueOf(a5));
                Tile tile = qcVar.q.getTileProvider().getTile(a3, a4, a5);
                if (tile == null) {
                    kj.d(ki.b, "Provider没有瓦片数据，返回空瓦块");
                    return gx.a();
                }
                byte[] bArr = tile.mData;
                if (bArr != null && bArr.length > 0) {
                    kn.b(ki.b, "cacheId", (Object) format);
                    qe qeVar = new qe(bArr);
                    if (qcVar.r != null) {
                        jp a6 = jm.a(qcVar.r);
                        if (a6 != null) {
                            a6.b(format, (String) qeVar);
                        } else {
                            qcVar.r.a(format, (String) qeVar);
                        }
                    }
                }
                return bArr;
            }
            kj.d(ki.b, "无效坐标，返回空瓦块");
            return gx.a();
        } catch (Exception e2) {
            kj.c(Log.getStackTraceString(e2));
            return null;
        }
    }

    private static int a(Uri uri) {
        String lastPathSegment;
        if (uri == null || (lastPathSegment = uri.getLastPathSegment()) == null) {
            return -1;
        }
        try {
            return Integer.parseInt(lastPathSegment);
        } catch (NumberFormatException e2) {
            kj.c(Log.getStackTraceString(e2));
            return -1;
        }
    }

    private static int a(Uri uri, String str) {
        if (uri == null) {
            return -1;
        }
        try {
            return Integer.parseInt(uri.getQueryParameter(str));
        } catch (NumberFormatException e2) {
            kj.c(Log.getStackTraceString(e2));
            return -1;
        }
    }

    private static void a(Context context) {
        File[] listFiles;
        if (context == null) {
            return;
        }
        File file = new File(mi.a(context, (TencentMapOptions) null).b().getPath() + "/tile/");
        if (!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (File file2 : listFiles) {
            if (currentTimeMillis - file2.lastModified() > TimeUnit.DAYS.toMillis(7L)) {
                kc.b(file2);
            }
        }
    }
}
