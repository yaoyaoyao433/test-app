package com.tencent.mapsdk.internal;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.mapsdk.internal.ed;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class dy extends ed {
    @Json(name = GearsLocator.DETAIL)
    public a a;

    @Override // com.tencent.mapsdk.internal.ed
    public final int a() {
        if (c()) {
            return this.a.c.a;
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.internal.ed
    public final int b() {
        if (c()) {
            return this.a.a.c;
        }
        return 0;
    }

    @Override // com.tencent.mapsdk.internal.ed
    public final boolean c() {
        return super.c() && this.a != null && this.a.a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a extends ed.a {
        @Json(name = "styleTable")
        public C1466a a;

        @Override // com.tencent.mapsdk.internal.ed.a
        public final boolean a() {
            return super.a() && dx.Aggregation.a(this.b) && this.a != null && this.a.a();
        }

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.mapsdk.internal.dy$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1466a extends ed.c {
            @Json(name = "theme")
            public b a;
            @Json(name = "control")
            public C1467a b;

            /* compiled from: ProGuard */
            /* renamed from: com.tencent.mapsdk.internal.dy$a$a$b */
            /* loaded from: classes6.dex */
            public static final class b extends JsonComposer {
                @Json(name = "standard")
                public C1469b a;

                /* compiled from: ProGuard */
                /* renamed from: com.tencent.mapsdk.internal.dy$a$a$b$a  reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C1468a extends ed.c.AbstractC1478c {
                    @Json(name = "gap")
                    public int a;
                    @Json(name = "radius")
                    public int b;
                    @Json(name = "shapeType")
                    public String c;
                    @Json(name = "gradient")
                    public ed.c.e d;
                    @Json(name = "animation")
                    public ed.c.d e;
                }

                /* compiled from: ProGuard */
                /* renamed from: com.tencent.mapsdk.internal.dy$a$a$b$b  reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C1469b extends JsonComposer {
                    @Json(name = "defaultStyle")
                    public C1468a a;
                }
            }

            @Override // com.tencent.mapsdk.internal.ed.c
            public final boolean a() {
                return (!super.a() || this.a == null || this.b == null) ? false : true;
            }

            /* compiled from: ProGuard */
            /* renamed from: com.tencent.mapsdk.internal.dy$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C1467a extends ed.c.a {
                @Json(name = "maxIntensity")
                public double a;
                @Json(name = "minIntensity")
                public double b;
                @Json(name = "enable3D")
                public boolean c;
                @Json(name = "heightRange")
                public List<Double> d;
                @Json(name = DMKeys.KEY_SHARE_INFO_ANIMATED)
                public boolean e;

                @Override // com.tencent.mapsdk.internal.ed.c.a
                public final boolean a() {
                    return super.a() && this.d != null && this.d.size() > 0;
                }
            }
        }
    }
}
