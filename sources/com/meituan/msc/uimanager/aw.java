package com.meituan.msc.uimanager;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.msc.jse.bridge.ColorPropConverter;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.DynamicFromObject;
import com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.uimanager.annotations.ReactPropGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class aw {
    public static ChangeQuickRedirect a;
    private static final Map<Class, Map<String, k>> b = new ConcurrentHashMap();
    private static final Map<String, k> c = new HashMap();

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "15a9011d781726e4b49daa34a542e387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "15a9011d781726e4b49daa34a542e387");
            return;
        }
        b.clear();
        c.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class k {
        public static ChangeQuickRedirect b;
        protected final String c;
        protected final String d;
        protected final Method e;
        @Nullable
        protected final Integer f;

        @Nullable
        public abstract Object a(Object obj, Context context);

        private k(ReactProp reactProp, String str, Method method) {
            Object[] objArr = {reactProp, str, method};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47615c978541140aa7cba06bd9c52037", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47615c978541140aa7cba06bd9c52037");
                return;
            }
            this.c = reactProp.name();
            this.d = "__default_type__".equals(reactProp.customType()) ? str : reactProp.customType();
            this.e = method;
            this.f = null;
        }

        private k(ReactPropGroup reactPropGroup, String str, Method method, int i) {
            Object[] objArr = {reactPropGroup, str, method, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c45b9c6bd660476edd5a3e4d2933f63", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c45b9c6bd660476edd5a3e4d2933f63");
                return;
            }
            this.c = reactPropGroup.names()[i];
            this.d = "__default_type__".equals(reactPropGroup.customType()) ? str : reactPropGroup.customType();
            this.e = method;
            this.f = Integer.valueOf(i);
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final void a(as asVar, View view, Object obj) {
            Object[] objArr = {asVar, view, obj};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "115c58b0db864347c166f04c925c8aaf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "115c58b0db864347c166f04c925c8aaf");
                return;
            }
            try {
                if (this.f == null) {
                    this.e.invoke(asVar, view, a(obj, view.getContext()));
                } else {
                    this.e.invoke(asVar, view, this.f, a(obj, view.getContext()));
                }
            } catch (Throwable th) {
                String simpleName = as.class.getSimpleName();
                com.meituan.msc.modules.reporter.g.b(simpleName, th, "Error while updating prop " + this.c);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.c + "' of a view managed by: " + asVar.a(), th);
            }
        }

        public final void a(aa aaVar, Object obj) {
            Object[] objArr = {aaVar, obj};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "800e4a755bb849b3b62d4b0fef1d8355", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "800e4a755bb849b3b62d4b0fef1d8355");
                return;
            }
            try {
                if (this.f == null) {
                    this.e.invoke(aaVar, a(obj, aaVar.t()));
                } else {
                    this.e.invoke(aaVar, this.f, a(obj, aaVar.t()));
                }
            } catch (Throwable th) {
                String simpleName = as.class.getSimpleName();
                com.meituan.msc.modules.reporter.g.b(simpleName, th, "Error while updating prop " + this.c);
                throw new JSApplicationIllegalArgumentException("Error while updating property '" + this.c + "' in shadow node of type: " + aaVar.i(), th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class g extends k {
        public static ChangeQuickRedirect a;

        public g(ReactProp reactProp, Method method) {
            super(reactProp, "mixed", method);
            Object[] objArr = {reactProp, method};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53aa5bbcf6d1a5a149c66f460b8c4f4a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53aa5bbcf6d1a5a149c66f460b8c4f4a");
            }
        }

        public g(ReactPropGroup reactPropGroup, Method method, int i) {
            super(reactPropGroup, "mixed", method, i);
            Object[] objArr = {reactPropGroup, method, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7022ff2283a11af996a84f61f02284f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7022ff2283a11af996a84f61f02284f");
            }
        }

        @Override // com.meituan.msc.uimanager.aw.k
        public final Object a(Object obj, Context context) {
            Object[] objArr = {obj, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d656c1ef744a7f22bc33a488762d04f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d656c1ef744a7f22bc33a488762d04f") : obj instanceof Dynamic ? obj : new DynamicFromObject(obj);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class i extends k {
        public static ChangeQuickRedirect a;
        private final int g;

        public i(ReactProp reactProp, Method method, int i) {
            super(reactProp, "number", method);
            Object[] objArr = {reactProp, method, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "956735e94e0b9ed7974d79edc5c1d3da", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "956735e94e0b9ed7974d79edc5c1d3da");
            } else {
                this.g = i;
            }
        }

        public i(ReactPropGroup reactPropGroup, Method method, int i, int i2) {
            super(reactPropGroup, "number", method, i);
            Object[] objArr = {reactPropGroup, method, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8770dc2ec528bdeff18d8ae31c4eddc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8770dc2ec528bdeff18d8ae31c4eddc");
            } else {
                this.g = i2;
            }
        }

        @Override // com.meituan.msc.uimanager.aw.k
        public final Object a(Object obj, Context context) {
            Object[] objArr = {obj, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b33277249ed866cd9356437898383a6", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b33277249ed866cd9356437898383a6");
            }
            return Integer.valueOf(obj == null ? this.g : ((Double) obj).intValue());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class f extends k {
        public static ChangeQuickRedirect a;
        private final double g;

        public f(ReactProp reactProp, Method method, double d) {
            super(reactProp, "number", method);
            Object[] objArr = {reactProp, method, Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f3e83981115e5b5fa17e8d9bcc10dd8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f3e83981115e5b5fa17e8d9bcc10dd8");
            } else {
                this.g = d;
            }
        }

        public f(ReactPropGroup reactPropGroup, Method method, int i, double d) {
            super(reactPropGroup, "number", method, i);
            Object[] objArr = {reactPropGroup, method, Integer.valueOf(i), Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "696f359cdf1e7228e1708854344e5e52", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "696f359cdf1e7228e1708854344e5e52");
            } else {
                this.g = d;
            }
        }

        @Override // com.meituan.msc.uimanager.aw.k
        public final Object a(Object obj, Context context) {
            Object[] objArr = {obj, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cae562f539ac7524bd9779820e723c24", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cae562f539ac7524bd9779820e723c24");
            }
            return Double.valueOf(obj == null ? this.g : ((Double) obj).doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class e extends k {
        public static ChangeQuickRedirect a;
        private final int g;

        public e(ReactProp reactProp, Method method, int i) {
            super(reactProp, "mixed", method);
            Object[] objArr = {reactProp, method, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a02c4c9402b51587c16db04d39776d92", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a02c4c9402b51587c16db04d39776d92");
            } else {
                this.g = i;
            }
        }

        @Override // com.meituan.msc.uimanager.aw.k
        public final Object a(Object obj, Context context) {
            Object[] objArr = {obj, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecc0be9e62ab7f260c203a21377315a6", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecc0be9e62ab7f260c203a21377315a6");
            }
            if (obj == null) {
                return Integer.valueOf(this.g);
            }
            return ColorPropConverter.getColor(obj, context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b extends k {
        public static ChangeQuickRedirect a;
        private final boolean g;

        public b(ReactProp reactProp, Method method, boolean z) {
            super(reactProp, Constants.BOOLEAN, method);
            Object[] objArr = {reactProp, method, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48724a553b403a95fec794fc57d6c763", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48724a553b403a95fec794fc57d6c763");
            } else {
                this.g = z;
            }
        }

        @Override // com.meituan.msc.uimanager.aw.k
        public final Object a(Object obj, Context context) {
            Object[] objArr = {obj, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b579b9537e2938b6b2abdb1429254b56", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b579b9537e2938b6b2abdb1429254b56");
            }
            return obj == null ? this.g : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class h extends k {
        public static ChangeQuickRedirect a;
        private final float g;

        public h(ReactProp reactProp, Method method, float f) {
            super(reactProp, "number", method);
            Object[] objArr = {reactProp, method, Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2a5f2a246c7c65e3c2559340df037d4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2a5f2a246c7c65e3c2559340df037d4");
            } else {
                this.g = f;
            }
        }

        public h(ReactPropGroup reactPropGroup, Method method, int i, float f) {
            super(reactPropGroup, "number", method, i);
            Object[] objArr = {reactPropGroup, method, Integer.valueOf(i), Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbeae4d3d8bc7833b49cfc56b338f44e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbeae4d3d8bc7833b49cfc56b338f44e");
            } else {
                this.g = f;
            }
        }

        @Override // com.meituan.msc.uimanager.aw.k
        public final Object a(Object obj, Context context) {
            Object[] objArr = {obj, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea8bfa481c9e979bc3c138ee7cab49ae", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea8bfa481c9e979bc3c138ee7cab49ae");
            }
            return Float.valueOf(obj == null ? this.g : ((Double) obj).floatValue());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends k {
        public static ChangeQuickRedirect a;

        public a(ReactProp reactProp, Method method) {
            super(reactProp, "Array", method);
            Object[] objArr = {reactProp, method};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "915776b91f7f25e9149c4e48cdf33130", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "915776b91f7f25e9149c4e48cdf33130");
            }
        }

        @Override // com.meituan.msc.uimanager.aw.k
        @Nullable
        public final Object a(Object obj, Context context) {
            return (ReadableArray) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class j extends k {
        public static ChangeQuickRedirect a;

        public j(ReactProp reactProp, Method method) {
            super(reactProp, "Map", method);
            Object[] objArr = {reactProp, method};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5644958ebd7ea2f997d0fc79503d173a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5644958ebd7ea2f997d0fc79503d173a");
            }
        }

        @Override // com.meituan.msc.uimanager.aw.k
        @Nullable
        public final Object a(Object obj, Context context) {
            return (ReadableMap) obj;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class l extends k {
        public static ChangeQuickRedirect a;

        public l(ReactProp reactProp, Method method) {
            super(reactProp, "String", method);
            Object[] objArr = {reactProp, method};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "831680d09052811111c9ed8616210eea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "831680d09052811111c9ed8616210eea");
            }
        }

        @Override // com.meituan.msc.uimanager.aw.k
        @Nullable
        public final Object a(Object obj, Context context) {
            return (String) obj;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c extends k {
        public static ChangeQuickRedirect a;

        public c(ReactProp reactProp, Method method) {
            super(reactProp, Constants.BOOLEAN, method);
            Object[] objArr = {reactProp, method};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1208fcd887b9ac6222daba5bc9f899b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1208fcd887b9ac6222daba5bc9f899b");
            }
        }

        @Override // com.meituan.msc.uimanager.aw.k
        @Nullable
        public final Object a(Object obj, Context context) {
            Object[] objArr = {obj, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7258e72fe9a99fb18246b1183ef7a75", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7258e72fe9a99fb18246b1183ef7a75");
            }
            if (obj != null) {
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class d extends k {
        public static ChangeQuickRedirect a;

        public d(ReactProp reactProp, Method method) {
            super(reactProp, "number", method);
            Object[] objArr = {reactProp, method};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6a2708ebd9b39b45c616c32f6789cd1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6a2708ebd9b39b45c616c32f6789cd1");
            }
        }

        public d(ReactPropGroup reactPropGroup, Method method, int i) {
            super(reactPropGroup, "number", method, i);
            Object[] objArr = {reactPropGroup, method, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c2e4618cf4c83f0243fcb425456fbcd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c2e4618cf4c83f0243fcb425456fbcd");
            }
        }

        @Override // com.meituan.msc.uimanager.aw.k
        @Nullable
        public final Object a(Object obj, Context context) {
            Object[] objArr = {obj, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90bf2300de4f2f4a0cf07c8af22e6a12", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90bf2300de4f2f4a0cf07c8af22e6a12");
            }
            if (obj != null) {
                if (obj instanceof Double) {
                    return Integer.valueOf(((Double) obj).intValue());
                }
                return (Integer) obj;
            }
            return null;
        }
    }

    public static Map<String, k> a(Class<? extends as> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dceaf995059abf342b10bba3a1a21098", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dceaf995059abf342b10bba3a1a21098");
        }
        if (cls == as.class) {
            return c;
        }
        Map<String, k> map = b.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(a(cls.getSuperclass()));
        a(cls, hashMap);
        b.put(cls, hashMap);
        return hashMap;
    }

    public static Map<String, k> b(Class<? extends aa> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96924b132e502314cc8ffed6d6ab5cf6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96924b132e502314cc8ffed6d6ab5cf6");
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == aa.class) {
                return c;
            }
        }
        Map<String, k> map = b.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(b(cls.getSuperclass()));
        b(cls, hashMap);
        b.put(cls, hashMap);
        return hashMap;
    }

    private static k a(ReactProp reactProp, Method method, Class<?> cls) {
        Object[] objArr = {reactProp, method, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f05105085fde846a1669d6953ba43c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f05105085fde846a1669d6953ba43c6");
        }
        if (cls == Dynamic.class) {
            return new g(reactProp, method);
        }
        if (cls == Boolean.TYPE) {
            return new b(reactProp, method, reactProp.defaultBoolean());
        }
        if (cls == Integer.TYPE) {
            if ("Color".equals(reactProp.customType())) {
                return new e(reactProp, method, reactProp.defaultInt());
            }
            return new i(reactProp, method, reactProp.defaultInt());
        } else if (cls == Float.TYPE) {
            return new h(reactProp, method, reactProp.defaultFloat());
        } else {
            if (cls == Double.TYPE) {
                return new f(reactProp, method, reactProp.defaultDouble());
            }
            if (cls == String.class) {
                return new l(reactProp, method);
            }
            if (cls == Boolean.class) {
                return new c(reactProp, method);
            }
            if (cls == Integer.class) {
                if ("Color".equals(reactProp.customType())) {
                    return new e(reactProp, method, reactProp.defaultInt());
                }
                return new d(reactProp, method);
            } else if (cls == ReadableArray.class) {
                return new a(reactProp, method);
            } else {
                if (cls == ReadableMap.class) {
                    return new j(reactProp, method);
                }
                throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
            }
        }
    }

    private static void a(ReactPropGroup reactPropGroup, Method method, Class<?> cls, Map<String, k> map) {
        int i2 = 0;
        Object[] objArr = {reactPropGroup, method, cls, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70d071406be7dbfa651a2cf7ebc4f944", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70d071406be7dbfa651a2cf7ebc4f944");
            return;
        }
        String[] names = reactPropGroup.names();
        if (cls == Dynamic.class) {
            while (i2 < names.length) {
                map.put(names[i2], new g(reactPropGroup, method, i2));
                i2++;
            }
        } else if (cls == Integer.TYPE) {
            while (i2 < names.length) {
                map.put(names[i2], new i(reactPropGroup, method, i2, reactPropGroup.defaultInt()));
                i2++;
            }
        } else if (cls == Float.TYPE) {
            while (i2 < names.length) {
                map.put(names[i2], new h(reactPropGroup, method, i2, reactPropGroup.defaultFloat()));
                i2++;
            }
        } else if (cls == Double.TYPE) {
            while (i2 < names.length) {
                map.put(names[i2], new f(reactPropGroup, method, i2, reactPropGroup.defaultDouble()));
                i2++;
            }
        } else if (cls == Integer.class) {
            while (i2 < names.length) {
                map.put(names[i2], new d(reactPropGroup, method, i2));
                i2++;
            }
        } else {
            throw new RuntimeException("Unrecognized type: " + cls + " for method: " + method.getDeclaringClass().getName() + "#" + method.getName());
        }
    }

    private static void a(Class<? extends as> cls, Map<String, k> map) {
        Method[] declaredMethods;
        Object[] objArr = {cls, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77397aaf5e0405bfe8314bea28b3e36a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77397aaf5e0405bfe8314bea28b3e36a");
            return;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactProp reactProp = (ReactProp) method.getAnnotation(ReactProp.class);
            if (reactProp != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                } else if (!View.class.isAssignableFrom(parameterTypes[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                } else {
                    map.put(reactProp.name(), a(reactProp, method, parameterTypes[1]));
                }
            }
            ReactPropGroup reactPropGroup = (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
            if (reactPropGroup != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw new RuntimeException("First param should be a view subclass to be updated: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[1] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                } else {
                    a(reactPropGroup, method, parameterTypes2[2], map);
                }
            }
        }
    }

    private static void b(Class<? extends aa> cls, Map<String, k> map) {
        Method[] declaredMethods;
        Object[] objArr = {cls, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aaad85a3b2e28907d7bd74bb8360b703", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aaad85a3b2e28907d7bd74bb8360b703");
            return;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactProp reactProp = (ReactProp) method.getAnnotation(ReactProp.class);
            if (reactProp != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new RuntimeException("Wrong number of args for prop setter: " + cls.getName() + "#" + method.getName());
                }
                map.put(reactProp.name(), a(reactProp, method, parameterTypes[0]));
            }
            ReactPropGroup reactPropGroup = (ReactPropGroup) method.getAnnotation(ReactPropGroup.class);
            if (reactPropGroup != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException("Wrong number of args for group prop setter: " + cls.getName() + "#" + method.getName());
                } else if (parameterTypes2[0] != Integer.TYPE) {
                    throw new RuntimeException("Second argument should be property index: " + cls.getName() + "#" + method.getName());
                } else {
                    a(reactPropGroup, method, parameterTypes2[1], map);
                }
            }
        }
    }
}
