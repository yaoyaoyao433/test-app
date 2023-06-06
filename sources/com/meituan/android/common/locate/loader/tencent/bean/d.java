package com.meituan.android.common.locate.loader.tencent.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes2.dex */
public class d implements c {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Object a;

    public d(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd310a1d3a8da7562f8bb11cb7116a28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd310a1d3a8da7562f8bb11cb7116a28");
        } else {
            this.a = obj;
        }
    }

    private Object a(String str) {
        StringBuilder sb;
        String message;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d02dcfd053eba2faa6087e7c1368c9a0", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d02dcfd053eba2faa6087e7c1368c9a0");
        }
        try {
            return this.a.getClass().getDeclaredMethod(str, new Class[0]).invoke(this.a, new Object[0]);
        } catch (IllegalAccessException e) {
            sb = new StringBuilder();
            sb.append(d.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            return null;
        } catch (NoSuchMethodException e2) {
            sb = new StringBuilder();
            sb.append(d.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e2.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            return null;
        } catch (InvocationTargetException e3) {
            sb = new StringBuilder();
            sb.append(d.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e3.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            return null;
        } catch (Exception e4) {
            sb = new StringBuilder();
            sb.append(d.class.getSimpleName());
            sb.append(CommonConstant.Symbol.COLON);
            message = e4.getMessage();
            sb.append(message);
            com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
            return null;
        }
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.c
    public String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cbd72a82b5c12558962299d83e5dbd8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cbd72a82b5c12558962299d83e5dbd8");
        }
        Object a = a("getName");
        return a == null ? "" : (String) a;
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.c
    public double b() {
        Object a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a3718e4f83712db6a15761e789cb68b", RobustBitConfig.DEFAULT_VALUE)) {
            a = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a3718e4f83712db6a15761e789cb68b");
        } else {
            a = a("getDistance");
            if (a == null) {
                return 0.0d;
            }
        }
        return ((Double) a).doubleValue();
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.c
    public double c() {
        Object a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b1174c2786b577ff589ee9309c8d7f2", RobustBitConfig.DEFAULT_VALUE)) {
            a = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b1174c2786b577ff589ee9309c8d7f2");
        } else {
            a = a("getLatitude");
            if (a == null) {
                return 0.0d;
            }
        }
        return ((Double) a).doubleValue();
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.c
    public double d() {
        Object a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7060cd334753b3d018340aafc552dda", RobustBitConfig.DEFAULT_VALUE)) {
            a = PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7060cd334753b3d018340aafc552dda");
        } else {
            a = a("getLongitude");
            if (a == null) {
                return 0.0d;
            }
        }
        return ((Double) a).doubleValue();
    }

    @Override // com.meituan.android.common.locate.loader.tencent.bean.c
    public String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c8355f0b1f52b0af5d7942bcad5a252", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c8355f0b1f52b0af5d7942bcad5a252");
        }
        Object a = a("getUid");
        return a == null ? "" : (String) a;
    }
}
