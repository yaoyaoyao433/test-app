package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.base;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.OrderStatusButtonListInfo;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.a;
import com.sankuai.waimai.foundation.utils.d;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends com.meituan.android.cube.pga.view.a implements a.InterfaceC0921a {
    public static ChangeQuickRedirect d;
    public OrderStatusButtonListInfo e;
    protected List<ButtonItem> f;
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a g;
    private OrderStatusButtonListInfo h;

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.a.InterfaceC0921a
    public void a(int i, boolean z) {
    }

    public void e() {
    }

    public void f() {
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0327fe403db02395f4b7d39453359e02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0327fe403db02395f4b7d39453359e02");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd9ef21e12abe3973e6e64e41870f3b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd9ef21e12abe3973e6e64e41870f3b3");
            return;
        }
        super.b();
        e();
    }

    public final void a(OrderStatusButtonListInfo orderStatusButtonListInfo, com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a aVar) {
        int i;
        boolean z;
        boolean z2;
        int i2 = 2;
        char c = 1;
        Object[] objArr = {orderStatusButtonListInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fcc71b1a9bccf08d041292d072a0264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fcc71b1a9bccf08d041292d072a0264");
            return;
        }
        this.e = orderStatusButtonListInfo;
        this.g = aVar;
        if (this.e == null) {
            this.f = null;
            f();
            return;
        }
        this.f = this.e.buttonList;
        List<ButtonItem> list = this.f;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8a674dd33599cf68f16388626a0fc03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8a674dd33599cf68f16388626a0fc03");
        } else if (list != null) {
            int i3 = 0;
            while (i3 < list.size()) {
                ButtonItem buttonItem = list.get(i3);
                if (!com.sankuai.waimai.imbase.manager.b.a().b() && ((i = buttonItem.code) == 2024 || i == 2026)) {
                    if (!com.sankuai.waimai.imbase.manager.b.a().c()) {
                        com.sankuai.waimai.imbase.manager.b.a().a("order-inconsistent_operation_btn_im_switch");
                    }
                    list.remove(buttonItem);
                    i3--;
                } else if (buttonItem.code == 2042 && !com.sankuai.waimai.share.b.a((Activity) this.c)) {
                    list.remove(buttonItem);
                    i3--;
                }
                i3++;
            }
        }
        Object[] objArr3 = {orderStatusButtonListInfo};
        ChangeQuickRedirect changeQuickRedirect3 = d;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f8854fccf0551577c29ab9c55463f040", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f8854fccf0551577c29ab9c55463f040")).booleanValue();
        } else {
            if (this.h != null && orderStatusButtonListInfo != null && orderStatusButtonListInfo.logicInfo.l != null && this.h.logicInfo.l != null && orderStatusButtonListInfo.logicInfo.l.e == this.h.logicInfo.l.e) {
                List<ButtonItem> list2 = this.e.buttonList;
                List<ButtonItem> list3 = this.h.buttonList;
                if (!d.a(list2) && !d.a(list3) && list2.size() == list3.size()) {
                    int i4 = 0;
                    boolean z3 = false;
                    while (i4 < list2.size()) {
                        ButtonItem buttonItem2 = list2.get(i4);
                        ButtonItem buttonItem3 = list3.get(i4);
                        Object[] objArr4 = new Object[i2];
                        objArr4[0] = buttonItem2;
                        objArr4[c] = buttonItem3;
                        ChangeQuickRedirect changeQuickRedirect4 = d;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "30a5420a38f89576cabd64aafb2b7584", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "30a5420a38f89576cabd64aafb2b7584")).booleanValue();
                        } else {
                            z2 = buttonItem2 != null && buttonItem3 != null && buttonItem2.code == buttonItem3.code && TextUtils.equals(buttonItem2.title, buttonItem3.title) && TextUtils.equals(buttonItem2.toast, buttonItem3.toast) && TextUtils.equals(buttonItem2.clickUrl, buttonItem3.clickUrl) && buttonItem2.highLight == buttonItem3.highLight && TextUtils.equals(buttonItem2.iconUrl, buttonItem3.iconUrl) && TextUtils.equals(buttonItem2.buttonIcon, buttonItem3.buttonIcon) && TextUtils.equals(buttonItem2.tip, buttonItem3.tip) && TextUtils.equals(buttonItem2.subTitle, buttonItem3.subTitle);
                        }
                        if (!z2) {
                            z3 = true;
                        }
                        i4++;
                        i2 = 2;
                        c = 1;
                    }
                    if (!z3) {
                        z = false;
                    }
                }
            }
            z = true;
        }
        if (z) {
            a(orderStatusButtonListInfo);
        }
        this.h = orderStatusButtonListInfo;
        f();
    }

    public void a(OrderStatusButtonListInfo orderStatusButtonListInfo) {
        Object[] objArr = {orderStatusButtonListInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6d319be240109fd5f27bfbb82304eb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6d319be240109fd5f27bfbb82304eb5");
        } else {
            this.g.a(orderStatusButtonListInfo);
        }
    }
}
