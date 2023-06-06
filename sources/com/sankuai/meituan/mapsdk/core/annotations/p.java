package com.sankuai.meituan.mapsdk.core.annotations;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.text.TextUtils;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.HeatOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.HoneyCombOverlayOptions;
import com.sankuai.meituan.mapsdk.maps.model.HoneyCombUnit;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.WeightedLatLng;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class p extends d implements com.sankuai.meituan.mapsdk.core.interfaces.c {
    public static ChangeQuickRedirect y;
    private Map<Float, Integer> A;
    private float B;
    private float C;
    private float D;
    private HeatOverlayOptions.HeatMapType E;
    private long F;
    private int G;
    private List<WeightedLatLng> z;

    public p(g gVar, HeatOverlayOptions heatOverlayOptions) {
        super(gVar);
        Object[] objArr = {gVar, heatOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "341e1f5efca63e43efa1075e3aee8716", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "341e1f5efca63e43efa1075e3aee8716");
            return;
        }
        this.z = new ArrayList();
        updateHeatOverlay(heatOverlayOptions);
    }

    public p(g gVar, HoneyCombOverlayOptions honeyCombOverlayOptions) {
        super(gVar);
        Object[] objArr = {gVar, honeyCombOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f8a39c9f01ee63b242a3fe615b12216", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f8a39c9f01ee63b242a3fe615b12216");
            return;
        }
        this.z = new ArrayList();
        updateHoneyCombOverlay(honeyCombOverlayOptions);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.core.annotations.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d2da2af4b7f18d6bc4402729a12cece", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d2da2af4b7f18d6bc4402729a12cece");
            return;
        }
        super.a();
        this.s.b(MapConstant.LayerPropertyFlag_HeatmapRadius, a("MapConstant.LayerPropertyFlag_HeatmapRadius"));
        this.s.b(6002, a("MapConstant.LayerPropertyFlag_HeatmapWeight"));
    }

    private void a(List<WeightedLatLng> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eebb8b46207d7e6dcd5c75c50ed0e5af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eebb8b46207d7e6dcd5c75c50ed0e5af");
        } else if (!f()) {
            if (list == null || list.size() <= 0) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.d("points == null or points.size <= 0");
                return;
            }
            float f = 0.0f;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (list.get(i2).intensity > 0.0d) {
                    f = (float) (f + list.get(i2).intensity);
                    i++;
                }
            }
            float f2 = f / i;
            float f3 = (f2 >= 0.5f ? f2 : 0.5f) * 2.0f;
            for (int i3 = 0; i3 < list.size(); i3++) {
                list.get(i3).intensity /= f3;
            }
            this.z.clear();
            this.z.addAll(list);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = y;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de550b97e23666dbbd708576fdb1f2c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de550b97e23666dbbd708576fdb1f2c7");
                return;
            }
            this.t.d();
            for (WeightedLatLng weightedLatLng : this.z) {
                com.sankuai.meituan.mapsdk.core.render.model.b c = this.t.c();
                c.a(com.sankuai.meituan.mapsdk.core.render.model.c.Point, weightedLatLng.getLatLng());
                c.a("MapConstant.LayerPropertyFlag_HeatmapRadius", this.B);
                c.a("MapConstant.LayerPropertyFlag_HeatmapWeight", (float) weightedLatLng.getWeight());
            }
        }
    }

    @SuppressLint({"DefaultLocale"})
    private void a(Map<Float, Integer> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41d062650f680f337f5f4d62a76293bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41d062650f680f337f5f4d62a76293bb");
        } else if (!f()) {
            if (map != null) {
                float[] fArr = new float[map.size() * 5];
                int i = 0;
                for (Float f : map.keySet()) {
                    int i2 = i * 5;
                    fArr[i2] = f.floatValue();
                    float[] f2 = com.sankuai.meituan.mapsdk.core.render.b.f(map.get(f).intValue());
                    fArr[i2 + 1] = f2[0];
                    fArr[i2 + 2] = f2[1];
                    fArr[i2 + 3] = f2[2];
                    fArr[i2 + 4] = f2[3];
                    i++;
                }
                this.s.a(6004, fArr);
            }
            this.A = map;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mapsdk.core.annotations.p$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[HeatOverlayOptions.HeatMapType.valuesCustom().length];

        static {
            try {
                a[HeatOverlayOptions.HeatMapType.Square.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HeatOverlayOptions.HeatMapType.Circle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.h
    public final int getRadius() {
        return (int) this.B;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.h
    public final void updateHeatOverlay(HeatOverlayOptions heatOverlayOptions) {
        Object[] objArr = {heatOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da04fe9143c4639defd01f8b7d452d48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da04fe9143c4639defd01f8b7d452d48");
        } else if (!f()) {
            String str = "";
            if (heatOverlayOptions == null) {
                str = "HeatmapOptions is null";
            } else if (heatOverlayOptions.getData() == null && heatOverlayOptions.getWeightedData() == null) {
                str = "HeatmapOptions has no data";
            }
            if (!TextUtils.isEmpty(str)) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.f(str);
                return;
            }
            this.B = heatOverlayOptions.getRadius() * 0.7f;
            if (heatOverlayOptions.getWeightedData() == null) {
                ArrayList arrayList = new ArrayList();
                for (LatLng latLng : heatOverlayOptions.getData()) {
                    arrayList.add(new WeightedLatLng(latLng, 1.0d, this.B));
                }
                heatOverlayOptions.setWeightedData(arrayList);
            }
            a(heatOverlayOptions.getWeightedData());
            setAlpha(heatOverlayOptions.getAlpha());
            a(a(heatOverlayOptions));
            HeatOverlayOptions.HeatMapType heatMapType = heatOverlayOptions.getHeatMapType();
            Object[] objArr2 = {heatMapType};
            ChangeQuickRedirect changeQuickRedirect2 = y;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb8f8e384511f29d93cee694b20c6eae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb8f8e384511f29d93cee694b20c6eae");
            } else if (!f()) {
                this.E = heatMapType;
                if (AnonymousClass1.a[heatMapType.ordinal()] == 1) {
                    this.s.a(6006, 1);
                } else {
                    this.s.a(6006, 0);
                }
            }
            setZIndex(heatOverlayOptions.getZIndex());
            setLevel(heatOverlayOptions.getLevel());
            setVisible(heatOverlayOptions.isVisible());
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.core.interfaces.a
    public final void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82d0dd723aadc38d22e1c0bab95eebef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82d0dd723aadc38d22e1c0bab95eebef");
        } else if (f()) {
        } else {
            super.setAlpha(f);
            this.s.a(6005, this.v);
        }
    }

    public final void a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81ada8f79eba3e65b0a71b18d0d7c1db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81ada8f79eba3e65b0a71b18d0d7c1db");
        } else if (!isVisible() || Float.compare(this.v, 0.0f) <= 0) {
        } else {
            this.F = j;
            this.G = i;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.i
    public final HoneyCombUnit getUnit(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e921b664365f6a1126bcdaa68e9c5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (HoneyCombUnit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e921b664365f6a1126bcdaa68e9c5a");
        }
        com.sankuai.meituan.mapsdk.core.render.a aVar = this.j.c;
        String str = "";
        if (aVar.getFeatureType(this.F, this.G) == com.sankuai.meituan.mapsdk.core.render.model.c.Point) {
            String featureStringProperty = aVar.getFeatureStringProperty(this.F, this.G, "related-feature-indexes");
            if (!TextUtils.isEmpty(featureStringProperty)) {
                str = featureStringProperty;
            }
        }
        this.F = 0L;
        this.G = 0;
        if (str.isEmpty()) {
            return null;
        }
        double[] hexagonBoundsByLatLng = aVar.getHexagonBoundsByLatLng(latLng.latitude, latLng.longitude, this.C, this.D);
        String[] split = str.split(StringUtil.SPACE);
        if (split == null || split.length == 0) {
            return null;
        }
        WeightedLatLng[] weightedLatLngArr = new WeightedLatLng[split.length];
        double d = 0.0d;
        for (int i = 0; i < split.length; i++) {
            int parseInt = Integer.parseInt(split[i]);
            d += this.z.get(parseInt).getWeight();
            weightedLatLngArr[i] = this.z.get(parseInt);
        }
        LatLng latLng2 = (hexagonBoundsByLatLng == null || hexagonBoundsByLatLng.length != 12) ? null : new LatLng((hexagonBoundsByLatLng[1] + hexagonBoundsByLatLng[7]) / 2.0d, (hexagonBoundsByLatLng[0] + hexagonBoundsByLatLng[6]) / 2.0d);
        if (latLng2 == null) {
            return null;
        }
        return new HoneyCombUnit(latLng2, d, weightedLatLngArr);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.i
    public final void updateHoneyCombOverlay(HoneyCombOverlayOptions honeyCombOverlayOptions) {
        Map<Float, Integer> b;
        Object[] objArr = {honeyCombOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "751ddb4e18ede5bfdf2fbabf966ee327", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "751ddb4e18ede5bfdf2fbabf966ee327");
        } else if (!f()) {
            String str = "";
            if (honeyCombOverlayOptions == null) {
                str = "HeatmapOptions is null";
            } else if (honeyCombOverlayOptions.getNodes() == null) {
                str = "HeatmapOptions has no data";
            }
            if (!TextUtils.isEmpty(str)) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.e(str);
                return;
            }
            if (this.t != null && (this.t instanceof com.sankuai.meituan.mapsdk.core.render.model.d)) {
                ((com.sankuai.meituan.mapsdk.core.render.model.d) this.t).a(com.sankuai.meituan.mapsdk.core.render.model.i.CustomThread);
            }
            setAlpha(honeyCombOverlayOptions.getAlpha());
            Object[] objArr2 = {honeyCombOverlayOptions};
            ChangeQuickRedirect changeQuickRedirect2 = y;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a7e6c09957f94b74cfce48b11d9ff2e2", RobustBitConfig.DEFAULT_VALUE)) {
                b = (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a7e6c09957f94b74cfce48b11d9ff2e2");
            } else {
                TreeMap treeMap = new TreeMap();
                int[] colors = honeyCombOverlayOptions.getColors();
                double[] startPoints = honeyCombOverlayOptions.getStartPoints();
                if (colors != null) {
                    for (int i = 0; i < colors.length; i++) {
                        treeMap.put(Float.valueOf((float) startPoints[i]), Integer.valueOf(colors[i]));
                    }
                }
                b = b(treeMap);
            }
            a(b);
            setZIndex(honeyCombOverlayOptions.getZIndex());
            setLevel(honeyCombOverlayOptions.getDisplayLevel());
            setMaxZoomLevel(honeyCombOverlayOptions.getMaxZoom());
            setMinZoomLevel(honeyCombOverlayOptions.getMinZoom());
            setVisible(honeyCombOverlayOptions.isVisibility());
            this.s.a(6006, 2);
            this.s.a(6003, new float[]{(float) honeyCombOverlayOptions.getMinIntensity(), (float) honeyCombOverlayOptions.getMaxIntensity()});
            float size = honeyCombOverlayOptions.getSize();
            Object[] objArr3 = {Float.valueOf(size)};
            ChangeQuickRedirect changeQuickRedirect3 = y;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1cf67b9edefcced9732d5997790d3151", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1cf67b9edefcced9732d5997790d3151");
            } else {
                if (size < 10.0f) {
                    size = 10.0f;
                }
                this.s.a(MapConstant.LayerPropertyFlag_HeatmapSize, size);
                this.C = size;
            }
            float gap = honeyCombOverlayOptions.getGap();
            Object[] objArr4 = {Float.valueOf(gap)};
            ChangeQuickRedirect changeQuickRedirect4 = y;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "944a1d73e14b1c495b313be702f86c92", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "944a1d73e14b1c495b313be702f86c92");
            } else {
                float f = gap >= 0.0f ? gap : 0.0f;
                this.s.a(MapConstant.LayerPropertyFlag_HeatmapGap, f);
                this.D = f;
            }
            a(Arrays.asList(honeyCombOverlayOptions.getNodes()));
        }
    }

    private static Map<Float, Integer> a(HeatOverlayOptions heatOverlayOptions) {
        Object[] objArr = {heatOverlayOptions};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b1b2a63d99c9b256a1f5c7dd103667d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b1b2a63d99c9b256a1f5c7dd103667d");
        }
        TreeMap treeMap = new TreeMap();
        int[] colors = heatOverlayOptions.getColors();
        float[] startPoints = heatOverlayOptions.getStartPoints();
        if (colors != null) {
            for (int i = 0; i < colors.length; i++) {
                treeMap.put(Float.valueOf((float) ((Math.atan((startPoints[i] - 0.6d) * 8.0d) / 3.0d) + 0.6d)), Integer.valueOf(colors[i]));
            }
        }
        return b(treeMap);
    }

    private static Map<Float, Integer> b(Map<Float, Integer> map) {
        TreeMap treeMap;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "213a7cbe5db44d9af014ea4093dd7eda", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "213a7cbe5db44d9af014ea4093dd7eda");
        }
        if (!map.containsKey(Float.valueOf(0.0f))) {
            treeMap = new TreeMap();
            treeMap.put(Float.valueOf(0.0f), 0);
            treeMap.putAll(map);
        } else if (map.get(Float.valueOf(0.0f)) == null || map.get(Float.valueOf(0.0f)).intValue() == Color.rgb(0, 0, 0)) {
            return map;
        } else {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.d("The position of colors[0.0f] should be Color.rgb(0, 0, 0). We have modified your colors[0.0f] to colors[0.01f].");
            treeMap = new TreeMap();
            treeMap.put(Float.valueOf(0.0f), 0);
            for (Map.Entry<Float, Integer> entry : map.entrySet()) {
                if (entry.getKey().floatValue() == 0.0f) {
                    treeMap.put(Float.valueOf(0.01f), entry.getValue());
                } else {
                    treeMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        map.clear();
        return treeMap;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final Object getTag() {
        return this.q;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final void setTag(Object obj) {
        this.q = obj;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.d, com.sankuai.meituan.mapsdk.maps.interfaces.q
    public final List<LatLng> getPoints() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a5b95c385d6ff1f2e348a73225265ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a5b95c385d6ff1f2e348a73225265ed");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = y;
        List unmodifiableList = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "016ead9882cd9a5702113bbe3cc7b160", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "016ead9882cd9a5702113bbe3cc7b160") : Collections.unmodifiableList(this.z);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < unmodifiableList.size(); i++) {
            arrayList.add(((WeightedLatLng) unmodifiableList.get(i)).latLng);
        }
        return arrayList;
    }
}
