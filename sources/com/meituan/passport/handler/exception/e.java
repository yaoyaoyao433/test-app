package com.meituan.passport.handler.exception;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.passport.exception.ApiException;
import com.meituan.passport.exception.skyeyemonitor.module.k;
import com.meituan.passport.exception.skyeyemonitor.module.q;
import com.meituan.passport.exception.skyeyemonitor.module.s;
import com.meituan.passport.exception.skyeyemonitor.module.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends a {
    public static ChangeQuickRedirect c;
    private int d;
    private String g;

    public e(Fragment fragment, com.meituan.passport.converter.b bVar) {
        super(fragment, bVar);
        Object[] objArr = {fragment, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aa59bda20efc427ebf52e785be7cec5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aa59bda20efc427ebf52e785be7cec5");
        }
    }

    public e(FragmentActivity fragmentActivity, com.meituan.passport.converter.b bVar) {
        super(fragmentActivity, bVar);
        Object[] objArr = {fragmentActivity, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bba34c0411bdf30fc407d2196d5a9239", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bba34c0411bdf30fc407d2196d5a9239");
        }
    }

    public e(FragmentActivity fragmentActivity, com.meituan.passport.converter.b bVar, int i) {
        super(fragmentActivity, bVar);
        Object[] objArr = {fragmentActivity, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e249e5776a6223cf116fea889c90938a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e249e5776a6223cf116fea889c90938a");
        } else {
            this.d = i;
        }
    }

    public e(FragmentActivity fragmentActivity, com.meituan.passport.converter.b bVar, int i, String str) {
        super(fragmentActivity, bVar);
        Object[] objArr = {fragmentActivity, bVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0550b7c680850c9c968ffff80957a281", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0550b7c680850c9c968ffff80957a281");
            return;
        }
        this.d = i;
        this.g = str;
    }

    @Override // com.meituan.passport.handler.exception.a
    public final ApiException a(ApiException apiException) {
        Object[] objArr = {apiException};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43f2f68a25ec6ba3cb01a05e4f36ecd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (ApiException) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43f2f68a25ec6ba3cb01a05e4f36ecd3");
        }
        if (b() != null) {
            a(getClass(), apiException);
            Object[] objArr2 = {apiException};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8bbd42837229f035e53e4c7cd39c9946", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8bbd42837229f035e53e4c7cd39c9946");
            } else if (apiException != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("code", Integer.valueOf(apiException.code));
                hashMap.put("message", apiException.getMessage());
                hashMap.put("type", apiException.type);
                if (!TextUtils.isEmpty(this.g)) {
                    hashMap.put("oauth_type", this.g);
                }
                if (apiException.code == 101144) {
                    int i = this.d;
                    if (i == 100) {
                        com.meituan.passport.exception.skyeyemonitor.module.a aVar = (com.meituan.passport.exception.skyeyemonitor.module.a) com.meituan.passport.exception.skyeyemonitor.a.a().a("account_login");
                        Object[] objArr3 = {hashMap};
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.exception.skyeyemonitor.module.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "a52376dfd28d9c1b09b0561b109ad8ff", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "a52376dfd28d9c1b09b0561b109ad8ff");
                        } else {
                            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "account_login", "account_login_risk_rejection", "风控拒绝", hashMap);
                        }
                    } else if (i == 200) {
                        k kVar = (k) com.meituan.passport.exception.skyeyemonitor.a.a().a("dynamic_login");
                        Object[] objArr4 = {hashMap};
                        ChangeQuickRedirect changeQuickRedirect4 = k.a;
                        if (PatchProxy.isSupport(objArr4, kVar, changeQuickRedirect4, false, "6aea9684473c290573999d171b36a20d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, kVar, changeQuickRedirect4, false, "6aea9684473c290573999d171b36a20d");
                        } else {
                            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "dynamic_login", "dynamic_login_risk_rejection", "风控拒绝", hashMap);
                        }
                    } else if (i == 300) {
                        t tVar = (t) com.meituan.passport.exception.skyeyemonitor.a.a().a("oauth_login_unbinded");
                        Object[] objArr5 = {hashMap};
                        ChangeQuickRedirect changeQuickRedirect5 = t.a;
                        if (PatchProxy.isSupport(objArr5, tVar, changeQuickRedirect5, false, "2d75b673ddf5823620ce5b9e1544b90e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, tVar, changeQuickRedirect5, false, "2d75b673ddf5823620ce5b9e1544b90e");
                        } else {
                            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "oauth_login_unbinded", "oauth_login_unbinded_risk_rejection", "风控拒绝", hashMap);
                        }
                    } else if (i == 700) {
                        s sVar = (s) com.meituan.passport.exception.skyeyemonitor.a.a().a("oauth_login_binded");
                        Object[] objArr6 = {hashMap};
                        ChangeQuickRedirect changeQuickRedirect6 = s.a;
                        if (PatchProxy.isSupport(objArr6, sVar, changeQuickRedirect6, false, "b4373e3599fd87baaf7e2cbdbfd77cd9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, sVar, changeQuickRedirect6, false, "b4373e3599fd87baaf7e2cbdbfd77cd9");
                        } else {
                            com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "oauth_login_binded", "oauth_login_binded_risk_rejection", "风控拒绝", hashMap);
                        }
                    }
                } else if (apiException.code == 101135 && this.d == 600) {
                    q qVar = (q) com.meituan.passport.exception.skyeyemonitor.a.a().a("new_share_login");
                    Object[] objArr7 = {hashMap};
                    ChangeQuickRedirect changeQuickRedirect7 = q.a;
                    if (PatchProxy.isSupport(objArr7, qVar, changeQuickRedirect7, false, "6ed82c9cc27a9255354454b938b8adfb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, qVar, changeQuickRedirect7, false, "6ed82c9cc27a9255354454b938b8adfb");
                    } else {
                        com.sankuai.meituan.skyeye.library.core.e.a("biz_passport", "new_share_login", "new_share_login_risk_rejection", "风控拒绝", hashMap);
                    }
                }
            }
            com.meituan.passport.exception.monitor.b a = com.meituan.passport.exception.monitor.b.a();
            Object[] objArr8 = {apiException};
            ChangeQuickRedirect changeQuickRedirect8 = com.meituan.passport.exception.monitor.b.a;
            if (PatchProxy.isSupport(objArr8, a, changeQuickRedirect8, false, "c17b98ff0c8d267f32e6331a13556815", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, a, changeQuickRedirect8, false, "c17b98ff0c8d267f32e6331a13556815");
            } else {
                if (apiException != null) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("code", String.valueOf(apiException.code));
                    hashMap2.put("message", apiException.getMessage());
                    hashMap2.put("type", apiException.type);
                    a.a("passport_exception", "api_exception", hashMap2);
                } else {
                    Sniffer.smell(a.c(), "passport_exception", "api_exception", "", "no exception message");
                }
                a.b();
            }
            com.meituan.passport.converter.b a2 = a();
            if (a2 == null || a2.a(apiException, false)) {
                a(apiException.getMessage());
                return null;
            }
            return null;
        }
        return apiException;
    }
}
