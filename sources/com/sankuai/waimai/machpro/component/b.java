package com.sankuai.waimai.machpro.component;

import android.util.Log;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachArray;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b<T extends MPComponent<? extends View>> {
    public static ChangeQuickRedirect a;
    public Class<T> b;
    public Map<String, com.sankuai.waimai.machpro.module.c> c;
    private Constructor<T> d;
    private MachArray e;
    private String f;
    private boolean g;

    public b(String str, Class<T> cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45cc0c2aabb2e66a0161ef5c4b1b20c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45cc0c2aabb2e66a0161ef5c4b1b20c9");
            return;
        }
        this.f = str;
        this.b = cls;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3db0018281c7e80a1b2dec2610a9ca6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3db0018281c7e80a1b2dec2610a9ca6");
        } else if (this.g) {
        } else {
            this.g = true;
            try {
                this.d = this.b.getConstructor(MPContext.class);
                if (this.c == null) {
                    this.c = com.sankuai.waimai.machpro.util.b.a((Class) this.b);
                }
            } catch (Exception e) {
                com.sankuai.waimai.machpro.util.a.a("MPComponentFactory constructor parse failed:-->" + this.b.getSimpleName() + " ErrorMessage:-->" + e.getMessage());
            }
        }
    }

    public final MachArray a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e888ed47d62e14db7f3ba2eb5c68db7", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e888ed47d62e14db7f3ba2eb5c68db7");
        }
        b();
        if (this.e == null) {
            this.e = new MachArray();
            for (String str : this.c.keySet()) {
                MachMap machMap = new MachMap();
                machMap.put("uiTag", this.f);
                machMap.put("methodName", this.c.get(str).b);
                machMap.put("numberOfArguments", Integer.valueOf(this.c.get(str).c));
                this.e.add(machMap);
            }
        }
        return this.e;
    }

    public final T a(MPContext mPContext) {
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "170d154bb566824186bf3a1055b75e9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "170d154bb566824186bf3a1055b75e9a");
        }
        b();
        try {
            return this.d.newInstance(mPContext);
        } catch (Exception e) {
            e = e;
            if (e instanceof InvocationTargetException) {
                e = ((InvocationTargetException) e).getTargetException();
            }
            String str = "MPComponentFactory create instance failed:-->UITag : " + this.f + "-->" + this.b.getSimpleName() + " ErrorMessage:-->" + e.getMessage();
            if (mPContext != null && mPContext.getBundle() != null) {
                com.sankuai.waimai.mach.utils.e.a(mPContext.getInstance().B, mPContext.getBundle().d, mPContext.getBundle().e, str, e);
                if (com.sankuai.waimai.machpro.f.a().i.i && mPContext.getInstance() != null && (e instanceof Exception)) {
                    mPContext.getInstance().a((Exception) e);
                }
            }
            com.sankuai.waimai.machpro.util.a.a(str);
            com.sankuai.waimai.machpro.util.a.a(Log.getStackTraceString(e));
            return null;
        }
    }
}
