package com.meituan.msc.modules.reporter;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.meituan.msc.modules.api.report.MSCReportBizTagsManager;
import com.meituan.msc.modules.container.MSCActivity;
import com.meituan.msc.modules.container.MSCWidgetFragment;
import com.meituan.msc.modules.container.r;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static com.meituan.crashreporter.container.c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6e8818a3bcda6263648235468e62cb1", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.crashreporter.container.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6e8818a3bcda6263648235468e62cb1") : com.meituan.crashreporter.c.a(ContainerInfo.ENV_MSC);
    }

    public static void a(String str, String str2, String str3, boolean z) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a795225f0f46468c888a9842302ffc42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a795225f0f46468c888a9842302ffc42");
        } else {
            a().c(new Uri.Builder().scheme(ContainerInfo.ENV_MSC).authority(ContainerInfo.ENV_MSC).appendQueryParameter("targetPath", str).appendQueryParameter("appId", str2).appendQueryParameter("openType", str3).appendQueryParameter("isWidget", String.valueOf(z)).build().toString());
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72c77ccaf405deb01f0f9a113e0f60a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72c77ccaf405deb01f0f9a113e0f60a6");
        } else {
            a().b();
        }
    }

    @Nullable
    public static String a(boolean z) {
        r a2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dce49a69a6ae3242a5b5e469ed675b0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dce49a69a6ae3242a5b5e469ed675b0e");
        }
        if (!com.meituan.msc.modules.container.a.c.d.a(d.b.CREATED) || (a2 = a(com.meituan.msc.modules.container.a.b.b(), z)) == null) {
            return null;
        }
        return a2.k();
    }

    @Nullable
    public static String b(boolean z) {
        r a2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e50b46d3e3902d0fb361320935228ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e50b46d3e3902d0fb361320935228ea");
        }
        if (!com.meituan.msc.modules.container.a.c.d.a(d.b.CREATED) || (a2 = a(com.meituan.msc.modules.container.a.b.b(), z)) == null) {
            return null;
        }
        return a2.h();
    }

    @Nullable
    private static r a(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ddfd87a6c111843e25ad99dc48706763", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ddfd87a6c111843e25ad99dc48706763");
        }
        if (z) {
            return a(activity);
        }
        if (activity instanceof MSCActivity) {
            return (r) activity;
        }
        return null;
    }

    @Nullable
    public static String c(boolean z) {
        r a2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7211158b4d56c060ab1b66bf89cc1b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7211158b4d56c060ab1b66bf89cc1b6");
        }
        if (!com.meituan.msc.modules.container.a.c.d.a(d.b.CREATED) || (a2 = a(com.meituan.msc.modules.container.a.b.b(), z)) == null) {
            return null;
        }
        return a2.i();
    }

    @Nullable
    public static Map<String, String> d(boolean z) {
        r a2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f309314857434cc431f8813545c72b84", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f309314857434cc431f8813545c72b84");
        }
        if (!com.meituan.msc.modules.container.a.c.d.a(d.b.CREATED) || (a2 = a(com.meituan.msc.modules.container.a.b.b(), z)) == null) {
            return null;
        }
        return a2.j();
    }

    @Nullable
    private static r a(Activity activity) {
        FragmentManager supportFragmentManager;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29ee66ae75b627b94fad580f270b68bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29ee66ae75b627b94fad580f270b68bc");
        }
        if (!(activity instanceof FragmentActivity) || (supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager()) == null) {
            return null;
        }
        for (Fragment fragment : supportFragmentManager.getFragments()) {
            if (fragment != null && fragment.isVisible()) {
                if (fragment instanceof MSCWidgetFragment) {
                    return (r) fragment;
                }
                Object[] objArr2 = {fragment};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "09be41fd13850573d115b76522fb9193", RobustBitConfig.DEFAULT_VALUE)) {
                    return (r) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "09be41fd13850573d115b76522fb9193");
                }
                for (Fragment fragment2 : fragment.getChildFragmentManager().getFragments()) {
                    if (fragment2 != null && fragment2.isVisible() && (fragment2 instanceof MSCWidgetFragment)) {
                        return (r) fragment2;
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Nullable
    public static Map<String, String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c081ca95555084c5f4645bf1c68ac023", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c081ca95555084c5f4645bf1c68ac023");
        }
        MSCReportBizTagsManager.BizTagsData a2 = MSCReportBizTagsManager.a().a(str, null);
        if (a2 != null) {
            return a2.getBizTagsForAppId();
        }
        return null;
    }
}
