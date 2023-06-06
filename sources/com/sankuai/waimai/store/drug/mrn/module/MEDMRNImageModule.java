package com.sankuai.waimai.store.drug.mrn.module;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.titans.utils.LocalIdUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.meituan.android.common.statistics.quickreport.QuickReportConstants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.titans.widget.IMediaWidgetCallback;
import com.sankuai.titans.widget.MediaWidget;
import com.sankuai.titans.widget.PickerBuilder;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.upload.ImageInfo;
import com.sankuai.waimai.store.base.net.upload.UploadInfo;
import com.sankuai.waimai.store.im.base.net.c;
import com.sankuai.waimai.store.order.prescription.upload.b;
import com.sankuai.waimai.store.order.prescription.upload.d;
import com.sankuai.waimai.store.order.prescription.upload.e;
import com.sankuai.waimai.store.order.prescription.upload.f;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.r;
import com.tencent.mapsdk.internal.jw;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MEDMRNImageModule extends ReactContextBaseJavaModule implements f.b<String> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ArrayList<e> mData;
    private Promise mPromise;
    private b mUploader;
    private int mViewHeight;
    private int mViewWidth;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MEDMRNImageUpLoader";
    }

    @Override // com.sankuai.waimai.store.order.prescription.upload.f.b
    public void onTaskProgress(int i, int i2, int i3) {
    }

    @Override // com.sankuai.waimai.store.order.prescription.upload.f.b
    public void onTaskStart(int i, int i2) {
    }

    public MEDMRNImageModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "720e636a676282df09035423757ed8cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "720e636a676282df09035423757ed8cf");
            return;
        }
        this.mData = new ArrayList<>();
        this.mViewWidth = 0;
        this.mViewHeight = 0;
    }

    @ReactMethod
    public void uploadImageWithLocalId(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a243324fe581b7a9911171062c7357bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a243324fe581b7a9911171062c7357bd");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.drug.mrn.module.MEDMRNImageModule.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9f0779f903901dc0ce4f784ed1a9d172", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9f0779f903901dc0ce4f784ed1a9d172");
                        return;
                    }
                    String string = readableMap.getString(DeviceInfo.LOCAL_ID);
                    int i = readableMap.getInt("width");
                    int i2 = readableMap.getInt("height");
                    String string2 = readableMap.getString("sceneToken");
                    if (TextUtils.isEmpty(string)) {
                        promise.reject("-1001", "localId is empty");
                        return;
                    }
                    MEDMRNImageModule.this.mPromise = promise;
                    MEDMRNImageModule.this.mData.clear();
                    try {
                        Uri uri = LocalIdUtils.getUri(string);
                        if (uri != null) {
                            String a2 = com.sankuai.waimai.store.mrn.af.b.a(MEDMRNImageModule.this.getCurrentActivity(), uri, string2);
                            if (TextUtils.isEmpty(a2)) {
                                promise.reject("-1003", "can not find image path");
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(a2);
                            MEDMRNImageModule.this.addImages(MEDMRNImageModule.this.getCurrentActivity(), arrayList, i, i2, null);
                            return;
                        }
                        promise.reject("-1003", "uri is null");
                    } catch (Exception unused) {
                        promise.reject("-1002", "upload error");
                    }
                }
            }, getName());
        }
    }

    @ReactMethod
    public void uploadImage(ReadableMap readableMap, final Promise promise) {
        byte[] bArr;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f36a03c96ded28ff6e5f069ca21c126c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f36a03c96ded28ff6e5f069ca21c126c");
            return;
        }
        byte[] bArr2 = new byte[0];
        int i = readableMap.getInt("width");
        int i2 = readableMap.getInt("height");
        final String string = readableMap.getString("path");
        String string2 = readableMap.getString("sceneToken");
        if (t.a(string)) {
            promise.reject(new Exception("path is null"));
            return;
        }
        try {
            bArr = com.sankuai.shangou.stone.util.b.b(com.sankuai.waimai.store.base.net.upload.a.a(getCurrentActivity(), Uri.parse(string), string2), i, i2);
        } catch (IOException e) {
            promise.reject(e);
            bArr = bArr2;
        }
        if (bArr == null) {
            promise.reject(new Exception("bytes may not null"));
        } else {
            c.a((Object) null).a(UploadInfo.getMultiPart("file", "image.jpg", UploadInfo.getDefaultRequestBody(bArr)), new j<ImageInfo>() { // from class: com.sankuai.waimai.store.drug.mrn.module.MEDMRNImageModule.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b6acf4d25c1cfb95d933f285d39928cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b6acf4d25c1cfb95d933f285d39928cc");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(ImageInfo imageInfo) {
                    ImageInfo imageInfo2 = imageInfo;
                    Object[] objArr2 = {imageInfo2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "574cabe157e05c9571e7d95ee57208e8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "574cabe157e05c9571e7d95ee57208e8");
                    } else if (t.a(imageInfo2.url)) {
                        promise.reject(new Exception("api 返回图片为空"));
                    } else {
                        imageInfo2.filePath = string;
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString("url", imageInfo2.url);
                        createMap.putString(QuickReportConstants.CONFIG_FILE_NAME, imageInfo2.fileName);
                        createMap.putString("path", imageInfo2.filePath);
                        promise.resolve(createMap);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4b1ef51f93c86c62ae37fa3feae29693", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4b1ef51f93c86c62ae37fa3feae29693");
                    } else {
                        promise.reject(bVar);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void uploadImageWithLocalIdArray(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd60c7731da9eb38dadb01ad71022272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd60c7731da9eb38dadb01ad71022272");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.drug.mrn.module.MEDMRNImageModule.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Uri uri;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1fd826e1b41a778649ca4223f6e0d43f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1fd826e1b41a778649ca4223f6e0d43f");
                        return;
                    }
                    ReadableArray array = readableMap.getArray("localIdArray");
                    int i = readableMap.getInt("width");
                    int i2 = readableMap.getInt("height");
                    String string = readableMap.getString("sceneToken");
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < array.size(); i3++) {
                        try {
                            String string2 = array.getMap(i3).getString(DeviceInfo.LOCAL_ID);
                            if (!TextUtils.isEmpty(string2) && (uri = LocalIdUtils.getUri(string2)) != null) {
                                String a2 = com.sankuai.waimai.store.mrn.af.b.a(MEDMRNImageModule.this.getCurrentActivity(), uri, string);
                                if (!TextUtils.isEmpty(a2)) {
                                    arrayList.add(a2);
                                }
                            }
                        } catch (Exception unused) {
                            promise.reject("-1002", "upload error");
                            return;
                        }
                    }
                    if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                        MEDMRNImageModule.this.mPromise = promise;
                        MEDMRNImageModule.this.mData.clear();
                        MEDMRNImageModule.this.addImages(MEDMRNImageModule.this.getCurrentActivity(), arrayList, i, i2, null);
                        return;
                    }
                    promise.reject("-1001", "localId array is empty");
                }
            }, getName());
        }
    }

    @ReactMethod
    public void chooseImage(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4567381b018c629d5201ac64efe1bcc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4567381b018c629d5201ac64efe1bcc1");
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.drug.mrn.module.MEDMRNImageModule.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8719613aa65ff3542b35ecb02cf871e9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8719613aa65ff3542b35ecb02cf871e9");
                        return;
                    }
                    final Activity currentActivity = MEDMRNImageModule.this.getCurrentActivity();
                    if (currentActivity == null) {
                        if (promise != null) {
                            promise.resolve(new WritableNativeArray());
                            return;
                        }
                        return;
                    }
                    MEDMRNImageModule.this.mPromise = promise;
                    MEDMRNImageModule.this.mData.clear();
                    HashMap<String, Object> hashMap = readableMap.toHashMap();
                    String string = readableMap.getString("warningMsg");
                    final String string2 = readableMap.getString("sceneToken");
                    ReadableArray array = readableMap.getArray("selectedImages");
                    int intValue = Double.valueOf(r.a(String.valueOf(hashMap.get("maxCount")), 1.0d)).intValue();
                    MEDMRNImageModule.this.mViewWidth = h.a(currentActivity, Double.valueOf(r.a(String.valueOf(hashMap.get(DMKeys.KEY_VIEW_WIDTH)), 0.0d)).intValue());
                    MEDMRNImageModule.this.mViewHeight = h.a(currentActivity, Double.valueOf(r.a(String.valueOf(hashMap.get(DMKeys.KEY_VIEW_HEIGHT)), 0.0d)).intValue());
                    PickerBuilder pickerBuilder = new PickerBuilder();
                    pickerBuilder.mediaType("image").source("album", WmChooseMediaModule.TYPE_CAMERA);
                    pickerBuilder.chosenAssets(MEDMRNImageModule.this.getSelectImage(array));
                    if (intValue <= 0) {
                        intValue = 1;
                    }
                    pickerBuilder.maxCount(intValue);
                    pickerBuilder.maxCountHint(string);
                    pickerBuilder.finishCallback(new IMediaWidgetCallback() { // from class: com.sankuai.waimai.store.drug.mrn.module.MEDMRNImageModule.4.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.titans.widget.IMediaWidgetCallback
                        public final void onResult(ArrayList<String> arrayList, int i) {
                            Object[] objArr3 = {arrayList, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "3eb87fc166a04222b8039fc0d564de7c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "3eb87fc166a04222b8039fc0d564de7c");
                                return;
                            }
                            try {
                                if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                                    if (MEDMRNImageModule.this.mPromise != null) {
                                        MEDMRNImageModule.this.mPromise.resolve(new WritableNativeArray());
                                        return;
                                    }
                                    return;
                                }
                                MEDMRNImageModule.this.transmitDataToMRN(currentActivity, arrayList, string2, promise);
                            } catch (Exception e) {
                                com.dianping.judas.util.a.a(e);
                                if (MEDMRNImageModule.this.mPromise != null) {
                                    MEDMRNImageModule.this.mPromise.resolve(new WritableNativeArray());
                                }
                            }
                        }
                    });
                    MediaWidget.getInstance().openMediaPicker(currentActivity, pickerBuilder);
                }
            }, getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<String> getSelectImage(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33ec22a9007c5e542314e799bf72f76a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33ec22a9007c5e542314e799bf72f76a");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (readableArray == null) {
            return arrayList;
        }
        ArrayList<Object> arrayList2 = readableArray.toArrayList();
        if (com.sankuai.shangou.stone.util.a.b(arrayList2)) {
            return arrayList;
        }
        Iterator<Object> it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                arrayList.add((String) next);
            }
        }
        return arrayList;
    }

    @ReactMethod
    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b555ab174e16d16cb4b292b8a094f6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b555ab174e16d16cb4b292b8a094f6b");
            return;
        }
        this.mData.clear();
        if (this.mUploader != null) {
            this.mUploader.cancel();
            this.mUploader = null;
        }
        this.mPromise = null;
        this.mViewWidth = 0;
        this.mViewHeight = 0;
        al.a(new Runnable() { // from class: com.sankuai.waimai.store.drug.mrn.module.MEDMRNImageModule.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "40bbd27fb0c0a5b88107721ababc5d8b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "40bbd27fb0c0a5b88107721ababc5d8b");
                } else {
                    al.cancel(MEDMRNImageModule.this.getName());
                }
            }
        }, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addImages(@NonNull Activity activity, ArrayList<String> arrayList, int i, int i2, String str) {
        Object[] objArr = {activity, arrayList, Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "572098ff64773bdb15f4dfcf180c8640", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "572098ff64773bdb15f4dfcf180c8640");
            return;
        }
        setHookFactory(i, i2, str);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!TextUtils.isEmpty(next)) {
                this.mData.add(new e(next));
            }
        }
        for (int i3 = 0; i3 < this.mData.size(); i3++) {
            this.mData.get(i3).b = i3;
        }
        if (this.mUploader == null) {
            this.mUploader = new b(activity);
            this.mUploader.e = this;
        }
        if (this.mUploader.a(this.mData)) {
            return;
        }
        this.mPromise.resolve(new WritableNativeArray());
    }

    private void setHookFactory(final int i, final int i2, final String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "680b5455ba9a692ad8532e6a9b35f1f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "680b5455ba9a692ad8532e6a9b35f1f0");
            return;
        }
        if (i <= 0) {
            i = jw.h;
        }
        if (i2 <= 0) {
            i2 = jw.h;
        }
        str = (t.a(str) || str.length() <= 1) ? "v1/upload/inquiry" : "v1/upload/inquiry";
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        d.b = new com.sankuai.waimai.store.order.prescription.upload.a() { // from class: com.sankuai.waimai.store.drug.mrn.module.MEDMRNImageModule.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.order.prescription.upload.c
            @NonNull
            public final com.sankuai.waimai.ugc.image.a a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a51894f0ee6644534765785212841d36", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.ugc.image.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a51894f0ee6644534765785212841d36") : com.sankuai.waimai.order.confirm.image.upload.a.a(i, i2, str);
            }
        };
    }

    @Override // com.sankuai.waimai.store.order.prescription.upload.f.b
    public boolean isFinishing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "860fa641598c28f584225de2d7645918", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "860fa641598c28f584225de2d7645918")).booleanValue() : getCurrentActivity() == null || getCurrentActivity().isFinishing();
    }

    @Override // com.sankuai.waimai.store.order.prescription.upload.f.b
    public void onTaskFailed(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35de333232d8630dc213330d887e6cf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35de333232d8630dc213330d887e6cf9");
            return;
        }
        e eVar = (e) com.sankuai.shangou.stone.util.a.a((List<Object>) this.mData, i);
        if (eVar != null) {
            this.mData.remove(i);
            this.mPromise.reject("UPLOAD_FAILED", eVar.c);
        }
    }

    @Override // com.sankuai.waimai.store.order.prescription.upload.f.b
    public void onTaskSuccess(int i, String str, int i2) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50e564486271186dc48b84d7cede2341", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50e564486271186dc48b84d7cede2341");
            return;
        }
        e eVar = (e) com.sankuai.shangou.stone.util.a.a((List<Object>) this.mData, i);
        if (eVar != null) {
            eVar.d = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void transmitDataToMRN(@NonNull final Activity activity, final ArrayList<String> arrayList, @Nullable final String str, final Promise promise) {
        Object[] objArr = {activity, arrayList, str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "461233d0eb389a4d9f94c796a2c4b8a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "461233d0eb389a4d9f94c796a2c4b8a1");
        } else {
            al.a(new al.b<WritableArray>() { // from class: com.sankuai.waimai.store.drug.mrn.module.MEDMRNImageModule.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ WritableArray a() {
                    Bitmap a2;
                    byte[] a3;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bfa4b68fe9989a7ecbdb137ac234d141", RobustBitConfig.DEFAULT_VALUE)) {
                        return (WritableArray) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bfa4b68fe9989a7ecbdb137ac234d141");
                    }
                    WritableNativeArray writableNativeArray = new WritableNativeArray();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        String a4 = com.sankuai.waimai.store.base.net.upload.a.a(activity, Uri.parse(str2), str);
                        if (MEDMRNImageModule.this.mViewHeight <= 0 || MEDMRNImageModule.this.mViewWidth <= 0) {
                            a2 = com.sankuai.waimai.launcher.util.image.a.a(a4);
                        } else {
                            a2 = com.sankuai.shangou.stone.util.b.a(a4, MEDMRNImageModule.this.mViewWidth, MEDMRNImageModule.this.mViewHeight);
                        }
                        if (a2 != null && (a3 = com.sankuai.shangou.stone.util.b.a(a2)) != null) {
                            String encodeToString = Base64.encodeToString(a3, 0);
                            if (!a2.isRecycled()) {
                                a2.recycle();
                            }
                            if (!TextUtils.isEmpty(encodeToString)) {
                                WritableNativeMap writableNativeMap = new WritableNativeMap();
                                writableNativeMap.putString("path", str2);
                                writableNativeMap.putString("localPath", a4);
                                writableNativeMap.putString("base64", encodeToString.replace("\n", ""));
                                writableNativeArray.pushMap((WritableMap) writableNativeMap);
                            }
                        }
                    }
                    return writableNativeArray;
                }

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(WritableArray writableArray) {
                    WritableArray writableArray2 = writableArray;
                    Object[] objArr2 = {writableArray2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "108e3330747dbb229cf22e0cbbf3be7d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "108e3330747dbb229cf22e0cbbf3be7d");
                    } else {
                        promise.resolve(writableArray2);
                    }
                }
            }, getName());
        }
    }

    @Override // com.sankuai.waimai.store.order.prescription.upload.f.b
    public void onTasksComplete(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44260ce5e148ac9c63d0c6a5db1045a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44260ce5e148ac9c63d0c6a5db1045a6");
            return;
        }
        final WritableNativeArray writableNativeArray = new WritableNativeArray();
        final ArrayList arrayList = new ArrayList();
        Iterator<e> it = this.mData.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (!TextUtils.isEmpty(next.c) && !TextUtils.isEmpty(next.d) && new File(next.c).exists()) {
                arrayList.add(next);
            }
        }
        al.a(new al.b<List<a>>() { // from class: com.sankuai.waimai.store.drug.mrn.module.MEDMRNImageModule.8
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.util.al.b
            public final /* synthetic */ List<a> a() {
                Bitmap a2;
                byte[] a3;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5a3a392c107f7a1b290dcba990cee7d1", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5a3a392c107f7a1b290dcba990cee7d1");
                }
                ArrayList arrayList2 = new ArrayList();
                for (e eVar : arrayList) {
                    if (MEDMRNImageModule.this.mViewHeight <= 0 || MEDMRNImageModule.this.mViewWidth <= 0) {
                        a2 = com.sankuai.waimai.launcher.util.image.a.a(eVar.c);
                    } else {
                        a2 = com.sankuai.shangou.stone.util.b.a(eVar.c, MEDMRNImageModule.this.mViewWidth, MEDMRNImageModule.this.mViewHeight);
                    }
                    if (a2 != null && (a3 = com.sankuai.shangou.stone.util.b.a(a2)) != null) {
                        String encodeToString = Base64.encodeToString(a3, 0);
                        if (!a2.isRecycled()) {
                            a2.recycle();
                        }
                        if (!TextUtils.isEmpty(encodeToString)) {
                            a aVar = new a();
                            aVar.a = eVar.d;
                            aVar.b = encodeToString.replace("\n", "");
                            arrayList2.add(aVar);
                        }
                    }
                }
                return arrayList2;
            }

            @Override // com.sankuai.waimai.store.util.al.b
            public final /* synthetic */ void a(List<a> list) {
                List<a> list2 = list;
                Object[] objArr2 = {list2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2ec226366d82ebef8211c16225fc0e24", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2ec226366d82ebef8211c16225fc0e24");
                    return;
                }
                for (a aVar : list2) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("id", aVar.a);
                    writableNativeMap.putString("base64", aVar.b);
                    writableNativeArray.pushMap((WritableMap) writableNativeMap);
                }
                if (MEDMRNImageModule.this.mPromise != null) {
                    MEDMRNImageModule.this.mPromise.resolve(writableNativeArray);
                }
            }
        }, getName());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
        public String a;
        public String b;

        public a() {
        }
    }

    @ReactMethod
    public void getImageAbsolutePath(ReadableArray readableArray, String str, Promise promise) {
        int size;
        Object[] objArr = {readableArray, str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54bcd59e69ddcd4d95d5bb8cf5840f4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54bcd59e69ddcd4d95d5bb8cf5840f4e");
            return;
        }
        if (readableArray != null) {
            try {
                size = readableArray.size();
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
                com.sankuai.waimai.store.base.log.a.a(e);
                promise.reject("-1", "获取图片绝对路径失败");
                return;
            }
        } else {
            size = 0;
        }
        if (size == 0) {
            promise.reject("-1", "uri列表为空");
            return;
        }
        ArrayList<Object> arrayList = readableArray.toArrayList();
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < size; i++) {
            String str2 = (String) arrayList.get(i);
            String a2 = com.sankuai.waimai.store.mrn.af.b.a(getCurrentActivity(), Uri.parse(str2), str);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("imageUri", str2);
            createMap.putString("imagePath", a2);
            createArray.pushMap(createMap);
        }
        promise.resolve(createArray);
    }

    @ReactMethod
    public void savePicToAlbum(String str, String str2, final Promise promise) {
        Object[] objArr = {str, str2, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76c44a10a09c7ddf62e5fb153d88722f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76c44a10a09c7ddf62e5fb153d88722f");
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        if (com.sankuai.waimai.store.util.b.a(currentActivity)) {
            return;
        }
        r.b bVar = new r.b() { // from class: com.sankuai.waimai.store.drug.mrn.module.MEDMRNImageModule.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.util.r.b
            public final Context a() {
                return currentActivity;
            }

            @Override // com.sankuai.waimai.store.util.r.b
            public final void a(String str3, Uri uri) {
                Object[] objArr2 = {str3, uri};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f1b22dbcc1a271c421b2d863dcd013de", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f1b22dbcc1a271c421b2d863dcd013de");
                } else {
                    com.sankuai.waimai.store.mrn.d.a(promise);
                }
            }

            @Override // com.sankuai.waimai.store.util.r.b
            public final void a(String str3, String str4) {
                Object[] objArr2 = {str3, str4};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "930958ff51aaf60256c2a4082c214a1a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "930958ff51aaf60256c2a4082c214a1a");
                } else {
                    com.sankuai.waimai.store.mrn.d.a(promise, new RuntimeException(str4));
                }
            }
        };
        Object[] objArr2 = {str, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.util.r.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "65496d0ded2d80981c7c916bbfe8cddb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "65496d0ded2d80981c7c916bbfe8cddb");
        } else {
            al.a(new r.c(str, str2, bVar), str);
        }
    }
}
