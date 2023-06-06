package com.meituan.android.common.aidata.ai.bundle.download.exception;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TimeoutException extends DownloadException {
    public static ChangeQuickRedirect changeQuickRedirect;

    public TimeoutException() {
        super((int) DownloadException.DOWNLOAD_TIME_OUT);
    }
}
