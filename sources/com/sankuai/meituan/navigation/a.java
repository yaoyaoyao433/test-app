package com.sankuai.meituan.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.navigation.common.Navigator;
import com.sankuai.meituan.navigation.common.e;
import com.sankuai.meituan.navigation.common.f;
import com.sankuai.meituan.navigation.common.h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final Context b;
    public com.sankuai.meituan.navigation.common.d c;
    public int d;
    public Bundle e;
    public int[] f;
    public final Deque<com.sankuai.meituan.navigation.common.c> g;
    public final h h;
    public final Navigator.a i;
    private Activity j;
    private b k;
    private final CopyOnWriteArrayList<InterfaceC0622a> l;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.navigation.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0622a {
        void a(@NonNull a aVar, @NonNull com.sankuai.meituan.navigation.common.c cVar);
    }

    public a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c96aff0991c5ab9d01973b1ef255696", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c96aff0991c5ab9d01973b1ef255696");
            return;
        }
        this.g = new ArrayDeque();
        this.h = new h() { // from class: com.sankuai.meituan.navigation.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.navigation.common.h
            @Nullable
            public final Navigator<? extends com.sankuai.meituan.navigation.common.c> a(@NonNull String str, @NonNull Navigator<? extends com.sankuai.meituan.navigation.common.c> navigator) {
                Object[] objArr2 = {str, navigator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d824f7ab61ac6c9c1973188145390dce", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Navigator) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d824f7ab61ac6c9c1973188145390dce");
                }
                Navigator<? extends com.sankuai.meituan.navigation.common.c> a2 = super.a(str, navigator);
                if (a2 != navigator) {
                    if (a2 != null) {
                        Navigator.a aVar = a.this.i;
                        Object[] objArr3 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect3 = Navigator.b;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "e49c652256e056ca91c2392d0243220f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "e49c652256e056ca91c2392d0243220f");
                        } else if (a2.c.remove(aVar) && a2.c.isEmpty()) {
                            a2.e();
                        }
                    }
                    Navigator.a aVar2 = a.this.i;
                    Object[] objArr4 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect4 = Navigator.b;
                    if (PatchProxy.isSupport(objArr4, navigator, changeQuickRedirect4, false, "cb7586155cc5531111e06d906740fed3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, navigator, changeQuickRedirect4, false, "cb7586155cc5531111e06d906740fed3");
                    } else if (navigator.c.add(aVar2) && navigator.c.size() == 1) {
                        navigator.d();
                    }
                }
                return a2;
            }
        };
        this.i = new Navigator.a() { // from class: com.sankuai.meituan.navigation.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.navigation.common.Navigator.a
            public final void a(@NonNull Navigator navigator, @IdRes int i, int i2) {
                com.sankuai.meituan.navigation.common.c cVar;
                Object[] objArr2 = {navigator, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be9d0950bae3cd458254569a10b94170", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be9d0950bae3cd458254569a10b94170");
                    return;
                }
                switch (i2) {
                    case 1:
                        com.sankuai.meituan.navigation.common.c b = a.this.b(i);
                        if (b == null) {
                            throw new IllegalArgumentException("Navigator " + navigator + " reported navigation to unknown destination id " + com.sankuai.meituan.navigation.common.c.a(a.this.b, i));
                        }
                        a.this.g.add(b);
                        a.this.a(b);
                        return;
                    case 2:
                        Iterator<com.sankuai.meituan.navigation.common.c> descendingIterator = a.this.g.descendingIterator();
                        while (true) {
                            if (descendingIterator.hasNext()) {
                                com.sankuai.meituan.navigation.common.c next = descendingIterator.next();
                                cVar = next.b == navigator ? next : null;
                            }
                        }
                        if (cVar == null) {
                            throw new IllegalArgumentException("Navigator " + navigator + " reported pop but did not have any destinations on the NavController back stack");
                        }
                        a.this.a(cVar.d, false);
                        if (!a.this.g.isEmpty()) {
                            a.this.g.removeLast();
                        }
                        while (!a.this.g.isEmpty() && (a.this.g.peekLast() instanceof com.sankuai.meituan.navigation.common.d)) {
                            a.this.a();
                        }
                        if (a.this.g.isEmpty()) {
                            return;
                        }
                        a.this.a(a.this.g.peekLast());
                        return;
                    default:
                        return;
                }
            }
        };
        this.l = new CopyOnWriteArrayList<>();
        this.b = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.j = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        this.h.a(new e(this.b));
    }

    public final void a(@NonNull InterfaceC0622a interfaceC0622a) {
        Object[] objArr = {interfaceC0622a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7be71b012ca657c7c0546e5d7c6824b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7be71b012ca657c7c0546e5d7c6824b1");
            return;
        }
        if (!this.g.isEmpty()) {
            interfaceC0622a.a(this, this.g.peekLast());
        }
        this.l.add(interfaceC0622a);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d25ea8149d7e1f4c15b9e85c02faba7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d25ea8149d7e1f4c15b9e85c02faba7")).booleanValue();
        }
        if (this.g.isEmpty()) {
            return false;
        }
        return a(d().d, true);
    }

    public final boolean a(@IdRes int i, boolean z) {
        boolean z2;
        com.sankuai.meituan.navigation.common.c cVar;
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5afe7dea05c444285411f65812a447f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5afe7dea05c444285411f65812a447f")).booleanValue();
        }
        if (this.g.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<com.sankuai.meituan.navigation.common.c> descendingIterator = this.g.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            com.sankuai.meituan.navigation.common.c next = descendingIterator.next();
            if (z || next.d != i) {
                arrayList.add(next);
            }
            if (next.d == i) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            String a2 = com.sankuai.meituan.navigation.common.c.a(this.b, i);
            StringBuilder sb = new StringBuilder("Ignoring popBackStack to destination ");
            sb.append(a2);
            sb.append(" as it was not found on the current back stack");
            return false;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z3 = false;
            while (it.hasNext()) {
                Object next2 = it.next();
                while (true) {
                    cVar = (com.sankuai.meituan.navigation.common.c) next2;
                    if (!this.g.isEmpty() && this.g.peekLast().d != cVar.d) {
                        if (!it.hasNext()) {
                            cVar = null;
                            break;
                        }
                        next2 = it.next();
                    } else {
                        break;
                    }
                }
                if (cVar != null) {
                    if (cVar.b.a() || z3) {
                        z3 = true;
                    }
                }
            }
            return z3;
        }
    }

    public final void a(com.sankuai.meituan.navigation.common.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67dace4174b6da867cf5ca66fb5edfa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67dace4174b6da867cf5ca66fb5edfa7");
            return;
        }
        Iterator<InterfaceC0622a> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().a(this, cVar);
        }
    }

    @NonNull
    public final b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f96eca71b83e5598346233b1e5e3401", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f96eca71b83e5598346233b1e5e3401");
        }
        if (this.k == null) {
            this.k = new b(this.b, this.h);
        }
        return this.k;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672daede1baa108e409d5e0035b135e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672daede1baa108e409d5e0035b135e4");
            return;
        }
        b b = b();
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        this.c = PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "6bc91bb9abcb1a68d48eacbbe1c043c2", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.navigation.common.d) PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "6bc91bb9abcb1a68d48eacbbe1c043c2") : b.b.a(i);
        this.d = i;
        c();
    }

    public void c() {
        int[] iArr;
        ArrayList<String> stringArrayList;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "843e04089f0c0782ccffa7b1a5480797", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "843e04089f0c0782ccffa7b1a5480797");
            return;
        }
        if (this.e != null && (stringArrayList = this.e.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                Navigator a2 = this.h.a(next);
                Bundle bundle = this.e.getBundle(next);
                if (bundle != null) {
                    a2.a(bundle);
                }
            }
        }
        if (this.f != null) {
            for (int i : this.f) {
                com.sankuai.meituan.navigation.common.c b = b(i);
                if (b == null) {
                    throw new IllegalStateException("unknown destination during restore: " + this.b.getResources().getResourceName(i));
                }
                this.g.add(b);
            }
            this.f = null;
        }
        if (this.c == null || !this.g.isEmpty()) {
            return;
        }
        if (this.j != null && a(this.j.getIntent())) {
            z = true;
        }
        if (z) {
            return;
        }
        this.c.a((Bundle) null, (f) null);
    }

    private boolean a(@Nullable Intent intent) {
        Pair<com.sankuai.meituan.navigation.common.c, Bundle> a2;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e447cfcda50337366a5800ae40b18994", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e447cfcda50337366a5800ae40b18994")).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        Bundle bundle = new Bundle();
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if ((intArray == null || intArray.length == 0) && intent.getData() != null && (a2 = this.c.a(intent.getData())) != null) {
            intArray = a2.first.b();
            bundle.putAll(a2.second);
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int flags = intent.getFlags();
        int i = 268435456 & flags;
        if (i != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            TaskStackBuilder.create(this.b).addNextIntentWithParentStack(intent).startActivities();
            if (this.j != null) {
                this.j.finish();
            }
            return true;
        } else if (i != 0) {
            if (!this.g.isEmpty()) {
                int i2 = this.c.g;
                f.a a3 = new f.a().a(this.c.d, true);
                a3.e = 0;
                a3.f = 0;
                a(i2, bundle, a3.a());
            }
            int i3 = 0;
            while (i3 < intArray.length) {
                int i4 = i3 + 1;
                int i5 = intArray[i3];
                com.sankuai.meituan.navigation.common.c b = b(i5);
                if (b == null) {
                    throw new IllegalStateException("unknown destination during deep link: " + com.sankuai.meituan.navigation.common.c.a(this.b, i5));
                }
                f.a aVar = new f.a();
                aVar.e = 0;
                aVar.f = 0;
                b.a(bundle, aVar.a());
                i3 = i4;
            }
            return true;
        } else {
            com.sankuai.meituan.navigation.common.d dVar = this.c;
            int i6 = 0;
            while (i6 < intArray.length) {
                int i7 = intArray[i6];
                com.sankuai.meituan.navigation.common.c b2 = i6 == 0 ? this.c : dVar.b(i7);
                if (b2 == null) {
                    throw new IllegalStateException("unknown destination during deep link: " + com.sankuai.meituan.navigation.common.c.a(this.b, i7));
                }
                if (i6 != intArray.length - 1) {
                    dVar = (com.sankuai.meituan.navigation.common.d) b2;
                } else {
                    f.a a4 = new f.a().a(this.c.d, true);
                    a4.e = 0;
                    a4.f = 0;
                    b2.a(bundle, a4.a());
                }
                i6++;
            }
            return true;
        }
    }

    public final com.sankuai.meituan.navigation.common.c d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bee64c2cb6a9444f243a166458462118", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.navigation.common.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bee64c2cb6a9444f243a166458462118") : this.g.peekLast();
    }

    public final com.sankuai.meituan.navigation.common.c b(@IdRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9302b0845a564187520c05d95451f421", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.navigation.common.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9302b0845a564187520c05d95451f421");
        }
        if (this.c == null) {
            return null;
        }
        if (this.c.d == i) {
            return this.c;
        }
        com.sankuai.meituan.navigation.common.c peekLast = this.g.isEmpty() ? this.c : this.g.peekLast();
        return (peekLast instanceof com.sankuai.meituan.navigation.common.d ? (com.sankuai.meituan.navigation.common.d) peekLast : peekLast.c).b(i);
    }

    public final void c(@IdRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "279e56743ce8b0487c91705c63e4c77b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "279e56743ce8b0487c91705c63e4c77b");
        } else {
            a(i, (Bundle) null);
        }
    }

    public final void a(@IdRes int i, @Nullable Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fec0fb6973daf1b37e45483fca94b77e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fec0fb6973daf1b37e45483fca94b77e");
        } else {
            a(i, bundle, null);
        }
    }

    private void a(@IdRes int i, @Nullable Bundle bundle, @Nullable f fVar) {
        int i2;
        String str;
        Object[] objArr = {Integer.valueOf(i), bundle, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aa3c2c1d222213ff697cff14ffea4dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aa3c2c1d222213ff697cff14ffea4dd");
            return;
        }
        com.sankuai.meituan.navigation.common.c peekLast = this.g.isEmpty() ? this.c : this.g.peekLast();
        if (peekLast == null) {
            throw new IllegalStateException("no current navigation node");
        }
        com.sankuai.meituan.navigation.common.a a2 = peekLast.a(i);
        if (a2 != null) {
            if (fVar == null) {
                fVar = a2.b;
            }
            i2 = a2.a;
        } else {
            i2 = i;
        }
        if (i2 == 0 && fVar != null && fVar.b != 0) {
            a(fVar.b, fVar.c);
        } else if (i2 == 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with navOptions.popUpTo != 0");
        } else {
            com.sankuai.meituan.navigation.common.c b = b(i2);
            if (b == null) {
                String a3 = com.sankuai.meituan.navigation.common.c.a(this.b, i2);
                StringBuilder sb = new StringBuilder("navigation destination ");
                sb.append(a3);
                if (a2 != null) {
                    str = " referenced from action " + com.sankuai.meituan.navigation.common.c.a(this.b, i);
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(" is unknown to this NavController");
                throw new IllegalArgumentException(sb.toString());
            }
            if (fVar != null) {
                if (fVar.b()) {
                    a(this.c.d, true);
                } else if (fVar.b != 0) {
                    a(fVar.b, fVar.c);
                }
            }
            b.a(bundle, fVar);
        }
    }
}
