package com.meituan.msc.uimanager.layoutanimation;

import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    private static final Map<d, BaseInterpolator> d = com.meituan.msc.jse.common.a.a(d.LINEAR, new LinearInterpolator(), d.EASE_IN, new AccelerateInterpolator(), d.EASE_OUT, new DecelerateInterpolator(), d.EASE_IN_EASE_OUT, new AccelerateDecelerateInterpolator());
    @Nullable
    protected b b;
    protected int c;
    @Nullable
    private Interpolator e;
    private int f;

    @Nullable
    public abstract Animation a(View view, int i, int i2, int i3, int i4);

    public abstract boolean a();

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7f050236412179251a5213dec18649c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7f050236412179251a5213dec18649c");
            return;
        }
        this.b = null;
        this.c = 0;
        this.f = 0;
        this.e = null;
    }

    public final void a(ReadableMap readableMap, int i) {
        BaseInterpolator baseInterpolator;
        Interpolator interpolator;
        Object[] objArr = {readableMap, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a88651e7fcc9ad5896b147cb1310f736", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a88651e7fcc9ad5896b147cb1310f736");
            return;
        }
        this.b = readableMap.hasKey("property") ? b.a(readableMap.getString("property")) : null;
        this.c = readableMap.hasKey("duration") ? readableMap.getInt("duration") : i;
        this.f = readableMap.hasKey("delay") ? readableMap.getInt("delay") : 0;
        if (!readableMap.hasKey("type")) {
            throw new IllegalArgumentException("Missing interpolation type.");
        }
        d a2 = d.a(readableMap.getString("type"));
        Object[] objArr2 = {a2, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "eccfb6ac4a46fde61c08883478b2dd1d", RobustBitConfig.DEFAULT_VALUE)) {
            interpolator = (Interpolator) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "eccfb6ac4a46fde61c08883478b2dd1d");
        } else {
            if (a2.equals(d.SPRING)) {
                baseInterpolator = new n(n.a(readableMap));
            } else {
                baseInterpolator = d.get(a2);
            }
            if (baseInterpolator == null) {
                throw new IllegalArgumentException("Missing interpolator for type : " + a2);
            }
            interpolator = baseInterpolator;
        }
        this.e = interpolator;
        if (a()) {
            return;
        }
        throw new com.meituan.msc.uimanager.g("Invalid layout animation : " + readableMap);
    }

    @Nullable
    public final Animation b(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cea2c233cba5947f2613ef418f3a2ca9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cea2c233cba5947f2613ef418f3a2ca9");
        }
        if (a()) {
            Animation a2 = a(view, i, i2, i3, i4);
            if (a2 != null) {
                a2.setDuration(this.c * 1);
                a2.setStartOffset(this.f * 1);
                a2.setInterpolator(this.e);
            }
            return a2;
        }
        return null;
    }
}
