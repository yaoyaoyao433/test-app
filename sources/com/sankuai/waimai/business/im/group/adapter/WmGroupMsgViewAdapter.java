package com.sankuai.waimai.business.im.group.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.adapter.IMAudioMsgAdapter;
import com.sankuai.waimai.business.im.common.adapter.IMCommonAdapter;
import com.sankuai.waimai.business.im.common.adapter.IMImageMsgAdapter;
import com.sankuai.waimai.business.im.common.contract.a;
import com.sankuai.waimai.business.im.common.message.IMMessageAdapter;
import com.sankuai.waimai.business.im.common.message.h;
import com.sankuai.waimai.business.im.message.LocationMessageAdapter;
import com.sankuai.waimai.business.im.model.WMCommonDataInfo;
import com.sankuai.waimai.business.im.prepare.g;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.xm.imui.session.view.adapter.ICommonAdapter;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmGroupMsgViewAdapter extends MsgViewAdapter {
    public static ChangeQuickRedirect a;
    private g b;
    private boolean c;
    private WMCommonDataInfo e;
    private a f;

    public WmGroupMsgViewAdapter(g gVar, WMCommonDataInfo wMCommonDataInfo, a aVar, boolean z) {
        Object[] objArr = {gVar, wMCommonDataInfo, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8984732706f22f2be2146d20258ef336", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8984732706f22f2be2146d20258ef336");
            return;
        }
        this.b = gVar;
        this.e = wMCommonDataInfo;
        this.f = aVar;
        this.c = z;
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
    public ICommonAdapter getCommonAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb20883731c1bc5ab65eb720d5c49e2e", RobustBitConfig.DEFAULT_VALUE) ? (ICommonAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb20883731c1bc5ab65eb720d5c49e2e") : new WmGroupCommonAdapter(new IMCommonAdapter());
    }

    @Override // com.sankuai.xm.imui.session.view.adapter.impl.MsgViewAdapter, com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter
    public IExtraAdapter getExtraAdapter(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cea2b80cb02a3040dd3615f81226598", RobustBitConfig.DEFAULT_VALUE)) {
            return (IExtraAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cea2b80cb02a3040dd3615f81226598");
        }
        if (i == 16) {
            return new IMMessageAdapter(this.e, this.f, d.a, this.b) { // from class: com.sankuai.waimai.business.im.group.adapter.WmGroupMsgViewAdapter.1
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.business.im.common.message.IMMessageAdapter
                public final void a(Map<Integer, com.sankuai.waimai.business.im.common.message.d> map) {
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e16379f8072a13ba649967a1a01d752", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e16379f8072a13ba649967a1a01d752");
                        return;
                    }
                    boolean z = WmGroupMsgViewAdapter.this.c;
                    Object[] objArr3 = {map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.im.prepare.compat.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7a7f5a6a312aade262b312c41b3c4ca0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7a7f5a6a312aade262b312c41b3c4ca0");
                    } else {
                        map.put(5, new h(z));
                    }
                    super.a(map);
                }
            };
        }
        if (i == 1) {
            return new IMAudioMsgAdapter();
        }
        if (i == 3) {
            return new IMImageMsgAdapter();
        }
        if (i == 8) {
            return new LocationMessageAdapter();
        }
        return super.getExtraAdapter(i);
    }
}
