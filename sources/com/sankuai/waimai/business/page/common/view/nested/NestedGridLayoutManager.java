package com.sankuai.waimai.business.page.common.view.nested;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NestedGridLayoutManager extends GridLayoutManager {
    public static ChangeQuickRedirect i;

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return false;
    }

    public NestedGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86610a335021871d0de19a2cd73d7558", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86610a335021871d0de19a2cd73d7558");
        }
    }

    public NestedGridLayoutManager(Context context, int i2) {
        super(context, i2);
        Object[] objArr = {context, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bf52cf8a55f67a0ff7812eb143c77b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bf52cf8a55f67a0ff7812eb143c77b2");
        }
    }

    public NestedGridLayoutManager(Context context, int i2, int i3, boolean z) {
        super(context, i2, i3, z);
        Object[] objArr = {context, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e25156ac7958ef139e975c854cf4ce15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e25156ac7958ef139e975c854cf4ce15");
        }
    }
}
