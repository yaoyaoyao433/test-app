package com.facebook.react.modules.camera;

import android.net.Uri;
import android.util.Base64OutputStream;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.horn.f;
import com.meituan.android.privacy.interfaces.Privacy;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
@ReactModule(name = ImageStoreManager.NAME)
/* loaded from: classes.dex */
public class ImageStoreManager extends ReactContextBaseJavaModule {
    private static final int BUFFER_SIZE = 8192;
    public static final String NAME = "ImageStoreManager";

    @ReactMethod
    public void addImageFromBase64(String str, Callback callback, Callback callback2) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void hasImageForTag(String str, Callback callback) {
    }

    @ReactMethod
    public void removeImageForTag(String str) {
    }

    public ImageStoreManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void getBase64ForTag(String str, Callback callback, Callback callback2) {
        f.a().a(getReactApplicationContext(), "ImageStoreManager.getBase64ForTag");
        getBase64ForTagForPrivacy(str, "", callback, callback2);
    }

    @ReactMethod
    public void getBase64ForTagForPrivacy(String str, String str2, Callback callback, Callback callback2) {
        b.a(new a(getReactApplicationContext(), str, str2, callback, callback2), c.a(), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a extends GuardedAsyncTask<Void, Void> {
        private final String b;
        private final Callback c;
        private final Callback d;
        private final String e;

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public final /* synthetic */ void doInBackgroundGuarded(Void[] voidArr) {
            try {
                InputStream b = Privacy.createContentResolver(ImageStoreManager.this.getReactApplicationContext(), this.e).b(Uri.parse(this.b));
                try {
                    this.c.invoke(ImageStoreManager.this.convertInputStreamToBase64OutputStream(b));
                } catch (IOException e) {
                    this.d.invoke(e.getMessage());
                }
                ImageStoreManager.closeQuietly(b);
            } catch (FileNotFoundException e2) {
                this.d.invoke(e2.getMessage());
            }
        }

        private a(ReactContext reactContext, String str, String str2, Callback callback, Callback callback2) {
            super(reactContext);
            this.b = str;
            this.e = str2;
            this.c = callback;
            this.d = callback2;
        }
    }

    String convertInputStreamToBase64OutputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    base64OutputStream.write(bArr, 0, read);
                } else {
                    closeQuietly(base64OutputStream);
                    return byteArrayOutputStream.toString();
                }
            } catch (Throwable th) {
                closeQuietly(base64OutputStream);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
