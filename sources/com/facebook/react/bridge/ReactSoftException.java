package com.facebook.react.bridge;

import com.facebook.common.logging.a;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
@DoNotStrip
@Deprecated
/* loaded from: classes.dex */
public class ReactSoftException {
    private static final List<ReactSoftExceptionListener> sListeners = new CopyOnWriteArrayList();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface ReactSoftExceptionListener {
        void logSoftException(String str, Throwable th);
    }

    @DoNotStrip
    public static void addListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        if (sListeners.contains(reactSoftExceptionListener)) {
            return;
        }
        sListeners.add(reactSoftExceptionListener);
    }

    @DoNotStrip
    public static void removeListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        sListeners.remove(reactSoftExceptionListener);
    }

    @DoNotStrip
    public static void clearListeners() {
        sListeners.clear();
    }

    @DoNotStrip
    public static void logSoftException(String str, Throwable th) {
        if (sListeners.size() > 0) {
            for (ReactSoftExceptionListener reactSoftExceptionListener : sListeners) {
                reactSoftExceptionListener.logSoftException(str, th);
            }
            return;
        }
        a.b(str, "Unhandled SoftException", th);
    }
}
