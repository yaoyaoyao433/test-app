package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.FileProvider;
import android.support.v4.util.Pair;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.d;
import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
@ReactModule(name = RNCWebViewModule.MODULE_NAME)
/* loaded from: classes3.dex */
public class RNCWebViewModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    private static final int FILE_DOWNLOAD_PERMISSION_REQUEST = 1;
    public static final String MODULE_NAME = "RNCWebView";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    protected static final b shouldOverrideUrlLoadingLock = new b();
    private DownloadManager.Request downloadRequest;
    private ValueCallback<Uri[]> filePathCallback;
    private ValueCallback<Uri> filePathCallbackLegacy;
    private File outputImage;
    private File outputVideo;
    private f webviewFileDownloaderPermissionListener;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        private int a = 0;
        private final HashMap<Integer, AtomicReference<a>> b = new HashMap<>();

        /* compiled from: ProGuard */
        /* loaded from: classes3.dex */
        public enum a {
            UNDECIDED,
            SHOULD_OVERRIDE,
            DO_NOT_OVERRIDE
        }

        protected b() {
        }

        public final synchronized Pair<Integer, AtomicReference<a>> a() {
            int i;
            AtomicReference<a> atomicReference;
            i = this.a;
            this.a = i + 1;
            atomicReference = new AtomicReference<>(a.UNDECIDED);
            this.b.put(Integer.valueOf(i), atomicReference);
            return new Pair<>(Integer.valueOf(i), atomicReference);
        }

        @Nullable
        public final synchronized AtomicReference<a> a(Integer num) {
            return this.b.get(num);
        }

        public final synchronized void b(Integer num) {
            this.b.remove(num);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        DEFAULT("*/*"),
        IMAGE("image"),
        VIDEO("video");
        
        private final String d;

        a(String str) {
            this.d = str;
        }
    }

    public RNCWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.webviewFileDownloaderPermissionListener = new f() { // from class: com.reactnativecommunity.webview.RNCWebViewModule.1
            @Override // com.facebook.react.modules.core.f
            public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
                if (i != 1) {
                    return false;
                }
                if (iArr.length <= 0 || !com.meituan.android.mrn.privacy.a.a(iArr[0])) {
                    if (RNCWebViewModule.this.getCurrentActivity() != null) {
                        com.sankuai.meituan.android.ui.widget.a.a(RNCWebViewModule.this.getCurrentActivity(), "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.", 0).a();
                    }
                } else if (RNCWebViewModule.this.downloadRequest != null) {
                    RNCWebViewModule.this.downloadFile();
                }
                return true;
            }
        };
        reactApplicationContext.addActivityEventListener(this);
    }

    @ReactMethod
    public void isFileUploadSupported(Promise promise) {
        Boolean bool = Boolean.FALSE;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            bool = Boolean.TRUE;
        }
        if (i >= 16 && i <= 18) {
            bool = Boolean.TRUE;
        }
        promise.resolve(bool);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public void onShouldStartLoadWithRequestCallback(boolean z, int i) {
        AtomicReference<b.a> a2 = shouldOverrideUrlLoadingLock.a(Integer.valueOf(i));
        if (a2 != null) {
            synchronized (a2) {
                try {
                    a2.set(z ? b.a.DO_NOT_OVERRIDE : b.a.SHOULD_OVERRIDE);
                    a2.notify();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        if (this.filePathCallback == null && this.filePathCallbackLegacy == null) {
            return;
        }
        boolean z = this.outputImage != null && this.outputImage.length() > 0;
        boolean z2 = this.outputVideo != null && this.outputVideo.length() > 0;
        if (i != 1) {
            if (i == 3) {
                if (i2 != -1) {
                    this.filePathCallbackLegacy.onReceiveValue(null);
                } else if (z) {
                    this.filePathCallbackLegacy.onReceiveValue(getOutputUri(this.outputImage));
                } else if (z2) {
                    this.filePathCallbackLegacy.onReceiveValue(getOutputUri(this.outputVideo));
                } else {
                    this.filePathCallbackLegacy.onReceiveValue(intent.getData());
                }
            }
        } else if (i2 != -1) {
            if (this.filePathCallback != null) {
                this.filePathCallback.onReceiveValue(null);
            }
        } else if (z) {
            this.filePathCallback.onReceiveValue(new Uri[]{getOutputUri(this.outputImage)});
        } else if (z2) {
            this.filePathCallback.onReceiveValue(new Uri[]{getOutputUri(this.outputVideo)});
        } else {
            this.filePathCallback.onReceiveValue(getSelectedFiles(intent, i2));
        }
        if (this.outputImage != null && !z) {
            this.outputImage.delete();
        }
        if (this.outputVideo != null && !z2) {
            this.outputVideo.delete();
        }
        this.filePathCallback = null;
        this.filePathCallbackLegacy = null;
        this.outputImage = null;
        this.outputVideo = null;
    }

    private Uri[] getSelectedFiles(Intent intent, int i) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() != null) {
            int itemCount = intent.getClipData().getItemCount();
            Uri[] uriArr = new Uri[itemCount];
            for (int i2 = 0; i2 < itemCount; i2++) {
                uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
            }
            return uriArr;
        } else if (intent.getData() == null || i != -1 || Build.VERSION.SDK_INT < 21) {
            return null;
        } else {
            return WebChromeClient.FileChooserParams.parseResult(i, intent);
        }
    }

    public void startPhotoPickerIntent(ValueCallback<Uri> valueCallback, String str) {
        Intent videoIntent;
        Intent photoIntent;
        this.filePathCallbackLegacy = valueCallback;
        Intent createChooser = Intent.createChooser(getFileChooserIntent(str), "");
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(str).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
            arrayList.add(photoIntent);
        }
        if (acceptsVideo(str).booleanValue() && (videoIntent = getVideoIntent()) != null) {
            arrayList.add(videoIntent);
        }
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (createChooser.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(createChooser, 3);
        }
    }

    @RequiresApi(api = 21)
    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, String[] strArr, boolean z) {
        Intent videoIntent;
        Intent photoIntent;
        this.filePathCallback = valueCallback;
        ArrayList arrayList = new ArrayList();
        if (!needsCameraPermission()) {
            if (acceptsImages(strArr).booleanValue() && (photoIntent = getPhotoIntent()) != null) {
                arrayList.add(photoIntent);
            }
            if (acceptsVideo(strArr).booleanValue() && (videoIntent = getVideoIntent()) != null) {
                arrayList.add(videoIntent);
            }
        }
        Intent fileChooserIntent = getFileChooserIntent(strArr, z);
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INTENT", fileChooserIntent);
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intent.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(intent, 1);
        }
        return true;
    }

    public void setDownloadRequest(DownloadManager.Request request) {
        this.downloadRequest = request;
    }

    public void downloadFile() {
        ((DownloadManager) getCurrentActivity().getBaseContext().getSystemService("download")).enqueue(this.downloadRequest);
        if (getCurrentActivity() != null) {
            com.sankuai.meituan.android.ui.widget.a.a(getCurrentActivity(), "Downloading", 0).a();
        }
    }

    public boolean grantFileDownloaderPermissions() {
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return false;
        }
        boolean b2 = com.meituan.android.mrn.privacy.a.b(currentActivity, PermissionGuard.PERMISSION_STORAGE_WRITE, "pt-c0c25465aaa8c16e");
        if (!b2 && Build.VERSION.SDK_INT >= 23) {
            com.meituan.android.mrn.privacy.a.a(currentActivity, PermissionGuard.PERMISSION_STORAGE_WRITE, "pt-c0c25465aaa8c16e", new d() { // from class: com.reactnativecommunity.webview.RNCWebViewModule.2
                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str, int i) {
                    RNCWebViewModule.this.webviewFileDownloaderPermissionListener.onRequestPermissionsResult(1, new String[]{PermissionGuard.PERMISSION_STORAGE_WRITE}, new int[]{i});
                }
            });
        }
        return b2;
    }

    protected boolean needsCameraPermission() {
        Activity currentActivity = getCurrentActivity();
        return currentActivity == null || !com.meituan.android.mrn.privacy.a.b(currentActivity, PermissionGuard.PERMISSION_CAMERA, "pt-89d65e14ca86bbbc");
    }

    private Intent getPhotoIntent() {
        Intent intent;
        try {
            this.outputImage = getCapturedFile(a.IMAGE);
            Uri outputUri = getOutputUri(this.outputImage);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            try {
                intent.putExtra("output", outputUri);
            } catch (IOException | IllegalArgumentException e) {
                e = e;
                Log.e("CREATE FILE", "Error occurred while creating the File", e);
                e.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e2) {
            e = e2;
            intent = null;
        }
        return intent;
    }

    private Intent getVideoIntent() {
        Intent intent;
        try {
            this.outputVideo = getCapturedFile(a.VIDEO);
            Uri outputUri = getOutputUri(this.outputVideo);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            try {
                intent.putExtra("output", outputUri);
            } catch (IOException | IllegalArgumentException e) {
                e = e;
                Log.e("CREATE FILE", "Error occurred while creating the File", e);
                e.printStackTrace();
                return intent;
            }
        } catch (IOException | IllegalArgumentException e2) {
            e = e2;
            intent = null;
        }
        return intent;
    }

    private Intent getFileChooserIntent(String str) {
        String str2 = str.isEmpty() ? a.DEFAULT.d : str;
        if (str.matches("\\.\\w+")) {
            str2 = getMimeTypeFromExtension(str.replace(CommonConstant.Symbol.DOT, ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(a.DEFAULT.d);
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        return intent;
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(CommonConstant.Symbol.DOT, ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(a.IMAGE.d));
    }

    private Boolean acceptsImages(String[] strArr) {
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, a.DEFAULT.d).booleanValue() || arrayContainsString(acceptedMimeType, a.IMAGE.d).booleanValue());
    }

    private Boolean acceptsVideo(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return Boolean.FALSE;
        }
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(CommonConstant.Symbol.DOT, ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(a.VIDEO.d));
    }

    private Boolean acceptsVideo(String[] strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            return Boolean.FALSE;
        }
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        return Boolean.valueOf(arrayContainsString(acceptedMimeType, a.DEFAULT.d).booleanValue() || arrayContainsString(acceptedMimeType, a.VIDEO.d).booleanValue());
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (noAcceptTypesSet(strArr).booleanValue()) {
            return new String[]{a.DEFAULT.d};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.matches("\\.\\w+")) {
                String mimeTypeFromExtension = getMimeTypeFromExtension(str.replace(CommonConstant.Symbol.DOT, ""));
                if (mimeTypeFromExtension != null) {
                    strArr2[i] = mimeTypeFromExtension;
                } else {
                    strArr2[i] = str;
                }
            } else {
                strArr2[i] = str;
            }
        }
        return strArr2;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(File file) {
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        String packageName = getReactApplicationContext().getPackageName();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        return FileProvider.getUriForFile(reactApplicationContext, packageName + ".fileprovider", file);
    }

    private File getCapturedFile(a aVar) throws IOException {
        String str = "";
        String str2 = "";
        switch (aVar) {
            case IMAGE:
                str = "image-";
                str2 = ".jpg";
                break;
            case VIDEO:
                str = "video-";
                str2 = ".mp4";
                break;
        }
        String str3 = str + String.valueOf(System.currentTimeMillis()) + str2;
        File b2 = q.b(getReactApplicationContext(), RNCWebViewManager.KEY_CIPS, "CapturedFile", u.e);
        if (!b2.exists()) {
            b2.mkdirs();
        }
        return File.createTempFile(str3, str2, b2);
    }

    private Boolean noAcceptTypesSet(String[] strArr) {
        boolean z = true;
        if (strArr.length != 0 && (strArr.length != 1 || strArr[0] == null || strArr[0].length() != 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private e getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (!(currentActivity instanceof e)) {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
        return (e) currentActivity;
    }
}
