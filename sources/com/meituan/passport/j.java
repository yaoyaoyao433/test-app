package com.meituan.passport;

import android.text.TextUtils;
import com.meituan.passport.pojo.ExchangeableUser;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class j {
    public static ChangeQuickRedirect a;
    private static j c;
    public com.meituan.passport.utils.l<ExchangeableUser> b;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1269e8994e75c17576c81cb0953f0373", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1269e8994e75c17576c81cb0953f0373");
        } else if (this.b == null) {
            this.b = new com.meituan.passport.utils.l<>(3);
        }
    }

    public static j a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a2cb7600b125554ba9a33c005c35b0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a2cb7600b125554ba9a33c005c35b0f");
        }
        if (c == null) {
            synchronized (j.class) {
                if (c == null) {
                    c = new j();
                }
            }
        }
        return c;
    }

    public final void a(User user) {
        Object[] objArr = {user};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a6c0f0d4a812dbe29e2a8bfe1524212", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a6c0f0d4a812dbe29e2a8bfe1524212");
            return;
        }
        com.meituan.passport.utils.n.a("ExchangeableUserManager.addExchangeableUser", "newUser is: ", user != null ? String.valueOf(user.id) : "");
        if (user == null) {
            return;
        }
        if (this.b == null) {
            this.b = new com.meituan.passport.utils.l<>(3);
        }
        ExchangeableUser exchangeableUser = new ExchangeableUser();
        exchangeableUser.phoneNum = user.mobile;
        exchangeableUser.userId = user.id;
        exchangeableUser.userName = user.username;
        exchangeableUser.avatarUrl = user.avatarurl;
        if (!this.b.contains(exchangeableUser)) {
            this.b.add(0, exchangeableUser);
        } else {
            this.b.remove(exchangeableUser);
            this.b.add(0, exchangeableUser);
        }
        b();
    }

    public final boolean a(long j) {
        boolean z = false;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4496692c783d280a532be109bac8b5f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4496692c783d280a532be109bac8b5f8")).booleanValue();
        }
        com.meituan.passport.utils.n.a("ExchangeableUserManager.deleteExchangeableUser", "userId is: ", String.valueOf(j));
        if (this.b == null || this.b.size() == 0) {
            return false;
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ExchangeableUser exchangeableUser = (ExchangeableUser) it.next();
            if (exchangeableUser != null && exchangeableUser.userId == j) {
                it.remove();
                z = true;
            }
        }
        if (z) {
            b();
        }
        return z;
    }

    public final void a(ExchangeableUser exchangeableUser) {
        Object[] objArr = {exchangeableUser};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd68f77440292cc8ab3b7f17216463ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd68f77440292cc8ab3b7f17216463ad");
            return;
        }
        com.meituan.passport.utils.n.a("ExchangeableUserManager.updateExChangeableUser-ExchangeableUser", "user is: ", String.valueOf(exchangeableUser.userId));
        if (this.b == null || !this.b.contains(exchangeableUser)) {
            return;
        }
        int indexOf = this.b.indexOf(exchangeableUser);
        this.b.remove(exchangeableUser);
        this.b.add(indexOf, exchangeableUser);
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50cb6a2bab57ed4d3f60ffa7b791447f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50cb6a2bab57ed4d3f60ffa7b791447f");
            return;
        }
        com.meituan.passport.utils.n.a("ExchangeableUserManager.saveExchangeableUserList", "", "");
        com.sankuai.android.jarvis.c.a("passport_exchange_save", new Runnable() { // from class: com.meituan.passport.j.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6894fb4fb1b7864024647794bb0f31d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6894fb4fb1b7864024647794bb0f31d5");
                    return;
                }
                com.meituan.passport.utils.l lVar = j.this.b;
                Object[] objArr3 = {lVar};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.passport.sso.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e0dfbd6b658ed1a3515fe16276e672a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e0dfbd6b658ed1a3515fe16276e672a9");
                } else if (lVar == null || lVar.size() == 0) {
                } else {
                    String lVar2 = lVar.toString();
                    if (TextUtils.isEmpty(lVar2)) {
                        com.meituan.passport.utils.n.a("SSOSharePrefrenceHelper.saveExchangeableUserList", "userListString is empty", "");
                        return;
                    }
                    String a2 = new com.meituan.passport.plugins.c().a(lVar2);
                    com.meituan.android.cipstorage.q c2 = com.meituan.passport.sso.a.c(com.meituan.android.singleton.b.a());
                    if (c2 != null) {
                        com.meituan.passport.utils.n.a("SSOSharePrefrenceHelper.saveExchangeableUserList", "changeUserList, ", String.valueOf(c2.a("changeUserList", a2)));
                    }
                }
            }
        }).start();
    }
}
