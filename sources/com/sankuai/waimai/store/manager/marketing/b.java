package com.sankuai.waimai.store.manager.marketing;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.manager.marketing.parser.inner.mach.SGMachDialogTemplateParser;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.sankuai.waimai.store.platform.marketing.MarketingResponse;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public final Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> a(Activity activity, View view, MarketingResponse marketingResponse, d dVar) {
        com.sankuai.waimai.store.manager.sequence.d a2;
        Object[] objArr = {activity, view, marketingResponse, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca3b0f5a6bbed70bf8fd073a656a2558", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca3b0f5a6bbed70bf8fd073a656a2558");
        }
        if (marketingResponse == null || com.sankuai.shangou.stone.util.a.b(marketingResponse.moduleList)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (MarketingModel marketingModel : marketingResponse.moduleList) {
            if (marketingModel != null && (a2 = a(activity, view, marketingModel.type, marketingModel.moduleData, dVar)) != null) {
                List list = (List) hashMap.get(marketingModel.type);
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(marketingModel.type, list);
                }
                list.add(a2);
            }
        }
        return hashMap;
    }

    private com.sankuai.waimai.store.manager.sequence.d a(Activity activity, View view, String str, MarketingModel.ModuleItem moduleItem, d dVar) {
        com.sankuai.waimai.store.manager.marketing.parser.a a2;
        final com.sankuai.waimai.store.manager.sequence.d dVar2;
        Object[] objArr = {activity, view, str, moduleItem, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13d3da2a56e15cd75855f52fff8d6c67", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.manager.sequence.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13d3da2a56e15cd75855f52fff8d6c67");
        }
        if (moduleItem == null) {
            com.dianping.judas.util.a.b("moduleData can not be match to MarketingModel.ModuleItem", new Object[0]);
            return null;
        }
        com.sankuai.waimai.store.platform.marketing.a aVar = new com.sankuai.waimai.store.platform.marketing.a(moduleItem.templateID, moduleItem.presetTemplateID, moduleItem.templateData);
        try {
            if ("mach".equals(moduleItem.renderType)) {
                if (!MarketingModel.TYPE_ENTER_DIALOG.equals(str) && !"back".equals(str)) {
                    a2 = MarketingModel.TYPE_RESIDENT_POPUP.equals(str) ? new com.sankuai.waimai.store.manager.marketing.parser.inner.mach.a() : null;
                }
                a2 = new SGMachDialogTemplateParser();
            } else {
                a2 = c.a(aVar.b);
            }
            if (a2 == null) {
                return null;
            }
            a2.a(dVar);
            if (MarketingModel.TYPE_ENTER_DIALOG.equals(str)) {
                MarketingModel.MarketingOpenModel marketingOpenModel = (MarketingModel.MarketingOpenModel) i.a(moduleItem.moduleExtra, MarketingModel.MarketingOpenModel.class);
                if (marketingOpenModel == null) {
                    marketingOpenModel = new MarketingModel.MarketingOpenModel();
                }
                dVar2 = new com.sankuai.waimai.store.manager.sequence.dialog.a(activity, a2, aVar, marketingOpenModel);
                dVar2.a(new com.sankuai.waimai.store.manager.sequence.strategy.c(marketingOpenModel.showTimesKey, marketingOpenModel.maxShowTimes));
                final int i = marketingOpenModel.showFloatDialog;
                com.sankuai.waimai.store.manager.marketing.action.d dVar3 = new com.sankuai.waimai.store.manager.marketing.action.d() { // from class: com.sankuai.waimai.store.manager.marketing.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.manager.marketing.action.d
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b66441d74df8e811e298e29beb243fd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b66441d74df8e811e298e29beb243fd");
                        } else {
                            dVar2.d();
                        }
                    }

                    @Override // com.sankuai.waimai.store.manager.marketing.action.d
                    public final int b() {
                        return i;
                    }
                };
                if (marketingOpenModel.showFloatDialog != 1) {
                    if (marketingOpenModel.showFloatDialog == 2 && dVar != null) {
                        dVar.a(marketingOpenModel.extra, dVar3);
                    }
                } else {
                    dVar2.e = aVar;
                    if (dVar != null) {
                        dVar.a(marketingOpenModel.extra, dVar3);
                    }
                    return null;
                }
            } else if ("back".equals(str)) {
                MarketingModel.MarketingExitModel marketingExitModel = (MarketingModel.MarketingExitModel) i.a(moduleItem.moduleExtra, MarketingModel.MarketingExitModel.class);
                if (marketingExitModel == null) {
                    marketingExitModel = new MarketingModel.MarketingExitModel();
                }
                dVar2 = new com.sankuai.waimai.store.manager.sequence.dialog.a(activity, a2, aVar, marketingExitModel);
                dVar2.a(new com.sankuai.waimai.store.manager.sequence.strategy.c(marketingExitModel.showTimesKey, marketingExitModel.maxShowTimes));
                dVar2.a(new com.sankuai.waimai.store.manager.sequence.strategy.d(marketingExitModel.needStayTime * 1000));
            } else if (MarketingModel.TYPE_RESIDENT_POPUP.equals(str) && (view.getContext() instanceof Activity)) {
                MarketingModel.MarketingResidentModel marketingResidentModel = (MarketingModel.MarketingResidentModel) i.a(moduleItem.moduleExtra, MarketingModel.MarketingResidentModel.class);
                if (marketingResidentModel == null) {
                    marketingResidentModel = new MarketingModel.MarketingResidentModel();
                }
                dVar2 = new com.sankuai.waimai.store.manager.sequence.popup.b(activity, a2, view, marketingResidentModel);
                dVar2.a(new com.sankuai.waimai.store.manager.sequence.strategy.c(marketingResidentModel.showTimesKey, marketingResidentModel.maxShowTimes));
            } else {
                dVar2 = null;
            }
            if (dVar2 != null) {
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) moduleItem.moduleCustomRules)) {
                    for (MarketingModel.ModuleRule moduleRule : moduleItem.moduleCustomRules) {
                        if (moduleRule != null) {
                            dVar2.a(c.a(moduleRule.ruleID, moduleRule.ruleData));
                        }
                    }
                }
                dVar2.g = dVar;
                dVar2.e = aVar;
            }
            return dVar2;
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return null;
        }
    }
}
