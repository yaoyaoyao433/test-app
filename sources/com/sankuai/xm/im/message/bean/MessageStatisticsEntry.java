package com.sankuai.xm.im.message.bean;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MessageStatisticsEntry {
    public static final String EVENT_NAME = "sendmessage";
    public static final String PARAM_CHANNEL = "chid";
    public static final String PARAM_CHAT = "chatid";
    public static final String PARAM_MSG = "msg";
    public static final String PARAM_MSG_CATEGORY = "msgcategory";
    public static final String PARAM_MSG_ID = "mid";
    public static final String PARAM_MSG_TYPE = "msgtype";
    public static final String PARAM_NET = "net";
    public static final String PARAM_RESULT = "result";
    public static final String PARAM_RETRY = "retries";
    public static final String PARAM_SERVER_CODE = "code";
    public static final String PARAM_TIMES = "time";
    public static ChangeQuickRedirect changeQuickRedirect;
    private long endStamp;
    private String entryKey;
    private HashMap<String, Object> entryValues;
    private long startStamp;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class Result {
        public static final int DB_ERROR = 1;
        public static final int OK = 0;
        public static final int OTHER_ERROR = 4;
        public static final int SERVER_ERROR = 3;
        public static final int UPLOAD_ERROR = 2;
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public MessageStatisticsEntry(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97485d47f355dad51c23ac1e703ee623", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97485d47f355dad51c23ac1e703ee623");
            return;
        }
        this.entryValues = new HashMap<>();
        this.entryKey = str;
    }

    public synchronized MessageStatisticsEntry addEntryValue(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8962d0a7458d88978c7992127ff5f336", 6917529027641081856L)) {
            return (MessageStatisticsEntry) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8962d0a7458d88978c7992127ff5f336");
        }
        this.entryValues.put(str, obj);
        return this;
    }

    public synchronized HashMap<String, Object> getEntryValues() {
        return this.entryValues;
    }

    public synchronized void initMessageEntryValue(@NonNull IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b88a9b9904f4b2e0c2f93dbda29fa3b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b88a9b9904f4b2e0c2f93dbda29fa3b0");
            return;
        }
        this.entryValues.put(PARAM_MSG_TYPE, Integer.valueOf(iMMessage.getMsgType()));
        this.entryValues.put(PARAM_MSG_CATEGORY, Integer.valueOf(iMMessage.getCategory()));
        this.entryValues.put(PARAM_CHANNEL, Short.valueOf(iMMessage.getChannel()));
        HashMap<String, Object> hashMap = this.entryValues;
        hashMap.put(PARAM_CHAT, iMMessage.getChatId() + CommonConstant.Symbol.UNDERLINE + iMMessage.getPeerUid());
        this.entryValues.put(PARAM_RETRY, 0);
    }

    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f75735d2760e9f7b59b0988e021cae4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f75735d2760e9f7b59b0988e021cae4");
        } else {
            this.startStamp = System.currentTimeMillis();
        }
    }

    public void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5606c0e75100336bade258c151ef9cf4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5606c0e75100336bade258c151ef9cf4");
        } else if (this.endStamp == 0) {
            this.endStamp = System.currentTimeMillis();
            addEntryValue("time", Long.valueOf(this.endStamp - this.startStamp));
        }
    }

    public synchronized void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fc34ae1c92ac626935974b3fd3502c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fc34ae1c92ac626935974b3fd3502c5");
        } else {
            this.entryValues.clear();
        }
    }
}
