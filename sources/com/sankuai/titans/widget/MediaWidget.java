package com.sankuai.titans.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.IPictureResultCallback;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.TitansPermissionUtil;
import com.sankuai.titans.result.TitansPictureUtil;
import com.sankuai.titans.result.util.PicturePathUtil;
import com.sankuai.titans.widget.media.utils.ImageCaptureManager;
import com.sankuai.titans.widget.picture.PictureSelfUtil;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MediaWidget {
    public static final String ACTION_PICKER = "com.sankuai.titans.widget.mediapicker";
    public static final String ACTION_PLAYER = "com.sankuai.titans.widget.mediaplayer";
    @Deprecated
    public static final String ACTION_PLAYER_OLD = "com.sankuai.titans.widget.mediapreview";
    private static final String HORN_KEY = "titans_widget_channel";
    private static final String TAG = "MediaWidget";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static boolean isMultiPicker;
    private IMediaWidgetHandler mediaWidgetHandler;
    private PickerBuilder pickerBuilder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final MediaWidget instance = new MediaWidget();
    }

    public static void pullConfig() {
    }

    public MediaWidget() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3024e4adf7aa54d498a58609902a911f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3024e4adf7aa54d498a58609902a911f");
            return;
        }
        this.mediaWidgetHandler = null;
        this.pickerBuilder = null;
    }

    public static Bundle onActivityResult(Context context, int i, int i2, Intent intent, String str) {
        Uri data;
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), intent, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e9ed40cae59ef586b239e7f69f1ee4af", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e9ed40cae59ef586b239e7f69f1ee4af");
        }
        if (isMultiPicker) {
            if (intent != null) {
                return intent.getExtras();
            }
            return null;
        } else if (intent == null || (data = intent.getData()) == null) {
            return null;
        } else {
            String realPath = PicturePathUtil.getRealPath(context, data, str);
            if (TextUtils.isEmpty(realPath)) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(realPath);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(PickerBuilder.KEY_SELECTED_PHOTOS, arrayList);
            bundle.putInt(PickerBuilder.OUTPUT_MEDIA_SIZE, 1);
            return bundle;
        }
    }

    public static MediaWidget getInstance() {
        return Holder.instance;
    }

    public File createImageFile() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df3c1aa7d6fdd90b87335e0bbe9b6d67", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df3c1aa7d6fdd90b87335e0bbe9b6d67");
        }
        try {
            return ImageCaptureManager.createFile(Environment.DIRECTORY_PICTURES);
        } catch (IOException e) {
            Log.e(TAG, e.getMessage());
            return null;
        }
    }

    public File createVideoFile() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "220178dd6045a2f8e293718b139d592e", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "220178dd6045a2f8e293718b139d592e");
        }
        try {
            return ImageCaptureManager.createFile(Environment.DIRECTORY_MOVIES);
        } catch (IOException e) {
            Log.e(TAG, e.getMessage());
            return null;
        }
    }

    public void registerHandler(IMediaWidgetHandler iMediaWidgetHandler) {
        this.mediaWidgetHandler = iMediaWidgetHandler;
    }

    public void openMediaPicker(final Activity activity, final PickerBuilder pickerBuilder) {
        final boolean z = false;
        Object[] objArr = {activity, pickerBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d24668bab48a19ba6408b4e0f5e49426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d24668bab48a19ba6408b4e0f5e49426");
            return;
        }
        this.pickerBuilder = pickerBuilder;
        if (this.mediaWidgetHandler != null && this.mediaWidgetHandler.isWidgetEnabled(IMediaWidgetHandler.WIDGET_MEDIA_PICKER)) {
            isMultiPicker = true;
            this.mediaWidgetHandler.openMediaPicker(activity, pickerBuilder);
            return;
        }
        z = (pickerBuilder.finishListener == null && pickerBuilder.finishCallback == null) ? true : true;
        final WeakReference weakReference = new WeakReference(activity);
        if (pickerBuilder.onlyCameraSource) {
            if (pickerBuilder.showAllType) {
                Log.e(TAG, "cannot use camera source while select both images and videos");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(PermissionGuard.PERMISSION_CAMERA);
            arrayList.add(PermissionGuard.PERMISSION_STORAGE);
            TitansPermissionUtil.requestPermissions(activity, arrayList, pickerBuilder.accessToken(), new IRequestPermissionCallback() { // from class: com.sankuai.titans.widget.MediaWidget.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z2, int i) {
                    Intent dispatchTakePictureIntent;
                    int i2 = 0;
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6bb1974234ea8be4ad720f3fb474d7f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6bb1974234ea8be4ad720f3fb474d7f0");
                    } else if (!z2) {
                        MediaWidget.this.sendResult(null);
                    } else {
                        Activity activity2 = (Activity) weakReference.get();
                        if (activity2 == null || activity2.isFinishing() || activity2.isDestroyed()) {
                            MediaWidget.this.sendResult(null);
                        } else if (z) {
                            if (pickerBuilder.onlyShowVideo) {
                                TitansPictureUtil.takeVideo(activity2, pickerBuilder.requestCode, pickerBuilder.accessToken(), pickerBuilder.resultFile, pickerBuilder.getBundle().getInt(PickerBuilder.EXTRA_MEDIA_SIZE) != 1 ? 0 : 1, pickerBuilder.maxDuration, new IPictureResultCallback() { // from class: com.sankuai.titans.widget.MediaWidget.1.1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    @Override // com.sankuai.titans.result.IPictureResultCallback
                                    public void onResult(String str) {
                                        Object[] objArr3 = {str};
                                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "bfdab949557d07d0c109c9666d61d634", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "bfdab949557d07d0c109c9666d61d634");
                                        } else {
                                            MediaWidget.this.sendResult(str);
                                        }
                                    }

                                    @Override // com.sankuai.titans.result.IPictureResultCallback
                                    public void onCancel() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "4e22373eb5937b8fc15a685fe988d8c4", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "4e22373eb5937b8fc15a685fe988d8c4");
                                        } else {
                                            MediaWidget.this.sendResult(null);
                                        }
                                    }
                                });
                                return;
                            }
                            TitansPictureUtil.takePhoto(activity2, pickerBuilder.requestCode, pickerBuilder.accessToken(), pickerBuilder.resultFile, new IPictureResultCallback() { // from class: com.sankuai.titans.widget.MediaWidget.1.2
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // com.sankuai.titans.result.IPictureResultCallback
                                public void onResult(String str) {
                                    Object[] objArr3 = {str};
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "076a4134eb1e429ef32a5cc7a72e66a6", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "076a4134eb1e429ef32a5cc7a72e66a6");
                                    } else {
                                        MediaWidget.this.sendResult(str);
                                    }
                                }

                                @Override // com.sankuai.titans.result.IPictureResultCallback
                                public void onCancel() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "a1094f14de32b4829dada14ebc1d45d5", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "a1094f14de32b4829dada14ebc1d45d5");
                                    } else {
                                        MediaWidget.this.sendResult(null);
                                    }
                                }
                            });
                        } else {
                            try {
                                File file = pickerBuilder.resultFile;
                                if (file == null) {
                                    file = pickerBuilder.onlyShowVideo ? MediaWidget.this.createVideoFile() : MediaWidget.this.createImageFile();
                                }
                                if (pickerBuilder.onlyShowVideo) {
                                    int i3 = pickerBuilder.getBundle().getInt(PickerBuilder.EXTRA_MEDIA_SIZE);
                                    Context applicationContext = activity2.getApplicationContext();
                                    if (i3 == 1) {
                                        i2 = 1;
                                    }
                                    dispatchTakePictureIntent = ImageCaptureManager.dispatchTakeVideoIntent(applicationContext, file, i2, pickerBuilder.maxDuration, pickerBuilder.accessToken());
                                } else {
                                    dispatchTakePictureIntent = ImageCaptureManager.dispatchTakePictureIntent(activity2.getApplicationContext(), file, pickerBuilder.accessToken());
                                }
                                activity2.startActivityForResult(dispatchTakePictureIntent, pickerBuilder.requestCode());
                            } catch (Exception unused) {
                                MediaWidget.this.sendResult(null);
                            }
                        }
                    }
                }
            });
            return;
        }
        TitansPermissionUtil.requestPermission(activity, PermissionGuard.PERMISSION_MULTIPLE_IMAGE_PICKERS, pickerBuilder.accessToken(), new IRequestPermissionCallback() { // from class: com.sankuai.titans.widget.MediaWidget.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.result.IRequestPermissionCallback
            public void onResult(boolean z2, int i) {
                Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "61d5af1dbc9b84d081bc37f8d2ec07a0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "61d5af1dbc9b84d081bc37f8d2ec07a0");
                    return;
                }
                Activity activity2 = (Activity) weakReference.get();
                if (activity2 == null || activity2.isFinishing() || activity2.isDestroyed()) {
                    MediaWidget.this.sendResult(null);
                } else if (!z2) {
                    MediaWidget.this.singleChoose(activity, z);
                } else {
                    MediaWidget.this.multiChoose(activity, z);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void multiChoose(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cca48e05db05b88a4e9343a079f53fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cca48e05db05b88a4e9343a079f53fc");
        } else if (this.pickerBuilder == null) {
            sendResult(null);
        } else {
            isMultiPicker = true;
            if (z) {
                PictureSelfUtil.getPictureSelf(activity, this.pickerBuilder.requestCode(), this.pickerBuilder.getBundle());
                return;
            }
            Intent intent = new Intent();
            intent.setPackage(activity.getPackageName());
            intent.setAction(ACTION_PICKER);
            intent.putExtras(this.pickerBuilder.getBundle());
            activity.startActivityForResult(intent, this.pickerBuilder.requestCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void singleChoose(Activity activity, final boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81910e3e45829c337cf5caa4e3e6f8b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81910e3e45829c337cf5caa4e3e6f8b0");
        } else if (this.pickerBuilder == null) {
            sendResult(null);
        } else {
            isMultiPicker = false;
            final WeakReference weakReference = new WeakReference(activity);
            TitansPermissionUtil.requestPermission(activity, PermissionGuard.PERMISSION_STORAGE_READ, this.pickerBuilder.accessToken(), new IRequestPermissionCallback() { // from class: com.sankuai.titans.widget.MediaWidget.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public void onResult(boolean z2, int i) {
                    Intent intent;
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d23bd3d752c5bdfcd858aa414aa9d9dd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d23bd3d752c5bdfcd858aa414aa9d9dd");
                    } else if (!z2) {
                        MediaWidget.this.sendResult(null);
                    } else {
                        Activity activity2 = (Activity) weakReference.get();
                        if (activity2 == null || activity2.isFinishing() || activity2.isDestroyed()) {
                            MediaWidget.this.sendResult(null);
                        } else if (z) {
                            if (MediaWidget.this.pickerBuilder.onlyShowVideo) {
                                TitansPictureUtil.getVideo(activity2, MediaWidget.this.pickerBuilder.requestCode(), MediaWidget.this.pickerBuilder.accessToken(), new IPictureResultCallback() { // from class: com.sankuai.titans.widget.MediaWidget.3.1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    @Override // com.sankuai.titans.result.IPictureResultCallback
                                    public void onResult(String str) {
                                        Object[] objArr3 = {str};
                                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "8eb52a3e019cd1daec75c69c9f955f14", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "8eb52a3e019cd1daec75c69c9f955f14");
                                        } else {
                                            MediaWidget.this.sendResult(str);
                                        }
                                    }

                                    @Override // com.sankuai.titans.result.IPictureResultCallback
                                    public void onCancel() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "ca6ff0b02968c5e70caf3565f10d1ac6", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "ca6ff0b02968c5e70caf3565f10d1ac6");
                                        } else {
                                            MediaWidget.this.sendResult(null);
                                        }
                                    }
                                });
                            } else {
                                TitansPictureUtil.getPhoto(activity2, MediaWidget.this.pickerBuilder.requestCode(), MediaWidget.this.pickerBuilder.accessToken(), new IPictureResultCallback() { // from class: com.sankuai.titans.widget.MediaWidget.3.2
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    @Override // com.sankuai.titans.result.IPictureResultCallback
                                    public void onResult(String str) {
                                        Object[] objArr3 = {str};
                                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "1fc8ab78d9d180900976f7251521251e", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "1fc8ab78d9d180900976f7251521251e");
                                        } else {
                                            MediaWidget.this.sendResult(str);
                                        }
                                    }

                                    @Override // com.sankuai.titans.result.IPictureResultCallback
                                    public void onCancel() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "8c07aa4a8481e36c25c1ca7bba36f479", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "8c07aa4a8481e36c25c1ca7bba36f479");
                                        } else {
                                            MediaWidget.this.sendResult(null);
                                        }
                                    }
                                });
                            }
                        } else {
                            if (MediaWidget.this.pickerBuilder.onlyShowVideo) {
                                intent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
                            } else {
                                intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                            }
                            try {
                                activity2.startActivityForResult(intent, MediaWidget.this.pickerBuilder.requestCode());
                            } catch (Exception unused) {
                                MediaWidget.this.sendResult(null);
                            }
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendResult(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "096d5264174bc330b9f2a7a50e4e909d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "096d5264174bc330b9f2a7a50e4e909d");
        } else if (TextUtils.isEmpty(str)) {
            getInstance().raisePickerCallback(null);
        } else {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(str);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(PickerBuilder.KEY_SELECTED_PHOTOS, arrayList);
            bundle.putInt(PickerBuilder.OUTPUT_MEDIA_SIZE, 1);
            getInstance().raisePickerCallback(bundle);
        }
    }

    public void raisePickerCallback(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "902e28ad535b244ed1eedfb87f2f37d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "902e28ad535b244ed1eedfb87f2f37d1");
        } else if (this.pickerBuilder == null) {
        } else {
            ArrayList<String> stringArrayList = bundle == null ? null : bundle.getStringArrayList(PickerBuilder.KEY_SELECTED_PHOTOS);
            int i = bundle != null ? bundle.getInt(PickerBuilder.OUTPUT_MEDIA_SIZE, 0) : 0;
            if (this.pickerBuilder.finishListener != null) {
                this.pickerBuilder.finishListener.onResult(stringArrayList, null);
                this.pickerBuilder.finishListener = null;
            }
            if (this.pickerBuilder.finishCallback != null) {
                this.pickerBuilder.finishCallback.onResult(stringArrayList, i);
                this.pickerBuilder.finishCallback = null;
            }
        }
    }

    public void openMediaPlayer(Activity activity, PlayerBuilder playerBuilder) {
        Object[] objArr = {activity, playerBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b456f03f9d4f3d19015920e53e6b09d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b456f03f9d4f3d19015920e53e6b09d5");
            return;
        }
        this.pickerBuilder = null;
        if (this.mediaWidgetHandler != null && this.mediaWidgetHandler.isWidgetEnabled(IMediaWidgetHandler.WIDGET_MEDIA_PLAYER)) {
            this.mediaWidgetHandler.openMediaPlayer(activity, playerBuilder);
            return;
        }
        ArrayList<String> stringArrayList = playerBuilder.getBundle().getStringArrayList(PlayerBuilder.KEY_ASSETS);
        if (stringArrayList == null || stringArrayList.size() == 0) {
            return;
        }
        if (playerBuilder.getBundle().getBoolean(PlayerBuilder.KEY_SHOW_VIDEO, false)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(stringArrayList.get(0)));
                intent.setDataAndType(Uri.parse(stringArrayList.get(0)), "video/mp4");
                activity.startActivity(intent);
                if (playerBuilder.getBundle().getBoolean(PlayerBuilder.KEY_SHOW_ANIMATE, true)) {
                    return;
                }
                activity.overridePendingTransition(-1, -1);
                return;
            } catch (Exception unused) {
                SnackbarUtil.showSnackbar(activity, "no video player");
                return;
            }
        }
        Intent intent2 = new Intent();
        intent2.setPackage(activity.getPackageName());
        intent2.setAction(ACTION_PLAYER);
        intent2.putExtras(playerBuilder.bundle);
        activity.startActivity(intent2);
        if (playerBuilder.getBundle().getBoolean(PlayerBuilder.KEY_SHOW_ANIMATE, true)) {
            return;
        }
        activity.overridePendingTransition(-1, -1);
    }

    public Uri getUriByFile(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5c841856d91dcb10bf3d9609bf0dd76", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5c841856d91dcb10bf3d9609bf0dd76") : ImageCaptureManager.popUriByFile(file);
    }
}
