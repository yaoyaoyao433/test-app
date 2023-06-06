package com.sankuai.xm.base.util;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.util.b;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ActivityUtils {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7651784a4c7366291f5532db224230df", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7651784a4c7366291f5532db224230df")).booleanValue();
        }
        if (context == null || intent == null) {
            return false;
        }
        return Build.VERSION.SDK_INT > 29 || intent.resolveActivity(context.getPackageManager()) != null;
    }

    public static boolean b(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a635a0cac428801e4d78d023f50e05a", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a635a0cac428801e4d78d023f50e05a")).booleanValue() : a(context, intent, -1);
    }

    public static boolean a(Context context, Intent intent, @StringRes int i) {
        Object[] objArr = {context, intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8242cd0528bb90585ec653bbba8ab8f0", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8242cd0528bb90585ec653bbba8ab8f0")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if (intent == null) {
            com.sankuai.xm.log.c.d("ActivityUtils", "start activity fail", new Object[0]);
            if (i != -1) {
                ad.a(context, i);
            }
            return false;
        } else if (!a(context, intent)) {
            com.sankuai.xm.log.c.d("ActivityUtils", "start activity fail", new Object[0]);
            if (i != -1) {
                ad.a(context, i);
            }
            return false;
        } else {
            try {
                context.startActivity(intent);
            } catch (Throwable th) {
                com.sankuai.xm.log.c.a("ActivityUtils", th);
                if (i != -1) {
                    ad.a(context, i);
                }
            }
            return true;
        }
    }

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c55bb8bf6342b761715e1f5d70f5f6ee", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c55bb8bf6342b761715e1f5d70f5f6ee")).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        boolean isDestroyed = Build.VERSION.SDK_INT >= 17 ? activity.isDestroyed() : false;
        if (isDestroyed || activity.isFinishing()) {
            StringBuilder sb = new StringBuilder();
            sb.append(isDestroyed);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(activity.isFinishing());
            com.sankuai.xm.log.c.b("ActivityUtils", "Activity [%s] is invalid, isDestroyed--> %s, isFinishing-->%s", activity.getClass().getName(), sb.toString(), sb2.toString());
            return false;
        }
        return true;
    }

    @Nullable
    public static Activity a(Context context) {
        while (true) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7392db234b3861289fb5b217371ff56", 6917529027641081856L)) {
                return (Activity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7392db234b3861289fb5b217371ff56");
            }
            if (context == null) {
                return null;
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if ((context instanceof Application) || !(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    @NonNull
    public static synchronized HelperFragment b(Activity activity) {
        HelperFragment helperFragment;
        synchronized (ActivityUtils.class) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfa868ae402ef148879f71c22e1b461d", 6917529027641081856L)) {
                return (HelperFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfa868ae402ef148879f71c22e1b461d");
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag("XM_SDK_FRAGMENT_HELPER");
            if (findFragmentByTag instanceof HelperFragment) {
                helperFragment = (HelperFragment) findFragmentByTag;
            } else {
                helperFragment = new HelperFragment();
                fragmentManager.beginTransaction().add(helperFragment, "XM_SDK_FRAGMENT_HELPER").commitAllowingStateLoss();
                fragmentManager.executePendingTransactions();
            }
            return helperFragment;
        }
    }

    public static synchronized void c(Activity activity) {
        synchronized (ActivityUtils.class) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d724207296ed996a8d4249210de43772", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d724207296ed996a8d4249210de43772");
            } else if (activity == null) {
            } else {
                FragmentManager fragmentManager = activity.getFragmentManager();
                Fragment findFragmentByTag = fragmentManager.findFragmentByTag("XM_SDK_FRAGMENT_HELPER");
                if (findFragmentByTag != null) {
                    fragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
                }
                if (!fragmentManager.isDestroyed()) {
                    fragmentManager.executePendingTransactions();
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class HelperFragment extends Fragment {
        public static ChangeQuickRedirect a = null;
        private static int b = 127;
        private final ArrayList<com.sankuai.xm.base.lifecycle.b> c;
        private Map<Integer, Callback<Intent>> d;
        private volatile int e;

        public HelperFragment() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b929896b9509465b38c385e4c6b317e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b929896b9509465b38c385e4c6b317e");
                return;
            }
            this.c = new ArrayList<>();
            this.d = new ConcurrentHashMap();
            this.e = 0;
        }

        @Override // android.app.Fragment
        public final void onActivityResult(int i, int i2, Intent intent) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d199cfdc84e6f87bdf7fe9ca55124656", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d199cfdc84e6f87bdf7fe9ca55124656");
                return;
            }
            com.meituan.android.privacy.aop.a.c();
            Callback<Intent> remove = this.d.remove(Integer.valueOf(i));
            if (remove == null) {
                com.meituan.android.privacy.aop.a.d();
                return;
            }
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra("XM_SDK_RESULT_CODE", i2);
            remove.onSuccess(intent);
            com.meituan.android.privacy.aop.a.d();
        }

        public final synchronized void a(com.sankuai.xm.base.lifecycle.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95a0c89ba33bd2c720aff2307faae0a0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95a0c89ba33bd2c720aff2307faae0a0");
                return;
            }
            if (bVar != null) {
                this.c.add(bVar);
            }
        }

        @Override // android.app.Fragment
        public final void onCreate(@Nullable Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50ceb444b48472cc7ea832b48d45e0b6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50ceb444b48472cc7ea832b48d45e0b6");
                return;
            }
            super.onCreate(bundle);
            a(new b.a<com.sankuai.xm.base.lifecycle.b>() { // from class: com.sankuai.xm.base.util.ActivityUtils.HelperFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(com.sankuai.xm.base.lifecycle.b bVar) {
                    com.sankuai.xm.base.lifecycle.b bVar2 = bVar;
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a93914a556780048f67e2ed9df69fdf", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a93914a556780048f67e2ed9df69fdf")).booleanValue();
                    }
                    if (bVar2 != null) {
                        bVar2.a(HelperFragment.this.getActivity());
                    }
                    return false;
                }
            });
        }

        @Override // android.app.Fragment
        public final void onStart() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffb136c457d0217280baa87debc0332f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffb136c457d0217280baa87debc0332f");
                return;
            }
            super.onStart();
            a(new b.a<com.sankuai.xm.base.lifecycle.b>() { // from class: com.sankuai.xm.base.util.ActivityUtils.HelperFragment.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(com.sankuai.xm.base.lifecycle.b bVar) {
                    com.sankuai.xm.base.lifecycle.b bVar2 = bVar;
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9d87e97e73ed8ea71916f4b8ee0ec22", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9d87e97e73ed8ea71916f4b8ee0ec22")).booleanValue();
                    }
                    if (bVar2 != null) {
                        bVar2.b(HelperFragment.this.getActivity());
                    }
                    return false;
                }
            });
        }

        @Override // android.app.Fragment
        public final void onResume() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eb50979ef67a88646c0e320ecc63cae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eb50979ef67a88646c0e320ecc63cae");
                return;
            }
            super.onResume();
            a(new b.a<com.sankuai.xm.base.lifecycle.b>() { // from class: com.sankuai.xm.base.util.ActivityUtils.HelperFragment.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(com.sankuai.xm.base.lifecycle.b bVar) {
                    com.sankuai.xm.base.lifecycle.b bVar2 = bVar;
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2d18677ce8fa167f80b2602c9ce8eb1", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2d18677ce8fa167f80b2602c9ce8eb1")).booleanValue();
                    }
                    if (bVar2 != null) {
                        bVar2.c(HelperFragment.this.getActivity());
                    }
                    return false;
                }
            });
        }

        @Override // android.app.Fragment
        public final void onPause() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d94418cc87477e82f6b9029a656f7db7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d94418cc87477e82f6b9029a656f7db7");
                return;
            }
            super.onPause();
            a(new b.a<com.sankuai.xm.base.lifecycle.b>() { // from class: com.sankuai.xm.base.util.ActivityUtils.HelperFragment.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(com.sankuai.xm.base.lifecycle.b bVar) {
                    com.sankuai.xm.base.lifecycle.b bVar2 = bVar;
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65d66efd6ae074ab0b981a50d745b220", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65d66efd6ae074ab0b981a50d745b220")).booleanValue();
                    }
                    if (bVar2 != null) {
                        bVar2.d(HelperFragment.this.getActivity());
                    }
                    return false;
                }
            });
        }

        @Override // android.app.Fragment
        public final void onStop() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51786a7b6c9ee926644a5539e6309292", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51786a7b6c9ee926644a5539e6309292");
                return;
            }
            super.onStop();
            a(new b.a<com.sankuai.xm.base.lifecycle.b>() { // from class: com.sankuai.xm.base.util.ActivityUtils.HelperFragment.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(com.sankuai.xm.base.lifecycle.b bVar) {
                    com.sankuai.xm.base.lifecycle.b bVar2 = bVar;
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74565ae0b4f4c88efd9e5fe18a871da7", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74565ae0b4f4c88efd9e5fe18a871da7")).booleanValue();
                    }
                    if (bVar2 != null) {
                        bVar2.e(HelperFragment.this.getActivity());
                    }
                    return false;
                }
            });
        }

        @Override // android.app.Fragment
        public final void onDestroyView() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feff04f6c2b5a3ff47ecb3affbff34e0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feff04f6c2b5a3ff47ecb3affbff34e0");
                return;
            }
            a(new b.a<com.sankuai.xm.base.lifecycle.b>() { // from class: com.sankuai.xm.base.util.ActivityUtils.HelperFragment.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(com.sankuai.xm.base.lifecycle.b bVar) {
                    com.sankuai.xm.base.lifecycle.b bVar2 = bVar;
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "28dd35386129d8015e973388d69048ed", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "28dd35386129d8015e973388d69048ed")).booleanValue();
                    }
                    if (bVar2 != null) {
                        bVar2.f(HelperFragment.this.getActivity());
                    }
                    return false;
                }
            });
            super.onDestroyView();
        }

        @Override // android.app.Fragment
        public final void onDestroy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c156d53788b616f5508298c5dc1d0e9c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c156d53788b616f5508298c5dc1d0e9c");
                return;
            }
            this.d.clear();
            a(new b.a<com.sankuai.xm.base.lifecycle.b>() { // from class: com.sankuai.xm.base.util.ActivityUtils.HelperFragment.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(com.sankuai.xm.base.lifecycle.b bVar) {
                    com.sankuai.xm.base.lifecycle.b bVar2 = bVar;
                    Object[] objArr2 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82bee3608d72739240ad89087f400c3e", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82bee3608d72739240ad89087f400c3e")).booleanValue();
                    }
                    if (bVar2 != null) {
                        bVar2.g(HelperFragment.this.getActivity());
                    }
                    return false;
                }
            });
            synchronized (this) {
                this.c.clear();
            }
            super.onDestroy();
        }

        private void a(b.a<com.sankuai.xm.base.lifecycle.b> aVar) {
            ArrayList arrayList;
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c11ab525e1105c2a006e1f22744c375", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c11ab525e1105c2a006e1f22744c375");
                return;
            }
            synchronized (this) {
                arrayList = new ArrayList(this.c);
            }
            b.a(arrayList, aVar);
        }
    }
}
