package com.sankuai.waimai.mach.component;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends com.sankuai.waimai.mach.component.base.a<com.sankuai.waimai.mach.widget.c> {
    public static ChangeQuickRedirect b;
    private String a;
    private int c;
    private ImageView.ScaleType d;
    private com.sankuai.waimai.mach.imageloader.a e;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4212af7d709cdb92c2c0a5f1a4ea9c0a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4212af7d709cdb92c2c0a5f1a4ea9c0a");
        } else {
            this.e = new com.sankuai.waimai.mach.imageloader.a(this);
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(com.sankuai.waimai.mach.widget.c cVar) {
        com.sankuai.waimai.mach.widget.c cVar2 = cVar;
        Object[] objArr = {cVar2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "845d1bf18da41f090db43e569424a2af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "845d1bf18da41f090db43e569424a2af");
            return;
        }
        super.a((c) cVar2);
        cVar2.setSource(this.a);
        cVar2.setRepeat(this.d == ImageView.ScaleType.MATRIX);
        cVar2.setLoopCount(this.c);
        this.e.a(new com.sankuai.waimai.mach.imageloader.b(this.m.getActivity(), cVar2));
        if (this.d != null) {
            cVar2.setScaleType(this.d);
        }
        try {
            if (!TextUtils.isEmpty(this.e.b)) {
                cVar2.setColorFilter(Color.parseColor(this.e.b));
            } else {
                cVar2.clearColorFilter();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (r4.equals("loop") == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x002c A[SYNTHETIC] */
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
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.mach.component.c.b
            java.lang.String r10 = "a369400af62836ed2d41d10bf64465a5"
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
            if (r1 == 0) goto L9e
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L9e
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L2c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r3 = 1
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r0] = r2
            com.meituan.robust.ChangeQuickRedirect r12 = com.sankuai.waimai.mach.component.c.b
            java.lang.String r13 = "f70727e7fae148fa886af8dfd4159d6f"
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
            r7 = -896505829(0xffffffffca90681b, float:-4731917.5)
            if (r6 == r7) goto L83
            r7 = 3327652(0x32c6a4, float:4.663034E-39)
            if (r6 == r7) goto L79
            goto L8e
        L79:
            java.lang.String r6 = "loop"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L8e
            goto L8f
        L83:
            java.lang.String r3 = "source"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L8e
            r3 = 0
            goto L8f
        L8e:
            r3 = -1
        L8f:
            switch(r3) {
                case 0: goto L9b;
                case 1: goto L93;
                default: goto L92;
            }
        L92:
            goto L2c
        L93:
            float r2 = com.sankuai.waimai.mach.utils.g.a(r2)
            int r2 = (int) r2
            r14.c = r2
            goto L2c
        L9b:
            r14.a = r2
            goto L2c
        L9e:
            java.lang.String r0 = "resize-mode"
            java.lang.String r0 = r14.b(r0)
            boolean r1 = r14.i(r0)
            if (r1 == 0) goto Lb3
            com.sankuai.waimai.mach.model.value.j r0 = com.sankuai.waimai.mach.model.value.j.a(r0)
            android.widget.ImageView$ScaleType r0 = r0.j
            r14.d = r0
        Lb3:
            com.sankuai.waimai.mach.imageloader.a r0 = r14.e
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.component.c.a():void");
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @NonNull
    /* renamed from: a */
    public com.sankuai.waimai.mach.widget.c b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a35be02e0fcc264a1cc5c444a31bac3a", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.widget.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a35be02e0fcc264a1cc5c444a31bac3a") : new com.sankuai.waimai.mach.widget.c(context);
    }
}
