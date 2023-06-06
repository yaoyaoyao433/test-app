package com.tencent.mapsdk.internal;

import com.BV.LinearGradient.LinearGradientManager;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.sankuai.xm.monitor.report.db.TraceBean;
import com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.map.tools.json.annotation.JsonType;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngDeserializer;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class ed extends JsonComposer {
    @Json(name = "info")
    public b b;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b extends JsonComposer {
        @Json(name = "error")
        public int a;
        @Json(name = "msg")
        public String b;
    }

    public abstract int a();

    public abstract int b();

    public boolean c() {
        return this.b != null && this.b.a == 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends JsonComposer {
        @Json(name = "layerType")
        public String b;
        @Json(name = "data")
        public C1476a c;

        public boolean a() {
            if (this.c != null) {
                C1476a c1476a = this.c;
                if (c1476a.b != null && c1476a.b.size() > 0) {
                    return true;
                }
            }
            return false;
        }

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.mapsdk.internal.ed$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1476a extends JsonComposer {
            @Json(name = "version")
            public int a;
            @Json(name = "default")
            public List<AbstractC1477a> b;

            /* compiled from: ProGuard */
            @JsonType(deserializer = ea.class)
            /* renamed from: com.tencent.mapsdk.internal.ed$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static abstract class AbstractC1477a extends JsonComposer {
                @Json(name = "type")
                public String a;
            }

            /* compiled from: ProGuard */
            /* renamed from: com.tencent.mapsdk.internal.ed$a$a$b */
            /* loaded from: classes6.dex */
            public static class b extends AbstractC1477a {
                @Json(deserializer = ef.class, name = "coordinates")
                public List<LatLng> b;
                @Json(name = GearsLocator.MALL_WEIGHT)
                public int c;
            }

            /* compiled from: ProGuard */
            /* renamed from: com.tencent.mapsdk.internal.ed$a$a$c */
            /* loaded from: classes6.dex */
            public static class c extends AbstractC1477a {
                @Json(deserializer = LatLngDeserializer.class, name = "coordinates")
                public LatLng b;
                @Json(name = GearsLocator.MALL_WEIGHT)
                public int c;
            }

            /* compiled from: ProGuard */
            /* renamed from: com.tencent.mapsdk.internal.ed$a$a$d */
            /* loaded from: classes6.dex */
            public static class d extends AbstractC1477a {
                @Json(deserializer = eg.class, name = "coordinates")
                public List<WeightedLatLng> b;
            }

            private boolean a() {
                return this.b != null && this.b.size() > 0;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class c extends JsonComposer {
        @Json(name = "version")
        public int c;
        @Json(name = "mapping")
        public b d;

        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public static abstract class a extends JsonComposer {
            @Json(name = "displayLevel")
            public int f;
            @Json(name = "zIndex")
            public int g;
            @Json(name = "hidden")
            public boolean h;
            @Json(name = "opacity")
            public double i;
            @Json(name = "maxZoom")
            public int j;
            @Json(name = "minZoom")
            public int k;
            @Json(name = "themeName")
            public String l;

            public boolean a() {
                return true;
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public static final class b extends JsonComposer {
            @Json(name = TraceBean.RULE)
            public a a;

            /* compiled from: ProGuard */
            /* loaded from: classes6.dex */
            public static final class a extends JsonComposer {
                @Json(name = "default")
                public String a;
            }
        }

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.mapsdk.internal.ed$c$c  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static abstract class AbstractC1478c extends JsonComposer {
        }

        public boolean a() {
            return true;
        }

        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public static final class e extends JsonComposer {
            @Json(name = "points")
            public List<Double> a;
            @Json(name = LinearGradientManager.PROP_COLORS)
            public List<Integer> b;

            private boolean a() {
                return this.a != null && this.a.size() > 0 && this.b != null && this.b.size() > 0;
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes6.dex */
        public static class d extends JsonComposer {
            @Json(name = "duration")
            public double c;

            private boolean a() {
                return this.c >= 0.0d;
            }
        }
    }
}
