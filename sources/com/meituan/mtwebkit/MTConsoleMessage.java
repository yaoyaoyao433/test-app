package com.meituan.mtwebkit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTConsoleMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private MessageLevel mLevel;
    private int mLineNumber;
    private String mMessage;
    private String mSourceId;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum MessageLevel {
        TIP,
        LOG,
        WARNING,
        ERROR,
        DEBUG;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        MessageLevel() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d70850525df72a9578cdb673d3799af3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d70850525df72a9578cdb673d3799af3");
            }
        }

        public static MessageLevel valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6be8364bc2a3b7649874d95849fe3275", RobustBitConfig.DEFAULT_VALUE) ? (MessageLevel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6be8364bc2a3b7649874d95849fe3275") : (MessageLevel) Enum.valueOf(MessageLevel.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static MessageLevel[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "044ef54f42bc62ab7595081d570062d3", RobustBitConfig.DEFAULT_VALUE) ? (MessageLevel[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "044ef54f42bc62ab7595081d570062d3") : (MessageLevel[]) values().clone();
        }
    }

    public MTConsoleMessage(String str, String str2, int i, MessageLevel messageLevel) {
        Object[] objArr = {str, str2, Integer.valueOf(i), messageLevel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05f6f04a6d27358d7d26629269007501", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05f6f04a6d27358d7d26629269007501");
            return;
        }
        this.mMessage = str;
        this.mSourceId = str2;
        this.mLineNumber = i;
        this.mLevel = messageLevel;
    }

    public MessageLevel messageLevel() {
        return this.mLevel;
    }

    public String message() {
        return this.mMessage;
    }

    public String sourceId() {
        return this.mSourceId;
    }

    public int lineNumber() {
        return this.mLineNumber;
    }
}
