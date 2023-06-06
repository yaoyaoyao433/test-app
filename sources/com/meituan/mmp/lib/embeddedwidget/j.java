package com.meituan.mmp.lib.embeddedwidget;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Surface;
import com.meituan.mmp.lib.utils.ac;
import com.meituan.mtwebkit.MTValueCallback;
import com.meituan.mtwebkit.internal.hyper.SameLayerWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j implements g {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private String d;
    private int e;
    private Map f;
    private f g;
    private Surface h;
    private SameLayerWidget i;
    private Rect j;
    private int k;
    private int l;

    public j(SameLayerWidget sameLayerWidget) {
        Object[] objArr = {sameLayerWidget};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e451da3c5b19b014034ce6a81a6a8dda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e451da3c5b19b014034ce6a81a6a8dda");
        } else {
            this.i = sameLayerWidget;
        }
    }

    private void a(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "97cdaa55d8dea5292b6a6c80f41ddacf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "97cdaa55d8dea5292b6a6c80f41ddacf");
            return;
        }
        com.meituan.mmp.lib.trace.b.a("MPWidgetClient@" + hashCode(), objArr);
    }

    @Override // com.meituan.mtwebkit.internal.hyper.SameLayerClient
    public final void onCreate(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e700097e7f96266fbc5e2951356b830", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e700097e7f96266fbc5e2951356b830");
            return;
        }
        a("onCreate " + str);
        if (a(str)) {
            k.a((g) this);
        }
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82b6da877c36bd8f62de03ad035fc20e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82b6da877c36bd8f62de03ad035fc20e")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            com.meituan.mmp.lib.trace.b.b("MPWidgetClient@", "empty attributes");
            return false;
        }
        this.f = ac.c(str);
        if (this.f == null) {
            com.meituan.mmp.lib.trace.b.b("MPWidgetClient@", "invalid attributes");
            return false;
        }
        this.b = h.a(this.f, "mpView_name");
        this.c = h.a(this.f, "mpView_appId");
        try {
            this.e = Integer.parseInt(h.a(this.f, "mpView_pageId".toLowerCase()));
        } catch (Exception unused) {
        }
        this.d = (String) this.f.get("mpView_viewId".toLowerCase());
        if (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.d)) {
            com.meituan.mmp.lib.trace.b.b("MPWidgetClient@", "illegal arguments");
            return false;
        }
        return true;
    }

    @Override // com.meituan.mtwebkit.internal.hyper.SameLayerClient
    public final void onSurfaceCreated(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1243ef95f40672b8d96f92cd3d3350c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1243ef95f40672b8d96f92cd3d3350c");
            return;
        }
        a("onSurfaceCreated " + surface);
        this.h = surface;
        f();
    }

    @Override // com.meituan.mtwebkit.internal.hyper.SameLayerClient
    public final void onRectChanged(Rect rect) {
        boolean z;
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daa758e4829a9c40a568f13b33ddadaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daa758e4829a9c40a568f13b33ddadaa");
            return;
        }
        a("onRectChanged ", this.j, rect);
        this.j = rect;
        int width = rect.width();
        int height = rect.height();
        if (width == this.k && height == this.l) {
            z = false;
        } else {
            this.k = width;
            this.l = height;
            z = true;
        }
        a("onRectChanged ", Boolean.valueOf(z));
        if (this.g == null || !z) {
            return;
        }
        this.g.a(this.k, this.l);
    }

    @Override // com.meituan.mtwebkit.internal.hyper.SameLayerClient
    public final void onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c0213acbc97d742d63a3fbf6a65d296", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c0213acbc97d742d63a3fbf6a65d296");
        } else if (this.g != null) {
            this.g.a(motionEvent);
        }
    }

    @Override // com.meituan.mtwebkit.internal.hyper.SameLayerClient
    public final void onVisibilityChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35ec8bea9f890093e36322250e9f9a4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35ec8bea9f890093e36322250e9f9a4e");
            return;
        }
        a("onVisibilityChanged " + z);
        if (this.g != null) {
            this.g.a(z);
        }
    }

    @Override // com.meituan.mtwebkit.internal.hyper.SameLayerClient
    public final void onSurfaceDestroy(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99afa58488064e9cb00443c802c6a6dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99afa58488064e9cb00443c802c6a6dc");
            return;
        }
        a("onSurfaceDestroy " + surface);
        if (this.g != null) {
            this.g.b(surface);
        }
    }

    @Override // com.meituan.mtwebkit.internal.hyper.SameLayerClient
    public final void onAttributesChanged(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aedfc822124aa17c5e5cacc8d54d0073", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aedfc822124aa17c5e5cacc8d54d0073");
            return;
        }
        a("onAttributesChanged " + str);
    }

    @Override // com.meituan.mtwebkit.internal.hyper.SameLayerClient
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca17662d11cf5e394c46503b0d0180d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca17662d11cf5e394c46503b0d0180d6");
            return;
        }
        a("onDestroy: " + this);
        this.h = null;
        this.j = null;
        if (this.g != null) {
            this.g.f();
            this.g = null;
        }
        k.b(this);
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.e
    public final String a() {
        return this.b;
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.e
    public final String b() {
        return this.c;
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.e
    public final int c() {
        return this.e;
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.e
    public final String d() {
        return this.d;
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.g
    public final void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64eed7582da2c6b236b80d421d84ceff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64eed7582da2c6b236b80d421d84ceff");
            return;
        }
        a("bindMPWidget: " + fVar);
        this.g = fVar;
        fVar.a(this);
        f();
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "741fe04ad31754282c3c6c7fe66e5813", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "741fe04ad31754282c3c6c7fe66e5813");
        } else if (this.g == null || this.h == null) {
        } else {
            this.g.a(this.h);
            if (this.j != null) {
                this.g.a(this.k, this.l);
            }
        }
    }

    @Override // com.meituan.mtwebkit.internal.hyper.SameLayerWidget
    public final void evaluateJavaScript(String str, MTValueCallback<String> mTValueCallback) {
        Object[] objArr = {str, mTValueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "477b1fb243859695854d31746105e40d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "477b1fb243859695854d31746105e40d");
        } else if (this.i != null) {
            this.i.evaluateJavaScript(str, mTValueCallback);
        }
    }

    @Override // com.meituan.mmp.lib.embeddedwidget.g
    public final boolean e() {
        return this.h != null;
    }
}
