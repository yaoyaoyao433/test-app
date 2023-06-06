package com.sankuai.waimai.platform.widget.nestedlist.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.nestedlist.adapter.c;
import com.sankuai.waimai.platform.widget.recycler.ExtendedLinearLayoutManager;
import com.sankuai.waimai.platform.widget.recycler.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SingleExpandRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect a;

    public SingleExpandRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beb44250c0c62e9dc7e0de31ffce24fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beb44250c0c62e9dc7e0de31ffce24fe");
        } else {
            a();
        }
    }

    public SingleExpandRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e4fe6ec61a0098ae8ea9328adf63480", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e4fe6ec61a0098ae8ea9328adf63480");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ad156222ddccf4ae272b37ebec94d8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ad156222ddccf4ae272b37ebec94d8a");
        } else {
            setLayoutManager(new ExtendedLinearLayoutManager(getContext(), 1, false));
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(RecyclerView.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e6fde308f15d719fe3fa7151da60e34", RobustBitConfig.DEFAULT_VALUE)) {
            throw new UnsupportedOperationException("请使用setSingleExpandAdapter()方法设置Adapter");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e6fde308f15d719fe3fa7151da60e34");
    }

    public void setSingleExpandAdapter(c<?, ?, ?> cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d7f3031ad2fe926e58944d47be3c82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d7f3031ad2fe926e58944d47be3c82");
        } else {
            super.setAdapter(new i(cVar));
        }
    }
}
