package com.meituan.android.mrn.component.video;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface c<T> {
        void pause(T t);

        void prepare(T t);

        void release(T t);

        void reset(T t);

        void seekTo(T t, C0284a c0284a);

        void setVolume(T t, b bVar);

        void start(T t);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mrn.component.video.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0284a {
        public final int a;

        public C0284a(int i) {
            this.a = i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public final double a;

        public b(double d) {
            this.a = d;
        }
    }
}
