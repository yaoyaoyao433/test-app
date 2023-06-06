package com.meituan.msi.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EventHandler {
    public static final String EVENT_DOWNLOAD_OR_UPLOAD_PERFORMANCE_INNER = "onUploadPerformanceEventInner";
    public static final String EVENT_JUMP_LINK_INNER = "onJumpToLink";
    public static final String EVENT_LOGIN_INNER = "onUser";
    public static final String EVENT_OPEN_LINK_INNER = "onOpenLink";
    public static final String EVENT_REQUEST_PERFORMANCE_INNER = "onRequestPerformanceEventInner";
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface InnerEventType {
    }
}
