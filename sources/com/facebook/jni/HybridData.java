package com.facebook.jni;

import com.facebook.jni.DestructorThread;
import com.facebook.proguard.annotations.DoNotStrip;
import com.meituan.android.soloader.k;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes.dex */
public class HybridData {
    @DoNotStrip
    private Destructor mDestructor = new Destructor(this);

    static {
        k.b("fb");
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }

    public boolean isValid() {
        return this.mDestructor.mNativePointer != 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class Destructor extends DestructorThread.Destructor {
        @DoNotStrip
        private long mNativePointer;

        static native void deleteNative(long j);

        Destructor(Object obj) {
            super(obj);
        }

        @Override // com.facebook.jni.DestructorThread.Destructor
        void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0L;
        }
    }
}
