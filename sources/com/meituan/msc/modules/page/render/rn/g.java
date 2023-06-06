package com.meituan.msc.modules.page.render.rn;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.msc.csslib.CSSParserNative;
import com.meituan.dio.easy.DioFile;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.looper_logging.LooperLoggingManager;
import com.meituan.msc.common.config.MSCRenderConfig;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.common.utils.aw;
import com.meituan.msc.common.utils.az;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.devsupport.perf.RenderPerf;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.jse.bridge.IRuntimeDelegate;
import com.meituan.msc.jse.bridge.JSInstance;
import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.msc.jse.bridge.queue.ReactQueueConfiguration;
import com.meituan.msc.lib.interfaces.IFileModule;
import com.meituan.msc.mmpviews.image.MPRoundImageView;
import com.meituan.msc.mmpviews.list.msclist.view.MSCListView;
import com.meituan.msc.mmpviews.list.msclist.view.TemplateInfo;
import com.meituan.msc.mmpviews.perflist.PerfListInfoWrapper;
import com.meituan.msc.mmpviews.swiper.SwiperShellView;
import com.meituan.msc.mmpviews.text.MPInlineBlockTextView;
import com.meituan.msc.mmpviews.text.MPLeafTextView;
import com.meituan.msc.mmpviews.text.MPTextView;
import com.meituan.msc.mmpviews.view.MPViewGroup;
import com.meituan.msc.modules.container.p;
import com.meituan.msc.modules.container.u;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.engine.j;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.page.render.d;
import com.meituan.msc.modules.page.render.rn.RNRootView;
import com.meituan.msc.modules.page.render.rn.c;
import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.UIManagerModule;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.msc.views.precreate.c;
import com.meituan.msc.views.scroll.VelocityHelper;
import com.meituan.msi.ApiPortal;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class g extends com.meituan.msc.modules.page.render.d implements IRuntimeDelegate, com.meituan.msc.modules.page.render.f {
    public static ChangeQuickRedirect t;
    private MSCListView A;
    private boolean B;
    private final String m;
    private com.meituan.msc.modules.exception.d n;
    private c o;
    private RenderPerf p;
    private final boolean q;
    private final List<VelocityHelper> r;
    private boolean s;
    protected e u;
    protected com.meituan.msc.modules.viewmanager.h v;
    protected ReactApplicationContext w;
    private com.meituan.msc.modules.page.render.rn.fps.c x;
    private ReactContext y;
    private f z;

    public void notifyRListCreated(int i) {
    }

    @Override // com.meituan.msc.modules.page.render.f
    public final boolean p() {
        return false;
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1aae59d46fc80a1dbb4b9eb2ea7867c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1aae59d46fc80a1dbb4b9eb2ea7867c");
            return;
        }
        this.m = "NativeRenderer@" + Integer.toHexString(hashCode());
        this.q = false;
        this.r = new ArrayList();
        this.s = false;
        this.B = false;
    }

    public static /* synthetic */ void a(g gVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = com.meituan.msc.modules.page.render.d.a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "501dab719fca0e49f6aa50526f006be4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "501dab719fca0e49f6aa50526f006be4");
        } else {
            gVar.a((HashMap<String, Object>) null);
        }
    }

    @Override // com.meituan.msc.modules.page.render.f
    public final com.meituan.msc.modules.page.render.h o() {
        return this.z;
    }

    @Override // com.meituan.msc.modules.page.render.d
    public Set<k> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "393ad2ea0a7de8b7b8565ed5ec55b205", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "393ad2ea0a7de8b7b8565ed5ec55b205") : com.meituan.msc.common.utils.f.a(this.v);
    }

    @Override // com.meituan.msc.modules.page.render.d, com.meituan.msc.modules.page.render.f
    public void a(Context context, com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f97dd36c9c783a0362e6827d5eadab97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f97dd36c9c783a0362e6827d5eadab97");
            return;
        }
        super.a(context, hVar);
        this.s = MSCRenderConfig.i();
        this.n = new com.meituan.msc.modules.exception.d(hVar);
        this.p = new RenderPerf(RenderPerf.b, getPerfEventRecorder());
        this.w = new ReactApplicationContext(context, this);
        ReactApplicationContext reactApplicationContext = this.w;
        com.meituan.msc.modules.service.i iVar = this.h;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.service.i.a;
        reactApplicationContext.initializeMessageQueueThreads(PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "8c73de2a8603decfbd01c708d0625e87", RobustBitConfig.DEFAULT_VALUE) ? (ReactQueueConfiguration) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "8c73de2a8603decfbd01c708d0625e87") : iVar.d.getReactQueueConfiguration());
        this.u = new e(this.w, hVar, n());
        this.u.a(new RNRootView.a() { // from class: com.meituan.msc.modules.page.render.rn.g.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.page.render.rn.RNRootView.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2d315d645819d24ee54a39c582c9cba5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2d315d645819d24ee54a39c582c9cba5");
                } else {
                    g.a(g.this);
                }
            }
        });
        this.z = this.u.a();
        ReactApplicationContext reactApplicationContext2 = this.w;
        Object[] objArr3 = {reactApplicationContext2};
        ChangeQuickRedirect changeQuickRedirect3 = t;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b00d98f5a1dc1a96701639cd7bfd7971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b00d98f5a1dc1a96701639cd7bfd7971");
        } else if (MSCFpsHornConfig.d().e()) {
            if (this.s) {
                this.x = new com.meituan.msc.modules.page.render.rn.fps.c();
                this.x.a((Context) this.w, new a() { // from class: com.meituan.msc.modules.page.render.rn.g.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.modules.page.render.rn.fps.a
                    public final void a(double d, double d2) {
                        Object[] objArr4 = {Double.valueOf(d), Double.valueOf(d2)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "de296f58083f52e0989f90f18540d6be", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "de296f58083f52e0989f90f18540d6be");
                        } else if (g.this.k == null || g.this.k.j == null) {
                        } else {
                            g.this.k.j.a(d, d2);
                        }
                    }

                    @Override // com.meituan.msc.modules.page.render.rn.lag.c
                    public final void a(boolean z, String str, ArrayList<String> arrayList) {
                        Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, arrayList};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8dde5bd67150e03940b348e1aacbff6c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8dde5bd67150e03940b348e1aacbff6c");
                        } else if (g.this.k == null || g.this.k.j == null) {
                        } else {
                            g.this.k.j.a(z, arrayList);
                        }
                    }
                });
                this.x.a((ReactContext) this.w, new a() { // from class: com.meituan.msc.modules.page.render.rn.g.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.modules.page.render.rn.fps.a
                    public final void a(double d, double d2) {
                        Object[] objArr4 = {Double.valueOf(d), Double.valueOf(d2)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "257ee3f430c9635f67bb4a3a8159d495", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "257ee3f430c9635f67bb4a3a8159d495");
                        } else if (g.this.k == null || g.this.k.j == null) {
                        } else {
                            g.this.k.j.b(d, d2);
                        }
                    }

                    @Override // com.meituan.msc.modules.page.render.rn.lag.c
                    public final void a(boolean z, String str, ArrayList<String> arrayList) {
                        Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, arrayList};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "419f577dd91706fb3c7ed0e858e88300", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "419f577dd91706fb3c7ed0e858e88300");
                        } else if (g.this.k == null || g.this.k.j == null) {
                        } else {
                            g.this.k.j.b(z, arrayList);
                        }
                    }
                });
                this.x.b(this.w, new a() { // from class: com.meituan.msc.modules.page.render.rn.g.4
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.modules.page.render.rn.fps.a
                    public final void a(double d, double d2) {
                        Object[] objArr4 = {Double.valueOf(d), Double.valueOf(d2)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4e1fbfe6df060f46425ef8502f9cebca", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4e1fbfe6df060f46425ef8502f9cebca");
                        } else if (g.this.k == null || g.this.k.j == null) {
                        } else {
                            g.this.k.j.c(d, d2);
                        }
                    }

                    @Override // com.meituan.msc.modules.page.render.rn.lag.c
                    public final void a(boolean z, String str, ArrayList<String> arrayList) {
                        Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, arrayList};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2f707f397109a3e1c861aa69b6a5f83f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2f707f397109a3e1c861aa69b6a5f83f");
                        } else if (g.this.k == null || g.this.k.j == null) {
                        } else {
                            g.this.k.j.c(z, arrayList);
                        }
                    }
                });
            } else {
                this.o = new c(reactApplicationContext2, new c.b() { // from class: com.meituan.msc.modules.page.render.rn.g.5
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.modules.page.render.rn.c.b
                    public final void a(double d, double d2, double d3, double d4, double d5, double d6) {
                        Object[] objArr4 = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5), Double.valueOf(d6)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "df1771ee4108b326dff8a58acebd2cc1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "df1771ee4108b326dff8a58acebd2cc1");
                        } else if (g.this.k == null || g.this.k.j == null) {
                        } else {
                            com.meituan.msc.modules.page.render.a aVar = g.this.k.j;
                            Object[] objArr5 = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5), Double.valueOf(d6)};
                            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.page.render.a.d;
                            if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "be19fb7c8acfb203c530d288527c30e9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "be19fb7c8acfb203c530d288527c30e9");
                                return;
                            }
                            aVar.a(d, d2);
                            aVar.b(d3, d4);
                            aVar.c(d5, d6);
                        }
                    }

                    @Override // com.meituan.msc.modules.page.render.rn.c.b
                    public final void a(boolean z, String str, ArrayList<String> arrayList) {
                        Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, arrayList};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "207ce62aa46fab1068342cc9e1480827", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "207ce62aa46fab1068342cc9e1480827");
                        } else if (g.this.k == null || g.this.k.j == null) {
                        } else {
                            com.meituan.msc.modules.page.render.a aVar = g.this.k.j;
                            Object[] objArr5 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, arrayList};
                            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.page.render.a.d;
                            if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "a71ea206ed942c1a99691e69ab5428ed", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "a71ea206ed942c1a99691e69ab5428ed");
                            } else if ("ui".equals(str)) {
                                aVar.a(z, arrayList);
                            } else if ("js".equals(str)) {
                                aVar.b(z, arrayList);
                            } else if ("shadow".equals(str)) {
                                aVar.c(z, arrayList);
                            }
                        }
                    }
                });
            }
        }
        this.v = this.u.d;
        this.u.a((RCTEventEmitter) ((com.meituan.msc.modules.engine.a) hVar.c(com.meituan.msc.modules.engine.a.class)).a(RCTEventEmitter.class));
    }

    @Override // com.meituan.msc.modules.page.render.d
    public final d.b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aee66af6cd6486e78452a0c9e68c8b5", RobustBitConfig.DEFAULT_VALUE) ? (d.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aee66af6cd6486e78452a0c9e68c8b5") : new d.b();
    }

    @Override // com.meituan.msc.modules.page.render.d, com.meituan.msc.modules.page.render.g
    public final void k() {
        com.meituan.msc.modules.page.render.rn.lag.b[] bVarArr;
        com.meituan.msc.modules.page.render.rn.fps.c cVar;
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97427047051a76ad480df14f4cd5e36d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97427047051a76ad480df14f4cd5e36d");
            return;
        }
        super.k();
        com.meituan.msc.modules.reporter.g.d(this.m, "[onDestroy]", Integer.valueOf(getPageId()), this);
        if (this.z != null) {
            f fVar = this.z;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "c3da5fde4a74a046406e18ed4b22c7c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "c3da5fde4a74a046406e18ed4b22c7c4");
            } else {
                fVar.e = true;
                fVar.b.unmountReactApplication();
                fVar.b = null;
                fVar.d = null;
            }
        }
        this.u.m = true;
        this.w.destroy();
        if (!this.s || this.x == null) {
            return;
        }
        com.meituan.msc.modules.page.render.rn.fps.c cVar2 = this.x;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.page.render.rn.fps.c.a;
        if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "eb509badc68522a186a456250de22759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "eb509badc68522a186a456250de22759");
            cVar = null;
        } else {
            com.meituan.msc.modules.page.render.rn.fps.d[] dVarArr = cVar2.b;
            int length = dVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                com.meituan.msc.modules.page.render.rn.fps.d dVar = dVarArr[i2];
                if (dVar != null) {
                    Object[] objArr4 = new Object[i];
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.page.render.rn.fps.d.a;
                    if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "12a453272f52c502a0e82bc4e436314c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "12a453272f52c502a0e82bc4e436314c");
                    } else {
                        dVar.b = 0L;
                        dVar.c = 0L;
                        dVar.d = 0;
                        dVar.h = false;
                        com.meituan.msc.modules.page.render.rn.fps.e.a().b(dVar.m);
                    }
                }
                i2++;
                i = 0;
            }
            for (com.meituan.msc.modules.page.render.rn.lag.b bVar : cVar2.c) {
                if (bVar != null) {
                    bVar.a();
                }
            }
            cVar = null;
        }
        this.x = cVar;
    }

    @Override // com.meituan.msc.modules.page.render.d, com.meituan.msc.modules.page.render.g
    public void l() {
        com.meituan.msc.modules.page.render.rn.lag.b[] bVarArr;
        com.meituan.msc.modules.page.render.rn.fps.d[] dVarArr;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b560ddb883cf46b21843b88b3d5468ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b560ddb883cf46b21843b88b3d5468ab");
            return;
        }
        super.l();
        int i = 1;
        com.meituan.msc.modules.reporter.g.d(this.m, "[onShow]", Integer.valueOf(getPageId()), this);
        this.k.l = true;
        this.w.onHostResume();
        com.meituan.msc.modules.viewmanager.h hVar = this.v;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.viewmanager.h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "d75ff957798317bffc51b10b0a56623f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "d75ff957798317bffc51b10b0a56623f");
        } else {
            hVar.f();
            hVar.j = false;
            com.meituan.msc.modules.reporter.g.d(hVar.b, "[onShow]", Boolean.valueOf(hVar.j));
            com.meituan.msc.uimanager.interaction.a aVar = hVar.c.c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.uimanager.interaction.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "ef3227a555a8a697a63b1fceecd52ebc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "ef3227a555a8a697a63b1fceecd52ebc");
            } else if (aVar.e) {
                aVar.f = true;
                aVar.h.clear();
            }
        }
        if (this.B) {
            this.z.c();
            this.B = false;
        }
        if (this.o != null) {
            final c cVar = this.o;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = c.a;
            if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "c2061f3a74c7984160999ef8b03c6ad8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "c2061f3a74c7984160999ef8b03c6ad8");
            } else if (!cVar.e && cVar.b != null) {
                cVar.e = true;
                cVar.g = false;
                cVar.l.b();
                cVar.b.runOnJSQueueThread(new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.c.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "711162b40caed4bc7beffc8ed424ce23", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "711162b40caed4bc7beffc8ed424ce23");
                        } else {
                            cVar.m.b();
                        }
                    }
                });
                cVar.b.runOnNativeModulesQueueThread(new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.c.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f6a6dc4b54d4dd11695f74ea5c673113", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f6a6dc4b54d4dd11695f74ea5c673113");
                        } else {
                            cVar.n.b();
                        }
                    }
                });
                cVar.j = com.sankuai.android.jarvis.c.c("recalculateThread");
                cVar.k = cVar.j.scheduleAtFixedRate(new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.c.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6259e785fddd2e4362f0b14419e0b296", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6259e785fddd2e4362f0b14419e0b296");
                            return;
                        }
                        c cVar2 = cVar;
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = c.a;
                        if (PatchProxy.isSupport(objArr6, cVar2, changeQuickRedirect6, false, "64c91cec88ade08cffc5005212db9996", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, cVar2, changeQuickRedirect6, false, "64c91cec88ade08cffc5005212db9996");
                            return;
                        }
                        cVar2.l.d();
                        cVar2.m.d();
                        cVar2.n.d();
                    }
                }, 1000L, 1000L, TimeUnit.MILLISECONDS);
                cVar.d.postDelayed(new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.c.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Window window;
                        View decorView;
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c9874696a771ea77b4410bdc4a24e62a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c9874696a771ea77b4410bdc4a24e62a");
                            return;
                        }
                        c cVar2 = cVar;
                        Activity currentActivity = cVar.b.getCurrentActivity();
                        Object[] objArr6 = {currentActivity};
                        ChangeQuickRedirect changeQuickRedirect6 = c.a;
                        if (PatchProxy.isSupport(objArr6, cVar2, changeQuickRedirect6, false, "ebb24972333d2d85f46cacb03f0884e2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, cVar2, changeQuickRedirect6, false, "ebb24972333d2d85f46cacb03f0884e2");
                        } else if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                        } else {
                            try {
                                decorView.getViewTreeObserver().addOnScrollChangedListener(cVar2.c);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }, 1000L);
            }
        }
        if (!this.s || this.x == null) {
            return;
        }
        f fVar = this.z;
        com.meituan.msc.modules.page.render.rn.fps.c cVar2 = this.x;
        Object[] objArr5 = {cVar2};
        ChangeQuickRedirect changeQuickRedirect5 = f.a;
        if (PatchProxy.isSupport(objArr5, fVar, changeQuickRedirect5, false, "8d7bb870666e67ee11a132a5e706a2df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, fVar, changeQuickRedirect5, false, "8d7bb870666e67ee11a132a5e706a2df");
        } else if (cVar2 != null) {
            fVar.f.add(cVar2);
        }
        com.meituan.msc.modules.page.render.rn.fps.c cVar3 = this.x;
        f fVar2 = this.z;
        Object[] objArr6 = {fVar2};
        ChangeQuickRedirect changeQuickRedirect6 = com.meituan.msc.modules.page.render.rn.fps.c.a;
        if (PatchProxy.isSupport(objArr6, cVar3, changeQuickRedirect6, false, "49a5d850785dd1c0a4d11cbac505b223", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, cVar3, changeQuickRedirect6, false, "49a5d850785dd1c0a4d11cbac505b223");
            return;
        }
        com.meituan.msc.modules.page.render.rn.fps.d[] dVarArr2 = cVar3.b;
        int length = dVarArr2.length;
        int i2 = 0;
        while (i2 < length) {
            com.meituan.msc.modules.page.render.rn.fps.d dVar = dVarArr2[i2];
            if (dVar != null) {
                Object[] objArr7 = new Object[i];
                objArr7[c] = fVar2;
                ChangeQuickRedirect changeQuickRedirect7 = com.meituan.msc.modules.page.render.rn.fps.d.a;
                if (PatchProxy.isSupport(objArr7, dVar, changeQuickRedirect7, false, "27543222c2cc0d67c5a06ca54c72aaf8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, dVar, changeQuickRedirect7, false, "27543222c2cc0d67c5a06ca54c72aaf8");
                } else if (fVar2 != null) {
                    if (!dVar.j && fVar2.getContext() != null) {
                        dVar.j = com.meituan.msc.modules.page.render.rn.fps.d.a(fVar2.getContext());
                    }
                    if (!dVar.h) {
                        com.meituan.msc.modules.page.render.rn.fps.e.a().a(dVar.m);
                        dVar.h = true;
                    }
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = com.meituan.msc.modules.page.render.rn.fps.d.a;
                    dVarArr = dVarArr2;
                    if (PatchProxy.isSupport(objArr8, dVar, changeQuickRedirect8, false, "0d40edad14bae238dd9e4138404124d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, dVar, changeQuickRedirect8, false, "0d40edad14bae238dd9e4138404124d8");
                        i = 1;
                    } else {
                        dVar.e = new com.meituan.msc.modules.page.render.rn.fps.b("page", com.meituan.msc.modules.page.render.rn.fps.d.i);
                        i = 1;
                        dVar.e.e = true;
                        dVar.e.d = dVar.c;
                        dVar.e.c = dVar.d;
                    }
                    dVar.f = new com.meituan.msc.modules.page.render.rn.fps.b(Constants.FPS_TYPE_SCROLL, com.meituan.msc.modules.page.render.rn.fps.d.i);
                    dVar.a(fVar2);
                }
                dVarArr = dVarArr2;
                i = 1;
            } else {
                dVarArr = dVarArr2;
            }
            i2++;
            dVarArr2 = dVarArr;
            c = 0;
        }
        for (com.meituan.msc.modules.page.render.rn.lag.b bVar : cVar3.c) {
            if (bVar != null) {
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = com.meituan.msc.modules.page.render.rn.lag.b.a;
                if (PatchProxy.isSupport(objArr9, bVar, changeQuickRedirect9, false, "15db052f071c37ce974e19f0ffbab03c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, bVar, changeQuickRedirect9, false, "15db052f071c37ce974e19f0ffbab03c");
                } else if (bVar.c == 0) {
                    LooperLoggingManager.getInstance().registerLogging(bVar.b, bVar);
                    com.meituan.msc.modules.page.render.rn.fps.e.a().a(bVar);
                } else {
                    com.meituan.msc.modules.page.render.rn.fps.e.a().a(bVar);
                    bVar.b();
                }
            }
        }
    }

    @Override // com.meituan.msc.modules.page.render.g
    public void q() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58d3cfb8fdc68b5a53d4b71f14e4ad86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58d3cfb8fdc68b5a53d4b71f14e4ad86");
            return;
        }
        com.meituan.msc.modules.reporter.g.d(this.m, "[onHide]", Integer.valueOf(getPageId()), this);
        this.k.l = false;
        this.w.onHostPause();
        com.meituan.msc.modules.viewmanager.h hVar = this.v;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.viewmanager.h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "024c4b8026d281ac727b9d6c1328ce22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "024c4b8026d281ac727b9d6c1328ce22");
        } else {
            hVar.j = true;
            com.meituan.msc.modules.reporter.g.d(hVar.b, "[onHide]");
            hVar.c.c.a(8, "triggered by Page onHide");
            com.meituan.msc.uimanager.interaction.a aVar = hVar.c.c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.uimanager.interaction.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "44b0f81000b343de16a1d486dbf0ef4b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "44b0f81000b343de16a1d486dbf0ef4b");
            } else if (aVar.b()) {
                aVar.f = false;
                if (aVar.c.a != 0) {
                    aVar.a();
                }
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.uimanager.interaction.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "26954095574367e5f9398684e7b1d313", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "26954095574367e5f9398684e7b1d313");
                } else {
                    int[] iArr = new int[32];
                    int i = aVar.d[1] + aVar.d[6] + aVar.d[7];
                    int i2 = 0;
                    for (int i3 = 0; i3 < 32; i3++) {
                        int i4 = aVar.d[i3];
                        i2 += i4;
                        iArr[i3] = i4;
                    }
                    int i5 = i;
                    for (int i6 = 16; i6 < 32; i6++) {
                        i5 += aVar.d[i6];
                    }
                    if (i2 > 0) {
                        double d = i5 / i2;
                        String obj = i5 > 0 ? aVar.h.toString() : "[]";
                        aVar.a("WINDOW_REPORT", "COUNT: " + Arrays.toString(iArr) + ", FAILED: " + i5 + ", RATIO: " + d);
                        aVar.b.getRuntimeDelegate().reportMSCPageInteractionMetrics(iArr, i5, i2, obj, d);
                        for (int i7 = 0; i7 < 32; i7++) {
                            aVar.d[i7] = 0;
                        }
                        aVar.c.c = 0;
                        aVar.c.a = 0L;
                        aVar.h.clear();
                        aVar.g.clear();
                    }
                }
            }
        }
        p c = c();
        if (c != null && !c.D()) {
            f fVar = this.z;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = f.a;
            if (PatchProxy.isSupport(objArr5, fVar, changeQuickRedirect5, false, "ca3d0d3994933e582509555d7c589d48", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, fVar, changeQuickRedirect5, false, "ca3d0d3994933e582509555d7c589d48");
                z = true;
            } else {
                com.meituan.msc.modules.reporter.g.d("[MSCRNView@detachRootView]", "mReactRootView: " + fVar.b);
                if (fVar.b == null) {
                    z = true;
                    com.meituan.msc.modules.reporter.g.b("[MSCRNView@detachRootView]", null, "mReactRootView null");
                } else {
                    z = true;
                    fVar.removeView(fVar.b);
                }
            }
            this.B = z;
        }
        if (this.o != null) {
            this.o.a();
        }
        if (!this.s || this.x == null) {
            return;
        }
        f fVar2 = this.z;
        com.meituan.msc.modules.page.render.rn.fps.c cVar = this.x;
        Object[] objArr6 = {cVar};
        ChangeQuickRedirect changeQuickRedirect6 = f.a;
        if (PatchProxy.isSupport(objArr6, fVar2, changeQuickRedirect6, false, "c98705c994441f0d61b6d9439915e604", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, fVar2, changeQuickRedirect6, false, "c98705c994441f0d61b6d9439915e604");
        } else if (cVar != null) {
            fVar2.f.remove(cVar);
        }
        this.x.a(this.z);
    }

    @Override // com.meituan.msc.modules.page.render.d
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54bf0b96ad97bb5c3206730954d51960", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54bf0b96ad97bb5c3206730954d51960");
            return;
        }
        super.a(str);
        if (isProdEnv()) {
            return;
        }
        this.w.getUIImplementation();
    }

    @Override // com.meituan.msc.modules.page.render.d
    public final void a(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b62391e7e28433f0f12b3c2feb83c911", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b62391e7e28433f0f12b3c2feb83c911");
            return;
        }
        super.a(uVar);
        String str = uVar.a;
        com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) this.d.c(com.meituan.msc.modules.engine.k.class);
        if (kVar == null) {
            com.meituan.msc.modules.reporter.g.d("[NativeRenderer@onAppRoute]", "disable RenderCommandOptimize, MainThreadJSEngineServiceModule null");
            return;
        }
        boolean b = kVar.b(str);
        com.meituan.msc.modules.reporter.g.d(this.m, "[NativeRenderer@onAppRoute]", "enable RenderCommandOptimize:", Boolean.valueOf(b), str);
        this.v.d = b;
    }

    private String c(String str) {
        PackageInfoWrapper orCreateSubPackageWrapperByPath;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84b15b0e8f98794d48d72e8324f61361", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84b15b0e8f98794d48d72e8324f61361");
        }
        com.meituan.msc.modules.update.f fVar = this.d.r;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.update.f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "763b13b88341b898fecee9cbe3fa7c17", RobustBitConfig.DEFAULT_VALUE)) {
            orCreateSubPackageWrapperByPath = (PackageInfoWrapper) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "763b13b88341b898fecee9cbe3fa7c17");
        } else {
            AppMetaInfoWrapper appMetaInfoWrapper = fVar.h;
            fVar.a(appMetaInfoWrapper);
            orCreateSubPackageWrapperByPath = appMetaInfoWrapper.getOrCreateSubPackageWrapperByPath(str);
        }
        if (orCreateSubPackageWrapperByPath == null) {
            return this.d.r.e();
        }
        return orCreateSubPackageWrapperByPath.getLocalPath();
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public ApiPortal getApiPortal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48f1c82ff56456f44bb260a29222de61", RobustBitConfig.DEFAULT_VALUE) ? (ApiPortal) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48f1c82ff56456f44bb260a29222de61") : ((com.meituan.msc.modules.msi.a) this.d.c(com.meituan.msc.modules.msi.a.class)).c();
    }

    @Override // com.meituan.msc.modules.page.render.d
    public final boolean a(boolean z, View view, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), view, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfc15256e554d43295d2d4af4c49be4c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfc15256e554d43295d2d4af4c49be4c")).booleanValue() : az.a(view, false, this.k.a);
    }

    @Override // com.meituan.msc.modules.page.render.d
    public final void e() {
        com.meituan.msc.modules.engine.a aVar;
        com.meituan.msc.modules.service.i f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "864ae4430a5ac08ef89fb563d29a5775", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "864ae4430a5ac08ef89fb563d29a5775");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = t;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3a5f0fc0e82d3d5da2efd3bc7d2db5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3a5f0fc0e82d3d5da2efd3bc7d2db5a");
        } else {
            if (this.o != null) {
                this.o.a();
            }
            if (this.A == null) {
                this.A = a(this.z);
            }
            if (this.A != null) {
                this.k.j.g = this.A.getMSCListPerfHelper();
                this.k.j.d();
                com.meituan.msc.devsupport.perf.a mSCListPerfHelper = this.A.getMSCListPerfHelper();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.devsupport.perf.a.a;
                if (PatchProxy.isSupport(objArr3, mSCListPerfHelper, changeQuickRedirect3, false, "be2b2d316dac108fb99ce52ed66ea8c7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, mSCListPerfHelper, changeQuickRedirect3, false, "be2b2d316dac108fb99ce52ed66ea8c7");
                } else {
                    mSCListPerfHelper.c = 0L;
                    mSCListPerfHelper.b = 0L;
                    mSCListPerfHelper.d = 0.0d;
                    mSCListPerfHelper.e = 0.0d;
                    mSCListPerfHelper.h = 0.0d;
                    mSCListPerfHelper.i = 0.0d;
                    mSCListPerfHelper.f = 0L;
                    mSCListPerfHelper.j = 0L;
                    mSCListPerfHelper.g = 0L;
                    mSCListPerfHelper.m = 0L;
                    mSCListPerfHelper.k.clear();
                    mSCListPerfHelper.l.clear();
                }
            }
        }
        super.e();
        com.meituan.msc.modules.reporter.g.d(this.m, "[onDetach]", Integer.valueOf(getPageId()), this);
        if (MSCFpsHornConfig.d().j()) {
            for (VelocityHelper velocityHelper : this.r) {
                if (velocityHelper != null && this.k.j != null) {
                    com.meituan.msc.modules.page.render.a aVar2 = this.k.j;
                    ArrayList<Integer> arrayList = velocityHelper.d;
                    Object[] objArr4 = {arrayList};
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.page.render.a.d;
                    if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "6dd8f01fb5666998e247da0b1eb6bfdb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "6dd8f01fb5666998e247da0b1eb6bfdb");
                    } else if (arrayList != null && !arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < arrayList.size() - 1; i++) {
                            sb.append(arrayList.get(i));
                            sb.append(CommonConstant.Symbol.COMMA);
                        }
                        sb.append(arrayList.get(arrayList.size() - 1));
                        aVar2.b("msc.page.scroll.velocity").a(JsBridgeResult.PROPERTY_LOCATION_VELOCITY, sb.toString()).b();
                    }
                }
            }
        }
        this.r.clear();
        if (this.d == null || (aVar = (com.meituan.msc.modules.engine.a) this.d.c(com.meituan.msc.modules.engine.a.class)) == null || (f = aVar.f()) == null) {
            return;
        }
        f.b(new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.g.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8ccbb43705664201babd2605ca1044ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8ccbb43705664201babd2605ca1044ea");
                    return;
                }
                String cssParserKey = g.this.getCssParserKey();
                com.meituan.msc.modules.reporter.g.d(g.this.m, "[destroyCSS]", "cssPath: ", g.this.getCssParserKey());
                if (cssParserKey == null) {
                    return;
                }
                CSSParserNative.a(cssParserKey);
            }
        });
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public RenderPerf getRenderPerf() {
        return this.p;
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public void recordInPage(String str, Map<String, Object> map, boolean z) {
        com.meituan.msc.modules.page.render.a aVar;
        Object[] objArr = {str, map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78f65031a2d1cbacb2618e1179187299", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78f65031a2d1cbacb2618e1179187299");
        } else if (("msc.render.text.layout.error".equals(str) && MSCHornRollbackConfig.j()) || (aVar = this.k.j) == null) {
        } else {
            com.meituan.msc.common.report.d a = aVar.b(str).a(map);
            if (z) {
                a.c();
            } else {
                a.b();
            }
        }
    }

    public final MSCListView a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "286f144fbcba2306ded18672fd35215b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MSCListView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "286f144fbcba2306ded18672fd35215b");
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof MSCListView) {
                    return (MSCListView) childAt;
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                MSCListView a = a(viewGroup.getChildAt(i2));
                if (a != null) {
                    return a;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50071f92d1c374da74bda606afa1ac8f", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50071f92d1c374da74bda606afa1ac8f") : (T) this.d.b(cls);
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public void handleException(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a38f145f718c4a349ee5d1b5e22dd7e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a38f145f718c4a349ee5d1b5e22dd7e6");
            return;
        }
        this.n.handleException(exc);
        UIManagerModule uIManagerModule = this.v.c;
        if (uIManagerModule == null) {
            return;
        }
        com.meituan.msc.uimanager.interaction.a aVar = uIManagerModule.c;
        aVar.a(16, "render failed: " + exc.getMessage());
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public Activity getCurrentActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41c9d32086735070244d1cf6e87ebb9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41c9d32086735070244d1cf6e87ebb9c");
        }
        if (c() != null) {
            return c().C();
        }
        return null;
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean shouldManageViewByCommand() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23d59460f8eed46c80e27527270e95a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23d59460f8eed46c80e27527270e95a7")).booleanValue();
        }
        n();
        com.meituan.msc.b bVar = com.meituan.msc.b.NATIVE;
        return false;
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public int getPageId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "532cf1b6d2127a5f76bc57d0ed739803", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "532cf1b6d2127a5f76bc57d0ed739803")).intValue();
        }
        if (n() == com.meituan.msc.b.NATIVE) {
            return j();
        }
        return -1;
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public String getFileContent(DioFile dioFile) {
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5992af13e4f561239aefc85a99c33a92", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5992af13e4f561239aefc85a99c33a92");
        }
        try {
            return r.a(dioFile);
        } catch (IOException e) {
            com.meituan.msc.modules.reporter.g.b(this.m, e, "[getFileContent]");
            return null;
        }
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public String getAppId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf36f4c09974e93a7dcce1bd00e8356d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf36f4c09974e93a7dcce1bd00e8356d") : this.d.d.b;
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public void addScrollVelocityHelper(VelocityHelper velocityHelper) {
        Object[] objArr = {velocityHelper};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cbcebc1d61a0a48d9eb4500b499a025", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cbcebc1d61a0a48d9eb4500b499a025");
        } else if (MSCFpsHornConfig.d().j()) {
            this.r.add(velocityHelper);
        }
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public void removeScrollVelocityHelper(VelocityHelper velocityHelper) {
        Object[] objArr = {velocityHelper};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f72feebb7b726a8f05b514a31c231960", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f72feebb7b726a8f05b514a31c231960");
        } else {
            this.r.remove(velocityHelper);
        }
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean isMainThreadJSEngineReady() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c912a4a27a33c959d606ff2f066fd6d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c912a4a27a33c959d606ff2f066fd6d")).booleanValue() : ((com.meituan.msc.modules.engine.k) this.d.c(com.meituan.msc.modules.engine.k.class)).f;
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public void registerMainThreadJSEngineReadyCallback(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3abad7ae7614ed3912f23feced4d5ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3abad7ae7614ed3912f23feced4d5ef");
            return;
        }
        com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) this.d.c(com.meituan.msc.modules.engine.k.class);
        if (kVar != null) {
            kVar.b(runnable);
        }
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public void unregisterMainThreadJSEngineReadyCallback(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "603ce18cb364fb94025087a27516c6a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "603ce18cb364fb94025087a27516c6a9");
            return;
        }
        com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) this.d.c(com.meituan.msc.modules.engine.k.class);
        if (kVar != null) {
            kVar.c(runnable);
        }
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public JSInstance getMainThreadJSInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86f3d8e78396f9ff96e8cbb245ec0e16", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSInstance) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86f3d8e78396f9ff96e8cbb245ec0e16");
        }
        com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) this.d.c(com.meituan.msc.modules.engine.k.class);
        if (kVar.f) {
            return kVar.d();
        }
        return null;
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public PerfListInfoWrapper getPerfListInfoWrapper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86d3b988c0d13f1f01bf2b88236d1b49", RobustBitConfig.DEFAULT_VALUE) ? (PerfListInfoWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86d3b988c0d13f1f01bf2b88236d1b49") : ((com.meituan.msc.modules.engine.k) this.d.c(com.meituan.msc.modules.engine.k.class)).g;
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean hasNewCommand() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69786edfdd9ca816323a2a6c027859d0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69786edfdd9ca816323a2a6c027859d0")).booleanValue() : ((com.meituan.msc.modules.mainthread.a) this.d.c(com.meituan.msc.modules.mainthread.a.class)).c;
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public int getCmdIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "984547e6113dd31f5688a3b07fe3b6b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "984547e6113dd31f5688a3b07fe3b6b8")).intValue();
        }
        com.meituan.msc.modules.mainthread.a aVar = (com.meituan.msc.modules.mainthread.a) this.d.c(com.meituan.msc.modules.mainthread.a.class);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.mainthread.a.a;
        return PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d9d9d6d41bbae93d9be14a57bd6e2a75", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d9d9d6d41bbae93d9be14a57bd6e2a75")).intValue() : aVar.b.get();
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public void resetHasNewCommand() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80241c91d08bab0366b059c6d2705b81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80241c91d08bab0366b059c6d2705b81");
        } else {
            ((com.meituan.msc.modules.mainthread.a) this.d.c(com.meituan.msc.modules.mainthread.a.class)).c = false;
        }
    }

    @Override // com.meituan.msc.modules.page.render.d
    public final View a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b066f1cee9d765c5207d66a964db056", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b066f1cee9d765c5207d66a964db056");
        }
        e eVar = this.u;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        View h = PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "f7af263ed23450395fa3206bbd2e4f84", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "f7af263ed23450395fa3206bbd2e4f84") : eVar.b.getUIImplementation().h(i);
        if (h != null) {
            return h;
        }
        if (super.a(i) != null) {
            return super.a(i);
        }
        String str = this.m;
        com.meituan.msc.modules.reporter.g.b(str, null, "[findViewById] find view null!, id = " + i);
        return null;
    }

    public boolean isProdEnv() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5291f9dafdd7c1e35d1586610b7c4dc3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5291f9dafdd7c1e35d1586610b7c4dc3")).booleanValue() : MSCEnvHelper.getEnvInfo().isProdEnv();
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public void printPendingTasks() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cae867f2d452cb40fb0ab6ad30c8c794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cae867f2d452cb40fb0ab6ad30c8c794");
            return;
        }
        com.meituan.msc.modules.viewmanager.h hVar = this.v;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.viewmanager.h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "4726c378d7f4313b9ebd890fb39c7cbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "4726c378d7f4313b9ebd890fb39c7cbc");
        } else {
            com.meituan.msc.modules.reporter.g.d(hVar.b, "[printPendingTasks] mPendingTasks:", Boolean.valueOf(hVar.h), Integer.valueOf(hVar.k.size()), Integer.valueOf(hVar.f), Integer.valueOf(hVar.e), Integer.valueOf(hVar.g));
        }
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public TemplateInfo tryGetTemplateInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37a2e9fff74162bf10282d53b77850bd", RobustBitConfig.DEFAULT_VALUE) ? (TemplateInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37a2e9fff74162bf10282d53b77850bd") : ((com.meituan.msc.modules.viewmanager.g) this.d.c(com.meituan.msc.modules.viewmanager.g.class)).a(str);
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public int getInteractionMonitorSamplingRate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46dc48b3dd32681e43bae24b867d200b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46dc48b3dd32681e43bae24b867d200b")).intValue() : MSCRenderConfig.f();
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public int getInteractionMonitorTimeWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "030010ab62b20194665ba28ee491d09b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "030010ab62b20194665ba28ee491d09b")).intValue() : MSCRenderConfig.g();
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public void reportMSCPageInteractionMetrics(int[] iArr, int i, int i2, String str, double d) {
        Object[] objArr = {iArr, Integer.valueOf(i), Integer.valueOf(i2), str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bcb44b8f75fb0645251a30a726c711f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bcb44b8f75fb0645251a30a726c711f");
            return;
        }
        j jVar = this.d.p;
        if (jVar == null) {
            com.meituan.msc.modules.reporter.g.a("[NativeRenderer@reportMSCPageInteractionMetrics]", "reporter null");
        } else {
            jVar.b("msc.page.interaction.fail.rate").a("flags", Arrays.toString(iArr)).a("failed", Integer.valueOf(i)).a("total", Integer.valueOf(i2)).a("beginInfo", str).a(d).b();
        }
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean isRollback(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faab77bd8ef56c257534eb08eacb0517", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faab77bd8ef56c257534eb08eacb0517")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        char c = 65535;
        if (str.hashCode() == -626753298 && str.equals("isRollbackFixOnPreDrawException")) {
            c = 0;
        }
        if (c != 0) {
            return false;
        }
        return MSCHornRollbackConfig.k();
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public void toast(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4a5a34c062ed9cc202f5449c65b1ee1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4a5a34c062ed9cc202f5449c65b1ee1");
        } else {
            aw.a(str, new Object[0]);
        }
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean interactionAPIWhiteListContains(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e61328f3a2a06d09a086f474281834ca", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e61328f3a2a06d09a086f474281834ca")).booleanValue() : MSCRenderConfig.a(str, str2);
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean interactionCallbackBlackListContains(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dadc1c026917973e596c04ab7de17c4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dadc1c026917973e596c04ab7de17c4")).booleanValue() : MSCRenderConfig.a(getAppId(), am.b(this.k.a), str);
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean enablePropsDiff() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7feeaa853bf5877b36942bd5003b5d78", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7feeaa853bf5877b36942bd5003b5d78")).booleanValue() : MSCRenderConfig.j();
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean isNativeRenderType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c06c6e26d39e7d04c869463686bd09fd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c06c6e26d39e7d04c869463686bd09fd")).booleanValue() : n() == com.meituan.msc.b.NATIVE;
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean enableOptimizeApplyViewUpdate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa5926f83a47ca6bbaf7643f9cf6ed69", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa5926f83a47ca6bbaf7643f9cf6ed69")).booleanValue() : MSCRenderConfig.k();
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean shrinkGif() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "024c61a791cbbda2af317c9bed13140b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "024c61a791cbbda2af317c9bed13140b")).booleanValue() : MSCRenderConfig.l();
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean cascadeUseByteArrayCharset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e66278aa329af1aa3714d5d12a676769", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e66278aa329af1aa3714d5d12a676769")).booleanValue() : MSCRenderConfig.m();
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public void setContextForPreCreateView(ThemedReactContext themedReactContext) {
        this.y = themedReactContext;
    }

    @Override // com.meituan.msc.modules.page.render.d
    public final void a(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c66b70e36b89f322ad759c0d3b43e739", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c66b70e36b89f322ad759c0d3b43e739");
            return;
        }
        super.a(hashMap);
        ((com.meituan.msc.modules.engine.k) this.d.c(com.meituan.msc.modules.engine.k.class)).a(this.k.a, this.y);
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean isPageInStrategyB() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e177cf6bf9224137157b2bb73c38f21", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e177cf6bf9224137157b2bb73c38f21")).booleanValue();
        }
        com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) this.d.c(com.meituan.msc.modules.engine.k.class);
        return kVar != null && kVar.b(this.k.a);
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public MPViewGroup tryGetMPView(final ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c245f47b2cd35ae7d508c37aa70a17f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c245f47b2cd35ae7d508c37aa70a17f1");
        }
        final com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) this.d.c(com.meituan.msc.modules.engine.k.class);
        if (kVar == null) {
            return new MPViewGroup(themedReactContext);
        }
        String str = this.k.a;
        Object[] objArr2 = {str, themedReactContext};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.engine.k.a;
        return PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "c5b9cc5ebc2ad2c164d3c850d231d231", RobustBitConfig.DEFAULT_VALUE) ? (MPViewGroup) PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "c5b9cc5ebc2ad2c164d3c850d231d231") : (MPViewGroup) kVar.a(str, new com.meituan.msc.views.precreate.a<MPViewGroup>() { // from class: com.meituan.msc.modules.engine.k.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.views.precreate.a
            public final /* synthetic */ MPViewGroup a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "daf3e6309bd08252e85d411acb53d45b", RobustBitConfig.DEFAULT_VALUE) ? (MPViewGroup) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "daf3e6309bd08252e85d411acb53d45b") : new MPViewGroup(themedReactContext);
            }

            @Override // com.meituan.msc.views.precreate.a
            public final /* synthetic */ MPViewGroup a(final com.meituan.msc.views.precreate.c cVar) {
                Object[] objArr3 = {cVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "04996a86c95c5a7f401895db5f32f9d8", RobustBitConfig.DEFAULT_VALUE)) {
                    return (MPViewGroup) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "04996a86c95c5a7f401895db5f32f9d8");
                }
                final ThemedReactContext themedReactContext2 = themedReactContext;
                Object[] objArr4 = {themedReactContext2};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.views.precreate.c.a;
                return PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "e01cc71bd7654909ce4ac6a1ae26d745", RobustBitConfig.DEFAULT_VALUE) ? (MPViewGroup) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "e01cc71bd7654909ce4ac6a1ae26d745") : (MPViewGroup) cVar.a(themedReactContext2, new c.a<MPViewGroup>() { // from class: com.meituan.msc.views.precreate.c.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final /* synthetic */ MPViewGroup b() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9215ca60a2541cb9eadcd5ac72b51488", RobustBitConfig.DEFAULT_VALUE) ? (MPViewGroup) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9215ca60a2541cb9eadcd5ac72b51488") : new MPViewGroup(themedReactContext2);
                    }

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final /* synthetic */ MPViewGroup c() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "df3ba8c5d18360c312c81bc9d58a57ff", RobustBitConfig.DEFAULT_VALUE) ? (MPViewGroup) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "df3ba8c5d18360c312c81bc9d58a57ff") : (MPViewGroup) cVar.a(cVar.L);
                    }

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final void a() {
                        c.c++;
                    }
                });
            }
        });
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public MPRoundImageView tryGetMPImageView(final ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cdf5dc19523b1d7457f4cddc78372f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPRoundImageView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cdf5dc19523b1d7457f4cddc78372f6");
        }
        final com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) this.d.c(com.meituan.msc.modules.engine.k.class);
        if (kVar == null) {
            return new MPRoundImageView(themedReactContext);
        }
        String str = this.k.a;
        Object[] objArr2 = {str, themedReactContext};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.engine.k.a;
        return PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "7502988e9bc2daffac1d4cb02a5e98b6", RobustBitConfig.DEFAULT_VALUE) ? (MPRoundImageView) PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "7502988e9bc2daffac1d4cb02a5e98b6") : (MPRoundImageView) kVar.a(str, new com.meituan.msc.views.precreate.a<MPRoundImageView>() { // from class: com.meituan.msc.modules.engine.k.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.views.precreate.a
            public final /* synthetic */ MPRoundImageView a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7732c6d7a73772302d3680c2c302a20d", RobustBitConfig.DEFAULT_VALUE) ? (MPRoundImageView) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7732c6d7a73772302d3680c2c302a20d") : new MPRoundImageView(themedReactContext);
            }

            @Override // com.meituan.msc.views.precreate.a
            public final /* synthetic */ MPRoundImageView a(final com.meituan.msc.views.precreate.c cVar) {
                Object[] objArr3 = {cVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "80badac5f08d6afd637b301b5634d8ab", RobustBitConfig.DEFAULT_VALUE)) {
                    return (MPRoundImageView) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "80badac5f08d6afd637b301b5634d8ab");
                }
                final ThemedReactContext themedReactContext2 = themedReactContext;
                Object[] objArr4 = {themedReactContext2};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.views.precreate.c.a;
                return PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "57ed48e0295f24fb3fb8616297693787", RobustBitConfig.DEFAULT_VALUE) ? (MPRoundImageView) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "57ed48e0295f24fb3fb8616297693787") : (MPRoundImageView) cVar.a(themedReactContext2, new c.a<MPRoundImageView>() { // from class: com.meituan.msc.views.precreate.c.4
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final /* synthetic */ MPRoundImageView b() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "92461f861910a091abc67965dc195de4", RobustBitConfig.DEFAULT_VALUE) ? (MPRoundImageView) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "92461f861910a091abc67965dc195de4") : new MPRoundImageView(themedReactContext2);
                    }

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final /* synthetic */ MPRoundImageView c() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "891ab4270b7a4731b8879f7146aee2a2", RobustBitConfig.DEFAULT_VALUE) ? (MPRoundImageView) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "891ab4270b7a4731b8879f7146aee2a2") : (MPRoundImageView) cVar.a(cVar.P);
                    }

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final void a() {
                        c.g++;
                    }
                });
            }
        });
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public MPTextView tryGetMPTextView(final ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97dbfda34503001bb4d26cfee8bb1078", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97dbfda34503001bb4d26cfee8bb1078");
        }
        final com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) this.d.c(com.meituan.msc.modules.engine.k.class);
        if (kVar == null) {
            return new MPTextView(themedReactContext);
        }
        String str = this.k.a;
        Object[] objArr2 = {str, themedReactContext};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.engine.k.a;
        return PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "5253a542227602b1b778a4eaeb773929", RobustBitConfig.DEFAULT_VALUE) ? (MPTextView) PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "5253a542227602b1b778a4eaeb773929") : (MPTextView) kVar.a(str, new com.meituan.msc.views.precreate.a<MPTextView>() { // from class: com.meituan.msc.modules.engine.k.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.views.precreate.a
            public final /* synthetic */ MPTextView a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b34e3f4b18191b2d7e78fcb34fe3e6d9", RobustBitConfig.DEFAULT_VALUE) ? (MPTextView) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b34e3f4b18191b2d7e78fcb34fe3e6d9") : new MPTextView(themedReactContext);
            }

            @Override // com.meituan.msc.views.precreate.a
            public final /* synthetic */ MPTextView a(final com.meituan.msc.views.precreate.c cVar) {
                Object[] objArr3 = {cVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fb9d5673524981ad66221e0f63e11c61", RobustBitConfig.DEFAULT_VALUE)) {
                    return (MPTextView) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fb9d5673524981ad66221e0f63e11c61");
                }
                final ThemedReactContext themedReactContext2 = themedReactContext;
                Object[] objArr4 = {themedReactContext2};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.views.precreate.c.a;
                return PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "93cf6adb79349d0d8bb285921c5877f8", RobustBitConfig.DEFAULT_VALUE) ? (MPTextView) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "93cf6adb79349d0d8bb285921c5877f8") : (MPTextView) cVar.a(themedReactContext2, new c.a<MPTextView>() { // from class: com.meituan.msc.views.precreate.c.3
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final /* synthetic */ MPTextView b() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "860bec87f091bc4fbf94f34348e284e1", RobustBitConfig.DEFAULT_VALUE) ? (MPTextView) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "860bec87f091bc4fbf94f34348e284e1") : new MPTextView(themedReactContext2);
                    }

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final /* synthetic */ MPTextView c() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a8568912f71c7cbf95a2067c0062b578", RobustBitConfig.DEFAULT_VALUE) ? (MPTextView) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a8568912f71c7cbf95a2067c0062b578") : (MPTextView) cVar.a(cVar.M);
                    }

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final void a() {
                        c.e++;
                    }
                });
            }
        });
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public MPLeafTextView tryGetMPLeafTextView(final ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8caa68c6b008ff6f3bd92b98a995e11", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPLeafTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8caa68c6b008ff6f3bd92b98a995e11");
        }
        final com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) this.d.c(com.meituan.msc.modules.engine.k.class);
        if (kVar == null) {
            return new MPLeafTextView(themedReactContext);
        }
        String str = this.k.a;
        Object[] objArr2 = {str, themedReactContext};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.engine.k.a;
        return PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "39a059d24f3b8e72e333e497a9ddf9bf", RobustBitConfig.DEFAULT_VALUE) ? (MPLeafTextView) PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "39a059d24f3b8e72e333e497a9ddf9bf") : (MPLeafTextView) kVar.a(str, new com.meituan.msc.views.precreate.a<MPLeafTextView>() { // from class: com.meituan.msc.modules.engine.k.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.views.precreate.a
            public final /* synthetic */ MPLeafTextView a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2af38860aae2e3aedb5116f24faff92d", RobustBitConfig.DEFAULT_VALUE) ? (MPLeafTextView) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2af38860aae2e3aedb5116f24faff92d") : new MPLeafTextView(themedReactContext);
            }

            @Override // com.meituan.msc.views.precreate.a
            public final /* synthetic */ MPLeafTextView a(final com.meituan.msc.views.precreate.c cVar) {
                Object[] objArr3 = {cVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fdba1865c41401a02067324f00d8811a", RobustBitConfig.DEFAULT_VALUE)) {
                    return (MPLeafTextView) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fdba1865c41401a02067324f00d8811a");
                }
                final ThemedReactContext themedReactContext2 = themedReactContext;
                Object[] objArr4 = {themedReactContext2};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.views.precreate.c.a;
                return PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "544451edac937b35a0e876a31531e4e9", RobustBitConfig.DEFAULT_VALUE) ? (MPLeafTextView) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "544451edac937b35a0e876a31531e4e9") : (MPLeafTextView) cVar.a(themedReactContext2, new c.a<MPLeafTextView>() { // from class: com.meituan.msc.views.precreate.c.5
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final /* synthetic */ MPLeafTextView b() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ce4906008a6197253d6aa9a467bfc6ae", RobustBitConfig.DEFAULT_VALUE) ? (MPLeafTextView) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ce4906008a6197253d6aa9a467bfc6ae") : new MPLeafTextView(themedReactContext2);
                    }

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final /* synthetic */ MPLeafTextView c() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2572da1e529969d356a67443d88b45be", RobustBitConfig.DEFAULT_VALUE) ? (MPLeafTextView) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2572da1e529969d356a67443d88b45be") : (MPLeafTextView) cVar.a(cVar.N);
                    }

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final void a() {
                        c.q++;
                    }
                });
            }
        });
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public MPInlineBlockTextView tryGetMPInlineBlockTextView(final ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "360b4c4d1d2300c72b5e793d045c4b51", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPInlineBlockTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "360b4c4d1d2300c72b5e793d045c4b51");
        }
        final com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) this.d.c(com.meituan.msc.modules.engine.k.class);
        if (kVar == null) {
            return new MPInlineBlockTextView(themedReactContext);
        }
        String str = this.k.a;
        Object[] objArr2 = {str, themedReactContext};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.engine.k.a;
        return PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "a01aca248cd0229e03c930eccaad527b", RobustBitConfig.DEFAULT_VALUE) ? (MPInlineBlockTextView) PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "a01aca248cd0229e03c930eccaad527b") : (MPInlineBlockTextView) kVar.a(str, new com.meituan.msc.views.precreate.a<MPInlineBlockTextView>() { // from class: com.meituan.msc.modules.engine.k.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.views.precreate.a
            public final /* synthetic */ MPInlineBlockTextView a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fda0305649f6e81635df1e71864a7c94", RobustBitConfig.DEFAULT_VALUE) ? (MPInlineBlockTextView) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fda0305649f6e81635df1e71864a7c94") : new MPInlineBlockTextView(themedReactContext);
            }

            @Override // com.meituan.msc.views.precreate.a
            public final /* synthetic */ MPInlineBlockTextView a(final com.meituan.msc.views.precreate.c cVar) {
                Object[] objArr3 = {cVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "35fbfda2ed8cb42270c099cb6edc43a5", RobustBitConfig.DEFAULT_VALUE)) {
                    return (MPInlineBlockTextView) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "35fbfda2ed8cb42270c099cb6edc43a5");
                }
                final ThemedReactContext themedReactContext2 = themedReactContext;
                Object[] objArr4 = {themedReactContext2};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.views.precreate.c.a;
                return PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "3dce16a9c7677c9da9476d6d641a15f1", RobustBitConfig.DEFAULT_VALUE) ? (MPInlineBlockTextView) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "3dce16a9c7677c9da9476d6d641a15f1") : (MPInlineBlockTextView) cVar.a(themedReactContext2, new c.a<MPInlineBlockTextView>() { // from class: com.meituan.msc.views.precreate.c.6
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final /* synthetic */ MPInlineBlockTextView b() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a46d35bd297defe6bf6ba82366f23435", RobustBitConfig.DEFAULT_VALUE) ? (MPInlineBlockTextView) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a46d35bd297defe6bf6ba82366f23435") : new MPInlineBlockTextView(themedReactContext2);
                    }

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final /* synthetic */ MPInlineBlockTextView c() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5447a1810e3601cf03f2db79990c671d", RobustBitConfig.DEFAULT_VALUE) ? (MPInlineBlockTextView) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5447a1810e3601cf03f2db79990c671d") : (MPInlineBlockTextView) cVar.a(cVar.O);
                    }

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final void a() {
                        c.s++;
                    }
                });
            }
        });
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public SwiperShellView tryGetMPSwiperView(final ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3218291ac62c95b35ac7e3e792eb6f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (SwiperShellView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3218291ac62c95b35ac7e3e792eb6f9");
        }
        final com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) this.d.c(com.meituan.msc.modules.engine.k.class);
        if (kVar == null) {
            return new SwiperShellView(themedReactContext);
        }
        String str = this.k.a;
        Object[] objArr2 = {str, themedReactContext};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.engine.k.a;
        return PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "4bb08f4453a962f5c9f914832a341fab", RobustBitConfig.DEFAULT_VALUE) ? (SwiperShellView) PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "4bb08f4453a962f5c9f914832a341fab") : (SwiperShellView) kVar.a(str, new com.meituan.msc.views.precreate.a<SwiperShellView>() { // from class: com.meituan.msc.modules.engine.k.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.views.precreate.a
            public final /* synthetic */ SwiperShellView a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3a6decee45e92acfa89b41e3fefffea7", RobustBitConfig.DEFAULT_VALUE) ? (SwiperShellView) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3a6decee45e92acfa89b41e3fefffea7") : new SwiperShellView(themedReactContext);
            }

            @Override // com.meituan.msc.views.precreate.a
            public final /* synthetic */ SwiperShellView a(final com.meituan.msc.views.precreate.c cVar) {
                Object[] objArr3 = {cVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3f73131c62e34f670bb51575afcae658", RobustBitConfig.DEFAULT_VALUE)) {
                    return (SwiperShellView) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3f73131c62e34f670bb51575afcae658");
                }
                final ThemedReactContext themedReactContext2 = themedReactContext;
                Object[] objArr4 = {themedReactContext2};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.views.precreate.c.a;
                return PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "17de7f009fb4f2594bbe288972c917b6", RobustBitConfig.DEFAULT_VALUE) ? (SwiperShellView) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "17de7f009fb4f2594bbe288972c917b6") : (SwiperShellView) cVar.a(themedReactContext2, new c.a<SwiperShellView>() { // from class: com.meituan.msc.views.precreate.c.7
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final /* synthetic */ SwiperShellView b() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a7d90365c3c5932713ff08a9a8c5bdd7", RobustBitConfig.DEFAULT_VALUE) ? (SwiperShellView) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a7d90365c3c5932713ff08a9a8c5bdd7") : new SwiperShellView(themedReactContext2);
                    }

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final /* synthetic */ SwiperShellView c() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "95ca89f3631b0acec025db10ed8201af", RobustBitConfig.DEFAULT_VALUE) ? (SwiperShellView) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "95ca89f3631b0acec025db10ed8201af") : (SwiperShellView) cVar.a(cVar.U);
                    }

                    @Override // com.meituan.msc.views.precreate.c.a
                    public final void a() {
                        c.m++;
                    }
                });
            }
        });
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean enableJSErrorFix() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd365cdd0784f0f6873988bfc0b29074", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd365cdd0784f0f6873988bfc0b29074")).booleanValue() : MSCRenderConfig.q();
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean isPreCreateShadows() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68cb30fc87c153fb85a1d5c4c00f80ef", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68cb30fc87c153fb85a1d5c4c00f80ef")).booleanValue() : MSCRenderConfig.r();
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean enableTextMeasureOpt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb01bbe1e4357aa20459603a6e5ca47c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb01bbe1e4357aa20459603a6e5ca47c")).booleanValue() : MSCRenderConfig.s();
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean enableVNodeErrorFix() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924552e26ae0994fc42e5792853e5fb4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924552e26ae0994fc42e5792853e5fb4")).booleanValue() : MSCRenderConfig.t();
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public IFileModule getFileModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e16dd48aaf5fc6404853fced724390ac", RobustBitConfig.DEFAULT_VALUE) ? (IFileModule) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e16dd48aaf5fc6404853fced724390ac") : (IFileModule) this.d.c(IFileModule.class);
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public boolean hasActiveCatalystInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "130d6165f1e8135755898395e6b1e46d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "130d6165f1e8135755898395e6b1e46d")).booleanValue();
        }
        com.meituan.msc.modules.service.i iVar = this.h;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.service.i.a;
        return PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "76fbd20cee131627c4a8a949df110368", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "76fbd20cee131627c4a8a949df110368")).booleanValue() : (iVar.d == null || iVar.d.isDestroyed()) ? false : true;
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public String getCssFileContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05d1caf7c56114fc200914d51e70c455", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05d1caf7c56114fc200914d51e70c455");
        }
        String str = this.k.a;
        if (TextUtils.isEmpty(str)) {
            com.meituan.msc.modules.reporter.g.a(this.m, "[getCssFileContent] pagePath null!");
            return "";
        }
        String c = c(str);
        if (TextUtils.isEmpty(c)) {
            com.meituan.msc.modules.reporter.g.a(this.m, "[getCssFileContent] packagePath null!");
            return "";
        }
        String str2 = str.split("\\?")[0] + ".css";
        String fileContent = getFileContent(new DioFile(c, str2));
        if (TextUtils.isEmpty(fileContent)) {
            com.meituan.msc.modules.reporter.g.b(this.m, null, "[getCssFileContent] cssFileContent null! packagePath: ", c, ",cssFilePath: ", str2);
        }
        return fileContent;
    }

    @Override // com.meituan.msc.jse.bridge.IRuntimeDelegate
    public String getCssParserKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54f4760ce63b9a962152c09084e1acd6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54f4760ce63b9a962152c09084e1acd6");
        }
        String str = this.k.a;
        if (TextUtils.isEmpty(str)) {
            com.meituan.msc.modules.reporter.g.a(this.m, "[getCssParserKey pagePath null");
            return null;
        }
        return c(str) + am.b(str);
    }
}
