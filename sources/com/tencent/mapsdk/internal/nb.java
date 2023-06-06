package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.map.lib.models.GroundOverlayInfo;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.GroundOverlayOptions;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class nb extends GroundOverlayInfo implements mr {
    GroundOverlayOptions a;

    public nb(Context context, GroundOverlayOptions groundOverlayOptions) {
        if (groundOverlayOptions == null) {
            return;
        }
        this.a = groundOverlayOptions;
        BitmapDescriptor bitmap = this.a.getBitmap();
        if (bitmap != null) {
            Bitmap bitmap2 = bitmap.getBitmap(context);
            if (bitmap2 != null) {
                this.mBitmapWidth = bitmap2.getWidth();
                this.mBitmapHeight = bitmap2.getHeight();
            }
            this.mBitmap = bitmap2;
        }
        this.mAlpha = groundOverlayOptions.getAlpha();
        this.mVisibility = groundOverlayOptions.isVisible();
        this.mLevel = groundOverlayOptions.getLevel();
        this.mZIndex = groundOverlayOptions.getZIndex();
        if (groundOverlayOptions.getPosition() != null) {
            a();
        }
        if (groundOverlayOptions.getLatLngBounds() != null) {
            LatLngBounds latLngBounds = groundOverlayOptions.getLatLngBounds();
            Parcel obtain = Parcel.obtain();
            obtain.writeParcelable(latLngBounds, 0);
            obtain.setDataPosition(0);
            Parcelable readParcelable = obtain.readParcelable(latLngBounds.getClass().getClassLoader());
            obtain.recycle();
            this.mLatLngBounds = (LatLngBounds) readParcelable;
        }
    }

    private GroundOverlayOptions b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.a.getPosition() == null) {
            return;
        }
        float max = Math.max(0.0f, Math.min(1.0f, this.a.getAnchorU()));
        float max2 = Math.max(0.0f, Math.min(1.0f, this.a.getAnchorV()));
        double pow = Math.pow(2.0d, 20.0f - Math.max(3.0f, Math.min(22.0f, this.a.getZoom())));
        fx fxVar = new fx(2.68435456E8d);
        fm c = fxVar.c(this.a.getPosition());
        this.mLatLngBounds = LatLngBounds.builder().include(fxVar.b(new fm(c.a - ((this.mBitmapWidth * max) * pow), c.b - ((this.mBitmapHeight * max2) * pow)))).include(fxVar.b(new fm(c.a + (this.mBitmapWidth * (1.0d - max) * pow), c.b + (this.mBitmapHeight * (1.0d - max2) * pow)))).build();
    }
}
