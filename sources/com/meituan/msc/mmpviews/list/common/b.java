package com.meituan.msc.mmpviews.list.common;

import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.msc.mmpviews.list.msclist.MSCListNode;
import com.meituan.msc.mmpviews.list.msclist.view.MSCListView;
import com.meituan.msc.uimanager.UIImplementation;
import com.meituan.msc.uimanager.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static RecyclerView.l b = null;
    private static int c = Integer.MAX_VALUE;

    public static synchronized int a() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0f9c11a699c32c36bca76a485a81268", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0f9c11a699c32c36bca76a485a81268")).intValue();
            }
            int i = c - 2;
            c = i;
            if (i % 10 == 1) {
                c -= 2;
            }
            if (c <= 0) {
                c = Integer.MAX_VALUE;
            }
            return c;
        }
    }

    public static List<MSCListNode> a(MSCListView mSCListView, int i, String str) {
        MSCListNode mSCListNode;
        int i2 = 0;
        Object[] objArr = {mSCListView, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65d0c8ca66e811a2b4a20882146b48ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65d0c8ca66e811a2b4a20882146b48ad");
        }
        if (mSCListView == null || TextUtils.isEmpty(str)) {
            return null;
        }
        while (true) {
            if (i2 >= mSCListView.getChildCount()) {
                mSCListNode = null;
                break;
            }
            ViewGroup viewGroup = (ViewGroup) mSCListView.getChildAt(i2);
            if (mSCListView.getLayoutManager().getPosition(viewGroup) == i && (mSCListNode = (MSCListNode) viewGroup.getTag(R.id.native_component_turbo_node_tag)) != null && mSCListNode.uiImplementation != null) {
                break;
            }
            i2++;
        }
        if (mSCListNode == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        a(mSCListNode, str, mSCListNode.uiImplementation, arrayList);
        return arrayList;
    }

    private static void a(MSCListNode mSCListNode, String str, UIImplementation uIImplementation, List<MSCListNode> list) {
        aa b2;
        Object[] objArr = {mSCListNode, str, uIImplementation, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90c3b03180298dd59df06496cee3708a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90c3b03180298dd59df06496cee3708a");
            return;
        }
        int i = mSCListNode.mReactTag;
        if (i > 0 && (b2 = uIImplementation.b(i)) != null && TextUtils.equals(str, b2.h())) {
            list.add(mSCListNode);
        }
        if (mSCListNode.mChildren.size() > 0) {
            for (int i2 = 0; i2 < mSCListNode.mChildren.size(); i2++) {
                a(mSCListNode.mChildren.get(i2), str, uIImplementation, list);
            }
        }
    }
}
