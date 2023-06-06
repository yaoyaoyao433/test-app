package com.meituan.android.common.horn;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.dianping.titans.utils.Constants;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ServiceForegroundHelper;
import com.sankuai.waimai.foundation.core.lifecycle.c;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HornPushService extends IntentService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Map<String, MsgCallback> mPushCallback = new ConcurrentHashMap();
    public static boolean isOpen = false;

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "254cb929b4cf868d93ddff50fe747d2d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "254cb929b4cf868d93ddff50fe747d2d");
            return;
        }
        c.b(this);
        super.onDestroy();
    }

    public static void optPushCallback(String str, MsgCallback msgCallback) {
        Object[] objArr = {str, msgCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "776de64190e0b9221194ebc08e48b4ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "776de64190e0b9221194ebc08e48b4ff");
        } else if (msgCallback == null) {
        } else {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (mPushCallback.containsKey(str)) {
                    mPushCallback.remove(str);
                }
                mPushCallback.put(str, msgCallback);
            } catch (Throwable unused) {
            }
        }
    }

    public HornPushService() {
        super("HornPushService");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9abd740d1dcee13aaea476b3801a13c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9abd740d1dcee13aaea476b3801a13c");
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88225cabe0fdab67ee6912f86f37e735", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88225cabe0fdab67ee6912f86f37e735");
            return;
        }
        c.a(this);
        super.onCreate();
        ServiceForegroundHelper.startForeground(this);
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39b58e83066053c488f5c7c2036a5adf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39b58e83066053c488f5c7c2036a5adf");
        } else if (intent == null) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (isOpen) {
                ServiceForegroundHelper.startForeground(this);
            }
            try {
                String a = f.a(intent, "message");
                Logw.d(Logw.TAG, "push msg:" + a);
                String string = new JSONObject(new JSONObject(a).getString("extra")).getString("from");
                Logw.d(Logw.TAG, "push from:" + string);
                HashMap hashMap = new HashMap();
                hashMap.put("source", "push");
                hashMap.put(Constants.HTTP_HEADER_KEY_E_TAG, "");
                hashMap.put("key", "receive_push");
                hashMap.put("value", "1");
                hashMap.put("from", string);
                hashMap.put("ts", Long.valueOf(currentTimeMillis));
                MsgCallback msgCallback = mPushCallback.get(string);
                if (msgCallback != null) {
                    Logw.d(Logw.TAG, "load config from push receiver~");
                    msgCallback.MsgArrives(0, string, hashMap);
                }
            } catch (Throwable th) {
                if (InnerHorn.isDebug) {
                    th.printStackTrace();
                }
            }
            try {
                Thread.sleep(LocationStrategy.LOCATION_TIMEOUT);
            } catch (InterruptedException e) {
                if (InnerHorn.isDebug) {
                    e.printStackTrace();
                }
            }
            stopSelf();
        }
    }

    public static void startHornService(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af39d05bc1a15113ad38666a38659c5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af39d05bc1a15113ad38666a38659c5b");
            return;
        }
        try {
            Intent intent2 = new Intent(context, HornPushService.class);
            intent2.putExtra("message", f.a(intent, "message"));
            ServiceForegroundHelper.startService(context, intent2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
