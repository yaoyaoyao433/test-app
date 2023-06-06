package com.meituan.msc.mmpviews.list.sticky;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.msc.mmpviews.list.MSCLinearLayoutManager;
import com.meituan.msc.mmpviews.list.sticky.b;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class StickyLinearLayoutManager extends MSCLinearLayoutManager {
    public static ChangeQuickRedirect c;
    private com.meituan.msc.mmpviews.list.sticky.a d;
    private b e;
    private d f;
    private int g;
    @Nullable
    private a h;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
    }

    public StickyLinearLayoutManager(Context context, com.meituan.msc.mmpviews.list.sticky.a aVar) {
        this(context, 1, false, aVar);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "742bf072291072af548458ff7ce03129", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "742bf072291072af548458ff7ce03129");
        }
    }

    public StickyLinearLayoutManager(Context context, int i, boolean z, com.meituan.msc.mmpviews.list.sticky.a aVar) {
        super(context, i, z);
        Object[] objArr = {context, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13c17359ddf9ae0c4f0fd5545a4c19fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13c17359ddf9ae0c4f0fd5545a4c19fa");
            return;
        }
        this.g = -1;
        this.d = aVar;
    }

    @Override // com.meituan.msc.mmpviews.list.MSCLinearLayoutManager, android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {mVar, state};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e40a09db0472af1c9ea21e307d2db3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e40a09db0472af1c9ea21e307d2db3b");
            return;
        }
        super.onLayoutChildren(mVar, state);
        if (this.e != null) {
            a();
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b36515eb2f0b90167d9b4a13d8f9fb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b36515eb2f0b90167d9b4a13d8f9fb9");
        } else {
            super.scrollToPositionWithOffset(i, 0);
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        int i2;
        Object[] objArr = {Integer.valueOf(i), mVar, state};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47579c786eaa4df4ce22effa8c2f4b2f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47579c786eaa4df4ce22effa8c2f4b2f")).intValue();
        }
        try {
            i2 = super.scrollVerticallyBy(i, mVar, state);
        } catch (Throwable th) {
            g.a("[StickyLinearLayoutManager@scrollVerticallyBy]", th);
            i2 = 0;
        }
        if (Math.abs(i2) > 0 && this.e != null) {
            this.e.a(findFirstVisibleItemPosition(), b(), this.f);
        }
        return i2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {Integer.valueOf(i), mVar, state};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd22cc0e328478827c7438107146e399", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd22cc0e328478827c7438107146e399")).intValue();
        }
        int scrollHorizontallyBy = super.scrollHorizontallyBy(i, mVar, state);
        if (Math.abs(scrollHorizontallyBy) > 0 && this.e != null) {
            this.e.a(findFirstVisibleItemPosition(), b(), this.f);
        }
        return scrollHorizontallyBy;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void removeAndRecycleAllViews(RecyclerView.m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0075a28422bfa9d5cbaf8ac68c368ec6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0075a28422bfa9d5cbaf8ac68c368ec6");
            return;
        }
        super.removeAndRecycleAllViews(mVar);
        if (this.e != null) {
            b bVar = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "77396cbcf17056c9e299c56e54aa7749", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "77396cbcf17056c9e299c56e54aa7749");
            } else {
                bVar.b(bVar.g);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9578e647eddb88d28128e6fd866e5b65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9578e647eddb88d28128e6fd866e5b65");
            return;
        }
        this.f = new d(recyclerView);
        this.e = new b(recyclerView, this.d);
        b bVar = this.e;
        int i = this.g;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "b475b3269320278476b5179e722e0c99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "b475b3269320278476b5179e722e0c99");
        } else if (i != -1) {
            bVar.i = i;
        } else {
            bVar.h = -1.0f;
            bVar.i = -1;
        }
        this.e.j = this.h;
        if (this.d.a().size() > 0) {
            a();
        }
        super.onAttachedToWindow(recyclerView);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.m mVar) {
        Object[] objArr = {recyclerView, mVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "213c9911681f29c640e1f7dbe0c98341", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "213c9911681f29c640e1f7dbe0c98341");
            return;
        }
        if (this.e != null) {
            b bVar = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "1a35ae3efe7106bca513c18fa0fbe4cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "1a35ae3efe7106bca513c18fa0fbe4cd");
            } else {
                bVar.f = true;
                bVar.a();
            }
        }
        super.onDetachedFromWindow(recyclerView, mVar);
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "879de3304e8401ef8931727c7bd12eb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "879de3304e8401ef8931727c7bd12eb6");
            return;
        }
        this.e.a(getOrientation());
        this.e.a(findFirstVisibleItemPosition(), b(), this.f);
    }

    private List<b.a> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11b38aa2270aac69823cfad3abc6dc38", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11b38aa2270aac69823cfad3abc6dc38");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            for (Map.Entry<Integer, c> entry : this.d.a().entrySet()) {
                if (entry.getKey().intValue() == position) {
                    b.a aVar = new b.a();
                    aVar.a = position;
                    aVar.b = childAt;
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }
}
