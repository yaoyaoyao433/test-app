package com.tencent.mapsdk.internal;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.mapsdk.internal.ed;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ee extends ed {
    @Json(name = GearsLocator.DETAIL)
    public a a;

    @Override // com.tencent.mapsdk.internal.ed
    public final boolean c() {
        return super.c() && this.a != null && this.a.a();
    }

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

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a extends ed.a {
        @Json(name = "styleTable")
        public C1479a a;

        @Override // com.tencent.mapsdk.internal.ed.a
        public final boolean a() {
            return super.a() && dx.Gradient.a(this.b) && this.a != null && this.a.a();
        }

        /* compiled from: ProGuard */
        /* renamed from: com.tencent.mapsdk.internal.ee$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1479a extends ed.c {
            @Json(name = "theme")
            public b a;
            @Json(name = "control")
            public C1480a b;

            /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x005e  */
            @Override // com.tencent.mapsdk.internal.ed.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean a() {
                /*
                    r8 = this;
                    boolean r0 = super.a()
                    r1 = 0
                    if (r0 == 0) goto L70
                    com.tencent.mapsdk.internal.ee$a$a$b r0 = r8.a
                    if (r0 == 0) goto L70
                    com.tencent.mapsdk.internal.ee$a$a$b r0 = r8.a
                    com.tencent.mapsdk.internal.ee$a$a$b$b r2 = r0.a
                    r3 = 1
                    if (r2 == 0) goto L60
                    com.tencent.mapsdk.internal.ee$a$a$b$b r0 = r0.a
                    com.tencent.mapsdk.internal.ee$a$a$b$a r2 = r0.a
                    if (r2 == 0) goto L5b
                    com.tencent.mapsdk.internal.ee$a$a$b$a r0 = r0.a
                    int r2 = r0.a
                    if (r2 <= 0) goto L56
                    com.tencent.mapsdk.internal.ed$c$e r2 = r0.b
                    if (r2 == 0) goto L56
                    com.tencent.mapsdk.internal.ed$c$e r2 = r0.b
                    java.util.List<java.lang.Double> r4 = r2.a
                    if (r4 == 0) goto L3e
                    java.util.List<java.lang.Double> r4 = r2.a
                    int r4 = r4.size()
                    if (r4 <= 0) goto L3e
                    java.util.List<java.lang.Integer> r4 = r2.b
                    if (r4 == 0) goto L3e
                    java.util.List<java.lang.Integer> r2 = r2.b
                    int r2 = r2.size()
                    if (r2 <= 0) goto L3e
                    r2 = 1
                    goto L3f
                L3e:
                    r2 = 0
                L3f:
                    if (r2 == 0) goto L56
                    com.tencent.mapsdk.internal.ed$c$d r2 = r0.c
                    if (r2 == 0) goto L56
                    com.tencent.mapsdk.internal.ed$c$d r0 = r0.c
                    double r4 = r0.c
                    r6 = 0
                    int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r0 < 0) goto L51
                    r0 = 1
                    goto L52
                L51:
                    r0 = 0
                L52:
                    if (r0 == 0) goto L56
                    r0 = 1
                    goto L57
                L56:
                    r0 = 0
                L57:
                    if (r0 == 0) goto L5b
                    r0 = 1
                    goto L5c
                L5b:
                    r0 = 0
                L5c:
                    if (r0 == 0) goto L60
                    r0 = 1
                    goto L61
                L60:
                    r0 = 0
                L61:
                    if (r0 == 0) goto L70
                    com.tencent.mapsdk.internal.ee$a$a$a r0 = r8.b
                    if (r0 == 0) goto L70
                    com.tencent.mapsdk.internal.ee$a$a$a r0 = r8.b
                    boolean r0 = r0.a()
                    if (r0 == 0) goto L70
                    return r3
                L70:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ee.a.C1479a.a():boolean");
            }

            /* compiled from: ProGuard */
            /* renamed from: com.tencent.mapsdk.internal.ee$a$a$b */
            /* loaded from: classes6.dex */
            public static final class b extends JsonComposer {
                @Json(name = "standard")
                public C1482b a;

                /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0052 A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private boolean a() {
                    /*
                        r8 = this;
                        com.tencent.mapsdk.internal.ee$a$a$b$b r0 = r8.a
                        r1 = 0
                        if (r0 == 0) goto L53
                        com.tencent.mapsdk.internal.ee$a$a$b$b r0 = r8.a
                        com.tencent.mapsdk.internal.ee$a$a$b$a r2 = r0.a
                        r3 = 1
                        if (r2 == 0) goto L4f
                        com.tencent.mapsdk.internal.ee$a$a$b$a r0 = r0.a
                        int r2 = r0.a
                        if (r2 <= 0) goto L4a
                        com.tencent.mapsdk.internal.ed$c$e r2 = r0.b
                        if (r2 == 0) goto L4a
                        com.tencent.mapsdk.internal.ed$c$e r2 = r0.b
                        java.util.List<java.lang.Double> r4 = r2.a
                        if (r4 == 0) goto L32
                        java.util.List<java.lang.Double> r4 = r2.a
                        int r4 = r4.size()
                        if (r4 <= 0) goto L32
                        java.util.List<java.lang.Integer> r4 = r2.b
                        if (r4 == 0) goto L32
                        java.util.List<java.lang.Integer> r2 = r2.b
                        int r2 = r2.size()
                        if (r2 <= 0) goto L32
                        r2 = 1
                        goto L33
                    L32:
                        r2 = 0
                    L33:
                        if (r2 == 0) goto L4a
                        com.tencent.mapsdk.internal.ed$c$d r2 = r0.c
                        if (r2 == 0) goto L4a
                        com.tencent.mapsdk.internal.ed$c$d r0 = r0.c
                        double r4 = r0.c
                        r6 = 0
                        int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                        if (r0 < 0) goto L45
                        r0 = 1
                        goto L46
                    L45:
                        r0 = 0
                    L46:
                        if (r0 == 0) goto L4a
                        r0 = 1
                        goto L4b
                    L4a:
                        r0 = 0
                    L4b:
                        if (r0 == 0) goto L4f
                        r0 = 1
                        goto L50
                    L4f:
                        r0 = 0
                    L50:
                        if (r0 == 0) goto L53
                        return r3
                    L53:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ee.a.C1479a.b.a():boolean");
                }

                /* compiled from: ProGuard */
                /* renamed from: com.tencent.mapsdk.internal.ee$a$a$b$b  reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C1482b extends JsonComposer {
                    @Json(name = "defaultStyle")
                    public C1481a a;

                    /* JADX WARN: Removed duplicated region for block: B:29:0x0047 A[RETURN] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    private boolean a() {
                        /*
                            r8 = this;
                            com.tencent.mapsdk.internal.ee$a$a$b$a r0 = r8.a
                            r1 = 0
                            if (r0 == 0) goto L48
                            com.tencent.mapsdk.internal.ee$a$a$b$a r0 = r8.a
                            int r2 = r0.a
                            r3 = 1
                            if (r2 <= 0) goto L44
                            com.tencent.mapsdk.internal.ed$c$e r2 = r0.b
                            if (r2 == 0) goto L44
                            com.tencent.mapsdk.internal.ed$c$e r2 = r0.b
                            java.util.List<java.lang.Double> r4 = r2.a
                            if (r4 == 0) goto L2c
                            java.util.List<java.lang.Double> r4 = r2.a
                            int r4 = r4.size()
                            if (r4 <= 0) goto L2c
                            java.util.List<java.lang.Integer> r4 = r2.b
                            if (r4 == 0) goto L2c
                            java.util.List<java.lang.Integer> r2 = r2.b
                            int r2 = r2.size()
                            if (r2 <= 0) goto L2c
                            r2 = 1
                            goto L2d
                        L2c:
                            r2 = 0
                        L2d:
                            if (r2 == 0) goto L44
                            com.tencent.mapsdk.internal.ed$c$d r2 = r0.c
                            if (r2 == 0) goto L44
                            com.tencent.mapsdk.internal.ed$c$d r0 = r0.c
                            double r4 = r0.c
                            r6 = 0
                            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                            if (r0 < 0) goto L3f
                            r0 = 1
                            goto L40
                        L3f:
                            r0 = 0
                        L40:
                            if (r0 == 0) goto L44
                            r0 = 1
                            goto L45
                        L44:
                            r0 = 0
                        L45:
                            if (r0 == 0) goto L48
                            return r3
                        L48:
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ee.a.C1479a.b.C1482b.a():boolean");
                    }
                }

                /* compiled from: ProGuard */
                /* renamed from: com.tencent.mapsdk.internal.ee$a$a$b$a  reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C1481a extends ed.c.AbstractC1478c {
                    @Json(name = "radius")
                    public int a;
                    @Json(name = "gradient")
                    public ed.c.e b;
                    @Json(name = "animation")
                    public ed.c.d c;

                    private boolean a() {
                        if (this.a > 0 && this.b != null) {
                            ed.c.e eVar = this.b;
                            if ((eVar.a != null && eVar.a.size() > 0 && eVar.b != null && eVar.b.size() > 0) && this.c != null) {
                                if (this.c.c >= 0.0d) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
            }

            /* compiled from: ProGuard */
            /* renamed from: com.tencent.mapsdk.internal.ee$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C1480a extends ed.c.a {
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
