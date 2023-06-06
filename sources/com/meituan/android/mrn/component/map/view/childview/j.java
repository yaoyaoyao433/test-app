package com.meituan.android.mrn.component.map.view.childview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.facebook.react.bridge.ReadableMap;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlay;
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
/* loaded from: classes2.dex */
public final class j extends com.facebook.react.views.view.f implements d {
    public static ChangeQuickRedirect a;
    public MTMap b;
    public GroundOverlay c;
    private float d;
    private Bitmap e;
    private boolean f;
    private LatLngBounds g;

    public j(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5c6371862676e9e66fec51185cb2ed8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5c6371862676e9e66fec51185cb2ed8");
            return;
        }
        this.d = 0.0f;
        this.f = true;
    }

    public static /* synthetic */ GroundOverlay a(j jVar, GroundOverlay groundOverlay) {
        jVar.c = null;
        return null;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "007f76cb047d8d6c7001846e4ebdab4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "007f76cb047d8d6c7001846e4ebdab4d");
        } else if (this.b == null || this.c != null) {
        } else {
            GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
            groundOverlayOptions.transparency(this.d).image(BitmapDescriptorFactory.fromBitmap(this.e)).visible(this.f);
            if (this.g != null) {
                groundOverlayOptions.positionFromBounds(this.g);
            } else {
                com.meituan.android.mrn.component.map.utils.e.a(new RuntimeException("Map sdk error! GroundOverlayOptions is bouns null." + toString()), "other");
            }
            this.c = this.b.addGroundOverlay(groundOverlayOptions);
            if (this.c == null) {
                com.meituan.android.mrn.component.map.utils.e.a(new RuntimeException("Map sdk error! groundOverlay is null :" + toString()), "other");
            }
        }
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final void a(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84e2861bcc12c42883cb30dd25fa4f65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84e2861bcc12c42883cb30dd25fa4f65");
        } else if (this.c != null) {
            this.c.remove();
            this.c = null;
            this.b = null;
        }
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final com.sankuai.meituan.mapsdk.maps.interfaces.l getFeature() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c107b803b9ef0789dad887563aa3d2c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.maps.interfaces.l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c107b803b9ef0789dad887563aa3d2c2");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.getMapElement();
    }

    public final void setConfig(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70aa6fc8116723bbffae541136eb227b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70aa6fc8116723bbffae541136eb227b");
        } else if (readableMap == null) {
        } else {
            if (readableMap.hasKey("bounds")) {
                this.g = com.meituan.android.mrn.component.map.utils.a.c(readableMap.getMap("bounds"));
            }
            if (this.g == null) {
                com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("MRNGroundOverlay must has bounds"), "param");
                return;
            }
            if (readableMap.hasKey("alpha")) {
                float f = (float) readableMap.getDouble("alpha");
                if (f < 0.0f) {
                    f = 0.0f;
                } else if (f > 1.0f) {
                    f = 1.0f;
                }
                this.d = 1.0f - f;
            }
            if (readableMap.hasKey("visible")) {
                this.f = readableMap.getBoolean("visible");
            }
            com.meituan.android.mrn.component.map.utils.c.a(getContext()).a(readableMap.hasKey(RemoteMessageConst.Notification.ICON) ? readableMap.getString(RemoteMessageConst.Notification.ICON) : null, new Target() { // from class: com.meituan.android.mrn.component.map.view.childview.j.1
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afa3ec61df8b513b304a3c16f3413770", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afa3ec61df8b513b304a3c16f3413770");
                    } else {
                        j.this.a();
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5825164c75cb256fe92c767922845a7f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5825164c75cb256fe92c767922845a7f");
                    } else if (bitmap == null) {
                        com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("MRNGroundOverlay image is invalid"), "param");
                    } else {
                        j.this.e = bitmap;
                        if (j.this.c != null) {
                            j.this.c.remove();
                            j.a(j.this, (GroundOverlay) null);
                        }
                        j.this.a();
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }
            });
        }
    }
}
