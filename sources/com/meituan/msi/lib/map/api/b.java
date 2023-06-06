package com.meituan.msi.lib.map.api;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.animation.LinearInterpolator;
import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.lib.map.MapParam;
import com.meituan.msi.lib.map.location.a;
import com.meituan.msi.lib.map.utils.c;
import com.meituan.msi.lib.map.utils.f;
import com.meituan.msi.lib.map.utils.g;
import com.meituan.msi.lib.map.utils.i;
import com.meituan.msi.lib.map.utils.j;
import com.meituan.msi.lib.map.view.model.e;
import com.meituan.msi.lib.map.view.model.f;
import com.meituan.msi.lib.map.view.model.k;
import com.meituan.msi.lib.map.view.model.l;
import com.meituan.msi.lib.map.view.model.m;
import com.meituan.msi.lib.map.view.model.o;
import com.meituan.msi.lib.map.view.model.p;
import com.meituan.msi.lib.map.view.model.q;
import com.meituan.msi.lib.map.view.model.r;
import com.meituan.msi.lib.map.view.model.s;
import com.meituan.msi.lib.map.view.model.t;
import com.meituan.passport.UserCenter;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.CameraUpdate;
import com.sankuai.meituan.mapsdk.maps.CameraUpdateFactory;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.UiSettings;
import com.sankuai.meituan.mapsdk.maps.interfaces.ac;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.CameraPosition;
import com.sankuai.meituan.mapsdk.maps.model.CircleOptions;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.LatLngBounds;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.meituan.mapsdk.maps.model.PolygonOptions;
import com.sankuai.meituan.mapsdk.maps.model.Projection;
import com.sankuai.meituan.mapsdk.maps.model.RestrictBoundsFitMode;
import com.sankuai.meituan.mapsdk.maps.model.TrafficStyle;
import com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.meituan.msi.lib.map.api.interfaces.b {
    public static ChangeQuickRedirect a;
    private final BaseMapApi b;

    public b(BaseMapApi baseMapApi) {
        Object[] objArr = {baseMapApi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a330f0da75efdee95cfb7719a292b7dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a330f0da75efdee95cfb7719a292b7dc");
        } else {
            this.b = baseMapApi;
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void addMapMarkers(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c978bb088e2f4a153c31347c7222d9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c978bb088e2f4a153c31347c7222d9a");
            return;
        }
        JsonObject a2 = a(msiContext);
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            b.a(System.currentTimeMillis(), 2);
            b.a(b, a2, msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void addMapLines(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a4d5cea8b3aa1a6df68bbaec4d9e632", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a4d5cea8b3aa1a6df68bbaec4d9e632");
            return;
        }
        JsonObject a2 = a(msiContext);
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            b.a(System.currentTimeMillis(), 3);
            List<q> polyLines = b.getPolyLines();
            Object[] objArr2 = {b, a2, polyLines, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "12ea017997e24673a7f9575caf9ce3f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "12ea017997e24673a7f9575caf9ce3f9");
                return;
            }
            com.meituan.msi.lib.map.view.map.b bVar = b;
            if (bVar.a()) {
                msiContext.onError(1201, "mapView is destroyed");
                return;
            }
            b.F = j.a(a2);
            b.a(b.F, b.G, "MTMapMSILineToNativeTime");
            new r(bVar.getMtMap(), msiContext, a2, polyLines, bVar.getFlowLines()).a();
            b.a(b.F, System.currentTimeMillis(), "MTMapMSILineReadyTime");
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void addMapCircles(MsiContext msiContext) {
        e eVar;
        int i;
        int i2 = 1;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ef115dc07bfe9f068c3aeda6637db7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ef115dc07bfe9f068c3aeda6637db7");
            return;
        }
        JsonObject a2 = a(msiContext);
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, a2, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "8547e311352140b3add7ce15dde85f5c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "8547e311352140b3add7ce15dde85f5c");
                return;
            }
            com.meituan.msi.lib.map.view.map.b bVar = b;
            if (bVar.a()) {
                msiContext.onError(1201, "mapView is destroyed");
                return;
            }
            f fVar = new f(bVar.getMtMap(), msiContext, a2, bVar.getCircles());
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = f.a;
            if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "e91b896f4ca9a2f88db5dbfd236b1f81", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "e91b896f4ca9a2f88db5dbfd236b1f81");
            } else if (fVar.d.has("circles")) {
                for (int i3 = 0; i3 < fVar.e.size(); i3++) {
                    e eVar2 = fVar.e.get(fVar.e.keyAt(i3));
                    if (eVar2 != null) {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = e.a;
                        if (PatchProxy.isSupport(objArr4, eVar2, changeQuickRedirect4, false, "236b6bda59cc37266c12b7d8d3f5e927", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, eVar2, changeQuickRedirect4, false, "236b6bda59cc37266c12b7d8d3f5e927");
                        } else if (eVar2.g != null) {
                            eVar2.g.remove();
                        }
                    }
                }
                fVar.e.clear();
                JsonArray asJsonArray = fVar.d.get("circles").getAsJsonArray();
                int i4 = 0;
                int i5 = 0;
                while (i4 < asJsonArray.size()) {
                    JsonObject asJsonObject = asJsonArray.get(i4).getAsJsonObject();
                    LatLng b2 = com.meituan.msi.lib.map.utils.e.b(asJsonObject);
                    if (b2 != null) {
                        e eVar3 = new e(fVar.b);
                        eVar3.k = asJsonObject;
                        eVar3.b = b2;
                        if (asJsonObject.has("color")) {
                            eVar3.c = com.meituan.msi.lib.map.utils.a.a(asJsonObject.get("color").getAsString(), "circleColor");
                        }
                        if (asJsonObject.has("fillColor")) {
                            eVar3.d = com.meituan.msi.lib.map.utils.a.a(asJsonObject.get("fillColor").getAsString(), "circleFillColor");
                        }
                        if (asJsonObject.has("strokeWidth")) {
                            eVar3.e = com.meituan.msi.util.f.b(asJsonObject.get("strokeWidth").getAsFloat());
                        }
                        if (asJsonObject.has("radius")) {
                            double asFloat = asJsonObject.get("radius").getAsFloat();
                            Object[] objArr5 = new Object[i2];
                            objArr5[0] = Double.valueOf(asFloat);
                            ChangeQuickRedirect changeQuickRedirect5 = e.a;
                            eVar = eVar3;
                            if (PatchProxy.isSupport(objArr5, eVar3, changeQuickRedirect5, false, "1efa7f42c5d4ea9e0400d09040fa87b8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "1efa7f42c5d4ea9e0400d09040fa87b8");
                            } else {
                                eVar.f = asFloat;
                            }
                        } else {
                            eVar = eVar3;
                        }
                        if (asJsonObject.has("level")) {
                            String asString = asJsonObject.get("level").getAsString();
                            char c = 65535;
                            int hashCode = asString.hashCode();
                            if (hashCode != -1226728996) {
                                if (hashCode != -400236222) {
                                    if (hashCode == 1906047958 && asString.equals("aboveroads")) {
                                        c = 2;
                                    }
                                } else if (asString.equals("abovebuildings")) {
                                    c = 1;
                                }
                            } else if (asString.equals("abovelabels")) {
                                c = 0;
                            }
                            switch (c) {
                                case 0:
                                    i = 2;
                                    break;
                                case 1:
                                default:
                                    i = 1;
                                    break;
                                case 2:
                                    i = 0;
                                    break;
                            }
                            eVar.h = i;
                        }
                        if (asJsonObject.has("zIndex")) {
                            eVar.i = asJsonObject.get("zIndex").getAsInt();
                        }
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = e.a;
                        if (PatchProxy.isSupport(objArr6, eVar, changeQuickRedirect6, false, "0ef1e254a50822ead4e4094dd84e98fb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, eVar, changeQuickRedirect6, false, "0ef1e254a50822ead4e4094dd84e98fb");
                        } else {
                            eVar.g = eVar.j.addCircle(new CircleOptions().center(eVar.b).radius(eVar.f).strokeWidth(eVar.e).fillColor(eVar.d).strokeColor(eVar.c).level(eVar.h).zIndex(eVar.i));
                        }
                        if (eVar.g == null) {
                            fVar.c.onError(1201, "Circle is null, MapSDK Error");
                        } else {
                            fVar.e.put(i5, eVar);
                            i5++;
                        }
                    }
                    i4++;
                    i2 = 1;
                }
                fVar.c.onSuccess(null);
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void addMapPolygons(MsiContext msiContext) {
        int i;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fade544597fd144bcccf6d1ea3feb481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fade544597fd144bcccf6d1ea3feb481");
            return;
        }
        JsonObject a2 = a(msiContext);
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            SparseArray<o> polygons = b.getPolygons();
            Object[] objArr2 = {b, a2, polygons, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "cef39ea8475389c51d279a038ac3f49e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "cef39ea8475389c51d279a038ac3f49e");
                return;
            }
            com.meituan.msi.lib.map.view.map.b bVar = b;
            if (bVar.a()) {
                msiContext.onError(1201, "mapView is destroyed");
                return;
            }
            p pVar = new p(bVar.getMtMap(), msiContext, a2, polygons);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = p.a;
            if (PatchProxy.isSupport(objArr3, pVar, changeQuickRedirect3, false, "6aff84b46151d531bf7f6cf20047053f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, pVar, changeQuickRedirect3, false, "6aff84b46151d531bf7f6cf20047053f");
            } else if (pVar.d.has("polygons")) {
                for (int i2 = 0; i2 < pVar.e.size(); i2++) {
                    o oVar = pVar.e.get(pVar.e.keyAt(i2));
                    if (oVar != null) {
                        oVar.a();
                    }
                }
                pVar.e.clear();
                JsonArray asJsonArray = pVar.d.get("polygons").getAsJsonArray();
                int i3 = 0;
                for (int i4 = 0; i4 < asJsonArray.size(); i4++) {
                    JsonObject asJsonObject = asJsonArray.get(i4).getAsJsonObject();
                    JsonArray asJsonArray2 = asJsonObject.get("points").getAsJsonArray();
                    if (asJsonArray2 != null) {
                        ArrayList<LatLng> arrayList = new ArrayList<>();
                        for (int i5 = 0; i5 < asJsonArray2.size(); i5++) {
                            LatLng b2 = com.meituan.msi.lib.map.utils.e.b(asJsonArray2.get(i5).getAsJsonObject());
                            if (b2 != null) {
                                arrayList.add(b2);
                            }
                        }
                        o oVar2 = new o(pVar.b);
                        oVar2.l = asJsonObject;
                        oVar2.c = arrayList;
                        int i6 = i3 + 1;
                        if (asJsonObject.has("id")) {
                            i3 = asJsonObject.get("id").getAsInt();
                        }
                        oVar2.j = i3;
                        o oVar3 = pVar.e.get(i3);
                        if (oVar3 != null) {
                            oVar3.a();
                        }
                        if (asJsonObject.has("fillColor")) {
                            oVar2.d = com.meituan.msi.lib.map.utils.a.a(asJsonObject.get("fillColor").getAsString(), "polygonFillColor");
                        }
                        if (asJsonObject.has("strokeColor")) {
                            oVar2.e = com.meituan.msi.lib.map.utils.a.a(asJsonObject.get("strokeColor").getAsString(), "polygonStrokeColor");
                        }
                        if (asJsonObject.has("strokeWidth")) {
                            oVar2.f = com.meituan.msi.util.f.b(asJsonObject.get("strokeWidth").getAsFloat());
                        }
                        if (asJsonObject.has("level")) {
                            String asString = asJsonObject.get("level").getAsString();
                            char c = 65535;
                            int hashCode = asString.hashCode();
                            if (hashCode != -1226728996) {
                                if (hashCode != -400236222) {
                                    if (hashCode == 1906047958 && asString.equals("aboveroads")) {
                                        c = 2;
                                    }
                                } else if (asString.equals("abovebuildings")) {
                                    c = 1;
                                }
                            } else if (asString.equals("abovelabels")) {
                                c = 0;
                            }
                            switch (c) {
                                case 0:
                                    i = 2;
                                    break;
                                case 1:
                                default:
                                    i = 1;
                                    break;
                                case 2:
                                    i = 0;
                                    break;
                            }
                            oVar2.g = i;
                        }
                        if (asJsonObject.has("zIndex")) {
                            oVar2.h = asJsonObject.get("zIndex").getAsInt();
                        }
                        if (asJsonObject.has("clickable")) {
                            oVar2.k = asJsonObject.get("clickable").getAsBoolean();
                        }
                        if (asJsonObject.has("dashArray")) {
                            JsonArray asJsonArray3 = asJsonObject.get("dashArray").getAsJsonArray();
                            if (asJsonArray3.size() >= 2) {
                                oVar2.m = new int[]{asJsonArray3.get(0).getAsInt(), asJsonArray3.get(1).getAsInt()};
                            }
                        }
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = o.a;
                        if (PatchProxy.isSupport(objArr4, oVar2, changeQuickRedirect4, false, "0c61b91cc7045e1fa864e674e7e4f7e1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, oVar2, changeQuickRedirect4, false, "0c61b91cc7045e1fa864e674e7e4f7e1");
                        } else {
                            oVar2.i = oVar2.b.addPolygon(new PolygonOptions().addAll(oVar2.c).fillColor(oVar2.d).strokeColor(oVar2.e).strokeWidth(oVar2.f).level(oVar2.g).clickable(oVar2.k).zIndex(oVar2.h).dashArray(oVar2.m));
                        }
                        if (oVar2.i == null) {
                            pVar.c.onError(1201, "polygon is null, MapSDK Error");
                        } else {
                            pVar.e.put(oVar2.j, oVar2);
                        }
                        i3 = i6;
                    }
                }
                pVar.c.onSuccess(null);
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void addMapHeatOverlays(MsiContext msiContext) {
        int i;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dbc9b543296961f0f7c318988f3d790", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dbc9b543296961f0f7c318988f3d790");
            return;
        }
        JsonObject a2 = a(msiContext);
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b == null) {
            return;
        }
        SparseArray<k> heatOverlays = b.getHeatOverlays();
        Object[] objArr2 = {b, a2, heatOverlays, msiContext};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
        if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "bcf93a96733cc890924b9ff73eb8adda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "bcf93a96733cc890924b9ff73eb8adda");
        } else if (b.a()) {
            msiContext.onError(1201, "mapView is destroyed");
        } else {
            l lVar = new l(b.getMtMap(), msiContext, a2, heatOverlays);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = l.a;
            if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "7da92fad429996a42d7a8d83ddc6563d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "7da92fad429996a42d7a8d83ddc6563d");
            } else if (lVar.d.has("heatOverlay")) {
                for (int i2 = 0; i2 < lVar.e.size(); i2++) {
                    k kVar = lVar.e.get(lVar.e.keyAt(i2));
                    if (kVar != null) {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = k.a;
                        if (PatchProxy.isSupport(objArr4, kVar, changeQuickRedirect4, false, "cbee71c3a6b9792eeb8650575843eb86", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, kVar, changeQuickRedirect4, false, "cbee71c3a6b9792eeb8650575843eb86");
                        } else if (kVar.b != null) {
                            kVar.b.remove();
                        }
                    }
                }
                lVar.e.clear();
                JsonArray asJsonArray = lVar.d.get("heatOverlay").getAsJsonArray();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 < asJsonArray.size()) {
                        JsonObject asJsonObject = asJsonArray.get(i3).getAsJsonObject();
                        JsonArray asJsonArray2 = asJsonObject.has("weightedData") ? asJsonObject.get("weightedData").getAsJsonArray() : null;
                        if (asJsonArray2 != null && asJsonArray2.size() != 0) {
                            int size = asJsonArray2.size();
                            ArrayList arrayList = new ArrayList(size);
                            for (int i5 = 0; i5 < size; i5++) {
                                JsonObject asJsonObject2 = asJsonArray2.get(i5).getAsJsonObject();
                                LatLng b2 = com.meituan.msi.lib.map.utils.e.b(asJsonObject2);
                                if (b2 != null && asJsonObject2.has("intensity")) {
                                    arrayList.add(new WeightedLatLng(b2, asJsonObject2.get("intensity").getAsDouble()));
                                }
                            }
                            k kVar2 = new k(lVar.b);
                            kVar2.c = arrayList;
                            if (asJsonObject.has("alpha")) {
                                kVar2.e = asJsonObject.get("alpha").getAsFloat();
                            }
                            if (asJsonObject.has("radius")) {
                                kVar2.d = asJsonObject.get("radius").getAsInt();
                            }
                            if (asJsonObject.has("gradientColors")) {
                                JsonArray asJsonArray3 = asJsonObject.get("gradientColors").getAsJsonArray();
                                int size2 = asJsonArray3.size();
                                int[] iArr = new int[size2];
                                for (int i6 = 0; i6 < size2; i6++) {
                                    iArr[i6] = com.meituan.msi.lib.map.utils.a.a(asJsonArray3.get(i6).getAsString(), "gradientColors");
                                }
                                kVar2.f = iArr;
                            }
                            if (asJsonObject.has("gradientStartPoints")) {
                                JsonArray asJsonArray4 = asJsonObject.get("gradientStartPoints").getAsJsonArray();
                                int size3 = asJsonArray4.size();
                                float[] fArr = new float[size3];
                                for (int i7 = 0; i7 < size3; i7++) {
                                    fArr[i7] = asJsonArray4.get(i7).getAsFloat();
                                }
                                kVar2.g = fArr;
                            }
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = k.a;
                            if (PatchProxy.isSupport(objArr5, kVar2, changeQuickRedirect5, false, "5c3bbf04d0a64b990ae2eef717ddbe42", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, kVar2, changeQuickRedirect5, false, "5c3bbf04d0a64b990ae2eef717ddbe42");
                            } else {
                                kVar2.b = kVar2.h.addHeatOverlay(new HeatOverlayOptions().setWeightedData(kVar2.c).setRadius(kVar2.d).setAlpha(kVar2.e).setColors(kVar2.f).setStartPoints(kVar2.g));
                            }
                            if (kVar2.b == null) {
                                lVar.c.onError(1201, "HeatOverlay is null, MapSDK Error");
                            } else {
                                if (asJsonObject.has("id")) {
                                    int asInt = asJsonObject.get("id").getAsInt();
                                    i = i4;
                                    i4 = asInt;
                                } else {
                                    i = i4 + 1;
                                }
                                lVar.e.put(i4, kVar2);
                                i4 = i;
                            }
                        }
                        i3++;
                    } else {
                        lVar.c.onSuccess(null);
                        return;
                    }
                }
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void includeMapPoints(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce972edf53417434ebbf34408217570f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce972edf53417434ebbf34408217570f");
            return;
        }
        JsonObject a2 = a(msiContext);
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            b.b(b, msiContext, a2);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void addMarkers(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1143268ff84833cbed644488359eb139", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1143268ff84833cbed644488359eb139");
            return;
        }
        JsonObject a2 = a(msiContext);
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            b.a(System.currentTimeMillis(), 2);
            b.a(b, a2, msiContext);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void moveToMapLocation(final MsiContext msiContext) {
        final boolean z = true;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ac15488366f71271fd7c0c74ed32370", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ac15488366f71271fd7c0c74ed32370");
            return;
        }
        final com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "dc23c6992fedcef82e92ae8882181ade", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "dc23c6992fedcef82e92ae8882181ade");
            } else if (b.a()) {
                msiContext.onError(1201, "MsiMapView is Destroyed");
            } else {
                final MTMap mtMap = b.getMtMap();
                z = (a2.has("animate") && a2.get("animate").getAsBoolean()) ? false : false;
                LatLng b2 = com.meituan.msi.lib.map.utils.e.b(a2);
                if (b2 == null) {
                    if (!TextUtils.isEmpty(b.k)) {
                        b2 = b.getLocationLatLng();
                        if (b2 == null) {
                            msiContext.onError(1201, "ext location is null");
                            return;
                        }
                    } else if (b.i != null) {
                        b.i.a(msiContext, new a.InterfaceC0495a() { // from class: com.meituan.msi.lib.map.view.map.b.25
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.msi.lib.map.location.a.InterfaceC0495a
                            public final void a(com.meituan.msi.api.location.a aVar, int i) {
                                Object[] objArr3 = {aVar, Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6f016cb0c5245e245cc4deaa23254224", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6f016cb0c5245e245cc4deaa23254224");
                                } else if (aVar != null) {
                                    LatLng latLng = new LatLng(aVar.h, aVar.g);
                                    if (z) {
                                        mtMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
                                    } else {
                                        mtMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                                    }
                                    msiContext.onSuccess(null);
                                } else {
                                    b.a(b.this, i);
                                    MsiContext msiContext2 = msiContext;
                                    msiContext2.onError(1201, "location is null code is " + i);
                                }
                            }
                        });
                    } else {
                        msiContext.onError(1201, "locationManager is null");
                        return;
                    }
                }
                CameraUpdate newLatLng = CameraUpdateFactory.newLatLng(b2);
                if (z) {
                    mtMap.animateCamera(newLatLng);
                } else {
                    mtMap.moveCamera(newLatLng);
                }
                msiContext.onSuccess(null);
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void getMapCenterLocation(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47b35630b3fed919ec188679cd5d6849", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47b35630b3fed919ec188679cd5d6849");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "0ce20071b3a5bbc364a60ca0c146e6aa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "0ce20071b3a5bbc364a60ca0c146e6aa");
            } else if (b.a()) {
                msiContext.onError(1201, "mapView is destroyed");
            } else {
                LatLng latLng = b.getMtMap().getCameraPosition().target;
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(Constants.PRIVACY.KEY_LATITUDE, Double.valueOf(latLng.latitude));
                jsonObject.addProperty(Constants.PRIVACY.KEY_LONGITUDE, Double.valueOf(latLng.longitude));
                msiContext.onSuccess(jsonObject);
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void getMapRegion(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b016cb8dcf9c213b1d0543abeb13adb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b016cb8dcf9c213b1d0543abeb13adb2");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "95b54ae368e504563e0b24868dd14473", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "95b54ae368e504563e0b24868dd14473");
            } else if (b.a()) {
                msiContext.onError(1201, "mapView is destroyed");
            } else {
                LatLngBounds latLngBounds = b.getMtMap().getProjection().getVisibleRegion().getLatLngBounds();
                HashMap hashMap = new HashMap();
                hashMap.put(Constants.PRIVACY.KEY_LATITUDE, Double.valueOf(latLngBounds.southwest.latitude));
                hashMap.put(Constants.PRIVACY.KEY_LONGITUDE, Double.valueOf(latLngBounds.southwest.longitude));
                HashMap hashMap2 = new HashMap();
                hashMap2.put(Constants.PRIVACY.KEY_LATITUDE, Double.valueOf(latLngBounds.northeast.latitude));
                hashMap2.put(Constants.PRIVACY.KEY_LONGITUDE, Double.valueOf(latLngBounds.northeast.longitude));
                HashMap hashMap3 = new HashMap();
                hashMap3.put("southwest", hashMap);
                hashMap3.put("northeast", hashMap2);
                msiContext.onSuccess(new JsonParser().parse(new Gson().toJson(hashMap3)).getAsJsonObject());
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void getMapScale(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66bc5fc98b4e7fc213b7d2ded05fa0eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66bc5fc98b4e7fc213b7d2ded05fa0eb");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "757e74fc058a8343c75d9a46cd21b7d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "757e74fc058a8343c75d9a46cd21b7d8");
            } else if (b.a()) {
                msiContext.onError(1201, "mapView is destroyed");
            } else {
                CameraPosition cameraPosition = b.getMtMap().getCameraPosition();
                if (cameraPosition == null) {
                    msiContext.onError(1201, "CameraPosition is null");
                    return;
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("scale", Float.valueOf(cameraPosition.zoom));
                msiContext.onSuccess(jsonObject);
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void translateMapMarker(MapParam mapParam, MsiContext msiContext) {
        int i = 0;
        Object[] objArr = {mapParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "254e8a0156acecc3ad49d9e67d3e235a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "254e8a0156acecc3ad49d9e67d3e235a");
            return;
        }
        final int a2 = this.b.a(msiContext);
        final com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a3 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a3, Integer.valueOf(a2)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "9a942e30448f9ae9efd011be898f16be", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "9a942e30448f9ae9efd011be898f16be");
            } else if (b.a()) {
                msiContext.onError(1201, "mapView is destroyed");
            } else if (!a3.has("markerId")) {
                msiContext.onError(1201, "no markerId");
            } else {
                final int asInt = a3.get("markerId").getAsInt();
                m mVar = b.getMarkers().get(asInt);
                if (mVar == null) {
                    msiContext.onError(1201, "no marker");
                    return;
                }
                JsonArray asJsonArray = a3.has("keyFrames") ? a3.get("keyFrames").getAsJsonArray() : null;
                if (asJsonArray != null) {
                    LinkedList linkedList = new LinkedList();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= asJsonArray.size()) {
                            break;
                        }
                        JsonObject asJsonObject = asJsonArray.get(i2).getAsJsonObject();
                        g.a aVar = new g.a();
                        aVar.a = asJsonObject.has("duration") ? asJsonObject.get("duration").getAsInt() : 0;
                        if (aVar.a == 0 || aVar.a < 0) {
                            aVar.a = i;
                        } else {
                            aVar.f = a3.has(AnimationViewCommandModel.Rotation) ? a3.get(AnimationViewCommandModel.Rotation).getAsFloat() : 0.0f;
                        }
                        aVar.d = asJsonObject.has(Constants.PRIVACY.KEY_LATITUDE) ? asJsonObject.get(Constants.PRIVACY.KEY_LATITUDE).getAsDouble() : 0.0d;
                        aVar.e = asJsonObject.has(Constants.PRIVACY.KEY_LONGITUDE) ? asJsonObject.get(Constants.PRIVACY.KEY_LONGITUDE).getAsDouble() : 0.0d;
                        if (com.meituan.msi.lib.map.utils.e.a(aVar.d, aVar.e)) {
                            linkedList.add(aVar);
                        }
                        i2++;
                        i = 0;
                    }
                    g.a aVar2 = new g.a();
                    if (linkedList.size() != 0) {
                        aVar2 = (g.a) linkedList.get(0);
                    }
                    aVar2.b = mVar.a().latitude;
                    aVar2.c = mVar.a().longitude;
                    int size = linkedList.size();
                    for (int i3 = 1; i3 < size; i3++) {
                        g.a aVar3 = (g.a) linkedList.get(i3 - 1);
                        g.a aVar4 = (g.a) linkedList.get(i3);
                        if (aVar3.f == 0.0f) {
                            aVar4.b = aVar3.d;
                            aVar4.c = aVar3.e;
                        } else {
                            aVar4.b = mVar.a().latitude;
                            aVar4.c = mVar.a().longitude;
                        }
                    }
                    final g gVar = new g(linkedList, mVar.d, b);
                    gVar.c.addListener(new Animator.AnimatorListener() { // from class: com.meituan.msi.lib.map.view.map.b.12
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            Object[] objArr3 = {animator};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fa5ff679547cb541c24671fb231f80db", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fa5ff679547cb541c24671fb231f80db");
                            } else {
                                b.a(b.this);
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            Object[] objArr3 = {animator};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a2df4d636ee8cea91c1f6a311faf6108", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a2df4d636ee8cea91c1f6a311faf6108");
                            } else if (b.b(b.this) == 0) {
                                JsonObject jsonObject = new JsonObject();
                                jsonObject.addProperty("markerId", Integer.valueOf(asInt));
                                jsonObject.addProperty("mapId", Integer.valueOf(a2));
                                b.this.c.a("mapMarkerTransAnimEnd", jsonObject);
                            }
                        }
                    });
                    msiContext.getActivity().runOnUiThread(new Runnable() { // from class: com.meituan.msi.lib.map.view.map.b.23
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9f1a759a7049d4f8eaa6944cd9773848", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9f1a759a7049d4f8eaa6944cd9773848");
                            } else {
                                gVar.c.start();
                            }
                        }
                    });
                } else {
                    msiContext.onError(1201, "keyFrames is null");
                }
                msiContext.onSuccess(null);
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void getMapRotate(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2be4ed87928cc6ef6843dac40ddd425", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2be4ed87928cc6ef6843dac40ddd425");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "b45ff954e0e816e325dbf825fdc24c47", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "b45ff954e0e816e325dbf825fdc24c47");
            } else if (b.a()) {
                msiContext.onError(1201, "mapView is destroyed");
            } else {
                CameraPosition cameraPosition = b.getMtMap().getCameraPosition();
                if (cameraPosition != null) {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty(AnimationViewCommandModel.Rotation, Float.valueOf(cameraPosition.bearing > 0.0f ? 360.0f - cameraPosition.bearing : 0.0f));
                    msiContext.onSuccess(jsonObject);
                    return;
                }
                msiContext.onError(1201, "map CameraPosition is null");
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void setMapCenterOffset(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "116426dbb6d397f074cd2347434bc270", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "116426dbb6d397f074cd2347434bc270");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "bff2af4475a0c506706f841aa1d09bdf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "bff2af4475a0c506706f841aa1d09bdf");
            } else if (b.a()) {
                msiContext.onError(1201, "mapView is destroyed");
            } else if (a2.has("offset")) {
                JsonElement jsonElement = a2.get("offset");
                if (b.a(jsonElement, msiContext)) {
                    float[] fArr = new float[2];
                    if (b.a(jsonElement, fArr, msiContext)) {
                        b.E = fArr;
                        b.a(fArr[0], fArr[1]);
                        msiContext.onSuccess(null);
                    }
                }
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void setMapLocMarkerIcon(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52181ed5edb4de130bef94500bb99212", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52181ed5edb4de130bef94500bb99212");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "5afc445ed5266f57508df0bfaf68d451", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "5afc445ed5266f57508df0bfaf68d451");
            } else if (msiContext != null) {
                if (a2 == null) {
                    msiContext.onError(1201, "LocMarkerIcon's Json is null");
                } else if (b.a()) {
                    msiContext.onError(1201, "mapView is destroyed");
                } else {
                    new com.meituan.msi.lib.map.location.b(a2, msiContext, b).a();
                    msiContext.onSuccess(null);
                }
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void removeMapMarkers(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52fdfde7f451941b2ad5eb3cb3f96c00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52fdfde7f451941b2ad5eb3cb3f96c00");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "823748ee5e7ed9bb939eb33875f1db6c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "823748ee5e7ed9bb939eb33875f1db6c");
            } else if (b.a()) {
            } else {
                if (a2.has("markers")) {
                    b.a(b, a2, false);
                    msiContext.onSuccess(null);
                    return;
                }
                msiContext.onError(1201, "markers is null");
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void createDynamicMap(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "113073d79f25ac6145987bceb9595cb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "113073d79f25ac6145987bceb9595cb2");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            b.a("createDynamicMap", b, msiContext, a2);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void addDynamicMapResources(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33ecb664901c4008949cf3c358172fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33ecb664901c4008949cf3c358172fae");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            b.a("addDynamicMapResources", b, msiContext, a2);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void addDynamicMapGeoJSON(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "874d7dca25adfd9fb577e6fca1a66814", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "874d7dca25adfd9fb577e6fca1a66814");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            b.a("addDynamicMapGeoJSON", b, msiContext, a2);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void removeDynamicMapResources(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2356db1080116ee38887c3980c32074", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2356db1080116ee38887c3980c32074");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            b.a("removeDynamicMapResources", b, msiContext, a2);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void removeDynamicMap(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baef41646950927ad252b8d2eb2f8280", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baef41646950927ad252b8d2eb2f8280");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            b.a("removeDynamicMap", b, msiContext, a2);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void setCamera(final MsiContext msiContext) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = true;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d4327d6f6d96258155fc0a89d8a1fce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d4327d6f6d96258155fc0a89d8a1fce");
            return;
        }
        final com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "848f90b8f30aa708547e4461f56e3ab0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "848f90b8f30aa708547e4461f56e3ab0");
            } else if (b.a()) {
                msiContext.onError(1201, "mapView is destroyed");
            } else {
                MTMap mtMap = b.getMtMap();
                LatLng b2 = com.meituan.msi.lib.map.utils.e.b(a2);
                if (b2 == null) {
                    msiContext.onError(1201, "Invalid Latitude or Longtitude");
                    return;
                }
                CameraPosition cameraPosition = mtMap.getCameraPosition();
                b.D = a2.has("scale") ? a2.get("scale").getAsFloat() : b.D;
                float asFloat = a2.has("skew") ? a2.get("skew").getAsFloat() : cameraPosition.tilt;
                float f = cameraPosition.bearing > 0.0f ? 360.0f - cameraPosition.bearing : 0.0f;
                if (a2.has(AnimationViewCommandModel.Rotation)) {
                    f = a2.get(AnimationViewCommandModel.Rotation).getAsFloat();
                }
                CameraPosition cameraPosition2 = new CameraPosition(b2, b.D, asFloat, -f);
                CameraUpdate newCameraPosition = CameraUpdateFactory.newCameraPosition(cameraPosition2);
                if (a2.has("padding")) {
                    JsonArray asJsonArray = a2.get("padding").getAsJsonArray();
                    if (asJsonArray != null && asJsonArray.size() < 4) {
                        int size = asJsonArray.size();
                        for (int i5 = 0; i5 < 4 - size; i5++) {
                            asJsonArray.add((Number) 0);
                        }
                    }
                    if (asJsonArray != null) {
                        i3 = com.meituan.msi.util.f.a(asJsonArray.get(0).getAsInt());
                        i4 = com.meituan.msi.util.f.a(asJsonArray.get(1).getAsInt());
                        i2 = com.meituan.msi.util.f.a(asJsonArray.get(2).getAsInt());
                        i = com.meituan.msi.util.f.a(asJsonArray.get(3).getAsInt());
                    } else {
                        i = 0;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                    }
                    newCameraPosition = CameraUpdateFactory.newCameraPosition(cameraPosition2, i, i3, i4, i2);
                }
                if ((a2.has("animate") && a2.get("animate").getAsBoolean()) ? false : false) {
                    mtMap.animateCamera(newCameraPosition, new MTMap.CancelableCallback() { // from class: com.meituan.msi.lib.map.view.map.b.24
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mapsdk.maps.MTMap.CancelableCallback
                        public final void onFinish() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "33594dbf99fdb64bc56a49bc1cd53284", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "33594dbf99fdb64bc56a49bc1cd53284");
                            } else {
                                msiContext.onSuccess(null);
                            }
                        }

                        @Override // com.sankuai.meituan.mapsdk.maps.MTMap.CancelableCallback
                        public final void onCancel() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "18b7430389b40b037dba8b067a2df222", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "18b7430389b40b037dba8b067a2df222");
                            } else {
                                msiContext.onError(1201, "animate cancel");
                            }
                        }
                    });
                } else {
                    mtMap.moveCamera(newCameraPosition);
                }
                msiContext.onSuccess(null);
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void getMapOptions(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dcdc570a55d07aaa229599682e5eed1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dcdc570a55d07aaa229599682e5eed1");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "e3b1557b2396d1afda7d0a8df7a575c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "e3b1557b2396d1afda7d0a8df7a575c1");
            } else if (b.a()) {
                msiContext.onError(1201, "MsiMapView is Destroyed");
            } else {
                b.z = new com.meituan.msi.lib.map.view.map.a();
                com.meituan.msi.lib.map.view.map.a aVar = b.z;
                Object[] objArr3 = {b};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msi.lib.map.view.map.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "605727ab82828aadffd093007bde9a28", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "605727ab82828aadffd093007bde9a28");
                } else {
                    MTMap mtMap = b.getMtMap();
                    UiSettings uiSettings = mtMap.getUiSettings();
                    CameraPosition cameraPosition = mtMap.getCameraPosition();
                    TrafficStyle trafficStyle = mtMap.getTrafficStyle();
                    aVar.b = mtMap.getMapType();
                    aVar.c = mtMap.getCustomMapStylePath();
                    aVar.d = mtMap.getMinZoomLevel();
                    aVar.e = mtMap.getMaxZoomLevel();
                    aVar.f = cameraPosition.target.latitude;
                    aVar.g = cameraPosition.target.longitude;
                    aVar.h = cameraPosition.zoom;
                    aVar.i = cameraPosition.tilt;
                    aVar.j = 360.0f - cameraPosition.bearing;
                    aVar.l = mtMap.isBlockedRoadShowing();
                    aVar.m = uiSettings.isCompassEnabled();
                    aVar.n = uiSettings.isScaleControlsEnabled();
                    aVar.o = uiSettings.isZoomGesturesEnabled();
                    aVar.p = uiSettings.isScrollGesturesEnabled();
                    aVar.q = uiSettings.isRotateGesturesEnabled();
                    aVar.r = uiSettings.isTiltGesturesEnabled();
                    aVar.s = uiSettings.isScaleByMapCenter();
                    aVar.t = mtMap.is3dBuildingShowing();
                    aVar.u = mtMap.isTrafficEnabled();
                    aVar.v = mtMap.isIndoorEnabled();
                    if (trafficStyle != null) {
                        Boolean isShowRoadStyle = trafficStyle.isShowRoadStyle();
                        aVar.w = isShowRoadStyle != null && isShowRoadStyle.booleanValue();
                    }
                }
                com.meituan.msi.lib.map.view.map.a aVar2 = b.z;
                ac acVar = b.B;
                Object[] objArr4 = {acVar};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msi.lib.map.view.map.a.a;
                if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "3ab96e1ce9d87efaf36c99c5f6c7cc9b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "3ab96e1ce9d87efaf36c99c5f6c7cc9b");
                } else if (acVar == ac.AMAP) {
                    aVar2.k = "gaode";
                } else if (acVar == ac.MEITUAN) {
                    aVar2.k = AbsApiFactory.PASSPORT_ONLINE_URL;
                } else {
                    aVar2.k = UserCenter.OAUTH_TYPE_QQ;
                }
                msiContext.onSuccess(new JsonParser().parse(new Gson().toJson(b.z)).getAsJsonObject());
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void selectMarkers(MsiContext msiContext) {
        int i = 1;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "989d798d33b4e8b191cb88aafa45938a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "989d798d33b4e8b191cb88aafa45938a");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "9276d97e7d098a7c6466d81409c5915b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "9276d97e7d098a7c6466d81409c5915b");
            } else if (b.a()) {
                msiContext.onError(1201, "mapView is destroyed");
            } else if (!a2.has("isSelect") || !a2.has("markerIds")) {
                msiContext.onError(1201, "Params Error");
            } else {
                boolean asBoolean = a2.get("isSelect").getAsBoolean();
                JsonArray asJsonArray = a2.get("markerIds").getAsJsonArray();
                int i2 = 0;
                while (i2 < asJsonArray.size()) {
                    int asInt = asJsonArray.get(i2).getAsInt();
                    m mVar = b.y.get(asInt);
                    if (mVar != null) {
                        Object[] objArr3 = new Object[i];
                        objArr3[0] = Byte.valueOf(asBoolean ? (byte) 1 : (byte) 0);
                        ChangeQuickRedirect changeQuickRedirect3 = m.a;
                        if (PatchProxy.isSupport(objArr3, mVar, changeQuickRedirect3, false, "22b21941ec76be7d80f5cefd5ee29d9c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, mVar, changeQuickRedirect3, false, "22b21941ec76be7d80f5cefd5ee29d9c");
                        } else {
                            mVar.o = asBoolean;
                            if (mVar.d != null) {
                                mVar.d.setSelect(mVar.o);
                            }
                        }
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.addProperty("id", Integer.valueOf(asInt));
                        msiContext.onSuccess(jsonObject);
                    } else {
                        msiContext.onError(1201, "Marker: " + asInt + "not Exist");
                    }
                    i2++;
                    i = 1;
                }
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void fromScreenLocation(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff53038aded3be8cab5bf5ca68d7475a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff53038aded3be8cab5bf5ca68d7475a");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "ccad4b68db9cf46e6b0196bdc1fef0e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "ccad4b68db9cf46e6b0196bdc1fef0e9");
            } else if (b.a()) {
                msiContext.onError(1201, "mapView is destroyed");
            } else if (!a2.has(Constants.GestureMoveEvent.KEY_X) || !a2.has(Constants.GestureMoveEvent.KEY_Y)) {
                msiContext.onError(1201, "X or Y not Exist");
            } else {
                Projection projection = b.getMtMap().getProjection();
                if (projection == null) {
                    msiContext.onError(1201, "Projection is Null");
                    return;
                }
                LatLng fromScreenLocation = projection.fromScreenLocation(new Point((int) com.meituan.msi.util.f.b(a2.get(Constants.GestureMoveEvent.KEY_X).getAsFloat()), (int) com.meituan.msi.util.f.b(a2.get(Constants.GestureMoveEvent.KEY_Y).getAsFloat())));
                if (fromScreenLocation == null) {
                    msiContext.onError(1201, "Convert Error");
                    return;
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(Constants.PRIVACY.KEY_LATITUDE, Double.valueOf(fromScreenLocation.latitude));
                jsonObject.addProperty(Constants.PRIVACY.KEY_LONGITUDE, Double.valueOf(fromScreenLocation.longitude));
                msiContext.onSuccess(jsonObject);
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void toScreenLocation(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3228ff93a10f928c113d234f1a06c76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3228ff93a10f928c113d234f1a06c76");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "f669b562bb7d075b04f9426f705fb81b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "f669b562bb7d075b04f9426f705fb81b");
            } else if (b.a()) {
                msiContext.onError(1201, "mapView is destroyed");
            } else if (!a2.has(Constants.PRIVACY.KEY_LATITUDE) || !a2.has(Constants.PRIVACY.KEY_LONGITUDE)) {
                msiContext.onError(1201, "Latitude or Longtitude not exist");
            } else {
                Projection projection = b.getMtMap().getProjection();
                if (projection == null) {
                    msiContext.onError(1201, "Projection is Null");
                    return;
                }
                Point screenLocation = projection.toScreenLocation(new LatLng(a2.get(Constants.PRIVACY.KEY_LATITUDE).getAsDouble(), a2.get(Constants.PRIVACY.KEY_LONGITUDE).getAsDouble()));
                if (screenLocation == null) {
                    msiContext.onError(1201, "Convert Error");
                    return;
                }
                float f = msiContext.getActivity().getResources().getDisplayMetrics().density;
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty(Constants.GestureMoveEvent.KEY_X, Integer.valueOf((int) (screenLocation.x / f)));
                jsonObject.addProperty(Constants.GestureMoveEvent.KEY_Y, Integer.valueOf((int) (screenLocation.y / f)));
                msiContext.onSuccess(jsonObject);
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void updateLocation(final MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6670a435cfdba10d7312d726474b7ca9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6670a435cfdba10d7312d726474b7ca9");
            return;
        }
        final com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "5bb402d654d008029723c143b9d26946", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "5bb402d654d008029723c143b9d26946");
            } else if (b.a()) {
                msiContext.onError(1201, "mapView is destroyed");
            } else if (b.i != null) {
                if (!TextUtils.isEmpty(b.k)) {
                    LatLng locationLatLng = b.getLocationLatLng();
                    if (locationLatLng != null) {
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.addProperty("code", (Number) 200);
                        jsonObject.addProperty(Constants.PRIVACY.KEY_LATITUDE, Double.valueOf(locationLatLng.latitude));
                        jsonObject.addProperty(Constants.PRIVACY.KEY_LONGITUDE, Double.valueOf(locationLatLng.longitude));
                        msiContext.onSuccess(jsonObject);
                        return;
                    }
                    return;
                }
                b.i.a(msiContext, new a.InterfaceC0495a() { // from class: com.meituan.msi.lib.map.view.map.b.19
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msi.lib.map.location.a.InterfaceC0495a
                    public final void a(com.meituan.msi.api.location.a aVar, int i) {
                        Object[] objArr3 = {aVar, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6ee65c19f16ae21f81465c1cac83c5a7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6ee65c19f16ae21f81465c1cac83c5a7");
                            return;
                        }
                        JsonObject jsonObject2 = new JsonObject();
                        if (i == 200 && aVar != null) {
                            jsonObject2.addProperty("code", (Number) 200);
                            jsonObject2.addProperty(Constants.PRIVACY.KEY_LATITUDE, Double.valueOf(aVar.h));
                            jsonObject2.addProperty(Constants.PRIVACY.KEY_LONGITUDE, Double.valueOf(aVar.g));
                            msiContext.onSuccess(jsonObject2);
                        } else if (i == 400) {
                            jsonObject2.addProperty("code", (Number) 400);
                            msiContext.onSuccess(jsonObject2);
                        } else if (i == 401) {
                            jsonObject2.addProperty("code", (Number) 401);
                            msiContext.onSuccess(jsonObject2);
                        }
                    }
                });
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void getAllOverlays(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "426b80523f44d9af48beea6ec9ff3710", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "426b80523f44d9af48beea6ec9ff3710");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "5fd4f8898392776b50a65a65be9490fe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "5fd4f8898392776b50a65a65be9490fe");
                return;
            }
            SparseArray<m> markers = b.getMarkers();
            SparseArray<e> circles = b.getCircles();
            List<q> polyLines = b.getPolyLines();
            List<q> flowLines = b.getFlowLines();
            SparseArray<o> polygons = b.getPolygons();
            JsonArray jsonArray = new JsonArray();
            JsonArray jsonArray2 = new JsonArray();
            JsonArray jsonArray3 = new JsonArray();
            JsonArray jsonArray4 = new JsonArray();
            for (int i = 0; i < markers.size(); i++) {
                jsonArray.add(markers.get(markers.keyAt(i)).m);
            }
            for (int i2 = 0; i2 < circles.size(); i2++) {
                jsonArray2.add(circles.get(circles.keyAt(i2)).k);
            }
            for (int i3 = 0; i3 < polyLines.size(); i3++) {
                jsonArray3.add(polyLines.get(i3).h);
            }
            for (int i4 = 0; i4 < flowLines.size(); i4++) {
                jsonArray3.add(flowLines.get(i4).h);
            }
            for (int i5 = 0; i5 < polygons.size(); i5++) {
                jsonArray4.add(polygons.get(polygons.keyAt(i5)).l);
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.add("markers", jsonArray);
            jsonObject.add("circles", jsonArray2);
            jsonObject.add("polygons", jsonArray4);
            jsonObject.add("polylines", jsonArray3);
            msiContext.onSuccess(jsonObject);
        }
    }

    private JsonObject a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "626da8b83c53c2595fe47b3f898abe84", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "626da8b83c53c2595fe47b3f898abe84");
        }
        JsonElement args = msiContext.getArgs();
        JsonObject jsonObject = new JsonObject();
        try {
            return args.getAsJsonObject();
        } catch (IllegalStateException unused) {
            msiContext.onError(1201, "not JsonObject");
            return jsonObject;
        }
    }

    private com.meituan.msi.lib.map.view.map.b b(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7af3e5d7bb6cbc301c95178879b3f866", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msi.lib.map.view.map.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7af3e5d7bb6cbc301c95178879b3f866") : this.b.c(msiContext);
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void addFlowLine(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f459d94c22cc55e799343e26d1d90222", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f459d94c22cc55e799343e26d1d90222");
            return;
        }
        final int a2 = this.b.a(msiContext);
        final com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a3 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a3, Integer.valueOf(a2)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "763467b0847cadf488860f6b846b3c92", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "763467b0847cadf488860f6b846b3c92");
            } else if (b.a()) {
                msiContext.onError(1201, "mapView is destroyed");
            } else {
                r rVar = new r(b.getMtMap(), msiContext, a3, b.getPolyLines(), b.getFlowLines());
                Object[] objArr3 = {a3};
                ChangeQuickRedirect changeQuickRedirect3 = r.a;
                if (PatchProxy.isSupport(objArr3, rVar, changeQuickRedirect3, false, "841c5b7802d1343e482e817b8a27b5f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, rVar, changeQuickRedirect3, false, "841c5b7802d1343e482e817b8a27b5f3");
                } else {
                    JsonObject asJsonObject = a3.has("polyline") ? a3.get("polyline").getAsJsonObject() : null;
                    if (asJsonObject != null) {
                        rVar.a(asJsonObject, true);
                    }
                }
                if (b.c != null) {
                    rVar.d = new com.meituan.msi.lib.map.view.map.e() { // from class: com.meituan.msi.lib.map.view.map.b.18
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msi.lib.map.view.map.e
                        public final void a(int i) {
                            Object[] objArr4 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bda2d09c4a34f959d927b8c5cebbbf7b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bda2d09c4a34f959d927b8c5cebbbf7b");
                                return;
                            }
                            JsonObject jsonObject = new JsonObject();
                            jsonObject.addProperty("id", Integer.valueOf(i));
                            jsonObject.addProperty("mapId", Integer.valueOf(a2));
                            b.this.c.a("mapFlowLineAnimEnd", jsonObject);
                        }
                    };
                }
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void removeLines(MsiContext msiContext) {
        JsonArray asJsonArray;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42a597773f1619dc348947ced9e7618c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42a597773f1619dc348947ced9e7618c");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "259347b8aeaca34b40ef404f7c477367", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "259347b8aeaca34b40ef404f7c477367");
            } else if (b.a()) {
                msiContext.onError(1201, "mapView is destroyed");
            } else {
                r rVar = new r(b.getMtMap(), msiContext, a2, b.getPolyLines(), b.getFlowLines());
                Object[] objArr3 = {a2};
                ChangeQuickRedirect changeQuickRedirect3 = r.a;
                if (PatchProxy.isSupport(objArr3, rVar, changeQuickRedirect3, false, "80eec1365a7dca6e53631f003267f632", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, rVar, changeQuickRedirect3, false, "80eec1365a7dca6e53631f003267f632");
                } else if (a2.has("ids") && (asJsonArray = a2.get("ids").getAsJsonArray()) != null) {
                    int size = asJsonArray.size();
                    for (int i = 0; i < size; i++) {
                        int asInt = asJsonArray.get(i).getAsInt();
                        for (q qVar : rVar.e) {
                            if (qVar.d == asInt) {
                                qVar.b();
                                rVar.e.remove(qVar);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void addRipples(MsiContext msiContext) {
        LatLng b;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58cc51b3121ba67eda072109fe6e5fa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58cc51b3121ba67eda072109fe6e5fa9");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b2 = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b2 != null) {
            Object[] objArr2 = {b2, msiContext, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b2, changeQuickRedirect2, false, "cecd67310ecad7b1a98bfb8834b74d4b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b2, changeQuickRedirect2, false, "cecd67310ecad7b1a98bfb8834b74d4b");
            } else if (b2.a()) {
                msiContext.onError(1201, "mapView is destroyed");
            } else {
                t tVar = new t(b2.getMtMap(), msiContext, a2, b2.getRippleViews());
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = t.a;
                if (PatchProxy.isSupport(objArr3, tVar, changeQuickRedirect3, false, "3a1e6c0cf6d2d8208e4a4825edd993bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, tVar, changeQuickRedirect3, false, "3a1e6c0cf6d2d8208e4a4825edd993bf");
                } else if (tVar.d == null || !tVar.d.has("id")) {
                } else {
                    int asInt = tVar.d.get("id").getAsInt();
                    if (tVar.e.get(asInt) != null || (b = com.meituan.msi.lib.map.utils.e.b(tVar.d)) == null) {
                        return;
                    }
                    String asString = tVar.d.has("iconPath") ? tVar.d.get("iconPath").getAsString() : "";
                    String asString2 = tVar.d.has("outerFillColor") ? tVar.d.get("outerFillColor").getAsString() : "#D2DAF9";
                    String asString3 = tVar.d.has("middleFillColor") ? tVar.d.get("middleFillColor").getAsString() : "#0F385DFF";
                    String asString4 = tVar.d.has("insideFillColor") ? tVar.d.get("insideFillColor").getAsString() : "#2E385DFF";
                    final s sVar = new s(tVar.b);
                    Object[] objArr4 = {asString2, asString3, asString4};
                    ChangeQuickRedirect changeQuickRedirect4 = s.a;
                    if (PatchProxy.isSupport(objArr4, sVar, changeQuickRedirect4, false, "b282b945d99ec4126d3c1501aae3dacf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, sVar, changeQuickRedirect4, false, "b282b945d99ec4126d3c1501aae3dacf");
                    } else {
                        sVar.i = com.meituan.msi.lib.map.utils.a.a(asString2, "outerFillColor");
                        sVar.h = com.meituan.msi.lib.map.utils.a.a(asString3, "middleFillColor");
                        sVar.g = com.meituan.msi.lib.map.utils.a.a(asString4, "insideFillColor");
                    }
                    MsiContext msiContext2 = tVar.c;
                    Object[] objArr5 = {b, asString, msiContext2};
                    ChangeQuickRedirect changeQuickRedirect5 = s.a;
                    if (PatchProxy.isSupport(objArr5, sVar, changeQuickRedirect5, false, "6ee5e50ca0a9b78d061682b9cffbb4d1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, sVar, changeQuickRedirect5, false, "6ee5e50ca0a9b78d061682b9cffbb4d1");
                    } else {
                        final CircleOptions circleOptions = new CircleOptions();
                        circleOptions.center(b);
                        circleOptions.fillColor(sVar.g);
                        circleOptions.strokeWidth(0.0f);
                        final CircleOptions circleOptions2 = new CircleOptions();
                        circleOptions2.center(b);
                        circleOptions2.fillColor(sVar.h);
                        circleOptions2.strokeWidth(0.0f);
                        final CircleOptions circleOptions3 = new CircleOptions();
                        circleOptions3.center(b);
                        circleOptions3.fillColor(0);
                        circleOptions3.strokeColor(sVar.i);
                        circleOptions3.strokeWidth(com.meituan.msi.util.f.a(4));
                        if (TextUtils.isEmpty(asString)) {
                            sVar.a(circleOptions3, circleOptions2, circleOptions);
                            sVar.a();
                        } else {
                            final MarkerOptions markerOptions = new MarkerOptions();
                            markerOptions.position(b);
                            markerOptions.anchor(0.5f, 0.5f);
                            c.a(msiContext2.getActivity()).a(msiContext2, asString, "ripple", new Target() { // from class: com.meituan.msi.lib.map.view.model.s.1
                                public static ChangeQuickRedirect a;

                                @Override // com.squareup.picasso.Target
                                public final void onPrepareLoad(Drawable drawable) {
                                }

                                @Override // com.squareup.picasso.Target
                                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                                    Object[] objArr6 = {bitmap, loadedFrom};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "59b4881da520d5ca350bbfe3b92e005d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "59b4881da520d5ca350bbfe3b92e005d");
                                        return;
                                    }
                                    markerOptions.icon(BitmapDescriptorFactory.fromBitmap(com.meituan.msi.lib.map.utils.c.a(bitmap, com.meituan.msi.util.f.a(15), com.meituan.msi.util.f.a(15))));
                                    s.this.f = s.this.b.addMarker(markerOptions);
                                    s.this.a(circleOptions3, circleOptions2, circleOptions);
                                    s.this.a();
                                }

                                @Override // com.squareup.picasso.Target
                                public final void onBitmapFailed(Drawable drawable) {
                                    Object[] objArr6 = {drawable};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "23b91f96d9040740e076c88b46f8c901", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "23b91f96d9040740e076c88b46f8c901");
                                        return;
                                    }
                                    s.this.a(circleOptions3, circleOptions2, circleOptions);
                                    s.this.a();
                                }
                            });
                        }
                    }
                    tVar.e.put(asInt, sVar);
                    tVar.c.onSuccess(null);
                }
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void removeRipples(MsiContext msiContext) {
        JsonArray asJsonArray;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbfb84b06ff9a9b972c918e8e9f51a64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbfb84b06ff9a9b972c918e8e9f51a64");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "ea795d84c33ffc97897524e935ec5674", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "ea795d84c33ffc97897524e935ec5674");
            } else if (b.a()) {
                msiContext.onError(1201, "mapView is destroyed");
            } else {
                t tVar = new t(b.getMtMap(), msiContext, a2, b.getRippleViews());
                Object[] objArr3 = {msiContext};
                ChangeQuickRedirect changeQuickRedirect3 = t.a;
                if (PatchProxy.isSupport(objArr3, tVar, changeQuickRedirect3, false, "b95a33d6651192f5416cdf7dd7131cf8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, tVar, changeQuickRedirect3, false, "b95a33d6651192f5416cdf7dd7131cf8");
                } else if (tVar.d.has("ids") && (asJsonArray = tVar.d.get("ids").getAsJsonArray()) != null) {
                    for (int i = 0; i < asJsonArray.size(); i++) {
                        int asInt = asJsonArray.get(i).getAsInt();
                        tVar.e.get(asInt).b();
                        tVar.e.remove(asInt);
                    }
                    msiContext.onSuccess(null);
                }
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void takeSnapshot(final MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c920ed1c507a42fe0099d0fbb489db3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c920ed1c507a42fe0099d0fbb489db3a");
            return;
        }
        final com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "6d49dd252163218236c9c98ee74155ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "6d49dd252163218236c9c98ee74155ce");
            } else if (b.a()) {
                msiContext.onError(1201, "MsiMapView is Destroyed");
            } else {
                MTMap mtMap = b.getMtMap();
                if (mtMap == null) {
                    msiContext.onError(1201, "MTMap is null");
                } else {
                    mtMap.getMapScreenShot(new MTMap.OnMapScreenShotListener() { // from class: com.meituan.msi.lib.map.view.map.b.20
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapScreenShotListener
                        public final void onMapScreenShot(Bitmap bitmap, int i) {
                        }

                        @Override // com.sankuai.meituan.mapsdk.maps.MTMap.OnMapScreenShotListener
                        public final void onMapScreenShot(Bitmap bitmap) {
                            FileOutputStream fileOutputStream;
                            File createTempFile;
                            Object[] objArr3 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "17ac0dc12c64501b91687ef2e5de5217", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "17ac0dc12c64501b91687ef2e5de5217");
                            } else if (bitmap == null) {
                                msiContext.onError(1201, "bitmap is null");
                            } else {
                                FileOutputStream fileOutputStream2 = null;
                                File a2 = com.meituan.msi.lib.map.utils.b.a(msiContext.getActivity(), null);
                                if (!a2.exists()) {
                                    a2.mkdirs();
                                }
                                if (a2.exists() && !a2.isDirectory()) {
                                    msiContext.onError(1201, "cache dir is not valid");
                                }
                                try {
                                    try {
                                        createTempFile = File.createTempFile("MSIMapSnapshot", ".png", a2);
                                        fileOutputStream = new FileOutputStream(createTempFile);
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream = fileOutputStream2;
                                    }
                                } catch (IOException e) {
                                    e = e;
                                }
                                try {
                                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                                    String uri = Uri.fromFile(createTempFile).toString();
                                    JsonObject jsonObject = new JsonObject();
                                    jsonObject.addProperty(com.meituan.metrics.common.Constants.TRAFFIC_URI, uri);
                                    msiContext.onSuccess(jsonObject);
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException unused) {
                                    }
                                } catch (IOException e2) {
                                    e = e2;
                                    fileOutputStream2 = fileOutputStream;
                                    msiContext.onError(e.toString());
                                    if (fileOutputStream2 != null) {
                                        try {
                                            fileOutputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException unused3) {
                                        }
                                    }
                                    throw th;
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void setMapStyle(MsiContext msiContext) {
        boolean z = true;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11a02d24d660792173c6c7cfd0361bfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11a02d24d660792173c6c7cfd0361bfd");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "9dd59d457aff502c68c03d9c0b17d479", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "9dd59d457aff502c68c03d9c0b17d479");
            } else if (b.a()) {
                msiContext.onError(1201, "MsiMapView is Destroyed");
            } else if (!a2.has("mapStyle")) {
                msiContext.onError(1201, "no mapStyle");
            } else {
                b.getMtMap().setCustomMapStylePath(a2.get("mapStyle").getAsString(), (a2.has("animate") && a2.get("animate").getAsBoolean()) ? false : false);
                msiContext.onSuccess(null);
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void clear(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f83e6dd96081ea36b66454405a7c7bf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f83e6dd96081ea36b66454405a7c7bf4");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "c6945eaad799b373b56c05b967dc3f4e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "c6945eaad799b373b56c05b967dc3f4e");
            } else if (b.a()) {
                msiContext.onError(1201, "MsiMapView is Destroyed");
            } else {
                b.c(true);
                b.getMtMap().clear();
                b.e();
                msiContext.onSuccess(null);
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void setMapStyleColor(MsiContext msiContext) {
        boolean z = true;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8715b0ef1536f2703890b90b44ee392", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8715b0ef1536f2703890b90b44ee392");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "85d18583dfebfcada3f7c4c86a782cba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "85d18583dfebfcada3f7c4c86a782cba");
            } else if (b.a()) {
                msiContext.onError(1201, "MsiMapView is Destroyed");
            } else if (!a2.has("colorName") || TextUtils.isEmpty(a2.get("colorName").getAsString())) {
                msiContext.onError(1201, "no colorName");
            } else {
                b.getMtMap().setMapStyleColor(a2.get("colorName").getAsString(), (a2.has("animate") && a2.get("animate").getAsBoolean()) ? false : false);
                msiContext.onSuccess(null);
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void resume(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09312e8d51aa544989073f24f18e04a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09312e8d51aa544989073f24f18e04a6");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "230000d28e7f44dbc871ad37e99c480e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "230000d28e7f44dbc871ad37e99c480e");
            } else if (b.a()) {
                msiContext.onError(1201, "MsiMapView is Destroyed");
            } else {
                Object[] objArr3 = {b};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msi.lib.map.view.map.b.a;
                if (PatchProxy.isSupport(objArr3, b, changeQuickRedirect3, false, "f0ffc0885c5e3a8ef24efce687ffdadd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, b, changeQuickRedirect3, false, "f0ffc0885c5e3a8ef24efce687ffdadd");
                } else {
                    MTMap mtMap = b.getMtMap();
                    if (b.v != null) {
                        mtMap.setOnCameraChangeListener(b.v);
                    }
                    if (b.n != null) {
                        mtMap.setOnMapClickListener(b.n);
                    }
                    if (b.o != null) {
                        mtMap.setOnMapLoadedListener(b.o);
                    }
                    if (b.p != null) {
                        mtMap.setOnMapLongClickListener(b.p);
                    }
                    if (b.q != null) {
                        mtMap.setOnPolylineClickListener(b.q);
                    }
                    if (b.r != null) {
                        mtMap.setOnPolygonClickListener(b.r);
                    }
                    if (b.s != null) {
                        mtMap.setOnMarkerClickListener(b.s);
                    }
                    if (b.t != null) {
                        mtMap.setOnMarkerSelectChangeListener(b.t);
                    }
                    if (b.u != null) {
                        mtMap.setOnInfoWindowClickListener(b.u);
                    }
                    if (b.w != null) {
                        mtMap.setOnMapPoiClickListener(b.w);
                    }
                    if (b.x != null) {
                        b.setIndoorListener(b.x);
                    }
                    if (b.j != null) {
                        mtMap.setLocationSource(b.j);
                    }
                }
                b.getMapView().onResume();
                msiContext.onSuccess(null);
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void setBoundary(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b0532ffa811dead0eeb6be9426bcea4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b0532ffa811dead0eeb6be9426bcea4");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "43e70f0dd038a83b55c625e10b7a517c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "43e70f0dd038a83b55c625e10b7a517c");
            } else if (b.a()) {
                msiContext.onError(1201, "MsiMapView is Destroyed");
            } else {
                MTMap mtMap = b.getMtMap();
                if (mtMap == null) {
                    msiContext.onError(1201, "MTMap is null");
                    return;
                }
                LatLngBounds a3 = com.meituan.msi.lib.map.utils.e.a(a2);
                if (a3 == null) {
                    msiContext.onError(1201, "northeast or southwest is unvalid");
                    return;
                }
                RestrictBoundsFitMode restrictBoundsFitMode = RestrictBoundsFitMode.FIT_WIDTH;
                if (a2.has("fitMode")) {
                    switch (a2.get("fitMode").getAsInt()) {
                        case 1:
                            restrictBoundsFitMode = RestrictBoundsFitMode.FIT_HEIGHT;
                            break;
                        case 2:
                            a3 = null;
                            restrictBoundsFitMode = null;
                            break;
                    }
                }
                mtMap.setRestrictBounds(a3, restrictBoundsFitMode);
                msiContext.onSuccess(null);
            }
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void addGroundOverlay(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2c1996df814a5bb46ac460e9799194f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2c1996df814a5bb46ac460e9799194f");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            b.a(b, msiContext, b.getGroundOverlays(), a2, 1);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void updateGroundOverlay(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8bab805fbf62232d2a414508d38dfa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8bab805fbf62232d2a414508d38dfa8");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            b.a(b, msiContext, b.getGroundOverlays(), a2, 2);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void removeGroundOverlay(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e12de840757282cdd4d847d37a7128", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e12de840757282cdd4d847d37a7128");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            b.a(b, msiContext, b.getGroundOverlays(), a2, 3);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void addArc(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7afd12e6f5074f48e5139a8cb9420e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7afd12e6f5074f48e5139a8cb9420e1");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            b.b(b, msiContext, b.getArcs(), a2, 1);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void removeArc(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbf99804e5336532986a6f79eaaa68be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbf99804e5336532986a6f79eaaa68be");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            b.b(b, msiContext, b.getArcs(), a2, 3);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void addPolylines(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "796643da663e2b662d9c4865452e3570", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "796643da663e2b662d9c4865452e3570");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            b.a(System.currentTimeMillis(), 3);
            b.a(b, a2, b.getPolyLines(), msiContext, 1);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void updatePolylines(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2eedead65e27003292db2e8e7e66f4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2eedead65e27003292db2e8e7e66f4d");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            b.a(b, a2, b.getPolyLines(), msiContext, 2);
        }
    }

    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void removePolylines(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b47c13d906eca05e1d63030d7c60f487", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b47c13d906eca05e1d63030d7c60f487");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a2 = a(msiContext);
        if (b != null) {
            b.a(b, a2, b.getPolyLines(), msiContext, 3);
        }
    }

    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [boolean, byte] */
    @Override // com.meituan.msi.lib.map.api.interfaces.b
    @CheckEmbed
    public final void moveAlong(MsiContext msiContext) {
        q a2;
        ValueAnimator valueAnimator;
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b28191187affbc42800f6f5a9b8c72de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b28191187affbc42800f6f5a9b8c72de");
            return;
        }
        com.meituan.msi.lib.map.view.map.b b = b(msiContext);
        JsonObject a3 = a(msiContext);
        if (b != null) {
            Object[] objArr2 = {b, msiContext, a3};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.lib.map.view.map.b.a;
            if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "a3add496567b5f673148de1a98aeea39", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "a3add496567b5f673148de1a98aeea39");
            } else if (b.a()) {
                msiContext.onError(1201, "MsiMapView is Destroyed");
            } else if (!a3.has("markerId")) {
                msiContext.onError(1201, "markerId not found");
            } else {
                int asInt = a3.get("markerId").getAsInt();
                m mVar = b.y.get(asInt);
                if (mVar == null) {
                    msiContext.onError(1201, "marker not found");
                } else if (!a3.has("duration") || a3.get("duration").getAsInt() < 0) {
                    msiContext.onError(1201, "duration is error");
                } else {
                    int asInt2 = a3.get("duration").getAsInt();
                    JsonObject asJsonObject = a3.has("polyline") ? a3.get("polyline").getAsJsonObject() : null;
                    if (asJsonObject == null) {
                        msiContext.onError(1201, "line not found");
                        return;
                    }
                    JsonObject jsonObject = asJsonObject;
                    r rVar = new r(b.getMtMap(), msiContext, null, b.getPolyLines(), b.getFlowLines());
                    Object[] objArr3 = {jsonObject};
                    ChangeQuickRedirect changeQuickRedirect3 = r.a;
                    if (PatchProxy.isSupport(objArr3, rVar, changeQuickRedirect3, false, "9c9981c9167aed8ddbc496eb7cf1ca7c", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = (q) PatchProxy.accessDispatch(objArr3, rVar, changeQuickRedirect3, false, "9c9981c9167aed8ddbc496eb7cf1ca7c");
                    } else {
                        int asInt3 = jsonObject.has("id") ? jsonObject.get("id").getAsInt() : -1;
                        if (asInt3 != -1) {
                            Iterator<q> it = rVar.c.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                q next = it.next();
                                if (next.d == asInt3) {
                                    rVar.g = next;
                                    rVar.h = true;
                                    break;
                                }
                            }
                        }
                        a2 = rVar.a(jsonObject, false);
                    }
                    if (a2 == null) {
                        msiContext.onError(1201, "line not found");
                        return;
                    }
                    LatLng[] latLngArr = (LatLng[]) a2.b.toArray(new LatLng[0]);
                    ?? r2 = (!a3.has("autoRotate") || a3.get("autoRotate").getAsBoolean()) ? 1 : 0;
                    ?? r3 = (a3.has("autoErase") && a3.get("autoErase").getAsBoolean()) ? 1 : 0;
                    com.meituan.msi.lib.map.utils.f fVar = b.J.get(asInt);
                    if (fVar != null) {
                        fVar.a();
                    }
                    com.meituan.msi.lib.map.utils.f fVar2 = new com.meituan.msi.lib.map.utils.f();
                    b.J.put(asInt, fVar2);
                    long j = asInt2;
                    Object[] objArr4 = {mVar, new Long(j), latLngArr, a2, Byte.valueOf((byte) r2), Byte.valueOf((byte) r3)};
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msi.lib.map.utils.f.a;
                    if (PatchProxy.isSupport(objArr4, fVar2, changeQuickRedirect4, false, "b56cce786901f2b3307ed28ed70b21bd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, fVar2, changeQuickRedirect4, false, "b56cce786901f2b3307ed28ed70b21bd");
                    } else if (latLngArr != null) {
                        fVar2.c = mVar;
                        fVar2.b = mVar.d;
                        fVar2.d = j;
                        fVar2.e = latLngArr;
                        fVar2.k = a2;
                        fVar2.f = r2;
                        fVar2.l = r3;
                        fVar2.i = new AnimatorSet();
                        fVar2.g = new double[latLngArr.length - 1];
                        int i = 0;
                        int i2 = 0;
                        while (i < latLngArr.length - 1) {
                            i2++;
                            fVar2.g[i] = g.a(latLngArr[i], latLngArr[i2]);
                            fVar2.h += fVar2.g[i];
                            i = i2;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < latLngArr.length - 1; i3++) {
                            Object[] objArr5 = {Integer.valueOf(i3)};
                            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msi.lib.map.utils.f.a;
                            if (PatchProxy.isSupport(objArr5, fVar2, changeQuickRedirect5, false, "5713ae3b434fb5149383e2aa044f756e", RobustBitConfig.DEFAULT_VALUE)) {
                                valueAnimator = (ValueAnimator) PatchProxy.accessDispatch(objArr5, fVar2, changeQuickRedirect5, false, "5713ae3b434fb5149383e2aa044f756e");
                            } else {
                                i a4 = g.a(fVar2.e[i3]);
                                i a5 = g.a(fVar2.e[i3 + 1]);
                                valueAnimator = new ValueAnimator();
                                valueAnimator.setDuration((long) ((fVar2.d * fVar2.g[i3]) / fVar2.h));
                                valueAnimator.setInterpolator(new LinearInterpolator());
                                valueAnimator.setFloatValues((float) fVar2.g[i3]);
                                valueAnimator.addUpdateListener(new f.a(fVar2, a4, a5, fVar2.k, i3));
                            }
                            arrayList.add(valueAnimator);
                        }
                        fVar2.i.playSequentially(arrayList);
                        if (r2 != 0) {
                            fVar2.b();
                        }
                    }
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = com.meituan.msi.lib.map.utils.f.a;
                    if (PatchProxy.isSupport(objArr6, fVar2, changeQuickRedirect6, false, "2e76c597c6ed6efb79a11e02b27c3808", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, fVar2, changeQuickRedirect6, false, "2e76c597c6ed6efb79a11e02b27c3808");
                    } else {
                        if (!fVar2.i.isRunning()) {
                            fVar2.i.start();
                        }
                        if (fVar2.f && fVar2.j != null && !fVar2.j.isRunning()) {
                            fVar2.j.start();
                        }
                    }
                    msiContext.onSuccess(null);
                }
            }
        }
    }
}
