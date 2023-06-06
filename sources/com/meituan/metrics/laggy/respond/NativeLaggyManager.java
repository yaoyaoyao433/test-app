package com.meituan.metrics.laggy.respond;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.view.Choreographer;
import android.view.MotionEvent;
import com.meituan.metrics.laggy.respond.config.RespondLaggyRemoteConfig;
import com.meituan.metrics.laggy.respond.model.PageRespondLaggyModel;
import com.meituan.metrics.window.callback.ActivityWindowTouchCallbackInterface;
import com.meituan.metrics.window.callback.MetricsActivityWindowCallbackManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NativeLaggyManager {
    private static final Object FRAME_CALLBACK_TOKEN = new Object() { // from class: com.meituan.metrics.laggy.respond.NativeLaggyManager.1
        public static ChangeQuickRedirect changeQuickRedirect;

        public final String toString() {
            return "FRAME_CALLBACK_TOKEN";
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private int choreographerCallbackLast;
    private final Runnable choreographerRunnable;
    private final Choreographer.FrameCallback computeFrameCallback;
    private boolean invokeChoreographerFail;
    private long latestActionUpTime;
    private int latestActivityHashCode;
    private final Handler mainHandler;
    private final Choreographer.FrameCallback middlewareFrameCallback;
    private final ConcurrentHashMap<Integer, PageRespondLaggyModel> pageLaggyMap;
    private Method postCallbackDelayedInternalMethod;
    private final RespondLaggyRemoteConfig respondLaggyRemoteConfig;
    private final Runnable startChoreographerRunnable;
    private final Handler timeOutHandler;
    private final ActivityWindowTouchCallbackInterface touchCallbackInterface;

    public NativeLaggyManager(Handler handler, RespondLaggyRemoteConfig respondLaggyRemoteConfig, ConcurrentHashMap<Integer, PageRespondLaggyModel> concurrentHashMap) {
        Object[] objArr = {handler, respondLaggyRemoteConfig, concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f2527b0caf60ef9c95526cbf51375b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f2527b0caf60ef9c95526cbf51375b8");
            return;
        }
        this.latestActionUpTime = -1L;
        this.latestActivityHashCode = -1;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.choreographerCallbackLast = -1;
        this.invokeChoreographerFail = false;
        this.choreographerRunnable = new Runnable() { // from class: com.meituan.metrics.laggy.respond.NativeLaggyManager.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                PageRespondLaggyModel pageRespondLaggyModel;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "41c006459ad9370d85102a890d47abdc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "41c006459ad9370d85102a890d47abdc");
                    return;
                }
                NativeLaggyManager.this.timeOutHandler.removeMessages(1);
                if (NativeLaggyManager.this.latestActionUpTime <= 0 || NativeLaggyManager.this.latestActivityHashCode <= 0) {
                    return;
                }
                long reportLaggyTimeByStartTime = NativeLaggyManager.this.respondLaggyRemoteConfig.getReportLaggyTimeByStartTime(NativeLaggyManager.this.latestActionUpTime);
                if (reportLaggyTimeByStartTime > 0 && (pageRespondLaggyModel = (PageRespondLaggyModel) NativeLaggyManager.this.pageLaggyMap.get(Integer.valueOf(NativeLaggyManager.this.latestActivityHashCode))) != null) {
                    pageRespondLaggyModel.putNativeLaggyTime(reportLaggyTimeByStartTime);
                }
                NativeLaggyManager.this.latestActionUpTime = -1L;
            }
        };
        this.touchCallbackInterface = new ActivityWindowTouchCallbackInterface() { // from class: com.meituan.metrics.laggy.respond.NativeLaggyManager.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.metrics.window.callback.ActivityWindowTouchCallbackInterface
            public void dispatchTouchEvent(@Nullable Activity activity, MotionEvent motionEvent) {
                Object[] objArr2 = {activity, motionEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a106c666b1f03adac98f0b4b0468a4a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a106c666b1f03adac98f0b4b0468a4a8");
                } else if (motionEvent == null || motionEvent.getAction() != 1) {
                } else {
                    NativeLaggyManager.this.postToVSyncLatest(activity, motionEvent.getEventTime());
                }
            }
        };
        this.middlewareFrameCallback = new Choreographer.FrameCallback() { // from class: com.meituan.metrics.laggy.respond.NativeLaggyManager.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                Object[] objArr2 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8a5c44449e8ac47e19c7e4c7fe6a6f2d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8a5c44449e8ac47e19c7e4c7fe6a6f2d");
                } else {
                    Choreographer.getInstance().postFrameCallback(NativeLaggyManager.this.computeFrameCallback);
                }
            }
        };
        this.computeFrameCallback = new Choreographer.FrameCallback() { // from class: com.meituan.metrics.laggy.respond.NativeLaggyManager.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                Object[] objArr2 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "662f0ae810f8b48361376d4c40e08816", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "662f0ae810f8b48361376d4c40e08816");
                } else {
                    NativeLaggyManager.this.choreographerRunnable.run();
                }
            }
        };
        this.startChoreographerRunnable = new Runnable() { // from class: com.meituan.metrics.laggy.respond.NativeLaggyManager.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "68fae95f86c2a99ebbce711b86c5a0c9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "68fae95f86c2a99ebbce711b86c5a0c9");
                    return;
                }
                try {
                    if (Build.VERSION.SDK_INT >= 31) {
                        Choreographer.getInstance().postFrameCallback(NativeLaggyManager.this.middlewareFrameCallback);
                        return;
                    }
                    if (NativeLaggyManager.this.postCallbackDelayedInternalMethod == null) {
                        NativeLaggyManager.this.postCallbackDelayedInternalMethod = Choreographer.getInstance().getClass().getDeclaredMethod("postCallback", Integer.TYPE, Runnable.class, Object.class);
                        NativeLaggyManager.this.postCallbackDelayedInternalMethod.setAccessible(true);
                    }
                    if (NativeLaggyManager.this.choreographerCallbackLast < 0) {
                        Field declaredField = Choreographer.getInstance().getClass().getDeclaredField("CALLBACK_LAST");
                        declaredField.setAccessible(true);
                        NativeLaggyManager.this.choreographerCallbackLast = ((Integer) declaredField.get(Choreographer.getInstance())).intValue();
                    }
                    NativeLaggyManager.this.postCallbackDelayedInternalMethod.invoke(Choreographer.getInstance(), Integer.valueOf(NativeLaggyManager.this.choreographerCallbackLast), NativeLaggyManager.this.choreographerRunnable, NativeLaggyManager.FRAME_CALLBACK_TOKEN);
                } catch (Exception e) {
                    NativeLaggyManager.this.invokeChoreographerFail = true;
                    NativeLaggyManager.this.postCallbackDelayedInternalMethod = null;
                    NativeLaggyManager.this.choreographerCallbackLast = -1;
                    NativeLaggyManager.this.latestActionUpTime = -1L;
                    e.printStackTrace();
                }
            }
        };
        this.timeOutHandler = handler;
        this.respondLaggyRemoteConfig = respondLaggyRemoteConfig;
        this.pageLaggyMap = concurrentHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiThread
    public void postToVSyncLatest(@Nullable Activity activity, long j) {
        PageRespondLaggyModel pageRespondLaggyModel;
        Object[] objArr = {activity, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "651b0dc9b76e5bc664873b625d21e646", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "651b0dc9b76e5bc664873b625d21e646");
        } else if (this.latestActionUpTime != -1 || activity == null || this.invokeChoreographerFail || (pageRespondLaggyModel = this.pageLaggyMap.get(Integer.valueOf(activity.hashCode()))) == null) {
        } else {
            this.latestActionUpTime = j;
            this.latestActivityHashCode = activity.hashCode();
            pageRespondLaggyModel.addOnesNativeRespond();
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.arg1 = activity.hashCode();
            this.timeOutHandler.sendMessageDelayed(obtain, this.respondLaggyRemoteConfig.getTimeout());
            this.mainHandler.post(this.startChoreographerRunnable);
        }
    }

    public void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03ac531403efbcab86ec7beb5fd6fbbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03ac531403efbcab86ec7beb5fd6fbbd");
        } else {
            MetricsActivityWindowCallbackManager.getInstance().registerWindowCallback(activity, this.touchCallbackInterface);
        }
    }
}
