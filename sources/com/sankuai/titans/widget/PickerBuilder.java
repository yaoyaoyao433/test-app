package com.sankuai.titans.widget;

import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.media.MediaActivity;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PickerBuilder {
    public static final String ALL_IMAGES_VIDEOS_TYPE = "all";
    public static final String ALL_VIDEOS_TYPE = "video";
    public static final int DEFAULT_COLUMN_NUMBER = 3;
    public static final int DEFAULT_MAX_COUNT = 9;
    public static final String EXTRA_CHOSEN_ASSET_IDS = "CHOSEN_ASSET_IDS";
    public static final String EXTRA_EXCLUDE_EXT_NAME = "excludeExtName";
    public static final String EXTRA_GRID_COLUMN = "column";
    public static final String EXTRA_INCLUDE_EXT_NAME = "includeExtName";
    public static final String EXTRA_MAX_COUNT = "MAX_COUNT";
    public static final String EXTRA_MAX_COUNT_HINT = "maxCountHint";
    public static final String EXTRA_MAX_FILE_SIZE = "maxFileSize";
    public static final String EXTRA_MEDIA_SIZE = "MEDIA_SIZE";
    public static final String EXTRA_PREVIEW_ENABLED = "PREVIEW_ENABLED";
    public static final String EXTRA_SHOW_ALL = "SHOW_ALL";
    public static final String EXTRA_SHOW_CAMERA = "SHOW_CAMERA";
    public static final String EXTRA_SHOW_GIF = "SHOW_GIF";
    public static final String EXTRA_SHOW_VIDEO_ONLY = "SHOW_VIDEO_ONLY";
    public static final String EXTRA_VIDEO_MAX_DURATION = "VIDEO_MAX_DURATION";
    public static final String EXTRA_VIDEO_MIN_DURATION = "VIDEO_MIN_DURATION";
    public static final String KEY_FILE_PATH = "FILE_PATH";
    public static final String KEY_SELECTED_PHOTOS = "SELECTED_PHOTOS";
    public static final int MEDIA_SIZE_COMPRESS = 1;
    public static final int MEDIA_SIZE_ORIGINAL = 0;
    public static final String OUTPUT_MEDIA_SIZE = "output.mediaSize";
    public static final int REQUESTCODE_MEDIA_PICKER = 1000;
    public static final int TYPE_MEDIA_SIZE_ALL = 3;
    public static final int TYPE_MEDIA_SIZE_COMPRESSED = 2;
    public static final int TYPE_MEDIA_SIZE_ORIGINAL = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private Bundle bundle;
    public IMediaWidgetCallback finishCallback;
    @Deprecated
    public IWidgetFinishListener finishListener;
    public int maxDuration;
    public int minDuration;
    public Object object;
    public boolean onlyCameraSource;
    public boolean onlyShowVideo;
    public int requestCode;
    public File resultFile;
    public boolean showAllType;

    public PickerBuilder camera(JSONObject jSONObject) {
        return this;
    }

    public PickerBuilder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9269737a1e3558f1437f107fdff11550", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9269737a1e3558f1437f107fdff11550");
            return;
        }
        this.bundle = new Bundle();
        this.onlyCameraSource = false;
        this.onlyShowVideo = false;
        this.showAllType = false;
        this.maxDuration = -1;
        this.minDuration = -1;
        this.resultFile = null;
        this.requestCode = 1000;
        this.finishListener = null;
        this.finishCallback = null;
    }

    public PickerBuilder mediaType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aaa8b05abe51b32b2dad56d79ccb8aed", RobustBitConfig.DEFAULT_VALUE)) {
            return (PickerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aaa8b05abe51b32b2dad56d79ccb8aed");
        }
        this.showAllType = TextUtils.equals("all", str);
        this.bundle.putBoolean(EXTRA_SHOW_ALL, this.showAllType);
        this.onlyShowVideo = TextUtils.equals("video", str);
        this.bundle.putBoolean(EXTRA_SHOW_VIDEO_ONLY, this.onlyShowVideo);
        return this;
    }

    public PickerBuilder minDuration(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d8d8694753252421321e4c58b9c124d", RobustBitConfig.DEFAULT_VALUE)) {
            return (PickerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d8d8694753252421321e4c58b9c124d");
        }
        if (i >= 0) {
            this.minDuration = i;
            this.bundle.putInt(EXTRA_VIDEO_MIN_DURATION, i);
        }
        return this;
    }

    public PickerBuilder mediaSize(String... strArr) {
        int i = 1;
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "840100f8f411f8c7e474048eb50ded0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (PickerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "840100f8f411f8c7e474048eb50ded0a");
        }
        if (strArr != null) {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
                sb.append(CommonConstant.Symbol.COMMA);
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb) && (!sb2.contains("original") || !sb2.contains("compressed"))) {
                if (!sb2.contains("original")) {
                    if (sb2.contains("compressed")) {
                        i = 2;
                    }
                }
                this.bundle.putInt(EXTRA_MEDIA_SIZE, i);
            }
            i = 3;
            this.bundle.putInt(EXTRA_MEDIA_SIZE, i);
        }
        return this;
    }

    public PickerBuilder maxCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "695608461f38c609901fa58927d6107e", RobustBitConfig.DEFAULT_VALUE)) {
            return (PickerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "695608461f38c609901fa58927d6107e");
        }
        this.bundle.putInt(EXTRA_MAX_COUNT, i);
        return this;
    }

    public PickerBuilder maxCountHint(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c48ca8ab20ba50648b7b68f09e40b8cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (PickerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c48ca8ab20ba50648b7b68f09e40b8cf");
        }
        this.bundle.putString(EXTRA_MAX_COUNT_HINT, str);
        return this;
    }

    public PickerBuilder maxFileSize(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1479e4b3ae4da8b5c502c82cbd4f6b85", RobustBitConfig.DEFAULT_VALUE)) {
            return (PickerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1479e4b3ae4da8b5c502c82cbd4f6b85");
        }
        this.bundle.putLong(EXTRA_MAX_FILE_SIZE, j);
        return this;
    }

    public PickerBuilder excludeExtName(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c55140669719c900d037f4b1106fa59", RobustBitConfig.DEFAULT_VALUE)) {
            return (PickerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c55140669719c900d037f4b1106fa59");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        this.bundle.putString(EXTRA_EXCLUDE_EXT_NAME, sb.toString());
        return this;
    }

    public PickerBuilder includeExtName(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de42758e5a215ce21e3946c48a36c754", RobustBitConfig.DEFAULT_VALUE)) {
            return (PickerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de42758e5a215ce21e3946c48a36c754");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        this.bundle.putString(EXTRA_INCLUDE_EXT_NAME, sb.toString());
        return this;
    }

    public PickerBuilder maxDuration(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dcca2346edfd6ae0401a7e4c79aa008", RobustBitConfig.DEFAULT_VALUE)) {
            return (PickerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dcca2346edfd6ae0401a7e4c79aa008");
        }
        if (i > 0) {
            this.maxDuration = i;
            this.bundle.putInt(EXTRA_VIDEO_MAX_DURATION, i);
        }
        return this;
    }

    public PickerBuilder source(String... strArr) {
        boolean z = true;
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47605d972cc3464f1a1984ccb8c602c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (PickerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47605d972cc3464f1a1984ccb8c602c7");
        }
        this.onlyCameraSource = false;
        if (strArr != null) {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
                sb.append(CommonConstant.Symbol.COMMA);
            }
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb) || (sb2.contains(WmChooseMediaModule.TYPE_CAMERA) && sb2.contains("album"))) {
                this.onlyCameraSource = false;
            } else if (sb2.contains(WmChooseMediaModule.TYPE_CAMERA)) {
                this.onlyCameraSource = true;
            } else if (sb2.contains("album")) {
                this.onlyCameraSource = false;
                z = false;
            }
        }
        this.bundle.putBoolean(EXTRA_SHOW_CAMERA, z);
        return this;
    }

    @Deprecated
    public PickerBuilder chosenAssets(ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bd7bb2bebe6b11c02fab1e3756cf8c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (PickerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bd7bb2bebe6b11c02fab1e3756cf8c7");
        }
        this.bundle.putStringArrayList(EXTRA_CHOSEN_ASSET_IDS, arrayList);
        return this;
    }

    public PickerBuilder chosenAssetIDs(ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4658047feace1a98fb03fdb046f25426", RobustBitConfig.DEFAULT_VALUE)) {
            return (PickerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4658047feace1a98fb03fdb046f25426");
        }
        this.bundle.putStringArrayList(EXTRA_CHOSEN_ASSET_IDS, arrayList);
        return this;
    }

    @Deprecated
    public PickerBuilder resultFile(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31d70e7991b3ccabf3770e525602b889", RobustBitConfig.DEFAULT_VALUE)) {
            return (PickerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31d70e7991b3ccabf3770e525602b889");
        }
        this.resultFile = file;
        this.bundle.putString(KEY_FILE_PATH, this.resultFile.getAbsolutePath());
        return this;
    }

    public PickerBuilder requestCode(int i) {
        this.requestCode = i;
        return this;
    }

    @Deprecated
    public PickerBuilder finishListener(IWidgetFinishListener iWidgetFinishListener) {
        this.finishListener = iWidgetFinishListener;
        return this;
    }

    public PickerBuilder finishCallback(IMediaWidgetCallback iMediaWidgetCallback) {
        this.finishCallback = iMediaWidgetCallback;
        return this;
    }

    public PickerBuilder accessToken(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f17800de65e1c03ff4b309b6782db21", RobustBitConfig.DEFAULT_VALUE)) {
            return (PickerBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f17800de65e1c03ff4b309b6782db21");
        }
        this.bundle.putString(MediaActivity.KEY_ACCESS_TOKEN, str);
        return this;
    }

    public String accessToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89421ba49156ca174759996e74eeb0eb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89421ba49156ca174759996e74eeb0eb") : this.bundle.getString(MediaActivity.KEY_ACCESS_TOKEN, "");
    }

    public Bundle getBundle() {
        return this.bundle;
    }

    @Deprecated
    public File resultFile() {
        return this.resultFile;
    }

    public int requestCode() {
        return this.requestCode;
    }

    public boolean onlyCameraSource() {
        return this.onlyCameraSource;
    }
}
