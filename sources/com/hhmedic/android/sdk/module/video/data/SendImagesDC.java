package com.hhmedic.android.sdk.module.video.data;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hhmedic.android.sdk.base.controller.HHDataController;
import com.hhmedic.android.sdk.base.controller.HHDataControllerListener;
import com.hhmedic.android.sdk.base.model.HHEmptyModel;
import com.hhmedic.android.sdk.base.model.HHModel;
import com.hhmedic.android.sdk.base.net.HHRequestConfig;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.base.utils.Maps;
import com.hhmedic.android.sdk.model.HHCaseImageModel;
import com.hhmedic.android.sdk.module.medicRecord.MRecordInfo;
import com.meituan.android.common.mrn.analytics.library.Constants;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SendImagesDC extends HHDataController<HHEmptyModel> {
    private final List<String> mUploadedList;
    private List<String> mUploadingList;

    public SendImagesDC(Context context) {
        super(context);
        this.mUploadedList = new ArrayList();
    }

    public void sendPhotos(String str, MRecordInfo mRecordInfo, HHDataControllerListener hHDataControllerListener) {
        if (mRecordInfo != null) {
            List<String> photos = getPhotos(mRecordInfo);
            if (photos.isEmpty()) {
                return;
            }
            this.mUploadingList = photos;
            request(new CreateConfigInVideo(Maps.of(Constants.EventConstants.KEY_ORDER_ID, str), ImageRecords.create(photos)), hHDataControllerListener);
        }
    }

    public void addUploadedList() {
        if (this.mUploadedList == null || this.mUploadingList == null || this.mUploadingList.isEmpty()) {
            return;
        }
        this.mUploadedList.addAll(this.mUploadingList);
    }

    private List<String> getPhotos(MRecordInfo mRecordInfo) {
        List<HHCaseImageModel> photos = mRecordInfo.getPhotos();
        ArrayList arrayList = new ArrayList();
        if (photos == null || photos.isEmpty()) {
            return arrayList;
        }
        for (HHCaseImageModel hHCaseImageModel : photos) {
            if (!TextUtils.isEmpty(hHCaseImageModel.s3key) && !isUploaded(hHCaseImageModel.s3key)) {
                arrayList.add(hHCaseImageModel.s3key);
            }
        }
        return arrayList;
    }

    private boolean isUploaded(String str) {
        if (this.mUploadedList == null || this.mUploadedList.isEmpty()) {
            return false;
        }
        return this.mUploadedList.contains(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class ImageRecords implements Serializable {
        public List<Record> others = new ArrayList();

        private ImageRecords() {
        }

        static ImageRecords create(List<String> list) {
            Record create = Record.create(list);
            ImageRecords imageRecords = new ImageRecords();
            imageRecords.others.add(create);
            return imageRecords;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Record implements Serializable {
        List<String> checkPics = new ArrayList();

        private Record() {
        }

        static Record create(List<String> list) {
            Record record = new Record();
            record.checkPics = list;
            return record;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class CreateConfigInVideo extends HHRequestConfig {
        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public String serverApiPath() {
            return "/user/updateMemberRecordByVideo";
        }

        CreateConfigInVideo(HashMap<String, Object> hashMap, ImageRecords imageRecords) {
            super(hashMap, null);
            try {
                this.mBodyByte = new Gson().toJson(imageRecords).getBytes(StandardCharsets.UTF_8);
            } catch (Exception e) {
                Logger.e(e.toString());
            }
        }

        @Override // com.hhmedic.android.sdk.base.net.HHRequestConfig
        public Type parserJsonType() {
            return new TypeToken<HHModel<HHEmptyModel>>() { // from class: com.hhmedic.android.sdk.module.video.data.SendImagesDC.CreateConfigInVideo.1
            }.getType();
        }
    }
}
