package com.meituan.android.common.metricx;

import android.support.annotation.NonNull;
import com.meituan.android.common.metricx.bytehook.ByteHookConfig;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class Config {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NonNull
    public abstract ByteHookConfig getByteHookConfig();
}
