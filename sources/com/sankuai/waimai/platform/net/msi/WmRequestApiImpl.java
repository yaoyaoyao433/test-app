package com.sankuai.waimai.platform.net.msi;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.msi.api.extension.wm.temp.ITemp;
import com.meituan.msi.api.extension.wm.temp.RequestWMApiParam;
import com.meituan.msi.api.extension.wm.temp.RequestWMApiResponse;
import com.meituan.msi.api.i;
import com.meituan.msi.bean.MsiCustomContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.machpro.module.MPRequestApi;
import java.util.HashMap;
import rx.d;
import rx.functions.g;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WmRequestApiImpl extends ITemp {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msi.api.extension.wm.temp.ITemp
    public final void a(MsiCustomContext msiCustomContext, RequestWMApiParam requestWMApiParam, final i<RequestWMApiResponse> iVar) {
        d<ap> post;
        Object[] objArr = {msiCustomContext, requestWMApiParam, iVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "346c313b3cc53347d9dac75498ffb363", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "346c313b3cc53347d9dac75498ffb363");
            return;
        }
        try {
            Object[] objArr2 = {requestWMApiParam, iVar};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "efa355122db10580dd150fbcc8b47665", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "efa355122db10580dd150fbcc8b47665");
                return;
            }
            try {
                String str = requestWMApiParam.url;
                String str2 = TextUtils.isEmpty(requestWMApiParam.method) ? "POST" : requestWMApiParam.method;
                HashMap hashMap = (HashMap) new Gson().fromJson(requestWMApiParam.body, (Class<Object>) HashMap.class);
                HashMap hashMap2 = (HashMap) new Gson().fromJson(requestWMApiParam.params, (Class<Object>) HashMap.class);
                HashMap hashMap3 = (HashMap) new Gson().fromJson(requestWMApiParam.headers, (Class<Object>) HashMap.class);
                if ("GET".equals(str2)) {
                    post = ((MPRequestApi) b.a((Class<Object>) MPRequestApi.class)).get(str, hashMap2, hashMap3);
                } else if ("POST".equals(str2)) {
                    post = ((MPRequestApi) b.a((Class<Object>) MPRequestApi.class)).post(str, hashMap2, hashMap, hashMap3);
                } else {
                    iVar.a(-200, "Must be get or post method");
                    return;
                }
                Object[] objArr3 = {post, iVar};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b45b9f961f9838aabe994ef684420870", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b45b9f961f9838aabe994ef684420870");
                } else {
                    b.a(post.d(new g<ap, String>() { // from class: com.sankuai.waimai.platform.net.msi.WmRequestApiImpl.2
                        public static ChangeQuickRedirect a;

                        @Override // rx.functions.g
                        public final /* synthetic */ String call(ap apVar) {
                            ap apVar2 = apVar;
                            Object[] objArr4 = {apVar2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b3e8380b8cf5c1f72f89d77a3532f550", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b3e8380b8cf5c1f72f89d77a3532f550") : apVar2 != null ? apVar2.string() : "";
                        }
                    }), new j<String>() { // from class: com.sankuai.waimai.platform.net.msi.WmRequestApiImpl.1
                        public static ChangeQuickRedirect a;

                        @Override // rx.e
                        public final void onCompleted() {
                        }

                        @Override // rx.e
                        public final /* synthetic */ void onNext(Object obj) {
                            String str3 = (String) obj;
                            Object[] objArr4 = {str3};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "72b0270ca7e5e6dfa92a77dc1249dd04", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "72b0270ca7e5e6dfa92a77dc1249dd04");
                                return;
                            }
                            RequestWMApiResponse requestWMApiResponse = new RequestWMApiResponse();
                            requestWMApiResponse.data = str3;
                            requestWMApiResponse.code = 0;
                            iVar.a(requestWMApiResponse);
                        }

                        @Override // rx.e
                        public final void onError(Throwable th) {
                            Object[] objArr4 = {th};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6a3e3704bbbb8ba7806674f7a88daaeb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6a3e3704bbbb8ba7806674f7a88daaeb");
                            } else {
                                iVar.a(-200, th.getMessage());
                            }
                        }
                    }, b.b);
                }
            } catch (Exception unused) {
                iVar.a(-200, "Please check data format");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
