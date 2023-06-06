package com.meituan.android.paybase.widgets.wheelview.adapter;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a implements c {
    public static ChangeQuickRedirect b;
    private List<DataSetObserver> a;
    protected int c;

    @Override // com.meituan.android.paybase.widgets.wheelview.adapter.c
    public View a(View view, ViewGroup viewGroup) {
        return null;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "593e8610c0f1c85f1da3484484f8e325", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "593e8610c0f1c85f1da3484484f8e325");
        } else {
            this.c = 0;
        }
    }

    @Override // com.meituan.android.paybase.widgets.wheelview.adapter.c
    public final void a(DataSetObserver dataSetObserver) {
        Object[] objArr = {dataSetObserver};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64def3e652b836bb79ad7d73bf45950e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64def3e652b836bb79ad7d73bf45950e");
            return;
        }
        if (this.a == null) {
            this.a = new LinkedList();
        }
        this.a.add(dataSetObserver);
    }

    @Override // com.meituan.android.paybase.widgets.wheelview.adapter.c
    public final void b(DataSetObserver dataSetObserver) {
        Object[] objArr = {dataSetObserver};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cea0fa98e305720bb64959dc0fab463", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cea0fa98e305720bb64959dc0fab463");
        } else if (this.a != null) {
            this.a.remove(dataSetObserver);
        }
    }

    public final int b() {
        return this.c;
    }

    @Override // com.meituan.android.paybase.widgets.wheelview.adapter.c
    public final void b(int i) {
        this.c = i;
    }
}
