package com.meituan.android.mrn.event;

import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c extends com.meituan.android.mrn.utils.event.a {
    public static ChangeQuickRedirect a;
    public static final c b = new c(2);
    private boolean i;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        GLOBAL(null),
        CONTAINER(com.huawei.hms.opendevice.c.a),
        REACT_CONTEXT(r.o),
        BUNDLE("b"),
        BIZ("z");
        
        public static ChangeQuickRedirect a;
        final String g;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf613ed5091d0f48eb0be165b149a173", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf613ed5091d0f48eb0be165b149a173") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a43befa720b8d1422f8e822424aed190", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a43befa720b8d1422f8e822424aed190") : (a[]) values().clone();
        }

        a(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a3ca9fd16f8b5849421cfbb389bf9d8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a3ca9fd16f8b5849421cfbb389bf9d8");
            } else {
                this.g = str;
            }
        }
    }

    public static String a(com.meituan.android.mrn.container.b bVar, String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d90984c7e1f96d3523fef4e57ed8c5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d90984c7e1f96d3523fef4e57ed8c5c");
        }
        if (bVar == null) {
            return null;
        }
        return a(a.CONTAINER, String.valueOf(bVar.hashCode()), str);
    }

    public static String a(ReactContext reactContext, String str) {
        Object[] objArr = {reactContext, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "48d8fb4422e3b3d52cd94180ef8b9521", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "48d8fb4422e3b3d52cd94180ef8b9521");
        }
        if (reactContext == null) {
            return null;
        }
        return a(a.REACT_CONTEXT, String.valueOf(reactContext.hashCode()), str);
    }

    private static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c07dd591d31aec8ed21e6f58136c4fb3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c07dd591d31aec8ed21e6f58136c4fb3") : a(a.BUNDLE, str, str2);
    }

    private static String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a13b8af609e70efb060301c1c3bcd3d9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a13b8af609e70efb060301c1c3bcd3d9") : a(a.BIZ, str, str2);
    }

    private static String a(a aVar, String str, String str2) {
        Object[] objArr = {aVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "69960b0e4a17bfb1fff212e708e324ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "69960b0e4a17bfb1fff212e708e324ed");
        }
        if (aVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        String str3 = aVar.g;
        return str3 == null ? str2 : String.format("%s#%s#%s", str3, str, str2);
    }

    private c(int i) {
        super(2, true, true);
        Object[] objArr = {2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "687ae75daf1fe6d9690b951066e5102f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "687ae75daf1fe6d9690b951066e5102f");
        } else {
            this.i = false;
        }
    }

    @Override // com.meituan.android.mrn.utils.event.a
    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e16a533bdfb02675aa32aed11016784d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e16a533bdfb02675aa32aed11016784d");
        } else {
            g.b.a().execute(runnable);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e21263595b76f15c0ea2c698e60b667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e21263595b76f15c0ea2c698e60b667");
        } else if (!this.i && com.sankuai.meituan.serviceloader.b.a()) {
            synchronized (this) {
                if (this.i) {
                    return;
                }
                List<com.meituan.android.mrn.event.a> a2 = com.sankuai.meituan.serviceloader.b.a(com.meituan.android.mrn.event.a.class, (String) null);
                if (a2 != null && !a2.isEmpty()) {
                    for (com.meituan.android.mrn.event.a aVar : a2) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96adacd9c9723dc7e3c2e3dfb7a8ce8b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96adacd9c9723dc7e3c2e3dfb7a8ce8b");
                        } else if (aVar != null) {
                            Collection<com.meituan.android.mrn.utils.event.g> a3 = aVar.a();
                            if (a3 != null) {
                                for (com.meituan.android.mrn.utils.event.g gVar : a3) {
                                    a(gVar);
                                }
                            }
                            Map<String, Object> b2 = aVar.b();
                            if (b2 != null) {
                                for (Map.Entry<String, Object> entry : b2.entrySet()) {
                                    a(entry.getKey(), entry.getValue());
                                }
                            }
                        }
                    }
                }
                this.i = true;
            }
        }
    }

    @Override // com.meituan.android.mrn.utils.event.a
    public final <L, O> void a(com.meituan.android.mrn.utils.event.e<L, O> eVar, O o) {
        Object[] objArr = {eVar, o};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e69b33b1025f441975aa9955597897ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e69b33b1025f441975aa9955597897ff");
            return;
        }
        a();
        a((com.meituan.android.mrn.utils.event.e<L, com.meituan.android.mrn.utils.event.e<L, O>>) eVar, (com.meituan.android.mrn.utils.event.e<L, O>) o, false);
    }

    private <L, O> void a(com.meituan.android.mrn.utils.event.e<L, O> eVar, O o, boolean z) {
        Object[] objArr = {eVar, o, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cf8519f131ba7abcba4e0addcb467e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cf8519f131ba7abcba4e0addcb467e3");
        } else if (eVar == null) {
        } else {
            if (o instanceof d) {
                d dVar = (d) o;
                com.meituan.android.mrn.container.b a2 = dVar.a();
                String c = dVar.c();
                ReactContext b2 = dVar.b();
                com.meituan.android.mrn.router.d d = dVar.d();
                String str = d != null ? d.c : null;
                if (a2 != null) {
                    a(a(a2, eVar.a()), (com.meituan.android.mrn.utils.event.e<L, com.meituan.android.mrn.utils.event.e<L, O>>) eVar, (com.meituan.android.mrn.utils.event.e<L, O>) o);
                }
                if (c != null) {
                    a(a(c, eVar.a()), (com.meituan.android.mrn.utils.event.e<L, com.meituan.android.mrn.utils.event.e<L, O>>) eVar, (com.meituan.android.mrn.utils.event.e<L, O>) o);
                }
                if (b2 != null) {
                    a(a(b2, eVar.a()), (com.meituan.android.mrn.utils.event.e<L, com.meituan.android.mrn.utils.event.e<L, O>>) eVar, (com.meituan.android.mrn.utils.event.e<L, O>) o);
                }
                if (str != null) {
                    a(b(str, eVar.a()), (com.meituan.android.mrn.utils.event.e<L, com.meituan.android.mrn.utils.event.e<L, O>>) eVar, (com.meituan.android.mrn.utils.event.e<L, O>) o);
                }
                a((String) null, (com.meituan.android.mrn.utils.event.e<L, com.meituan.android.mrn.utils.event.e<L, O>>) eVar, (com.meituan.android.mrn.utils.event.e<L, O>) o);
                return;
            }
            a((String) null, (com.meituan.android.mrn.utils.event.e<L, com.meituan.android.mrn.utils.event.e<L, O>>) eVar, (com.meituan.android.mrn.utils.event.e<L, O>) o);
        }
    }
}
