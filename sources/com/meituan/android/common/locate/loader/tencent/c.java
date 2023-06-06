package com.meituan.android.common.locate.loader.tencent;

import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Class<?> a;
    private Object b;

    public c() {
        StringBuilder sb;
        String message;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f3bc2580fad363572b711ede2573bb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f3bc2580fad363572b711ede2573bb0");
            return;
        }
        try {
            this.a = Class.forName("com.tencent.map.geolocation.TencentLocationRequest");
            this.b = this.a.getMethod("create", new Class[0]).invoke(null, new Object[0]);
        } catch (ClassNotFoundException e) {
            sb = new StringBuilder();
            sb.append(c.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder();
            sb.append(c.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e2.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (NoSuchMethodException e3) {
            sb = new StringBuilder();
            sb.append(c.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e3.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (InvocationTargetException e4) {
            sb = new StringBuilder();
            sb.append(c.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e4.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (Exception e5) {
            sb = new StringBuilder();
            sb.append(c.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e5.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        }
    }

    public Object a() {
        return this.b;
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2853f2912135fd8bde0e6ca9aede718", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2853f2912135fd8bde0e6ca9aede718");
        } else if (this.b == null || this.a == null) {
            LogUtils.a("TencentLocationRequest not init");
        } else {
            try {
                this.a.getMethod("setRequestLevel", Integer.TYPE).invoke(this.b, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e.getMessage(), 3);
            } catch (NoSuchMethodException e2) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e2.getMessage(), 3);
            } catch (InvocationTargetException e3) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e3.getMessage(), 3);
            } catch (Exception e4) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e4.getMessage(), 3);
            }
        }
    }

    public void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24b33acf2dbc72e521cb3f00082110f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24b33acf2dbc72e521cb3f00082110f2");
        } else if (this.b == null || this.a == null) {
            LogUtils.a("TencentLocationRequest not init");
        } else {
            try {
                this.a.getMethod("setInterval", Long.TYPE).invoke(this.b, Long.valueOf(j));
            } catch (IllegalAccessException e) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e.getMessage(), 3);
            } catch (NoSuchMethodException e2) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e2.getMessage(), 3);
            } catch (InvocationTargetException e3) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e3.getMessage(), 3);
            } catch (Exception e4) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e4.getMessage(), 3);
            }
        }
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "669bd10284fdb52b038e9b61898c346b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "669bd10284fdb52b038e9b61898c346b");
        } else if (this.b == null || this.a == null) {
            LogUtils.a("TencentLocationRequest not init");
        } else {
            try {
                this.a.getMethod("setAllowGPS", Boolean.TYPE).invoke(this.b, Boolean.valueOf(z));
            } catch (IllegalAccessException e) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e.getMessage(), 3);
            } catch (NoSuchMethodException e2) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e2.getMessage(), 3);
            } catch (InvocationTargetException e3) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e3.getMessage(), 3);
            } catch (Exception e4) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e4.getMessage(), 3);
            }
        }
    }

    public void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54222ab9dac00507ef5a964815a71139", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54222ab9dac00507ef5a964815a71139");
        } else if (this.b == null || this.a == null) {
            LogUtils.a("TencentLocationRequest not init");
        } else {
            try {
                this.a.getMethod("setAllowDirection", Boolean.TYPE).invoke(this.b, Boolean.valueOf(z));
            } catch (IllegalAccessException e) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e.getMessage(), 3);
            } catch (NoSuchMethodException e2) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e2.getMessage(), 3);
            } catch (InvocationTargetException e3) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e3.getMessage(), 3);
            } catch (Exception e4) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e4.getMessage(), 3);
            }
        }
    }

    public void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a7b5a14ff292a2e0633499e551ab4a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a7b5a14ff292a2e0633499e551ab4a9");
        } else if (this.b == null || this.a == null) {
            LogUtils.a("TencentLocationRequest not init");
        } else {
            try {
                this.a.getMethod("setIndoorLocationMode", Boolean.TYPE).invoke(this.b, Boolean.valueOf(z));
            } catch (IllegalAccessException e) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e.getMessage(), 3);
            } catch (NoSuchMethodException e2) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e2.getMessage(), 3);
            } catch (InvocationTargetException e3) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e3.getMessage(), 3);
            } catch (Exception e4) {
                com.meituan.android.common.locate.platform.logs.c.a(c.class.getSimpleName() + CommonConstant.Symbol.COLON + e4.getMessage(), 3);
            }
        }
    }
}
