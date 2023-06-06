package com.sankuai.meituan.mapsdk.maps;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UiSettings implements v {
    public static final int LOGO_POSITION_BOTTOM_CENTER = 1;
    public static final int LOGO_POSITION_BOTTOM_LEFT = 0;
    public static final int LOGO_POSITION_BOTTOM_RIGHT = 2;
    public static final int LOGO_POSITION_NO_DEFINE = -1;
    public static final int LOGO_POSITION_TOP_CENTER = 4;
    public static final int LOGO_POSITION_TOP_LEFT = 3;
    public static final int LOGO_POSITION_TOP_RIGHT = 5;
    public static final int SCALE_POSITION_BOTTOM_CENTER = 1;
    public static final int SCALE_POSITION_BOTTOM_LEFT = 0;
    public static final int SCALE_POSITION_BOTTOM_RIGHT = 2;
    public static final int ZOOM_POSITION_RIGHT_BUTTOM = 2;
    public static final int ZOOM_POSITION_RIGHT_CENTER = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final v a;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface LogoPosition {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface ScalePosition {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface ZoomPosition {
    }

    @Deprecated
    public boolean isMyLocationButtonEnabled() {
        return false;
    }

    @Deprecated
    public void setMyLocationButtonEnabled(boolean z) {
    }

    public UiSettings(v vVar) {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "248cb41ef1a3dc3968c83ac1597b9a51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "248cb41ef1a3dc3968c83ac1597b9a51");
        } else {
            this.a = vVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public boolean isScaleControlsEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56399ccfe54ee49e4ca10d005799a25a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56399ccfe54ee49e4ca10d005799a25a")).booleanValue() : this.a.isScaleControlsEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setScaleControlsEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e60ec607f064c451bfe2fd943b84b95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e60ec607f064c451bfe2fd943b84b95");
        } else {
            this.a.setScaleControlsEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public int getLogoPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20b74751349b4a79704053e9a3111f13", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20b74751349b4a79704053e9a3111f13")).intValue() : this.a.getLogoPosition();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setLogoPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b745329e538c02a84910ed8e14000c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b745329e538c02a84910ed8e14000c3");
        } else {
            this.a.setLogoPosition(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setLogoPositionWithMargin(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32124b1165a3a154687cb54350ab4d6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32124b1165a3a154687cb54350ab4d6b");
        } else {
            this.a.setLogoPositionWithMargin(i, i2, i3, i4, i5);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public boolean isZoomGesturesEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cef29a75e80a9c817cd86ea3823eefe9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cef29a75e80a9c817cd86ea3823eefe9")).booleanValue() : this.a.isZoomGesturesEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setZoomGesturesEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e44d2299505200a244a0e093a125c13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e44d2299505200a244a0e093a125c13");
        } else {
            this.a.setZoomGesturesEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public boolean isScrollGesturesEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dc60aef52d2a25a9256e881f57eef0a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dc60aef52d2a25a9256e881f57eef0a")).booleanValue() : this.a.isScrollGesturesEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setScrollGesturesEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "682f0088bc12b31b2eb95f5ef649c99c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "682f0088bc12b31b2eb95f5ef649c99c");
        } else {
            this.a.setScrollGesturesEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public boolean isAllGesturesEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "856f31f254ce8169a67224c7f023c5e8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "856f31f254ce8169a67224c7f023c5e8")).booleanValue() : this.a.isAllGesturesEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setAllGesturesEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b03cdff07befe4fffc955f9a0891923", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b03cdff07befe4fffc955f9a0891923");
        } else {
            this.a.setAllGesturesEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setZoomControlsEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be1019eccf6458202330a03d3f66db0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be1019eccf6458202330a03d3f66db0f");
        } else {
            this.a.setZoomControlsEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public boolean isZoomControlsEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "457c9eab569318b8ffecd85e908d24ae", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "457c9eab569318b8ffecd85e908d24ae")).booleanValue() : this.a.isZoomControlsEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setZoomPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "611bfe12c5da9d36924b7b9108eeca89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "611bfe12c5da9d36924b7b9108eeca89");
        } else {
            this.a.setZoomPosition(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public int getZoomPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5906356964cedd1699f64c5428cd2cc2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5906356964cedd1699f64c5428cd2cc2")).intValue() : this.a.getZoomPosition();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setRotateGesturesEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4fb14303567571e6f7b9db28bc21309", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4fb14303567571e6f7b9db28bc21309");
        } else {
            this.a.setRotateGesturesEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public boolean isRotateGesturesEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70a2fe23d402e1555371443a1c51a338", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70a2fe23d402e1555371443a1c51a338")).booleanValue() : this.a.isRotateGesturesEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setTiltGesturesEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44b9a90b35cf226eac2903bfc4e25871", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44b9a90b35cf226eac2903bfc4e25871");
        } else {
            this.a.setTiltGesturesEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public boolean isTiltGesturesEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11f1639020d294fdfbb6f26e26c8c67a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11f1639020d294fdfbb6f26e26c8c67a")).booleanValue() : this.a.isTiltGesturesEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setCompassEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6dafd240a972080e52022328038be46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6dafd240a972080e52022328038be46");
        } else {
            this.a.setCompassEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public boolean isCompassEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c729bc6aa3da05329f1c3107f8e9e91", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c729bc6aa3da05329f1c3107f8e9e91")).booleanValue() : this.a.isCompassEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setGestureScaleByMapCenter(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5e0d381bb8127b7ee2cf1f3307012e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5e0d381bb8127b7ee2cf1f3307012e7");
        } else {
            this.a.setGestureScaleByMapCenter(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public boolean isScaleByMapCenter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae42c69ec591a937393c7f9e13630e9e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae42c69ec591a937393c7f9e13630e9e")).booleanValue() : this.a.isScaleByMapCenter();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setScaleViewPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "adcd96cbbc2b4abcfefc03c61256fc44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "adcd96cbbc2b4abcfefc03c61256fc44");
        } else {
            this.a.setScaleViewPosition(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setScaleViewPositionWithMargin(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfdaf659d9ba914bf4b53aa418e6e179", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfdaf659d9ba914bf4b53aa418e6e179");
        } else {
            this.a.setScaleViewPositionWithMargin(i, i2, i3, i4, i5);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setIndoorControlsEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "847343fb7a54ece068da0f47d278becb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "847343fb7a54ece068da0f47d278becb");
        } else {
            this.a.setIndoorControlsEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setInertiaScaleEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9aef7bfc894d9da9847d73d7a1754fd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9aef7bfc894d9da9847d73d7a1754fd2");
        } else {
            this.a.setInertiaScaleEnabled(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public boolean isInertiaScaleEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "613a8d3c687506063591855c9966d92c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "613a8d3c687506063591855c9966d92c")).booleanValue() : this.a.isInertiaScaleEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public boolean isLogoEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2126a6b2f593201548a0fa8a548a2446", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2126a6b2f593201548a0fa8a548a2446")).booleanValue() : this.a.isLogoEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setZoomControlsMargins(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b12e320589ab128dc3a3c00838028045", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b12e320589ab128dc3a3c00838028045");
        } else {
            this.a.setZoomControlsMargins(i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setIndoorControlsMargins(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1013fd6b1d360d4f186413f3385913e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1013fd6b1d360d4f186413f3385913e4");
        } else {
            this.a.setIndoorControlsMargins(i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setIndoorControlsPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b79abf24e27b348c39aa2daf24387394", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b79abf24e27b348c39aa2daf24387394");
        } else {
            this.a.setIndoorControlsPosition(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public boolean isIndoorControlsEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "122f5c86057b97140d108e205f325aa2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "122f5c86057b97140d108e205f325aa2")).booleanValue() : this.a.isIndoorControlsEnabled();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setCompassPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4740180a4de78e116f4cc8613514eec5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4740180a4de78e116f4cc8613514eec5");
        } else {
            this.a.setCompassPosition(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    public void setCompassMargins(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f21ee975b8d1892ccc81e950f78d973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f21ee975b8d1892ccc81e950f78d973");
        } else {
            this.a.setCompassMargins(i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.v
    @Deprecated
    public void setLogoEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3aacceec3a96a1b09861a437172ef36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3aacceec3a96a1b09861a437172ef36");
        } else {
            this.a.setLogoEnabled(z);
        }
    }
}
