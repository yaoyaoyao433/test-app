package com.meituan.passport.moduleinterface;

import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.singleton.b;
import com.meituan.passport.api.ICallbackBase;
import com.meituan.passport.api.ReportExChangeLoginProvider;
import com.meituan.passport.clickaction.d;
import com.meituan.passport.j;
import com.meituan.passport.pojo.ExchangeableUser;
import com.meituan.passport.pojo.ResetTokenData;
import com.meituan.passport.pojo.User;
import com.meituan.passport.pojo.request.h;
import com.meituan.passport.utils.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReportExChangeLoginImpl implements ReportExChangeLoginProvider {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.passport.api.ReportExChangeLoginProvider
    public void reportExChangeableUserLogin(final User user, User user2) {
        Object[] objArr = {user, user2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11fa2a91284d22b7f340bc80aefb295d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11fa2a91284d22b7f340bc80aefb295d");
            return;
        }
        Object[] objArr2 = {user, user2};
        ChangeQuickRedirect changeQuickRedirect2 = af.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "266957051e80c9ed1d247b3180b6cd0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "266957051e80c9ed1d247b3180b6cd0b");
        } else if (user2 == null) {
        } else {
            j.a().a(user2);
            if (user == null || TextUtils.isEmpty(user.token) || TextUtils.equals(user.token, user2.token)) {
                return;
            }
            h hVar = new h();
            hVar.b = d.a(user.token);
            hVar.k = d.a(user.token);
            hVar.j = d.a(user2.token);
            String str = "";
            try {
                str = OneIdHandler.getInstance(b.a()).getLocalOneId();
            } catch (Exception unused) {
            }
            hVar.c = d.a(str);
            hVar.h = d.a(15000);
            af.a(hVar, new ICallbackBase<ResetTokenData>() { // from class: com.meituan.passport.utils.af.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.api.ICallbackBase
                public final /* synthetic */ void onSuccess(ResetTokenData resetTokenData) {
                    ResetTokenData resetTokenData2 = resetTokenData;
                    Object[] objArr3 = {resetTokenData2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fdf7bcd7b49c038e5235b6b2cb4def17", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fdf7bcd7b49c038e5235b6b2cb4def17");
                        return;
                    }
                    n.a("ReportLogInfoUtils.reportExChangeableUserLogin.onSuccess", "", "");
                    ExchangeableUser exchangeableUser = new ExchangeableUser();
                    exchangeableUser.phoneNum = user.mobile;
                    exchangeableUser.userId = user.id;
                    exchangeableUser.userName = user.username;
                    exchangeableUser.avatarUrl = user.avatarurl;
                    if (resetTokenData2 == null || resetTokenData2.data == null) {
                        return;
                    }
                    exchangeableUser.ticket = resetTokenData2.data.ticket;
                    com.meituan.passport.j.a().a(exchangeableUser);
                }

                @Override // com.meituan.passport.api.ICallbackBase
                public final void onFailed(Throwable th) {
                    Object[] objArr3 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ec6aed7b8d144430a802854de477d989", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ec6aed7b8d144430a802854de477d989");
                    } else {
                        n.a("ReportLogInfoUtils.reportExChangeableUserLogin.onFailed", "exception is: ", th != null ? th.getMessage() : "");
                    }
                }
            });
        }
    }
}
