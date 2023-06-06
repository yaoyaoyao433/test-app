package com.tencent.mapsdk.internal;

import android.content.Context;
import com.meituan.robust.common.CommonConstant;
import com.tencent.mapsdk.internal.jy;
import com.tencent.mapsdk.internal.rl;
import com.tencent.mapsdk.vector.VectorMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import com.tencent.tencentmap.mapsdk.maps.model.Language;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaSource;
import com.tencent.tencentmap.mapsdk.maps.model.OverSeaTileProvider;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.TileOverlayOptions;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class rm {
    private static final int f = 7;
    public so a;
    public rl b;
    public OverSeaTileProvider c;
    public boolean e;
    private TileOverlayOptions h;
    private TileOverlay g = null;
    public volatile boolean d = false;

    public rm(so soVar) {
        this.a = null;
        this.a = soVar;
        if (ju.a("4.5.5.2", "4.0.9")) {
            kd.c(mi.a(this.a.G(), (TencentMapOptions) null).a() + "/tencentmapsdk/rastermap/unmainland");
            kd.c(mi.a(this.a.G(), (TencentMapOptions) null).b().getPath() + "/rastermap/taiwan");
        }
    }

    private void a(Context context, OverSeaSource overSeaSource) {
        this.b = new rl();
        rl rlVar = this.b;
        if (context != null) {
            rlVar.i = overSeaSource;
            jy.a((jy.g) new rl.AnonymousClass2(context, overSeaSource)).a((jy.b.a) Boolean.FALSE, (jy.a<jy.b.a>) null);
        }
    }

    private boolean c() {
        return this.d;
    }

    private void d() {
        this.d = true;
    }

    private void e() {
        if (this.g == null) {
            return;
        }
        this.g.clearTileCache();
    }

    private void f() {
        if (ju.a("4.5.5.2", "4.0.9")) {
            kd.c(mi.a(this.a.G(), (TencentMapOptions) null).a() + "/tencentmapsdk/rastermap/unmainland");
            kd.c(mi.a(this.a.G(), (TencentMapOptions) null).b().getPath() + "/rastermap/taiwan");
        }
    }

    public final void a() {
        b();
        if (this.h != null) {
            this.h.versionInfo(this.b.d()).diskCacheDir(this.b.a());
        }
        if (this.g != null) {
            this.g.reload();
        }
    }

    public final void b() {
        kj.c(ki.h, "检查海外图状态");
        if (this.a == null || this.a.e_ == 0 || this.a.d_ == 0) {
            return;
        }
        C c = this.a.d_;
        if (((VectorMap) this.a.e_).r() < 7) {
            g();
            kj.c(ki.h, "级别无效");
            return;
        }
        kj.c(ki.h, "级别有效");
        if (!this.b.e || !c.f) {
            if (this.g != null) {
                g();
            }
            kj.c(ki.h, "权限无效");
            return;
        }
        kj.c(ki.h, "权限有效");
        if (!c.e) {
            if (this.g != null) {
                g();
            }
            kj.c(ki.h, "边界线无效");
            return;
        }
        kj.c(ki.h, "边界线有效");
        boolean z = this.b.h;
        StringBuilder sb = new StringBuilder("数据配置模式：");
        sb.append(z ? "暗色" : "亮色");
        kj.c(ki.h, sb.toString());
        boolean l = ((mn) this.a.d_).l();
        StringBuilder sb2 = new StringBuilder("当前地图模式：");
        sb2.append(l ? "暗色" : "亮色");
        kj.c(ki.h, sb2.toString());
        if (l != z) {
            kj.c(ki.h, "更新暗色模式：".concat(String.valueOf(l)));
            this.b.a(l);
            g();
            if (this.c != null) {
                this.c.onDayNightChange(z);
            }
        }
        if (this.e) {
            this.e = false;
            g();
        }
        if (this.g == null) {
            h();
        }
    }

    private void a(Language language) {
        if (language == null || this.b.j == language) {
            return;
        }
        this.b.j = language;
        if (this.c != null) {
            this.c.onLanguageChange(language);
        }
        a();
    }

    private void g() {
        so soVar = this.a;
        TileOverlay tileOverlay = this.g;
        if (soVar == null || soVar.e_ == 0 || soVar.aB == null || tileOverlay == null) {
            return;
        }
        mn mnVar = soVar.aB;
        mnVar.h(((VectorMap) soVar.e_).p);
        mnVar.i(true);
        tileOverlay.remove();
        this.g = null;
        this.h = null;
    }

    private void h() {
        ru b;
        if (this.g != null || this.a == null || this.a.e_ == 0 || this.a.aB == null || (b = this.b.b()) == null) {
            return;
        }
        kj.c(ki.h, "获取海外图图源：".concat(String.valueOf(b)));
        mn mnVar = this.a.aB;
        mnVar.h(false);
        mnVar.i(false);
        this.c = new rn(b, this.b.i, mnVar.d);
        String d = this.b.d();
        String a = this.b.a();
        kj.c(ki.h, "海外瓦片缓存目录：".concat(String.valueOf(a)));
        this.h = new TileOverlayOptions().tileProvider(this.c).betterQuality(false).versionInfo(d).zIndex(1).diskCacheDir(a);
        this.g = mnVar.H.b(this.h);
        kj.c(ki.h, "开启海外图");
    }

    private boolean a(fu[] fuVarArr) {
        fu[] W;
        if (this.a == null || (W = this.a.W()) == null || fuVarArr == null) {
            return true;
        }
        return rj.a(W, fuVarArr);
    }

    private void a(OverSeaTileProvider overSeaTileProvider) {
        if (this.c != overSeaTileProvider) {
            kj.c(ki.h, "设置自定义海外图源，old[" + this.c + "] to new[" + overSeaTileProvider + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            this.c = overSeaTileProvider;
            this.e = true;
            this.b.k = this.c;
            List<rp> c = this.b.c();
            if (this.a != null) {
                this.a.a(false, c);
            }
            a();
        }
    }

    private rl i() {
        return this.b;
    }

    private boolean j() {
        return this.b.e;
    }
}
