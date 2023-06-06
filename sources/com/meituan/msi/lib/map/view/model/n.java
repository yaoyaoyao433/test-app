package com.meituan.msi.lib.map.view.model;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.SparseArray;
import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.lib.map.view.model.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n {
    public static ChangeQuickRedirect a;
    final MsiContext b;
    private final MTMap c;
    private final JsonObject d;
    private final com.meituan.msi.lib.map.view.map.b e;
    private final BitmapDescriptor f;

    public static /* synthetic */ void a(n nVar, m mVar, JsonObject jsonObject) {
        Object[] objArr = {mVar, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, nVar, changeQuickRedirect, false, "22d6ce578e5793c85e3c83d3cfe8900f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, nVar, changeQuickRedirect, false, "22d6ce578e5793c85e3c83d3cfe8900f");
            return;
        }
        try {
            if (jsonObject.has("customCallout")) {
                JsonObject asJsonObject = jsonObject.get("customCallout").getAsJsonObject();
                nVar.a(mVar, asJsonObject);
                nVar.a(mVar, jsonObject, asJsonObject);
            } else if (jsonObject.has("callout")) {
                JsonObject asJsonObject2 = jsonObject.get("callout").getAsJsonObject();
                nVar.a(mVar, asJsonObject2);
                nVar.a(mVar, jsonObject, asJsonObject2);
            } else if (jsonObject.has("title")) {
                String asString = jsonObject.get("title").getAsString();
                Object[] objArr2 = {asString};
                ChangeQuickRedirect changeQuickRedirect2 = m.a;
                if (PatchProxy.isSupport(objArr2, mVar, changeQuickRedirect2, false, "ad3b2819224957618de2733e1dc3cb6b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, mVar, changeQuickRedirect2, false, "ad3b2819224957618de2733e1dc3cb6b");
                    return;
                }
                mVar.f = asString;
                if (mVar.d != null) {
                    mVar.d.setTitle(asString);
                }
            } else {
                mVar.d();
            }
        } catch (Exception unused) {
        }
    }

    public n(com.meituan.msi.lib.map.view.map.b bVar, MsiContext msiContext, JsonObject jsonObject) {
        Object[] objArr = {bVar, msiContext, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "706c1e6bff427de06babad8749b9f046", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "706c1e6bff427de06babad8749b9f046");
            return;
        }
        this.f = BitmapDescriptorFactory.fromResource(R.drawable.mmp_pixel1);
        this.c = bVar.getMtMap();
        this.b = msiContext;
        this.d = jsonObject;
        this.e = bVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad5e0e211e8db396351bbab7e93866b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad5e0e211e8db396351bbab7e93866b1");
            return;
        }
        if (this.d.has(KNBConfig.CONFIG_CLEAR_CACHE) && this.d.get(KNBConfig.CONFIG_CLEAR_CACHE).getAsBoolean()) {
            this.e.a(this.e, this.d, true);
        }
        if (this.d.has("markers")) {
            JsonArray asJsonArray = this.d.get("markers").getAsJsonArray();
            for (int i = 0; i < asJsonArray.size(); i++) {
                a(asJsonArray.get(i).getAsJsonObject());
            }
        }
    }

    private void a(final JsonObject jsonObject) {
        JsonObject asJsonObject;
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957ab472da41705e5a7d5aa96ba96eab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957ab472da41705e5a7d5aa96ba96eab");
        } else if (this.c != null && jsonObject.has("id")) {
            SparseArray<m> markers = this.e.getMarkers();
            LatLng b = com.meituan.msi.lib.map.utils.e.b(jsonObject);
            if (b == null) {
                return;
            }
            final m mVar = new m(this.c);
            mVar.e = b;
            int asInt = jsonObject.get("id").getAsInt();
            m mVar2 = markers.get(asInt);
            if (mVar2 != null) {
                mVar2.b();
            }
            mVar.p = asInt;
            mVar.m = jsonObject;
            mVar.a(jsonObject);
            JsonObject asJsonObject2 = jsonObject.has("anchor") ? jsonObject.get("anchor").getAsJsonObject() : null;
            if (asJsonObject2 != null) {
                mVar.a(asJsonObject2.has(Constants.GestureMoveEvent.KEY_X) ? asJsonObject2.get(Constants.GestureMoveEvent.KEY_X).getAsFloat() : 0.5f, asJsonObject2.has(Constants.GestureMoveEvent.KEY_Y) ? asJsonObject2.get(Constants.GestureMoveEvent.KEY_Y).getAsFloat() : 1.0f);
            }
            if (jsonObject.has("offset") && (asJsonObject = jsonObject.get("offset").getAsJsonObject()) != null) {
                mVar.b(asJsonObject.has(Constants.GestureMoveEvent.KEY_X) ? asJsonObject.get(Constants.GestureMoveEvent.KEY_X).getAsInt() : 0, asJsonObject.has(Constants.GestureMoveEvent.KEY_Y) ? asJsonObject.get(Constants.GestureMoveEvent.KEY_Y).getAsInt() : 0);
            }
            if (jsonObject.has("zIndex")) {
                mVar.g = jsonObject.get("zIndex").getAsFloat() + 2.0f;
            }
            if (jsonObject.has(AnimationViewCommandModel.Rotation)) {
                mVar.i = jsonObject.get(AnimationViewCommandModel.Rotation).getAsFloat();
            }
            if (jsonObject.has("clickable")) {
                mVar.a(jsonObject.get("clickable").getAsBoolean());
            }
            if (jsonObject.has("alpha")) {
                mVar.n = jsonObject.get("alpha").getAsFloat();
            }
            if (jsonObject.has("name")) {
                JsonObject asJsonObject3 = jsonObject.get("name").getAsJsonObject();
                m.a aVar = new m.a();
                if (asJsonObject3.has("text")) {
                    aVar.b = asJsonObject3.get("text").getAsString();
                }
                if (asJsonObject3.has(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE)) {
                    aVar.c = com.meituan.msi.util.f.a(asJsonObject3.get(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE).getAsInt());
                }
                if (asJsonObject3.has("color")) {
                    aVar.d = com.meituan.msi.lib.map.utils.a.a(asJsonObject3.get("color").getAsString(), "markerNameColor");
                }
                if (asJsonObject3.has("offsetX")) {
                    aVar.e = com.meituan.msi.util.f.b(asJsonObject3.get("offsetX").getAsFloat());
                }
                if (asJsonObject3.has("offsetY")) {
                    aVar.f = com.meituan.msi.util.f.b(asJsonObject3.get("offsetY").getAsFloat());
                }
                if (asJsonObject3.has("allowOverlap")) {
                    aVar.h = asJsonObject3.get("allowOverlap").getAsBoolean();
                }
                if (asJsonObject3.has("ignorePlacement")) {
                    aVar.g = asJsonObject3.get("ignorePlacement").getAsBoolean();
                }
                if (asJsonObject3.has("strokeWidth")) {
                    aVar.i = com.meituan.msi.util.f.a(asJsonObject3.get("strokeWidth").getAsInt());
                }
                if (asJsonObject3.has("strokeColor")) {
                    aVar.j = com.meituan.msi.lib.map.utils.a.a(asJsonObject3.get("strokeColor").getAsString(), "nameStrokeColor");
                }
                if (asJsonObject3.has("aroundIcon")) {
                    aVar.a(asJsonObject3.get("aroundIcon").getAsString());
                }
                if (asJsonObject3.has("optional")) {
                    aVar.l = asJsonObject3.get("optional").getAsBoolean();
                }
                if (asJsonObject3.has("order")) {
                    aVar.m = asJsonObject3.get("order").getAsFloat();
                }
                mVar.j = aVar;
            }
            if (jsonObject.has("allowOverlap")) {
                mVar.k = jsonObject.get("allowOverlap").getAsBoolean();
            }
            if (jsonObject.has("ignorePlacement")) {
                mVar.l = jsonObject.get("ignorePlacement").getAsBoolean();
            }
            if (jsonObject.has("sharedLayer")) {
                mVar.q = jsonObject.get("sharedLayer").getAsBoolean();
            }
            mVar.h = 2;
            String asString = jsonObject.has("iconPath") ? jsonObject.get("iconPath").getAsString() : "";
            if (!TextUtils.isEmpty(asString)) {
                mVar.a(this.f);
            }
            mVar.e();
            markers.put(asInt, mVar);
            com.meituan.msi.lib.map.utils.c.a(this.b.getActivity()).a(this.b, asString, "marker", new Target() { // from class: com.meituan.msi.lib.map.view.model.n.1
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "527502ae2658895018390c8f87d7f70b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "527502ae2658895018390c8f87d7f70b");
                        return;
                    }
                    int a2 = jsonObject.has("width") ? com.meituan.msi.util.f.a(jsonObject.get("width").getAsInt()) : -1;
                    int a3 = jsonObject.has("height") ? com.meituan.msi.util.f.a(jsonObject.get("height").getAsInt()) : -1;
                    if (a2 == -1) {
                        a2 = com.meituan.msi.util.f.a(bitmap.getWidth());
                    }
                    if (a3 == -1) {
                        a3 = com.meituan.msi.util.f.a(bitmap.getHeight());
                    }
                    mVar.a(BitmapDescriptorFactory.fromBitmap(com.meituan.msi.lib.map.utils.c.a(bitmap, a2, a3)));
                    n.a(n.this, mVar, jsonObject);
                    mVar.f();
                    n.this.b.onSuccess(null);
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8db1e0b3abed030082c78c1eda90acaf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8db1e0b3abed030082c78c1eda90acaf");
                        return;
                    }
                    n.a(n.this, mVar, jsonObject);
                    mVar.a(BitmapDescriptorFactory.defaultMarker());
                    mVar.f();
                    n.this.b.onError(1201, "marker icon bitmap load fail");
                }
            });
        }
    }

    private void a(m mVar, JsonObject jsonObject) {
        int i;
        Object[] objArr = {mVar, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "638a7bf181dbca34ec00ba6cdadc80b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "638a7bf181dbca34ec00ba6cdadc80b6");
            return;
        }
        if (jsonObject != null) {
            i = com.meituan.msi.util.f.a(jsonObject.has("anchorX") ? jsonObject.get("anchorX").getAsInt() : 0);
            r8 = com.meituan.msi.util.f.a(jsonObject.has("anchorY") ? jsonObject.get("anchorY").getAsInt() : 0);
        } else {
            i = 0;
        }
        if (i == 0 && r8 == 0) {
            return;
        }
        mVar.a(i, r8);
    }

    private void a(m mVar, JsonObject jsonObject, JsonObject jsonObject2) {
        Object[] objArr = {mVar, jsonObject, jsonObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76252c4dc3711433828b62768778ed30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76252c4dc3711433828b62768778ed30");
            return;
        }
        mVar.a(jsonObject);
        boolean z = mVar.c;
        if (jsonObject2 == null) {
            return;
        }
        if (jsonObject2.has("display") && TextUtils.equals("ALWAYS", jsonObject2.get("display").getAsString())) {
            mVar.c();
            mVar.b = "ALWAYS";
            return;
        }
        if (z) {
            mVar.c();
        }
        mVar.b = "BYCLICK";
    }
}
