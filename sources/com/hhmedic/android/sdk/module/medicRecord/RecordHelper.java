package com.hhmedic.android.sdk.module.medicRecord;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.Gson;
import com.hhmedic.android.sdk.base.utils.HHImageUtils;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.model.HHCaseImageModel;
import com.hhmedic.android.sdk.module.SDKRoute;
import com.hhmedic.android.sdk.module.medicRecord.CopyThread;
import com.hhmedic.android.sdk.module.medicRecord.HHImageCompress;
import com.hhmedic.android.sdk.module.permission.PermissionUtils;
import com.hhmedic.android.sdk.module.uploader.HHUploadListener;
import com.hhmedic.android.sdk.module.uploader.HHUploadResponse;
import com.hhmedic.android.sdk.module.uploader.HHUploader;
import com.hhmedic.android.sdk.module.video.VideoAct;
import com.hhmedic.android.sdk.module.video.VideoBundle;
import com.hhmedic.android.sdk.module.video.data.entity.HHSDKConfigModel;
import com.hhmedic.android.sdk.uikit.utils.HHBitmapUtils;
import com.hhmedic.android.sdk.uikit.widget.HHTips;
import com.hhmedic.android.sdk.uikit.widget.dialog.HHUIBottomSheet;
import com.sankuai.waimai.platform.utils.f;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RecordHelper implements HHUploadListener {
    private static final String CACHE_KEY = "hh.video.images.key";
    private final Activity mActivity;
    private RecordUploadCallback mCallback;
    private HHImageCompress mCompress;
    private HHSDKConfigModel mConfigModel;
    private MRecordInfo mData;
    private OnPhotoWays mOnWays;
    private String mTakePath;
    private final HHTips mTips = new HHTips();
    private final HHImageCompress.HHImageCompressListener mCompressListener = new HHImageCompress.HHImageCompressListener() { // from class: com.hhmedic.android.sdk.module.medicRecord.RecordHelper.2
        @Override // com.hhmedic.android.sdk.module.medicRecord.HHImageCompress.HHImageCompressListener
        public void onSuccess(List<String> list) {
            RecordHelper.this.bindImagePaths(list);
        }

        @Override // com.hhmedic.android.sdk.module.medicRecord.HHImageCompress.HHImageCompressListener
        public void onError(String str) {
            RecordHelper.this.mTips.errorTips(RecordHelper.this.mActivity, str);
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnPhotoWays {
        void onStart();
    }

    @Override // com.hhmedic.android.sdk.module.uploader.HHUploadListener
    public void onProgress(int i, String str) {
    }

    public void setConfigModel(HHSDKConfigModel hHSDKConfigModel) {
        this.mConfigModel = hHSDKConfigModel;
    }

    public RecordHelper(Activity activity) {
        this.mActivity = activity;
        HHUploader.getUploader().addListener(this);
    }

    public void bindOrderId(String str) {
        HHUploader.getUploader().bindOrderId(str);
    }

    public void setCallback(RecordUploadCallback recordUploadCallback) {
        this.mCallback = recordUploadCallback;
    }

    public void setOnWays(OnPhotoWays onPhotoWays) {
        this.mOnWays = onPhotoWays;
    }

    public void onPhotos(int i, int i2, Intent intent) {
        Uri data;
        ArrayList<Uri> arrayList;
        ArrayList arrayList2;
        if (i2 == -1) {
            ArrayList arrayList3 = null;
            switch (i) {
                case 10005:
                    if (intent != null) {
                        try {
                            data = intent.getData();
                            arrayList = new ArrayList<>();
                            arrayList.add(data);
                            arrayList2 = new ArrayList();
                        } catch (Exception e) {
                            e = e;
                        }
                        try {
                            if (Build.VERSION.SDK_INT >= 29) {
                                new CopyThread(this.mActivity).startCopy(arrayList, new CopyThread.OnCopyResult() { // from class: com.hhmedic.android.sdk.module.medicRecord.RecordHelper.1
                                    @Override // com.hhmedic.android.sdk.module.medicRecord.CopyThread.OnCopyResult
                                    public void onResult(List<String> list) {
                                        RecordHelper.this.doCompress(list);
                                    }
                                });
                                return;
                            }
                            String convertUri = HHImageUtils.convertUri(data, this.mActivity);
                            if (!TextUtils.isEmpty(convertUri)) {
                                arrayList2.add(convertUri);
                            }
                            arrayList3 = arrayList2;
                        } catch (Exception e2) {
                            e = e2;
                            arrayList3 = arrayList2;
                            Logger.e("onSelectPhoto error:" + e.getMessage());
                            doCompress(arrayList3);
                        }
                    }
                case 10006:
                    if (!TextUtils.isEmpty(this.mTakePath)) {
                        arrayList3 = new ArrayList();
                        arrayList3.add(this.mTakePath);
                        break;
                    }
                    break;
            }
            doCompress(arrayList3);
        }
    }

    public void dealSnapShotPhoto(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.mTakePath = HHBitmapUtils.getContextFilePath(this.mActivity, "snapshot.jpg");
            if (TextUtils.isEmpty(this.mTakePath)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.mTakePath);
            List<String> filterErrorFile = filterErrorFile(arrayList);
            if (filterErrorFile.isEmpty()) {
                return;
            }
            getImageCompress().compress(filterErrorFile, this.mCompressListener);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doCompress(List<String> list) {
        if (list != null) {
            try {
                List<String> filterSameFile = filterSameFile(filterErrorFile(list));
                if (filterSameFile.isEmpty()) {
                    return;
                }
                getImageCompress().compress(filterSameFile, this.mCompressListener);
            } catch (Exception e) {
                Logger.e("doCompress error:" + e.getMessage());
            }
        }
    }

    private List<String> filterErrorFile(List<String> list) {
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (new File(str).exists()) {
                    arrayList.add(str);
                } else {
                    Logger.e("file is not exists ---->" + str);
                }
            }
            return arrayList;
        } catch (Exception e) {
            Logger.e(e.toString());
            return list;
        }
    }

    private List<String> filterSameFile(List<String> list) {
        if (this.mData != null) {
            List<HHCaseImageModel> photos = this.mData.getPhotos();
            ArrayList arrayList = new ArrayList();
            if (photos != null && !photos.isEmpty()) {
                HashMap hashMap = new HashMap();
                for (HHCaseImageModel hHCaseImageModel : photos) {
                    hashMap.put(hHCaseImageModel.imageurl, hHCaseImageModel.imageurl);
                }
                for (String str : list) {
                    if (hashMap.get(str) == null) {
                        arrayList.add(str);
                    }
                }
                return arrayList;
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindImagePaths(List<String> list) {
        if (this.mData == null) {
            this.mData = new MRecordInfo();
        }
        if (list != null) {
            this.mData.addPhotos(list);
            HHUploader.getUploader().upload(list);
        }
    }

    private HHImageCompress getImageCompress() {
        if (this.mCompress == null) {
            this.mCompress = new HHImageCompress(this.mActivity);
        }
        return this.mCompress;
    }

    public void doTakeSheet() {
        String[] stringArray = this.mActivity.getResources().getStringArray(R.array.hp_sdk_select_photo);
        new HHUIBottomSheet.BottomListSheetBuilder(this.mActivity).addItem(stringArray[0]).addItem(stringArray[1]).addItem(stringArray[2]).setOnSheetItemClickListener(new HHUIBottomSheet.BottomListSheetBuilder.OnSheetItemClickListener() { // from class: com.hhmedic.android.sdk.module.medicRecord.RecordHelper.3
            @Override // com.hhmedic.android.sdk.uikit.widget.dialog.HHUIBottomSheet.BottomListSheetBuilder.OnSheetItemClickListener
            public void onClick(HHUIBottomSheet hHUIBottomSheet, View view, int i, String str) {
                hHUIBottomSheet.dismiss();
                switch (i) {
                    case 0:
                        if (RecordHelper.this.mConfigModel == null || TextUtils.equals("", RecordHelper.this.mConfigModel.appTVConfig)) {
                            RecordHelper.this.operation();
                            return;
                        }
                        HHSDKConfigModel.AppTVConfig appTVConfig = (HHSDKConfigModel.AppTVConfig) new Gson().fromJson(RecordHelper.this.mConfigModel.appTVConfig, (Class<Object>) HHSDKConfigModel.AppTVConfig.class);
                        if (appTVConfig == null || !appTVConfig.useSystemCamera) {
                            if (RecordHelper.this.mActivity != null) {
                                VideoAct videoAct = (VideoAct) RecordHelper.this.mActivity;
                                if (!videoAct.isCameraOpened()) {
                                    RecordHelper.this.operation();
                                    return;
                                } else {
                                    videoAct.startAnimation();
                                    return;
                                }
                            }
                            return;
                        }
                        RecordHelper.this.operation();
                        return;
                    case 1:
                        if (PermissionUtils.haveReadSdcard(RecordHelper.this.mActivity)) {
                            SDKRoute.pickers(RecordHelper.this.mActivity);
                            return;
                        } else {
                            PermissionUtils.askReadForPermissions(RecordHelper.this.mActivity);
                            return;
                        }
                    default:
                        return;
                }
            }
        }).build().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void operation() {
        this.mTakePath = SDKRoute.onTakePhoto(this.mActivity);
        if (TextUtils.isEmpty(this.mTakePath)) {
            showTakePhotoError();
        } else if (this.mOnWays != null) {
            this.mOnWays.onStart();
        }
    }

    private void showTakePhotoError() {
        try {
            this.mTips.errorTips(this.mActivity, "无法打开相机，请从相册上传图片");
        } catch (Exception e) {
            Logger.e("showTakePhotoError error:" + e.getMessage());
        }
    }

    @Override // com.hhmedic.android.sdk.module.uploader.HHUploadListener
    public void onSuccess(HHUploadResponse hHUploadResponse) {
        updatePhoto(hHUploadResponse);
    }

    @Override // com.hhmedic.android.sdk.module.uploader.HHUploadListener
    public void onFail(String str, String str2) {
        Logger.e("upload error ----" + str);
        try {
            this.mTips.errorTips(this.mActivity, "图片上传失败，请重新上传");
            if (this.mData != null) {
                this.mData.delFail(str2);
            }
        } catch (Exception e) {
            Logger.e("Record onFail:" + e.getMessage());
        }
    }

    public void release() {
        HHUploader.getUploader().clearOrderId();
        HHUploader.getUploader().removeListener(this);
    }

    private void updatePhoto(HHUploadResponse hHUploadResponse) {
        if (this.mData == null) {
            this.mData = new MRecordInfo();
        }
        this.mData.updateUpload(hHUploadResponse);
        checkIsSuccess();
    }

    private void checkIsSuccess() {
        if (havePhotos()) {
            this.mData.error(false);
            if (this.mCallback != null) {
                this.mCallback.onSuccess();
            }
        }
    }

    public MRecordInfo getMRecords() {
        if (this.mData == null) {
            this.mData = new MRecordInfo();
        }
        return this.mData;
    }

    private boolean havePhotos() {
        return getMRecords().haveImages();
    }

    public void resumePath(String str) {
        this.mTakePath = str;
    }

    public void saveBundle(Bundle bundle) {
        try {
            ArrayList<HHCaseImageModel> uploadList = this.mData.getUploadList();
            if (uploadList != null && !uploadList.isEmpty()) {
                CacheBundle cacheBundle = new CacheBundle();
                cacheBundle.mList = uploadList;
                bundle.putSerializable(CACHE_KEY, cacheBundle);
            }
            if (TextUtils.isEmpty(this.mTakePath)) {
                return;
            }
            bundle.putString(VideoBundle.KEY_TAKE_PHOTO, this.mTakePath);
        } catch (Exception e) {
            Logger.e("Recorder saveBundle error:" + e.getMessage());
        }
    }

    public void resumeBundle(Bundle bundle) {
        try {
            resumePath(bundle.getString(VideoBundle.KEY_TAKE_PHOTO));
            Serializable a = f.a(bundle, CACHE_KEY);
            if (a instanceof CacheBundle) {
                ArrayList<HHCaseImageModel> arrayList = ((CacheBundle) a).mList;
                if (this.mData == null) {
                    this.mData = new MRecordInfo();
                }
                this.mData.resume(arrayList);
            }
        } catch (Exception e) {
            Logger.e("Recorder resumeBundle error:" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class CacheBundle implements Serializable {
        ArrayList<HHCaseImageModel> mList;

        private CacheBundle() {
        }
    }
}
