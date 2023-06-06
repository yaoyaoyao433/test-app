package com.sankuai.meituan.mtliveqos.utils;

import com.meituan.metrics.Metrics;
import com.meituan.metrics.interceptor.MetricsInterceptor;
import com.meituan.metrics.model.AbstractEvent;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    private static final String b = "a";
    private double c;
    private double d;
    private boolean e;
    private List<InterfaceC0621a> f;
    private final MetricsInterceptor g;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mtliveqos.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0621a {
        void a(double d, double d2);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "715aa0d5f89a2d72372a0f05c5ea2ea2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "715aa0d5f89a2d72372a0f05c5ea2ea2");
            return;
        }
        this.c = -1.0d;
        this.d = -1.0d;
        this.f = new ArrayList();
        this.g = new MetricsInterceptor() { // from class: com.sankuai.meituan.mtliveqos.utils.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.metrics.interceptor.MetricsInterceptor
            public final void onNewEvent(AbstractEvent abstractEvent) {
                Object[] objArr2 = {abstractEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1b638a24864cb78c24fde3f82436e41", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1b638a24864cb78c24fde3f82436e41");
                    return;
                }
                String unused = a.b;
                new StringBuilder("onNewEvent event: ").append(abstractEvent);
                if (abstractEvent == null || !(abstractEvent instanceof FpsEvent)) {
                    return;
                }
                FpsEvent fpsEvent = (FpsEvent) abstractEvent;
                synchronized (a.this) {
                    a.this.c = fpsEvent.getAvgFps();
                    a.this.d = fpsEvent.getMinFps();
                    a.this.h();
                }
            }

            @Override // com.meituan.metrics.interceptor.MetricsInterceptor
            public final void onReportEvent(AbstractEvent abstractEvent) {
                Object[] objArr2 = {abstractEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d8f4478acdf65815e7ef3607dd024e0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d8f4478acdf65815e7ef3607dd024e0");
                    return;
                }
                String unused = a.b;
                new StringBuilder("onReportEvent event: ").append(abstractEvent);
            }
        };
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3710f97618b7468c744790d36d1566d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3710f97618b7468c744790d36d1566d8");
        } else {
            Metrics.getInstance().addInterceptor(this.g);
        }
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b09c79e1e7c77ff90b76599d889bb1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b09c79e1e7c77ff90b76599d889bb1c");
        } else {
            Metrics.getInstance().getInterceptorChain().removeInterceptor(this.g);
        }
    }

    public final synchronized void a(InterfaceC0621a interfaceC0621a) {
        Object[] objArr = {interfaceC0621a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2885e7b2a0f5f117a3024a273aa98dcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2885e7b2a0f5f117a3024a273aa98dcc");
        } else if (interfaceC0621a == null) {
        } else {
            if (this.f.contains(interfaceC0621a)) {
                return;
            }
            this.f.add(interfaceC0621a);
        }
    }

    public final synchronized void b(InterfaceC0621a interfaceC0621a) {
        Object[] objArr = {interfaceC0621a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eefc56e9a1990d8484d16432ca2ad3f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eefc56e9a1990d8484d16432ca2ad3f5");
        } else if (interfaceC0621a == null) {
        } else {
            if (this.f.contains(interfaceC0621a)) {
                this.f.remove(interfaceC0621a);
            }
        }
    }

    public final synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cccbb1e65955ea08efd1d2579f1076a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cccbb1e65955ea08efd1d2579f1076a0");
        } else if (this.e) {
        } else {
            this.d = -1.0d;
            this.c = -1.0d;
            this.e = true;
            Metrics.getInstance().startCustomFPS("mtlive_mlive_fps");
        }
    }

    public final synchronized void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89da95854f79bcf85a7073ef632804b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89da95854f79bcf85a7073ef632804b2");
        } else if (this.e) {
            this.e = false;
            Metrics.getInstance().stopCustomFPS("mtlive_mlive_fps");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "183cd5b3ef03e1609764747ac9cde129", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "183cd5b3ef03e1609764747ac9cde129");
            return;
        }
        if (this.f != null) {
            for (InterfaceC0621a interfaceC0621a : this.f) {
                interfaceC0621a.a(this.c, this.d);
            }
        }
    }

    public final synchronized double e() {
        return this.c;
    }

    public final synchronized double f() {
        return this.d;
    }
}
