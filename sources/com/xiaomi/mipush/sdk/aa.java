package com.xiaomi.mipush.sdk;

import com.xiaomi.push.ha;
/* loaded from: classes6.dex */
public final /* synthetic */ class aa {
    static final /* synthetic */ int[] a = new int[ha.values().length];

    static {
        try {
            a[ha.Registration.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ha.UnRegistration.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ha.Subscription.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[ha.UnSubscription.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[ha.SendMessage.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[ha.AckMessage.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[ha.SetConfig.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[ha.ReportFeedback.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[ha.Notification.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[ha.Command.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
