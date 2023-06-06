package com.dianping.imagemanager.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Class cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "753b6d84da16c7da7e406edcbf78fa31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "753b6d84da16c7da7e406edcbf78fa31");
        } else {
            a(cls, null, str);
        }
    }

    public static void b(Class cls, String str) {
        Object[] objArr = {cls, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e318808dcb5618d782d950927f505ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e318808dcb5618d782d950927f505ac7");
        } else {
            b(cls, null, str);
        }
    }

    public static void a(Class cls, String str, String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d616f0725d8dd80a26276052672347f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d616f0725d8dd80a26276052672347f");
        } else if (com.dianping.imagemanager.base.b.a().h != null) {
            com.dianping.imagemanager.base.b.a();
        } else {
            k.b(str, str2);
        }
    }

    public static void b(Class cls, String str, String str2) {
        Object[] objArr = {cls, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa60e0cbd8ca8539e8fcdda17a70bf29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa60e0cbd8ca8539e8fcdda17a70bf29");
        } else if (com.dianping.imagemanager.base.b.a().h != null) {
            com.dianping.imagemanager.base.b.a();
        } else {
            k.d(str, str2);
        }
    }
}
