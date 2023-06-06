package com.sankuai.waimai.mach.component.swiper.recyclerview;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ScaleLayoutManager extends ViewPagerLayoutManager {
    public static ChangeQuickRedirect a;
    private int A;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private int z;

    public ScaleLayoutManager(Context context, int i) {
        this(new a(context, i));
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "682e12ad080f5c97574653a2c50df135", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "682e12ad080f5c97574653a2c50df135");
            return;
        }
        Object[] objArr2 = {Float.valueOf(1.0f)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09dfe23eedbc3361fcd09f6c26447de5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09dfe23eedbc3361fcd09f6c26447de5");
        } else {
            assertNotInLayoutOrScroll(null);
            if (this.q != 1.0f) {
                this.q = 1.0f;
                removeAllViews();
            }
        }
        Object[] objArr3 = {Float.valueOf(1.0f)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cdb98c29eb083600452ff11616b50f21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cdb98c29eb083600452ff11616b50f21");
            return;
        }
        assertNotInLayoutOrScroll(null);
        if (this.r != 1.0f) {
            this.r = 1.0f;
            removeAllViews();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ScaleLayoutManager(android.content.Context r10, int r11, int r12) {
        /*
            r9 = this;
            com.sankuai.waimai.mach.component.swiper.recyclerview.ScaleLayoutManager$a r0 = new com.sankuai.waimai.mach.component.swiper.recyclerview.ScaleLayoutManager$a
            r0.<init>(r10, r11)
            r0.b = r12
            r9.<init>(r0)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r11 = 1
            r0[r11] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r11 = 2
            r0[r11] = r10
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.component.swiper.recyclerview.ScaleLayoutManager.a
            java.lang.String r11 = "46545c61318c71c1c3a036c4776fdd5b"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r9
            r3 = r10
            r5 = r11
            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r12 == 0) goto L33
            com.meituan.robust.PatchProxy.accessDispatch(r0, r9, r10, r8, r11)
            return
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.component.swiper.recyclerview.ScaleLayoutManager.<init>(android.content.Context, int, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ScaleLayoutManager(android.content.Context r10, int r11, int r12, boolean r13) {
        /*
            r9 = this;
            com.sankuai.waimai.mach.component.swiper.recyclerview.ScaleLayoutManager$a r0 = new com.sankuai.waimai.mach.component.swiper.recyclerview.ScaleLayoutManager$a
            r0.<init>(r10, r11)
            r0.b = r12
            r0.i = r13
            r9.<init>(r0)
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r11 = 1
            r0[r11] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r11 = 2
            r0[r11] = r10
            java.lang.Byte r10 = java.lang.Byte.valueOf(r13)
            r11 = 3
            r0[r11] = r10
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.mach.component.swiper.recyclerview.ScaleLayoutManager.a
            java.lang.String r11 = "4bd8b96177dc63d5202b1a2350246ca7"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r9
            r3 = r10
            r5 = r11
            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r12 == 0) goto L3c
            com.meituan.robust.PatchProxy.accessDispatch(r0, r9, r10, r8, r11)
            return
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.component.swiper.recyclerview.ScaleLayoutManager.<init>(android.content.Context, int, int, boolean):void");
    }

    public ScaleLayoutManager(a aVar) {
        this(aVar.r, aVar.n, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.p, aVar.q, aVar.b, aVar.o, aVar.s, aVar.t, aVar.i, aVar.j, aVar.k);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9f67e19454cbd5d82a02899ad8ecd2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9f67e19454cbd5d82a02899ad8ecd2d");
        }
    }

    public ScaleLayoutManager(Context context, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i2, float f9, int i3, int i4, boolean z, int i5, int i6) {
        super(context, i2, z);
        Object[] objArr = {context, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7), Float.valueOf(f8), Integer.valueOf(i2), Float.valueOf(f9), Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc3831d501a944b5f50340d7dce13488", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc3831d501a944b5f50340d7dce13488");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = ViewPagerLayoutManager.b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fecff4f999852da3a7bb23e9d7215203", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fecff4f999852da3a7bb23e9d7215203");
        } else {
            assertNotInLayoutOrScroll(null);
            if (this.p != i4) {
                this.p = i4;
                removeAllViews();
            }
        }
        Object[] objArr3 = {Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect3 = ViewPagerLayoutManager.b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ae97c52ddd4b3e1d1b7b23694c0e2f80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ae97c52ddd4b3e1d1b7b23694c0e2f80");
        } else {
            assertNotInLayoutOrScroll(null);
            if (this.o != i3) {
                this.o = i3;
                removeAllViews();
            }
        }
        this.j = i;
        this.q = f;
        this.r = f2;
        this.v = f3;
        this.w = f4;
        this.x = f5;
        this.y = f6;
        this.s = f9;
        this.t = f7;
        this.u = f8;
        this.z = i5;
        this.A = i6;
    }

    @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.ViewPagerLayoutManager
    public final float a() {
        return this.j + this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0132 A[Catch: Exception -> 0x01a6, TryCatch #0 {Exception -> 0x01a6, blocks: (B:6:0x0027, B:8:0x005c, B:14:0x0085, B:16:0x00a2, B:21:0x00c9, B:23:0x00ea, B:32:0x0118, B:34:0x0132, B:42:0x015b, B:44:0x017c, B:49:0x01a2, B:45:0x0187, B:47:0x019e, B:35:0x013d, B:38:0x0142, B:40:0x014f, B:41:0x0152, B:25:0x00f7, B:28:0x00fe, B:30:0x010b, B:31:0x010e, B:17:0x00ad, B:19:0x00ba, B:20:0x00bd, B:10:0x0068, B:12:0x0075, B:13:0x0078), top: B:52:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013d A[Catch: Exception -> 0x01a6, TryCatch #0 {Exception -> 0x01a6, blocks: (B:6:0x0027, B:8:0x005c, B:14:0x0085, B:16:0x00a2, B:21:0x00c9, B:23:0x00ea, B:32:0x0118, B:34:0x0132, B:42:0x015b, B:44:0x017c, B:49:0x01a2, B:45:0x0187, B:47:0x019e, B:35:0x013d, B:38:0x0142, B:40:0x014f, B:41:0x0152, B:25:0x00f7, B:28:0x00fe, B:30:0x010b, B:31:0x010e, B:17:0x00ad, B:19:0x00ba, B:20:0x00bd, B:10:0x0068, B:12:0x0075, B:13:0x0078), top: B:52:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017c A[Catch: Exception -> 0x01a6, TryCatch #0 {Exception -> 0x01a6, blocks: (B:6:0x0027, B:8:0x005c, B:14:0x0085, B:16:0x00a2, B:21:0x00c9, B:23:0x00ea, B:32:0x0118, B:34:0x0132, B:42:0x015b, B:44:0x017c, B:49:0x01a2, B:45:0x0187, B:47:0x019e, B:35:0x013d, B:38:0x0142, B:40:0x014f, B:41:0x0152, B:25:0x00f7, B:28:0x00fe, B:30:0x010b, B:31:0x010e, B:17:0x00ad, B:19:0x00ba, B:20:0x00bd, B:10:0x0068, B:12:0x0075, B:13:0x0078), top: B:52:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0187 A[Catch: Exception -> 0x01a6, TryCatch #0 {Exception -> 0x01a6, blocks: (B:6:0x0027, B:8:0x005c, B:14:0x0085, B:16:0x00a2, B:21:0x00c9, B:23:0x00ea, B:32:0x0118, B:34:0x0132, B:42:0x015b, B:44:0x017c, B:49:0x01a2, B:45:0x0187, B:47:0x019e, B:35:0x013d, B:38:0x0142, B:40:0x014f, B:41:0x0152, B:25:0x00f7, B:28:0x00fe, B:30:0x010b, B:31:0x010e, B:17:0x00ad, B:19:0x00ba, B:20:0x00bd, B:10:0x0068, B:12:0x0075, B:13:0x0078), top: B:52:0x0027 }] */
    @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.ViewPagerLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r19, float r20) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.component.swiper.recyclerview.ScaleLayoutManager.a(android.view.View, float):void");
    }

    @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.ViewPagerLayoutManager
    public final float b() {
        if (this.s == 0.0f) {
            return Float.MAX_VALUE;
        }
        return 1.0f / this.s;
    }

    @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.ViewPagerLayoutManager
    public final void c() {
        this.f = this.z;
        this.g = this.A;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a = null;
        private static float l = 1.0f;
        private static float m = 1.0f;
        public int b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        boolean i;
        public int j;
        public int k;
        private int n;
        private float o;
        private float p;
        private float q;
        private Context r;
        private int s;
        private int t;

        public a(Context context, int i) {
            Object[] objArr = {context, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aaad2457f3dbe5e5f221cf6b3c89f61", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aaad2457f3dbe5e5f221cf6b3c89f61");
                return;
            }
            this.n = i;
            this.r = context;
            this.b = 0;
            this.c = 1.0f;
            this.d = 1.0f;
            this.o = 1.0f;
            this.p = m;
            this.q = l;
            this.i = false;
            this.t = Integer.MAX_VALUE;
            this.s = -1;
        }
    }
}
