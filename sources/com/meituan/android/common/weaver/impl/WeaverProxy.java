package com.meituan.android.common.weaver.impl;

import android.content.Context;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.weaver.impl.blank.Blanks;
import com.meituan.android.common.weaver.impl.natives.FFPNative;
import com.meituan.android.common.weaver.impl.utils.FFPDebugger;
import com.meituan.android.common.weaver.interfaces.IWeaver;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.android.common.weaver.interfaces.WeaverEvent;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.IOUtils;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.common.utils.Utils;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WeaverProxy {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    public static IFFPConfig mConfig;
    public static volatile IWeaver sInstance;

    public static void init(@NonNull Context context) {
    }

    @AnyThread
    public static void initWithLocalConfig(@NonNull Context context, @NonNull String str, @Nullable IWeaver iWeaver) {
    }

    @VisibleForTesting
    public static IWeaver initWeaver(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f65503488e7fbc48ce7c605d3185f658", RobustBitConfig.DEFAULT_VALUE)) {
            return (IWeaver) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f65503488e7fbc48ce7c605d3185f658");
        }
        if (ProcessUtils.isMainProcess(context)) {
            final WeaverImplMain weaverImplMain = new WeaverImplMain(context);
            c.a("weaver-accept", new Runnable() { // from class: com.meituan.android.common.weaver.impl.WeaverProxy.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f638c5ad3c38c572638085c9bfead347", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f638c5ad3c38c572638085c9bfead347");
                        return;
                    }
                    try {
                        WeaverImplMain.this.accept();
                    } catch (Throwable th) {
                        th.printStackTrace();
                        IOUtils.close(WeaverImplMain.this);
                    }
                }
            }).start();
            return weaverImplMain;
        }
        return new WeaverImplSubProcess(context);
    }

    private static void initInner(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2ce6a4f1a4130e2dad42d65302f42e5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2ce6a4f1a4130e2dad42d65302f42e5a");
        } else if (sInstance == null) {
            synchronized (WeaverProxy.class) {
                if (sInstance == null) {
                    IWeaver initWeaver = initWeaver(context);
                    FFPNative.init(context);
                    Weaver.sExtension = new ExtensionImpl();
                    Weaver.sImpl = initWeaver;
                    sInstance = initWeaver;
                }
            }
        }
    }

    @WorkerThread
    public static void init(@NonNull Context context, @NonNull IShell iShell, @Nullable IFFPConfig iFFPConfig) {
        Object[] objArr = {context, iShell, iFFPConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c886546a191d661f196e8316311369e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c886546a191d661f196e8316311369e");
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        if (context == null) {
            return;
        }
        Inner.shell = iShell;
        mConfig = iFFPConfig;
        onContent(Horn.accessCache("ffp_config"), applicationContext);
        HashMap hashMap = new HashMap();
        hashMap.put("deviceLevel", Integer.valueOf(getPerfLevel(context)));
        Horn.register("ffp_config", new HornCallback() { // from class: com.meituan.android.common.weaver.impl.WeaverProxy.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8a53db1e89b109a1166592c07a5606f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8a53db1e89b109a1166592c07a5606f3");
                } else if (z) {
                    WeaverProxy.onContent(str, applicationContext);
                }
            }
        }, hashMap);
        Horn.preload("fsp2-mmp-config", hashMap);
        Blanks.getInstance().init(context, hashMap);
    }

    @WorkerThread
    public static void init(@NonNull Context context, @NonNull IShell iShell) {
        Object[] objArr = {context, iShell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2b136821b25459bfbada1845aacdb3ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2b136821b25459bfbada1845aacdb3ca");
        } else {
            init(context, iShell, null);
        }
    }

    @AnyThread
    public static void initWithLocalConfig(@NonNull Context context, @NonNull String str, @Nullable IWeaver iWeaver, @NonNull IShell iShell) {
        Object[] objArr = {context, str, iWeaver, iShell};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "558b68d7622bd75ae5ddd6ad8bf4c5aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "558b68d7622bd75ae5ddd6ad8bf4c5aa");
            return;
        }
        onContent(str, context);
        initProxyWeaver(iWeaver);
        Inner.shell = iShell;
        Horn.preload("fsp2-mmp-config", configQuery(context));
    }

    @VisibleForTesting
    @AnyThread
    public static Map<String, Object> configQuery(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96bea062864ecea3c229a64641241df6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96bea062864ecea3c229a64641241df6");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("deviceLevel", Integer.valueOf(getPerfLevel(context)));
        try {
            String str = Utils.getCurrentVersion(context).versionName;
            hashMap.put("lIndex", Integer.valueOf(Integer.parseInt(str.substring(str.lastIndexOf(46) + 1))));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    @AnyThread
    public static void hornRegister(@NonNull final Context context, @NonNull final IWeaver iWeaver) {
        Object[] objArr = {context, iWeaver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b231fb95797349ce9b5e0bc3afa3a186", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b231fb95797349ce9b5e0bc3afa3a186");
        } else {
            Horn.register("ffp_config", new HornCallback() { // from class: com.meituan.android.common.weaver.impl.WeaverProxy.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "812bdbbce69e131820fcc03c18aa98e7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "812bdbbce69e131820fcc03c18aa98e7");
                    } else if (z) {
                        WeaverProxy.onContent(str, context);
                        WeaverProxy.initProxyWeaver(iWeaver);
                    }
                }
            }, configQuery(context));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void initProxyWeaver(@Nullable final IWeaver iWeaver) {
        final IWeaver iWeaver2;
        Object[] objArr = {iWeaver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "355574a200334157e295cd40df8e98b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "355574a200334157e295cd40df8e98b2");
        } else if (iWeaver == null || (iWeaver2 = Weaver.sImpl) == null) {
        } else {
            Weaver.sImpl = new IWeaver() { // from class: com.meituan.android.common.weaver.impl.WeaverProxy.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.weaver.interfaces.IWeaver
                public final void weave(@NonNull WeaverEvent weaverEvent) {
                    Object[] objArr2 = {weaverEvent};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "22c7ff10999883b8d07f78be0a306209", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "22c7ff10999883b8d07f78be0a306209");
                        return;
                    }
                    IWeaver.this.weave(weaverEvent);
                    iWeaver2.weave(weaverEvent);
                }

                @Override // com.meituan.android.common.weaver.interfaces.IWeaver
                public final <T> void registerListener(@NonNull T t, Class<T> cls) {
                    Object[] objArr2 = {t, cls};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "039a8e5fbf21064ba79859511576a9a9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "039a8e5fbf21064ba79859511576a9a9");
                        return;
                    }
                    IWeaver.this.registerListener(t, cls);
                    iWeaver2.registerListener(t, cls);
                }

                @Override // com.meituan.android.common.weaver.interfaces.IWeaver
                public final <T> void unregisterListener(@NonNull T t, Class<T> cls) {
                    Object[] objArr2 = {t, cls};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b13d3f054249132679e0c6ef98773499", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b13d3f054249132679e0c6ef98773499");
                        return;
                    }
                    IWeaver.this.unregisterListener(t, cls);
                    iWeaver2.unregisterListener(t, cls);
                }
            };
        }
    }

    @VisibleForTesting
    public static void onContent(@Nullable String str, @NonNull Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2b5f6a19984a8e8a85836ee3db47667c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2b5f6a19984a8e8a85836ee3db47667c");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            RemoteConfig.sConfig.fromHorn(str);
            if (FFPDebugger.isDebug()) {
                RemoteConfig.sConfig.enable = true;
            }
            if (RemoteConfig.sConfig.enable) {
                initInner(context);
            }
        }
    }

    private static int getPerfLevel(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1cd4510a2319c9462b27c928f3dcec75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1cd4510a2319c9462b27c928f3dcec75")).intValue();
        }
        switch (DeviceUtil.getDeviceLevel(context)) {
            case HIGH:
                return 90;
            case MIDDLE:
                return 50;
            case LOW:
                return 10;
            default:
                return -1;
        }
    }
}
