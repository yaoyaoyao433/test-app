package com.sankuai.waimai.alita.alitarule;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.alitarule.AlitaRuleResponse;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.utils.l;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a c;
    public final b b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87db9a222c9a16e595977f03c8d5204c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87db9a222c9a16e595977f03c8d5204c");
        } else {
            this.b = new b() { // from class: com.sankuai.waimai.alita.alitarule.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.core.service.user.b
                public final void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
                }

                @Override // com.sankuai.waimai.foundation.core.service.user.b
                public final void onChanged(b.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d874ec78028878a22e176775b8fc5a7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d874ec78028878a22e176775b8fc5a7");
                    } else if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
                        a.this.b();
                    }
                }
            };
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24332d4e36626be0091a6482d241103a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24332d4e36626be0091a6482d241103a");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1832c77dec54305e5a64fb3c456bf7b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1832c77dec54305e5a64fb3c456bf7b8");
        } else {
            l.a(new l.a() { // from class: com.sankuai.waimai.alita.alitarule.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    String str;
                    List<Map> list;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e287cfc0a498fc32753976dd82ef512", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e287cfc0a498fc32753976dd82ef512");
                        return;
                    }
                    LinkedList linkedList = new LinkedList();
                    String a2 = com.sankuai.waimai.alita.core.rule.a.a().a("wmMarketing");
                    if (!TextUtils.isEmpty(a2)) {
                        try {
                            list = (List) new Gson().fromJson(a2, new TypeToken<List<Map<String, Object>>>() { // from class: com.sankuai.waimai.alita.alitarule.a.2.1
                            }.getType());
                        } catch (Exception unused) {
                            list = null;
                        }
                        if (list != null && list.size() > 0) {
                            for (Map map : list) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("ruleId", map.get("id"));
                                hashMap.put("version", map.get("version"));
                                linkedList.add(hashMap);
                            }
                        }
                    }
                    try {
                        str = new Gson().toJson(linkedList);
                    } catch (Exception unused2) {
                        str = "";
                    }
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((AlitaRuleService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) AlitaRuleService.class)).getAlitaRule(com.sankuai.waimai.platform.domain.manager.user.a.i().d(), str), new b.AbstractC1042b<BaseResponse<AlitaRuleResponse>>() { // from class: com.sankuai.waimai.alita.alitarule.a.2.2
                        public static ChangeQuickRedirect a;

                        @Override // rx.e
                        public final void onError(Throwable th) {
                        }

                        @Override // rx.e
                        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                        }

                        @Override // com.sankuai.waimai.platform.capacity.network.retrofit.b.AbstractC1042b
                        public final /* synthetic */ BaseResponse<AlitaRuleResponse> a(BaseResponse<AlitaRuleResponse> baseResponse) {
                            List<Map> list2;
                            BaseResponse<AlitaRuleResponse> baseResponse2 = baseResponse;
                            Object[] objArr3 = {baseResponse2};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8d358cb3d6c6cf7517ea1dc37f60e916", RobustBitConfig.DEFAULT_VALUE)) {
                                return (BaseResponse) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8d358cb3d6c6cf7517ea1dc37f60e916");
                            }
                            if (baseResponse2 != null && baseResponse2.isSuccess()) {
                                AlitaRuleResponse alitaRuleResponse = baseResponse2.data;
                                HashMap hashMap2 = new HashMap();
                                String a3 = com.sankuai.waimai.alita.core.rule.a.a().a("wmMarketing");
                                if (!TextUtils.isEmpty(a3) && (list2 = (List) new Gson().fromJson(a3, new TypeToken<List<Map<String, Object>>>() { // from class: com.sankuai.waimai.alita.alitarule.a.2.2.1
                                }.getType())) != null && list2.size() > 0) {
                                    for (Map map2 : list2) {
                                        if (map2 != null && map2.get("id") != null) {
                                            hashMap2.put(map2.get("id").toString(), map2);
                                        }
                                    }
                                }
                                if (alitaRuleResponse != null && alitaRuleResponse.a != null && alitaRuleResponse.a.size() > 0) {
                                    for (AlitaRuleResponse.AlitaRule alitaRule : alitaRuleResponse.a) {
                                        if ("add".equals(alitaRule.status) || "update".equals(alitaRule.status)) {
                                            Map<String, Object> ruleDetail = alitaRule.getRuleDetail();
                                            if (!TextUtils.isEmpty(alitaRule.ruleId) && ruleDetail != null && ruleDetail.size() > 0) {
                                                hashMap2.put(alitaRule.ruleId, alitaRule.getRuleDetail());
                                            }
                                        } else if ("delete".equals(alitaRule.status) && !TextUtils.isEmpty(alitaRule.ruleId)) {
                                            hashMap2.remove(alitaRule.ruleId);
                                        }
                                    }
                                }
                                LinkedList linkedList2 = new LinkedList();
                                linkedList2.addAll(hashMap2.values());
                                com.sankuai.waimai.alita.core.rule.a.a().a("wmMarketing", new Gson().toJson(linkedList2));
                            }
                            return (BaseResponse) super.a(baseResponse2);
                        }
                    }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b.toString());
                }
            }, getClass().getSimpleName());
        }
    }
}
