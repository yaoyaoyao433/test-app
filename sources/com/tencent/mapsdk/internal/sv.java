package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.UiSettings;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class sv implements UiSettings {
    private ae a;

    public sv(ae aeVar) {
        this.a = null;
        this.a = aeVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setZoomControlsEnabled(boolean z) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.a(z);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setCompassEnabled(boolean z) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.b(z);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setCompassExtraPadding(int i) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.f(i);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setCompassExtraPadding(int i, int i2) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.a(i, i2);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setMyLocationButtonEnabled(boolean z) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.c(z);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setScrollGesturesEnabled(boolean z) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.d(z);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setFlingGestureEnabled(boolean z) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.e(z);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setZoomGesturesEnabled(boolean z) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.f(z);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setTiltGesturesEnabled(boolean z) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.g(z);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setRotateGesturesEnabled(boolean z) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.h(z);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setAllGesturesEnabled(boolean z) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.i(z);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isZoomControlsEnabled() {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                return aeVar.a.a();
            }
            return false;
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isCompassEnabled() {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                return aeVar.a.b();
            }
            return false;
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isMyLocationButtonEnabled() {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                return aeVar.a.c();
            }
            return false;
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isScrollGesturesEnabled() {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                return aeVar.a.d();
            }
            return false;
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isZoomGesturesEnabled() {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                return aeVar.a.e();
            }
            return false;
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isTiltGesturesEnabled() {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                return aeVar.a.f();
            }
            return false;
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isRotateGesturesEnabled() {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                return aeVar.a.g();
            }
            return false;
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isIndoorLevelPickerEnabled() {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                return aeVar.a.h();
            }
            return false;
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setScaleViewEnabled(boolean z) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.j(z);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setScaleViewFadeEnable(boolean z) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.n(z);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final boolean isScaleViewEnabled() {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                return aeVar.a.i();
            }
            return false;
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setScaleViewPosition(int i) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.e(i);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setScaleViewPositionWithMargin(int i, int i2, int i3, int i4, int i5) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.b(i, i2, i3, i4, i5);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setLogoPosition(int i) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.b(i);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setZoomPosition(int i) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.h(i);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setLogoSize(int i) {
        if (this.a == null || this.a == null) {
            return;
        }
        ae aeVar = this.a;
        if (aeVar.a != null) {
            aeVar.a.g(i);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setLogoPositionWithMargin(int i, int i2, int i3, int i4, int i5) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.a(i, i2, i3, i4, i5);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setLogoPosition(int i, int[] iArr) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.a(i, iArr);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setGestureScaleByMapCenter(boolean z) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.l(z);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setIndoorLevelPickerEnabled(boolean z) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.m(z);
            }
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.UiSettings
    public final void setLogoScale(float f) {
        if (this.a != null) {
            ae aeVar = this.a;
            if (aeVar.a != null) {
                aeVar.a.a(f);
            }
        }
    }
}
