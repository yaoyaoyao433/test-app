package com.dianping.live.live.mrn;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b<T> {
        void exitFullScreen(T t);

        void mute(T t, a aVar);

        void pause(T t);

        void play(T t);

        void requestFullScreen(T t);

        void resume(T t);

        void seek(T t, int i);

        void stop(T t);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public boolean a;

        public a(boolean z) {
            this.a = z;
        }
    }
}
