package com.sankuai.waimai.store.manager.marketing.action;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.sankuai.waimai.store.platform.marketing.MarketingResponse;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.store.manager.marketing.a b;

    public a(com.sankuai.waimai.store.manager.marketing.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae84fadbb01438606b3e45aa7a9d1d8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae84fadbb01438606b3e45aa7a9d1d8b");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c
    public final void a(final com.sankuai.waimai.store.mach.event.a aVar, String str, @NonNull final Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c4d0bd8c38b60c472d705652de68ed0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c4d0bd8c38b60c472d705652de68ed0");
        } else if (map.get("key_parser_type") instanceof Integer) {
            final Integer num = (Integer) map.get("key_parser_type");
            al.a(new al.b<MarketingModel.ModuleItem>() { // from class: com.sankuai.waimai.store.manager.marketing.action.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ MarketingModel.ModuleItem a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c60c12d6d432e8918426a54fbc09155", RobustBitConfig.DEFAULT_VALUE) ? (MarketingModel.ModuleItem) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c60c12d6d432e8918426a54fbc09155") : (MarketingModel.ModuleItem) i.a(i.a(map), MarketingModel.ModuleItem.class);
                }

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(MarketingModel.ModuleItem moduleItem) {
                    MarketingModel.ModuleItem moduleItem2 = moduleItem;
                    Object[] objArr2 = {moduleItem2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "360351e9d5d3889bb59738b1c59d0ed1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "360351e9d5d3889bb59738b1c59d0ed1");
                    } else if (a.this.b == null || com.sankuai.waimai.store.util.b.a(a.this.b.b) || moduleItem2 == null) {
                    } else {
                        MarketingResponse marketingResponse = new MarketingResponse();
                        marketingResponse.moduleList = new ArrayList();
                        MarketingModel marketingModel = new MarketingModel();
                        marketingResponse.moduleList.add(marketingModel);
                        marketingModel.type = MarketingModel.TYPE_ENTER_DIALOG;
                        marketingModel.moduleData = moduleItem2;
                        if (1 == num.intValue()) {
                            a.this.b.a(marketingResponse, true);
                            aVar.b("dismiss", null);
                        } else if (2 == num.intValue()) {
                            a.this.b.a(marketingResponse, false);
                        }
                    }
                }
            }, "");
        }
    }
}
