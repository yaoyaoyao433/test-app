package com.meituan.android.downloadmanager.callback;

import android.support.annotation.NonNull;
import com.meituan.android.downloadmanager.model.DownloadInfo;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface b {
    void a(@NonNull DownloadInfo downloadInfo);

    void a(Exception exc);

    void b(@NonNull DownloadInfo downloadInfo);

    void b(Exception exc);

    void c(@NonNull DownloadInfo downloadInfo);
}
