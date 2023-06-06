package com.sankuai.waimai.store.order.prescription.view;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.store.knb.manager.a;
import com.sankuai.waimai.store.order.prescription.machhandler.OrderOnJsEventJump;
import com.sankuai.waimai.store.order.prescription.model.mach.OrderConfirmMachDataInfo;
import com.sankuai.waimai.store.order.prescription.model.mach.OrderConfirmMachTemplate;
import com.sankuai.waimai.store.order.prescription.model.mach.OrderConfirmNativeDataInfo;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.util.ah;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.mach.SGCommonMachReportInfo;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends com.meituan.android.cube.pga.view.a implements a.InterfaceC1215a {
    public static ChangeQuickRedirect f;
    private final Activity d;
    private String e;
    protected LinearLayout g;
    public final Map<String, String> h;
    private List<OrderConfirmMachTemplate> i;
    private List<b> j;
    private final Map<String, Object> k;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_sc_order_confirm_mach_block_container;
    }

    public List<com.sankuai.waimai.store.order.prescription.b> e() {
        return null;
    }

    public c(Activity activity, String str) {
        super(activity);
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4032c9b95bfe32dbce47ba3f8b010480", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4032c9b95bfe32dbce47ba3f8b010480");
            return;
        }
        this.j = new ArrayList();
        this.h = new HashMap();
        this.k = new HashMap();
        this.d = activity;
        this.e = str;
        com.sankuai.waimai.store.knb.manager.a a = com.sankuai.waimai.store.knb.manager.a.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.knb.manager.a.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "62a07b552425a2e73172a096c4a033bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "62a07b552425a2e73172a096c4a033bf");
        } else {
            a.b.add(this);
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e139420a55d4b2aa28bf6bec66f2b99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e139420a55d4b2aa28bf6bec66f2b99");
            return;
        }
        super.b();
        this.g = (LinearLayout) this.b.findViewById(R.id.block_container);
    }

    public void a(List<OrderConfirmMachTemplate> list, Map<String, Object> map, String str) {
        HashMap hashMap;
        OrderConfirmMachDataInfo orderConfirmMachDataInfo;
        LinearLayout linearLayout;
        final b bVar;
        List<com.sankuai.waimai.store.order.prescription.b> arrayList;
        String str2 = str;
        char c = 0;
        int i = 1;
        Object[] objArr = {list, map, str2};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e6a8f9737d3a09a51c327c6a0fb3d01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e6a8f9737d3a09a51c327c6a0fb3d01");
            return;
        }
        if (map != null) {
            this.k.putAll(map);
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            this.g.removeAllViews();
            a().setVisibility(8);
            return;
        }
        a().setVisibility(0);
        this.i = list;
        HashMap hashMap2 = new HashMap(this.h);
        this.h.clear();
        int i2 = 0;
        while (i2 < this.i.size()) {
            OrderConfirmMachTemplate orderConfirmMachTemplate = this.i.get(i2);
            if (orderConfirmMachTemplate == null || (orderConfirmMachDataInfo = (OrderConfirmMachDataInfo) i.a(orderConfirmMachTemplate.machData, OrderConfirmMachDataInfo.class)) == null || orderConfirmMachDataInfo.templateData == null) {
                hashMap = hashMap2;
            } else {
                String str3 = (String) hashMap2.get(orderConfirmMachTemplate.modelType);
                this.h.put(orderConfirmMachTemplate.modelType, str3 == null ? "" : str3);
                Object[] objArr2 = new Object[i];
                objArr2[c] = Integer.valueOf(i2);
                ChangeQuickRedirect changeQuickRedirect2 = f;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7dbf23f57f23517d100a7e6ff0a090cb", RobustBitConfig.DEFAULT_VALUE)) {
                    linearLayout = (LinearLayout) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7dbf23f57f23517d100a7e6ff0a090cb");
                } else if (this.g.getChildAt(i2) instanceof LinearLayout) {
                    linearLayout = (LinearLayout) this.g.getChildAt(i2);
                } else {
                    linearLayout = new LinearLayout(this.d);
                    this.g.addView(linearLayout);
                }
                LinearLayout linearLayout2 = linearLayout;
                Object[] objArr3 = {Integer.valueOf(i2), orderConfirmMachDataInfo, str2, linearLayout2};
                ChangeQuickRedirect changeQuickRedirect3 = f;
                hashMap = hashMap2;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "926ec281fbcdac63a2057f8b03298e4a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "926ec281fbcdac63a2057f8b03298e4a");
                } else {
                    b bVar2 = (b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.j, i2);
                    if (bVar2 == null) {
                        bVar = new b(this.d, this.e, str2);
                        this.j.add(bVar);
                        bVar.a(e());
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = f;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1b453c45aeef438e64183e5256eb8a8b", RobustBitConfig.DEFAULT_VALUE)) {
                            arrayList = (List) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1b453c45aeef438e64183e5256eb8a8b");
                        } else {
                            arrayList = new ArrayList<>();
                            arrayList.add(new com.sankuai.waimai.store.order.detail.dialog.universaldialog.a());
                            arrayList.add(new OrderOnJsEventJump());
                        }
                        bVar.a(arrayList);
                    } else {
                        bVar = bVar2;
                    }
                    bVar.a(linearLayout2, String.format("sm_order_confirm_%s", orderConfirmMachDataInfo.templateId), "supermarket");
                    final Map<String, Object> a = com.sankuai.waimai.mach.utils.b.a(orderConfirmMachDataInfo.templateData);
                    this.k.put(BaseModuleDesc.USE_POI_ID_STR, Boolean.valueOf(com.sankuai.waimai.store.platform.domain.manager.poi.a.w()));
                    a.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, this.k);
                    final String str4 = orderConfirmMachDataInfo.templateId;
                    Object[] objArr5 = {str4, bVar, a};
                    ChangeQuickRedirect changeQuickRedirect5 = f;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "86efc086a036eb13449c615b0c361661", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "86efc086a036eb13449c615b0c361661");
                    } else {
                        a.C1015a c1015a = new a.C1015a();
                        c1015a.c = str4;
                        c1015a.b = str4;
                        c1015a.d = "sm_order_confirm_%s";
                        c1015a.e = "supermarket";
                        bVar.a(c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a(), new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.store.order.prescription.view.c.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.mach.container.c
                            public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                                Object[] objArr6 = {eVar};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "32400280ba0bac060240cb712153d265", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "32400280ba0bac060240cb712153d265");
                                } else {
                                    bVar.d(str4, a);
                                }
                            }

                            @Override // com.sankuai.waimai.mach.container.c
                            public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar3) {
                                Object[] objArr6 = {bVar3};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "98b6d55a0f87ad80899e243a07ea1266", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "98b6d55a0f87ad80899e243a07ea1266");
                                    return;
                                }
                                SGCommonMachReportInfo sGCommonMachReportInfo = new SGCommonMachReportInfo(c.class.getSimpleName());
                                sGCommonMachReportInfo.e = str4;
                                sGCommonMachReportInfo.d = 4;
                                sGCommonMachReportInfo.i = bVar3.a();
                                com.sankuai.waimai.store.util.mach.a.a(sGCommonMachReportInfo);
                            }
                        });
                    }
                }
                Object[] objArr6 = {orderConfirmMachTemplate, str3};
                ChangeQuickRedirect changeQuickRedirect6 = f;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "94c55888520ee872255d44c02a0328a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "94c55888520ee872255d44c02a0328a1");
                } else {
                    OrderConfirmNativeDataInfo orderConfirmNativeDataInfo = (OrderConfirmNativeDataInfo) i.a(orderConfirmMachTemplate.nativeData, OrderConfirmNativeDataInfo.class);
                    if (orderConfirmNativeDataInfo != null && !t.a(orderConfirmNativeDataInfo.machTemplateCallbackInfo)) {
                        Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(str3);
                        Map<String, Object> a3 = com.sankuai.waimai.mach.utils.b.a(orderConfirmNativeDataInfo.machTemplateCallbackInfo);
                        if (a2 != null && a3 != null) {
                            a2.putAll(a3);
                            this.h.put(orderConfirmMachTemplate.modelType, i.a(a2));
                        } else if (a2 == null && a3 != null) {
                            this.h.put(orderConfirmMachTemplate.modelType, i.a(a3));
                        } else {
                            StoreException storeException = StoreException.OrderConfirmMachCallBackInfoDataException;
                            ah.a(storeException, "machTemplateCallbackInfo is  " + orderConfirmNativeDataInfo.machTemplateCallbackInfo);
                        }
                    }
                }
            }
            i2++;
            hashMap2 = hashMap;
            str2 = str;
            c = 0;
            i = 1;
        }
        int childCount = this.g.getChildCount() - this.i.size();
        for (int i3 = 0; i3 < childCount; i3++) {
            this.g.removeViewAt(this.g.getChildCount() - 1);
        }
    }

    public void a(String str) {
        JSONObject jSONObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aead1a7ef64cbee807e46494ba0d346e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aead1a7ef64cbee807e46494ba0d346e");
        } else if (t.a(str)) {
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String optString = jSONObject2.optString("requestId");
                String optString2 = jSONObject2.optString("status", "");
                if (this.h.get("cross_board_order") == null || t.a(optString)) {
                    return;
                }
                String str2 = this.h.get("cross_board_order");
                if (!t.a(str2)) {
                    jSONObject = new JSONObject(str2);
                } else {
                    jSONObject = new JSONObject();
                }
                jSONObject.put("jf_auth_success", optString2.equals("success"));
                this.h.put("cross_board_order", jSONObject.toString());
            } catch (JSONException e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.store.knb.manager.a.InterfaceC1215a
    public final void b(String str) {
        JSONObject jSONObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43a93e3a779f86370d34208385c1bc6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43a93e3a779f86370d34208385c1bc6b");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String optString = jSONObject2.optString(AlitaMonitorCenter.AlitaMonitorConst.ModelPredict.TAG_KEY_MODEL_TYPE);
                String optString2 = jSONObject2.optString("common_key");
                String optString3 = jSONObject2.optString(optString2);
                String str2 = this.h.get(optString);
                if (!t.a(str2)) {
                    jSONObject = new JSONObject(str2);
                } else {
                    jSONObject = new JSONObject();
                }
                jSONObject.put(optString2, optString3);
                this.h.put(optString, jSONObject.toString());
            } catch (JSONException e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9836bc7598af540078862043872e8e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9836bc7598af540078862043872e8e5");
        } else {
            com.sankuai.waimai.store.knb.manager.a.a().a(this);
        }
    }
}
