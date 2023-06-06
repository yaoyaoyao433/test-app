package com.sankuai.waimai.sa.ui.assistant.view.multiperson;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.StatisticsRecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MultiPersonStatisticsItemView extends StatisticsRecyclerView {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.sa.model.b e;

    public MultiPersonStatisticsItemView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5974673a5076ec3eccfe23960b334c67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5974673a5076ec3eccfe23960b334c67");
        } else {
            d();
        }
    }

    public MultiPersonStatisticsItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "382fdeb27091ec18f0d6ce485e2db32d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "382fdeb27091ec18f0d6ce485e2db32d");
        } else {
            d();
        }
    }

    public MultiPersonStatisticsItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7500c4d4144de58131d4414f5a444a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7500c4d4144de58131d4414f5a444a5");
        } else {
            d();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77675d5ab748cb6f21843fb6efffa06f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77675d5ab748cb6f21843fb6efffa06f");
            return;
        }
        setOverScrollMode(2);
        a();
    }

    @Override // com.sankuai.waimai.log.judas.StatisticsRecyclerView, android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8de94f2022394a03d5043d0abf37ed2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8de94f2022394a03d5043d0abf37ed2");
        } else {
            super.setAdapter(aVar);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b052dcad1c3a72902a3ff5f66e68178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b052dcad1c3a72902a3ff5f66e68178");
            return;
        }
        clearOnScrollListeners();
        addOnScrollListener(this.d);
    }

    public com.sankuai.waimai.sa.model.b getAnswer() {
        return this.e;
    }
}
