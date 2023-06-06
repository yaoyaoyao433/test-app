package com.meituan.android.ptcommonim.pageadapter.message;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PTMsgViewAdapter extends MsgViewAdapter {
    public static ChangeQuickRedirect a;

    public PTMsgCommonAdapter a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31cf5395e81d5a2c4d8eae8fa4797bc1", RobustBitConfig.DEFAULT_VALUE) ? (PTMsgCommonAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31cf5395e81d5a2c4d8eae8fa4797bc1") : new PTMsgCommonAdapter();
    }

    public PTGeneralMsgAdapter b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8d6d28e9c53d98cb0e18d43ba3136c4", RobustBitConfig.DEFAULT_VALUE) ? (PTGeneralMsgAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8d6d28e9c53d98cb0e18d43ba3136c4") : new PTGeneralMsgAdapter();
    }

    public PTEventMsgAdapter c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb36d0457326d23063fdaf2c042b9687", RobustBitConfig.DEFAULT_VALUE) ? (PTEventMsgAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb36d0457326d23063fdaf2c042b9687") : new PTEventMsgAdapter();
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
    public final ICommonAdapter getCommonAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "308cce60fafbb6fd2b1fb0882ed99468", RobustBitConfig.DEFAULT_VALUE) ? (ICommonAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "308cce60fafbb6fd2b1fb0882ed99468") : a();
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
    public final IExtraAdapter getExtraAdapter(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cca49f49b8e0b82fc3a4177bc4e31b3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (IExtraAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cca49f49b8e0b82fc3a4177bc4e31b3f");
        }
        if (i == 16) {
            return b();
        }
        if (i == 11) {
            return c();
        }
        return super.getExtraAdapter(i);
    }
}
