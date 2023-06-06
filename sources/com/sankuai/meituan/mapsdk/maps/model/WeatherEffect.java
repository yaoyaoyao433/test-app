package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.x;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WeatherEffect {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final x iWeatherEffect;

    public WeatherEffect(x xVar) {
        Object[] objArr = {xVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc7a15bdcc65a23af2d89eb4632e9eaf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc7a15bdcc65a23af2d89eb4632e9eaf");
        } else {
            this.iWeatherEffect = xVar;
        }
    }

    public void setWeatherType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4f6348555f1d33660ff421b8c818ac1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4f6348555f1d33660ff421b8c818ac1");
        } else if (this.iWeatherEffect != null) {
            this.iWeatherEffect.a(i);
        }
    }

    public void setWeatherAutoUpdate(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39ec08b3f98bfdf8600817063f94dadf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39ec08b3f98bfdf8600817063f94dadf");
        } else if (this.iWeatherEffect != null) {
            this.iWeatherEffect.a(z);
        }
    }

    public void disableWeather() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c76f6adc4a25cc8ecf225ea2648c88e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c76f6adc4a25cc8ecf225ea2648c88e");
        } else if (this.iWeatherEffect != null) {
            this.iWeatherEffect.a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class HotEffect extends WeatherEffect {
        public static final int HOT = 0;
        public static final int HOT_DISTORTION = 1;
        public static final int HOT_SUN = 2;
        public static ChangeQuickRedirect changeQuickRedirect;

        public HotEffect(x xVar) {
            super(xVar);
            Object[] objArr = {xVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12da22d712c7967be095d1a4d2193e72", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12da22d712c7967be095d1a4d2193e72");
            }
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.WeatherEffect
        public final void setWeatherType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d04321682c36f7e51f530faaacfb7f26", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d04321682c36f7e51f530faaacfb7f26");
            } else {
                super.setWeatherType(i);
            }
        }

        public final void setWeatherIntensity(float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d2aaf4506e209b406f11bbed0578e7b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d2aaf4506e209b406f11bbed0578e7b");
            } else if (this.iWeatherEffect != null) {
                this.iWeatherEffect.a(f);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class RainEffect extends WeatherEffect {
        public static final int RAIN_LARGE = 4;
        public static final int RAIN_MEDIUM = 3;
        public static final int RAIN_STORM = 5;
        public static ChangeQuickRedirect changeQuickRedirect;

        public RainEffect(x xVar) {
            super(xVar);
            Object[] objArr = {xVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9800548237c4d15602353313b1cd706e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9800548237c4d15602353313b1cd706e");
            }
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.WeatherEffect
        public final void setWeatherType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ca2c86c1b4d5374441ef2ddc1453815", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ca2c86c1b4d5374441ef2ddc1453815");
            } else {
                super.setWeatherType(i);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class SnowEffect extends WeatherEffect {
        public static final int SNOW_LARGE = 7;
        public static final int SNOW_MEDIUM = 6;
        public static final int SNOW_STORM = 8;
        public static ChangeQuickRedirect changeQuickRedirect;

        public SnowEffect(x xVar) {
            super(xVar);
            Object[] objArr = {xVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77ccbe293549065e290e19a354f927f7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77ccbe293549065e290e19a354f927f7");
            }
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.WeatherEffect
        public final void setWeatherType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c6df4641f1a6b134528cb093fd8fa62", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c6df4641f1a6b134528cb093fd8fa62");
            } else {
                super.setWeatherType(i);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class DustEffect extends WeatherEffect {
        public static final int DUST = 9;
        public static ChangeQuickRedirect changeQuickRedirect;

        public DustEffect(x xVar) {
            super(xVar);
            Object[] objArr = {xVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9be799181b9760e4fd0276b0eadf8ce", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9be799181b9760e4fd0276b0eadf8ce");
            }
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.WeatherEffect
        public final void setWeatherType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4a48f75a9e861cf676730f82d197850", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4a48f75a9e861cf676730f82d197850");
            } else {
                super.setWeatherType(i);
            }
        }
    }
}
