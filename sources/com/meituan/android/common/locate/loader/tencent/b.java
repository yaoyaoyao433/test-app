package com.meituan.android.common.locate.loader.tencent;

import android.content.Context;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class b {
    public static String a = "tencent";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static b e;
    private Class<?> b;
    private Object c;
    private Map<com.meituan.android.common.locate.loader.tencent.proxy.a, Object> d;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05f4236a3b95b49eb065e908d186f636", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05f4236a3b95b49eb065e908d186f636");
            return;
        }
        this.d = new ConcurrentHashMap();
        b(context);
    }

    public static b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "851b9d073758cdab81176a42c1c06c59", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "851b9d073758cdab81176a42c1c06c59");
        }
        if (e == null) {
            synchronized (b.class) {
                if (e == null) {
                    e = new b(context);
                }
            }
        }
        return e;
    }

    private void b(Context context) {
        StringBuilder sb;
        String message;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b261368469eb725e56ff3c4875e9afe0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b261368469eb725e56ff3c4875e9afe0");
        } else if (this.c != null || context == null || context.getApplicationInfo() == null) {
        } else {
            try {
                this.b = Class.forName("com.tencent.map.geolocation.TencentLocationManager");
                this.c = this.b.getMethod("getInstance", Context.class).invoke(null, context);
            } catch (ClassNotFoundException e2) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e2.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            } catch (IllegalAccessException e3) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e3.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            } catch (NoSuchMethodException e4) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e4.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            } catch (InvocationTargetException e5) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e5.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            } catch (Exception e6) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e6.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            }
        }
    }

    public int a(c cVar, com.meituan.android.common.locate.loader.tencent.proxy.a aVar, Looper looper) {
        StringBuilder sb;
        String message;
        Object[] objArr = {cVar, aVar, looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4ad6fefc7dc6b1a0bdec8a0e9bbe19d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4ad6fefc7dc6b1a0bdec8a0e9bbe19d")).intValue();
        }
        if (cVar != null && cVar.a() != null) {
            try {
                Class<?> cls = Class.forName("com.tencent.map.geolocation.TencentLocationListener");
                Object obj = this.d.get(aVar);
                if (obj == null) {
                    com.meituan.android.common.locate.loader.tencent.proxy.b bVar = new com.meituan.android.common.locate.loader.tencent.proxy.b();
                    bVar.a(aVar);
                    obj = Proxy.newProxyInstance(aVar.getClass().getClassLoader(), new Class[]{cls}, bVar);
                    this.d.put(aVar, obj);
                }
                return ((Integer) this.b.getMethod("requestLocationUpdates", Class.forName("com.tencent.map.geolocation.TencentLocationRequest"), cls, Looper.class).invoke(this.c, cVar.a(), obj, looper)).intValue();
            } catch (ClassNotFoundException e2) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e2.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
                return -1;
            } catch (IllegalAccessException e3) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e3.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
                return -1;
            } catch (NoSuchMethodException e4) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e4.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
                return -1;
            } catch (InvocationTargetException e5) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e5.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
                return -1;
            } catch (Exception e6) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e6.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
                return -1;
            }
        }
        return -1;
    }

    public void a(int i) {
        StringBuilder sb;
        String message;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "901390307234db6cdf54d412ac6515e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "901390307234db6cdf54d412ac6515e7");
        } else if (this.c == null) {
        } else {
            try {
                Method method = this.b.getMethod("setCoordinateType", new Class[0]);
                if (method == null) {
                    return;
                }
                method.invoke(this.c, Integer.valueOf(i));
            } catch (IllegalAccessException e2) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e2.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            } catch (NoSuchMethodException e3) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e3.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            } catch (InvocationTargetException e4) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e4.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            } catch (Exception e5) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e5.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            }
        }
    }

    public void a(com.meituan.android.common.locate.loader.tencent.proxy.a aVar) {
        StringBuilder sb;
        String message;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb09be0181ec9a3d4c7325f765a61222", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb09be0181ec9a3d4c7325f765a61222");
            return;
        }
        Object obj = this.d.get(aVar);
        if (obj == null) {
            return;
        }
        try {
            this.b.getMethod("removeUpdates", Class.forName("com.tencent.map.geolocation.TencentLocationListener")).invoke(this.c, obj);
            this.d.remove(aVar);
        } catch (ClassNotFoundException e2) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e2.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (IllegalAccessException e3) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e3.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (NoSuchMethodException e4) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e4.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (InvocationTargetException e5) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e5.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (Exception e6) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e6.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        }
    }

    public void a(boolean z) {
        StringBuilder sb;
        String message;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0888f2e82ab8a9ed4a336ea2a509f63f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0888f2e82ab8a9ed4a336ea2a509f63f");
            return;
        }
        try {
            Method method = this.b.getMethod("triggerCodeGuarder", Boolean.TYPE);
            if (method == null) {
                return;
            }
            method.invoke(this.c, Boolean.valueOf(z));
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e2.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (NoSuchMethodException e3) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e3.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (InvocationTargetException e4) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e4.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (Exception e5) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e5.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        }
    }

    public boolean a() {
        return this.c != null;
    }

    public int b(c cVar, com.meituan.android.common.locate.loader.tencent.proxy.a aVar, Looper looper) {
        StringBuilder sb;
        String message;
        Object[] objArr = {cVar, aVar, looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b85619be4792eb0c271234603e28b02", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b85619be4792eb0c271234603e28b02")).intValue();
        }
        if (cVar != null && cVar.a() != null) {
            try {
                Class<?> cls = Class.forName("com.tencent.map.geolocation.TencentLocationListener");
                com.meituan.android.common.locate.loader.tencent.proxy.b bVar = new com.meituan.android.common.locate.loader.tencent.proxy.b();
                Object newProxyInstance = Proxy.newProxyInstance(aVar.getClass().getClassLoader(), new Class[]{cls}, bVar);
                bVar.a(aVar);
                return ((Integer) this.b.getMethod("requestSingleFreshLocation", Class.forName("com.tencent.map.geolocation.TencentLocationRequest"), cls, Looper.class).invoke(this.c, cVar.a(), newProxyInstance, looper)).intValue();
            } catch (ClassNotFoundException e2) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e2.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
                return -1;
            } catch (IllegalAccessException e3) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e3.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
                return -1;
            } catch (NoSuchMethodException e4) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e4.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
                return -1;
            } catch (InvocationTargetException e5) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e5.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
                return -1;
            } catch (Exception e6) {
                sb = new StringBuilder();
                sb.append(b.class.getSimpleName());
                sb.append(CommonConstant.Symbol.COLON);
                message = e6.getMessage();
                sb.append(message);
                com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
                return -1;
            }
        }
        return -1;
    }

    public void b(boolean z) {
        StringBuilder sb;
        String message;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31e5e0c686f1022c57c0f64dc578f877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31e5e0c686f1022c57c0f64dc578f877");
            return;
        }
        try {
            this.b.getMethod("disableForegroundLocation", Boolean.TYPE).invoke(this.c, Boolean.valueOf(z));
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e2.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (NoSuchMethodException e3) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e3.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (InvocationTargetException e4) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e4.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (Exception e5) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e5.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        }
    }

    public void c(boolean z) {
        StringBuilder sb;
        String message;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61f14425a025842f6b39727b3fec831b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61f14425a025842f6b39727b3fec831b");
            return;
        }
        try {
            this.b.getMethod("setDebuggable", Boolean.TYPE).invoke(this.c, Boolean.valueOf(z));
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e2.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (NoSuchMethodException e3) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e3.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (InvocationTargetException e4) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e4.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        } catch (Exception e5) {
            sb = new StringBuilder();
            sb.append(b.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e5.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        }
    }
}
