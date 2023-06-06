package com.meituan.msc.mmpviews.csstypes;

import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends d<C0448b> {
    public static ChangeQuickRedirect a;
    public static final b b;
    private static final C0448b e;

    static {
        a aVar = a.REPEAT;
        e = new C0448b(aVar, aVar);
        b = new b();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [com.meituan.msc.mmpviews.csstypes.b$b[], T[]] */
    public static b a(ReadableArray readableArray) {
        C0448b c0448b;
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d6fb92855663fb18c93b9cfb33b406e", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d6fb92855663fb18c93b9cfb33b406e");
        }
        if (readableArray == null) {
            return b;
        }
        b bVar = new b();
        bVar.d = new C0448b[readableArray.size()];
        for (int i = 0; i < ((C0448b[]) bVar.d).length; i++) {
            C0448b[] c0448bArr = (C0448b[]) bVar.d;
            Dynamic dynamic = readableArray.getDynamic(i);
            Object[] objArr2 = {dynamic};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "799d17bce06a73679ca3b9d824bd9f16", RobustBitConfig.DEFAULT_VALUE)) {
                c0448b = (C0448b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "799d17bce06a73679ca3b9d824bd9f16");
            } else {
                ReadableType type = dynamic.getType();
                if (type == ReadableType.String) {
                    c0448b = a(dynamic.asString());
                } else if (type == ReadableType.Array) {
                    ReadableArray asArray = dynamic.asArray();
                    int size = asArray.size();
                    if (size == 1) {
                        c0448b = a(asArray.getString(0));
                    } else if (size == 2) {
                        c0448b = new C0448b(a.a(asArray.getString(0)), a.a(asArray.getString(1)));
                    } else {
                        throw new IllegalArgumentException("Wrong value: " + dynamic);
                    }
                } else {
                    throw new IllegalArgumentException("Wrong value: " + dynamic);
                }
            }
            c0448bArr[i] = c0448b;
        }
        return bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r12.equals("repeat-y") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.meituan.msc.mmpviews.csstypes.b.C0448b a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.mmpviews.csstypes.b.a
            java.lang.String r11 = "8fb77f126d3f6951f0cfd58a236c5250"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            com.meituan.msc.mmpviews.csstypes.b$b r12 = (com.meituan.msc.mmpviews.csstypes.b.C0448b) r12
            return r12
        L1f:
            r1 = -1
            int r2 = r12.hashCode()
            switch(r2) {
                case -934531685: goto L5e;
                case -724648153: goto L53;
                case -436782906: goto L48;
                case -436782905: goto L3e;
                case 108704142: goto L33;
                case 109637894: goto L28;
                default: goto L27;
            }
        L27:
            goto L69
        L28:
            java.lang.String r0 = "space"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L69
            r0 = 2
            goto L6a
        L33:
            java.lang.String r0 = "round"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L69
            r0 = 3
            goto L6a
        L3e:
            java.lang.String r2 = "repeat-y"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L69
            goto L6a
        L48:
            java.lang.String r0 = "repeat-x"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L69
            r0 = 0
            goto L6a
        L53:
            java.lang.String r0 = "no-repeat"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L69
            r0 = 4
            goto L6a
        L5e:
            java.lang.String r0 = "repeat"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L69
            r0 = 5
            goto L6a
        L69:
            r0 = -1
        L6a:
            switch(r0) {
                case 0: goto L97;
                case 1: goto L8d;
                case 2: goto L85;
                case 3: goto L7d;
                case 4: goto L75;
                default: goto L6d;
            }
        L6d:
            com.meituan.msc.mmpviews.csstypes.b$b r12 = new com.meituan.msc.mmpviews.csstypes.b$b
            com.meituan.msc.mmpviews.csstypes.b$a r0 = com.meituan.msc.mmpviews.csstypes.b.a.REPEAT
            r12.<init>(r0, r0)
            goto La0
        L75:
            com.meituan.msc.mmpviews.csstypes.b$b r12 = new com.meituan.msc.mmpviews.csstypes.b$b
            com.meituan.msc.mmpviews.csstypes.b$a r0 = com.meituan.msc.mmpviews.csstypes.b.a.NO_REPEAT
            r12.<init>(r0, r0)
            goto La0
        L7d:
            com.meituan.msc.mmpviews.csstypes.b$b r12 = new com.meituan.msc.mmpviews.csstypes.b$b
            com.meituan.msc.mmpviews.csstypes.b$a r0 = com.meituan.msc.mmpviews.csstypes.b.a.ROUND
            r12.<init>(r0, r0)
            goto La0
        L85:
            com.meituan.msc.mmpviews.csstypes.b$b r12 = new com.meituan.msc.mmpviews.csstypes.b$b
            com.meituan.msc.mmpviews.csstypes.b$a r0 = com.meituan.msc.mmpviews.csstypes.b.a.SPACE
            r12.<init>(r0, r0)
            goto La0
        L8d:
            com.meituan.msc.mmpviews.csstypes.b$b r12 = new com.meituan.msc.mmpviews.csstypes.b$b
            com.meituan.msc.mmpviews.csstypes.b$a r0 = com.meituan.msc.mmpviews.csstypes.b.a.NO_REPEAT
            com.meituan.msc.mmpviews.csstypes.b$a r1 = com.meituan.msc.mmpviews.csstypes.b.a.REPEAT
            r12.<init>(r0, r1)
            goto La0
        L97:
            com.meituan.msc.mmpviews.csstypes.b$b r12 = new com.meituan.msc.mmpviews.csstypes.b$b
            com.meituan.msc.mmpviews.csstypes.b$a r0 = com.meituan.msc.mmpviews.csstypes.b.a.REPEAT
            com.meituan.msc.mmpviews.csstypes.b$a r1 = com.meituan.msc.mmpviews.csstypes.b.a.NO_REPEAT
            r12.<init>(r0, r1)
        La0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.csstypes.b.a(java.lang.String):com.meituan.msc.mmpviews.csstypes.b$b");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.mmpviews.csstypes.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0448b {
        public static ChangeQuickRedirect a;
        private final a b;
        private final a c;

        public C0448b(a aVar, a aVar2) {
            Object[] objArr = {aVar, aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baa9fa14723005848791f8bba9728822", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baa9fa14723005848791f8bba9728822");
                return;
            }
            this.b = aVar;
            this.c = aVar2;
        }

        public final boolean a() {
            return this.b == a.NO_REPEAT;
        }

        public final boolean b() {
            return this.c == a.NO_REPEAT;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        REPEAT,
        SPACE,
        ROUND,
        NO_REPEAT;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fba84e23fd4b72ecc8d8a907dd0ebc9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fba84e23fd4b72ecc8d8a907dd0ebc9");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a6a8121d24c90f4e6f6e744cf0a8322", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a6a8121d24c90f4e6f6e744cf0a8322") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "316063ef0128f6e31d7dc35b7d04e183", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "316063ef0128f6e31d7dc35b7d04e183") : (a[]) values().clone();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
            if (r12.equals("round") != false) goto L20;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.meituan.msc.mmpviews.csstypes.b.a a(java.lang.String r12) {
            /*
                r0 = 1
                java.lang.Object[] r8 = new java.lang.Object[r0]
                r9 = 0
                r8[r9] = r12
                com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msc.mmpviews.csstypes.b.a.a
                java.lang.String r11 = "9fad70116793a5325c266a59df91d5b1"
                r2 = 0
                r4 = 1
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r1 = r8
                r3 = r10
                r5 = r11
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L1f
                r12 = 0
                java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
                com.meituan.msc.mmpviews.csstypes.b$a r12 = (com.meituan.msc.mmpviews.csstypes.b.a) r12
                return r12
            L1f:
                if (r12 != 0) goto L24
                com.meituan.msc.mmpviews.csstypes.b$a r12 = com.meituan.msc.mmpviews.csstypes.b.a.REPEAT
                return r12
            L24:
                r1 = -1
                int r2 = r12.hashCode()
                r3 = -934531685(0xffffffffc84c2d9b, float:-209078.42)
                if (r2 == r3) goto L5e
                r3 = -724648153(0xffffffffd4cebf27, float:-7.1037621E12)
                if (r2 == r3) goto L53
                r3 = 108704142(0x67ab18e, float:4.715022E-35)
                if (r2 == r3) goto L49
                r0 = 109637894(0x688f106, float:5.1511666E-35)
                if (r2 == r0) goto L3e
                goto L69
            L3e:
                java.lang.String r0 = "space"
                boolean r12 = r12.equals(r0)
                if (r12 == 0) goto L69
                r0 = 0
                goto L6a
            L49:
                java.lang.String r2 = "round"
                boolean r12 = r12.equals(r2)
                if (r12 == 0) goto L69
                goto L6a
            L53:
                java.lang.String r0 = "no-repeat"
                boolean r12 = r12.equals(r0)
                if (r12 == 0) goto L69
                r0 = 2
                goto L6a
            L5e:
                java.lang.String r0 = "repeat"
                boolean r12 = r12.equals(r0)
                if (r12 == 0) goto L69
                r0 = 3
                goto L6a
            L69:
                r0 = -1
            L6a:
                switch(r0) {
                    case 0: goto L76;
                    case 1: goto L73;
                    case 2: goto L70;
                    default: goto L6d;
                }
            L6d:
                com.meituan.msc.mmpviews.csstypes.b$a r12 = com.meituan.msc.mmpviews.csstypes.b.a.REPEAT
                return r12
            L70:
                com.meituan.msc.mmpviews.csstypes.b$a r12 = com.meituan.msc.mmpviews.csstypes.b.a.NO_REPEAT
                return r12
            L73:
                com.meituan.msc.mmpviews.csstypes.b$a r12 = com.meituan.msc.mmpviews.csstypes.b.a.ROUND
                return r12
            L76:
                com.meituan.msc.mmpviews.csstypes.b$a r12 = com.meituan.msc.mmpviews.csstypes.b.a.SPACE
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.csstypes.b.a.a(java.lang.String):com.meituan.msc.mmpviews.csstypes.b$a");
        }
    }

    @Override // com.meituan.msc.mmpviews.csstypes.d
    public final /* bridge */ /* synthetic */ C0448b a() {
        return e;
    }
}
