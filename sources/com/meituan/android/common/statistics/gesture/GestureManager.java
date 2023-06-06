package com.meituan.android.common.statistics.gesture;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.Window;
import com.meituan.android.common.analyse.BuildConfig;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.StatisticsHandler;
import com.meituan.android.common.statistics.channel.DefaultEnvironment;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.dispatcher.EventManager;
import com.meituan.android.common.statistics.dispatcher.FilterConfig;
import com.meituan.android.common.statistics.dispatcher.IEventCallback;
import com.meituan.android.common.statistics.gesture.data.GestureDataHandler;
import com.meituan.android.common.statistics.gesture.data.GestureEntity;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.common.statistics.ipc.independent.ProcessController;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.android.common.statistics.report.ReportStrategyController;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.android.common.statistics.utils.SntpUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.common.utils.ProcessUtils;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GestureManager implements IEventCallback {
    private static final String CHANNEL_GESTURE = "gesture";
    private static final String GESTURE_BID = "b_techportal_wv5d9mbb_sc";
    private static final String GESTURE_CID = "c_techportal_6z8t8npy";
    private static final String KEY_GESTURE_LIST = "gesture_list";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int MAX_MOVE_NUM;
    private final String TAG;
    private final int TRAILS_EPSILON;
    private final int TRAILS_LENGTH;
    private volatile String currentCustomCollectKey;
    private volatile String currentCustomReportKey;
    private GestureData data;
    private DecimalFormat df;
    private DisplayMetrics dm;
    private AtomicInteger gestureCollectControl;
    private AtomicInteger gestureReportControl;
    private AtomicBoolean isPageFirstEvent;
    private long lastGestureTime;
    private LinkedList<WeakReference<Activity>> mGestureCallbackList;
    private List<IGestureListener> mListeners;
    private String pageInfoKey;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface IGestureListener {
        void callback(GestureEntity gestureEntity);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class InnerClass {
        private static final GestureManager INSTANCE = new GestureManager();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public GestureManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd0a1a2ce0f242da17343d7798543472", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd0a1a2ce0f242da17343d7798543472");
            return;
        }
        this.TAG = "Gesture";
        this.gestureCollectControl = new AtomicInteger();
        this.gestureReportControl = new AtomicInteger();
        this.currentCustomCollectKey = "";
        this.currentCustomReportKey = "";
        this.pageInfoKey = "";
        this.TRAILS_LENGTH = 100;
        this.TRAILS_EPSILON = 15;
        this.MAX_MOVE_NUM = 1000;
        this.isPageFirstEvent = new AtomicBoolean(false);
        this.data = new GestureData();
        this.dm = new DisplayMetrics();
        this.mGestureCallbackList = null;
        this.mGestureCallbackList = new LinkedList<>();
        this.mListeners = new ArrayList();
        this.df = new DecimalFormat("0.0000");
        EventManager.getInstance().subscribeData(new FilterConfig(null, new HashSet(Arrays.asList(QuickReportConstants.PV_CONFIG, "PD")), null, null, null, null, null), this);
    }

    public static GestureManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0cb48e563920b5286f94e67a1d353b79", 6917529027641081856L) ? (GestureManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0cb48e563920b5286f94e67a1d353b79") : InnerClass.INSTANCE;
    }

    @Override // com.meituan.android.common.statistics.dispatcher.IEventCallback
    public void onEvent(JSONObject jSONObject) {
        JSONObject optJSONObject;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "78d2a2d68f70887c67ddd27708d77170", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "78d2a2d68f70887c67ddd27708d77170");
        } else if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("evs")) == null) {
        } else {
            String optString = optJSONObject.optString("nm");
            String optString2 = optJSONObject.optString("val_cid");
            String optString3 = optJSONObject.optString(Constants.EventInfoConsts.KEY_REQ_ID);
            LogUtil.log("Gesture", "============ callback nm: " + optString + ", cid: " + optString2 + ", requestId: " + optString3);
            if (QuickReportConstants.PV_CONFIG.equalsIgnoreCase(optString)) {
                this.isPageFirstEvent.set(true);
            }
        }
    }

    public synchronized void registerWindowCall(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b33c4e53281b26c5de1ad27d420fda3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b33c4e53281b26c5de1ad27d420fda3f");
            return;
        }
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(this.dm);
        this.pageInfoKey = AppUtil.generatePageInfoKey(activity);
        Window window = activity.getWindow();
        Window.Callback callback = window.getCallback();
        if (!(callback instanceof GestureCallback) && !containsGestureCallback(activity)) {
            window.setCallback(new GestureCallback(activity.getApplicationContext(), callback));
            this.mGestureCallbackList.add(new WeakReference<>(activity));
        }
    }

    private boolean containsGestureCallback(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0abc1d6abc08154112337e616a8e312", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0abc1d6abc08154112337e616a8e312")).booleanValue();
        }
        if (this.mGestureCallbackList != null && this.mGestureCallbackList.size() > 0) {
            Iterator<WeakReference<Activity>> it = this.mGestureCallbackList.iterator();
            while (it.hasNext()) {
                WeakReference<Activity> next = it.next();
                if (next != null) {
                    if (activity == next.get()) {
                        return true;
                    }
                    if (next.get() == null) {
                        it.remove();
                    }
                }
            }
        }
        return false;
    }

    public void setCurrentCustomCollectKey(String str) {
        this.currentCustomCollectKey = str;
    }

    public void setCurrentCustomReportKey(String str) {
        this.currentCustomReportKey = str;
    }

    public void incrementCollect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba068e239a9789d853b0537ede98ca35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba068e239a9789d853b0537ede98ca35");
            return;
        }
        int incrementAndGet = this.gestureCollectControl.incrementAndGet();
        LogUtil.i("Gesture", "incrementCollect(), collect flag = " + incrementAndGet);
    }

    public void decrementCollect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54348c422a2691c13121780c11d3da1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54348c422a2691c13121780c11d3da1e");
            return;
        }
        int decrementAndGet = this.gestureCollectControl.decrementAndGet();
        LogUtil.i("Gesture", "decrementCollect(), collect flag = " + decrementAndGet);
    }

    public void incrementReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "234f6cf1ffe06d423cb2b92ec2b6d7bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "234f6cf1ffe06d423cb2b92ec2b6d7bc");
            return;
        }
        int incrementAndGet = this.gestureReportControl.incrementAndGet();
        LogUtil.i("Gesture", "incrementReport(), report flat = " + incrementAndGet);
    }

    public void decrementReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80751c000119106f86f758bfb726ea3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80751c000119106f86f758bfb726ea3a");
            return;
        }
        int decrementAndGet = this.gestureReportControl.decrementAndGet();
        LogUtil.i("Gesture", "decrementReport(), report flat = " + decrementAndGet);
    }

    public boolean isCustomCollectGestureOn() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "234ef367e0c4f1f3a8912f2aabab3b64", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "234ef367e0c4f1f3a8912f2aabab3b64")).booleanValue() : this.gestureCollectControl.get() > 0;
    }

    public boolean isCustomReportGestureOn() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9ced562f4041ffc2be26ca73ea10b40", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9ced562f4041ffc2be26ca73ea10b40")).booleanValue() : this.gestureReportControl.get() > 0;
    }

    public void dispatchTouchEvent(Context context, MotionEvent motionEvent) {
        Object[] objArr = {context, motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed6b511048c58c1ed4aaadf319b1474f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed6b511048c58c1ed4aaadf319b1474f");
        } else if (context == null) {
        } else {
            if (ConfigManager.getInstance(context).isCollectGestureOn() || getInstance().isCustomCollectGestureOn()) {
                try {
                    switch (motionEvent.getActionMasked()) {
                        case 0:
                            LogUtil.log("Gesture", "============= ACTION_DOWN: x,y = " + motionEvent.getRawX() + ", " + motionEvent.getRawY());
                            this.data.clear();
                            this.data.startRawX = motionEvent.getRawX();
                            this.data.startRawY = motionEvent.getRawY();
                            this.data.startTime = System.currentTimeMillis();
                            this.data.startPressure = motionEvent.getPressure();
                            return;
                        case 1:
                        case 3:
                            LogUtil.log("Gesture", "============= ACTION_UP: x,y = " + motionEvent.getRawX() + ", " + motionEvent.getRawY());
                            if (this.data.isValid()) {
                                this.data.endRawX = motionEvent.getRawX();
                                this.data.endRawY = motionEvent.getRawY();
                                this.data.endTime = System.currentTimeMillis();
                                this.data.endPressure = motionEvent.getPressure();
                                LogUtil.log("Gesture", "========= ACTION_UP: data = " + this.data.toString());
                                collectGesture(context, (GestureData) this.data.clone());
                                this.data.clear();
                                return;
                            }
                            return;
                        case 2:
                            LogUtil.log("Gesture", "============= ACTION_MOVE: x,y = " + motionEvent.getRawX() + ", " + motionEvent.getRawY());
                            if (this.data.isValid()) {
                                GestureMoveEvent gestureMoveEvent = new GestureMoveEvent();
                                gestureMoveEvent.x = motionEvent.getRawX();
                                gestureMoveEvent.y = motionEvent.getRawY();
                                gestureMoveEvent.time = System.currentTimeMillis();
                                gestureMoveEvent.p = motionEvent.getPressure();
                                List<GestureMoveEvent> list = this.data.moveEvent;
                                if (list.size() == 0) {
                                    list.add(gestureMoveEvent);
                                    return;
                                }
                                GestureMoveEvent gestureMoveEvent2 = list.get(list.size() - 1);
                                if (list.size() < 1000) {
                                    if (gestureMoveEvent2.x == gestureMoveEvent.x && gestureMoveEvent2.y == gestureMoveEvent.y) {
                                        return;
                                    }
                                    list.add(gestureMoveEvent);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public void reportGesture() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c19efc888cfbe8b84daf593d50d4d43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c19efc888cfbe8b84daf593d50d4d43");
        } else {
            StatisticsHandler.getInstance().gestureStatistic(new Runnable() { // from class: com.meituan.android.common.statistics.gesture.GestureManager.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "88f9b83364d6456e5e2036a28d00dfa1", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "88f9b83364d6456e5e2036a28d00dfa1");
                        return;
                    }
                    List<GestureEntity> gesture = GestureDataHandler.getInstance().getGesture();
                    if (CollectionUtils.isEmpty(gesture)) {
                        LogUtil.log("Gesture", "reportGesture, list is empty");
                        return;
                    }
                    LogUtil.log("Gesture", "reportGesture, list size = " + gesture.size());
                    GestureManager.this.reportNet(gesture);
                    GestureDataHandler.getInstance().clean();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportNet(List<GestureEntity> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c34339a78817579cb64069f8b7323c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c34339a78817579cb64069f8b7323c9");
        } else if (ReportStrategyController.checkGestureScIfNeedReport()) {
            StringBuilder sb = new StringBuilder();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                GestureEntity gestureEntity = list.get(i);
                String jSONObject = gestureEntity.toJson().toString();
                if (sb.length() + jSONObject.length() < 9500) {
                    sb.append(jSONObject);
                    jSONArray.put(gestureEntity.toJson());
                } else {
                    if (jSONArray.length() > 0) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(KEY_GESTURE_LIST, jSONArray);
                        Statistics.getChannel(CHANNEL_GESTURE).writeSystemCheck(null, "b_techportal_wv5d9mbb_sc", hashMap, GESTURE_CID);
                        ReportStrategyController.gestureScCounterIncrease();
                    }
                    sb.delete(0, sb.length());
                    sb.append(jSONObject);
                    jSONArray = new JSONArray();
                    jSONArray.put(gestureEntity.toJson());
                }
            }
            if (jSONArray.length() > 0) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(KEY_GESTURE_LIST, jSONArray);
                Statistics.getChannel(CHANNEL_GESTURE).writeSystemCheck(null, "b_techportal_wv5d9mbb_sc", hashMap2, GESTURE_CID);
                ReportStrategyController.gestureScCounterIncrease();
            }
        }
    }

    private void collectGesture(final Context context, final GestureData gestureData) {
        Object[] objArr = {context, gestureData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8de4fd4b476a96f92982ca020e2c78ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8de4fd4b476a96f92982ca020e2c78ba");
        } else {
            StatisticsHandler.getInstance().gestureStatistic(new Runnable() { // from class: com.meituan.android.common.statistics.gesture.GestureManager.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "184d5326eba09e374204b82b44a98926", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "184d5326eba09e374204b82b44a98926");
                        return;
                    }
                    GestureEntity buildDBGestureEntity = GestureManager.this.buildDBGestureEntity(context, gestureData);
                    GestureManager.this.reportGestureToBlue(buildDBGestureEntity);
                    if (ConfigManager.getInstance(context).isReportGestureOn() || GestureManager.this.isCustomReportGestureOn()) {
                        if (ConfigManager.getInstance(context).supportMultiProcess() && !ProcessUtils.isMainProcess(context)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("entity", buildDBGestureEntity);
                            ProcessController.getInstance().selectMethod(context, RequestIDMap.OP_TYPE_GESTURE.OP_TYPE_SAVE_GESTURE, hashMap);
                            return;
                        }
                        GestureDataHandler.getInstance().saveGesture(buildDBGestureEntity);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportGestureToBlue(GestureEntity gestureEntity) {
        Object[] objArr = {gestureEntity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93b35d7a1bef1285918ac57260ee0f95", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93b35d7a1bef1285918ac57260ee0f95");
            return;
        }
        LogUtil.i("Gesture", "invoke reportGestureToBlue()");
        if (CollectionUtils.isEmpty(this.mListeners)) {
            return;
        }
        synchronized (this.mListeners) {
            for (IGestureListener iGestureListener : this.mListeners) {
                if (iGestureListener != null) {
                    iGestureListener.callback(gestureEntity);
                }
            }
        }
    }

    public void register(IGestureListener iGestureListener) {
        Object[] objArr = {iGestureListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3376d6c06ee6186ca04227382311599", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3376d6c06ee6186ca04227382311599");
            return;
        }
        LogUtil.i("Gesture", "register blue");
        synchronized (this.mListeners) {
            if (this.mListeners == null) {
                return;
            }
            this.mListeners.add(iGestureListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public GestureEntity buildDBGestureEntity(Context context, GestureData gestureData) {
        Map<String, String> environment;
        Object[] objArr = {context, gestureData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "219c3066085b4d969c73431815e12de7", 6917529027641081856L)) {
            return (GestureEntity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "219c3066085b4d969c73431815e12de7");
        }
        GestureEntity gestureEntity = new GestureEntity();
        try {
            gestureEntity.startTime = gestureData.startTime;
            gestureEntity.endTime = gestureData.endTime;
            if (this.isPageFirstEvent.get()) {
                this.isPageFirstEvent.set(false);
                GestureUtils.reset();
                gestureEntity.timeInterval = -999L;
            } else {
                gestureEntity.timeInterval = gestureData.startTime - this.lastGestureTime;
            }
            this.lastGestureTime = gestureData.endTime;
            gestureEntity.seq = GestureUtils.getSeq();
            gestureEntity.timeGap = gestureData.endTime - gestureData.startTime;
            float f = gestureData.startRawX / this.dm.widthPixels;
            float f2 = gestureData.startRawY / this.dm.heightPixels;
            if (f > 1.0f) {
                f = 1.0f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            try {
                gestureEntity.startXY.put(Constants.GestureMoveEvent.KEY_X, this.df.format(f));
                gestureEntity.startXY.put(Constants.GestureMoveEvent.KEY_Y, this.df.format(f2));
                gestureEntity.startXY.put("p", this.df.format(gestureData.startPressure));
            } catch (JSONException unused) {
            }
            float f3 = gestureData.endRawX / this.dm.widthPixels;
            float f4 = gestureData.endRawY / this.dm.heightPixels;
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            float f5 = f4 <= 1.0f ? f4 : 1.0f;
            try {
                gestureEntity.endXY.put(Constants.GestureMoveEvent.KEY_X, this.df.format(f3));
                gestureEntity.endXY.put(Constants.GestureMoveEvent.KEY_Y, this.df.format(f5));
                gestureEntity.endXY.put("p", this.df.format(gestureData.endPressure));
            } catch (JSONException unused2) {
            }
            try {
                gestureEntity.xyGap.put(Constants.GestureMoveEvent.KEY_X, this.df.format(f3 - f));
                gestureEntity.xyGap.put(Constants.GestureMoveEvent.KEY_Y, this.df.format(f5 - f2));
            } catch (JSONException unused3) {
            }
            gestureEntity.trails = getMoveTrail(gestureData.moveEvent, this.dm);
            gestureEntity.tm = System.currentTimeMillis();
            gestureEntity.stm = SntpUtil.currentTimeMillis();
            gestureEntity.pvSession = Statistics.getSession();
            if (!TextUtils.isEmpty(this.pageInfoKey)) {
                gestureEntity.pvCid = Statistics.getCid(this.pageInfoKey);
                gestureEntity.pvReqId = Statistics.getRequestId(this.pageInfoKey);
            }
            if (TextUtils.isEmpty(gestureEntity.pvCid)) {
                gestureEntity.pvCid = "unKnow";
            }
            if (TextUtils.isEmpty(gestureEntity.pvReqId)) {
                gestureEntity.pvReqId = "unKnow";
            }
            if (ConfigManager.getInstance(context).isCollectGestureOn() && isCustomCollectGestureOn()) {
                gestureEntity.collectId = "1";
            } else if (ConfigManager.getInstance(context).isCollectGestureOn()) {
                gestureEntity.collectId = "2";
            } else if (isCustomCollectGestureOn()) {
                gestureEntity.collectId = this.currentCustomCollectKey;
            } else {
                gestureEntity.collectId = "";
            }
            if (ConfigManager.getInstance(context).isReportGestureOn() && isCustomReportGestureOn()) {
                gestureEntity.reportId = "1";
            } else if (ConfigManager.getInstance(context).isReportGestureOn()) {
                gestureEntity.reportId = "2";
            } else if (isCustomReportGestureOn()) {
                gestureEntity.reportId = this.currentCustomReportKey;
            } else {
                gestureEntity.reportId = "-999";
            }
            DefaultEnvironment defaultEnvironment = Statistics.getDefaultEnvironment();
            if (defaultEnvironment != null && (environment = defaultEnvironment.getEnvironment()) != null) {
                gestureEntity.lat = environment.get("lat");
                gestureEntity.lng = environment.get("lng");
                gestureEntity.scale = environment.get("scale");
            }
            gestureEntity.sdkVersion = BuildConfig.LX_VERSION_NAME;
        } catch (Exception unused4) {
        }
        return gestureEntity;
    }

    private JSONArray getMoveTrail(List<GestureMoveEvent> list, DisplayMetrics displayMetrics) {
        Object[] objArr = {list, displayMetrics};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f821ac7eee5a1dc4286ddb2a9d35858", 6917529027641081856L)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f821ac7eee5a1dc4286ddb2a9d35858");
        }
        if (list == null || list.size() <= 2) {
            return null;
        }
        List<GestureMoveEvent> DouglasPeucker = GestureUtils.DouglasPeucker(list, 15);
        LogUtil.log("Gesture", "=============== result: " + DouglasPeucker.size());
        JSONArray jSONArray = new JSONArray();
        try {
            for (GestureMoveEvent gestureMoveEvent : DouglasPeucker) {
                JSONObject jSONObject = new JSONObject();
                float f = gestureMoveEvent.x / displayMetrics.widthPixels;
                float f2 = gestureMoveEvent.y / displayMetrics.heightPixels;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                jSONObject.put(Constants.GestureMoveEvent.KEY_X, this.df.format(f));
                jSONObject.put(Constants.GestureMoveEvent.KEY_Y, this.df.format(f2));
                jSONObject.put("t", gestureMoveEvent.time);
                jSONObject.put("p", this.df.format(gestureMoveEvent.p));
                if (jSONArray.length() > 100) {
                    break;
                }
                jSONArray.put(jSONObject);
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }
}
