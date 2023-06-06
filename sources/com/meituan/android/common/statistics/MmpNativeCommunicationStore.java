package com.meituan.android.common.statistics;

import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MmpNativeCommunicationStore {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile boolean sSendMmpPD;
    private static StorePDData sStorePDData;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class StorePDData {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String appMsId;
        public String appName;
        public String category;
        public String cid;
        public EventName eventName;
        public int isAuto;
        public String msId;
        public int nt;
        public long pvTm;
        public String refCid;
        public String refReqId;
        public String reqId;
        public JSONObject valLab;
    }

    public static void setStorePDData(boolean z) {
        sSendMmpPD = z;
    }

    public static boolean isSendMmpPD() {
        return sSendMmpPD;
    }

    public static void setStorePDData(StorePDData storePDData) {
        sStorePDData = storePDData;
    }

    public static StorePDData getStorePDData() {
        return sStorePDData;
    }

    public static void clearStorePDData() {
        sStorePDData = null;
    }
}
