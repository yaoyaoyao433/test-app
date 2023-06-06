package com.sankuai.waimai.platform.widget.weather;

import android.content.Context;
import android.graphics.Canvas;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class f {
    public static ChangeQuickRedirect e;
    protected int f;
    protected int g;
    protected Context h;

    public abstract void a(Canvas canvas);

    public abstract void b(Canvas canvas);

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum a {
        SMOG,
        DUST_STORM,
        STRONG_WIND,
        RAIN_MEDIUM,
        RAIN_LARGE,
        RAIN_STORM,
        SNOW_MEDIUM,
        SNOW_LARGE,
        SNOW_BLIZZARD,
        STRONG_WIND_NEW;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "974a070f3f5ccdd92bd0b6ebf97b1d7e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "974a070f3f5ccdd92bd0b6ebf97b1d7e");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a05db82d0bb577d7caa838fad125d3c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a05db82d0bb577d7caa838fad125d3c") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d389c112b82a1a52318f9c4dba02575", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d389c112b82a1a52318f9c4dba02575") : (a[]) values().clone();
        }
    }

    public f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c0ed4dc872dc8e2e56f4b8dc43f60af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c0ed4dc872dc8e2e56f4b8dc43f60af");
        } else {
            this.h = context;
        }
    }

    public void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84ef59a55ac6db846766af01c7ae06c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84ef59a55ac6db846766af01c7ae06c4");
        } else if (this.f == i || this.g == i2) {
        } else {
            this.f = i;
            this.g = i2;
        }
    }
}
