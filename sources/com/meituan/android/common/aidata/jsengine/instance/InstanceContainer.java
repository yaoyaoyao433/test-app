package com.meituan.android.common.aidata.jsengine.instance;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class InstanceContainer {
    private static final String TAG = "InstanceContainer";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile InstanceContainer sInstance;
    private JSInstanceManager mHeadJSInstanceManager;
    private final Map<String, WeakReference<JSInstance>> mIdToInstanceMap;
    @NonNull
    private final Map<String, JSInstanceManager> mJSInstanceManagerMap;
    private volatile Thread mMonitorThread;
    private ReferenceQueue<JSInstance> mReferenceQueue;
    private ScheduledExecutorService mScheduledExecutorService;

    public InstanceContainer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32c979b48f27521861c804602633a7f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32c979b48f27521861c804602633a7f6");
            return;
        }
        this.mIdToInstanceMap = new HashMap();
        this.mReferenceQueue = new ReferenceQueue<>();
        this.mJSInstanceManagerMap = new HashMap();
        monitorObjectRelease();
    }

    public static InstanceContainer getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a3bec1c4c4280186bc19fa46c9f83097", RobustBitConfig.DEFAULT_VALUE)) {
            return (InstanceContainer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a3bec1c4c4280186bc19fa46c9f83097");
        }
        if (sInstance == null) {
            synchronized (InstanceContainer.class) {
                if (sInstance == null) {
                    sInstance = new InstanceContainer();
                }
            }
        }
        return sInstance;
    }

    public void updateHeadJSInstanceManager(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        ArrayList arrayList;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08dcd8e2878e4403e28867973ba200ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08dcd8e2878e4403e28867973ba200ad");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            new StringBuilder("start update head JSInstanceManager with frameworkId = ").append(str);
            synchronized (this) {
                JSInstanceManager jSInstanceManager = this.mHeadJSInstanceManager;
                this.mHeadJSInstanceManager = new JSInstanceManager(str, str2, str3);
                this.mJSInstanceManagerMap.put(str, this.mHeadJSInstanceManager);
                destroyJSInstanceManager(jSInstanceManager);
                Collection<WeakReference<JSInstance>> values = this.mIdToInstanceMap.values();
                arrayList = values.isEmpty() ? null : new ArrayList(values);
            }
            reloadAllJSInstance(arrayList);
        }
    }

    private void reloadAllJSInstance(@Nullable List<WeakReference<JSInstance>> list) {
        JSInstance jSInstance;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75850fd6a754892144c3640df0e11662", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75850fd6a754892144c3640df0e11662");
        } else if (list != null) {
            for (WeakReference<JSInstance> weakReference : list) {
                if (weakReference != null && (jSInstance = weakReference.get()) != null) {
                    StringBuilder sb = new StringBuilder("jsinstance ");
                    sb.append(jSInstance.getInstanceId());
                    sb.append(" mark need reload script and try reload script");
                    jSInstance.markNeedReloadScriptAndTryReloadScript();
                }
            }
        }
    }

    private void destroyJSInstanceManager(@Nullable final JSInstanceManager jSInstanceManager) {
        Object[] objArr = {jSInstanceManager};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad3c3b7b390e3453eb6692e4d64cbfd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad3c3b7b390e3453eb6692e4d64cbfd8");
        } else if (jSInstanceManager == null) {
        } else {
            new StringBuilder("start destroy JSInstanceManager with frameworkId ").append(jSInstanceManager.getJSFrameworkId());
            synchronized (this) {
                final HashSet hashSet = new HashSet(this.mIdToInstanceMap.keySet());
                if (this.mScheduledExecutorService == null) {
                    this.mScheduledExecutorService = c.c("ai_js_instance_manager_destructor");
                }
                this.mScheduledExecutorService.schedule(new Runnable() { // from class: com.meituan.android.common.aidata.jsengine.instance.InstanceContainer.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ac1727ebe14bdc2c44dc8d49fc64dba5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ac1727ebe14bdc2c44dc8d49fc64dba5");
                            return;
                        }
                        synchronized (InstanceContainer.getInstance()) {
                            for (String str : hashSet) {
                                new StringBuilder("destroy jsinstance ").append(str);
                                jSInstanceManager.destroyInstance(str, null);
                            }
                        }
                    }
                }, 6000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Nullable
    public JSInstanceManager getHeadJSInstanceManager() {
        return this.mHeadJSInstanceManager;
    }

    @NonNull
    public Map<String, JSInstanceManager> getJSInstanceManagerMap() {
        return this.mJSInstanceManagerMap;
    }

    public void addInstance(String str, JSInstance jSInstance) {
        Object[] objArr = {str, jSInstance};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c8d92f9e3ac7321489217b2b61f8154", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c8d92f9e3ac7321489217b2b61f8154");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            synchronized (this) {
                this.mIdToInstanceMap.put(str, new WeakReference<>(jSInstance, this.mReferenceQueue));
            }
        }
    }

    public boolean containsInstance(String str) {
        boolean containsKey;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b26845d0177eed6daafa25db09228e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b26845d0177eed6daafa25db09228e2")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        synchronized (this) {
            containsKey = this.mIdToInstanceMap.containsKey(str);
        }
        return containsKey;
    }

    public void removeInstance(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba95f4e4b1a48fc7d2474579a746d31e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba95f4e4b1a48fc7d2474579a746d31e");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            synchronized (this) {
                this.mIdToInstanceMap.remove(str);
            }
        }
    }

    public JSInstance getInstance(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f91a6116cbc00aafb58c4dbb90fced0", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSInstance) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f91a6116cbc00aafb58c4dbb90fced0");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this) {
            WeakReference<JSInstance> weakReference = this.mIdToInstanceMap.get(str);
            if (weakReference == null || weakReference.get() == null) {
                return null;
            }
            return weakReference.get();
        }
    }

    private void monitorObjectRelease() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d27b8e6d9136dac8d044b42c9098631", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d27b8e6d9136dac8d044b42c9098631");
        } else if (this.mMonitorThread == null) {
            this.mMonitorThread = c.a("jsinstance_monitor", new Runnable() { // from class: com.meituan.android.common.aidata.jsengine.instance.InstanceContainer.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    JSInstance jSInstance;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3bd9eaa1b6e493e598013c6a61f81f3a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3bd9eaa1b6e493e598013c6a61f81f3a");
                        return;
                    }
                    while (true) {
                        try {
                            WeakReference weakReference = (WeakReference) InstanceContainer.this.mReferenceQueue.remove();
                            if (weakReference == null) {
                                return;
                            }
                            if (weakReference.get() != null && (jSInstance = (JSInstance) weakReference.get()) != null) {
                                jSInstance.destroyInstance(null);
                            }
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
            });
            this.mMonitorThread.setDaemon(true);
            this.mMonitorThread.start();
        }
    }
}
