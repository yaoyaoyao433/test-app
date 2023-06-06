package com.meituan.android.mrn.event;

import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g extends com.meituan.android.mrn.utils.event.a {
    public static ChangeQuickRedirect a;
    public static final g b = new g(2);

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        GLOBAL(null),
        CONTAINER(com.huawei.hms.opendevice.c.a),
        REACT_CONTEXT(r.o);
        
        public static ChangeQuickRedirect a;
        final String e;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3612b4faaccb0e3dafe59a21815ac9b0", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3612b4faaccb0e3dafe59a21815ac9b0") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4130d5cfb1882db7c6bfd49d77b1a88", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4130d5cfb1882db7c6bfd49d77b1a88") : (a[]) values().clone();
        }

        a(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99e881c65afc4c38b76e0be1e3ab7b9b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99e881c65afc4c38b76e0be1e3ab7b9b");
            } else {
                this.e = str;
            }
        }
    }

    public static String a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebcba66b6cdc4b17aeeec77eb1800190", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebcba66b6cdc4b17aeeec77eb1800190") : a(a.CONTAINER, String.valueOf(i), str);
    }

    private static String a(ReactContext reactContext, String str) {
        Object[] objArr = {reactContext, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "501fb04f1ccb81aa6d6dee0dd5b398c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "501fb04f1ccb81aa6d6dee0dd5b398c3");
        }
        if (reactContext == null) {
            return null;
        }
        return a(a.REACT_CONTEXT, String.valueOf(reactContext.hashCode()), str);
    }

    private static String a(a aVar, String str, String str2) {
        Object[] objArr = {aVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59ad18e6dc8e3f48941242cbfc018c96", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59ad18e6dc8e3f48941242cbfc018c96");
        }
        if (aVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        String str3 = aVar.e;
        return str3 == null ? str2 : String.format("%s#%s#%s", str3, str, str2);
    }

    private g(int i) {
        super(2, true, true);
        Object[] objArr = {2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cb418b411be12d707c2d60af642a20c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cb418b411be12d707c2d60af642a20c");
        }
    }

    @Override // com.meituan.android.mrn.utils.event.a
    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5928c2e5eca6055e702235b7e1e08b14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5928c2e5eca6055e702235b7e1e08b14");
        } else {
            a().execute(runnable);
        }
    }

    public final ExecutorService a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1567175e6742afc59b8077fb485044b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1567175e6742afc59b8077fb485044b6");
        }
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    this.e = com.sankuai.android.jarvis.c.a("rn_event_emitter", this.f);
                }
            }
        }
        return this.e;
    }

    @Override // com.meituan.android.mrn.utils.event.a
    public final <L, O> void a(com.meituan.android.mrn.utils.event.e<L, O> eVar, O o) {
        Object[] objArr = {eVar, o};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f420d013fba174371e219f005966fef7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f420d013fba174371e219f005966fef7");
        } else if (eVar == null) {
        } else {
            if (o instanceof h) {
                h hVar = (h) o;
                int b2 = hVar.b();
                ReactContext a2 = hVar.a();
                a(a(b2, eVar.a()), (com.meituan.android.mrn.utils.event.e<L, com.meituan.android.mrn.utils.event.e<L, O>>) eVar, (com.meituan.android.mrn.utils.event.e<L, O>) o);
                if (a2 != null) {
                    a(a(a2, eVar.a()), (com.meituan.android.mrn.utils.event.e<L, com.meituan.android.mrn.utils.event.e<L, O>>) eVar, (com.meituan.android.mrn.utils.event.e<L, O>) o);
                }
                a((String) null, (com.meituan.android.mrn.utils.event.e<L, com.meituan.android.mrn.utils.event.e<L, O>>) eVar, (com.meituan.android.mrn.utils.event.e<L, O>) o);
                return;
            }
            a((String) null, (com.meituan.android.mrn.utils.event.e<L, com.meituan.android.mrn.utils.event.e<L, O>>) eVar, (com.meituan.android.mrn.utils.event.e<L, O>) o);
        }
    }
}
