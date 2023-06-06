package com.meituan.msc.mmpviews.list;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ad;
import android.util.AttributeSet;
import android.util.Log;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCLinearLayoutManager extends LinearLayoutManager {
    public static ChangeQuickRedirect a;
    public b b;
    private Context c;
    private a d;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a(Throwable th);
    }

    public MSCLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37eae05c2dc83936fd7a7fa83e613e81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37eae05c2dc83936fd7a7fa83e613e81");
            return;
        }
        this.c = context;
        a();
    }

    public MSCLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caf9c38615666f38d99be912d5eefbd2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caf9c38615666f38d99be912d5eefbd2");
            return;
        }
        this.c = context;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc95c50bfe22f24ec7efc9ee4d2b03d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc95c50bfe22f24ec7efc9ee4d2b03d3");
        } else {
            this.d = new a(this.c);
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c53c4957ba67d4b39a31b0b267471899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c53c4957ba67d4b39a31b0b267471899");
            return;
        }
        try {
            super.onLayoutChildren(mVar, state);
        } catch (Throwable th) {
            Log.e("MListView", "[MLinearLayoutManager@onLayoutChildren] itemCount:" + getItemCount() + StringUtil.CRLF_STRING + Log.getStackTraceString(th));
            g.a("[MLinearLayoutManager@onLayoutChildren]", th.getMessage());
            if (this.b != null) {
                this.b.a(th);
            }
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        Object[] objArr = {recyclerView, state, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1415dea68cb49c467333922d4d58c55e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1415dea68cb49c467333922d4d58c55e");
            return;
        }
        this.d.a();
        this.d.setTargetPosition(i);
        startSmoothScroll(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a extends ad {
        public static ChangeQuickRedirect a;

        @Override // android.support.v7.widget.ad
        public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return i3 - i;
        }

        public a(Context context) {
            super(context);
            Object[] objArr = {MSCLinearLayoutManager.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "238abb358ba1f3cfab1851a6e01ba2ae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "238abb358ba1f3cfab1851a6e01ba2ae");
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa2f0192b857889dbf47c84bcca68fd8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa2f0192b857889dbf47c84bcca68fd8");
            } else {
                stop();
            }
        }
    }
}
