package com.sankuai.waimai.platform.widget.dial.storage;

import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.widget.dial.domain.model.PrivacyInfo;
import com.sankuai.waimai.platform.widget.dial.domain.net.OrderPrivacyInfoApi;
import com.sankuai.waimai.platform.widget.dial.domain.repository.b;
import java.lang.ref.WeakReference;
import java.util.List;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.platform.widget.dial.domain.repository.a {
    public static ChangeQuickRedirect b;
    public WeakReference<FragmentActivity> c;

    public a(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "342e27141f8af24a89f4872fb000fd42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "342e27141f8af24a89f4872fb000fd42");
        } else {
            this.c = new WeakReference<>(fragmentActivity);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.dial.domain.repository.a
    public final void b(String str, List<String> list, String str2, int i, b.a<PrivacyInfo> aVar) {
        Object[] objArr = {str, list, str2, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74554d5b3481701ef41865dc5bac630f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74554d5b3481701ef41865dc5bac630f");
        } else {
            a(((OrderPrivacyInfoApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderPrivacyInfoApi.class)).getPrivacyInfo(str, new Gson().toJson(list), str2, i), aVar);
        }
    }

    private void a(d<BaseResponse<PrivacyInfo.PrivacyData>> dVar, final b.a<PrivacyInfo> aVar) {
        Object[] objArr = {dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fecf01ea4139ec18400ebbe8c363379", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fecf01ea4139ec18400ebbe8c363379");
            return;
        }
        FragmentActivity fragmentActivity = this.c.get();
        if (fragmentActivity == null || fragmentActivity.isFinishing()) {
            return;
        }
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(dVar, new b.AbstractC1042b<BaseResponse<PrivacyInfo.PrivacyData>>() { // from class: com.sankuai.waimai.platform.widget.dial.storage.a.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                PrivacyInfo privacyInfo;
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39e7892ce3e7c9a10424bd03a8fe2443", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39e7892ce3e7c9a10424bd03a8fe2443");
                } else if (baseResponse != null) {
                    if (baseResponse.code == 0) {
                        b.a aVar2 = aVar;
                        a aVar3 = a.this;
                        Object[] objArr3 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect3 = a.b;
                        if (PatchProxy.isSupport(objArr3, aVar3, changeQuickRedirect3, false, "0e6789a137abad6fa59cb819a0cceafd", RobustBitConfig.DEFAULT_VALUE)) {
                            privacyInfo = (PrivacyInfo) PatchProxy.accessDispatch(objArr3, aVar3, changeQuickRedirect3, false, "0e6789a137abad6fa59cb819a0cceafd");
                        } else {
                            PrivacyInfo privacyInfo2 = new PrivacyInfo();
                            privacyInfo2.data = (PrivacyInfo.PrivacyData) baseResponse.data;
                            privacyInfo2.code = baseResponse.code;
                            privacyInfo2.msg = baseResponse.msg;
                            privacyInfo = privacyInfo2;
                        }
                        aVar2.a((b.a) privacyInfo);
                        return;
                    }
                    aVar.a(new Exception(baseResponse.msg));
                } else {
                    FragmentActivity fragmentActivity2 = a.this.c.get();
                    if (fragmentActivity2 != null) {
                        aVar.a(new Exception(fragmentActivity2.getResources().getString(R.string.takeout_loading_fail_try_afterwhile)));
                    }
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19f1d65af079274304cfffad45322650", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19f1d65af079274304cfffad45322650");
                } else {
                    aVar.a(new Exception(th));
                }
            }
        }, this.c.get());
    }

    @Override // com.sankuai.waimai.platform.widget.dial.domain.repository.a
    public final void c(String str, List<String> list, String str2, int i, b.a<PrivacyInfo> aVar) {
        Object[] objArr = {str, list, str2, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88840b177b911196fbbb39b73bab8232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88840b177b911196fbbb39b73bab8232");
        } else {
            a(((OrderPrivacyInfoApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderPrivacyInfoApi.class)).bindPrivacyNum(str, new Gson().toJson(list), str2, i), aVar);
        }
    }
}
