package com.dianping.live.live.mrn;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface e<T> {
        void mute(T t, c cVar);

        void pause(T t);

        void pauseBGM(T t);

        void playBGM(T t, a aVar);

        void resume(T t);

        void resumeBGM(T t);

        void sendMessage(T t, b bVar);

        void setBGMVolume(T t, f fVar);

        void setMICVolume(T t, f fVar);

        void snapshot(T t);

        void start(T t);

        void startPreview(T t);

        void stop(T t);

        void stopBGM(T t);

        void stopPreview(T t);

        void switchCamera(T t);

        void toggleTorch(T t, d dVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class d {
        public boolean a;

        public d(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public String a;

        public a(String str) {
            this.a = str;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class f {
        public float a;

        public f(float f) {
            this.a = f;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        public String a;

        public b(String str) {
            this.a = str;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c {
        public boolean a;

        public c(boolean z) {
            this.a = z;
        }
    }
}
