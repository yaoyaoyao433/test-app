package com.sankuai.waimai.machpro.module;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.utils.e;
import com.sankuai.waimai.machpro.f;
import com.sankuai.waimai.machpro.instance.MPContext;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public String b;
    public int c;
    private Method d;

    public c(Method method, String str, int i) {
        Object[] objArr = {method, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ac1e5df2faa894a05c4022c432406a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ac1e5df2faa894a05c4022c432406a4");
            return;
        }
        this.d = method;
        this.b = str;
        this.c = i;
    }

    public final Object a(MPContext mPContext, Object obj, Object[] objArr) {
        Object[] objArr2 = {mPContext, obj, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "e9a0686e3ab870963062987ba004fddc", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "e9a0686e3ab870963062987ba004fddc");
        }
        try {
            return this.d.invoke(obj, objArr);
        } catch (Exception e) {
            e = e;
            if (e instanceof InvocationTargetException) {
                e = ((InvocationTargetException) e).getTargetException();
            }
            if (mPContext != null && mPContext.getBundle() != null) {
                e.a(mPContext.getInstance().B, mPContext.getBundle().d, mPContext.getBundle().e, obj.getClass().getSimpleName() + " | " + this.b + " | " + e.getMessage(), e);
                if (f.a().i.i && mPContext.getInstance() != null && (e instanceof Exception)) {
                    mPContext.getInstance().a((Exception) e);
                }
            }
            StringBuilder sb = new StringBuilder();
            try {
                sb.append("NativeModule: ");
                sb.append(obj.getClass().getSimpleName());
                sb.append(" Method: ");
                sb.append(this.b);
                sb.append(" invoke failed! ");
                sb.append(e.getMessage());
                sb.append(" | 参数列表：");
                if (objArr == null) {
                    sb.append(StringUtil.NULL);
                } else {
                    sb.append("[");
                    int length = objArr.length;
                    for (int i = 0; i < length; i++) {
                        Object obj2 = objArr[i];
                        sb.append(obj2 == null ? StringUtil.NULL : obj2.toString());
                        sb.append(", ");
                    }
                    sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                }
            } catch (Exception unused) {
            }
            com.sankuai.waimai.machpro.util.a.a(sb.toString());
            return null;
        }
    }
}
