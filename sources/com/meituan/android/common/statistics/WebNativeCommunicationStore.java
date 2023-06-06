package com.meituan.android.common.statistics;

import com.meituan.robust.ChangeQuickRedirect;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WebNativeCommunicationStore {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile boolean sendWebPD;
    private static StoreData storeData;
    private static StorePDData storePDData;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class StoreData {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String webCid;
        public String webReqId;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class StorePDData {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String pvAppMsid;
        public String pvCategory;
        public String pvCid;
        public JSONObject pvCustom;
        public String pvMsid;
        public String pvRefCid;
        public String pvRefReqId;
        public String pvReqId;
        public JSONObject pvTag;
        public long pvTm;
        public JSONObject pvVallab;
        public String webCid;
        public String webRefCid;
        public String webRefReqId;
        public String webReqId;
    }

    public static synchronized void setStoreData(StoreData storeData2) {
        synchronized (WebNativeCommunicationStore.class) {
            storeData = storeData2;
        }
    }

    public static synchronized StoreData getStoreData() {
        StoreData storeData2;
        synchronized (WebNativeCommunicationStore.class) {
            storeData2 = storeData;
        }
        return storeData2;
    }

    public static synchronized void clearStoreData() {
        synchronized (WebNativeCommunicationStore.class) {
            storeData = null;
        }
    }

    public static void setStorePDData(StorePDData storePDData2) {
        storePDData = storePDData2;
    }

    public static StorePDData getStorePDData() {
        return storePDData;
    }

    public static void clearStorePDData() {
        storePDData = null;
    }

    public static void setSendWebPD(boolean z) {
        sendWebPD = z;
    }

    public static boolean isSendWebPD() {
        return sendWebPD;
    }
}
