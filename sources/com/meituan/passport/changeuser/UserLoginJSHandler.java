package com.meituan.passport.changeuser;

import android.text.TextUtils;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.passport.UserCenter;
import com.meituan.passport.ap;
import com.meituan.passport.api.UserApiFactory;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.j;
import com.meituan.passport.pojo.ExchangeableUser;
import com.meituan.passport.pojo.User;
import com.meituan.passport.pojo.request.k;
import com.meituan.passport.utils.n;
import com.meituan.passport.utils.p;
import com.meituan.passport.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.f;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UserLoginJSHandler extends BaseJsHandler {
    private static final int CODE_DEFAULT = -1;
    private static final int CODE_NO_NET = 9;
    private static final int CODE_NO_TICKET = 399;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "QTcuebqwvjb1e6kdp63QG2dgtXb/z0rZkVHAeMK76ulnU5dAmqOJc9CP7tnLAeBuzWulg2Lp1cjHcB6Z4uIZJw==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdbab8c133b866604c4e806950ac9bcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdbab8c133b866604c4e806950ac9bcb");
        } else if (jsHost() == null || jsHost().getActivity() == null || jsHost().getContext() == null) {
            jsCallbackError(new KNBJsErrorInfo(-1, ""));
            n.a("UserLoginJSHandler.exec", MonitorManager.CONTEXT_IS_NULL_MSG, "");
        } else {
            p.a().a(jsHost().getActivity(), true, "切换账号登录");
            long optLong = jsBean().argsJson.optLong(DeviceInfo.USER_ID, -1L);
            j a = j.a();
            Object[] objArr2 = {new Long(optLong)};
            ChangeQuickRedirect changeQuickRedirect3 = j.a;
            if (!PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "1510f7ab3aee578bdae0bc1e6f9a9e9c", RobustBitConfig.DEFAULT_VALUE)) {
                if (a.b != null && a.b.size() != 0) {
                    Iterator it = a.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = "";
                            break;
                        }
                        ExchangeableUser exchangeableUser = (ExchangeableUser) it.next();
                        if (exchangeableUser != null && exchangeableUser.userId == optLong) {
                            str = exchangeableUser.ticket;
                            break;
                        }
                    }
                } else {
                    str = "";
                }
            } else {
                str = (String) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "1510f7ab3aee578bdae0bc1e6f9a9e9c");
            }
            if (TextUtils.isEmpty(str)) {
                p.a().a(jsHost().getActivity(), -1, "exchange_login", "login");
                jsCallbackError(new KNBJsErrorInfo(CODE_NO_TICKET, ""));
                n.a("UserLoginJSHandler.exec", "ticket is empty", "");
            } else if (!NetWorkUtils.isNetworkConnected(jsHost().getContext())) {
                jsCallbackError(new KNBJsErrorInfo(9, ""));
                n.a("UserLoginJSHandler.exec", "network is not connected", "");
            } else {
                UserApiFactory.getInstance().create().exchangeLogin(new k().c(), str, s.f()).a(new f<User>() { // from class: com.meituan.passport.changeuser.UserLoginJSHandler.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.retrofit2.f
                    public final void onResponse(Call<User> call, Response<User> response) {
                        Object[] objArr3 = {call, response};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "54af24394d66a8b1f955574bb8e63715", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "54af24394d66a8b1f955574bb8e63715");
                        } else if (response == null || response.e() == null || !response.f()) {
                        } else {
                            User e = response.e();
                            UserCenter.getInstance(UserLoginJSHandler.this.jsHost().getContext()).loginSuccess(e);
                            p.a().a(UserLoginJSHandler.this.jsHost().getActivity(), 1, "exchange_login", "login");
                            UserLoginJSHandler.this.jsCallback();
                            n.a("UserLoginJSHandler.exec.onResponse", "user is :", e != null ? String.valueOf(e.id) : "");
                        }
                    }

                    @Override // com.sankuai.meituan.retrofit2.f
                    public final void onFailure(Call<User> call, Throwable th) {
                        Object[] objArr3 = {call, th};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "b561200e11487b7223482fa7e6273a90", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "b561200e11487b7223482fa7e6273a90");
                        } else if (th == null || !(th.getCause() instanceof ApiException)) {
                        } else {
                            ApiException apiException = (ApiException) th.getCause();
                            UserLoginJSHandler.this.jsCallbackError(new KNBJsErrorInfo(apiException.code, apiException.getMessage()));
                            switch (apiException.code) {
                                case 402:
                                case 403:
                                case 404:
                                case 405:
                                    ap.a().a(UserLoginJSHandler.this.jsHost().getActivity(), apiException.code, th.getMessage(), "", null);
                                    break;
                            }
                            n.a("UserLoginJSHandler.exec.onFailure", "exception code is: ", String.valueOf(apiException.code));
                            p.a().a(UserLoginJSHandler.this.jsHost().getActivity(), apiException.code, "exchange_login", "login");
                        }
                    }
                });
            }
        }
    }
}
