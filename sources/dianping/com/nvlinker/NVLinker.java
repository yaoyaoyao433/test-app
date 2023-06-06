package dianping.com.nvlinker;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import dianping.com.nvlinker.stub.IHorn;
import dianping.com.nvlinker.stub.ILuban;
import dianping.com.nvlinker.stub.ILubanChangeListener;
import dianping.com.nvlinker.stub.IMonitorService;
import dianping.com.nvlinker.stub.IQuakerbird;
import dianping.com.nvlinker.stub.IRequestBuilder;
import dianping.com.nvlinker.stub.ISharkPushReceiver;
import dianping.com.nvlinker.stub.ISharkService;
import dianping.com.nvlinker.util.ReflectionHelper;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class NVLinker {
    public static final String ACTION_LUBAN = "com.dianping.nvlinker.luban.LOCAL_BROADCAST";
    public static final String ACTION_SHARK = "com.dianping.nvlinker.shark.LOCAL_BROADCAST";
    private static final String TAG = "NVLinker";
    private static volatile boolean isInit;
    private static ILuban luban;
    private static int mAppID;
    private static String mAppversion;
    private static ILikner mCallback;
    private static String mChannel;
    private static Context mContext;
    private static IQuakerbird quakerbird;
    private static IHorn sIHorn;
    private static volatile ISharkService shark;
    private static final InitFactory factory = new InitFactory();
    private static final AtomicInteger tryShark = new AtomicInteger();
    private static final AtomicInteger tryLuban = new AtomicInteger();
    private static final AtomicInteger tryHorn = new AtomicInteger();
    private static final AtomicInteger tryQB = new AtomicInteger();
    private static final AtomicBoolean sAppBackground = new AtomicBoolean(true);
    private static final List<AppBackgroundStateListener> sBackgroundStateListeners = new LinkedList();

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface AppBackgroundStateListener {
        void onBackgroundStateChanged(boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface ILikner {
        String getCityID();

        String getUnionID();
    }

    public static ILuban getLuban() {
        return null;
    }

    public static void init(Context context, int i, String str, String str2, ILikner iLikner) {
        if (isInit) {
            return;
        }
        mContext = context.getApplicationContext();
        mAppID = i;
        mChannel = str;
        mAppversion = str2;
        mCallback = iLikner;
        if (iLikner == null) {
            throw new IllegalArgumentException("callback null");
        }
        isInit = true;
    }

    public static void setContext(Context context) {
        mContext = context;
    }

    public static void setAppID(int i) {
        mAppID = i;
    }

    public static void setHorn(IHorn iHorn) {
        sIHorn = iHorn;
    }

    public static IHorn getHorn() {
        if (sIHorn == null && tryHorn.getAndIncrement() < 3) {
            IHorn iHorn = (IHorn) ReflectionHelper.instance("dianping.com.nvlinker.horn.NVLinkerHorn", "obtain");
            sIHorn = iHorn;
            if (iHorn == null) {
                Log.e("nvlinker", "please called setHorn first");
            }
        }
        return sIHorn;
    }

    public static ISharkService getShark() {
        if (shark == null && tryShark.getAndIncrement() < 3) {
            synchronized (tryShark) {
                if (shark == null) {
                    shark = factory.getSharkService();
                }
            }
        }
        return shark;
    }

    public static IRequestBuilder obtainReq() {
        return factory.getReqBuilder();
    }

    public static boolean checkRequestMethodExist(String str) {
        Method[] declaredMethods;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            IRequestBuilder obtainReq = obtainReq();
            if (obtainReq != null && (declaredMethods = obtainReq.getClass().getDeclaredMethods()) != null && declaredMethods.length > 0) {
                for (Method method : declaredMethods) {
                    if (method != null && str.equals(method.getName())) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static URL obtainURL(String str) throws MalformedURLException {
        return factory.obtainUrl(str);
    }

    public static synchronized ILuban getLubanForceInSubThread() {
        synchronized (NVLinker.class) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return null;
            }
            if (luban == null && tryLuban.getAndIncrement() < 3) {
                luban = factory.getLubanService();
            }
            return luban;
        }
    }

    public static void setLubanBeta(boolean z) {
        if (luban == null) {
            return;
        }
        ReflectionHelper.Method(luban, "setBetaEnv", new Class[]{Boolean.TYPE}, new Object[]{Boolean.valueOf(z)});
    }

    public static void registerLubanCallback(String str, ILubanChangeListener iLubanChangeListener) {
        if (getLuban() == null) {
            return;
        }
        ReflectionHelper.Method(getLuban(), "registerLinkerCallback", new Class[]{String.class, ILubanChangeListener.class}, new Object[]{str, iLubanChangeListener});
    }

    public static void unregisterLubanCallback(String str, ILubanChangeListener iLubanChangeListener) {
        if (getLuban() == null) {
            return;
        }
        ReflectionHelper.Method(getLuban(), "unregisterLinkerCallback", new Class[]{String.class, ILubanChangeListener.class}, new Object[]{str, iLubanChangeListener});
    }

    public static int registerSharkPushCallback(String str, ISharkPushReceiver iSharkPushReceiver) {
        Object invokeStatic = ReflectionHelper.invokeStatic("com.dianping.sharkpush.SharkPush", "registerPushRemote", new Class[]{String.class, ISharkPushReceiver.class}, new Object[]{str, iSharkPushReceiver});
        if (invokeStatic != null) {
            return ((Integer) invokeStatic).intValue();
        }
        return -1;
    }

    public static void unRegisterPush(int i) {
        ReflectionHelper.invokeStatic("com.dianping.sharkpush.SharkPush", "unRegisterPush", new Class[]{Integer.class}, new Object[]{Integer.valueOf(i)});
    }

    public static IQuakerbird getQuakerbird() {
        if (quakerbird == null && tryQB.getAndIncrement() < 3) {
            quakerbird = factory.getQBService();
        }
        return quakerbird;
    }

    public static void registerMonitor(IMonitorService iMonitorService) {
        factory.registerMonitor(iMonitorService);
    }

    public static IMonitorService getMonitor() {
        return factory.getMonitor();
    }

    public static boolean isLinkerInit() {
        return isInit;
    }

    public static Context getContext() {
        return mContext;
    }

    public static String getCityID() {
        return mCallback.getCityID();
    }

    public static String getUnionID() {
        return mCallback != null ? mCallback.getUnionID() : "";
    }

    public static int getAppID() {
        return mAppID;
    }

    public static String getChannel() {
        return mChannel;
    }

    public static String getAppversion() {
        return mAppversion;
    }

    public static void setBackgroundMode(boolean z) {
        setBackgroundMode(mContext, z);
    }

    public static void setBackgroundMode(Context context, boolean z) {
        ArrayList<AppBackgroundStateListener> arrayList;
        if (!sAppBackground.compareAndSet(!z, z) || context == null) {
            return;
        }
        synchronized (sBackgroundStateListeners) {
            arrayList = new ArrayList(sBackgroundStateListeners);
        }
        for (AppBackgroundStateListener appBackgroundStateListener : arrayList) {
            appBackgroundStateListener.onBackgroundStateChanged(z);
        }
    }

    public static boolean isAppBackground() {
        return sAppBackground.get();
    }

    public static void registerBackgroundStateListener(AppBackgroundStateListener appBackgroundStateListener) {
        if (appBackgroundStateListener == null) {
            return;
        }
        synchronized (sBackgroundStateListeners) {
            sBackgroundStateListeners.add(appBackgroundStateListener);
        }
    }

    public static void unregisterBackgroundStateListener(AppBackgroundStateListener appBackgroundStateListener) {
        synchronized (sBackgroundStateListeners) {
            sBackgroundStateListeners.remove(appBackgroundStateListener);
        }
    }
}
