package com.sankuai.waimai.platform.settings.net;

import android.text.TextUtils;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.settings.net.PersonalRecommendResponse;
import com.sankuai.waimai.platform.settings.net.UserInfoResponse;
import okhttp3.OkHttpClient;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static ar b = new ar.a().a(com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(new OkHttpClient())).a(f.a()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a()).a("https://open.meituan.com").a();

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f999512a72726cfbd9f09f876f38af0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f999512a72726cfbd9f09f876f38af0e");
            return;
        }
        String e = com.sankuai.waimai.platform.domain.manager.user.a.i().e();
        if (TextUtils.isEmpty(e)) {
            return;
        }
        b.a(((PersonalRecommendApi) b.a(PersonalRecommendApi.class)).getSwitches(e, "100161_50906206", "com.sankuai.meituan.takeoutnew"), new b.AbstractC1042b<BaseResponse<PersonalRecommendResponse>>() { // from class: com.sankuai.waimai.platform.settings.net.a.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                PersonalRecommendResponse.SingleSwitch[] singleSwitchArr;
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1071b6ab3777bb5abcaa8064f04ce003", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1071b6ab3777bb5abcaa8064f04ce003");
                } else if (baseResponse != null && baseResponse.isSuccess() && (singleSwitchArr = ((PersonalRecommendResponse) baseResponse.data).switches) != null && singleSwitchArr.length > 0) {
                    for (PersonalRecommendResponse.SingleSwitch singleSwitch : singleSwitchArr) {
                        if (singleSwitch.type == 1) {
                            com.sankuai.waimai.platform.settings.a a2 = com.sankuai.waimai.platform.settings.a.a();
                            String valueOf = String.valueOf(singleSwitch.status);
                            Object[] objArr3 = {valueOf};
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.settings.a.a;
                            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "236cd496fd11d7cd9ae64a2f08f10754", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "236cd496fd11d7cd9ae64a2f08f10754");
                            } else {
                                StorageUtil.putSharedValue(com.meituan.android.singleton.b.a, "waimai_personal_content", valueOf, 1);
                            }
                        }
                        if (singleSwitch.type == 2) {
                            com.sankuai.waimai.platform.settings.a a3 = com.sankuai.waimai.platform.settings.a.a();
                            String valueOf2 = String.valueOf(singleSwitch.status);
                            Object[] objArr4 = {valueOf2};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.settings.a.a;
                            if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "920a718390648b1d3d43cec3e971667c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "920a718390648b1d3d43cec3e971667c");
                            } else {
                                StorageUtil.putSharedValue(com.meituan.android.singleton.b.a, "waimai_personal_ad", valueOf2, 1);
                            }
                        }
                    }
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f72410c61580997dfe929b46fb31eb9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f72410c61580997dfe929b46fb31eb9");
                } else {
                    th.printStackTrace();
                }
            }
        }, "PersonalRecommendSetting");
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abd1992b49c7c11ec1546ee0009aae7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abd1992b49c7c11ec1546ee0009aae7b");
            return;
        }
        String e = com.sankuai.waimai.platform.domain.manager.user.a.i().e();
        if (TextUtils.isEmpty(e)) {
            return;
        }
        b.a(((PersonalRecommendApi) b.a(PersonalRecommendApi.class)).getUserInfo(e, "regTime,mobile"), new b.AbstractC1042b<UserInfoResponse>() { // from class: com.sankuai.waimai.platform.settings.net.a.2
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                UserInfoResponse.User user;
                UserInfoResponse userInfoResponse = (UserInfoResponse) obj;
                Object[] objArr2 = {userInfoResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03acb8fc32cca49547cb4ef2c88fba22", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03acb8fc32cca49547cb4ef2c88fba22");
                } else if (userInfoResponse == null || (user = userInfoResponse.user) == null || user.regTime == null || user.mobile == null) {
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("regTime", user.regTime);
                        jSONObject.put("mobile", user.mobile);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    StorageUtil.putSharedValue(com.meituan.android.singleton.b.a, "waimai_personal_account_info", jSONObject.toString(), 1);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b7242dbc61a6ac397a2547833e77b76", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b7242dbc61a6ac397a2547833e77b76");
                } else {
                    th.printStackTrace();
                }
            }
        }, "PersonalRecommendSetting");
    }
}
