package com.meituan.msc.modules.page.view.coverview;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.google.gson.JsonObject;
import com.meituan.msc.modules.api.msi.components.coverview.c;
import com.meituan.msc.modules.page.view.CoverViewWrapper;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends CoverViewRootContainer {
    public static ChangeQuickRedirect e;
    public com.meituan.msc.modules.api.msi.components.coverview.a f;
    public Runnable g;
    public com.meituan.msc.modules.api.msi.components.coverview.a h;
    private boolean i;

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be27559a3ee06b4a75986b8bc7b16c98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be27559a3ee06b4a75986b8bc7b16c98");
            return;
        }
        this.h = new com.meituan.msc.modules.api.msi.components.coverview.a() { // from class: com.meituan.msc.modules.page.view.coverview.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.api.msi.components.coverview.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "deb9f8959003195cff4a9e27954f4d37", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "deb9f8959003195cff4a9e27954f4d37");
                } else if (b.this.g != null || b.this.f == null) {
                } else {
                    b.this.g = new Runnable() { // from class: com.meituan.msc.modules.page.view.coverview.b.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "33a09594345652eb2c3f9a37919d7874", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "33a09594345652eb2c3f9a37919d7874");
                                return;
                            }
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            b.this.g = null;
                            if (b.this.f != null) {
                                b.this.f.a();
                            }
                            g.b("InfoWindowRootContainer onChange run", this, "cost", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        }
                    };
                    com.meituan.msc.common.executor.a.a(b.this.g, 100L);
                }
            }
        };
        this.i = false;
    }

    public final void setInterceptTouchEvent(boolean z) {
        this.i = z;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a2309f38aa0efad543963dcaf16c50", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a2309f38aa0efad543963dcaf16c50")).booleanValue();
        }
        if (this.i && motionEvent.getAction() == 0) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.meituan.msc.modules.page.view.coverview.CoverViewRootContainer
    public final boolean a(View view, JsonObject jsonObject) {
        Object[] objArr = {view, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957a659fdbb340c50a2a5e8112a282d2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957a659fdbb340c50a2a5e8112a282d2")).booleanValue();
        }
        if (view instanceof c) {
            ((c) view).a(this.f);
        }
        return super.a(view, jsonObject);
    }

    @Override // com.meituan.msc.modules.page.view.coverview.CoverViewRootContainer
    public final void a(CoverViewWrapper coverViewWrapper, JsonObject jsonObject) {
        Object[] objArr = {coverViewWrapper, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4d23f734d811be168a29ca29787f5d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4d23f734d811be168a29ca29787f5d9");
            return;
        }
        super.a(coverViewWrapper, jsonObject);
        setUpdateUpdateObserverInUpdateApiViewUI(coverViewWrapper);
    }

    private void setUpdateUpdateObserverInUpdateApiViewUI(CoverViewWrapper coverViewWrapper) {
        Object[] objArr = {coverViewWrapper};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb5efeac3e83751779e2bda7bab63ce0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb5efeac3e83751779e2bda7bab63ce0");
            return;
        }
        c a = coverViewWrapper.a(c.class);
        if (a != null) {
            a.a(this.h);
        }
    }
}
