package com.meituan.android.mrn.component.list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.android.mrn.component.list.node.ListItemNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.s {
    public static ChangeQuickRedirect a;
    ListItemNode b;

    public c(View view, ListItemNode listItemNode) {
        super(view);
        Object[] objArr = {view, listItemNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88671c7098988cf7efd1b518ec6173ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88671c7098988cf7efd1b518ec6173ea");
        } else if (listItemNode != null) {
            this.b = listItemNode;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.s
    public final String toString() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2493ffc3d4141c2a1804dfb3423b53d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2493ffc3d4141c2a1804dfb3423b53d");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", mViewType=");
        sb.append(getItemViewType());
        sb.append(",mNode=");
        ListItemNode listItemNode = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.component.list.node.a.a;
        if (PatchProxy.isSupport(objArr2, listItemNode, changeQuickRedirect2, false, "857d16debc3c5119fedf467f9ae260a2", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, listItemNode, changeQuickRedirect2, false, "857d16debc3c5119fedf467f9ae260a2");
        } else {
            str = "DomNode{mReactTag=" + listItemNode.d + ", mModuleName='" + listItemNode.e + "', mProps=" + listItemNode.j + ", mEventId=" + listItemNode.k + '}';
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
