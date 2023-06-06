package com.dianping.agentsdk.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.dianping.agentsdk.framework.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f extends n<y> {
    public static ChangeQuickRedirect a;

    public f(@NonNull Context context, @NonNull com.dianping.agentsdk.sectionrecycler.section.c cVar, y yVar) {
        super(context, cVar, yVar);
        Object[] objArr = {context, cVar, yVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42dba53e1980cec62562705a0aa550b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42dba53e1980cec62562705a0aa550b8");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cc, code lost:
        if (r13 != false) goto L29;
     */
    @Override // com.dianping.agentsdk.adapter.n, com.dianping.agentsdk.sectionrecycler.section.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(com.dianping.agentsdk.sectionrecycler.section.b.a r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.agentsdk.adapter.f.onBindViewHolder(com.dianping.agentsdk.sectionrecycler.section.b$a, int, int):void");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements View.OnLongClickListener {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;

        public a(int i, int i2) {
            Object[] objArr = {f.this, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4adbed90278b8a4b43be7ebef99da13", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4adbed90278b8a4b43be7ebef99da13");
                return;
            }
            this.b = i;
            this.c = i2;
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3adedc5893fe516d305858c0d10d81d5", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3adedc5893fe516d305858c0d10d81d5")).booleanValue();
            }
            if (f.this.extraInterface == 0 || ((y) f.this.extraInterface).getOnItemLongClickListener() == null) {
                return false;
            }
            return ((y) f.this.extraInterface).getOnItemLongClickListener().a(view, this.b, this.c);
        }
    }
}
