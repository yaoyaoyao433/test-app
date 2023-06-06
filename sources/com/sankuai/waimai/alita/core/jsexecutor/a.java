package com.sankuai.waimai.alita.core.jsexecutor;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private ScheduledExecutorService b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fab88d89d69ca305d92898f45a05bbc1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fab88d89d69ca305d92898f45a05bbc1");
        } else {
            this.b = com.sankuai.android.jarvis.c.c("alita_callback_thread_pool");
        }
    }

    public final synchronized void a(final com.sankuai.waimai.alita.core.engine.h hVar, @Nullable final String str, @Nullable final AlitaJSValue alitaJSValue) {
        Object[] objArr = {hVar, str, alitaJSValue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c8985f94390a5dd31cf59b736c025f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c8985f94390a5dd31cf59b736c025f4");
            return;
        }
        if (this.b != null) {
            this.b.execute(new Runnable() { // from class: com.sankuai.waimai.alita.core.jsexecutor.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9200768e600c029aaea2c492414770a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9200768e600c029aaea2c492414770a");
                        return;
                    }
                    try {
                        hVar.a(str, alitaJSValue);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public final synchronized void a(final com.sankuai.waimai.alita.core.engine.h hVar, @Nullable final Exception exc) {
        Object[] objArr = {hVar, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c61177cb2e64e0175b4972375071b362", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c61177cb2e64e0175b4972375071b362");
            return;
        }
        if (this.b != null) {
            this.b.execute(new Runnable() { // from class: com.sankuai.waimai.alita.core.jsexecutor.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e524103cad373a9931d2cd0cfee07c1c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e524103cad373a9931d2cd0cfee07c1c");
                        return;
                    }
                    try {
                        hVar.a(exc);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }
}
