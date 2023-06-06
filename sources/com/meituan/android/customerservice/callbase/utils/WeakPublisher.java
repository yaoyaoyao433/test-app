package com.meituan.android.customerservice.callbase.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WeakPublisher<T> implements Publisher<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<WeakReference<T>, WeakPublisher<T>.Methods> mMethods;
    private List<WeakReference<T>> mSubscribers;

    public WeakPublisher() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6d84d9eb090ef520eefc2b420015889", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6d84d9eb090ef520eefc2b420015889");
            return;
        }
        this.mSubscribers = new LinkedList();
        this.mMethods = new HashMap();
    }

    @Override // com.meituan.android.customerservice.callbase.utils.Publisher
    public void addSubscriber(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "936eca8b9eebbd7b062761536dcd0027", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "936eca8b9eebbd7b062761536dcd0027");
            return;
        }
        removeSubscriber(t);
        if (t != null) {
            synchronized (this.mSubscribers) {
                WeakPublisher<T>.Methods methods = new Methods(t.getClass());
                methods.initMethods();
                WeakReference<T> weakReference = new WeakReference<>(t);
                this.mSubscribers.add(weakReference);
                this.mMethods.put(weakReference, methods);
            }
        }
    }

    @Override // com.meituan.android.customerservice.callbase.utils.Publisher
    public void removeSubscriber(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de2ae25b25259f2858b8f810e57ba980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de2ae25b25259f2858b8f810e57ba980");
            return;
        }
        LinkedList linkedList = new LinkedList();
        synchronized (this.mSubscribers) {
            for (WeakReference<T> weakReference : this.mSubscribers) {
                if (weakReference.get() == null || weakReference.get() == t) {
                    linkedList.add(weakReference);
                    this.mMethods.remove(weakReference);
                }
            }
            if (linkedList.size() > 0) {
                this.mSubscribers.removeAll(linkedList);
            }
        }
    }

    @Override // com.meituan.android.customerservice.callbase.utils.Publisher
    public void notify(String str, Object obj) {
        int i = 0;
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f95cb21c402ba2e6008ffeeff050dac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f95cb21c402ba2e6008ffeeff050dac");
        } else if (!this.mMethods.isEmpty()) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            ArrayList arrayList = new ArrayList();
            synchronized (this.mSubscribers) {
                for (WeakReference<T> weakReference : this.mSubscribers) {
                    T t = weakReference.get();
                    if (t == null) {
                        linkedList.add(weakReference);
                        this.mMethods.remove(weakReference);
                    } else {
                        linkedList2.add(t);
                        arrayList.add(this.mMethods.get(weakReference));
                    }
                }
                if (linkedList.size() > 0) {
                    this.mSubscribers.removeAll(linkedList);
                }
            }
            if (linkedList2.size() > 0) {
                for (Object obj2 : linkedList2) {
                    int i2 = i + 1;
                    Methods methods = (Methods) arrayList.get(i);
                    if (methods != null && methods.containsMethod(str)) {
                        methods.invokeMethod(obj2, str, obj);
                    }
                    i = i2;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class MethodInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public boolean hasParam;
        public Method method;

        public MethodInfo() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class Methods {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Class<?> mClass;
        private Map<String, WeakPublisher<T>.MethodInfo> mMethodMap;

        public Methods(Class<?> cls) {
            Object[] objArr = {WeakPublisher.this, cls};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fd30bef18857f7d4d51043781c49cba", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fd30bef18857f7d4d51043781c49cba");
                return;
            }
            this.mMethodMap = new HashMap();
            this.mClass = cls;
        }

        public void initMethods() {
            Method[] declaredMethods;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d12daefa67e6fd18055bf1a6fa53fdf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d12daefa67e6fd18055bf1a6fa53fdf");
                return;
            }
            try {
                for (Method method : this.mClass.getDeclaredMethods()) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    int length = parameterTypes == null ? 0 : parameterTypes.length;
                    boolean z = true;
                    if (length <= 1) {
                        method.setAccessible(true);
                        String name = method.getName();
                        WeakPublisher<T>.MethodInfo methodInfo = new MethodInfo();
                        methodInfo.method = method;
                        if (length <= 0) {
                            z = false;
                        }
                        methodInfo.hasParam = z;
                        this.mMethodMap.put(name, methodInfo);
                    }
                }
            } catch (Exception e) {
                CallLog.error(getClass(), "initMethods:" + CallBaseUtil.getStackTraceMessage(e));
            }
        }

        public boolean containsMethod(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd7671d444a5ee96a010378a4e492709", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd7671d444a5ee96a010378a4e492709")).booleanValue() : this.mMethodMap.containsKey(str);
        }

        public Object invokeMethod(Object obj, String str, Object obj2) {
            Object[] objArr = {obj, str, obj2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a42e094f329ae13248fca9aa0605273", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a42e094f329ae13248fca9aa0605273");
            }
            WeakPublisher<T>.MethodInfo methodInfo = this.mMethodMap.get(str);
            if (methodInfo == null) {
                return null;
            }
            try {
                return methodInfo.hasParam ? methodInfo.method.invoke(obj, obj2) : methodInfo.method.invoke(obj, new Object[0]);
            } catch (Exception unused) {
                return null;
            }
        }
    }
}
