package com.meituan.msi.api;

import android.support.annotation.RequiresApi;
import com.meituan.msi.annotations.MsiComponent;
import com.meituan.msi.bean.MsiComponentInfo;
import com.meituan.msi.component.IMsiComponent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a = null;
    public static Map<String, MsiComponentInfo> b = new ConcurrentHashMap();
    public static Map<String, MsiComponentInfo> c = new ConcurrentHashMap();
    private static volatile boolean d = false;

    @RequiresApi(api = 19)
    public static synchronized IMsiComponent a(String str) {
        IMsiComponent iMsiComponent;
        synchronized (f.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19fb46205a00d5da8abb3a09d935fc38", RobustBitConfig.DEFAULT_VALUE)) {
                return (IMsiComponent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19fb46205a00d5da8abb3a09d935fc38");
            }
            b();
            if (b.containsKey(str)) {
                MsiComponentInfo msiComponentInfo = b.get(str);
                if (msiComponentInfo == null) {
                    return null;
                }
                try {
                    iMsiComponent = (IMsiComponent) Class.forName(msiComponentInfo.viewClassName).newInstance();
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                    e.printStackTrace();
                    iMsiComponent = null;
                }
                return iMsiComponent;
            }
            return null;
        }
    }

    public static synchronized Class<?> b(String str) {
        synchronized (f.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e044a9a6789b9752f614a2284aae1ee8", RobustBitConfig.DEFAULT_VALUE)) {
                return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e044a9a6789b9752f614a2284aae1ee8");
            }
            if (!d) {
                b();
            }
            if (b.containsKey(str)) {
                MsiComponentInfo msiComponentInfo = b.get(str);
                if (msiComponentInfo == null) {
                    return null;
                }
                if (msiComponentInfo.invokeParamType != null && msiComponentInfo.invokeParamType != Void.class) {
                    return msiComponentInfo.invokeParamType;
                }
                return msiComponentInfo.propertyType;
            }
            return null;
        }
    }

    public static synchronized Class<?> a(IMsiComponent iMsiComponent) {
        synchronized (f.class) {
            Object[] objArr = {iMsiComponent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cfd55e0cf5ddaf24d1e72f063ac977e", RobustBitConfig.DEFAULT_VALUE)) {
                return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cfd55e0cf5ddaf24d1e72f063ac977e");
            } else if (iMsiComponent == null) {
                return null;
            } else {
                if (!d) {
                    b();
                }
                String name = iMsiComponent.getClass().getName();
                if (c.containsKey(name)) {
                    MsiComponentInfo msiComponentInfo = c.get(name);
                    if (msiComponentInfo == null) {
                        return null;
                    }
                    if (msiComponentInfo.invokeParamType != null && msiComponentInfo.invokeParamType != Void.class) {
                        return msiComponentInfo.invokeParamType;
                    }
                    return msiComponentInfo.propertyType;
                }
                return null;
            }
        }
    }

    private static synchronized void b() {
        Field[] declaredFields;
        synchronized (f.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a05ad87bb0004b8b3768fcb0d5884fc1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a05ad87bb0004b8b3768fcb0d5884fc1");
            } else if (!d) {
                if (!com.sankuai.meituan.serviceloader.b.a()) {
                    com.sankuai.meituan.serviceloader.b.a(com.meituan.msi.a.f(), new b.a() { // from class: com.meituan.msi.api.f.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.serviceloader.b.a
                        public final void a(Throwable th) {
                            Object[] objArr2 = {th};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e365939ce8495c876a8bc34f3319ed7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e365939ce8495c876a8bc34f3319ed7");
                            } else {
                                com.meituan.msi.log.a.a("init  ServiceLoader fail ");
                            }
                        }
                    });
                }
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dca6a095919e66487281a1e4188e0a76", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dca6a095919e66487281a1e4188e0a76");
                } else {
                    Map<String, String> map = com.sankuai.meituan.serviceloader.b.b().get(IMsiComponent.class.getName());
                    if (map != null && map.size() != 0) {
                        for (String str : map.values()) {
                            try {
                                MsiComponent msiComponent = (MsiComponent) Class.forName(str).getAnnotation(MsiComponent.class);
                                if (msiComponent != null) {
                                    MsiComponentInfo msiComponentInfo = new MsiComponentInfo();
                                    msiComponentInfo.componentName = msiComponent.name();
                                    msiComponentInfo.invokeParamType = msiComponent.invokeParamType();
                                    msiComponentInfo.viewClassName = str;
                                    msiComponentInfo.propertyType = msiComponent.property();
                                    msiComponentInfo.paramList = new ArrayList();
                                    for (Field field : msiComponent.property().getDeclaredFields()) {
                                        MsiComponentInfo.Param param = new MsiComponentInfo.Param();
                                        param.paramName = field.getName();
                                        param.paramType = field.getType();
                                        msiComponentInfo.paramList.add(param);
                                    }
                                    b.put(msiComponent.name(), msiComponentInfo);
                                    c.put(str, msiComponentInfo);
                                }
                            } catch (ClassNotFoundException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    com.meituan.msi.log.a.a("IMsiComponent  is empty");
                }
                d = true;
            }
        }
    }

    public static synchronized JSONObject a() {
        synchronized (f.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db29eb195f03f5fd438dab954a644291", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db29eb195f03f5fd438dab954a644291");
            }
            b();
            return c();
        }
    }

    private static JSONObject c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5c0d78612df8befe9e6d7e51e3b3f8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5c0d78612df8befe9e6d7e51e3b3f8d");
        }
        JSONObject jSONObject = new JSONObject();
        if (b == null) {
            return jSONObject;
        }
        for (Map.Entry<String, MsiComponentInfo> entry : b.entrySet()) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                String key = entry.getKey();
                MsiComponentInfo value = entry.getValue();
                JSONObject jSONObject3 = new JSONObject();
                if (value != null && value.paramList != null && value.paramList.size() > 0) {
                    for (MsiComponentInfo.Param param : value.paramList) {
                        if (param != null && param.paramType != null) {
                            jSONObject3.put(param.paramName, param.paramType.getSimpleName());
                        }
                    }
                }
                jSONObject2.put("NativeProps", jSONObject3);
                jSONObject.put(key, jSONObject2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        new StringBuilder("the components info: ").append(jSONObject.toString());
        return jSONObject;
    }
}
