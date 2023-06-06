package com.sankuai.titans.result;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.app.picture.TitansPicture;
import com.sankuai.titans.result.v4.picture.TitansPictureV4;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansPictureUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface ICheckPermissionCallback {
        void hasPermission(Activity activity);
    }

    public static void getPhoto(Activity activity, final int i, final String str, final IPictureResultCallback iPictureResultCallback) {
        Object[] objArr = {activity, Integer.valueOf(i), str, iPictureResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b29c7ffe3ad6c4d6ee1b91dc783b4d3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b29c7ffe3ad6c4d6ee1b91dc783b4d3d");
        } else {
            checkStorageReadPermission(activity, str, iPictureResultCallback, new ICheckPermissionCallback() { // from class: com.sankuai.titans.result.TitansPictureUtil.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.TitansPictureUtil.ICheckPermissionCallback
                public final void hasPermission(Activity activity2) {
                    Object[] objArr2 = {activity2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "85bc216b4010889ee7f819f26063c393", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "85bc216b4010889ee7f819f26063c393");
                    } else if (activity2 instanceof FragmentActivity) {
                        new TitansPictureV4((FragmentActivity) activity2).getPhoto(i, str, iPictureResultCallback);
                    } else {
                        new TitansPicture(activity2).getPhoto(i, str, iPictureResultCallback);
                    }
                }
            });
        }
    }

    public static void getVideo(Activity activity, final int i, final String str, final IPictureResultCallback iPictureResultCallback) {
        Object[] objArr = {activity, Integer.valueOf(i), str, iPictureResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fd3660b7a30fc8ab6c8a08373fd15c97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fd3660b7a30fc8ab6c8a08373fd15c97");
        } else {
            checkStorageReadPermission(activity, str, iPictureResultCallback, new ICheckPermissionCallback() { // from class: com.sankuai.titans.result.TitansPictureUtil.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.TitansPictureUtil.ICheckPermissionCallback
                public final void hasPermission(Activity activity2) {
                    Object[] objArr2 = {activity2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "79eb4f9d763e3b35618aa751a78e05d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "79eb4f9d763e3b35618aa751a78e05d8");
                    } else if (activity2 instanceof FragmentActivity) {
                        new TitansPictureV4((FragmentActivity) activity2).getVideo(i, str, iPictureResultCallback);
                    } else {
                        new TitansPicture(activity2).getVideo(i, str, iPictureResultCallback);
                    }
                }
            });
        }
    }

    public static void takePhoto(Activity activity, final int i, final String str, final File file, final IPictureResultCallback iPictureResultCallback) {
        Object[] objArr = {activity, Integer.valueOf(i), str, file, iPictureResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bc810eb359830e4a43cf3b044e215f4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bc810eb359830e4a43cf3b044e215f4e");
        } else {
            checkStorageAndCameraPermission(activity, str, iPictureResultCallback, new ICheckPermissionCallback() { // from class: com.sankuai.titans.result.TitansPictureUtil.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.TitansPictureUtil.ICheckPermissionCallback
                public final void hasPermission(Activity activity2) {
                    Object[] objArr2 = {activity2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5c64ea1e965f70cff8b81c86cc954631", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5c64ea1e965f70cff8b81c86cc954631");
                    } else if (activity2 instanceof FragmentActivity) {
                        new TitansPictureV4((FragmentActivity) activity2).takePhoto(i, str, file, iPictureResultCallback);
                    } else {
                        new TitansPicture(activity2).takePhoto(i, str, file, iPictureResultCallback);
                    }
                }
            });
        }
    }

    public static void takeVideo(Activity activity, final int i, final String str, final File file, final int i2, final int i3, final IPictureResultCallback iPictureResultCallback) {
        Object[] objArr = {activity, Integer.valueOf(i), str, file, Integer.valueOf(i2), Integer.valueOf(i3), iPictureResultCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ccde719e0e7d60cba98287df8a079fda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ccde719e0e7d60cba98287df8a079fda");
        } else {
            checkStorageAndCameraPermission(activity, str, iPictureResultCallback, new ICheckPermissionCallback() { // from class: com.sankuai.titans.result.TitansPictureUtil.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.TitansPictureUtil.ICheckPermissionCallback
                public final void hasPermission(Activity activity2) {
                    Object[] objArr2 = {activity2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c71b847488deba1412f6b0e5edbdab98", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c71b847488deba1412f6b0e5edbdab98");
                    } else if (activity2 instanceof FragmentActivity) {
                        new TitansPictureV4((FragmentActivity) activity2).takeVideo(i, str, file, i2, i3, iPictureResultCallback);
                    } else {
                        new TitansPicture(activity2).takeVideo(i, str, file, i2, i3, iPictureResultCallback);
                    }
                }
            });
        }
    }

    private static void checkStorageReadPermission(Activity activity, String str, final IPictureResultCallback iPictureResultCallback, final ICheckPermissionCallback iCheckPermissionCallback) {
        Object[] objArr = {activity, str, iPictureResultCallback, iCheckPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dba49caf59748dbb9cf12042244109f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dba49caf59748dbb9cf12042244109f3");
            return;
        }
        final WeakReference weakReference = new WeakReference(activity);
        TitansPermissionUtil.checkSelfPermission(activity, PermissionGuard.PERMISSION_STORAGE_READ, str, new IRequestPermissionCallback() { // from class: com.sankuai.titans.result.TitansPictureUtil.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.result.IRequestPermissionCallback
            public final void onResult(boolean z, int i) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f55179d6180b99ebce29faab22a69bf3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f55179d6180b99ebce29faab22a69bf3");
                } else if (!z) {
                    IPictureResultCallback.this.onCancel();
                } else {
                    Activity activity2 = (Activity) weakReference.get();
                    if (activity2 == null || activity2.isDestroyed() || activity2.isFinishing()) {
                        IPictureResultCallback.this.onCancel();
                    } else {
                        iCheckPermissionCallback.hasPermission(activity2);
                    }
                }
            }
        });
    }

    private static void checkStorageAndCameraPermission(Activity activity, String str, final IPictureResultCallback iPictureResultCallback, final ICheckPermissionCallback iCheckPermissionCallback) {
        Object[] objArr = {activity, str, iPictureResultCallback, iCheckPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "909fe9df1ab6547204c741b84158a1f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "909fe9df1ab6547204c741b84158a1f5");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(PermissionGuard.PERMISSION_STORAGE);
        arrayList.add(PermissionGuard.PERMISSION_CAMERA);
        final WeakReference weakReference = new WeakReference(activity);
        TitansPermissionUtil.checkSelfPermission(activity, arrayList, str, new IRequestPermissionCallback() { // from class: com.sankuai.titans.result.TitansPictureUtil.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.result.IRequestPermissionCallback
            public final void onResult(boolean z, int i) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9e4c99ff7b8adbdad574176064f5d59e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9e4c99ff7b8adbdad574176064f5d59e");
                } else if (!z) {
                    IPictureResultCallback.this.onCancel();
                } else {
                    Activity activity2 = (Activity) weakReference.get();
                    if (activity2 == null || activity2.isDestroyed() || activity2.isFinishing()) {
                        IPictureResultCallback.this.onCancel();
                    } else {
                        iCheckPermissionCallback.hasPermission(activity2);
                    }
                }
            }
        });
    }
}
