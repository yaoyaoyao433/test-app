package com.dianping.eunomia.model.models;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class SingleClassLoader extends ClassLoader {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Class cl;
    private final String className;

    public SingleClassLoader(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fbd03320c8a9d50343d07b855659828", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fbd03320c8a9d50343d07b855659828");
            return;
        }
        this.cl = cls;
        this.className = cls.getName();
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) throws ClassNotFoundException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8a66c1600348c0b386a676ea4e831d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8a66c1600348c0b386a676ea4e831d9");
        }
        if (this.className.equals(str)) {
            return this.cl;
        }
        return super.loadClass(str);
    }
}
