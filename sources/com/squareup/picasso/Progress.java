package com.squareup.picasso;

import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class Progress {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface ProgressListener {
        void a(String str, long j, long j2, boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class InstanceHolder {
        private static ImageProgressListener a = new ImageProgressListener();

        private InstanceHolder() {
        }
    }

    public static ProgressListener a() {
        return InstanceHolder.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, ProgressListener progressListener) {
        InstanceHolder.a.a(str, progressListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str) {
        InstanceHolder.a.a(str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static final class ImageProgressListener implements ProgressListener {
        private WeakHashMap<String, ProgressListener> a;

        private ImageProgressListener() {
            this.a = new WeakHashMap<>();
        }

        @Override // com.squareup.picasso.Progress.ProgressListener
        public final void a(String str, long j, long j2, boolean z) {
            ProgressListener progressListener;
            synchronized (this) {
                progressListener = this.a.get(str);
            }
            if (progressListener == null) {
                return;
            }
            progressListener.a(str, j, j2, z);
            if (z) {
                a(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void a(String str, ProgressListener progressListener) {
            this.a.put(str, progressListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void a(String str) {
            this.a.remove(str);
        }
    }
}
