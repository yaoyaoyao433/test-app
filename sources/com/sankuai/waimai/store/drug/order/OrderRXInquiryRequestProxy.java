package com.sankuai.waimai.store.drug.order;

import android.app.Activity;
import android.app.Dialog;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.router.method.Func2;
import com.sankuai.waimai.router.method.Func4;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.order.DrugOrderMonitor;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.monitor.c;
import java.net.URLDecoder;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class OrderRXInquiryRequestProxy implements Func4<String, String, Func2<Boolean, String, Void>, Activity, Void> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.router.method.Func4
    public Void call(String str, String str2, @NonNull final Func2<Boolean, String, Void> func2, final Activity activity) {
        Object[] objArr = {str, str2, func2, activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5791a880d73aea71e563e873c56924d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5791a880d73aea71e563e873c56924d0");
        }
        if (str == null || activity == null) {
            func2.call(Boolean.TRUE, "");
            return null;
        }
        com.sankuai.waimai.store.drug.base.net.b.a(getAsyncTag(activity)).a(str, str2, getPageCid(activity), new k<OrderRXInquiryResponse>() { // from class: com.sankuai.waimai.store.drug.order.OrderRXInquiryRequestProxy.1
            public static ChangeQuickRedirect a;
            private Dialog f;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                OrderRXInquiryResponse orderRXInquiryResponse = (OrderRXInquiryResponse) obj;
                Object[] objArr2 = {orderRXInquiryResponse};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "82fd913549db21fa56d1a2a976bb39bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "82fd913549db21fa56d1a2a976bb39bf");
                    return;
                }
                OrderRXInquiryRequestProxy.this.addCommonLxTags(orderRXInquiryResponse);
                if (orderRXInquiryResponse.isJumpScheme()) {
                    func2.call(Boolean.FALSE, "");
                    d.a(activity, orderRXInquiryResponse.scheme);
                } else {
                    func2.call(Boolean.TRUE, orderRXInquiryResponse.submitData);
                }
                c.a(new DrugOrderMonitor.Monitor("MEDPreviewCheck"));
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0f892e7f067c4ffa42991ca605df85e9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0f892e7f067c4ffa42991ca605df85e9");
                    return;
                }
                if (com.sankuai.waimai.store.config.d.h().a("order/preview/check", true)) {
                    func2.call(Boolean.FALSE, "");
                    if (bVar != null) {
                        String message = bVar.getMessage();
                        if (!TextUtils.isEmpty(message)) {
                            am.a(activity, message);
                        }
                    }
                } else {
                    func2.call(Boolean.TRUE, "");
                }
                HashMap hashMap = new HashMap();
                if (bVar != null) {
                    hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, String.valueOf(bVar.c));
                    hashMap.put(NetLogConstants.Details.ERROR_MSG, bVar.getMessage());
                }
                c.a(new DrugOrderMonitor.Monitor("MEDPreviewCheck", "previewCheck"), "", "", hashMap);
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "20db8a6657b3da7c24dc45c872f43898", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "20db8a6657b3da7c24dc45c872f43898");
                    return;
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "935d9cc68a04eb39712c0bd79664a95c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "935d9cc68a04eb39712c0bd79664a95c");
                } else if (this.f == null || !this.f.isShowing()) {
                    this.f = com.sankuai.waimai.store.util.d.a(activity);
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "731a290aa12f879a2b22b14497de2b78", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "731a290aa12f879a2b22b14497de2b78");
                    return;
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "4f4ce0db9e0561a8008c5558983bc90f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "4f4ce0db9e0561a8008c5558983bc90f");
                    return;
                }
                com.sankuai.waimai.store.util.d.a(this.f);
                this.f = null;
            }
        });
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommonLxTags(OrderRXInquiryResponse orderRXInquiryResponse) {
        Object[] objArr = {orderRXInquiryResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c498d9bfa7975dae9127a087a485cba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c498d9bfa7975dae9127a087a485cba");
        } else if (orderRXInquiryResponse == null || TextUtils.isEmpty(orderRXInquiryResponse.scheme)) {
        } else {
            try {
                String queryParameter = Uri.parse(URLDecoder.decode(orderRXInquiryResponse.scheme, "utf-8")).getQueryParameter("rx_order_mode");
                if (TextUtils.isEmpty(queryParameter)) {
                    String queryParameter2 = Uri.parse(orderRXInquiryResponse.scheme).getQueryParameter("popUpInfo");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        String optString = new JSONObject(queryParameter2).optString(NetLogConstants.Details.SCHEME);
                        Uri parse = Uri.parse(URLDecoder.decode(optString, "utf-8"));
                        if (!TextUtils.isEmpty(optString)) {
                            queryParameter = parse.getQueryParameter("rx_order_mode");
                        }
                    }
                }
                if (TextUtils.isEmpty(queryParameter)) {
                    return;
                }
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("inquiry_flow_type", queryParameter);
                hashMap.put(DefaultHeaderService.KEY_DRUG, hashMap2);
                Statistics.getChannel().updateTag("waimai", hashMap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private String getAsyncTag(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "264aadeba5b03ab5d8a2506e9202c280", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "264aadeba5b03ab5d8a2506e9202c280");
        }
        if (activity instanceof BaseActivity) {
            return ((BaseActivity) activity).w();
        }
        return OrderRXInquiryRequestProxy.class.getSimpleName();
    }

    private String getPageCid(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91cd8882aabdbb5680d860439c01eac3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91cd8882aabdbb5680d860439c01eac3") : activity instanceof SCBaseActivity ? ((SCBaseActivity) activity).b() : "";
    }
}
