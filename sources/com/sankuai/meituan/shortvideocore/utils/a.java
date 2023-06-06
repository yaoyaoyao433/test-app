package com.sankuai.meituan.shortvideocore.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ai;
import android.support.v7.widget.aj;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends aj {
    public static ChangeQuickRedirect b;
    private ai c;
    private ai d;

    @Override // android.support.v7.widget.aj, android.support.v7.widget.ar
    @Nullable
    public final int[] a(RecyclerView.LayoutManager layoutManager, View view) {
        Object[] objArr = {layoutManager, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88dc5887eb5987e9e6fa8a56edce43b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88dc5887eb5987e9e6fa8a56edce43b1");
        }
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = a(view, c(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = a(view, d(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    private int a(View view, ai aiVar) {
        Object[] objArr = {view, aiVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "009c18a384f9a82ff880bbecfa3d5d04", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "009c18a384f9a82ff880bbecfa3d5d04")).intValue() : aiVar.a(view) - aiVar.b();
    }

    @Override // android.support.v7.widget.aj, android.support.v7.widget.ar
    @Nullable
    public final View a(RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "475d399861d394e5bd768d0c2294ed37", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "475d399861d394e5bd768d0c2294ed37");
        }
        if (layoutManager instanceof LinearLayoutManager) {
            if (layoutManager.canScrollHorizontally()) {
                return a(layoutManager, c(layoutManager));
            }
            return a(layoutManager, d(layoutManager));
        }
        return super.a(layoutManager);
    }

    private View a(RecyclerView.LayoutManager layoutManager, ai aiVar) {
        Object[] objArr = {layoutManager, aiVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21c64e5edc17ae823d91db96ececc40b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21c64e5edc17ae823d91db96ececc40b");
        }
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            View findViewByPosition = layoutManager.findViewByPosition(findFirstVisibleItemPosition);
            if (findViewByPosition == null) {
                return null;
            }
            if (aiVar.b(findViewByPosition) < aiVar.e(findViewByPosition) / 2 || aiVar.b(findViewByPosition) <= 0) {
                if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == layoutManager.getItemCount() - 1) {
                    return null;
                }
                return layoutManager.findViewByPosition(findFirstVisibleItemPosition + 1);
            }
            return findViewByPosition;
        }
        return super.a(layoutManager);
    }

    private ai c(@NonNull RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0602d440d0da41fa5ac0e58795b48138", RobustBitConfig.DEFAULT_VALUE)) {
            return (ai) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0602d440d0da41fa5ac0e58795b48138");
        }
        if (this.c == null) {
            this.c = ai.a(layoutManager);
        }
        return this.c;
    }

    private ai d(RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56078d6d0ce43bd4943f4c8d90ae4101", RobustBitConfig.DEFAULT_VALUE)) {
            return (ai) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56078d6d0ce43bd4943f4c8d90ae4101");
        }
        if (this.d == null) {
            this.d = ai.b(layoutManager);
        }
        return this.d;
    }
}
