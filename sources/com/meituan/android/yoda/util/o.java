package com.meituan.android.yoda.util;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import com.meituan.android.yoda.data.d;
import com.meituan.android.yoda.fragment.YodaKNBFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o {
    public static ChangeQuickRedirect a;
    private static o b = new o();

    public static o a() {
        return b;
    }

    @UiThread
    public final void a(@NonNull FragmentActivity fragmentActivity, int i, @NonNull com.meituan.android.yoda.interfaces.d<Fragment> dVar) {
        Object[] objArr = {fragmentActivity, Integer.valueOf(i), dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "414901fcc4a8359ca84baa03697e8168", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "414901fcc4a8359ca84baa03697e8168");
        } else {
            a.a(fragmentActivity, i, dVar);
        }
    }

    @UiThread
    public final boolean a(@NonNull FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61e0a1b7f657170fe5c3639bb2c99126", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61e0a1b7f657170fe5c3639bb2c99126")).booleanValue() : a.a(fragmentActivity);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private static final String b = YodaKNBFragment.l();
        private static LinkedList<C0381a> c = new LinkedList<>();

        public static void a(FragmentActivity fragmentActivity, int i, com.meituan.android.yoda.interfaces.d<Fragment> dVar) {
            Fragment findFragmentByTag;
            Object[] objArr = {fragmentActivity, Integer.valueOf(i), dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5591ebd2c01228d88031ca6028c21c0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5591ebd2c01228d88031ca6028c21c0");
                return;
            }
            com.meituan.android.yoda.monitor.log.a.a("FragmentManager", "show before: cachedFragments = " + c, true);
            if (y.a((Activity) fragmentActivity)) {
                return;
            }
            int b2 = dVar.b();
            d(fragmentActivity);
            FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
            Fragment c2 = dVar.c();
            if (c2 != null) {
                beginTransaction.add(i, c2, dVar.a());
                beginTransaction.show(c2);
                try {
                    Object[] objArr2 = {fragmentActivity, beginTransaction};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "594f7f2701c63e8768c1debbd2ca7a84", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "594f7f2701c63e8768c1debbd2ca7a84");
                    } else if (c.size() > 0 && (findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(c.getLast().b)) != null) {
                        beginTransaction.remove(findFragmentByTag);
                    }
                    beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commitAllowingStateLoss();
                    a(b2, dVar.a());
                    c(fragmentActivity);
                    com.meituan.android.yoda.monitor.log.a.a("FragmentManager", "show after: cachedFragments = " + c, true);
                    return;
                } catch (Exception e) {
                    com.meituan.android.yoda.monitor.log.a.a("FragmentManager", "hide fragment exception = " + e.getMessage(), true);
                    return;
                }
            }
            com.meituan.android.yoda.monitor.log.a.a("FragmentManager", "cannot create instance with " + dVar.b() + CommonConstant.Symbol.COLON + dVar.a(), true);
        }

        public static boolean a(@NonNull FragmentActivity fragmentActivity) {
            FragmentTransaction hide;
            Object[] objArr = {fragmentActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e8fdc72d4b7a6ee7d72ce45ddc4d6da", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e8fdc72d4b7a6ee7d72ce45ddc4d6da")).booleanValue();
            }
            d(fragmentActivity);
            com.meituan.android.yoda.monitor.log.a.a("FragmentManager", "backPressedWithNoType start, cachedFragments = " + c, true);
            if (b.equals(c.getLast().b)) {
                hide = a(fragmentActivity, true);
                if (hide == null) {
                    hide = fragmentActivity.getSupportFragmentManager().beginTransaction();
                }
            } else {
                Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(c.getLast().b);
                LinkedList<C0381a> linkedList = c;
                linkedList.remove(linkedList.getLast());
                if (findFragmentByTag == null) {
                    return false;
                }
                hide = fragmentActivity.getSupportFragmentManager().beginTransaction().hide(findFragmentByTag);
            }
            Fragment findFragmentByTag2 = fragmentActivity.getSupportFragmentManager().findFragmentByTag(c.getLast().b);
            if (findFragmentByTag2 == null) {
                com.meituan.android.yoda.monitor.log.a.a("FragmentManager", "backPressedWithNoType, showedFragment is not in FragmentManager.", true);
                return false;
            }
            hide.show(findFragmentByTag2).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commitAllowingStateLoss();
            com.meituan.android.yoda.monitor.log.a.a("FragmentManager", "backPressedWithNoType end, cachedFragments = " + c, true);
            return true;
        }

        public static boolean b(@NonNull FragmentActivity fragmentActivity) {
            FragmentTransaction hide;
            Object[] objArr = {fragmentActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b7d886e050e4f0d92e2f221ad17e95e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b7d886e050e4f0d92e2f221ad17e95e")).booleanValue();
            }
            com.meituan.android.yoda.monitor.log.a.a("FragmentManager", "backPressed start, cachedFragments = " + c, true);
            if (y.a((Activity) fragmentActivity) || c.size() <= 1) {
                return false;
            }
            int i = c.getLast().a;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.yoda.data.d.a;
            if (!(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cf192fcf0bbce6638f332d2322444af1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cf192fcf0bbce6638f332d2322444af1")).booleanValue() : d.a.a().b(i))) {
                com.meituan.android.yoda.monitor.log.a.a("FragmentManager", "backPressed start, isBridgeType = false, " + c, true);
                return false;
            }
            d(fragmentActivity);
            if (b.equals(c.getLast().b)) {
                hide = a(fragmentActivity, true);
                if (hide == null) {
                    hide = fragmentActivity.getSupportFragmentManager().beginTransaction();
                }
            } else {
                Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(c.getLast().b);
                LinkedList<C0381a> linkedList = c;
                linkedList.remove(linkedList.getLast());
                if (findFragmentByTag == null) {
                    return false;
                }
                hide = fragmentActivity.getSupportFragmentManager().beginTransaction().hide(findFragmentByTag);
            }
            Fragment findFragmentByTag2 = fragmentActivity.getSupportFragmentManager().findFragmentByTag(c.getLast().b);
            if (findFragmentByTag2 == null) {
                com.meituan.android.yoda.monitor.log.a.a("FragmentManager", "backPressedWithNoType, showedFragment is not in FragmentManager.", true);
                return false;
            }
            hide.show(findFragmentByTag2).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commitAllowingStateLoss();
            com.meituan.android.yoda.monitor.log.a.a("FragmentManager", "backPressed end, cachedFragments = " + c, true);
            return true;
        }

        public static int a() {
            C0381a last;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ef138d011f019bc291558e20c3cbcb8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ef138d011f019bc291558e20c3cbcb8")).intValue();
            }
            if (c.size() > 0 && (last = c.getLast()) != null) {
                return last.a;
            }
            return -1;
        }

        public static void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "718d539012c1e504bdbb1b56ba872d42", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "718d539012c1e504bdbb1b56ba872d42");
            } else {
                c.clear();
            }
        }

        private static void a(int i, String str) {
            boolean z = false;
            Object[] objArr = {Integer.valueOf(i), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0850b23051690a1e9ce4a8fae8a565ef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0850b23051690a1e9ce4a8fae8a565ef");
                return;
            }
            com.meituan.android.yoda.monitor.log.a.a("FragmentManager", "addToList before: cachedFragments = " + c, true);
            Iterator<C0381a> it = c.iterator();
            C0381a c0381a = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c0381a = it.next();
                if (c0381a.a == i) {
                    c.remove(c0381a);
                    z = true;
                    break;
                }
            }
            if (!z) {
                c0381a = new C0381a();
                c0381a.a = i;
                c0381a.b = str;
            }
            c.addLast(c0381a);
            com.meituan.android.yoda.monitor.log.a.a("FragmentManager", "addToList after: cachedFragments = " + c, true);
        }

        private static void c(FragmentActivity fragmentActivity) {
            Object[] objArr = {fragmentActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c78c8851b3ff922afaac51169f6ec8b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c78c8851b3ff922afaac51169f6ec8b");
                return;
            }
            d(fragmentActivity);
            List<Fragment> fragments = fragmentActivity.getSupportFragmentManager().getFragments();
            com.meituan.android.yoda.monitor.log.a.a("FragmentManager", "ensureMemoryCache before, fragmentList:" + fragments, true);
            FragmentTransaction a2 = a(fragmentActivity, false);
            int i = a2 != null ? 1 : 0;
            while (fragments != null && fragments.size() - i > 8) {
                String str = c.getFirst().b;
                c.removeFirst();
                Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(str);
                if (findFragmentByTag != null) {
                    if (a2 == null) {
                        a2 = fragmentActivity.getSupportFragmentManager().beginTransaction();
                    }
                    a2.remove(findFragmentByTag);
                    i++;
                }
            }
            if (a2 != null) {
                a2.commitAllowingStateLoss();
            }
            List<Fragment> fragments2 = fragmentActivity.getSupportFragmentManager().getFragments();
            com.meituan.android.yoda.monitor.log.a.a("FragmentManager", "ensureMemoryCache after, fragmentList:" + fragments2, true);
        }

        private static FragmentTransaction a(FragmentActivity fragmentActivity, boolean z) {
            Object[] objArr = {fragmentActivity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            FragmentTransaction fragmentTransaction = null;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ecd4e028e31d27ff6e43c8497b13cb7c", RobustBitConfig.DEFAULT_VALUE)) {
                return (FragmentTransaction) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ecd4e028e31d27ff6e43c8497b13cb7c");
            }
            if (z || !b.equals(c.getLast().b)) {
                Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(b);
                if (findFragmentByTag != null) {
                    fragmentTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.remove(findFragmentByTag);
                }
                c();
                return fragmentTransaction;
            }
            return null;
        }

        private static void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6b2a9996e0e861e8a55841bc1e051fb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6b2a9996e0e861e8a55841bc1e051fb");
                return;
            }
            Iterator<C0381a> it = c.iterator();
            while (it.hasNext()) {
                C0381a next = it.next();
                if (b.equals(next.b)) {
                    c.remove(next);
                    return;
                }
            }
        }

        private static void d(FragmentActivity fragmentActivity) {
            Object[] objArr = {fragmentActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46bfc77841788e980d3d83e22d5712a9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46bfc77841788e980d3d83e22d5712a9");
                return;
            }
            try {
                fragmentActivity.getSupportFragmentManager().executePendingTransactions();
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* renamed from: com.meituan.android.yoda.util.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0381a {
            public int a;
            public String b;

            public C0381a() {
            }

            public final String toString() {
                return this.b;
            }
        }
    }
}
