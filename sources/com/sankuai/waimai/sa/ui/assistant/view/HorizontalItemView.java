package com.sankuai.waimai.sa.ui.assistant.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.StatisticsRecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class HorizontalItemView extends StatisticsRecyclerView {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.sa.model.b e;

    public HorizontalItemView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d66cdfff2e5f0ced0ab7e5189f625925", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d66cdfff2e5f0ced0ab7e5189f625925");
        }
    }

    public HorizontalItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2491cbe2d10d4a56bab246a182353fc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2491cbe2d10d4a56bab246a182353fc7");
        }
    }

    public HorizontalItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "772a9e2a7c7da9f4e95e5e61b9dddbbf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "772a9e2a7c7da9f4e95e5e61b9dddbbf");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00d816d42373892d4afa41114599892d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00d816d42373892d4afa41114599892d");
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        setLayoutManager(linearLayoutManager);
        setOverScrollMode(2);
    }

    @Override // com.sankuai.waimai.log.judas.StatisticsRecyclerView, android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09e752a851bc87a2cdfdc7944c7a1753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09e752a851bc87a2cdfdc7944c7a1753");
        } else {
            super.setAdapter(aVar);
        }
    }
}
