package com.sankuai.eh.plugins.skeleton.vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends b {
    public static ChangeQuickRedirect b;
    private boolean c;
    private Map<String, JsonElement> d;
    private d e;

    public c(@NonNull Context context, Map<String, JsonElement> map) {
        super(context);
        Object[] objArr = {context, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "198a1ca490a0f660232474a1c7731573", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "198a1ca490a0f660232474a1c7731573");
            return;
        }
        this.d = map;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46ce3fb10f31c65baca8287158dcfd9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46ce3fb10f31c65baca8287158dcfd9c");
            return;
        }
        setWillNotDraw(false);
        setLayerType(2, null);
        this.e = new d(this.d.get("anim"));
        this.e.setCallback(this);
        this.c = com.sankuai.eh.component.service.utils.b.a(this.d.get("shimmerEnabled"), true).booleanValue();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd19b59d383b1e5bd01164e4aa73ab84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd19b59d383b1e5bd01164e4aa73ab84");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.e.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0145939b1684917ad2457113b9333fc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0145939b1684917ad2457113b9333fc5");
            return;
        }
        super.onAttachedToWindow();
        d dVar = this.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "66626b31b5bec7853b140264271017c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "66626b31b5bec7853b140264271017c0");
        } else if (dVar.b == null || dVar.a() || dVar.getCallback() == null) {
        } else {
            dVar.b.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a586a0848dea8d2ad07873e5a4943cc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a586a0848dea8d2ad07873e5a4943cc9");
            return;
        }
        super.onDetachedFromWindow();
        d dVar = this.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "d09fecb5eb0f048b75ce15e7bea18cff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "d09fecb5eb0f048b75ce15e7bea18cff");
        } else if (dVar.b == null || !dVar.a()) {
        } else {
            dVar.b.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b39951f23a7236e4adbc687662a59a57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b39951f23a7236e4adbc687662a59a57");
        } else if (this.c) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
            super.dispatchDraw(canvas);
            this.e.draw(canvas);
            canvas.restoreToCount(saveLayer);
        } else {
            super.dispatchDraw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(@NonNull Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "970731b443f58efa24497be403a4428a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "970731b443f58efa24497be403a4428a")).booleanValue() : super.verifyDrawable(drawable) || drawable == this.e;
    }
}
