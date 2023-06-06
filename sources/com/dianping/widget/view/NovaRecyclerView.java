package com.dianping.widget.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.dianping.judas.interfaces.c;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NovaRecyclerView extends RecyclerView implements com.dianping.judas.interfaces.c {
    public static ChangeQuickRedirect a;
    public d b;
    private com.dianping.judas.b c;
    private boolean d;
    private boolean e;

    public NovaRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed43b7c484647eea8be1669361ca5f03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed43b7c484647eea8be1669361ca5f03");
            return;
        }
        this.b = new d();
        this.c = new com.dianping.judas.b(this, this.b);
    }

    public NovaRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81bee7c637a4cdb0ed75aa79fc73bd4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81bee7c637a4cdb0ed75aa79fc73bd4a");
            return;
        }
        this.b = new d();
        this.c = new com.dianping.judas.b(this, this.b);
    }

    public NovaRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20088db496a33a380e4dee1938848c60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20088db496a33a380e4dee1938848c60");
            return;
        }
        this.b = new d();
        this.c = new com.dianping.judas.b(this, this.b);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e1c34fb5a383e29ad2dceddc747c59f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e1c34fb5a383e29ad2dceddc747c59f")).booleanValue();
        }
        if (motionEvent.getAction() == 1) {
            this.e = true;
        } else if (motionEvent.getAction() == 0) {
            this.e = false;
            this.d = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r4.getTop() != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (r14.getBottom() < getMeasuredHeight()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        if (java.lang.Math.abs(r15) < 2) goto L38;
     */
    @Override // android.support.v7.widget.RecyclerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScrolled(int r14, int r15) {
        /*
            r13 = this;
            r0 = 2
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r9 = 0
            r8[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r10 = 1
            r8[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r11 = com.dianping.widget.view.NovaRecyclerView.a
            java.lang.String r12 = "e6c498a6901f4f0781283a22dcbe169e"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r13
            r3 = r11
            r5 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L26
            com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r11, r9, r12)
            return
        L26:
            super.onScrolled(r14, r15)
            if (r14 != 0) goto L2f
            if (r15 != 0) goto L2f
            r14 = 1
            goto L30
        L2f:
            r14 = 0
        L30:
            r13.d = r14
            boolean r14 = r13.e
            if (r14 == 0) goto Lc4
            android.support.v7.widget.RecyclerView$LayoutManager r14 = r13.getLayoutManager()
            boolean r14 = r14 instanceof android.support.v7.widget.LinearLayoutManager
            if (r14 == 0) goto L7c
            android.support.v7.widget.RecyclerView$LayoutManager r14 = r13.getLayoutManager()
            android.support.v7.widget.LinearLayoutManager r14 = (android.support.v7.widget.LinearLayoutManager) r14
            int r1 = r14.findFirstCompletelyVisibleItemPosition()
            int r2 = r14.findLastCompletelyVisibleItemPosition()
            int r3 = r14.getItemCount()
            android.view.View r4 = r14.findViewByPosition(r1)
            android.view.View r14 = r14.findViewByPosition(r2)
            int r5 = java.lang.Math.abs(r15)
            if (r5 < r0) goto L7a
            if (r1 > r10) goto L68
            if (r4 == 0) goto L68
            int r1 = r4.getTop()
            if (r1 == 0) goto L7a
        L68:
            int r3 = r3 - r10
            if (r2 < r3) goto L78
            if (r14 == 0) goto L78
            int r14 = r14.getBottom()
            int r1 = r13.getMeasuredHeight()
            if (r14 < r1) goto L78
            goto L7a
        L78:
            r14 = 0
            goto L83
        L7a:
            r14 = 1
            goto L83
        L7c:
            int r14 = java.lang.Math.abs(r15)
            if (r14 >= r0) goto L78
            goto L7a
        L83:
            if (r14 == 0) goto Lbb
            java.lang.Object[] r14 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r8 = com.dianping.widget.view.NovaRecyclerView.a
            java.lang.String r11 = "ebacbfe0ddab208a0d3da26dce493512"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r14
            r2 = r13
            r3 = r8
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L9c
            com.meituan.robust.PatchProxy.accessDispatch(r14, r13, r8, r9, r11)
            goto Lbb
        L9c:
            android.content.Context r14 = r13.getContext()
            boolean r14 = r14 instanceof com.dianping.judas.interfaces.a
            if (r14 == 0) goto Lbb
            com.dianping.widget.view.a r14 = com.dianping.widget.view.a.a()
            android.content.Context r1 = r13.getContext()
            com.dianping.judas.interfaces.a r1 = (com.dianping.judas.interfaces.a) r1
            android.content.Context r2 = r13.getContext()
            com.dianping.judas.interfaces.a r2 = (com.dianping.judas.interfaces.a) r2
            java.lang.String r2 = r2.b()
            r14.a(r1, r2)
        Lbb:
            int r14 = java.lang.Math.abs(r15)
            if (r14 >= r0) goto Lc2
            r9 = 1
        Lc2:
            r13.d = r9
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.widget.view.NovaRecyclerView.onScrolled(int, int):void");
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae9b5a4e0ed0b38df7a0904b04fdc2fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae9b5a4e0ed0b38df7a0904b04fdc2fd");
            return;
        }
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean getIsScrollStop() {
        return this.d;
    }

    public void setGAString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c21788b0d401014d223164245ec1e39d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c21788b0d401014d223164245ec1e39d");
        } else {
            this.c.b = str;
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public String getGAString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54e1951f08d95caa906cfbe40b72d1f4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54e1951f08d95caa906cfbe40b72d1f4") : this.c.getGAString();
    }

    @Override // com.dianping.judas.interfaces.c
    public d getGAUserInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9d4968d4b22cd2701495c0e4942a0a0", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9d4968d4b22cd2701495c0e4942a0a0") : this.c.getGAUserInfo();
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(String str, c.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e8f50db4362d4beefd11b77207c8731", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e8f50db4362d4beefd11b77207c8731");
        } else {
            this.c.a(str, aVar);
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final String a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0abd4e91d07097a7cc84c42242cb774", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0abd4e91d07097a7cc84c42242cb774") : this.c.a(aVar);
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(EventInfo eventInfo, c.a aVar) {
        Object[] objArr = {eventInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb4e8814d61d48903f1d720b5fc2f1eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb4e8814d61d48903f1d720b5fc2f1eb");
        } else {
            this.c.a(eventInfo, aVar);
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final EventInfo b(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da2873e18a2d5bcae7dd9a7abefdf325", RobustBitConfig.DEFAULT_VALUE) ? (EventInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da2873e18a2d5bcae7dd9a7abefdf325") : this.c.b(aVar);
    }
}
