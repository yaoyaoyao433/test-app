package com.sankuai.meituan.mapsdk.core.render.annotation;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.render.b;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RenderEngineMethodCallable implements Callable<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Method method;
    public final Object[] objects;
    public final b renderEngine;

    public RenderEngineMethodCallable(b bVar, Method method, Object[] objArr) {
        Object[] objArr2 = {bVar, method, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67362e4cac304416b691a453c5214a14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67362e4cac304416b691a453c5214a14");
            return;
        }
        this.renderEngine = bVar;
        this.method = method;
        this.objects = objArr;
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1377bc63729e532948105594301ebf5e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1377bc63729e532948105594301ebf5e") : this.method.invoke(this.renderEngine, this.objects);
    }
}
