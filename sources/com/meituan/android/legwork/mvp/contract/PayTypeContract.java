package com.meituan.android.legwork.mvp.contract;

import android.support.v4.app.FragmentManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class PayTypeContract {

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface BalanceCheckStatus {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface PayType {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface PayTypeAction {
    }

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface PayTypeFrom {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        FragmentManager a();

        void a(int i);

        void a(int i, String str);

        void a(boolean z, String str, Map<String, Object> map);

        void b();

        void c();

        void d();

        void e();
    }
}
