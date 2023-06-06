package com.meituan.android.mrn.component.map.view.childview;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.BV.LinearGradient.LinearGradientManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ao;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Polyline;
import com.sankuai.meituan.mapsdk.maps.model.PolylineOptions;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@SuppressLint({"nammu_check_error"})
/* loaded from: classes2.dex */
public final class h extends com.facebook.react.views.view.f implements d {
    public static ChangeQuickRedirect a;
    public ao b;
    public Polyline c;
    public MTMap d;
    private boolean e;
    private boolean f;
    private float g;
    private List<LatLng> h;
    private float i;
    private float j;
    private int k;
    private PolylineOptions.PatternItem l;
    private volatile JsonObject m;
    private boolean n;
    private Map<String, h> o;

    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public h(ao aoVar) {
        super(aoVar);
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8bce0d4127a21d2493c339ff1edeff4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8bce0d4127a21d2493c339ff1edeff4");
            return;
        }
        this.e = true;
        this.f = false;
        this.g = 1.0f;
        this.i = 32.0f;
        this.j = 0.0f;
        this.k = 0;
        this.l = new PolylineOptions.SingleColorPattern();
        this.m = null;
        this.n = true;
        this.b = aoVar;
    }

    public static /* synthetic */ Polyline a(h hVar, Polyline polyline) {
        hVar.c = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee40e8a4fcabae6d2c3a8cd287f60135", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee40e8a4fcabae6d2c3a8cd287f60135");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (readableArray != null && readableArray.size() > 0) {
            for (int i = 0; i < readableArray.size(); i++) {
                LatLng b = com.meituan.android.mrn.component.map.utils.a.b(readableArray.getMap(i));
                if (b != null && b.isValid()) {
                    arrayList.add(b);
                }
            }
        }
        if (arrayList.size() < 2) {
            com.meituan.android.mrn.component.map.utils.e.a(new IllegalArgumentException("MRNPolyline must has two valid coordinates"), "param");
        } else {
            this.h = arrayList;
        }
    }

    private void a(ReadableMap readableMap, a aVar) {
        Object[] objArr = {readableMap, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47fb3f0a3db80f6ad4130b8dbdeb9919", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47fb3f0a3db80f6ad4130b8dbdeb9919");
        } else if (readableMap == null || !readableMap.hasKey("type")) {
        } else {
            switch (readableMap.getInt("type")) {
                case 1:
                    d(readableMap, aVar);
                    return;
                case 2:
                    c(readableMap, aVar);
                    return;
                case 3:
                    b(readableMap, aVar);
                    return;
                case 4:
                    if (aVar != null) {
                        aVar.a();
                    }
                    PolylineOptions.DotColorLinePattern dotColorLinePattern = new PolylineOptions.DotColorLinePattern();
                    if (readableMap.hasKey("dotLineColor")) {
                        dotColorLinePattern.color(readableMap.getInt("dotLineColor"));
                    }
                    this.l = dotColorLinePattern;
                    if (this.c != null) {
                        this.c.remove();
                        this.c = null;
                    }
                    a();
                    return;
                default:
                    return;
            }
        }
    }

    private void b(ReadableMap readableMap, final a aVar) {
        Object[] objArr = {readableMap, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02ed7552af2638acdf798d416c3a855f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02ed7552af2638acdf798d416c3a855f");
            return;
        }
        final PolylineOptions.DotLinePattern dotLinePattern = new PolylineOptions.DotLinePattern();
        if (readableMap.hasKey("spacing")) {
            dotLinePattern.spacing(com.meituan.android.mrn.component.map.utils.b.a(getContext(), (float) readableMap.getDouble("spacing")));
        }
        String string = readableMap.hasKey("texture") ? readableMap.getString("texture") : null;
        this.l = dotLinePattern;
        if (!TextUtils.isEmpty(string)) {
            com.meituan.android.mrn.component.map.utils.c.a(getContext()).a(string, new Target() { // from class: com.meituan.android.mrn.component.map.view.childview.h.1
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5bab06e37523418354f5eb141fa17ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5bab06e37523418354f5eb141fa17ef");
                        return;
                    }
                    if (aVar != null) {
                        aVar.a();
                    }
                    h.this.a();
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a58916de673244da8681fb4285e1ba7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a58916de673244da8681fb4285e1ba7");
                        return;
                    }
                    if (aVar != null) {
                        aVar.a();
                    }
                    if (bitmap != null) {
                        dotLinePattern.texture(BitmapDescriptorFactory.fromBitmap(bitmap));
                        if (h.this.c != null) {
                            h.this.c.remove();
                            h.a(h.this, (Polyline) null);
                        }
                    }
                    h.this.a();
                }

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }
            });
            return;
        }
        if (this.c != null) {
            this.c.remove();
            this.c = null;
        }
        if (aVar != null) {
            aVar.a();
        }
        a();
    }

    private void c(ReadableMap readableMap, final a aVar) {
        int[] iArr;
        int[] iArr2;
        ReadableArray array;
        ReadableArray array2;
        ReadableArray array3;
        Object[] objArr = {readableMap, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53355795bc43e17b6c47e426df33bd9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53355795bc43e17b6c47e426df33bd9d");
            return;
        }
        final PolylineOptions.MultiColorPattern multiColorPattern = new PolylineOptions.MultiColorPattern();
        if (!readableMap.hasKey(LinearGradientManager.PROP_COLORS) || (array3 = readableMap.getArray(LinearGradientManager.PROP_COLORS)) == null || array3.size() <= 0) {
            iArr = null;
        } else {
            iArr = new int[array3.size()];
            for (int i = 0; i < array3.size(); i++) {
                iArr[i] = array3.getInt(i);
            }
        }
        if (!readableMap.hasKey("indexes") || (array2 = readableMap.getArray("indexes")) == null || array2.size() <= 0) {
            iArr2 = null;
        } else {
            iArr2 = new int[array2.size()];
            for (int i2 = 0; i2 < array2.size(); i2++) {
                iArr2[i2] = array2.getInt(i2);
            }
        }
        if (iArr != null && iArr2 != null) {
            multiColorPattern.colors(iArr, iArr2);
        }
        if (readableMap.hasKey("borderColors") && (array = readableMap.getArray("borderColors")) != null && array.size() > 0) {
            int[] iArr3 = new int[array.size()];
            for (int i3 = 0; i3 < array.size(); i3++) {
                iArr3[i3] = array.getInt(i3);
            }
            multiColorPattern.borderColors(iArr3);
        }
        if (readableMap.hasKey("borderWidth")) {
            multiColorPattern.borderWidth(com.meituan.android.mrn.component.map.utils.b.a(getContext(), (float) readableMap.getDouble("borderWidth")));
        }
        if (readableMap.hasKey("arrowSpacing")) {
            multiColorPattern.arrowSpacing(com.meituan.android.mrn.component.map.utils.b.a(getContext(), (float) readableMap.getDouble("arrowSpacing")));
        }
        String string = readableMap.hasKey("arrowTexture") ? readableMap.getString("arrowTexture") : null;
        this.l = multiColorPattern;
        if (!TextUtils.isEmpty(string)) {
            com.meituan.android.mrn.component.map.utils.c.a(getContext()).a(string, new Target() { // from class: com.meituan.android.mrn.component.map.view.childview.h.2
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "648593d8d7c7c67f4a8218603246c3a0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "648593d8d7c7c67f4a8218603246c3a0");
                        return;
                    }
                    if (aVar != null) {
                        aVar.a();
                    }
                    h.this.a();
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd2d2a3391d46b325336b03ac98e5f6e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd2d2a3391d46b325336b03ac98e5f6e");
                        return;
                    }
                    if (aVar != null) {
                        aVar.a();
                    }
                    if (bitmap != null) {
                        multiColorPattern.arrowTexture(BitmapDescriptorFactory.fromBitmap(bitmap));
                        if (h.this.c != null) {
                            h.this.c.remove();
                            h.a(h.this, (Polyline) null);
                        }
                    }
                    h.this.a();
                }

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }
            });
            return;
        }
        if (this.c != null) {
            this.c.remove();
            this.c = null;
        }
        if (aVar != null) {
            aVar.a();
        }
        a();
    }

    private void d(ReadableMap readableMap, final a aVar) {
        Object[] objArr = {readableMap, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f0ac9caa0aaabf4887942ec471fb864", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f0ac9caa0aaabf4887942ec471fb864");
            return;
        }
        final PolylineOptions.SingleColorPattern singleColorPattern = new PolylineOptions.SingleColorPattern();
        if (readableMap.hasKey("color")) {
            singleColorPattern.color(readableMap.getInt("color"));
        }
        if (readableMap.hasKey("borderColor")) {
            singleColorPattern.borderColor(readableMap.getInt("borderColor"));
        }
        if (readableMap.hasKey("borderWidth")) {
            singleColorPattern.borderWidth(com.meituan.android.mrn.component.map.utils.b.a(getContext(), (float) readableMap.getDouble("borderWidth")));
        }
        if (readableMap.hasKey("arrowSpacing")) {
            singleColorPattern.arrowSpacing(com.meituan.android.mrn.component.map.utils.b.a(getContext(), (float) readableMap.getDouble("arrowSpacing")));
        }
        String string = readableMap.hasKey("arrowTexture") ? readableMap.getString("arrowTexture") : null;
        this.l = singleColorPattern;
        if (!TextUtils.isEmpty(string)) {
            com.meituan.android.mrn.component.map.utils.c.a(getContext()).a(string, new Target() { // from class: com.meituan.android.mrn.component.map.view.childview.h.3
                public static ChangeQuickRedirect a;

                @Override // com.squareup.picasso.Target
                public final void onBitmapFailed(Drawable drawable) {
                    Object[] objArr2 = {drawable};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f63bbb3583e6fed2931e8539401a82a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f63bbb3583e6fed2931e8539401a82a");
                        return;
                    }
                    if (aVar != null) {
                        aVar.a();
                    }
                    h.this.a();
                }

                @Override // com.squareup.picasso.Target
                public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                    Object[] objArr2 = {bitmap, loadedFrom};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5aca583ae2a1ddf0451851393caddefc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5aca583ae2a1ddf0451851393caddefc");
                        return;
                    }
                    if (aVar != null) {
                        aVar.a();
                    }
                    if (bitmap != null) {
                        singleColorPattern.arrowTexture(BitmapDescriptorFactory.fromBitmap(bitmap));
                        if (h.this.c != null) {
                            h.this.c.remove();
                            h.a(h.this, (Polyline) null);
                        }
                    }
                    h.this.a();
                }

                @Override // com.squareup.picasso.Target
                public final void onPrepareLoad(Drawable drawable) {
                }
            });
            return;
        }
        if (this.c != null) {
            this.c.remove();
            this.c = null;
        }
        if (aVar != null) {
            aVar.a();
        }
        a();
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f748707561e6edca1bb46e3c4d178be7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f748707561e6edca1bb46e3c4d178be7");
        } else if (this.d == null || this.c != null || this.h == null || this.h.size() <= 1) {
        } else {
            this.c = this.d.addPolyline(new PolylineOptions().addAll(this.h).alpha(this.g).clickable(this.f).visible(this.e).width(this.i).zIndex(this.j).level(this.k).lineCap(this.n).pattern(this.l));
            if (this.o != null) {
                this.o.put(getPolylineId(), this);
            }
            if (this.c == null) {
                com.meituan.android.mrn.component.map.utils.e.a(new RuntimeException("Map sdk error! polyline is null :" + toString()), "other");
            }
        }
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final void a(MTMap mTMap) {
        Object[] objArr = {mTMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6ac018b899eea2d6bba87b793c428ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6ac018b899eea2d6bba87b793c428ee");
        } else if (mTMap == null || this.c == null) {
        } else {
            this.c.remove();
            this.c = null;
            this.d = null;
        }
    }

    @Override // com.meituan.android.mrn.component.map.view.childview.d
    public final com.sankuai.meituan.mapsdk.maps.interfaces.l getFeature() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37c2beb07e5d9759c88f769181b6442d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mapsdk.maps.interfaces.l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37c2beb07e5d9759c88f769181b6442d");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.getMapElement();
    }

    public final String getPolylineId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e617a0a26c403e58820c93026371d8e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e617a0a26c403e58820c93026371d8e");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.getId();
    }

    public final void setCoordinates(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aebd1ac678f49bee873e23c07d033a14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aebd1ac678f49bee873e23c07d033a14");
            return;
        }
        a(readableArray);
        if (this.c != null) {
            this.c.setPoints(this.h);
        } else {
            a();
        }
    }

    public final void setDisplayLevel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "361d9a1f6d2c62d56e71202f01eea8e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "361d9a1f6d2c62d56e71202f01eea8e3");
            return;
        }
        this.k = i;
        if (this.c == null) {
            a();
        }
    }

    public final void setMergedPatCoord(final ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6707aea63be54d4ac8dad5776cfb3c6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6707aea63be54d4ac8dad5776cfb3c6b");
        } else if (readableMap == null) {
        } else {
            try {
                boolean a2 = com.meituan.android.mrn.component.map.utils.a.a(readableMap, "pattern");
                final boolean a3 = com.meituan.android.mrn.component.map.utils.a.a(readableMap, "coordinates");
                if (a2) {
                    ReadableMap map = readableMap.getMap("pattern");
                    JsonObject jsonObject = this.m;
                    if (jsonObject != null) {
                        a2 = !((JsonObject) new JsonParser().parse(map.toString())).equals(jsonObject);
                    }
                    if (a2) {
                        this.m = (JsonObject) new JsonParser().parse(map.toString());
                        a(map, new a() { // from class: com.meituan.android.mrn.component.map.view.childview.h.4
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.mrn.component.map.view.childview.h.a
                            public final void a() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41f310552848a7942118f97039c3a131", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41f310552848a7942118f97039c3a131");
                                } else if (a3) {
                                    h.this.a(readableMap.getArray("coordinates"));
                                }
                            }
                        });
                        return;
                    }
                }
                if (a3) {
                    setCoordinates(readableMap.getArray("coordinates"));
                }
            } catch (Exception e) {
                com.meituan.android.mrn.component.map.utils.e.a(e, "other");
            }
        }
    }

    public final void setPattern(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eca19242776343a745c72d564064bda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eca19242776343a745c72d564064bda");
        } else {
            a(readableMap, (a) null);
        }
    }

    public final void setPolylineClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a18c1636fd74f68482c6a46bf9514799", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a18c1636fd74f68482c6a46bf9514799");
            return;
        }
        this.f = z;
        if (this.c != null) {
            this.c.setClickable(z);
        } else {
            a();
        }
    }

    public final void setPolylineMap(Map<String, h> map) {
        this.o = map;
    }

    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db7efd1b6a7f85054bc15e1d7fa159a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db7efd1b6a7f85054bc15e1d7fa159a6");
            return;
        }
        this.e = z;
        if (this.c != null) {
            this.c.setVisible(z);
        } else {
            a();
        }
    }

    public final void setWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20373bbfa8b9aaafdaed8c0e5a41de2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20373bbfa8b9aaafdaed8c0e5a41de2b");
            return;
        }
        this.i = com.meituan.android.mrn.component.map.utils.b.a(getContext(), f);
        if (this.c != null) {
            this.c.setWidth(this.i);
        } else {
            a();
        }
    }

    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cb3cd962b97b837d1296c4099495586", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cb3cd962b97b837d1296c4099495586");
            return;
        }
        this.j = f;
        if (this.c != null) {
            this.c.setZIndex(this.j);
        } else {
            a();
        }
    }
}
