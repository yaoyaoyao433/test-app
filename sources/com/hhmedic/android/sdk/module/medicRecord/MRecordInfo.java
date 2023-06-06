package com.hhmedic.android.sdk.module.medicRecord;

import android.text.TextUtils;
import com.hhmedic.android.sdk.model.HHCaseImageModel;
import com.hhmedic.android.sdk.module.uploader.HHUploadResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MRecordInfo implements Serializable {
    private boolean isError;
    private final List<HHCaseImageModel> mPhotos = new ArrayList();
    private OnUpdate mUpdateListener;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface OnUpdate {
        void update();
    }

    public void addListener(OnUpdate onUpdate) {
        this.mUpdateListener = onUpdate;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addPhotos(List<String> list) {
        if (this.mPhotos == null) {
            return;
        }
        this.mPhotos.addAll(convertModel(list));
        if (this.mUpdateListener != null) {
            this.mUpdateListener.update();
        }
    }

    private List<HHCaseImageModel> convertModel(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            HHCaseImageModel hHCaseImageModel = new HHCaseImageModel();
            hHCaseImageModel.smallImage = str;
            hHCaseImageModel.imageurl = str;
            arrayList.add(hHCaseImageModel);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean updateUpload(HHUploadResponse hHUploadResponse) {
        if (this.mPhotos == null) {
            return false;
        }
        for (HHCaseImageModel hHCaseImageModel : this.mPhotos) {
            if (TextUtils.equals(hHCaseImageModel.imageurl, hHUploadResponse.filePath)) {
                hHCaseImageModel.s3key = hHUploadResponse.file_key;
                hHCaseImageModel.ultimemin = hHUploadResponse.time;
                if (this.mUpdateListener != null) {
                    this.mUpdateListener.update();
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public void error(boolean z) {
        this.isError = z;
        if (this.mUpdateListener != null) {
            this.mUpdateListener.update();
        }
    }

    public void delFail(String str) {
        if (this.mPhotos == null) {
            return;
        }
        for (HHCaseImageModel hHCaseImageModel : this.mPhotos) {
            if (TextUtils.equals(hHCaseImageModel.imageurl, str)) {
                this.mPhotos.remove(hHCaseImageModel);
                if (this.mUpdateListener != null) {
                    this.mUpdateListener.update();
                    return;
                }
                return;
            }
        }
    }

    public List<HHCaseImageModel> getPhotos() {
        return this.mPhotos;
    }

    public HHCaseImageModel getLastPhoto() {
        if (this.mPhotos == null || this.mPhotos.isEmpty()) {
            return null;
        }
        return this.mPhotos.get(this.mPhotos.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean haveImages() {
        return !this.mPhotos.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<HHCaseImageModel> getUploadList() {
        ArrayList<HHCaseImageModel> arrayList = new ArrayList<>();
        if (this.mPhotos == null) {
            return arrayList;
        }
        for (HHCaseImageModel hHCaseImageModel : this.mPhotos) {
            if (!TextUtils.isEmpty(hHCaseImageModel.s3key)) {
                arrayList.add(hHCaseImageModel);
            }
        }
        return arrayList;
    }

    public int getUploadProgress() {
        int i = 0;
        if (this.mPhotos == null) {
            return 0;
        }
        for (HHCaseImageModel hHCaseImageModel : this.mPhotos) {
            if (hHCaseImageModel.haveUpload()) {
                i++;
            }
        }
        return (i * 100) / this.mPhotos.size();
    }

    public boolean isError() {
        return this.isError;
    }

    public void resume(List<HHCaseImageModel> list) {
        this.mPhotos.addAll(list);
    }

    public void release() {
        if (this.mUpdateListener != null) {
            this.mUpdateListener = null;
        }
    }
}
