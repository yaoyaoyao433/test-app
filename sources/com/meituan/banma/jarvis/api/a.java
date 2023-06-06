package com.meituan.banma.jarvis.api;

import com.meituan.banma.jarvis.env.d;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.banma.jarvis.api.a$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[d.valuesCustom().length];

        static {
            try {
                a[d.ENV_RELEASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.ENV_STAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.ENV_TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.ENV_DEV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
