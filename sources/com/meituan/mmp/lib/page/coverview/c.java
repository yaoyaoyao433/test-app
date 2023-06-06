package com.meituan.mmp.lib.page.coverview;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.google.gson.JsonObject;
import com.meituan.mmp.lib.api.coverview.e;
import com.meituan.mmp.lib.page.view.CoverViewWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends CoverViewRootContainer {
    public static ChangeQuickRedirect e;
    public com.meituan.mmp.lib.api.coverview.b f;
    public Runnable g;
    public com.meituan.mmp.lib.api.coverview.b h;
    private boolean i;

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae24ddfd47c3df8a99bb4d69674a2db5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae24ddfd47c3df8a99bb4d69674a2db5");
            return;
        }
        this.h = new com.meituan.mmp.lib.api.coverview.b() { // from class: com.meituan.mmp.lib.page.coverview.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.api.coverview.b
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afe38e988130af11cac231dabcc4b890", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afe38e988130af11cac231dabcc4b890");
                } else if (c.this.g != null || c.this.f == null) {
                } else {
                    c.this.g = new Runnable() { // from class: com.meituan.mmp.lib.page.coverview.c.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b1c53565eb0ed8e3ee034eb2975cda9f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b1c53565eb0ed8e3ee034eb2975cda9f");
                                return;
                            }
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            c.this.g = null;
                            if (c.this.f != null) {
                                c.this.f.a();
                            }
                            com.meituan.mmp.lib.trace.b.a("InfoWindowRootContainer onChange run", this, "cost", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        }
                    };
                    com.meituan.mmp.lib.executor.a.a(c.this.g, 100L);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a99b999c690d4e03b4daea7cec9d3afd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a99b999c690d4e03b4daea7cec9d3afd")).booleanValue();
        }
        if (this.i && motionEvent.getAction() == 0) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.meituan.mmp.lib.page.coverview.CoverViewRootContainer
    public final boolean a(View view, JSONObject jSONObject) {
        Object[] objArr = {view, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94dbe1285da231dd63c30e6b5fd64cae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94dbe1285da231dd63c30e6b5fd64cae")).booleanValue();
        }
        if (view instanceof e) {
            ((e) view).a(this.f);
        }
        return super.a(view, jSONObject);
    }

    @Override // com.meituan.mmp.lib.page.coverview.CoverViewRootContainer
    public final boolean a(View view, JsonObject jsonObject) {
        Object[] objArr = {view, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "177cbf7628bd57bb03a8fd1a43088beb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "177cbf7628bd57bb03a8fd1a43088beb")).booleanValue();
        }
        if (view instanceof e) {
            ((e) view).a(this.f);
        }
        return super.a(view, jsonObject);
    }

    @Override // com.meituan.mmp.lib.page.coverview.CoverViewRootContainer
    public final void a(CoverViewWrapper coverViewWrapper, JSONObject jSONObject) {
        Object[] objArr = {coverViewWrapper, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8895002811b2b8e6f5da41fcca0838ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8895002811b2b8e6f5da41fcca0838ab");
            return;
        }
        super.a(coverViewWrapper, jSONObject);
        setUpdateUpdateObserverInUpdateApiViewUI(coverViewWrapper);
    }

    @Override // com.meituan.mmp.lib.page.coverview.CoverViewRootContainer
    public final void a(CoverViewWrapper coverViewWrapper, JsonObject jsonObject) {
        Object[] objArr = {coverViewWrapper, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13ecb485ea7df51c7298ab496a85cbfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13ecb485ea7df51c7298ab496a85cbfe");
            return;
        }
        super.a(coverViewWrapper, jsonObject);
        setUpdateUpdateObserverInUpdateApiViewUI(coverViewWrapper);
    }

    private void setUpdateUpdateObserverInUpdateApiViewUI(CoverViewWrapper coverViewWrapper) {
        Object[] objArr = {coverViewWrapper};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43bcc7e848effb2fd82805c4b5650953", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43bcc7e848effb2fd82805c4b5650953");
            return;
        }
        e a = coverViewWrapper.a(e.class);
        if (a != null) {
            a.a(this.h);
        }
    }
}
