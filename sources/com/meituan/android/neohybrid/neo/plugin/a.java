package com.meituan.android.neohybrid.neo.plugin;

import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.d;
import android.arch.lifecycle.e;
import android.arch.lifecycle.f;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.meituan.android.neohybrid.core.horn.bean.NeoHornConfig;
import com.meituan.android.neohybrid.neo.nsr.b;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.meituan.android.neohybrid.neo.a {
    public static ChangeQuickRedirect d;

    @Override // com.meituan.android.neohybrid.neo.a
    public final String h() {
        return "render_process_gone_plugin";
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3947d0150bdb4401bcf778d87b61a61f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3947d0150bdb4401bcf778d87b61a61f");
            return;
        }
        super.a(view);
        com.meituan.android.neohybrid.neo.adapter.a i = this.b.i();
        if (i != null && TextUtils.isEmpty(this.b.k())) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            Object[] objArr2 = {anonymousClass1};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.neo.adapter.a.a;
            if (PatchProxy.isSupport(objArr2, i, changeQuickRedirect2, false, "f01efbb963fac0454da7378c04f1b99c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, i, changeQuickRedirect2, false, "f01efbb963fac0454da7378c04f1b99c");
                return;
            } else {
                i.b.add(anonymousClass1);
                return;
            }
        }
        this.c = true;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.neo.plugin.a$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends WebViewClient {
        public static ChangeQuickRedirect a;

        public AnonymousClass1() {
        }

        @Override // android.webkit.WebViewClient
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str;
            String str2;
            Object[] objArr = {webView, renderProcessGoneDetail};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97087569116fc8d750792ae0714a58a6", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97087569116fc8d750792ae0714a58a6")).booleanValue();
            }
            final String renderProcessGoneOptions = ((NeoHornConfig) com.meituan.android.neohybrid.core.horn.a.a().a(NeoHornConfig.class)).getRenderProcessGoneOptions();
            if (renderProcessGoneOptions == null) {
                return false;
            }
            if (a.this.b.d() == null) {
                str = LaunchMode.LAUNCH_MODE_PRELOAD;
                if ("recreate".equals(renderProcessGoneOptions) || "downgrade".equals(renderProcessGoneOptions)) {
                    b.a(a.this.b);
                }
            } else if (!a.this.b.getLifecycle().a().a(d.b.RESUMED)) {
                str = "invisible";
                a.this.b.getLifecycle().a(new e() { // from class: com.meituan.android.neohybrid.neo.plugin.RenderProcessGonePlugin$1$1
                    public static ChangeQuickRedirect a;

                    @OnLifecycleEvent(d.a.ON_RESUME)
                    private void onResume(f fVar) {
                        com.meituan.android.neohybrid.core.a aVar;
                        com.meituan.android.neohybrid.core.a aVar2;
                        Object[] objArr2 = {fVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8bb409021f8f641d80073f35b477cbb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8bb409021f8f641d80073f35b477cbb");
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
            com.meituan.android.neohybrid.neo.report.b.c("RenderProcessGonePlugin", "onRenderProcessGone", new com.meituan.android.neohybrid.neo.report.a().a("flag", str).a("didCrash", str3).a("rendererPriorityAtExit", str2).b);
            return true;
        }
    }
}
