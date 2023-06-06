package com.meituan.msi.lib.map.view.model;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.gson.JsonObject;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.lib.map.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.GroundOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a;
    final MsiContext b;
    final Map<String, i> c;
    String d;
    public int e;
    private final MTMap f;
    private final JsonObject g;

    public j(MTMap mTMap, MsiContext msiContext, JsonObject jsonObject, HashMap<String, i> hashMap) {
        Object[] objArr = {mTMap, msiContext, jsonObject, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "908a34734bcc6641480a71c8a780c3ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "908a34734bcc6641480a71c8a780c3ca");
            return;
        }
        this.e = 0;
        this.f = mTMap;
        this.b = msiContext;
        this.c = hashMap;
        this.g = jsonObject;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5bfbe6e4302b4207ea4a0eec9d11fb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5bfbe6e4302b4207ea4a0eec9d11fb6");
        } else if (this.f == null) {
            this.b.onError(1201, "MTMap is null");
        } else if (!this.g.has("id")) {
            this.b.onError(1201, "id is null");
        } else {
            this.d = this.g.get("id").getAsString();
            final boolean containsKey = this.c.containsKey(this.d);
            if (3 == this.e) {
                a(containsKey, this.d);
            } else if (!containsKey && 2 == this.e) {
                this.b.onError(1201, "id not exist");
            } else if (!this.g.has(RaptorUploaderImpl.SRC) || !this.g.has("bounds")) {
                this.b.onError(1201, "src or bounds, is null");
            } else {
                LatLngBounds a2 = com.meituan.msi.lib.map.utils.e.a(this.g.get("bounds").getAsJsonObject());
                if (a2 == null) {
                    this.b.onError(1201, "bounds is unvalid");
                    return;
                }
                final i iVar = containsKey ? this.c.get(this.d) : new i(this.f);
                iVar.a(a2);
                if (this.g.has("visible")) {
                    iVar.a(this.g.get("visible").getAsBoolean());
                }
                if (this.g.has("zIndex")) {
                    iVar.a(this.g.get("zIndex").getAsFloat());
                }
                if (this.g.has("opacity")) {
                    iVar.b(this.g.get("opacity").getAsFloat());
                }
                a(iVar, this.g.get(RaptorUploaderImpl.SRC).getAsString(), new c.a() { // from class: com.meituan.msi.lib.map.view.model.j.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msi.lib.map.utils.c.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee0af22a7b22a9daf03b2cdef1a85173", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee0af22a7b22a9daf03b2cdef1a85173");
                            return;
                        }
                        if (1 == j.this.e && !containsKey) {
                            i iVar2 = iVar;
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = i.a;
                            if (PatchProxy.isSupport(objArr3, iVar2, changeQuickRedirect3, false, "9e47279e9247e38f24324e7c98dd16aa", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, iVar2, changeQuickRedirect3, false, "9e47279e9247e38f24324e7c98dd16aa");
                            } else {
                                iVar2.g = iVar2.b.addGroundOverlay(new GroundOverlayOptions().positionFromBounds(iVar2.d).image(iVar2.h).visible(iVar2.c).zIndex(iVar2.e).transparency(1.0f - iVar2.f));
                            }
                        }
                        if (iVar.g == null) {
                            j.this.b.onError(1201, "groundOverlay is null, MapSDK Error");
                            return;
                        }
                        j.this.c.put(j.this.d, iVar);
                        j.this.b.onSuccess(null);
                    }
                });
            }
        }
    }

    private void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17af214bed29575dfacb672a5cc299bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17af214bed29575dfacb672a5cc299bb");
        } else if (!z) {
            this.b.onError(1201, "id not exist");
        } else {
            this.c.get(str).a();
            this.c.remove(str);
            this.b.onSuccess(null);
        }
    }

    private void a(final i iVar, String str, final c.a aVar) {
        Object[] objArr = {iVar, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd6779fa07ebf1927f0f366186fcabb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd6779fa07ebf1927f0f366186fcabb3");
        } else {
            com.meituan.msi.lib.map.utils.c.a(this.b.getActivity()).a(this.b, str, "groundOverlay", new Target() { // from class: com.meituan.msi.lib.map.view.model.j.2
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1bfa3345978e0c8877a87dd30c7192a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1bfa3345978e0c8877a87dd30c7192a");
                        return;
                    }
                    i iVar2 = iVar;
                    BitmapDescriptor fromBitmap = BitmapDescriptorFactory.fromBitmap(bitmap);
                    Object[] objArr3 = {fromBitmap};
                    ChangeQuickRedirect changeQuickRedirect3 = i.a;
                    if (PatchProxy.isSupport(objArr3, iVar2, changeQuickRedirect3, false, "85e704c525c15a589e537329a08977e7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, iVar2, changeQuickRedirect3, false, "85e704c525c15a589e537329a08977e7");
                    } else {
                        iVar2.h = fromBitmap;
                        if (iVar2.g != null) {
                            iVar2.g.setImage(fromBitmap);
                        }
                    }
                    aVar.a();
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74d146c2d876db6cfd9d9f47b9291947", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74d146c2d876db6cfd9d9f47b9291947");
                    } else {
                        j.this.b.onError(1201, "bitmapFailed");
                    }
                }
            });
        }
    }
}
