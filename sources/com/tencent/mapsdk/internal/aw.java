package com.tencent.mapsdk.internal;

import android.content.Context;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Collision;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.Marker;
import com.tencent.tencentmap.mapsdk.maps.model.MarkerOptions;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class aw extends av<ao> implements Marker {
    public ao a;

    public aw(ao aoVar) {
        this.a = aoVar;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setOnTapMapViewBubbleHidden(boolean z) {
        this.a.a(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean onTapMapViewBubbleHidden() {
        return this.a.onTapMapViewBubbleHidden();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setPosition(LatLng latLng) {
        if (this.a == null || latLng == null) {
            return;
        }
        this.a.setPosition(latLng);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setInfoWindowEnable(boolean z) {
        if (this.a == null) {
            return;
        }
        this.a.setInfoWindowEnable(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean isInfoWindowEnable() {
        return this.a.isInfoWindowEnable();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setInMapCenterState(boolean z) {
        if (this.a == null) {
            return;
        }
        this.a.setInMapCenterState(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean isInMapCenterState() {
        return this.a.isInMapCenterState();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final LatLng getPosition() {
        return this.a.getPosition();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setTitle(String str) {
        if (this.a == null) {
            return;
        }
        this.a.setTitle(str);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final String getTitle() {
        return this.a.getTitle();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setSnippet(String str) {
        if (this.a == null) {
            return;
        }
        this.a.setSnippet(str);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final String getSnippet() {
        return this.a.getSnippet();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Alphable
    public final float getAlpha() {
        return this.a.getAlpha();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Draggable
    public final void setDraggable(boolean z) {
        if (this.a == null) {
            return;
        }
        this.a.setDraggable(z);
        this.a.setFixingPointEnable(!z && this.a.b());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Draggable
    public final boolean isDraggable() {
        return this.a.isDraggable();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void showInfoWindow() {
        if (this.a == null) {
            return;
        }
        this.a.showInfoWindow();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void refreshInfoWindow() {
        if (this.a == null) {
            return;
        }
        this.a.refreshInfoWindow();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void hideInfoWindow() {
        if (this.a == null) {
            return;
        }
        this.a.hideInfoWindow();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean isInfoWindowShown() {
        if (this.a == null) {
            return false;
        }
        return this.a.isInfoWindowShown();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Anchorable
    public final void setAnchor(float f, float f2) {
        if (this.a == null) {
            return;
        }
        this.a.setAnchor(f, f2);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setIcon(BitmapDescriptor bitmapDescriptor) {
        if (this.a == null) {
            return;
        }
        this.a.setIcon(bitmapDescriptor);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Rotatable
    public final void setRotation(float f) {
        if (this.a == null) {
            return;
        }
        this.a.setRotation(f);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Rotatable
    public final float getRotation() {
        if (this.a == null) {
            return 0.0f;
        }
        return this.a.getRotation();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void setAnimation(Animation animation) {
        if (this.a == null || animation == null) {
            return;
        }
        this.a.setAnimation(animation);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final boolean startAnimation() {
        if (this.a == null) {
            return false;
        }
        return this.a.startAnimation();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Animationable
    public final void startAnimation(Animation animation) {
        setAnimation(animation);
        startAnimation();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Alphable
    public final void setAlpha(float f) {
        if (this.a == null) {
            return;
        }
        this.a.setAlpha(f);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final void setClickable(boolean z) {
        if (this.a == null) {
            return;
        }
        this.a.setClickable(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Clickable
    public final boolean isClickable() {
        if (this.a == null) {
            return false;
        }
        return this.a.isClickable();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setFixingPointEnable(boolean z) {
        this.a.setFixingPointEnable(z);
        if (this.a.isDraggable()) {
            setDraggable(!z);
        }
        if (z) {
            return;
        }
        this.a.setPosition(this.a.getPosition());
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setFixingPoint(int i, int i2) {
        this.a.setFixingPoint(i, i2);
        this.a.setDraggable(false);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setMarkerOptions(MarkerOptions markerOptions) {
        if (markerOptions == null) {
            return;
        }
        this.a.setMarkerOptions(markerOptions);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final MarkerOptions getOptions() {
        return this.a.getOptions();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setFastLoad(boolean z) {
        this.a.setFastLoad(z);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean isFastLoad() {
        if (this.a == null) {
            return false;
        }
        return this.a.isFastLoad();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final int getWidth(Context context) {
        if (this.a == null) {
            return 0;
        }
        return this.a.getWidth(context);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final int getHeight(Context context) {
        if (this.a == null) {
            return 0;
        }
        return this.a.getHeight(context);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Anchorable
    public final float getAnchorU() {
        return this.a.getAnchorU();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Anchorable
    public final float getAnchorV() {
        return this.a.getAnchorV();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final int getDisplayLevel() {
        return this.a.getDisplayLevel();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final boolean isInfoWindowAutoOverturn() {
        return this.a.isInfoWindowAutoOverturn();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final TencentMap.OnMarkerDragListener getOnDragListener() {
        return this.a.getOnDragListener();
    }

    private ao b() {
        return this.a;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final void setTag(Object obj) {
        this.a.setTag(obj);
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Tagable
    public final Object getTag() {
        return this.a.getTag();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setInfoWindowAnchor(float f, float f2) {
        if (this.a == null) {
            return;
        }
        this.a.setInfoWindowAnchor(f, f2);
        refreshInfoWindow();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Marker
    public final void setInfoWindowOffset(int i, int i2) {
        if (this.a == null) {
            return;
        }
        this.a.setInfoWindowOffset(i, i2);
        refreshInfoWindow();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Accessible
    public final void setContentDescription(String str) {
        if (this.a != null) {
            this.a.setContentDescription(str);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Accessible
    public final String getContentDescription() {
        if (this.a != null) {
            return this.a.getContentDescription();
        }
        return null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Collisionable
    public final void setCollisions(Collision... collisionArr) {
        if (this.a != null) {
            this.a.setCollisions(collisionArr);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Collisionable
    public final boolean isCollisionBy(Collision collision) {
        if (this.a != null) {
            return this.a.isCollisionBy(collision);
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.av
    public final /* bridge */ /* synthetic */ ao f_() {
        return this.a;
    }
}
