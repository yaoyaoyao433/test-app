package com.sankuai.waimai.ugc.creator.widgets;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ad;
import android.util.DisplayMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SmoothScrollLinearLayoutManager extends LinearLayoutManager {
    public static ChangeQuickRedirect a;

    public SmoothScrollLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0acd99d7379053fd934102e4988fcc84", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0acd99d7379053fd934102e4988fcc84");
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        Object[] objArr = {recyclerView, state, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2f2db78055033e4b6f6485e7995a181", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2f2db78055033e4b6f6485e7995a181");
            return;
        }
        ad adVar = new ad(recyclerView.getContext()) { // from class: com.sankuai.waimai.ugc.creator.widgets.SmoothScrollLinearLayoutManager.1
            @Override // android.support.v7.widget.ad
            public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 150.0f / displayMetrics.densityDpi;
            }
        };
        adVar.setTargetPosition(i);
        startSmoothScroll(adVar);
    }
}
