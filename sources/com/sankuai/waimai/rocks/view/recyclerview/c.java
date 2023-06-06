package com.sankuai.waimai.rocks.view.recyclerview;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.rocks.view.recyclerview.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.rocks.expose.a<String> {
    public static ChangeQuickRedirect a;
    RecyclerView b;
    Rect c;

    @Override // com.sankuai.waimai.rocks.expose.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "705b32966255dece40ebad13b8c9aec7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "705b32966255dece40ebad13b8c9aec7");
            return;
        }
        super.a(view);
        if (view instanceof RecyclerView) {
            this.b = (RecyclerView) view;
            this.b.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.rocks.view.recyclerview.c.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    Object[] objArr2 = {view2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73f2bde29f0faa796432c00a08086333", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73f2bde29f0faa796432c00a08086333");
                        return;
                    }
                    RecyclerView.LayoutManager layoutManager = c.this.b.getLayoutManager();
                    if (layoutManager == null) {
                        return;
                    }
                    if (layoutManager instanceof StaggeredGridLayoutManager) {
                        for (int i : ((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(null)) {
                            if (i != -1) {
                                return;
                            }
                        }
                    }
                    layoutManager.requestLayout();
                }
            });
        }
    }

    @Override // com.sankuai.waimai.rocks.expose.a
    public final void b() {
        int i;
        com.meituan.android.cube.pga.block.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5d0f1f7b852c4f207a0f08e4e81524c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5d0f1f7b852c4f207a0f08e4e81524c");
        } else if (this.b != null && this.b.getWindowVisibility() == 0) {
            RecyclerView recyclerView = this.b;
            Object[] objArr2 = {this, recyclerView};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.rocks.view.utils.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4c3f117290ae4f40ed08cb725ca444a4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4c3f117290ae4f40ed08cb725ca444a4");
            } else {
                try {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                        c(linearLayoutManager.findFirstVisibleItemPosition());
                        d(findLastVisibleItemPosition);
                    } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                        int[] findFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(null);
                        Object[] objArr3 = {findFirstVisibleItemPositions};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.rocks.view.utils.a.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "0e594ab5bd31186c113193a51878c115", RobustBitConfig.DEFAULT_VALUE)) {
                            i = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "0e594ab5bd31186c113193a51878c115")).intValue();
                        } else {
                            int i2 = findFirstVisibleItemPositions.length > 0 ? findFirstVisibleItemPositions[0] : -1;
                            for (int i3 : findFirstVisibleItemPositions) {
                                if (i3 < i2 && i3 >= 0) {
                                    i2 = i3;
                                }
                            }
                            i = i2;
                        }
                        c(i);
                        d(com.sankuai.waimai.rocks.view.utils.a.a(staggeredGridLayoutManager.findLastVisibleItemPositions(null)));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (this.m < 0 || this.m > this.n) {
                return;
            }
            for (int i4 = this.m; i4 <= this.n; i4++) {
                RecyclerView.s findViewHolderForLayoutPosition = this.b.findViewHolderForLayoutPosition(i4);
                if (!(findViewHolderForLayoutPosition instanceof a.c)) {
                    if ((findViewHolderForLayoutPosition instanceof a.b) && (aVar = ((a.b) findViewHolderForLayoutPosition).b) != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(aVar.hashCode());
                        String sb2 = sb.toString();
                        if ((TextUtils.isEmpty(sb2) || !a((c) sb2)) && b(findViewHolderForLayoutPosition.itemView)) {
                            aVar.y();
                            b((c) sb2);
                        }
                    }
                } else {
                    com.sankuai.waimai.rocks.view.block.a aVar2 = ((a.c) findViewHolderForLayoutPosition).b;
                    if (aVar2 != null) {
                        String M = aVar2.M();
                        if ((TextUtils.isEmpty(M) || !a((c) M)) && b(findViewHolderForLayoutPosition.itemView)) {
                            aVar2.y();
                            b((c) M);
                        }
                    }
                }
            }
        }
    }

    private boolean b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c1a41e7febb3c2f833d1eca8b3d9342", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c1a41e7febb3c2f833d1eca8b3d9342")).booleanValue();
        }
        if (view == null || view.getVisibility() != 0 || this.c == null) {
            return false;
        }
        return ah.a(view, this.c);
    }
}
