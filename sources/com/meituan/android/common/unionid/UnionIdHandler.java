package com.meituan.android.common.unionid;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.meituan.android.common.unionid.oneid.OneIdPrivacyHelper;
import com.meituan.android.common.unionid.oneid.cache.OneIdSharePref;
import com.meituan.android.common.unionid.oneid.statstics.StatUtil;
import com.meituan.android.common.unionid.oneid.util.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public class UnionIdHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static UnionIdHandler sUnionIdHandler;
    private AbsNetworkHandler mAbsNetworkHandler;
    private Context mContext;
    private Handler mHandler;
    private IEnvironment mIEnvironment;
    private AtomicBoolean mIsChecking;
    private AtomicBoolean mIsRunning;
    private List<IUnionIdCallback> mListeners;

    public void init() {
    }

    public void init(AbsNetworkHandler absNetworkHandler) {
    }

    public UnionIdHandler(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be540f0905148b3989dc0f42263b3c06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be540f0905148b3989dc0f42263b3c06");
            return;
        }
        this.mContext = AppUtil.getAppContext(context);
        this.mIsRunning = new AtomicBoolean(false);
        this.mIsChecking = new AtomicBoolean(false);
        this.mHandler = new Handler(Looper.getMainLooper());
        this.mListeners = new ArrayList();
    }

    public static synchronized UnionIdHandler getSingleInstance(Context context) {
        synchronized (UnionIdHandler.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c48a77532e8f6e2c6b452b7fb61055b", RobustBitConfig.DEFAULT_VALUE)) {
                return (UnionIdHandler) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c48a77532e8f6e2c6b452b7fb61055b");
            }
            if (sUnionIdHandler == null) {
                sUnionIdHandler = new UnionIdHandler(context);
            }
            return sUnionIdHandler;
        }
    }

    public void init(IEnvironment iEnvironment) {
        Object[] objArr = {iEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5699ba1f1d11007accdff4b4edb32cc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5699ba1f1d11007accdff4b4edb32cc2");
        } else {
            init(iEnvironment, new HttpNetworkHandler());
        }
    }

    public synchronized void init(IEnvironment iEnvironment, AbsNetworkHandler absNetworkHandler) {
        Object[] objArr = {iEnvironment, absNetworkHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46122af00d6db367909b90201745b1dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46122af00d6db367909b90201745b1dd");
            return;
        }
        this.mIEnvironment = iEnvironment;
        this.mAbsNetworkHandler = absNetworkHandler;
        UnionIdHelper.init(this.mContext, this.mHandler);
    }

    public synchronized void checkUnionId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6a12465fc558ebb55de5682f36d9c24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6a12465fc558ebb55de5682f36d9c24");
        } else if (this.mIsChecking.get()) {
        } else {
            c.a("unionid-check", new Runnable() { // from class: com.meituan.android.common.unionid.UnionIdHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c54a239994c97e26c03d928ec66dcf7e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c54a239994c97e26c03d928ec66dcf7e");
                        return;
                    }
                    try {
                        if (UnionIdHandler.this.mIsChecking.compareAndSet(false, true)) {
                            UnionIdHelper.checkUnionId(UnionIdHandler.this.mIEnvironment, UnionIdHandler.this.mAbsNetworkHandler);
                            UnionIdHandler.this.mIsChecking.set(false);
                        }
                    } catch (Exception e) {
                        Log.e(getClass().getSimpleName(), "run: ", e);
                    }
                }
            }).start();
        }
    }

    public synchronized void getUnionId(IUnionIdCallback iUnionIdCallback) {
        Object[] objArr = {iUnionIdCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6db77f2ae2a421b477cb7abdcb7c39d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6db77f2ae2a421b477cb7abdcb7c39d0");
            return;
        }
        this.mListeners.add(iUnionIdCallback);
        if (this.mIsRunning.get()) {
            return;
        }
        c.a("unionid-get", new Runnable() { // from class: com.meituan.android.common.unionid.UnionIdHandler.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1f385335f92c7de1792e386fddc41eeb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1f385335f92c7de1792e386fddc41eeb");
                } else if (UnionIdHandler.this.mIsRunning.compareAndSet(false, true)) {
                    UnionIdHelper.findUnionId(UnionIdHandler.this.mIEnvironment, UnionIdHandler.this.mAbsNetworkHandler, UnionIdHandler.this.mListeners);
                    UnionIdHandler.this.mIsRunning.set(false);
                }
            }
        }).start();
    }

    public synchronized String getUnionIdFromLocal() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e553069af1726dc81996aa6e043ea80", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e553069af1726dc81996aa6e043ea80");
        } else if (this.mContext == null) {
            return "";
        } else {
            if (OneIdPrivacyHelper.isPrivateSessionId(this.mContext)) {
                return OneIdSharePref.getInstance(this.mContext).getPrivateUnionid();
            }
            return UnionIdHelper.getUnionIdFromLocal(this.mContext);
        }
    }

    public synchronized String getUnionIdFromLocal(StatUtil statUtil) {
        Object[] objArr = {statUtil};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "130750af4d0a7aeb9cb037b120a1254a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "130750af4d0a7aeb9cb037b120a1254a");
        }
        return UnionIdHelper.getUnionIdFromLocal(this.mContext, statUtil);
    }

    public synchronized void saveUnionidToLocal(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf2ed1e6ac48d45f182329473a7de5d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf2ed1e6ac48d45f182329473a7de5d5");
        } else {
            UnionIdHelper.saveUnionIdToLocal(context, str);
        }
    }
}
