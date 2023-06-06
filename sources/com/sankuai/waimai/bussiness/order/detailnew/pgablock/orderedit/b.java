package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderedit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.waimai.business.order.api.model.DinersOption;
import com.sankuai.waimai.business.order.api.submit.model.Invoice;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.invoiceinfo.InvoiceMTPlatformInfoData;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderedit.a;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.utils.f;
import com.sankuai.xm.im.message.bean.MsgAddition;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.business.order.api.detail.block.a b;
    public Context c;
    private a d;

    public b(Context context, com.sankuai.waimai.business.order.api.detail.block.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4519b52d98d0ae91c77325d698f9ebc6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4519b52d98d0ae91c77325d698f9ebc6");
            return;
        }
        this.c = context;
        this.b = aVar;
    }

    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        DinersOption dinersOption;
        char c = 0;
        int i = 1;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e07e21bd710e0fb4161e2b45adf3d4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e07e21bd710e0fb4161e2b45adf3d4c");
            return;
        }
        char c2 = 65535;
        if (str.hashCode() == -1765610649 && str.equals("modify_dinners_count_event")) {
            c2 = 0;
        }
        if (c2 != 0) {
            return;
        }
        Object[] objArr2 = {map};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b8ffb18599705eb538d852de710c264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b8ffb18599705eb538d852de710c264");
        } else if (map != null) {
            if (NumberUtils.parseInt(String.valueOf(map.get("count")), 0) <= 0) {
                ae.a(this.c, "修改次数已达上限，不能再次修改");
                return;
            }
            if (this.d == null) {
                this.d = new a(a());
                this.d.i = new a.InterfaceC0920a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderedit.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderedit.a.InterfaceC0920a
                    public final void a(DinersOption dinersOption2) {
                        Object[] objArr3 = {dinersOption2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "25fc7d2da18c8a05d26c29af86cbd109", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "25fc7d2da18c8a05d26c29af86cbd109");
                        } else if (b.this.b != null) {
                            b.this.b.c(true);
                        }
                    }
                };
            }
            String valueOf = String.valueOf(map.get("order_id"));
            ArrayList arrayList = new ArrayList();
            List<Map> list = (List) map.get("diners_option");
            if (!CollectionUtils.isEmpty(list)) {
                for (Map map2 : list) {
                    Object[] objArr3 = new Object[i];
                    objArr3[c] = map2;
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bbf67185215c815307a6f68c58df9220", RobustBitConfig.DEFAULT_VALUE)) {
                        dinersOption = (DinersOption) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bbf67185215c815307a6f68c58df9220");
                    } else {
                        dinersOption = new DinersOption();
                        StringBuilder sb = new StringBuilder();
                        sb.append(map2.get("count"));
                        dinersOption.count = NumberUtils.parseInt(sb.toString(), 0);
                        dinersOption.description = String.valueOf(map2.get("description"));
                        dinersOption.greenLifeTip = String.valueOf(map2.get("green_life_tip"));
                        dinersOption.addition = String.valueOf(map2.get(MsgAddition.TABLE));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(map2.get("default_select"));
                        dinersOption.defaultSelect = NumberUtils.parseInt(sb2.toString(), 0);
                    }
                    arrayList.add(dinersOption);
                    c = 0;
                    i = 1;
                }
            }
            this.d.a((Activity) this.c, NumberUtils.parseLong(valueOf, 0L), arrayList, NumberUtils.parseInt(String.valueOf(map.get("diners_count")), 0), map.containsKey("tableware_advocate_tip") ? String.valueOf(map.get("tableware_advocate_tip")) : null);
        }
    }

    public String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8bf26183b1cfabd9982ca5f29602716", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8bf26183b1cfabd9982ca5f29602716");
        }
        if (this.c instanceof BaseActivity) {
            return ((BaseActivity) this.c).w();
        }
        return getClass().getSimpleName() + System.currentTimeMillis();
    }

    public Invoice a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc7a7b1cd95b90b5f07941993aa28fce", RobustBitConfig.DEFAULT_VALUE)) {
            return (Invoice) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc7a7b1cd95b90b5f07941993aa28fce");
        }
        if (intent == null) {
            return null;
        }
        String a2 = f.a(intent, "resultData");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            InvoiceMTPlatformInfoData invoiceMTPlatformInfoData = (InvoiceMTPlatformInfoData) k.a().fromJson(a2, (Class<Object>) InvoiceMTPlatformInfoData.class);
            if (invoiceMTPlatformInfoData != null && !TextUtils.isEmpty(invoiceMTPlatformInfoData.getTitle())) {
                return new Invoice(invoiceMTPlatformInfoData.getTitle(), invoiceMTPlatformInfoData.getCompanyTaxId(), invoiceMTPlatformInfoData.getType());
            }
            return new Invoice();
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return null;
        }
    }
}
