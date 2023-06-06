package com.sankuai.meituan.mapsdk.maps.model;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.utils.c;
import com.sankuai.meituan.mapsdk.maps.interfaces.l;
import com.sankuai.meituan.mapsdk.maps.interfaces.r;
import com.sankuai.meituan.mapsdk.maps.model.PolylineOptions;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class Polyline implements r {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final r a;

    public Polyline(r rVar) {
        Object[] objArr = {rVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4bc42819df77da5387888ff9f64819e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4bc42819df77da5387888ff9f64819e");
        } else {
            this.a = rVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c26d87fef95779a612c3d3d330a2deaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c26d87fef95779a612c3d3d330a2deaa");
            return;
        }
        String id = this.a.getId();
        this.a.remove();
        c.f("MTMap#removePolyline: polylineId: " + id);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "842f7f70fbe0eeb9a3ad222b1528ff8a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "842f7f70fbe0eeb9a3ad222b1528ff8a") : this.a.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final List<LatLng> getPoints() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0958f76c463dafd54df56f53bc74acc0", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0958f76c463dafd54df56f53bc74acc0") : this.a.getPoints();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setPoints(@NonNull List<LatLng> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56e046a4f3f0db2afeab20e864c6e0e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56e046a4f3f0db2afeab20e864c6e0e2");
        } else {
            this.a.setPoints(list);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final boolean isDottedLine() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c367b57873a581bcb32f0960173c2f75", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c367b57873a581bcb32f0960173c2f75")).booleanValue() : this.a.isDottedLine();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setDashPattern(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f5131b6f4d4153365c4e8d646e06a5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f5131b6f4d4153365c4e8d646e06a5a");
        } else {
            this.a.setDashPattern(iArr);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final float getWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82409610b1a32994825dfd7675e5b744", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82409610b1a32994825dfd7675e5b744")).floatValue() : this.a.getWidth();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34d86f76205be37f1b07fbf76289fd4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34d86f76205be37f1b07fbf76289fd4b");
        } else {
            this.a.setWidth(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3be29257c6585c3e22b78a906fb60343", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3be29257c6585c3e22b78a906fb60343")).floatValue() : this.a.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14a73b398eb24a88d655eb91a5801749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14a73b398eb24a88d655eb91a5801749");
        } else {
            this.a.setZIndex(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12706b3aa58129706b606d94abfdb3dd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12706b3aa58129706b606d94abfdb3dd")).booleanValue() : this.a.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "803f582df68c8f2722d3360127c724cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "803f582df68c8f2722d3360127c724cb");
        } else {
            this.a.setVisible(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void eraseTo(int i, LatLng latLng) {
        Object[] objArr = {Integer.valueOf(i), latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8acf57bbe476860d97eee3d2c9795737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8acf57bbe476860d97eee3d2c9795737");
        } else {
            this.a.eraseTo(i, latLng);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void eraseTo(int i, LatLng latLng, boolean z) {
        Object[] objArr = {Integer.valueOf(i), latLng, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f33ff637d93f13d3500bf7becac41cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f33ff637d93f13d3500bf7becac41cb");
        } else {
            this.a.eraseTo(i, latLng, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58fc9d3b674f3e88554cc38ec6ad2fcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58fc9d3b674f3e88554cc38ec6ad2fcf");
        } else {
            this.a.setClickable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final boolean isClickable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46ad76ca410330396f1b7953574ee5a6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46ad76ca410330396f1b7953574ee5a6")).booleanValue() : this.a.isClickable();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setOptions(PolylineOptions polylineOptions) {
        Object[] objArr = {polylineOptions};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31d76b5cc83f8f01eb86c1b87ecedc94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31d76b5cc83f8f01eb86c1b87ecedc94");
        } else {
            this.a.setOptions(polylineOptions);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final PolylineOptions getOptions(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9900c23300b64863b415c91305616b0f", RobustBitConfig.DEFAULT_VALUE) ? (PolylineOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9900c23300b64863b415c91305616b0f") : this.a.getOptions(context);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void startAnimation(Animation animation, LatLng latLng) {
        Object[] objArr = {animation, latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9679b705c41e2568118a4df72377aa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9679b705c41e2568118a4df72377aa8");
        } else {
            this.a.startAnimation(animation, latLng);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setAvoidable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ba90adb076eb82752fb0c0b6a2ae7a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ba90adb076eb82752fb0c0b6a2ae7a8");
        } else {
            this.a.setAvoidable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final boolean isAvoidable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77fe61eb853099b3d60eb50e80cabf36", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77fe61eb853099b3d60eb50e80cabf36")).booleanValue() : this.a.isAvoidable();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setText(PolylineOptions.Text text) {
        Object[] objArr = {text};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "faa5497f574d5d9a2a4bb44adcb2b3e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "faa5497f574d5d9a2a4bb44adcb2b3e3");
        } else {
            this.a.setText(text);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final PolylineOptions.Text getText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c12b20bacfe125b63230dac5cb03337a", RobustBitConfig.DEFAULT_VALUE) ? (PolylineOptions.Text) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c12b20bacfe125b63230dac5cb03337a") : this.a.getText();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final PolylineOptions.PatternItem getPattern() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb7fa06e61a24e2abaa0d87b2c027e0f", RobustBitConfig.DEFAULT_VALUE) ? (PolylineOptions.PatternItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb7fa06e61a24e2abaa0d87b2c027e0f") : this.a.getPattern();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setPattern(PolylineOptions.PatternItem patternItem) {
        Object[] objArr = {patternItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3b4cb5a4f29c66dca93fd74ffd6f93d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3b4cb5a4f29c66dca93fd74ffd6f93d");
        } else {
            this.a.setPattern(patternItem);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final float getAlpha() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d629ed493b01b16b8344ac870a83541", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d629ed493b01b16b8344ac870a83541")).floatValue() : this.a.getAlpha();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7417d4384e46cd004af91263d0f06fc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7417d4384e46cd004af91263d0f06fc4");
        } else {
            this.a.setAlpha(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final Object getTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ec006ad5c4ddffb2b2fb925af12c7c5", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ec006ad5c4ddffb2b2fb925af12c7c5") : this.a.getTag();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setTag(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65f74cf4222b6d6d917d36c233077ecf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65f74cf4222b6d6d917d36c233077ecf");
        } else {
            this.a.setTag(obj);
        }
    }

    public final l getMapElement() {
        return this.a;
    }

    @Deprecated
    public final void setDottedLine(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "688841b7f7a5592ddd9bf368faac95c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "688841b7f7a5592ddd9bf368faac95c1");
        } else {
            this.a.setDashPattern(z ? PolylineOptions.DEFAULT_DASH_PATTERN : null);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    @Deprecated
    public final int getColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4746063243291b9f111da6124fab8f0a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4746063243291b9f111da6124fab8f0a")).intValue() : this.a.getColor();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    @Deprecated
    public final void setColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5e9761d3d1e8fb4e2ec58dd57fea9f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5e9761d3d1e8fb4e2ec58dd57fea9f7");
        } else {
            this.a.setColor(i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    @Deprecated
    public final void setColors(int[] iArr, int[] iArr2) {
        Object[] objArr = {iArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "627a2654f4d26cb5fce69c69d5d5fb9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "627a2654f4d26cb5fce69c69d5d5fb9f");
        } else {
            this.a.setColors(iArr, iArr2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    @Deprecated
    public final void insertPoint(int i, LatLng latLng) {
        Object[] objArr = {Integer.valueOf(i), latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34a4a464a13013cdd1848b6f2b3fe2fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34a4a464a13013cdd1848b6f2b3fe2fe");
        } else {
            this.a.insertPoint(i, latLng);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    @Deprecated
    public final void setEraseable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c18eeb620496c0da30b963f95d16de42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c18eeb620496c0da30b963f95d16de42");
        } else {
            this.a.setEraseable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    @Deprecated
    public final void setColorTexture(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eafcbd3d15c407e3c82b2f71497257ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eafcbd3d15c407e3c82b2f71497257ea");
        } else {
            this.a.setColorTexture(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    @Deprecated
    public final void setCustomTextureList(List<BitmapDescriptor> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b518a450476cfa84c459c01ddd0ae0ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b518a450476cfa84c459c01ddd0ae0ad");
        } else {
            this.a.setCustomTextureList(list);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    @Deprecated
    public final void setCustomTextureIndex(List<Integer> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f948f403037d0ad382c4025f0418ac30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f948f403037d0ad382c4025f0418ac30");
        } else {
            this.a.setCustomTextureIndex(list);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    @Deprecated
    public final PolylineOptions getOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0b5949d4c7d7b7025b63b8d1cf2e2b7", RobustBitConfig.DEFAULT_VALUE) ? (PolylineOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0b5949d4c7d7b7025b63b8d1cf2e2b7") : this.a.getOptions();
    }
}
