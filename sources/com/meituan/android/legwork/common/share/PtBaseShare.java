package com.meituan.android.legwork.common.share;

import android.app.Activity;
import android.support.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface PtBaseShare {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnShareListener {

        /* compiled from: ProGuard */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface ShareStatus {
        }

        void a(int i, int i2);
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ShareChannel {
    }

    void a(@NonNull Activity activity, int i, @NonNull PtShareBean ptShareBean, @NonNull OnShareListener onShareListener, String str);
}
