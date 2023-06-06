package com.meituan.android.mrn.event.listeners;

import com.meituan.android.mrn.event.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface d {
    public static final c<a> a = new c<a>() { // from class: com.meituan.android.mrn.event.listeners.d.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.event.f, com.meituan.android.mrn.utils.event.d
        public final boolean a(String str, Object obj, Object obj2) {
            return true;
        }

        @Override // com.meituan.android.mrn.utils.event.e
        public final /* synthetic */ void b(String str, Object obj, Object obj2) {
            d dVar = (d) obj;
            a aVar = (a) obj2;
            Object[] objArr = {str, dVar, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b1652562617c187403aae7c728dec10", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b1652562617c187403aae7c728dec10");
            } else {
                dVar.a(aVar);
            }
        }
    };
    public static final c<C0289d> b = new c<C0289d>() { // from class: com.meituan.android.mrn.event.listeners.d.2
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.event.f, com.meituan.android.mrn.utils.event.d
        public final boolean a(String str, Object obj, Object obj2) {
            return true;
        }

        @Override // com.meituan.android.mrn.utils.event.e
        public final /* synthetic */ void b(String str, Object obj, Object obj2) {
            d dVar = (d) obj;
            C0289d c0289d = (C0289d) obj2;
            Object[] objArr = {str, dVar, c0289d};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66fe1e309ff6be71c0962303ef98b372", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66fe1e309ff6be71c0962303ef98b372");
            } else {
                dVar.a(c0289d);
            }
        }
    };
    public static final c<e> c = new c<e>() { // from class: com.meituan.android.mrn.event.listeners.d.3
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.event.f, com.meituan.android.mrn.utils.event.d
        public final boolean a(String str, Object obj, Object obj2) {
            return true;
        }

        @Override // com.meituan.android.mrn.utils.event.e
        public final /* synthetic */ void b(String str, Object obj, Object obj2) {
            d dVar = (d) obj;
            e eVar = (e) obj2;
            Object[] objArr = {str, dVar, eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "683d85dda4b0e7f5dbd7573a37728c08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "683d85dda4b0e7f5dbd7573a37728c08");
            } else {
                dVar.a(eVar);
            }
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends b {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b extends h {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class c<O> extends com.meituan.android.mrn.event.f<d, O> {
        @Override // com.meituan.android.mrn.utils.event.e
        public final String a() {
            return "RNContainerListener";
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mrn.event.listeners.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0289d extends b {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class e extends b {
    }

    void a(a aVar);

    void a(C0289d c0289d);

    void a(e eVar);
}
