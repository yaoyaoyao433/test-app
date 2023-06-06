package com.meituan.android.neohybrid.v2.neo.plugin;

import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.d;
import android.arch.lifecycle.e;
import android.arch.lifecycle.f;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import com.meituan.android.neohybrid.core.horn.bean.NeoHornConfig;
import com.meituan.android.neohybrid.neo.report.b;
import com.meituan.android.neohybrid.protocol.kernel.c;
import com.meituan.android.neohybrid.protocol.kernel.d;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.meituan.android.neohybrid.v2.neo.a {
    public static ChangeQuickRedirect d;

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final String h() {
        return "render_process_gone_plugin";
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44639b615b2586ba725252268d405cfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44639b615b2586ba725252268d405cfc");
            return;
        }
        super.a(view);
        d c = this.b.b().c();
        if (c != null && TextUtils.isEmpty(this.b.j())) {
            c.a(new AnonymousClass1());
        } else {
            this.c = true;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.v2.neo.plugin.a$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends com.meituan.android.neohybrid.framework.webcompat.a {
        public static ChangeQuickRedirect a;

        public AnonymousClass1() {
        }

        @Override // com.meituan.android.neohybrid.framework.webcompat.a, com.meituan.android.neohybrid.protocol.kernel.d
        public final boolean a(c cVar, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str;
            String str2;
            Object[] objArr = {cVar, renderProcessGoneDetail};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8640f756c8d3406bbde38e7774b0ffc", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8640f756c8d3406bbde38e7774b0ffc")).booleanValue();
            }
            final String renderProcessGoneOptions = ((NeoHornConfig) com.meituan.android.neohybrid.core.horn.a.a().a(NeoHornConfig.class)).getRenderProcessGoneOptions();
            if (renderProcessGoneOptions == null) {
                return false;
            }
            if (a.this.b.d() == null) {
                str = LaunchMode.LAUNCH_MODE_PRELOAD;
                if ("recreate".equals(renderProcessGoneOptions) || "downgrade".equals(renderProcessGoneOptions)) {
                    com.meituan.android.neohybrid.v2.neo.nsr.a.a(a.this.b);
                }
            } else if (!a.this.b.getLifecycle().a().a(d.b.RESUMED)) {
                str = "invisible";
                a.this.b.getLifecycle().a(new e() { // from class: com.meituan.android.neohybrid.v2.neo.plugin.RenderProcessGonePlugin$1$1
                    public static ChangeQuickRedirect a;

                    @OnLifecycleEvent(d.a.ON_RESUME)
                    private void onResume(f fVar) {
                        com.meituan.android.neohybrid.v2.core.a aVar;
                        com.meituan.android.neohybrid.v2.core.a aVar2;
                        Object[] objArr2 = {fVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a877b215eab0e07087c8d354e00a8317", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a877b215eab0e07087c8d354e00a8317");
                            return;
                        }
                        if ("recreate".equals(renderProcessGoneOptions)) {
                            aVar2 = a.this.b;
                            aVar2.d().recreate();
                        } else if ("downgrade".equals(renderProcessGoneOptions)) {
                            aVar = a.this.b;
                            aVar.a("downgrade_render_process_gone");
                        }
                        fVar.getLifecycle().b(this);
                    }
                });
            } else {
                str = "visible";
                if ("recreate".equals(renderProcessGoneOptions)) {
                    a.this.b.d().recreate();
                } else if ("downgrade".equals(renderProcessGoneOptions)) {
                    a.this.b.a("downgrade_render_process_gone");
                }
            }
            String str3 = null;
            if (Build.VERSION.SDK_INT < 26 || renderProcessGoneDetail == null) {
                str2 = null;
            } else {
                str3 = String.valueOf(renderProcessGoneDetail.didCrash());
                str2 = String.valueOf(renderProcessGoneDetail.rendererPriorityAtExit());
            }
            b.c("RenderProcessGonePlugin", "onRenderProcessGone", new com.meituan.android.neohybrid.neo.report.a().a("flag", str).a("didCrash", str3).a("rendererPriorityAtExit", str2).b);
            return true;
        }
    }
}
