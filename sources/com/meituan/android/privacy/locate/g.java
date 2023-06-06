package com.meituan.android.privacy.locate;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.Loader;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.android.common.locate.LocationLoaderFactoryImpl;
import com.meituan.android.common.locate.MasterLocator;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.loader.LoadConfigImpl;
import com.meituan.android.privacy.locate.e;
import com.meituan.android.privacy.locate.loader.PrivacyLocationLoader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g implements com.meituan.android.privacy.locate.lifecycle.c {
    public static ChangeQuickRedirect a;
    private List<Loader<MtLocation>> b;
    private List<Loader<Location>> c;
    private LocationLoaderFactory d;
    private String e;
    private MasterLocator f;

    @Override // com.meituan.android.privacy.locate.lifecycle.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ebdb47331f033e539ea448aa636c7ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ebdb47331f033e539ea448aa636c7ab");
        }
    }

    @Override // com.meituan.android.privacy.locate.lifecycle.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac180fab3b1e1392f07dc2dd0598aff5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac180fab3b1e1392f07dc2dd0598aff5");
        }
    }

    public g(String str, MasterLocator masterLocator, final com.meituan.android.privacy.locate.lifecycle.b bVar) {
        Object[] objArr = {str, masterLocator, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c718c47bfa51a9b989df95aacb2bef6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c718c47bfa51a9b989df95aacb2bef6a");
            return;
        }
        if (bVar != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.android.privacy.locate.g.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8aa8ebeb1dd938c3f443138b16156c5d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8aa8ebeb1dd938c3f443138b16156c5d");
                        } else {
                            bVar.a(g.this);
                        }
                    }
                });
            } else {
                bVar.a(this);
            }
        }
        this.e = str;
        this.f = masterLocator;
        this.d = new LocationLoaderFactoryImpl(masterLocator);
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    @Override // com.meituan.android.privacy.locate.lifecycle.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d42acbc593437fc44121c75051c635c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d42acbc593437fc44121c75051c635c7");
            return;
        }
        b(this.b);
        b(this.c);
        a(this.b);
        a(this.c);
    }

    private <T> void a(List<Loader<T>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47c47d648b96bb72083d101de02ff605", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47c47d648b96bb72083d101de02ff605");
            return;
        }
        for (final Loader<T> loader : list) {
            if (loader != null && loader.isStarted()) {
                e.a aVar = new e.a();
                aVar.b = this.e;
                aVar.j = false;
                aVar.l = "stop loader, because loader is still running when lifecycle destroy";
                e.a(aVar);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.android.privacy.locate.g.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "069ade5cdb4cfbbba81d7cb16e7657ba", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "069ade5cdb4cfbbba81d7cb16e7657ba");
                        } else if (loader == null || !loader.isStarted()) {
                        } else {
                            loader.stopLoading();
                        }
                    }
                });
            }
        }
    }

    private <T> void b(List<Loader<T>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f1801e26d7cd86e824ab0829c64f3b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f1801e26d7cd86e824ab0829c64f3b9");
            return;
        }
        for (Loader<T> loader : list) {
            if (loader instanceof PrivacyLocationLoader) {
                e.a aVar = new e.a();
                aVar.b = this.e;
                aVar.j = false;
                aVar.l = "destroy loader because lifecycle onDestroy";
                e.a(aVar);
                ((PrivacyLocationLoader) loader).b = true;
            }
        }
    }

    @Nullable
    public final Loader<MtLocation> a(Context context, LocationLoaderFactory.LoadStrategy loadStrategy) {
        Object[] objArr = {context, loadStrategy};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1742382ed66a34635e66fcee13b14f8", RobustBitConfig.DEFAULT_VALUE) ? (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1742382ed66a34635e66fcee13b14f8") : a(context, loadStrategy, new LoadConfigImpl());
    }

    @Nullable
    public final Loader<MtLocation> a(Context context, LocationLoaderFactory.LoadStrategy loadStrategy, LoadConfig loadConfig) {
        Object[] objArr = {context, loadStrategy, loadConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f4f11c100cf4bd18df763b49da5478a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f4f11c100cf4bd18df763b49da5478a");
        }
        LocationLoaderFactory.LoadStrategy[] loadStrategyArr = {loadStrategy};
        if (d.a(context, this.e, loadStrategyArr)) {
            if (loadConfig == null) {
                loadConfig = new LoadConfigImpl();
            }
            LoadConfig loadConfig2 = loadConfig;
            PrivacyLocationLoader privacyLocationLoader = new PrivacyLocationLoader(this.e, context, this.d.createMtLocationLoader(context, loadStrategyArr[0], d.a(this.e, loadConfig2, loadStrategyArr[0])), d.a(loadStrategyArr[0]), loadConfig2, c.a);
            this.b.add(privacyLocationLoader);
            return privacyLocationLoader;
        }
        return null;
    }

    @Nullable
    public final Loader<MtLocation> a(Context context, LocationLoaderFactory.LoadStrategy loadStrategy, LoadConfig loadConfig, Looper looper) {
        Object[] objArr = {context, loadStrategy, loadConfig, looper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c213375394f35e0ead7bf81f3446c081", RobustBitConfig.DEFAULT_VALUE)) {
            return (Loader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c213375394f35e0ead7bf81f3446c081");
        }
        LocationLoaderFactory.LoadStrategy[] loadStrategyArr = {loadStrategy};
        if (d.a(context, this.e, loadStrategyArr)) {
            PrivacyLocationLoader privacyLocationLoader = new PrivacyLocationLoader(this.e, context, this.d.createMtLocationLoader(context, loadStrategyArr[0], d.a(this.e, loadConfig, loadStrategyArr[0]), looper), d.a(loadStrategyArr[0]), loadConfig, c.a);
            this.b.add(privacyLocationLoader);
            return privacyLocationLoader;
        }
        return null;
    }

    @Nullable
    public static g a(Activity activity, String str, MasterLocator masterLocator) {
        Object[] objArr = {activity, str, masterLocator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bc849d74b19f119d59ad70c673a7434", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bc849d74b19f119d59ad70c673a7434");
        }
        if (activity.isDestroyed() || activity.isFinishing()) {
            e.a aVar = new e.a();
            aVar.j = false;
            aVar.l = "lifecycle is destroyed, create wrapper failed";
            e.a(aVar);
            return null;
        }
        com.meituan.android.privacy.locate.lifecycle.d a2 = com.meituan.android.privacy.locate.lifecycle.d.a();
        Object[] objArr2 = {activity, str, masterLocator};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.privacy.locate.lifecycle.d.a;
        return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "4c57e1848b6523b8e5f34065b6d5ad61", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "4c57e1848b6523b8e5f34065b6d5ad61") : a2.a(activity, activity.getFragmentManager(), str, masterLocator);
    }

    @Nullable
    public static g a(FragmentActivity fragmentActivity, String str, MasterLocator masterLocator) {
        Object[] objArr = {fragmentActivity, str, masterLocator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "753cd68ed6638b8517838f108a5a3638", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "753cd68ed6638b8517838f108a5a3638");
        }
        if (fragmentActivity.isDestroyed() || fragmentActivity.isFinishing()) {
            e.a aVar = new e.a();
            aVar.j = false;
            aVar.l = "lifecycle is destroyed, create wrapper failed";
            e.a(aVar);
            return null;
        }
        com.meituan.android.privacy.locate.lifecycle.d a2 = com.meituan.android.privacy.locate.lifecycle.d.a();
        Object[] objArr2 = {fragmentActivity, str, masterLocator};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.privacy.locate.lifecycle.d.a;
        return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "537167d5bb1f4395e022b268aa1a5c26", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "537167d5bb1f4395e022b268aa1a5c26") : a2.a(fragmentActivity, fragmentActivity.getSupportFragmentManager(), str, masterLocator);
    }

    @Nullable
    public static g a(Fragment fragment, String str, MasterLocator masterLocator) {
        Object[] objArr = {fragment, str, masterLocator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8352143879a3d1664837ca640387f507", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8352143879a3d1664837ca640387f507");
        }
        if (fragment == null || fragment.getActivity() == null) {
            e.a aVar = new e.a();
            aVar.j = false;
            aVar.l = "fragment or fragment's activity is destroyed, create wrapper failed";
            e.a(aVar);
            return null;
        }
        com.meituan.android.privacy.locate.lifecycle.d a2 = com.meituan.android.privacy.locate.lifecycle.d.a();
        Object[] objArr2 = {fragment, str, masterLocator};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.privacy.locate.lifecycle.d.a;
        return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "2c76727c1355aa64f30fe01c5551c3b9", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "2c76727c1355aa64f30fe01c5551c3b9") : a2.a(fragment.getActivity(), fragment.getChildFragmentManager(), str, masterLocator);
    }

    @Nullable
    public static g a(android.support.v4.app.Fragment fragment, String str, MasterLocator masterLocator) {
        Object[] objArr = {fragment, str, masterLocator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc46639492500728c4c3702ac07f2305", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc46639492500728c4c3702ac07f2305");
        }
        if (fragment == null || fragment.getActivity() == null) {
            e.a aVar = new e.a();
            aVar.j = false;
            aVar.l = "fragment or fragment's activity is destroyed, create wrapper failed";
            e.a(aVar);
            return null;
        }
        com.meituan.android.privacy.locate.lifecycle.d a2 = com.meituan.android.privacy.locate.lifecycle.d.a();
        Object[] objArr2 = {fragment, str, masterLocator};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.privacy.locate.lifecycle.d.a;
        return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "353d7ac4e08e1d172bf7ef99468e4d01", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "353d7ac4e08e1d172bf7ef99468e4d01") : a2.a(fragment.getActivity(), fragment.getChildFragmentManager(), str, masterLocator);
    }

    public static g a(com.meituan.android.privacy.locate.lifecycle.b bVar, String str, MasterLocator masterLocator) {
        Object[] objArr = {bVar, str, masterLocator};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e2b812a1018d22bb54b5462eb49baf7", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e2b812a1018d22bb54b5462eb49baf7") : new g(str, masterLocator, bVar);
    }
}
