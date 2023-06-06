package com.meituan.msi.lib.map.view.model;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.metrics.common.Constants;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.lib.map.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.DynamicMap;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;
    public com.meituan.msi.lib.map.view.map.b b;
    public MsiContext c;
    public g d;

    public h(com.meituan.msi.lib.map.view.map.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41e50586d4014b443d93174188240cb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41e50586d4014b443d93174188240cb3");
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.b = bVar;
    }

    public final void a(JsonObject jsonObject, MsiContext msiContext) {
        Object[] objArr = {jsonObject, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c35d770770edc6b69ed28fdd01f11575", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c35d770770edc6b69ed28fdd01f11575");
        } else if (!jsonObject.has("styleName")) {
            msiContext.onError(1201, "Create Fail. No StyleName");
        } else if (!jsonObject.has("type")) {
            msiContext.onError(1201, "Create Fail. No Type");
        } else if (!jsonObject.has("styleJSON")) {
            msiContext.onError(1201, "Create Fail. No StyleJson");
        } else {
            this.d = new g(this.b.getMtMap(), msiContext);
            if (this.d.a(jsonObject.get("styleName").getAsString())) {
                int asInt = jsonObject.get("type").getAsInt();
                if (asInt == 0) {
                    this.d.a();
                } else if (1 == asInt) {
                    this.d.b(jsonObject.get("styleJSON").getAsString());
                }
                msiContext.onSuccess(null);
                return;
            }
            msiContext.onError(1201, "Create DynamicMap Fail");
        }
    }

    public final void b(JsonObject jsonObject, final MsiContext msiContext) {
        int i;
        int i2;
        Object[] objArr = {jsonObject, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afe2e2864b563321fadc8945ffb878dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afe2e2864b563321fadc8945ffb878dc");
        } else if (!jsonObject.has("resources")) {
            msiContext.onError(1201, "Add Resources Fail. No Resources");
        } else {
            JsonArray asJsonArray = jsonObject.get("resources").getAsJsonArray();
            for (int i3 = 0; i3 < asJsonArray.size(); i3++) {
                JsonObject asJsonObject = asJsonArray.get(i3).getAsJsonObject();
                if (asJsonObject.has("id") && asJsonObject.has(Constants.TRAFFIC_URI)) {
                    final String asString = asJsonObject.get("id").getAsString();
                    String asString2 = asJsonObject.get(Constants.TRAFFIC_URI).getAsString();
                    if (asJsonObject.has(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE)) {
                        JsonObject asJsonObject2 = asJsonObject.get(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE).getAsJsonObject();
                        int asInt = asJsonObject2.has("width") ? asJsonObject2.get("width").getAsInt() : -1;
                        if (asJsonObject2.has("height")) {
                            i2 = asJsonObject2.get("height").getAsInt();
                            i = asInt;
                            a(msiContext, this.d, asString, asString2, i, i2, new c.a() { // from class: com.meituan.msi.lib.map.view.model.h.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.msi.lib.map.utils.c.a
                                public final void a() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "000c7f86739efccc8e1775713f0e456d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "000c7f86739efccc8e1775713f0e456d");
                                        return;
                                    }
                                    g gVar = h.this.d;
                                    String str = asString;
                                    Object[] objArr3 = {str};
                                    ChangeQuickRedirect changeQuickRedirect3 = g.a;
                                    BitmapDescriptor bitmapDescriptor = PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "44d8a1f02220b63c08f8ba6c52e40558", RobustBitConfig.DEFAULT_VALUE) ? (BitmapDescriptor) PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "44d8a1f02220b63c08f8ba6c52e40558") : gVar.e.get(str);
                                    g gVar2 = h.this.d;
                                    Object[] objArr4 = {bitmapDescriptor};
                                    ChangeQuickRedirect changeQuickRedirect4 = g.a;
                                    if (PatchProxy.isSupport(objArr4, gVar2, changeQuickRedirect4, false, "2b28838e30fc467e78134d50cbf62b92", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, gVar2, changeQuickRedirect4, false, "2b28838e30fc467e78134d50cbf62b92");
                                    } else if (bitmapDescriptor == null) {
                                        gVar2.c.onError(1201, "addDynamicMapImage bitmapDescriptor is null");
                                    } else {
                                        DynamicMap dynamicMap = gVar2.d;
                                        if (g.a(dynamicMap)) {
                                            dynamicMap.addDynamicMapImage(bitmapDescriptor);
                                        }
                                    }
                                    msiContext.onSuccess(null);
                                }
                            });
                        } else {
                            i = asInt;
                        }
                    } else {
                        i = -1;
                    }
                    i2 = -1;
                    a(msiContext, this.d, asString, asString2, i, i2, new c.a() { // from class: com.meituan.msi.lib.map.view.model.h.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msi.lib.map.utils.c.a
                        public final void a() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "000c7f86739efccc8e1775713f0e456d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "000c7f86739efccc8e1775713f0e456d");
                                return;
                            }
                            g gVar = h.this.d;
                            String str = asString;
                            Object[] objArr3 = {str};
                            ChangeQuickRedirect changeQuickRedirect3 = g.a;
                            BitmapDescriptor bitmapDescriptor = PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "44d8a1f02220b63c08f8ba6c52e40558", RobustBitConfig.DEFAULT_VALUE) ? (BitmapDescriptor) PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "44d8a1f02220b63c08f8ba6c52e40558") : gVar.e.get(str);
                            g gVar2 = h.this.d;
                            Object[] objArr4 = {bitmapDescriptor};
                            ChangeQuickRedirect changeQuickRedirect4 = g.a;
                            if (PatchProxy.isSupport(objArr4, gVar2, changeQuickRedirect4, false, "2b28838e30fc467e78134d50cbf62b92", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, gVar2, changeQuickRedirect4, false, "2b28838e30fc467e78134d50cbf62b92");
                            } else if (bitmapDescriptor == null) {
                                gVar2.c.onError(1201, "addDynamicMapImage bitmapDescriptor is null");
                            } else {
                                DynamicMap dynamicMap = gVar2.d;
                                if (g.a(dynamicMap)) {
                                    dynamicMap.addDynamicMapImage(bitmapDescriptor);
                                }
                            }
                            msiContext.onSuccess(null);
                        }
                    });
                }
            }
        }
    }

    private void a(final MsiContext msiContext, final g gVar, final String str, String str2, final int i, final int i2, final c.a aVar) {
        Object[] objArr = {msiContext, gVar, str, str2, Integer.valueOf(i), Integer.valueOf(i2), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69233ac7d9bc2569592f1bf6ba932cfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69233ac7d9bc2569592f1bf6ba932cfc");
        } else {
            com.meituan.msi.lib.map.utils.c.a(msiContext.getActivity()).a(msiContext, str2, "dynamicMap", new Target() { // from class: com.meituan.msi.lib.map.view.model.h.2
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6f07fc777dca9e113a28b7057003f48", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6f07fc777dca9e113a28b7057003f48");
                        return;
                    }
                    BitmapDescriptor fromBitmap = BitmapDescriptorFactory.fromBitmap(str, com.meituan.msi.lib.map.utils.c.a(bitmap, com.meituan.msi.util.f.a(i == -1 ? bitmap.getWidth() : i), com.meituan.msi.util.f.a(i2 == -1 ? bitmap.getHeight() : i2)));
                    g gVar2 = gVar;
                    String str3 = str;
                    Object[] objArr3 = {str3, fromBitmap};
                    ChangeQuickRedirect changeQuickRedirect3 = g.a;
                    if (PatchProxy.isSupport(objArr3, gVar2, changeQuickRedirect3, false, "f75b15aa35300678e17928d06e815ecc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, gVar2, changeQuickRedirect3, false, "f75b15aa35300678e17928d06e815ecc");
                    } else {
                        gVar2.e.put(str3, fromBitmap);
                    }
                    if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f5a3fe94377822833be138b57930ea0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f5a3fe94377822833be138b57930ea0");
                    } else {
                        msiContext.onError(1201, "Bitmap Load Fail");
                    }
                }
            });
        }
    }

    public final void c(JsonObject jsonObject, MsiContext msiContext) {
        Object[] objArr = {jsonObject, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef3e07df0b547eb3c5484ac54b492076", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef3e07df0b547eb3c5484ac54b492076");
        } else if (!jsonObject.has("geoJSON")) {
            msiContext.onError(1201, "Add GeoJSON Fail. No GeoJSON");
        } else {
            this.d.a(jsonObject.get("geoJSONKey").getAsString(), jsonObject.get("geoJSON").getAsString());
            msiContext.onSuccess(null);
        }
    }

    public final void d(JsonObject jsonObject, MsiContext msiContext) {
        Object[] objArr = {jsonObject, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a6679384f1d9e032ce3551b65903ec4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a6679384f1d9e032ce3551b65903ec4");
            return;
        }
        if (jsonObject.has("resourcesIds")) {
            JsonArray asJsonArray = jsonObject.get("resourcesIds").getAsJsonArray();
            if (asJsonArray.size() > 0) {
                for (int i = 0; i < asJsonArray.size(); i++) {
                    this.d.d(asJsonArray.get(i).getAsString());
                }
            }
        } else {
            for (String str : this.d.e.keySet()) {
                this.d.d(str);
            }
        }
        msiContext.onSuccess(null);
    }

    public final void e(JsonObject jsonObject, MsiContext msiContext) {
        Object[] objArr = {jsonObject, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "069848cac6c2e3176cddd8da1df16cdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "069848cac6c2e3176cddd8da1df16cdf");
            return;
        }
        if (jsonObject.has("geoJSONKey")) {
            this.d.c(jsonObject.get("geoJSONKey").getAsString());
        } else {
            this.d.c();
        }
        msiContext.onSuccess(null);
    }
}
