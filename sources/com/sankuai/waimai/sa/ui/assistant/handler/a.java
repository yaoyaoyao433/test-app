package com.sankuai.waimai.sa.ui.assistant.handler;

import android.app.Activity;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.sa.model.j;
import com.sankuai.waimai.sa.model.m;
import com.sankuai.waimai.sa.net.retrofit.WaimaiSAService;
import com.sankuai.waimai.sa.ui.assistant.chat.k;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(final k kVar, final View view, final Activity activity, final String str, String str2, int i, final String str3) {
        Object[] objArr = {kVar, view, activity, str, str2, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3783670bd144a8fd176d0cc0e1413388", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3783670bd144a8fd176d0cc0e1413388");
        } else if (!p.f(activity)) {
            a(kVar, str, activity.getString(R.string.wm_smart_assistant_network_unavailable_tip));
        } else {
            b.a(((WaimaiSAService) b.a((Class<Object>) WaimaiSAService.class)).getSAResult(str, str2, i), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.sa.model.b>>() { // from class: com.sankuai.waimai.sa.ui.assistant.handler.a.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    j jVar;
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e80d99ae8d379dc2b930e2a8a89b8ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e80d99ae8d379dc2b930e2a8a89b8ce");
                    } else if (baseResponse == null || baseResponse.code != 0 || baseResponse.data == 0) {
                        onError(null);
                    } else {
                        ((com.sankuai.waimai.sa.model.b) baseResponse.data).q = str;
                        k.this.a((com.sankuai.waimai.sa.model.b) baseResponse.data);
                        final com.sankuai.waimai.sa.model.b bVar = (com.sankuai.waimai.sa.model.b) baseResponse.data;
                        final View view2 = view;
                        final k kVar2 = k.this;
                        String str4 = str3;
                        Object[] objArr3 = {bVar, view2, kVar2, str4};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d1cb79fe129f0d444b721c9da73a1fdb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d1cb79fe129f0d444b721c9da73a1fdb");
                        } else if (!bVar.o || (jVar = bVar.n) == null) {
                        } else {
                            b.a(((WaimaiSAService) b.a((Class<Object>) WaimaiSAService.class)).getSARecommendProduct(jVar.a, bVar.c), new b.AbstractC1042b<BaseResponse<m>>() { // from class: com.sankuai.waimai.sa.ui.assistant.handler.a.2
                                public static ChangeQuickRedirect a;

                                @Override // rx.e
                                public final /* synthetic */ void onNext(Object obj2) {
                                    BaseResponse baseResponse2 = (BaseResponse) obj2;
                                    Object[] objArr4 = {baseResponse2};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "578a9eff3b9182e70ed75d68d272a229", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "578a9eff3b9182e70ed75d68d272a229");
                                    } else if (baseResponse2 == null || baseResponse2.code != 0 || baseResponse2.data == 0) {
                                        onError(null);
                                    } else {
                                        kVar2.a((m) baseResponse2.data);
                                    }
                                }

                                @Override // rx.e
                                public final void onError(Throwable th) {
                                    Object[] objArr4 = {th};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bc5f0ff7cd0bb4968778c51631ddf1bb", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bc5f0ff7cd0bb4968778c51631ddf1bb");
                                    } else {
                                        com.sankuai.waimai.foundation.utils.log.a.a(th);
                                    }
                                }

                                @Override // com.sankuai.waimai.platform.capacity.network.retrofit.b.AbstractC1042b, rx.e
                                public final void onCompleted() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6c727868ea064cfca5e2955b0feb40d2", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6c727868ea064cfca5e2955b0feb40d2");
                                        return;
                                    }
                                    com.sankuai.waimai.sa.model.b.this.n.f = true;
                                    view2.setEnabled(true);
                                }
                            }, str4);
                            view2.setEnabled(false);
                        }
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "375e0741636ee0f58900647e0673fbf3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "375e0741636ee0f58900647e0673fbf3");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.a(th);
                    a.a(k.this, str, activity.getString(R.string.wm_smart_assistant_network_error_tip));
                }

                @Override // com.sankuai.waimai.platform.capacity.network.retrofit.b.AbstractC1042b, rx.e
                public final void onCompleted() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44ed560f926cca180d8ad3b0eb7b7703", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44ed560f926cca180d8ad3b0eb7b7703");
                    } else {
                        view.setEnabled(true);
                    }
                }
            }, str3);
            view.setEnabled(false);
        }
    }

    public static void a(k kVar, String str, String str2) {
        Object[] objArr = {kVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7edfe3982f93e6d8114eb0153cebd0db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7edfe3982f93e6d8114eb0153cebd0db");
            return;
        }
        com.sankuai.waimai.sa.model.b bVar = new com.sankuai.waimai.sa.model.b();
        bVar.a = 0;
        bVar.q = str;
        com.sankuai.waimai.sa.model.inner.b bVar2 = new com.sankuai.waimai.sa.model.inner.b(str2);
        bVar.f = new ArrayList<>();
        bVar.f.add(bVar2);
        kVar.a(bVar);
    }
}
