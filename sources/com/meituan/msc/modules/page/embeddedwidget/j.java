package com.meituan.msc.modules.page.embeddedwidget;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Surface;
import com.meituan.msc.common.utils.ab;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "758f14b3f42fb461e66de04e35a21406", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "758f14b3f42fb461e66de04e35a21406");
        } else {
            this.i = sameLayerWidget;
        }
    }

    private void a(Object... objArr) {
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "5f0ad154f0840ae9df9eb5e000dcc6f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "5f0ad154f0840ae9df9eb5e000dcc6f6");
        } else {
            com.meituan.msc.modules.reporter.g.b("MPWidgetClient@", Integer.valueOf(hashCode()), objArr);
        }
    }

    @Override // com.meituan.mtwebkit.internal.hyper.SameLayerClient
    public final void onCreate(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c291bdd57588d8c930eac385ff45651a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c291bdd57588d8c930eac385ff45651a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "011b4026fc0f2c54d9f9524846632ec4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "011b4026fc0f2c54d9f9524846632ec4")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            com.meituan.msc.modules.reporter.g.b("MPWidgetClient@", "empty attributes");
            return false;
        }
        this.f = ab.b(str);
        if (this.f == null) {
            com.meituan.msc.modules.reporter.g.b("MPWidgetClient@", "invalid attributes");
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
            com.meituan.msc.modules.reporter.g.b("MPWidgetClient@", "illegal arguments");
            return false;
        }
        return true;
    }

    @Override // com.meituan.mtwebkit.internal.hyper.SameLayerClient
    public final void onSurfaceCreated(Surface surface) {
        Object[] objArr = {surface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b6481da9dceb510c24c895f76bbaeaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b6481da9dceb510c24c895f76bbaeaf");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16ae06d42d13f9e7b78737f944d83452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16ae06d42d13f9e7b78737f944d83452");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77c78c28b98833dff4a8a34a1b6b0ebd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77c78c28b98833dff4a8a34a1b6b0ebd");
        } else if (this.g != null) {
            this.g.a(motionEvent);
        }
    }

    @Override // com.meituan.mtwebkit.internal.hyper.SameLayerClient
    public final void onVisibilityChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b5a4ec1aa23c8715c354b17ad4c7fdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b5a4ec1aa23c8715c354b17ad4c7fdc");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "707fcc5366e877ca00de0353487ef2ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "707fcc5366e877ca00de0353487ef2ee");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95408d01de90a86015a319aa6b7b41d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95408d01de90a86015a319aa6b7b41d6");
            return;
        }
        a("onAttributesChanged " + str);
    }

    @Override // com.meituan.mtwebkit.internal.hyper.SameLayerClient
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ab9333efc6e81a9dc6063fa97bd2ccc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ab9333efc6e81a9dc6063fa97bd2ccc");
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

    @Override // com.meituan.msc.modules.page.embeddedwidget.e
    public final String a() {
        return this.b;
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.e
    public final String b() {
        return this.c;
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.e
    public final int c() {
        return this.e;
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.e
    public final String d() {
        return this.d;
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.g
    public final void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "341ebbaeb7e41e258d39c2ee8f115e8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "341ebbaeb7e41e258d39c2ee8f115e8a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86aaa599102f3e2975e524c26622e926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86aaa599102f3e2975e524c26622e926");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ad9b0de6d426cb0b79ce07975602d0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ad9b0de6d426cb0b79ce07975602d0b");
        } else if (this.i != null) {
            this.i.evaluateJavaScript(str, mTValueCallback);
        }
    }

    @Override // com.meituan.msc.modules.page.embeddedwidget.g
    public final boolean e() {
        return this.h != null;
    }
}
