package com.meituan.passport.login;

import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.PassportUIConfig;
import com.meituan.passport.login.d;
import com.meituan.passport.plugins.l;
import com.meituan.passport.pojo.OAuthItem;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.ab;
import com.meituan.passport.utils.ag;
import com.meituan.passport.utils.n;
import com.meituan.passport.utils.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum f {
    INSTANCE;
    
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        boolean a(String str);
    }

    f() {
        Object[] objArr = {r10, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca72f39415a19e6aeb062eaa6af53729", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca72f39415a19e6aeb062eaa6af53729");
        }
    }

    public static f valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff5085c1cef2a8808ddd787b45fecf7e", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff5085c1cef2a8808ddd787b45fecf7e") : (f) Enum.valueOf(f.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static f[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd12e555b2eefbb52c0b97abcda073bb", RobustBitConfig.DEFAULT_VALUE) ? (f[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd12e555b2eefbb52c0b97abcda073bb") : (f[]) values().clone();
    }

    public final boolean a(d.b bVar) {
        List<OAuthItem> b;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0e471cd0e17b0fffb7ffea7f1deb15a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0e471cd0e17b0fffb7ffea7f1deb15a")).booleanValue() : PassportUIConfig.v() && (b = b(bVar)) != null && b.size() > 0;
    }

    public final void a(Fragment fragment, String str, a aVar) {
        Object[] objArr = {fragment, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b49822a995fb9fa90e83249f83877fba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b49822a995fb9fa90e83249f83877fba");
        } else if (a(d.b.a(str))) {
            OAuthFragment oAuthFragment = (OAuthFragment) fragment.getChildFragmentManager().findFragmentByTag("flag_fragment_oauth");
            if (oAuthFragment == null) {
                Bundle bundle = new Bundle();
                bundle.putString("arg_fragment_type", str);
                oAuthFragment = (OAuthFragment) OAuthFragment.a(OAuthFragment.class, bundle);
                oAuthFragment.i = aVar;
            }
            if (oAuthFragment == null || oAuthFragment.isAdded()) {
                return;
            }
            fragment.getChildFragmentManager().beginTransaction().add(R.id.passport_index_other, oAuthFragment, "flag_fragment_oauth").commitAllowingStateLoss();
        }
    }

    public final List<OAuthItem> b(d.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d6b9254e05f1b06c66c8bfa68280d44", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d6b9254e05f1b06c66c8bfa68280d44");
        }
        List<OAuthItem> a2 = a();
        if (a2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (OAuthItem oAuthItem : a2) {
            if (oAuthItem != null && (ab.a() != 1 || oAuthItem != OAuthItem.QQ)) {
                if (ab.a() != 2 || oAuthItem != OAuthItem.SAME_ACCOUNT_DEFAULT) {
                    arrayList.add(oAuthItem);
                }
            }
        }
        return a(a(arrayList, bVar));
    }

    private List<OAuthItem> a(List<OAuthItem> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87d8134ffb85a05912c2424b05903d49", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87d8134ffb85a05912c2424b05903d49");
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        int i = ab.a() != 1 ? 5 : 4;
        return list.size() > i ? list.subList(0, i) : list;
    }

    private List<OAuthItem> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f37d6f095dacdaa9eb0a647d1e79f0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f37d6f095dacdaa9eb0a647d1e79f0c");
        }
        if (!o.a().c) {
            List<String> e = com.meituan.passport.sso.a.e(com.meituan.android.singleton.b.a());
            return e != null ? b(e) : Arrays.asList(OAuthItem.SAME_ACCOUNT_DEFAULT, OAuthItem.PASSWORD_FREE, OAuthItem.VERIFICATION_PASSWORD, OAuthItem.WEIXIN, OAuthItem.QQ);
        }
        ArrayList<String> arrayList = o.a().b;
        com.meituan.passport.sso.a.a(com.meituan.android.singleton.b.a(), arrayList);
        return b(arrayList);
    }

    private ArrayList<OAuthItem> b(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02c3664baec7eeac89e676a2f59695ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02c3664baec7eeac89e676a2f59695ad");
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList<OAuthItem> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            OAuthItem from = OAuthItem.from(list.get(i));
            if (from != null) {
                arrayList.add(from);
            }
        }
        return arrayList;
    }

    private List<OAuthItem> a(List<OAuthItem> list, d.b bVar) {
        Object[] objArr = {list, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4cf6e7959f375a57fe8c8e9c9d1e492", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4cf6e7959f375a57fe8c8e9c9d1e492");
        }
        if (list.size() <= 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            OAuthItem oAuthItem = list.get(i);
            if (oAuthItem == OAuthItem.SAME_ACCOUNT_DEFAULT) {
                if (bVar != d.b.UNIQUE_SSO && PassportConfig.r() && l.a().c != null && l.a().c.size() != 0) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e7bbe7b4f7a052f0ef30246e26534af", RobustBitConfig.DEFAULT_VALUE)) {
                        oAuthItem = (OAuthItem) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e7bbe7b4f7a052f0ef30246e26534af");
                    } else {
                        l a2 = l.a();
                        if (a2.d == null) {
                            a2.d = OAuthItem.SAME_ACCOUNT_DEFAULT;
                        }
                        oAuthItem = a2.d;
                    }
                }
            }
            if ((oAuthItem != OAuthItem.PASSWORD_FREE || (bVar != d.b.CHINA_MOBILE && ag.a())) && ((oAuthItem != OAuthItem.VERIFICATION_PASSWORD || (bVar != d.b.ACCOUNT && bVar != d.b.DYNAMIC)) && ((oAuthItem != OAuthItem.QQ || (ag.c() && Utils.a())) && (oAuthItem != OAuthItem.WEIXIN || (ag.c() && Utils.b()))))) {
                if (!arrayList.contains(oAuthItem)) {
                    arrayList.add(oAuthItem);
                    n.a("OAuthCenter.filterWhenUnSupportOperator", "Add One OAuthItem: ", oAuthItem != null ? oAuthItem.toString() : "");
                }
                if (arrayList.size() == 5) {
                    break;
                }
            }
        }
        return arrayList;
    }
}
