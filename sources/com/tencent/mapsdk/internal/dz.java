package com.tencent.mapsdk.internal;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.mapsdk.internal.ed;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class dz extends ed {
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
        public C1470a a;

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.mapsdk.internal.dz$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1470a extends ed.c {
            @Json(name = "theme")
            public b a;
            @Json(name = "control")
            public C1471a b;

            /* compiled from: ProGuard */
            /* renamed from: com.tencent.mapsdk.internal.dz$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C1471a extends ed.c.a {
                @Json(name = "enable3D")
                public boolean a;
                @Json(name = DMKeys.KEY_SHARE_INFO_ANIMATED)
                public boolean b;
                @Json(name = "animation")
                public C1472a c;

                /* compiled from: ProGuard */
                /* renamed from: com.tencent.mapsdk.internal.dz$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C1472a extends JsonComposer {
                    @Json(name = "highlightDuration")
                    public double a;
                    @Json(name = "highlightColor")
                    public int b;
                    @Json(name = "duration")
                    public double c;
                }
            }

            /* compiled from: ProGuard */
            /* renamed from: com.tencent.mapsdk.internal.dz$a$a$b */
            /* loaded from: classes6.dex */
            public static final class b extends JsonComposer {
                @Json(name = "standard")
                public C1475b a;

                /* compiled from: ProGuard */
                /* renamed from: com.tencent.mapsdk.internal.dz$a$a$b$a  reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C1473a extends ed.c.AbstractC1478c {
                    @Json(name = "width")
                    public int a;
                    @Json(name = "radian")
                    public double b;
                    @Json(name = "gradient")
                    public ed.c.e c;
                    @Json(name = "animation")
                    public C1474a d;

                    /* compiled from: ProGuard */
                    /* renamed from: com.tencent.mapsdk.internal.dz$a$a$b$a$a  reason: collision with other inner class name */
                    /* loaded from: classes6.dex */
                    public static final class C1474a extends ed.c.d {
                        @Json(name = "highlightDuration")
                        public double a;
                        @Json(name = "highlightColor")
                        public int b;
                    }
                }

                /* compiled from: ProGuard */
                /* renamed from: com.tencent.mapsdk.internal.dz$a$a$b$b  reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C1475b extends JsonComposer {
                    @Json(name = "defaultStyle")
                    public C1473a a;
                }
            }
        }

        @Override // com.tencent.mapsdk.internal.ed.a
        public final boolean a() {
            return super.a() && dx.ArcLine.a(this.b) && this.a != null && this.a.a();
        }
    }
}
