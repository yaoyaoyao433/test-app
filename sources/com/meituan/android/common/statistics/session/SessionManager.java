package com.meituan.android.common.statistics.session;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.android.common.statistics.sfrom.SFromManager;
import com.meituan.android.common.statistics.utils.SharedPreferencesHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.takeoutnew.util.aop.b;
import java.util.Random;
import java.util.UUID;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SessionManager {
    public static final String ACTION_SESSION_CHANGED = "lx.session.changed";
    private static String MSID = "";
    private static String appSession = "";
    private static long appSessionLastTime = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static long lastTime = 0;
    private static String uuid = "";

    public static synchronized String getSession() {
        String str;
        synchronized (SessionManager.class) {
            str = MSID;
        }
        return str;
    }

    public static synchronized String getAppSession() {
        String str;
        synchronized (SessionManager.class) {
            str = appSession;
        }
        return str;
    }

    public static synchronized String getMSID(Context context) {
        synchronized (SessionManager.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e6669fa38535783b6e5ab542dc44729", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e6669fa38535783b6e5ab542dc44729");
            } else if (hasMSID() && isSessionValid()) {
                lastTime = System.currentTimeMillis();
                return MSID;
            } else {
                return generateNewSession(context);
            }
        }
    }

    public static synchronized String getAppMSID(Context context) {
        synchronized (SessionManager.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8551c290578bfe29af28e8c4f3622cd9", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8551c290578bfe29af28e8c4f3622cd9");
            } else if (hasAppSession() && isAppSessionValid()) {
                appSessionLastTime = System.currentTimeMillis();
                return appSession;
            } else {
                return generateNewAppSession(context);
            }
        }
    }

    public static String generateNewAppSession(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ea3857998d6dcd056cace0ae4c1200be", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ea3857998d6dcd056cace0ae4c1200be");
        }
        appSessionLastTime = System.currentTimeMillis();
        uuid = getUuid(context);
        Random random = new Random();
        String str = uuid + appSessionLastTime + random.nextInt(1000);
        appSession = str;
        return str;
    }

    public static String generateNewSession(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8811a6d33606642ff6fcd0b51fe1efa6", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8811a6d33606642ff6fcd0b51fe1efa6");
        }
        lastTime = System.currentTimeMillis();
        uuid = getUuid(context);
        Random random = new Random();
        MSID = uuid + lastTime + random.nextInt(1000);
        reset(context);
        try {
            Intent intent = new Intent(ACTION_SESSION_CHANGED);
            intent.putExtra("new_session", MSID);
            b.a(context, intent);
        } catch (Exception unused) {
        }
        return MSID;
    }

    public static synchronized void setMSID(String str) {
        synchronized (SessionManager.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "db14a890bd0119ed4b5586cdde11cedc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "db14a890bd0119ed4b5586cdde11cedc");
                return;
            }
            lastTime = System.currentTimeMillis();
            MSID = str;
        }
    }

    public static synchronized void setAppMSID(String str) {
        synchronized (SessionManager.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "41b1b5c82106e0efa5fb5086ade15abd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "41b1b5c82106e0efa5fb5086ade15abd");
                return;
            }
            appSessionLastTime = System.currentTimeMillis();
            appSession = str;
        }
    }

    public static synchronized boolean hasMSID() {
        synchronized (SessionManager.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "733332e8d37ef59bdb24119e8a04c13d", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "733332e8d37ef59bdb24119e8a04c13d")).booleanValue();
            }
            return !TextUtils.isEmpty(MSID);
        }
    }

    public static synchronized boolean isSessionValid() {
        synchronized (SessionManager.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "633b7593f9010d794c397730157c019c", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "633b7593f9010d794c397730157c019c")).booleanValue();
            }
            return System.currentTimeMillis() - lastTime < 1800000;
        }
    }

    public static synchronized boolean hasAppSession() {
        synchronized (SessionManager.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "897ce8062fb6204723dccec3fa25b39b", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "897ce8062fb6204723dccec3fa25b39b")).booleanValue();
            }
            return !TextUtils.isEmpty(appSession);
        }
    }

    public static synchronized boolean isAppSessionValid() {
        synchronized (SessionManager.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "618e8b65d27729c1d252301b2d01ca14", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "618e8b65d27729c1d252301b2d01ca14")).booleanValue();
            }
            return System.currentTimeMillis() - appSessionLastTime < 1800000;
        }
    }

    private static void reset(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6d357db9006d0c607faf9f10b35c2cdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6d357db9006d0c607faf9f10b35c2cdc");
            return;
        }
        SessionBeanManager.resetCurrentSessionBean(context);
        SFromManager.getInstance().clear();
        ScidManager.reset();
    }

    private static String getUuid(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "39b571721b3d4fd74e76f740fdf9dff8", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "39b571721b3d4fd74e76f740fdf9dff8");
        }
        if (!TextUtils.isEmpty(uuid)) {
            return uuid;
        }
        String sessionUuid = SharedPreferencesHelper.getInstance(context).getSessionUuid();
        uuid = sessionUuid;
        if (TextUtils.isEmpty(sessionUuid)) {
            uuid = UUID.randomUUID().toString();
            SharedPreferencesHelper.getInstance(context).saveSessionUuid(uuid);
        }
        return uuid;
    }
}
