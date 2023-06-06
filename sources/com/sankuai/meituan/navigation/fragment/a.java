package com.sankuai.meituan.navigation.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.navigation.common.Navigator;
import com.sankuai.meituan.navigation.common.c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
@Navigator.Name("fragment")
/* loaded from: classes4.dex */
public final class a extends Navigator<C0623a> {
    public static ChangeQuickRedirect a;
    public FragmentManager d;
    public ArrayDeque<Integer> e;
    public int f;
    public int g;
    private Context h;
    private int i;
    private final FragmentManager.OnBackStackChangedListener j;

    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    @Override // com.sankuai.meituan.navigation.common.Navigator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(@android.support.annotation.NonNull com.sankuai.meituan.navigation.fragment.a.C0623a r13, @android.support.annotation.Nullable android.os.Bundle r14, @android.support.annotation.Nullable com.sankuai.meituan.navigation.common.f r15) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.navigation.fragment.a.a(com.sankuai.meituan.navigation.common.c, android.os.Bundle, com.sankuai.meituan.navigation.common.f):void");
    }

    @Override // com.sankuai.meituan.navigation.common.Navigator
    @NonNull
    public final /* synthetic */ C0623a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cada9f6d3cebac9511ea9ee3cd9bed5e", RobustBitConfig.DEFAULT_VALUE) ? (C0623a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cada9f6d3cebac9511ea9ee3cd9bed5e") : new C0623a(this);
    }

    public a(@NonNull Context context, @NonNull FragmentManager fragmentManager, int i) {
        Object[] objArr = {context, fragmentManager, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fab8f9271c0434df7e0829b5a32f224", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fab8f9271c0434df7e0829b5a32f224");
            return;
        }
        this.e = new ArrayDeque<>();
        this.f = 1;
        this.g = 0;
        this.j = new FragmentManager.OnBackStackChangedListener() { // from class: com.sankuai.meituan.navigation.fragment.FragmentNavigator$1
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.app.FragmentManager.OnBackStackChangedListener
            public void onBackStackChanged() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b2880cd3d1eb9859e9f4d043b1a97d1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b2880cd3d1eb9859e9f4d043b1a97d1");
                    return;
                }
                int backStackEntryCount = a.this.d.getBackStackEntryCount() + 1;
                if (a.this.g > 0 && backStackEntryCount <= a.this.f + a.this.g) {
                    a.this.g -= backStackEntryCount - a.this.f;
                    a.this.f = backStackEntryCount;
                    return;
                }
                a.this.f = backStackEntryCount;
                if (backStackEntryCount < a.this.e.size()) {
                    while (a.this.e.size() > backStackEntryCount) {
                        a.this.e.removeLast();
                    }
                    a.this.a(a.this.e.isEmpty() ? 0 : a.this.e.peekLast().intValue(), 2);
                }
            }
        };
        this.h = context;
        this.d = fragmentManager;
        this.i = i;
    }

    @Override // com.sankuai.meituan.navigation.common.Navigator
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6249558a0dbc08ca1cd28c7513d04e7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6249558a0dbc08ca1cd28c7513d04e7f");
        } else {
            this.d.addOnBackStackChangedListener(this.j);
        }
    }

    @Override // com.sankuai.meituan.navigation.common.Navigator
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ee9190ffe2b80506acaf2794e15e174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ee9190ffe2b80506acaf2794e15e174");
        } else {
            this.d.removeOnBackStackChangedListener(this.j);
        }
    }

    @Override // com.sankuai.meituan.navigation.common.Navigator
    public final boolean a() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d8586af6f68be9b6855adbbc50aeb2e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d8586af6f68be9b6855adbbc50aeb2e")).booleanValue();
        }
        if (this.e.isEmpty() || this.d.isStateSaved()) {
            return false;
        }
        if (this.d.getBackStackEntryCount() > 0) {
            this.d.popBackStack();
            z = true;
        } else {
            z = false;
        }
        this.e.removeLast();
        a(this.e.isEmpty() ? 0 : this.e.peekLast().intValue(), 2);
        return z;
    }

    @NonNull
    private String a(@IdRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3310735a3838d015c72dade418c75213", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3310735a3838d015c72dade418c75213");
        }
        try {
            return this.h.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i);
        }
    }

    @Override // com.sankuai.meituan.navigation.common.Navigator
    @Nullable
    public final Bundle b() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2b2831d3154bb8e6066dc64151d29c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2b2831d3154bb8e6066dc64151d29c3");
        }
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.e.size()];
        Iterator<Integer> it = this.e.iterator();
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    @Override // com.sankuai.meituan.navigation.common.Navigator
    public final void a(@Nullable Bundle bundle) {
        int[] intArray;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "606e2e41f36685ebdc7acf3ef8930ab9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "606e2e41f36685ebdc7acf3ef8930ab9");
        } else if (bundle != null && (intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds")) != null) {
            this.e.clear();
            for (int i : intArray) {
                this.e.add(Integer.valueOf(i));
            }
            this.f = this.e.size();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.navigation.fragment.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0623a extends c {
        public static ChangeQuickRedirect e;
        private static final HashMap<String, Class<? extends Fragment>> g = new HashMap<>();
        String f;
        private Class<? extends Fragment> h;
        private Class<? extends Fragment> i;

        public C0623a(@NonNull Navigator<? extends C0623a> navigator) {
            super(navigator);
            Object[] objArr = {navigator};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ea5596fcd3e247804a7139b9cdd234c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ea5596fcd3e247804a7139b9cdd234c");
            }
        }

        @Override // com.sankuai.meituan.navigation.common.c
        public final void a(@NonNull Context context, @NonNull AttributeSet attributeSet) {
            Object[] objArr = {context, attributeSet};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c70fd458d4419d5e6bb97d3fe0ec622", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c70fd458d4419d5e6bb97d3fe0ec622");
                return;
            }
            super.a(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, new int[]{16842755, 16842961, 16843245});
            this.h = a(context, obtainAttributes.getString(0));
            if (!TextUtils.isEmpty(obtainAttributes.getString(1))) {
                this.i = b(context, obtainAttributes.getString(1));
            }
            String string = obtainAttributes.getString(2);
            if (!TextUtils.isEmpty(string)) {
                this.f = string;
            }
            obtainAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        private Class<? extends Fragment> a(Context context, String str) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5caf008c80de0f6be5c2ff3342cc7f8a", RobustBitConfig.DEFAULT_VALUE)) {
                return (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5caf008c80de0f6be5c2ff3342cc7f8a");
            }
            if (str != null && str.charAt(0) == '.') {
                str = context.getPackageName() + str;
            }
            Class<? extends Fragment> cls = g.get(str);
            if (cls == null) {
                try {
                    Class cls2 = Class.forName(str, true, context.getClassLoader());
                    g.put(str, cls2);
                    return cls2;
                } catch (ClassNotFoundException e2) {
                    throw new RuntimeException(e2);
                }
            }
            return cls;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Class<? extends Fragment> b(Context context, String str) {
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af9e53cd1014a96c7bb9be6360523ffa", RobustBitConfig.DEFAULT_VALUE)) {
                return (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af9e53cd1014a96c7bb9be6360523ffa");
            }
            if (str != null && str.charAt(0) == '.') {
                str = context.getPackageName() + str;
            }
            Class<? extends Fragment> cls = g.get(str);
            if (cls == null) {
                try {
                    Class cls2 = Class.forName(str, true, context.getClassLoader());
                    try {
                        g.put(str, cls2);
                    } catch (ClassNotFoundException unused) {
                    }
                    return cls2;
                } catch (ClassNotFoundException unused2) {
                    return cls;
                }
            }
            return cls;
        }

        public final Fragment a(@Nullable Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect = e;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9c49ae07747180e5990d7e85fb5f9b0", RobustBitConfig.DEFAULT_VALUE)) {
                return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9c49ae07747180e5990d7e85fb5f9b0");
            }
            Class<? extends Fragment> cls = this.h;
            if (cls == null) {
                throw new IllegalStateException("fragment class not set");
            }
            String name = cls.getName();
            Class<? extends Fragment> cls2 = this.i;
            if (!TextUtils.isEmpty(name) && name.contains("AgencyFragment")) {
                if (cls2 == null) {
                    return null;
                }
                cls = cls2;
            }
            try {
                Fragment newInstance = cls.newInstance();
                if (bundle != null) {
                    newInstance.setArguments(bundle);
                }
                return newInstance;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
