package com.meituan.android.mrn.component.mrnwebview;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.FileProvider;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: ProGuard */
@ReactModule(name = MRNWebViewModule.MODULE_NAME)
/* loaded from: classes2.dex */
public class MRNWebViewModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final String MODULE_NAME = "MRNWebView";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String DEFAULT_MIME_TYPES;
    private ValueCallback<Uri[]> filePathCallback;
    private ValueCallback<Uri> filePathCallbackLegacy;
    private Uri outputFileUri;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public MRNWebViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95cd95f117b499f8ec9b093617ba6c71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95cd95f117b499f8ec9b093617ba6c71");
            return;
        }
        this.DEFAULT_MIME_TYPES = "*/*";
        reactApplicationContext.addActivityEventListener(this);
    }

    @ReactMethod
    public void isFileUploadSupported(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4119ab27746ec7b4c6fd71a41b8b4d28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4119ab27746ec7b4c6fd71a41b8b4d28");
            return;
        }
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

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Uri data;
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df06be22f9d4c30692c5561da54391f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df06be22f9d4c30692c5561da54391f4");
        } else if (this.filePathCallback == null && this.filePathCallbackLegacy == null) {
        } else {
            if (i != 1) {
                if (i == 3) {
                    if (i2 != -1) {
                        data = null;
                    } else {
                        data = intent == null ? this.outputFileUri : intent.getData();
                    }
                    this.filePathCallbackLegacy.onReceiveValue(data);
                }
            } else if (i2 != -1) {
                if (this.filePathCallback != null) {
                    this.filePathCallback.onReceiveValue(null);
                }
            } else {
                Uri[] selectedFiles = getSelectedFiles(intent, i2);
                if (selectedFiles != null) {
                    this.filePathCallback.onReceiveValue(selectedFiles);
                } else {
                    this.filePathCallback.onReceiveValue(new Uri[]{this.outputFileUri});
                }
            }
            this.filePathCallback = null;
            this.filePathCallbackLegacy = null;
            this.outputFileUri = null;
        }
    }

    private Uri[] getSelectedFiles(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "812915afef83127222f58122af89d5aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "812915afef83127222f58122af89d5aa");
        }
        if (intent == null) {
            return null;
        }
        if (intent.getData() != null) {
            if (i != -1 || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return WebChromeClient.FileChooserParams.parseResult(i, intent);
        } else if (intent.getClipData() != null) {
            int itemCount = intent.getClipData().getItemCount();
            Uri[] uriArr = new Uri[itemCount];
            for (int i2 = 0; i2 < itemCount; i2++) {
                uriArr[i2] = intent.getClipData().getItemAt(i2).getUri();
            }
            return uriArr;
        } else {
            return null;
        }
    }

    @RequiresApi(api = 21)
    public boolean startPhotoPickerIntent(ValueCallback<Uri[]> valueCallback, Intent intent, String[] strArr, boolean z) throws IOException {
        Object[] objArr = {valueCallback, intent, strArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42a83b67b438b3a70b8dedd282ade59f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42a83b67b438b3a70b8dedd282ade59f")).booleanValue();
        }
        this.filePathCallback = valueCallback;
        ArrayList arrayList = new ArrayList();
        if (acceptsImages(strArr).booleanValue()) {
            arrayList.add(getPhotoIntent());
        }
        if (acceptsVideo(strArr).booleanValue()) {
            arrayList.add(getVideoIntent());
        }
        Intent fileChooserIntent = getFileChooserIntent(strArr, z);
        Intent intent2 = new Intent("android.intent.action.CHOOSER");
        intent2.putExtra("android.intent.extra.INTENT", fileChooserIntent);
        intent2.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intent2.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
            getCurrentActivity().startActivityForResult(intent2, 1);
        }
        return true;
    }

    private Intent getPhotoIntent() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "caf5c4d2b2fc11db0472567117579350", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "caf5c4d2b2fc11db0472567117579350");
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        this.outputFileUri = getOutputUri("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("output", this.outputFileUri);
        return intent;
    }

    private Intent getVideoIntent() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d8552f7eb62826ec40fb091d03cf0ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d8552f7eb62826ec40fb091d03cf0ff");
        }
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        this.outputFileUri = getOutputUri("android.media.action.VIDEO_CAPTURE");
        intent.putExtra("output", this.outputFileUri);
        return intent;
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z) {
        Object[] objArr = {strArr, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "984f1c005cd2622b5d262a52b7a9d462", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "984f1c005cd2622b5d262a52b7a9d462");
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
        return intent;
    }

    private Boolean acceptsImages(String[] strArr) {
        boolean z = true;
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e16ebf4671beeedd218ff8ce90ce37d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e16ebf4671beeedd218ff8ce90ce37d");
        }
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        if (!isArrayEmpty(acceptedMimeType).booleanValue() && !arrayContainsString(acceptedMimeType, "image").booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private Boolean acceptsVideo(String[] strArr) {
        boolean z = true;
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c2181b69b316e6cd291079dec3c861e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c2181b69b316e6cd291079dec3c861e");
        }
        String[] acceptedMimeType = getAcceptedMimeType(strArr);
        if (!isArrayEmpty(acceptedMimeType).booleanValue() && !arrayContainsString(acceptedMimeType, "video").booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        Object[] objArr = {strArr, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9e59f30cf72b13eb4a6271fa25df69c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9e59f30cf72b13eb4a6271fa25df69c");
        }
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "369bb7a9c3666a1f85f849992c7d7347", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "369bb7a9c3666a1f85f849992c7d7347");
        }
        if (isArrayEmpty(strArr).booleanValue()) {
            return new String[]{"*/*"};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.matches("\\.\\w+")) {
                strArr2[i] = getMimeTypeFromExtension(str.replace(CommonConstant.Symbol.DOT, ""));
            } else {
                strArr2[i] = str;
            }
        }
        return strArr2;
    }

    private String getMimeTypeFromExtension(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9aedcd8a6dfb155cc1cb30b6c939876d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9aedcd8a6dfb155cc1cb30b6c939876d");
        }
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65b77c11575656fd4a69fb196c0c1f85", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65b77c11575656fd4a69fb196c0c1f85");
        }
        File capturedFile = getCapturedFile(str);
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(capturedFile);
        }
        String packageName = getReactApplicationContext().getPackageName();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        return FileProvider.getUriForFile(reactApplicationContext, packageName + ".mrnwebview.fileprovider", capturedFile);
    }

    private File getCapturedFile(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "574754f797a033ed22335c8c5ab10657", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "574754f797a033ed22335c8c5ab10657");
        }
        String str2 = "";
        String str3 = "";
        if (str.equals("android.media.action.IMAGE_CAPTURE")) {
            str2 = "image-";
            str3 = ".jpg";
        } else if (str.equals("android.media.action.VIDEO_CAPTURE")) {
            str2 = "video-";
            str3 = ".mp4";
        }
        String str4 = str2 + System.currentTimeMillis() + str3;
        File b = q.b(getReactApplicationContext(), MRNTitansWebViewManager.KEY_CIPS, "CapturedFile", u.e);
        if (!b.exists()) {
            b.mkdirs();
        }
        return File.createTempFile(str4, str3, b);
    }

    private Boolean isArrayEmpty(String[] strArr) {
        boolean z = true;
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b667a02b6cd121b31929e373af673c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b667a02b6cd121b31929e373af673c8");
        }
        if (strArr.length != 0 && (strArr.length != 1 || strArr[0].length() != 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
