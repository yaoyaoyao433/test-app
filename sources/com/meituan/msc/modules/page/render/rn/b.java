package com.meituan.msc.modules.page.render.rn;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.msc.csslib.CSSParserNative;
import com.meituan.msc.devsupport.perf.RenderPerf;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.manager.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends g {
    public static ChangeQuickRedirect m;
    protected com.meituan.msc.modules.viewmanager.c n;
    protected com.meituan.msc.modules.viewmanager.e o;
    protected com.meituan.msc.modules.viewmanager.a p;
    protected com.meituan.msc.modules.viewmanager.d q;
    protected com.meituan.msc.modules.viewmanager.f r;
    protected com.meituan.msc.modules.viewmanager.b s;

    @Override // com.meituan.msc.modules.page.render.f
    public final com.meituan.msc.b n() {
        return com.meituan.msc.b.NATIVE;
    }

    @Override // com.meituan.msc.modules.page.render.rn.g, com.meituan.msc.modules.page.render.d
    public final Set<k> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27323095ce0012e7819db6f130dacbf6", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27323095ce0012e7819db6f130dacbf6") : com.meituan.msc.common.utils.f.a(this.v, this.n, this.o, this.p, this.q, this.r, this.s);
    }

    @Override // com.meituan.msc.modules.page.render.rn.g, com.meituan.msc.modules.page.render.d, com.meituan.msc.modules.page.render.f
    public final void a(Context context, com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52103dd56efa6aebd0253f5b0706fda2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52103dd56efa6aebd0253f5b0706fda2");
            return;
        }
        super.a(context, hVar);
        this.n = new com.meituan.msc.modules.viewmanager.c(this.w);
        this.o = new com.meituan.msc.modules.viewmanager.e(this.w);
        this.p = new com.meituan.msc.modules.viewmanager.a(this.w);
        this.q = new com.meituan.msc.modules.viewmanager.d(this.w);
        this.r = new com.meituan.msc.modules.viewmanager.f(this.w);
        this.s = new com.meituan.msc.modules.viewmanager.b(this.w);
    }

    @Override // com.meituan.msc.modules.page.render.rn.g, com.meituan.msc.modules.page.render.d, com.meituan.msc.modules.page.render.g
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "229c4326d64f2e20dd4e41a4f6eb3483", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "229c4326d64f2e20dd4e41a4f6eb3483");
            return;
        }
        super.l();
        if (this.p != null) {
            com.meituan.msc.modules.viewmanager.a aVar = this.p;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.viewmanager.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "c2c0ba90803e474ad7c869966d344f54", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "c2c0ba90803e474ad7c869966d344f54");
                return;
            }
            aVar.c = false;
            com.meituan.msc.modules.reporter.g.d("[MSCAnimationModule@onShow]", " mPendingTasks size: " + aVar.d.size());
            if (aVar.d.isEmpty()) {
                return;
            }
            Iterator<Runnable> it = aVar.d.iterator();
            while (it.hasNext()) {
                aVar.b.runOnNativeModulesQueueThread(it.next());
            }
            aVar.d.clear();
        }
    }

    @Override // com.meituan.msc.modules.page.render.rn.g, com.meituan.msc.modules.page.render.g
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae822118b8f5f838539dc055453ae28c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae822118b8f5f838539dc055453ae28c");
            return;
        }
        if (this.p != null) {
            com.meituan.msc.modules.viewmanager.a aVar = this.p;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.viewmanager.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ee2e9238daa927394ba359200227548e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ee2e9238daa927394ba359200227548e");
            } else {
                aVar.c = true;
                com.meituan.msc.modules.reporter.g.d("[MSCAnimationModule@onHide]", "clear render style");
            }
        }
        super.q();
    }

    @Override // com.meituan.msc.modules.page.render.rn.g, com.meituan.msc.modules.page.render.d
    public final void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4db92c5accad9c768d1895b045f2d10a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4db92c5accad9c768d1895b045f2d10a");
            return;
        }
        super.a(str);
        ((com.meituan.msc.modules.engine.a) this.d.c(com.meituan.msc.modules.engine.a.class)).a(new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f79c49357d49fd839441acfd5e6e574", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f79c49357d49fd839441acfd5e6e574");
                    return;
                }
                final String cssParserKey = b.this.getCssParserKey();
                if (cssParserKey == null) {
                    com.meituan.msc.modules.reporter.g.b("[MPRenderer@loadPage] ", null, "cssFilePath: null pagePath: ", str);
                    return;
                }
                CSSParserNative.a();
                long currentTimeMillis = System.currentTimeMillis();
                CSSParserNative.a(cssParserKey, new CSSParserNative.a() { // from class: com.meituan.msc.modules.page.render.rn.b.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.msc.csslib.CSSParserNative.a
                    public final String a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c0ae00f76d633279995dd05914871cda", RobustBitConfig.DEFAULT_VALUE)) {
                            return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c0ae00f76d633279995dd05914871cda");
                        }
                        String cssFileContent = b.this.getCssFileContent();
                        if (TextUtils.isEmpty(cssFileContent)) {
                            com.meituan.msc.modules.reporter.g.b("[MPRenderer@read] ", null, "cssFileContent null, pagePath: ", str, ",cssFilePath: ", cssParserKey);
                        }
                        return cssFileContent;
                    }
                });
                com.meituan.msc.modules.reporter.g.d("[NativeRenderer@loadPage]", String.format(Locale.getDefault(), "parseCss pagePath:%s,cssFilePath:%s,cost:%d", str, cssParserKey, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                RenderPerf renderPerf = b.this.getRenderPerf();
                if (renderPerf != null) {
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    Object[] objArr3 = {new Long(currentTimeMillis2)};
                    ChangeQuickRedirect changeQuickRedirect3 = RenderPerf.a;
                    if (PatchProxy.isSupport(objArr3, renderPerf, changeQuickRedirect3, false, "635f142cab63a34d3bc0b5283570f778", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, renderPerf, changeQuickRedirect3, false, "635f142cab63a34d3bc0b5283570f778");
                    } else {
                        renderPerf.e = currentTimeMillis2;
                    }
                }
            }
        });
    }

    @Override // com.meituan.msc.modules.page.render.rn.g, com.meituan.msc.jse.bridge.IRuntimeDelegate
    public final boolean isProdEnv() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34ee4e3b3b94aef97d74a2957fea8cfe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34ee4e3b3b94aef97d74a2957fea8cfe")).booleanValue() : MSCEnvHelper.getEnvInfo().isProdEnv();
    }

    @Override // com.meituan.msc.modules.page.render.rn.g, com.meituan.msc.jse.bridge.IRuntimeDelegate
    public final void notifyRListCreated(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f79ee6d5e6d7fb5fe90dcfd6d415d7d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f79ee6d5e6d7fb5fe90dcfd6d415d7d1");
        } else if (this.r != null) {
            this.r.a(getPageId(), i);
        }
    }
}
