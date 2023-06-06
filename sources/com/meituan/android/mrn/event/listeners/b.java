package com.meituan.android.mrn.event.listeners;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface b {
    public static final c<d> c = new c<d>() { // from class: com.meituan.android.mrn.event.listeners.b.1
        public static ChangeQuickRedirect a;
        private Collection<String> b = new ArrayList();

        {
            this.b.add("com.meituan.android.mrn.debug.MRNDebugManager.OpenDebugPanelListener");
            this.b.add("com.meituan.android.mrn.debug.MRNDebugManager.GlobalSyncContainerListener");
        }

        @Override // com.meituan.android.mrn.utils.event.e
        public final /* synthetic */ void b(String str, Object obj, Object obj2) {
            b bVar = (b) obj;
            d dVar = (d) obj2;
            Object[] objArr = {str, bVar, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb409ddd833df94971230c1316e8b82", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb409ddd833df94971230c1316e8b82");
            } else {
                bVar.a(dVar);
            }
        }

        @Override // com.meituan.android.mrn.event.b, com.meituan.android.mrn.utils.event.d
        public final boolean a(String str, Object obj, Object obj2) {
            Object[] objArr = {str, obj, obj2};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f427a4dccc3b68ba31fd50e4bcaf4d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f427a4dccc3b68ba31fd50e4bcaf4d")).booleanValue() : this.b.contains(obj.getClass().getCanonicalName());
        }
    };
    public static final c<a> d = new c<a>() { // from class: com.meituan.android.mrn.event.listeners.b.2
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.utils.event.e
        public final /* synthetic */ void b(String str, Object obj, Object obj2) {
            b bVar = (b) obj;
            a aVar = (a) obj2;
            Object[] objArr = {str, bVar, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0211b8c2ebf8322e376a7ea924220b1b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0211b8c2ebf8322e376a7ea924220b1b");
            } else {
                bVar.a(aVar);
            }
        }
    };
    public static final c<e> e = new c<e>() { // from class: com.meituan.android.mrn.event.listeners.b.3
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.utils.event.e
        public final /* synthetic */ void b(String str, Object obj, Object obj2) {
            b bVar = (b) obj;
            e eVar = (e) obj2;
            Object[] objArr = {str, bVar, eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "999f07254aae7f3d87248d7bc15122d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "999f07254aae7f3d87248d7bc15122d6");
            } else {
                bVar.a(eVar);
            }
        }
    };
    public static final c<f> f = new c<f>() { // from class: com.meituan.android.mrn.event.listeners.b.4
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.utils.event.e
        public final /* synthetic */ void b(String str, Object obj, Object obj2) {
            b bVar = (b) obj;
            f fVar = (f) obj2;
            Object[] objArr = {str, bVar, fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b18a2aea897c371d4ebc991daa57df29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b18a2aea897c371d4ebc991daa57df29");
            } else {
                bVar.a(fVar);
            }
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends C0287b {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class c<O> extends com.meituan.android.mrn.event.b<b, O> {
        @Override // com.meituan.android.mrn.utils.event.e
        public final String a() {
            return "MRNContainerListener";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class d extends C0287b {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class e extends C0287b {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class f extends C0287b {
    }

    void a(a aVar);

    void a(d dVar);

    void a(e eVar);

    void a(f fVar);

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mrn.event.listeners.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0287b extends com.meituan.android.mrn.event.d {
        public static ChangeQuickRedirect h;
        protected WeakReference<Activity> i;

        public final C0287b a(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = h;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3410c23cf0634613ae9f5c1174dc9df", RobustBitConfig.DEFAULT_VALUE)) {
                return (C0287b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3410c23cf0634613ae9f5c1174dc9df");
            }
            this.i = new WeakReference<>(activity);
            return this;
        }

        public final Activity e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = h;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07d72a184e1011a8399bed5c89ab19f2", RobustBitConfig.DEFAULT_VALUE)) {
                return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07d72a184e1011a8399bed5c89ab19f2");
            }
            if (this.i == null) {
                return null;
            }
            return this.i.get();
        }
    }
}
