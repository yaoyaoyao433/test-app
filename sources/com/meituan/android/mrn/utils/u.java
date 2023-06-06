package com.meituan.android.mrn.utils;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class u {
    public static ChangeQuickRedirect a;

    public static com.meituan.android.mrn.container.b a(ReactContext reactContext) {
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3d8633fa7337916074c1d451e1792fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.container.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3d8633fa7337916074c1d451e1792fb");
        }
        if (reactContext == null) {
            return null;
        }
        return a(reactContext, reactContext.getCurrentActivity());
    }

    private static com.meituan.android.mrn.container.b a(ReactContext reactContext, Activity activity) {
        Set<com.meituan.android.mrn.container.b> b;
        Object[] objArr = {reactContext, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9fbfd0556a0a718bb6aa0ce356e88fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.container.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9fbfd0556a0a718bb6aa0ce356e88fc");
        }
        if (activity instanceof MRNBaseActivity) {
            MRNBaseActivity mRNBaseActivity = (MRNBaseActivity) activity;
            if (r.a(mRNBaseActivity.l(), reactContext)) {
                return mRNBaseActivity;
            }
        }
        com.meituan.android.mrn.engine.k a2 = r.a(reactContext);
        if (a2 == null || (b = a2.b()) == null) {
            return null;
        }
        for (com.meituan.android.mrn.container.b bVar : b) {
            if (b(bVar) == activity) {
                return bVar;
            }
        }
        return null;
    }

    public static com.meituan.android.mrn.container.g a(com.meituan.android.mrn.container.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c421fdf7d9784acb236a0454b3bd55d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.container.g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c421fdf7d9784acb236a0454b3bd55d6");
        }
        if (bVar == null) {
            return null;
        }
        if (!(bVar instanceof MRNBaseActivity)) {
            if (!(bVar instanceof MRNBaseFragment)) {
                try {
                    return (com.meituan.android.mrn.container.g) ad.a(bVar, "getMRNDelegate", new Object[0]);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
            return ((MRNBaseFragment) bVar).f;
        }
        return ((MRNBaseActivity) bVar).e;
    }

    public static com.meituan.android.mrn.container.b a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fff556bc2e93268b79579cd6cc9f82ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.container.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fff556bc2e93268b79579cd6cc9f82ed");
        }
        try {
            for (com.meituan.android.mrn.engine.k kVar : com.meituan.android.mrn.engine.n.a().b()) {
                com.meituan.android.mrn.container.b a2 = kVar.a(i);
                if (a2 != null) {
                    return a2;
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return null;
    }

    private static Activity b(com.meituan.android.mrn.container.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc64da4551d8d89cbb423ee30752bdb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc64da4551d8d89cbb423ee30752bdb1");
        }
        if (bVar == null) {
            return null;
        }
        if (bVar instanceof Activity) {
            return (Activity) bVar;
        }
        if (bVar instanceof Fragment) {
            return ((Fragment) bVar).getActivity();
        }
        try {
            return (Activity) ad.a(bVar, "getActivity", new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
