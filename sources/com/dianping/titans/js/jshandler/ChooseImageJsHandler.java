package com.dianping.titans.js.jshandler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.dianping.titans.js.DelegatedJsHandler;
import com.dianping.titans.js.IJSHandlerDelegate;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.utils.ContentResolverProvider;
import com.dianping.titansmodel.apimodel.b;
import com.dianping.titansmodel.e;
import com.huawei.hms.api.ConnectionResult;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRuntime;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.titans.widget.MediaWidget;
import com.sankuai.titans.widget.PickerBuilder;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import com.tencent.rtmp.TXLiveConstants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ChooseImageJsHandler extends DelegatedJsHandler<b, com.dianping.titansmodel.b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final HashSet<Integer> sRequestCodes = new HashSet<>();
    private final int mRequestCode;

    @Override // com.dianping.titans.js.DelegatedJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    public ChooseImageJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a3430b6fea50a7fb657eb0ed4dab92c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a3430b6fea50a7fb657eb0ed4dab92c");
        } else {
            this.mRequestCode = getRequestCode();
        }
    }

    private int getRequestCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b04badab9d06fb737ea785056cb59b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b04badab9d06fb737ea785056cb59b4")).intValue();
        }
        int nextInt = new Random().nextInt(1000);
        while (true) {
            int i = nextInt + ConnectionResult.NETWORK_ERROR;
            if (sRequestCodes.contains(Integer.valueOf(i))) {
                nextInt = new Random().nextInt(1000);
            } else {
                sRequestCodes.add(Integer.valueOf(i));
                return i;
            }
        }
    }

    @Override // com.dianping.titans.js.DelegatedJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6aefc0057b07f9a1ed3cf99f04a984b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6aefc0057b07f9a1ed3cf99f04a984b");
            return;
        }
        super.onDestroy();
        sRequestCodes.clear();
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d44e306879a85b736397e580aac3983d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d44e306879a85b736397e580aac3983d");
            return;
        }
        b args = args();
        Activity activity = jsHost().getActivity();
        if (args == null || activity == null) {
            jsCallbackError(521, "param is null");
            return;
        }
        boolean needCamera = needCamera(args.d);
        final String sceneToken = getSceneToken();
        if (needCamera) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(PermissionGuard.PERMISSION_CAMERA);
            arrayList.add(PermissionGuard.PERMISSION_STORAGE);
            TitansPermissionUtil.requestPermissions(activity, arrayList, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.ChooseImageJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z, int i) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "265b9a99592fac71ccb129ac285bac06", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "265b9a99592fac71ccb129ac285bac06");
                    } else if (z) {
                        ChooseImageJsHandler.this.chooseImage(ChooseImageJsHandler.this.args(), ChooseImageJsHandler.this);
                    } else {
                        ChooseImageJsHandler chooseImageJsHandler = ChooseImageJsHandler.this;
                        chooseImageJsHandler.failCallbackWithoutPermission(i, "requestPermission error sceneToken is " + sceneToken);
                    }
                }
            });
            return;
        }
        TitansPermissionUtil.requestPermission(activity, PermissionGuard.PERMISSION_STORAGE_READ, sceneToken, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.ChooseImageJsHandler.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.result.IRequestPermissionCallback
            public void onResult(boolean z, int i) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "93c0228693e2cb1db65ec938d259fb84", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "93c0228693e2cb1db65ec938d259fb84");
                } else if (z) {
                    ChooseImageJsHandler.this.chooseImage(ChooseImageJsHandler.this.args(), ChooseImageJsHandler.this);
                } else {
                    ChooseImageJsHandler chooseImageJsHandler = ChooseImageJsHandler.this;
                    chooseImageJsHandler.failCallbackWithoutPermission(i, "requestPermission error sceneToken is " + sceneToken);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failCallbackWithoutPermission(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b00e433bf8ded09a24758b054526ac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b00e433bf8ded09a24758b054526ac2");
            return;
        }
        com.dianping.titansmodel.b bVar = new com.dianping.titansmodel.b();
        bVar.b = new e[0];
        bVar.errorCode = i;
        bVar.errorMsg = str;
        failCallback(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void chooseImage(b bVar, IJSHandlerDelegate<com.dianping.titansmodel.b> iJSHandlerDelegate) {
        Object[] objArr = {bVar, iJSHandlerDelegate};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfe59f3addb071350ba943d3765a63de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfe59f3addb071350ba943d3765a63de");
            return;
        }
        com.dianping.titansmodel.b bVar2 = new com.dianping.titansmodel.b();
        bVar2.b = new e[0];
        JsHost jsHost = iJSHandlerDelegate.getJsHost();
        if (jsHost == null) {
            bVar2.errorMsg = "no host";
            iJSHandlerDelegate.failCallback(bVar2);
            return;
        }
        final Activity activity = jsHost.getActivity();
        if (activity == null) {
            bVar2.errorMsg = "no activity";
            iJSHandlerDelegate.failCallback(bVar2);
        } else if (bVar != null) {
            final PickerBuilder pickerBuilder = new PickerBuilder();
            pickerBuilder.object = bVar;
            pickerBuilder.getBundle().putBoolean(PickerBuilder.EXTRA_SHOW_GIF, true);
            pickerBuilder.maxCount(bVar.b <= 0 ? 9 : bVar.b);
            pickerBuilder.mediaType("image").mediaSize("original");
            pickerBuilder.requestCode(this.mRequestCode);
            pickerBuilder.accessToken(getSceneToken());
            if (bVar.h != null && bVar.h.length() > 0) {
                String[] strArr = new String[bVar.h.length()];
                for (int i = 0; i < bVar.h.length(); i++) {
                    String optString = bVar.h.optString(i);
                    if (!TextUtils.equals(optString, "original") && !TextUtils.equals(optString, "compressed")) {
                        bVar2.errorMsg = "invalid sizeType";
                        iJSHandlerDelegate.failCallback(bVar2);
                        return;
                    }
                    strArr[i] = optString;
                }
                pickerBuilder.mediaSize(strArr);
            }
            if (TextUtils.isEmpty(bVar.d)) {
                iJSHandlerDelegate.setOnActivityResultListener(new ResultImpl(bVar2, bVar, null, iJSHandlerDelegate, this.mRequestCode));
            } else if (WmChooseMediaModule.TYPE_CAMERA.equalsIgnoreCase(bVar.d)) {
                File createImageFile = MediaWidget.getInstance().createImageFile();
                if (createImageFile == null) {
                    bVar2.errorMsg = "camera type createImageFile return null";
                    iJSHandlerDelegate.failCallback(bVar2);
                    return;
                }
                pickerBuilder.source(WmChooseMediaModule.TYPE_CAMERA);
                pickerBuilder.resultFile(createImageFile);
                iJSHandlerDelegate.setOnActivityResultListener(new ResultImpl(bVar2, bVar, createImageFile, iJSHandlerDelegate, this.mRequestCode));
            } else {
                pickerBuilder.source("album");
                iJSHandlerDelegate.setOnActivityResultListener(new ResultImpl(bVar2, bVar, null, iJSHandlerDelegate, this.mRequestCode));
            }
            try {
                KNBRuntime.getRuntime().executeOnUIThread(new Runnable() { // from class: com.dianping.titans.js.jshandler.ChooseImageJsHandler.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ac057be6cb5e321e8560758bcd0807d7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ac057be6cb5e321e8560758bcd0807d7");
                        } else {
                            MediaWidget.getInstance().openMediaPicker(activity, pickerBuilder);
                        }
                    }
                });
            } catch (Exception e) {
                bVar2.errorMsg = e.getMessage();
                iJSHandlerDelegate.failCallback(bVar2);
            }
        } else {
            bVar2.errorMsg = "choose data is null";
            iJSHandlerDelegate.failCallback(bVar2);
        }
    }

    private boolean needCamera(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e097f9d7f62142a26d47ddc87101c58b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e097f9d7f62142a26d47ddc87101c58b")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return WmChooseMediaModule.TYPE_CAMERA.equalsIgnoreCase(str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class ResultImpl implements IJSHandlerDelegate.OnActivityResultListener {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final IJSHandlerDelegate<com.dianping.titansmodel.b> callback;
        public final com.dianping.titansmodel.b chooseImage;
        private final int mRequestCode;
        public final b param;
        public final File photoFile;

        public ResultImpl(com.dianping.titansmodel.b bVar, b bVar2, File file, IJSHandlerDelegate<com.dianping.titansmodel.b> iJSHandlerDelegate, int i) {
            Object[] objArr = {ChooseImageJsHandler.this, bVar, bVar2, file, iJSHandlerDelegate, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "702e33c7e26d13f7f6267d3cce573274", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "702e33c7e26d13f7f6267d3cce573274");
                return;
            }
            this.callback = iJSHandlerDelegate;
            this.chooseImage = bVar;
            this.param = bVar2;
            this.photoFile = file;
            this.mRequestCode = i;
        }

        @Override // com.dianping.titans.js.IJSHandlerDelegate.OnActivityResultListener
        public void onActivityResult(int i, int i2, Intent intent) {
            boolean z;
            ArrayList<String> stringArrayList;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c09ba27a7a4841cf091de8ff6ae5e384", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c09ba27a7a4841cf091de8ff6ae5e384");
            } else if (i == this.mRequestCode) {
                if (i2 == -1) {
                    KNBTitansChooseImageTask.Params params = new KNBTitansChooseImageTask.Params();
                    Bundle onActivityResult = MediaWidget.onActivityResult(ChooseImageJsHandler.this.jsHost().getActivity(), i, i2, intent, ChooseImageJsHandler.this.getSceneToken());
                    if (onActivityResult == null || (stringArrayList = onActivityResult.getStringArrayList(PickerBuilder.KEY_SELECTED_PHOTOS)) == null) {
                        if (this.photoFile == null) {
                            this.chooseImage.errorMsg = "choose camera cancelled.";
                            this.callback.successCallback(this.chooseImage);
                            return;
                        }
                        params.files = Arrays.asList(this.photoFile.getAbsolutePath());
                        z = false;
                    } else {
                        z = onActivityResult.getInt(PickerBuilder.OUTPUT_MEDIA_SIZE, 0) != 0;
                        if (stringArrayList.isEmpty()) {
                            this.chooseImage.errorMsg = "selected images empty.";
                            this.callback.successCallback(this.chooseImage);
                            return;
                        }
                        params.files = new ArrayList();
                        for (String str : stringArrayList) {
                            if (str != null) {
                                params.files.add(str);
                            }
                        }
                    }
                    params.imageTitans = this.param;
                    params.needCompressPic = z;
                    params.quality = 50;
                    params.scale = 0;
                    if (z) {
                        this.chooseImage.c = System.currentTimeMillis();
                    }
                    new KNBTitansChooseImageTask(this.callback, this.chooseImage, ChooseImageJsHandler.this.getSceneToken()).run(params);
                    return;
                }
                this.chooseImage.errorMsg = "choose gallery cancelled.";
                this.callback.successCallback(this.chooseImage);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class KNBTitansChooseImageTask extends AsyncTask<Params, Void, com.dianping.titansmodel.b> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final IJSHandlerDelegate<com.dianping.titansmodel.b> callback;
        public final com.dianping.titansmodel.b chooseImage;
        public final String sceneToken;

        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        public static class Params {
            public static ChangeQuickRedirect changeQuickRedirect;
            public List<String> files;
            public b imageTitans;
            public boolean needCompressPic;
            public int quality;
            public int scale;
        }

        public KNBTitansChooseImageTask(IJSHandlerDelegate<com.dianping.titansmodel.b> iJSHandlerDelegate, com.dianping.titansmodel.b bVar, String str) {
            Object[] objArr = {iJSHandlerDelegate, bVar, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24b0d2778979b7a64a66d363319d0467", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24b0d2778979b7a64a66d363319d0467");
                return;
            }
            this.callback = iJSHandlerDelegate;
            this.chooseImage = bVar;
            this.sceneToken = str;
        }

        public void run(final Params... paramsArr) {
            Object[] objArr = {paramsArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "368827dab0ec9beb1627b7f5f39abf76", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "368827dab0ec9beb1627b7f5f39abf76");
            } else {
                KNBRuntime.getRuntime().executeOnThreadPool(new Runnable() { // from class: com.dianping.titans.js.jshandler.ChooseImageJsHandler.KNBTitansChooseImageTask.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4d8f551322fa8380997cd226cf81b659", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4d8f551322fa8380997cd226cf81b659");
                        } else {
                            KNBTitansChooseImageTask.this.onPostExecute(KNBTitansChooseImageTask.this.doInBackground(paramsArr));
                        }
                    }
                });
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
            if (android.text.TextUtils.isEmpty(r8) == false) goto L47;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[Catch: Throwable -> 0x0152, OutOfMemoryError -> 0x0159, TryCatch #2 {OutOfMemoryError -> 0x0159, Throwable -> 0x0152, blocks: (B:14:0x0036, B:15:0x003c, B:17:0x0042, B:19:0x004a, B:21:0x0053, B:23:0x005b, B:29:0x006c, B:30:0x007c, B:32:0x0081, B:34:0x008d, B:35:0x00a2, B:37:0x00a8, B:38:0x00ac, B:40:0x00b4, B:46:0x00e2, B:50:0x0110, B:52:0x0124, B:54:0x012a, B:55:0x013a, B:43:0x00cf, B:47:0x00f9, B:49:0x010e, B:56:0x013f), top: B:63:0x0036 }] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.dianping.titansmodel.b doInBackground(com.dianping.titans.js.jshandler.ChooseImageJsHandler.KNBTitansChooseImageTask.Params... r13) {
            /*
                Method dump skipped, instructions count: 361
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.titans.js.jshandler.ChooseImageJsHandler.KNBTitansChooseImageTask.doInBackground(com.dianping.titans.js.jshandler.ChooseImageJsHandler$KNBTitansChooseImageTask$Params[]):com.dianping.titansmodel.b");
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(com.dianping.titansmodel.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36f780afa8d767c3726e81535d13168d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36f780afa8d767c3726e81535d13168d");
                return;
            }
            super.onPostExecute((KNBTitansChooseImageTask) bVar);
            bVar.d = System.currentTimeMillis();
            this.callback.successCallback(bVar);
        }

        private ExifInterface getExifInterface(Context context, String str) {
            ExifInterface exifInterface;
            Object[] objArr = {context, str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c837da1e2e88e738d46d5f5a02b4eeb", RobustBitConfig.DEFAULT_VALUE)) {
                return (ExifInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c837da1e2e88e738d46d5f5a02b4eeb");
            }
            try {
                if (Build.VERSION.SDK_INT >= 24 && URLUtil.isContentUrl(str)) {
                    exifInterface = new ExifInterface(ContentResolverProvider.getContentResolver(context, this.sceneToken).a(Uri.parse(str), r.o).getFileDescriptor());
                } else {
                    exifInterface = new ExifInterface(str);
                }
                return exifInterface;
            } catch (IOException unused) {
                return null;
            }
        }

        private int getExifOrientation(ExifInterface exifInterface) {
            int attributeInt;
            Object[] objArr = {exifInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed6adbd6446149175f936bc31a484b9d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed6adbd6446149175f936bc31a484b9d")).intValue();
            }
            if (exifInterface == null || (attributeInt = exifInterface.getAttributeInt("Orientation", -1)) == -1) {
                return 0;
            }
            if (attributeInt != 3) {
                if (attributeInt != 6) {
                    return attributeInt != 8 ? 0 : 270;
                }
                return 90;
            }
            return TXLiveConstants.RENDER_ROTATION_180;
        }
    }
}
