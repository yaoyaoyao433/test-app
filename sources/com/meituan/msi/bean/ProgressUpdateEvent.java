package com.meituan.msi.bean;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class ProgressUpdateEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public double progress;
    public String taskId;
    public long totalBytesExpectedToSend;
    public long totalBytesExpectedToWrite;
    public long totalBytesSent;
    public long totalBytesWritten;
}
