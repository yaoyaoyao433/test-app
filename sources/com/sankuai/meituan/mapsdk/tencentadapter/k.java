package com.sankuai.meituan.mapsdk.tencentadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.DefaultInfoWindowView;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.interfaces.n;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.AnimationListener;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptorFactory;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k implements com.sankuai.meituan.mapsdk.maps.interfaces.n {
    public static ChangeQuickRedirect a;
    Marker b;
    DefaultInfoWindowView c;
    private i d;
    private MarkerOptions e;
    private n.a f;
    private boolean g;
    private boolean h;
    private Context i;
    private boolean j;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final MarkerOptions.MarkerName getMarkerName() {
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final int getOffsetX() {
        return 0;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final int getOffsetY() {
        return 0;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final float getScale() {
        return 0.0f;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isInfoWindowAllowOverlap() {
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isInfoWindowIgnorePlacement() {
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setAllowOverlap(boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setIgnorePlacement(boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowAllowOverlap(boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowIgnorePlacement(boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowZIndex(float f) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setMarkerName(MarkerOptions.MarkerName markerName) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setMarkerName(String str) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setMarkerNameColor(int i) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setMarkerNameSize(int i) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setNameAroundIcon(boolean z) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setOffset(int i, int i2) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setScale(float f) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setToTop() {
    }

    public k(Marker marker, MarkerOptions markerOptions, i iVar, Context context) {
        Object[] objArr = {marker, markerOptions, iVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6066b6543a27f9f6afbd2bfe64376e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6066b6543a27f9f6afbd2bfe64376e0");
            return;
        }
        this.g = false;
        this.b = marker;
        this.e = markerOptions;
        this.d = iVar;
        this.i = context;
        iVar.c.addMarker(this.b, this);
        if (marker != null) {
            this.h = marker.isClickable();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9ce25135acb3fa55389f15708fb90c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9ce25135acb3fa55389f15708fb90c0");
            return;
        }
        if (this.d.d != null) {
            this.d.d.removeMarker(this);
        }
        if (this.d.getOverlayKeeper() != null) {
            this.d.getOverlayKeeper().b(this);
        }
        this.b.remove();
        this.d.c.removeMarker(this.b);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setObject(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d3a0ab58a89c7b95e4982780f52b13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d3a0ab58a89c7b95e4982780f52b13");
        } else {
            this.b.setTag(obj);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final Object getObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9211b335dfe5a5a8651eb3e230ab9c19", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9211b335dfe5a5a8651eb3e230ab9c19") : this.b.getTag();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e294cefe8909382bad10c2d062841ad", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e294cefe8909382bad10c2d062841ad") : this.b.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final LatLng getPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "178ac912bda936705e475c318f80f68c", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "178ac912bda936705e475c318f80f68c");
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng position = this.b.getPosition();
        if (position == null) {
            return this.e.getPosition();
        }
        return b.a(position);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setPosition(@NonNull LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d39055974218a323f34d74eb3d1eec6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d39055974218a323f34d74eb3d1eec6");
        } else if (latLng == null) {
        } else {
            try {
                this.e.position(latLng);
                this.b.setPosition(new com.tencent.tencentmap.mapsdk.maps.model.LatLng(latLng.latitude, latLng.longitude));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final String getTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "687db17af20bb4b66fd712e95fbb590f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "687db17af20bb4b66fd712e95fbb590f") : this.e.getTitle();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setTitle(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33f187bfa356df921ea2736648ef0fb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33f187bfa356df921ea2736648ef0fb7");
            return;
        }
        this.e.title(str);
        refreshInfoWindow();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final String getSnippet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c609714a638dc44bfbaa551af4ca12f4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c609714a638dc44bfbaa551af4ca12f4") : this.e.getSnippet();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setSnippet(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37c43d9532e37691148c4c239d8cae48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37c43d9532e37691148c4c239d8cae48");
            return;
        }
        this.e.snippet(str);
        refreshInfoWindow();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.p
    public final void setIcon(@NonNull BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bf3bdeefe3f1ed763190a621d1aa906", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bf3bdeefe3f1ed763190a621d1aa906");
        } else if (bitmapDescriptor != null) {
            try {
                this.e.icon(bitmapDescriptor);
                this.b.setIcon(BitmapDescriptorFactory.fromBitmap(bitmapDescriptor.getBitmap()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setAnchor(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f2dfa70087b6510d6d7bbfef024fb9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f2dfa70087b6510d6d7bbfef024fb9d");
            return;
        }
        this.e.anchor(f, f2);
        this.b.setAnchor(f, f2);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isDraggable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c69ed0d8176a83ce749da0de62c2e67d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c69ed0d8176a83ce749da0de62c2e67d")).booleanValue() : this.b.isDraggable();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setDraggable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5843db3e5a69c82283ddcad5c31df32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5843db3e5a69c82283ddcad5c31df32");
            return;
        }
        this.e.draggable(z);
        this.b.setDraggable(z);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setOptions(MarkerOptions markerOptions) {
        Object[] objArr = {markerOptions};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdffed9a73d65b1f59b30631ea914375", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdffed9a73d65b1f59b30631ea914375");
            return;
        }
        this.e = markerOptions;
        this.b.setMarkerOptions(b.a(markerOptions));
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final MarkerOptions getOptions(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fc737ff5a5ea597dde18d99ae94ebde", RobustBitConfig.DEFAULT_VALUE)) {
            return (MarkerOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fc737ff5a5ea597dde18d99ae94ebde");
        }
        com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions options = this.b.getOptions();
        Object[] objArr2 = {context, options};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        MarkerOptions markerOptions = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1c04a7d6911622352d3bf06053cd54e9", RobustBitConfig.DEFAULT_VALUE)) {
            markerOptions = (MarkerOptions) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1c04a7d6911622352d3bf06053cd54e9");
        } else if (!b.a(options)) {
            markerOptions = new MarkerOptions();
            if (options.getIcon() != null) {
                markerOptions.icon(com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory.fromBitmap(options.getIcon().getBitmap(context)));
            }
            if (options.getPosition() != null) {
                markerOptions.position(b.a(options.getPosition()));
            }
            if (options.getAnchorU() != -1.0f && options.getAnchorV() != -1.0f) {
                markerOptions.anchor(options.getAnchorU(), options.getAnchorV());
            }
            markerOptions.draggable(options.isDraggable());
            markerOptions.visible(options.isVisible());
            markerOptions.level(options.getLevel());
            markerOptions.zIndex(options.getZIndex());
            markerOptions.infoWindowEnable(options.isInfoWindowEnable());
            markerOptions.setInfoWindowOffsetY(options.getInfowindowOffsetY());
            markerOptions.setInfoWindowOffsetX(options.getInfoWindowOffsetX());
            markerOptions.rotateAngle(options.getRotation());
            markerOptions.fastLoad(options.isFastLoad());
            String contentDescription = options.getContentDescription();
            if (!TextUtils.isEmpty(contentDescription)) {
                markerOptions.contentDescription(contentDescription);
            }
        }
        if (markerOptions != null) {
            markerOptions.title(getTitle());
            markerOptions.snippet(getSnippet());
        }
        return markerOptions;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setRotateIconInterceptor(n.a aVar) {
        this.f = aVar;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void removeRotateIconInterceptor() {
        this.f = null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setSelect(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94d4a9a470c9656c7b53b6e2d5e3ff93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94d4a9a470c9656c7b53b6e2d5e3ff93");
        } else if (this.g != z) {
            this.g = z;
            this.d.d.setMarkerSelect(this, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isSelect() {
        return this.g;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.p
    @Nullable
    public final BitmapDescriptor getIcon() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ff693daa2e4397cd3c90bf5457d8e0c", RobustBitConfig.DEFAULT_VALUE) ? (BitmapDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ff693daa2e4397cd3c90bf5457d8e0c") : this.e.getIcon();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final float getAnchorU() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fca2e929c5085fb482116ec6064e6bf", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fca2e929c5085fb482116ec6064e6bf")).floatValue() : this.e.getAnchorU();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final float getAnchorV() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eeedab3258c43744d914300069f333a", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eeedab3258c43744d914300069f333a")).floatValue() : this.e.getAnchorV();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final int getInfoWindowOffsetX() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2093c4a25ece2f05fa9cb4959f2f91d4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2093c4a25ece2f05fa9cb4959f2f91d4")).intValue() : this.e.getInfoWindowOffsetX();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final int getInfoWindowOffsetY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04ac9ee16182ba3efc3d95b9ac250ed4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04ac9ee16182ba3efc3d95b9ac250ed4")).intValue() : this.e.getInfoWindowOffsetY();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed024be886909e50c0bcdd3d3e79f791", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed024be886909e50c0bcdd3d3e79f791");
            return;
        }
        this.b.setAlpha(f);
        if (f < 1.0E-5d) {
            this.b.setClickable(false);
        } else {
            this.b.setClickable(this.h);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final Object getTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1715da2d4149f2901d32f6c80401923b", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1715da2d4149f2901d32f6c80401923b") : this.b.getTag();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setTag(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2527821e188c3cbed393f691a94d8df0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2527821e188c3cbed393f691a94d8df0");
            return;
        }
        this.b.setTag(obj);
        this.e.tag(obj);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5da7598c7ab23952dc2ac3e7d8c63ccc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5da7598c7ab23952dc2ac3e7d8c63ccc");
        } else {
            setInfoWindowOffset(i, i2, true);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowOffset(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9382f09f73ed405d39e02c639bbf9a3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9382f09f73ed405d39e02c639bbf9a3c");
        } else if (this.b == null) {
        } else {
            this.b.setInfoWindowOffset(i, i2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final int getInfoWindowLevel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfa535fc051f130ab010acab4aeda590", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfa535fc051f130ab010acab4aeda590")).intValue() : this.b.getLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final float getInfoWindowZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16c7077ed1b92cf3ee18fa10e6b368fa", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16c7077ed1b92cf3ee18fa10e6b368fa")).floatValue() : this.b.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void showInfoWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e04cb8e8117cab7d956d0d3e9d4b2adf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e04cb8e8117cab7d956d0d3e9d4b2adf");
        } else if (isInfoWindowEnable()) {
            com.sankuai.meituan.mapsdk.mapcore.utils.f.a(new Runnable() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.k.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5ad553568b5515ae8bce3d16ccf8b3d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5ad553568b5515ae8bce3d16ccf8b3d");
                        return;
                    }
                    k kVar = k.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = k.a;
                    if (PatchProxy.isSupport(objArr3, kVar, changeQuickRedirect3, false, "3cfe21b22e089436576969d475b250b6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, kVar, changeQuickRedirect3, false, "3cfe21b22e089436576969d475b250b6");
                    } else if (kVar.b != null) {
                        if (TextUtils.isEmpty(kVar.getTitle()) && TextUtils.isEmpty(kVar.getSnippet()) && !kVar.a()) {
                            return;
                        }
                        kVar.b();
                        kVar.b.showInfoWindow();
                    }
                }
            });
        }
    }

    boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91940bf70b91565b19536150ab23d1b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91940bf70b91565b19536150ab23d1b9")).booleanValue();
        }
        MTMap.InfoWindowAdapter infoWindowAdapter = this.d.c.getInfoWindowAdapter();
        if (infoWindowAdapter != null) {
            return (infoWindowAdapter.getInfoWindow(c()) == null && infoWindowAdapter.getInfoContents(c()) == null) ? false : true;
        }
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void refreshInfoWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a712cffb2e1aafed68c6fff3e00ae54d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a712cffb2e1aafed68c6fff3e00ae54d");
        } else if (isInfoWindowEnable()) {
            com.sankuai.meituan.mapsdk.mapcore.utils.f.a(new Runnable() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.k.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "096105b91e40bc8debcffea864069c55", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "096105b91e40bc8debcffea864069c55");
                        return;
                    }
                    k kVar = k.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = k.a;
                    if (PatchProxy.isSupport(objArr3, kVar, changeQuickRedirect3, false, "44f1948f84b8c86a0880cb9dc48ce2ac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, kVar, changeQuickRedirect3, false, "44f1948f84b8c86a0880cb9dc48ce2ac");
                    } else if (kVar.b != null) {
                        if (TextUtils.isEmpty(kVar.getTitle()) && TextUtils.isEmpty(kVar.getSnippet()) && !kVar.a()) {
                            kVar.b.hideInfoWindow();
                            return;
                        }
                        kVar.b();
                        kVar.b.refreshInfoWindow();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void hideInfoWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04b1e859463589d32f471850803e658b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04b1e859463589d32f471850803e658b");
        } else {
            this.b.hideInfoWindow();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isInfoWindowShown() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b3876b210e882751022198b04bbee0e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b3876b210e882751022198b04bbee0e")).booleanValue() : this.b.isInfoWindowShown();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final boolean isVisible() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "338e1dde8cba22303dc396b2503f390e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "338e1dde8cba22303dc396b2503f390e")).booleanValue() : this.b.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bef180c2fcc961e75a57b57cda9ea323", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bef180c2fcc961e75a57b57cda9ea323");
            return;
        }
        if (!z) {
            this.j = this.b.isInfoWindowShown();
            hideInfoWindow();
        } else if (this.j) {
            showInfoWindow();
        }
        this.b.setVisible(z);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setRotateAngle(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23b5e44c26962ec3f7dd3c2bdad5685c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23b5e44c26962ec3f7dd3c2bdad5685c");
        } else if (this.f != null) {
            BitmapDescriptor a2 = this.f.a(f);
            if (a2 != null) {
                setIcon(a2);
            }
            this.b.setRotation(0.0f);
        } else {
            this.b.setRotation(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final float getRotateAngle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74b4451a353d1649529156b6cc39d869", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74b4451a353d1649529156b6cc39d869")).floatValue() : this.b.getRotation();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    @Deprecated
    public final void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aff4050265e4c46000250a1981e67db2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aff4050265e4c46000250a1981e67db2");
        } else {
            remove();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void startAnimation(Animation animation) {
        Object[] objArr = {animation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1d3ef571e57371de8210eeca8695226", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1d3ef571e57371de8210eeca8695226");
            return;
        }
        com.tencent.tencentmap.mapsdk.maps.model.Animation a2 = a.a(animation);
        if (a2 != null) {
            final Animation.AnimationListener animationListener = animation.getAnimationListener();
            if (animationListener != null) {
                a2.setAnimationListener(new AnimationListener() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.k.3
                    public static ChangeQuickRedirect a;

                    @Override // com.tencent.tencentmap.mapsdk.maps.model.AnimationListener
                    public final void onAnimationStart() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e664261f2bbe6c5982b195d2be7e6de", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e664261f2bbe6c5982b195d2be7e6de");
                        } else {
                            animationListener.onAnimationStart();
                        }
                    }

                    @Override // com.tencent.tencentmap.mapsdk.maps.model.AnimationListener
                    public final void onAnimationEnd() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82afc9d12f5fea2961bc184a0f5b9ed8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82afc9d12f5fea2961bc184a0f5b9ed8");
                        } else {
                            animationListener.onAnimationEnd();
                        }
                    }
                });
            }
            this.b.setAnimation(a2);
            this.b.startAnimation();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final float getZIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feb715a7d70b50a7e36611ec5bd0c08a", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feb715a7d70b50a7e36611ec5bd0c08a")).floatValue() : this.b.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b8ecb6f8d9c6b974dae9b2c2e106b04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b8ecb6f8d9c6b974dae9b2c2e106b04");
        } else {
            this.b.setZIndex(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setPositionByPixels(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "568a0cca3f8906d507c29897b783dab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "568a0cca3f8906d507c29897b783dab1");
            return;
        }
        try {
            this.b.setFixingPoint(i, i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fa1950f8ff366b891a1d0a436ab5491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fa1950f8ff366b891a1d0a436ab5491");
            return;
        }
        this.b.setClickable(z);
        this.h = z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5c0fdd8ffe813097440ef13140358a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5c0fdd8ffe813097440ef13140358a3");
            return;
        }
        if (!z && isInfoWindowShown()) {
            hideInfoWindow();
        }
        this.b.setInfoWindowEnable(z);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isInfoWindowEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0818d19260f524ee339bb2aab211311d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0818d19260f524ee339bb2aab211311d")).booleanValue() : this.b.isInfoWindowEnable();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final Object getPlatformMarker() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4c6e03d8042ea65ca1ecbadc38c767d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4c6e03d8042ea65ca1ecbadc38c767d")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.b.equals(((k) obj).b);
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d498833eba0549d138673673c94cedaf", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d498833eba0549d138673673c94cedaf")).intValue() : this.b.hashCode();
    }

    void b() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cb73faf1877986c9ab08bbe5a4784ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cb73faf1877986c9ab08bbe5a4784ab");
            return;
        }
        MTMap.InfoWindowAdapter infoWindowAdapter = this.d.c.getInfoWindowAdapter();
        if (infoWindowAdapter == null || (infoWindowAdapter.getInfoWindow(c()) == null && infoWindowAdapter.getInfoContents(c()) == null)) {
            z = true;
        }
        if (z && this.e.isDefaultInfoWindowEnable() && this.i != null) {
            if (this.c == null) {
                this.c = new DefaultInfoWindowView(this.i);
            }
            this.c.setTitle(getTitle());
            this.c.setSnippet(getSnippet());
            infoWindowAdapter = new MTMap.InfoWindowAdapter() { // from class: com.sankuai.meituan.mapsdk.tencentadapter.k.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.InfoWindowAdapter
                public final View getInfoContents(com.sankuai.meituan.mapsdk.maps.model.Marker marker) {
                    return null;
                }

                @Override // com.sankuai.meituan.mapsdk.maps.MTMap.InfoWindowAdapter
                public final View getInfoWindow(com.sankuai.meituan.mapsdk.maps.model.Marker marker) {
                    Object[] objArr2 = {marker};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1c01e1f28127f6ca863bc2a39521e0e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1c01e1f28127f6ca863bc2a39521e0e") : k.this.c;
                }
            };
        }
        this.d.a(infoWindowAdapter);
    }

    private com.sankuai.meituan.mapsdk.maps.model.Marker c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c18df4531d0526fb1290b56023d2e76", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.mapsdk.maps.model.Marker) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c18df4531d0526fb1290b56023d2e76") : new com.sankuai.meituan.mapsdk.maps.model.Marker(this);
    }
}
