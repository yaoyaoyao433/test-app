package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.meituan.android.soloader.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BlobCollector {
    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeInstall(Object obj, long j);

    BlobCollector() {
    }

    static {
        k.b("reactnativeblob");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(final ReactContext reactContext, final BlobModule blobModule) {
        reactContext.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.modules.blob.BlobCollector.1
            @Override // java.lang.Runnable
            public final void run() {
                JavaScriptContextHolder javaScriptContextHolder = ReactContext.this.getJavaScriptContextHolder();
                if (javaScriptContextHolder.get() != 0) {
                    BlobCollector.nativeInstall(blobModule, javaScriptContextHolder.get());
                }
            }
        });
    }
}
