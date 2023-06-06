package com.sankuai.waimai.reactnative.modules;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;
import com.meituan.android.mrn.utils.g;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WmChooseMediaModule extends ReactContextBaseJavaModule implements ActivityEventListener, f {
    public static final String CHOOSE_MEDIA = "choose_media";
    public static final String CHOOSE_PHOTO = "choose_photo";
    public static final String CHOOSE_VIDEO = "choose_video";
    public static final String ERR_CODE_PERMISSION = "543";
    public static final String ERR_CODE_SELECT_MEDIA = "501";
    public static final String ERR_MSG_PERMISSION = "授权失败，请重试";
    public static final String ERR_MSG_SELECT_PHOTO = "选择图片失败，请重试";
    public static final String ERR_MSG_SELECT_VIDEO = "选择视频失败，请重试";
    public static final String PREVIEW_MEDIA = "preview_media";
    public static final String REACT_CLASS = "WMChooseMediaModule";
    public static final int REQUEST_CODE_CHOOSE_MEDIA = 15;
    public static final int REQUEST_CODE_CHOOSE_PHOTO = 11;
    public static final int REQUEST_CODE_JUMP_TO_PREVIEW = 14;
    private static final int REQUEST_CODE_PERMISSIONS = 12;
    public static final int REQUEST_CODE_SHOOT_VIDEO = 10;
    public static final String TYPE_CAMERA = "camera";
    public static final String WM_ALBUM_PATH = com.sankuai.waimai.foundation.router.interfaces.b.d + "/wmvideoselect";
    public static final String WM_CAMERA_PREVIEW_PATH = com.sankuai.waimai.foundation.router.interfaces.b.d + "/wmvideopreivew";
    public static final String WM_MEDIA_PATH = com.sankuai.waimai.foundation.router.interfaces.b.d + "/wmmediachoose";
    public static final String WM_PREVIEW_MEDIA_PATH = com.sankuai.waimai.foundation.router.interfaces.b.d + "/wmmediapreview";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Promise mChoosePromise;
    private String mChooseType;
    private Promise mMediaPromise;
    private ReadableMap mMediaReadableMap;
    private String mMediaType;
    private ReadableMap mReadableMap;

    private boolean requestPermissions(Activity activity) {
        return true;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public WmChooseMediaModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ad494ae45115ac7b0cb3d145a2bffb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ad494ae45115ac7b0cb3d145a2bffb2");
        } else {
            reactApplicationContext.addActivityEventListener(this);
        }
    }

    @ReactMethod
    public void chooseVideo(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "875ca4395602ae93bd23e52ec024feef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "875ca4395602ae93bd23e52ec024feef");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        this.mChooseType = CHOOSE_VIDEO;
        this.mChoosePromise = promise;
        this.mReadableMap = readableMap;
        if (requestPermissions(currentActivity)) {
            checkToVideoPage(currentActivity);
        }
    }

    @ReactMethod
    public void choosePhoto(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0aed83e21a79aab197711d882b777855", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0aed83e21a79aab197711d882b777855");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        this.mChooseType = CHOOSE_PHOTO;
        this.mChoosePromise = promise;
        this.mReadableMap = readableMap;
        if (requestPermissions(currentActivity)) {
            openMediaPageOld(currentActivity);
        }
    }

    @ReactMethod
    public void chooseMedia(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5063c36b58ab17ebcdc221fd0909788", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5063c36b58ab17ebcdc221fd0909788");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        this.mChooseType = CHOOSE_MEDIA;
        this.mChoosePromise = promise;
        this.mReadableMap = readableMap;
        if (requestPermissions(currentActivity)) {
            openMediaPage(currentActivity);
        }
    }

    private void openMediaPage(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9484be39f475d01fd467a2759489805b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9484be39f475d01fd467a2759489805b");
        } else {
            com.sankuai.waimai.foundation.router.a.a(activity, WM_MEDIA_PATH, convertBundle(this.mReadableMap), 15);
        }
    }

    private void openMediaPageOld(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24e9dbd31be235037ea03ec83cf80796", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24e9dbd31be235037ea03ec83cf80796");
            return;
        }
        Bundle convertBundle = convertBundle(this.mReadableMap);
        convertBundle.putInt(JsBridgeResult.ARG_KEY_LOCATION_MODE, 1);
        com.sankuai.waimai.foundation.router.a.a(activity, WM_MEDIA_PATH, convertBundle, 11);
    }

    private void checkToVideoPage(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e408662124d95cf908193663e03e9477", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e408662124d95cf908193663e03e9477");
        } else if (showCamera(this.mReadableMap.getString("type"))) {
            goTakeCamera(activity, this.mReadableMap, 10);
        } else {
            goChooseVideo(activity, this.mReadableMap, 10);
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        ArrayList<String> stringArrayList;
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e84a3627b4c7aad0d7b0ebb6c66c84e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e84a3627b4c7aad0d7b0ebb6c66c84e");
        } else if ((i == 10 || i == 11 || i == 15 || i == 14) && i2 == -1) {
            if (intent == null || intent.getExtras() == null) {
                chooseFailed(ERR_CODE_SELECT_MEDIA, i == 10 ? ERR_MSG_SELECT_VIDEO : ERR_MSG_SELECT_PHOTO);
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(Constant.KEY_RESULT_CODE, -1);
            createMap.putInt(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, i);
            Bundle extras = intent.getExtras();
            for (String str : extras.keySet()) {
                com.sankuai.waimai.reactnative.utils.b.a(str, extras.get(str), createMap);
            }
            if (i == 11 && (stringArrayList = extras.getStringArrayList("selectedMedium")) != null && stringArrayList.size() > 0) {
                WritableArray createArray = Arguments.createArray();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    createArray.pushString(it.next());
                }
                createMap.putArray("selectedMedium", createArray);
            }
            this.mChoosePromise.resolve(createMap);
        }
    }

    private void goChooseVideo(Activity activity, ReadableMap readableMap, int i) {
        Object[] objArr = {activity, readableMap, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c86a6ed20035934fb03b2b4676b6275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c86a6ed20035934fb03b2b4676b6275");
            return;
        }
        Bundle convertBundle = convertBundle(readableMap);
        convertBundle.putBoolean("showCamera", showCamera(readableMap.getString("type")));
        com.sankuai.waimai.foundation.router.a.a(activity, WM_ALBUM_PATH, convertBundle, i);
    }

    private void goTakeCamera(Activity activity, ReadableMap readableMap, int i) {
        Object[] objArr = {activity, readableMap, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75a38efe44b2eefecad42338320c424b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75a38efe44b2eefecad42338320c424b");
            return;
        }
        Bundle convertBundle = convertBundle(readableMap);
        convertBundle.putBoolean("showCamera", showCamera(readableMap.getString("type")));
        com.sankuai.waimai.foundation.router.a.a(activity, WM_CAMERA_PREVIEW_PATH, convertBundle, i);
    }

    private Bundle convertBundle(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5322a8fe2c51c3025d57f545e004e72", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5322a8fe2c51c3025d57f545e004e72");
        }
        Map<String, Object> a = g.a(readableMap);
        if (a == null) {
            return new Bundle();
        }
        return g.a(a);
    }

    private boolean showCamera(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d8302675169910b590ba39f145c613d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d8302675169910b590ba39f145c613d")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : str.split(CommonConstant.Symbol.COMMA)) {
            if (TextUtils.equals(str2, TYPE_CAMERA)) {
                return true;
            }
        }
        return false;
    }

    private void chooseFailed(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3af0bac2c3972b66b7450d73c1275bef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3af0bac2c3972b66b7450d73c1275bef");
        } else if (this.mChoosePromise != null) {
            this.mChoosePromise.reject(str, str2, new Throwable(str2));
        }
    }

    private e getPermissionAwareActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c25f10043b8e88dec54ba1ea687b1968", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c25f10043b8e88dec54ba1ea687b1968");
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (!(currentActivity instanceof e)) {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
        return (e) currentActivity;
    }

    public static boolean verifyPermissions(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "51ea557f0b4e37b0fa1fc08a22ff0c43", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "51ea557f0b4e37b0fa1fc08a22ff0c43")).booleanValue();
        }
        if (iArr.length <= 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.react.modules.core.f
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f4db940fb03edaa65c1a2be7636c906", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f4db940fb03edaa65c1a2be7636c906")).booleanValue();
        }
        if (i == 12) {
            if (verifyPermissions(iArr)) {
                if (TextUtils.equals(this.mChooseType, CHOOSE_VIDEO)) {
                    checkToVideoPage(getCurrentActivity());
                } else if (TextUtils.equals(this.mChooseType, CHOOSE_PHOTO)) {
                    openMediaPageOld(getCurrentActivity());
                } else if (TextUtils.equals(this.mChooseType, CHOOSE_MEDIA)) {
                    openMediaPage(getCurrentActivity());
                }
                return true;
            }
            chooseFailed(ERR_CODE_PERMISSION, ERR_MSG_PERMISSION);
        }
        return false;
    }
}
