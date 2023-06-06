package com.sankuai.waimai.store.config;

import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.al;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect a;
    private Map<String, AtomicBoolean> b;

    public abstract T a(String str);

    public abstract void a(T t);

    public abstract String c();

    public abstract String d();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "373ae3df8155c715bb5d510acaa2016a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "373ae3df8155c715bb5d510acaa2016a");
        } else {
            this.b = new HashMap();
        }
    }

    public void a() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbdbd19233b52bc5f05223ca6ae05a80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbdbd19233b52bc5f05223ca6ae05a80");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d9bd9881c8ad038afa1dff13b375356", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d9bd9881c8ad038afa1dff13b375356");
        } else {
            str = d() + "_local";
        }
        final AtomicBoolean b = b(str);
        if (b.compareAndSet(false, true)) {
            al.a(new al.b<T>() { // from class: com.sankuai.waimai.store.config.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final T a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "08e6580bbe799673b274a7564ef6f604", RobustBitConfig.DEFAULT_VALUE)) {
                        return (T) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "08e6580bbe799673b274a7564ef6f604");
                    }
                    return (T) a.this.a(ab.b().b(com.sankuai.waimai.store.util.b.a(), a.this.c(), ""));
                }

                @Override // com.sankuai.waimai.store.util.al.b
                public final void a(T t) {
                    Object[] objArr3 = {t};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "12bd15cb0c997b55ada688e8001081b5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "12bd15cb0c997b55ada688e8001081b5");
                        return;
                    }
                    try {
                        a.this.a((a) t);
                    } finally {
                        b.set(false);
                    }
                }
            }, "localTag");
        }
    }

    private synchronized AtomicBoolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdb9bad9ac43514e96cca1a774f59050", RobustBitConfig.DEFAULT_VALUE)) {
            return (AtomicBoolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdb9bad9ac43514e96cca1a774f59050");
        }
        if (this.b.get(str) == null) {
            this.b.put(str, new AtomicBoolean(false));
        }
        return this.b.get(str);
    }

    public void b() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb97148524a398cf81fa4e83ccf2ffe0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb97148524a398cf81fa4e83ccf2ffe0");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d5626b8457efb8a1a2b109369945620", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d5626b8457efb8a1a2b109369945620");
        } else {
            str = d() + "_net";
        }
        final AtomicBoolean b = b(str);
        if (b.compareAndSet(false, true)) {
            Horn.register(d(), new HornCallback() { // from class: com.sankuai.waimai.store.config.a.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, final String str2) {
                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "144da1fb5b5770c4cedaa807fac7093a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "144da1fb5b5770c4cedaa807fac7093a");
                    } else if (z) {
                        final a aVar = a.this;
                        final AtomicBoolean atomicBoolean = b;
                        Object[] objArr4 = {str2, atomicBoolean};
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "2e99589996974c61e4c5befa77dea899", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "2e99589996974c61e4c5befa77dea899");
                        } else {
                            al.a(new al.b<T>() { // from class: com.sankuai.waimai.store.config.a.3
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.util.al.b
                                public final T a() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "08613f047cf36c6bc7359af19fd6a722", RobustBitConfig.DEFAULT_VALUE)) {
                                        return (T) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "08613f047cf36c6bc7359af19fd6a722");
                                    }
                                    String str3 = TextUtils.isEmpty(str2) ? "" : str2;
                                    ab.b().a(com.sankuai.waimai.store.util.b.a(), a.this.c(), str3);
                                    return (T) a.this.a(str3);
                                }

                                @Override // com.sankuai.waimai.store.util.al.b
                                public final void a(T t) {
                                    Object[] objArr5 = {t};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3766179f058156d87ea432394cdeabb9", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3766179f058156d87ea432394cdeabb9");
                                        return;
                                    }
                                    try {
                                        a.this.a((a) t);
                                    } finally {
                                        atomicBoolean.set(false);
                                    }
                                }
                            }, "netTag");
                        }
                    }
                }
            }, f.a());
        }
    }
}
