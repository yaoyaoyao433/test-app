package com.meituan.android.legwork.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.legwork.bean.orderDetail.PrivacyPhoneBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class y {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static y c;
    public final Context b;

    private y(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "379e2297bd25d038f7509848469e1403", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "379e2297bd25d038f7509848469e1403");
        } else {
            this.b = context.getApplicationContext();
        }
    }

    public static y a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98f165e01088d74592fa04aac106df75", RobustBitConfig.DEFAULT_VALUE)) {
            return (y) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98f165e01088d74592fa04aac106df75");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new y(com.meituan.android.legwork.a.a());
                }
            }
        }
        return c;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e064e1b6f1a8d98a67fbd39ae1f54e82", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e064e1b6f1a8d98a67fbd39ae1f54e82") : b("pt_client_config_bean", "");
    }

    public final PrivacyPhoneBean a(@NonNull String str) {
        ArrayList arrayList;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ac56941be4fc70d9e2e2edfa4bcdfe4", RobustBitConfig.DEFAULT_VALUE)) {
            return (PrivacyPhoneBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ac56941be4fc70d9e2e2edfa4bcdfe4");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String b = b("pt_privacy_phone", "");
        try {
            arrayList = (ArrayList) com.meituan.android.legwork.net.util.b.a().fromJson(b, new TypeToken<List<PrivacyPhoneBean>>() { // from class: com.meituan.android.legwork.utils.y.1
            }.getType());
        } catch (Exception e) {
            x.e("PtSP.getRiderPhone()", "get getRiderPhone error，riderPhoneString:" + b + ",exception msg:", e);
            x.a(e);
            arrayList = null;
        }
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PrivacyPhoneBean privacyPhoneBean = (PrivacyPhoneBean) it.next();
            if (privacyPhoneBean != null && str.equals(privacyPhoneBean.orderId)) {
                return privacyPhoneBean;
            }
        }
        return null;
    }

    public final void b(@NonNull String str) {
        ArrayList arrayList;
        boolean z;
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6df317c4c0c9f588d9059bd4f08e0efa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6df317c4c0c9f588d9059bd4f08e0efa");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            String b = b("pt_privacy_phone", "");
            try {
                arrayList = (ArrayList) com.meituan.android.legwork.net.util.b.a().fromJson(b, new TypeToken<List<PrivacyPhoneBean>>() { // from class: com.meituan.android.legwork.utils.y.2
                }.getType());
            } catch (Exception e) {
                x.e("PtSP.removeRiderPhone()", "saveRiderPhone() parse json to bean error，riderPhoneString:" + b + ",exception msg:", e);
                x.a(e);
                arrayList = null;
            }
            if (arrayList == null || arrayList.size() == 0) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                PrivacyPhoneBean privacyPhoneBean = (PrivacyPhoneBean) it.next();
                if (privacyPhoneBean != null && str.equals(privacyPhoneBean.orderId)) {
                    it.remove();
                    z = true;
                    break;
                }
            }
            if (z) {
                try {
                    str2 = com.meituan.android.legwork.net.util.b.a().toJson(arrayList);
                } catch (Exception e2) {
                    x.e("PtSP.removeRiderPhone()", "parse bean to json error,exception msg:", e2);
                    x.a(e2);
                    str2 = null;
                }
                a("pt_privacy_phone", str2);
            }
        }
    }

    public final void a(@NonNull PrivacyPhoneBean privacyPhoneBean) {
        ArrayList arrayList;
        String str;
        Object[] objArr = {privacyPhoneBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "547b79fdbb48a2c52d237dd378b725b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "547b79fdbb48a2c52d237dd378b725b5");
        } else if (privacyPhoneBean == null) {
        } else {
            try {
                arrayList = (ArrayList) com.meituan.android.legwork.net.util.b.a().fromJson(b("pt_privacy_phone", ""), new TypeToken<List<PrivacyPhoneBean>>() { // from class: com.meituan.android.legwork.utils.y.3
                }.getType());
            } catch (Exception e) {
                x.e("PtSP.saveRiderPhone()", "parse json to bean error,exception msg:", e);
                x.a(e);
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            Iterator it = arrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                PrivacyPhoneBean privacyPhoneBean2 = (PrivacyPhoneBean) it.next();
                if (privacyPhoneBean2 != null) {
                    if (privacyPhoneBean.orderId.equals(privacyPhoneBean2.orderId)) {
                        privacyPhoneBean2.riderPhoneNumber = privacyPhoneBean.riderPhoneNumber;
                        privacyPhoneBean2.isPrivacy = privacyPhoneBean.isPrivacy;
                        privacyPhoneBean2.userBindPhone = privacyPhoneBean.userBindPhone;
                        privacyPhoneBean2.saveTime = com.meituan.android.time.c.b();
                        z = true;
                    } else if (privacyPhoneBean2.saveTime + 604800000 < com.meituan.android.time.c.b()) {
                        it.remove();
                    }
                }
            }
            if (!z) {
                privacyPhoneBean.saveTime = com.meituan.android.time.c.b();
                arrayList.add(privacyPhoneBean);
            }
            try {
                str = com.meituan.android.legwork.net.util.b.a().toJson(arrayList);
            } catch (Exception e2) {
                x.e("PtSP.saveRiderPhone()", "parse bean to json error,exception msg:", e2);
                x.a(e2);
                str = null;
            }
            a("pt_privacy_phone", str);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63dec6e218e85edaca1afa3728d1e9e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63dec6e218e85edaca1afa3728d1e9e0");
            return;
        }
        a("pt_latest_pay_mode_" + com.meituan.android.legwork.common.user.a.a().d(), i);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a359262735dc6788d51a42b7ff8e48a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a359262735dc6788d51a42b7ff8e48a");
        } else {
            a("useMRNMapLine", String.valueOf(z));
        }
    }

    public void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7ccefc345c2c84d86bd28a28a2bea52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7ccefc345c2c84d86bd28a28a2bea52");
        } else {
            z.a(this.b, str, str2);
        }
    }

    public void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8b4205bde09c093d063284f77d7190d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8b4205bde09c093d063284f77d7190d");
        } else {
            z.a(this.b, str, i);
        }
    }

    public String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1841df0f5dff67cd3ea4a608e560530d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1841df0f5dff67cd3ea4a608e560530d") : z.b(this.b, str, str2);
    }
}
