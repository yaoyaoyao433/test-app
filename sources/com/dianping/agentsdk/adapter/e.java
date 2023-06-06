package com.dianping.agentsdk.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.dianping.agentsdk.framework.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e extends n<w> {
    public static ChangeQuickRedirect a;

    public e(@NonNull Context context, @NonNull com.dianping.agentsdk.sectionrecycler.section.c cVar, w wVar) {
        super(context, cVar, wVar);
        Object[] objArr = {context, cVar, wVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17b44ecb2d0b57058b9b3616fee37355", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17b44ecb2d0b57058b9b3616fee37355");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d2, code lost:
        if (r13 != false) goto L31;
     */
    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(com.dianping.agentsdk.sectionrecycler.section.b.a r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.agentsdk.adapter.e.onBindViewHolder(com.dianping.agentsdk.sectionrecycler.section.b$a, int, int):void");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;

        public a(int i, int i2) {
            Object[] objArr = {e.this, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78e23421128f25955c25d2d24f23c93f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78e23421128f25955c25d2d24f23c93f");
                return;
            }
            this.b = i;
            this.c = i2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52dc921faa30266b33ad8d59b2e15a06", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52dc921faa30266b33ad8d59b2e15a06");
            } else if (e.this.extraInterface == 0 || ((w) e.this.extraInterface).getOnItemClickListener() == null) {
            } else {
                ((w) e.this.extraInterface).getOnItemClickListener();
            }
        }
    }
}
