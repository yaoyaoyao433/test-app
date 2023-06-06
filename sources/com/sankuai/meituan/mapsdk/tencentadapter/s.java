package com.sankuai.meituan.mapsdk.tencentadapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.v;
import com.tencent.tencentmap.mapsdk.maps.UiSettings;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class s implements v {
    public static ChangeQuickRedirect a;
    private UiSettings b;
    private int c;
    private int d;
    private boolean e;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isIndoorControlsEnabled() {
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isInertiaScaleEnabled() {
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isLogoEnabled() {
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isZoomControlsEnabled() {
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setCompassMargins(int i, int i2, int i3, int i4) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setCompassPosition(int i) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setIndoorControlsMargins(int i, int i2, int i3, int i4) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setIndoorControlsPosition(int i) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setInertiaScaleEnabled(boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setLogoEnabled(boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setZoomControlsMargins(int i, int i2, int i3, int i4) {
    }

    public s(UiSettings uiSettings) {
        Object[] objArr = {uiSettings};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbc53f73d2dbf74c262e92104ec4d811", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbc53f73d2dbf74c262e92104ec4d811");
            return;
        }
        this.c = 2;
        this.d = -1;
        this.e = false;
        this.b = uiSettings;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isScaleControlsEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b593ace3d82e709a8a7a4243f287dd89", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b593ace3d82e709a8a7a4243f287dd89")).booleanValue() : this.b.isScaleViewEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setScaleControlsEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c96e920068045cdd0c800223ba812196", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c96e920068045cdd0c800223ba812196");
        } else {
            this.b.setScaleViewEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final int getLogoPosition() {
        return this.c;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setLogoPosition(int i) {
        int i2 = 1;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1542f8d282ad1ddf23dadef0862c292", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1542f8d282ad1ddf23dadef0862c292");
            return;
        }
        switch (i) {
            case 0:
            default:
                i2 = 0;
                break;
            case 1:
                i2 = 4;
                break;
            case 2:
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                i2 = 2;
                break;
        }
        this.c = i;
        this.b.setLogoPosition(i2);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setLogoPositionWithMargin(int i, int i2, int i3, int i4, int i5) {
        int i6;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e38286cfea1874a63f4539e1e131575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e38286cfea1874a63f4539e1e131575");
            return;
        }
        switch (i) {
            case 0:
            default:
                i6 = 0;
                break;
            case 1:
                i6 = 4;
                break;
            case 2:
                i6 = 1;
                break;
            case 3:
                i6 = 3;
                break;
            case 4:
                i6 = 5;
                break;
            case 5:
                i6 = 2;
                break;
        }
        this.c = i;
        this.b.setLogoPositionWithMargin(i6, i2, i3, i4, i5);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isZoomGesturesEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "202e06962b6b7a60c32e99f35b7540c5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "202e06962b6b7a60c32e99f35b7540c5")).booleanValue() : this.b.isZoomGesturesEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setZoomGesturesEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e601c2b9232deab7eef15ff9ccce4f58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e601c2b9232deab7eef15ff9ccce4f58");
        } else {
            this.b.setZoomGesturesEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isScrollGesturesEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e34cdad5e77554ebafa5f0e407d52758", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e34cdad5e77554ebafa5f0e407d52758")).booleanValue() : this.b.isScrollGesturesEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setScrollGesturesEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0ee3fdae796dc5e714364336a82a73f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0ee3fdae796dc5e714364336a82a73f");
        } else {
            this.b.setScrollGesturesEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isAllGesturesEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5ca56c6a8949b03b1216a1d631d8959", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5ca56c6a8949b03b1216a1d631d8959")).booleanValue() : isZoomGesturesEnabled() && isRotateGesturesEnabled() && isTiltGesturesEnabled() && isScrollGesturesEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setAllGesturesEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6321cfc5671d491a914406065bf2812c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6321cfc5671d491a914406065bf2812c");
        } else {
            this.b.setAllGesturesEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setZoomControlsEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09f89015d8ef3819ab326f775409fe2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09f89015d8ef3819ab326f775409fe2d");
        } else {
            this.b.setZoomControlsEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setCompassEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d3042884ceb4811939cead6a73cc17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d3042884ceb4811939cead6a73cc17");
        } else {
            this.b.setCompassEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setZoomPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c291232f1e2bdf1ce36773fe5f77b051", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c291232f1e2bdf1ce36773fe5f77b051");
            return;
        }
        this.d = i;
        this.b.setZoomPosition(i);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final int getZoomPosition() {
        if (this.d == -1) {
            return 0;
        }
        return this.d;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setRotateGesturesEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f4ba3cffb40ce6ffac3656f0990a970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f4ba3cffb40ce6ffac3656f0990a970");
        } else {
            this.b.setRotateGesturesEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isRotateGesturesEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f55b845fc9f9e2e91e2d0992619dc0a7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f55b845fc9f9e2e91e2d0992619dc0a7")).booleanValue() : this.b.isRotateGesturesEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setTiltGesturesEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a848efd05c14f3f9507c55caa60d2db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a848efd05c14f3f9507c55caa60d2db");
        } else {
            this.b.setTiltGesturesEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isTiltGesturesEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a1917942f6d9c52d7a18120e886053a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a1917942f6d9c52d7a18120e886053a")).booleanValue() : this.b.isTiltGesturesEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isCompassEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c1c30b5b3f49c056f178b8cbc102475", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c1c30b5b3f49c056f178b8cbc102475")).booleanValue() : this.b.isCompassEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setGestureScaleByMapCenter(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f71bf049273ffe5e004701e85373e309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f71bf049273ffe5e004701e85373e309");
            return;
        }
        this.e = z;
        this.b.setGestureScaleByMapCenter(z);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final boolean isScaleByMapCenter() {
        return this.e;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setScaleViewPosition(int i) {
        int i2 = 1;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "209f70ab01bf1dce27088e085dd11e22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "209f70ab01bf1dce27088e085dd11e22");
            return;
        }
        switch (i) {
            case 0:
            default:
                i2 = 0;
                break;
            case 1:
                i2 = 4;
                break;
            case 2:
                break;
        }
        this.b.setScaleViewPosition(i2);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setScaleViewPositionWithMargin(int i, int i2, int i3, int i4, int i5) {
        int i6;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35ee5caf1f4a1df1586dd2d6a09ca4b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35ee5caf1f4a1df1586dd2d6a09ca4b1");
            return;
        }
        switch (i) {
            case 0:
            default:
                i6 = 0;
                break;
            case 1:
                i6 = 4;
                break;
            case 2:
                i6 = 1;
                break;
        }
        this.b.setScaleViewPositionWithMargin(i6, i2, i3, i4, i5);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public final void setIndoorControlsEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb415e3fadad36aa017381d3c36d75d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb415e3fadad36aa017381d3c36d75d9");
        } else {
            this.b.setIndoorLevelPickerEnabled(z);
        }
    }
}
