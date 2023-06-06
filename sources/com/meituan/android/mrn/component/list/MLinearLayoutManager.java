package com.meituan.android.mrn.component.list;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ad;
import android.util.AttributeSet;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MLinearLayoutManager extends LinearLayoutManager {
    public static ChangeQuickRedirect a;
    private Context b;
    private a c;

    public MLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dac78f149fd687418b5d45bc5f71e6d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dac78f149fd687418b5d45bc5f71e6d8");
            return;
        }
        this.b = context;
        a();
    }

    public MLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9960901e3b52aeb63bbdedab799b5d39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9960901e3b52aeb63bbdedab799b5d39");
            return;
        }
        this.b = context;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "050faebc7d5336aa21f375df2b95c4b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "050faebc7d5336aa21f375df2b95c4b6");
        } else {
            this.c = new a(this.b);
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e03d3a9bcbde2c043ed8d8b3759d32e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e03d3a9bcbde2c043ed8d8b3759d32e9");
            return;
        }
        try {
            super.onLayoutChildren(mVar, state);
        } catch (Throwable th) {
            Log.e("MListView", "[MLinearLayoutManager@onLayoutChildren] itemCount:" + getItemCount() + StringUtil.CRLF_STRING + Log.getStackTraceString(th));
            com.facebook.common.logging.a.d("[MLinearLayoutManager@onLayoutChildren]", th.getMessage());
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        Object[] objArr = {recyclerView, state, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "346e752725a2e7fdf1cf2e836131da86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "346e752725a2e7fdf1cf2e836131da86");
            return;
        }
        this.c.a();
        this.c.setTargetPosition(i);
        startSmoothScroll(this.c);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a extends ad {
        public static ChangeQuickRedirect a;

        @Override // android.support.v7.widget.ad
        public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return i3 - i;
        }

        public a(Context context) {
            super(context);
            Object[] objArr = {MLinearLayoutManager.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2512a26d26ce3579d5d7b7600a326a79", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2512a26d26ce3579d5d7b7600a326a79");
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e82eec18fa6cf8972d214932b92c048b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e82eec18fa6cf8972d214932b92c048b");
            } else {
                stop();
            }
        }
    }
}
