package com.sankuai.waimai.platform.mach.rooimage;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.imageloader.b;
import com.sankuai.waimai.mach.widget.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.mach.component.base.a<c> {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private String d;
    private int e;
    private ImageView.ScaleType f;
    private com.sankuai.waimai.mach.imageloader.a g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1a3704da6ee629df8e4b67fe6f851ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1a3704da6ee629df8e4b67fe6f851ca");
        } else {
            this.g = new com.sankuai.waimai.mach.imageloader.a(this);
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(c cVar) {
        c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7973b05ec6cfd137a2f7f4f92680eb3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7973b05ec6cfd137a2f7f4f92680eb3c");
            return;
        }
        super.a((a) cVar2);
        if (!TextUtils.isEmpty(this.d)) {
            cVar2.setSource(this.d);
        } else {
            cVar2.setSource(this.b);
        }
        cVar2.setRepeat(this.f == ImageView.ScaleType.MATRIX);
        cVar2.setLoopCount(this.e);
        this.g.a(new b(cVar2));
        if (this.f != null) {
            cVar2.setScaleType(this.f);
        }
        try {
            if (!TextUtils.isEmpty(this.g.b)) {
                cVar2.setColorFilter(Color.parseColor(this.g.b));
            } else {
                cVar2.clearColorFilter();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @NonNull
    public final /* synthetic */ c b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39821e9f09287cb9ec26e46dd792d7b6", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39821e9f09287cb9ec26e46dd792d7b6") : new c(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
        if (r4.equals("loop") == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x002c A[SYNTHETIC] */
    @Override // com.sankuai.waimai.mach.component.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r14 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.platform.mach.rooimage.a.a
            java.lang.String r10 = "b86cabe079ec29e329ae018a4bf4b38f"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r14
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r14, r9, r0, r10)
            return
        L18:
            java.util.Map r1 = r14.k()
            if (r1 == 0) goto Lb3
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lb3
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r3 = 1
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r12 = com.sankuai.waimai.platform.mach.rooimage.a.a
            java.lang.String r13 = "43c8ca5fe5bfbb2d026b80bbf2415326"
            r7 = 0
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            r4 = r11
            r5 = r14
            r6 = r12
            r8 = r13
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L52
            com.meituan.robust.PatchProxy.accessDispatch(r11, r14, r12, r0, r13)
            goto L2c
        L52:
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r2.getValue()
            if (r5 != 0) goto L61
            java.lang.String r2 = ""
            goto L69
        L61:
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = r2.toString()
        L69:
            r5 = -1
            int r6 = r4.hashCode()
            r7 = -1767960325(0xffffffff969f10fb, float:-2.5698552E-25)
            if (r6 == r7) goto L93
            r7 = -896505829(0xffffffffca90681b, float:-4731917.5)
            if (r6 == r7) goto L88
            r7 = 3327652(0x32c6a4, float:4.663034E-39)
            if (r6 == r7) goto L7e
            goto L9e
        L7e:
            java.lang.String r6 = "loop"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L9e
            goto L9f
        L88:
            java.lang.String r3 = "source"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L9e
            r3 = 0
            goto L9f
        L93:
            java.lang.String r3 = "src-roo-key"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L9e
            r3 = 2
            goto L9f
        L9e:
            r3 = -1
        L9f:
            switch(r3) {
                case 0: goto Laf;
                case 1: goto La6;
                case 2: goto La3;
                default: goto La2;
            }
        La2:
            goto L2c
        La3:
            r14.c = r2
            goto L2c
        La6:
            float r2 = com.sankuai.waimai.mach.utils.g.a(r2)
            int r2 = (int) r2
            r14.e = r2
            goto L2c
        Laf:
            r14.b = r2
            goto L2c
        Lb3:
            java.lang.String r0 = "resize-mode"
            java.lang.String r0 = r14.b(r0)
            boolean r1 = r14.i(r0)
            if (r1 == 0) goto Lc8
            com.sankuai.waimai.mach.model.value.j r0 = com.sankuai.waimai.mach.model.value.j.a(r0)
            android.widget.ImageView$ScaleType r0 = r0.j
            r14.f = r0
        Lc8:
            java.lang.String r0 = r14.c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lda
            android.content.Context r0 = com.meituan.android.singleton.b.a
            java.lang.String r1 = r14.c
            java.lang.String r0 = com.meituan.roodesign.resfetcher.runtime.c.a(r0, r1)
            r14.d = r0
        Lda:
            com.sankuai.waimai.mach.imageloader.a r0 = r14.g
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.mach.rooimage.a.a():void");
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @Nullable
    public final String a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c9e09efb85f935602a7d5bd66f02b70", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c9e09efb85f935602a7d5bd66f02b70");
        }
        if ("source".equals(str) && !TextUtils.isEmpty(super.a("src-roo-key"))) {
            return this.d;
        }
        return super.a(str);
    }
}
