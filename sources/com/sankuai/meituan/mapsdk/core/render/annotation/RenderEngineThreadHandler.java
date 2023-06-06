package com.sankuai.meituan.mapsdk.core.render.annotation;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.core.render.a;
import com.sankuai.meituan.mapsdk.core.render.b;
import com.sankuai.meituan.mapsdk.mapcore.utils.c;
import com.sankuai.meituan.mapsdk.mapcore.utils.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RenderEngineThreadHandler implements InvocationHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final HashMap<String, Method> methodMap;
    private final b renderEngine;

    public static a getRenderEngine(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "309e82d2d54fbbbe884d4b549c5ead2b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "309e82d2d54fbbbe884d4b549c5ead2b");
        }
        Class<?> cls = bVar.getClass();
        Method[] methods = cls.getMethods();
        RenderEngineThreadHandler renderEngineThreadHandler = new RenderEngineThreadHandler(bVar);
        for (Method method : methods) {
            for (Annotation annotation : method.getAnnotations()) {
                if (annotation instanceof RunInUIThread) {
                    renderEngineThreadHandler.addMethod(method.getName(), method);
                }
            }
        }
        return (a) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{a.class}, renderEngineThreadHandler);
    }

    public RenderEngineThreadHandler(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b016004f78db3fe58d67b988a144e497", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b016004f78db3fe58d67b988a144e497");
            return;
        }
        this.methodMap = new HashMap<>();
        this.renderEngine = bVar;
    }

    public void addMethod(String str, Method method) {
        Object[] objArr = {str, method};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2adcddb3473328a477f0e1adec8c4578", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2adcddb3473328a477f0e1adec8c4578");
        } else {
            this.methodMap.put(str, method);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, final Method method, final Object[] objArr) throws Throwable {
        Object[] objArr2 = {obj, method, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2da22fcdfe5f1e4a28d29f1b72a8025", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2da22fcdfe5f1e4a28d29f1b72a8025");
        }
        if (this.renderEngine != null) {
            if (!f.a() && this.methodMap.containsKey(method.getName())) {
                c.f("current method(" + method.getName() + ") was called from Custom Thread! Should call from UI Thread!");
                if (method.getReturnType().equals(Void.TYPE)) {
                    f.a(new Runnable() { // from class: com.sankuai.meituan.mapsdk.core.render.annotation.RenderEngineThreadHandler.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // java.lang.Runnable
                        public void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2a6005b48d0bcaf97be402fda86bf4fd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2a6005b48d0bcaf97be402fda86bf4fd");
                                return;
                            }
                            try {
                                method.invoke(RenderEngineThreadHandler.this.renderEngine, objArr);
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    return null;
                }
                FutureTask futureTask = new FutureTask(new RenderEngineMethodCallable(this.renderEngine, method, objArr));
                f.a(futureTask);
                try {
                    return futureTask.get();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            return method.invoke(this.renderEngine, objArr);
        }
        return null;
    }
}
