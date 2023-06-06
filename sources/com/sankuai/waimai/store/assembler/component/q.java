package com.sankuai.waimai.store.assembler.component;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class q {
    public static ChangeQuickRedirect a;
    final ViewGroup b;
    final Handler c;
    boolean d;
    boolean e;
    boolean f;
    private final List<g> g;

    public q(@NonNull ViewGroup viewGroup, @NonNull List<g> list) {
        Object[] objArr = {viewGroup, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd67f66af0a09844bcb5c1ae0e335e26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd67f66af0a09844bcb5c1ae0e335e26");
            return;
        }
        this.d = false;
        this.e = true;
        this.f = false;
        this.c = new Handler(Looper.getMainLooper());
        this.b = viewGroup;
        this.g = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r11.e == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.assembler.component.q.a
            java.lang.String r10 = "b45cfd4e9aa42c8df56d88c32472a562"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            return
        L18:
            java.util.List<com.sankuai.waimai.store.assembler.component.g> r1 = r11.g
            int r1 = r1.size()
            if (r1 <= 0) goto L94
            r11.d = r0
            android.os.Handler r1 = r11.c
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            android.view.ViewGroup r1 = r11.b
            r1.removeAllViews()
            java.util.List<com.sankuai.waimai.store.assembler.component.g> r1 = r11.g
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        L35:
            if (r2 >= r1) goto L94
            java.util.List<com.sankuai.waimai.store.assembler.component.g> r4 = r11.g
            java.lang.Object r4 = r4.get(r2)
            com.sankuai.waimai.store.assembler.component.g r4 = (com.sankuai.waimai.store.assembler.component.g) r4
            if (r4 == 0) goto L91
            android.view.View r5 = r4.a
            if (r5 == 0) goto L91
            boolean r5 = r11.f
            r6 = 1
            if (r5 != 0) goto L7e
            com.sankuai.waimai.store.assembler.component.f r5 = com.sankuai.waimai.store.assembler.component.f.Normal
            com.sankuai.waimai.store.assembler.component.BaseCard r7 = r4.d
            com.sankuai.waimai.store.assembler.component.d r7 = r7.c
            com.sankuai.waimai.store.assembler.component.f r7 = r7.a
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L66
            com.sankuai.waimai.store.assembler.component.f r5 = com.sankuai.waimai.store.assembler.component.f.Sticky
            com.sankuai.waimai.store.assembler.component.BaseCard r7 = r4.d
            com.sankuai.waimai.store.assembler.component.d r7 = r7.c
            com.sankuai.waimai.store.assembler.component.f r7 = r7.a
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L68
        L66:
            int r3 = r3 + 1
        L68:
            r5 = 5
            if (r3 > r5) goto L7f
            com.sankuai.waimai.store.assembler.component.f r5 = com.sankuai.waimai.store.assembler.component.f.MultiList
            com.sankuai.waimai.store.assembler.component.BaseCard r7 = r4.d
            com.sankuai.waimai.store.assembler.component.d r7 = r7.c
            com.sankuai.waimai.store.assembler.component.f r7 = r7.a
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L7e
            boolean r5 = r11.e
            if (r5 == 0) goto L7e
            goto L7f
        L7e:
            r6 = 0
        L7f:
            com.sankuai.waimai.store.assembler.component.q$1 r5 = new com.sankuai.waimai.store.assembler.component.q$1
            r5.<init>()
            if (r6 == 0) goto L8e
            android.os.Handler r4 = r11.c
            r6 = 100
            r4.postDelayed(r5, r6)
            goto L91
        L8e:
            r5.run()
        L91:
            int r2 = r2 + 1
            goto L35
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.assembler.component.q.a():void");
    }
}
