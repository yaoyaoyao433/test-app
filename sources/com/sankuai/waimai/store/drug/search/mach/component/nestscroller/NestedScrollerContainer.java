package com.sankuai.waimai.store.drug.search.mach.component.nestscroller;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.component.scroller.recyclerview.ScrollerLayoutManager;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NestedScrollerContainer extends MachBaseViewContainer {
    public static ChangeQuickRedirect c;
    NestedRecyclerView d;
    ScrollerLayoutManager e;
    b f;
    String g;
    String h;
    String i;
    String j;
    private int l;
    private List<Integer> m;

    public NestedScrollerContainer(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd1451bf628eb185c16d0b662d7b060f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd1451bf628eb185c16d0b662d7b060f");
        }
    }

    private NestedScrollerContainer(Context context, AttributeSet attributeSet) {
        this(context, null, -1);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ba2a4cfab702e342b750aadc11a8a43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ba2a4cfab702e342b750aadc11a8a43");
        }
    }

    public NestedScrollerContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3897cd403a4ad834e0c94a1ef337c6b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3897cd403a4ad834e0c94a1ef337c6b9");
            return;
        }
        this.l = -1;
        this.m = new ArrayList();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c87012f5a42c6d2d116305f1ec45b9b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c87012f5a42c6d2d116305f1ec45b9b8");
            return;
        }
        this.d = new NestedRecyclerView(getContext());
        this.d.setNestedScrollingEnabled(true);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        addView(this.d);
    }

    public int getCurrIndex() {
        return this.l;
    }

    public List<Integer> getDisplayList() {
        return this.m;
    }

    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1d7cd59971eaccf439cf57c4fc4deed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1d7cd59971eaccf439cf57c4fc4deed")).intValue();
        }
        if (this.f != null) {
            return this.f.getItemCount();
        }
        return 0;
    }
}
