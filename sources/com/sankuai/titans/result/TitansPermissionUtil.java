package com.sankuai.titans.result;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.d;
import com.meituan.android.privacy.interfaces.e;
import com.meituan.android.privacy.interfaces.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.app.permission.TitansPermission;
import com.sankuai.titans.result.v4.permission.TitansPermissionV4;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TitansPermissionUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void checkSelfPermission(Context context, String str, IRequestPermissionCallback iRequestPermissionCallback) {
        Object[] objArr = {context, str, iRequestPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f9d77095b2efae8309f8df6a0086a8fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f9d77095b2efae8309f8df6a0086a8fd");
        } else if (context == null || TextUtils.isEmpty(str)) {
            if (iRequestPermissionCallback != null) {
                iRequestPermissionCallback.onResult(false, PermissionResultCode.getResultCode(-100));
            }
        } else if (iRequestPermissionCallback != null) {
            boolean z = ContextCompat.checkSelfPermission(context, str) == 0;
            iRequestPermissionCallback.onResult(z, z ? PermissionResultCode.getResultCode(2) : PermissionResultCode.getResultCode(-7));
        }
    }

    public static void checkAndRequestPermission(Activity activity, final String str, final String str2, final boolean z, final boolean z2, final IRequestPermissionCallback iRequestPermissionCallback) {
        Object[] objArr = {activity, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), iRequestPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a7ff8bb9505ad830d24af60ecc0e794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a7ff8bb9505ad830d24af60ecc0e794");
        } else if (activity == null || TextUtils.isEmpty(str)) {
            iRequestPermissionCallback.onResult(false, PermissionResultCode.getResultCode(-100));
        } else {
            final WeakReference weakReference = new WeakReference(activity);
            checkSelfPermission(activity, str, str2, z2, new IRequestPermissionCallback() { // from class: com.sankuai.titans.result.TitansPermissionUtil.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public final void onResult(boolean z3, int i) {
                    Object[] objArr2 = {Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2497dc4c441238f773b0a9f7dcae0c3f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2497dc4c441238f773b0a9f7dcae0c3f");
                    } else if (z3) {
                        if (IRequestPermissionCallback.this != null) {
                            IRequestPermissionCallback.this.onResult(true, i);
                        }
                    } else if (z) {
                        if (IRequestPermissionCallback.this != null) {
                            IRequestPermissionCallback.this.onResult(false, i);
                        }
                    } else {
                        Activity activity2 = (Activity) weakReference.get();
                        if (activity2 == null || activity2.isFinishing() || activity2.isDestroyed()) {
                            if (IRequestPermissionCallback.this != null) {
                                IRequestPermissionCallback.this.onResult(false, PermissionResultCode.getResultCode(-100));
                                return;
                            }
                            return;
                        }
                        TitansPermissionUtil.requestPermission(activity2, str, str2, z2, IRequestPermissionCallback.this);
                    }
                }
            });
        }
    }

    public static void checkAndRequestPermission(Activity activity, String str, String str2, boolean z, IRequestPermissionCallback iRequestPermissionCallback) {
        Object[] objArr = {activity, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), iRequestPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "032f580a954dae9c50c12e49a6acc4da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "032f580a954dae9c50c12e49a6acc4da");
        } else {
            checkAndRequestPermission(activity, str, str2, z, true, iRequestPermissionCallback);
        }
    }

    public static void checkSelfPermission(final Context context, List<String> list, final String str, final boolean z, final IRequestPermissionCallback iRequestPermissionCallback) {
        Object[] objArr = {context, list, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), iRequestPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7bccbede5ee4ac687b8a5e95bd0a9e6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7bccbede5ee4ac687b8a5e95bd0a9e6e");
        } else if (context != null && list != null && list.size() != 0) {
            final LinkedList linkedList = new LinkedList(list);
            checkSelfPermission(context, (String) linkedList.poll(), str, z, new IRequestPermissionCallback() { // from class: com.sankuai.titans.result.TitansPermissionUtil.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public final void onResult(boolean z2, int i) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "20b595ece62e0571b44f3a50a5c82d52", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "20b595ece62e0571b44f3a50a5c82d52");
                    } else if (!z2) {
                        linkedList.clear();
                        if (iRequestPermissionCallback != null) {
                            iRequestPermissionCallback.onResult(false, i);
                        }
                    } else {
                        String str2 = (String) linkedList.poll();
                        if (str2 == null) {
                            if (iRequestPermissionCallback != null) {
                                iRequestPermissionCallback.onResult(true, i);
                                return;
                            }
                            return;
                        }
                        TitansPermissionUtil.checkSelfPermission(context, str2, str, z, this);
                    }
                }
            });
        } else if (iRequestPermissionCallback != null) {
            iRequestPermissionCallback.onResult(false, PermissionResultCode.getResultCode(-100));
        }
    }

    public static void checkSelfPermission(Context context, List<String> list, String str, IRequestPermissionCallback iRequestPermissionCallback) {
        Object[] objArr = {context, list, str, iRequestPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "90ec65029da55bbf52fe5ed27049b08b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "90ec65029da55bbf52fe5ed27049b08b");
        } else {
            checkSelfPermission(context, list, str, true, iRequestPermissionCallback);
        }
    }

    public static void checkSelfPermission(Context context, String str, String str2, boolean z, final IRequestPermissionCallback iRequestPermissionCallback) {
        Object[] objArr = {context, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), iRequestPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "330af7221f361e044d3d917ee22102f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "330af7221f361e044d3d917ee22102f7");
        } else if (context == null) {
            if (iRequestPermissionCallback != null) {
                iRequestPermissionCallback.onResult(false, PermissionResultCode.getResultCode(-100));
            }
        } else {
            e check = check(str);
            if (check != null) {
                check.a(context, str, str2, z ? new g() { // from class: com.sankuai.titans.result.TitansPermissionUtil.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.privacy.interfaces.d
                    public final void onResult(String str3, int i) {
                        Object[] objArr2 = {str3, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "619bb3de0609f28766bbaa4776beaf05", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "619bb3de0609f28766bbaa4776beaf05");
                        } else if (IRequestPermissionCallback.this != null) {
                            IRequestPermissionCallback.this.onResult(i > 0, PermissionResultCode.getResultCode(i));
                        }
                    }
                } : new d() { // from class: com.sankuai.titans.result.TitansPermissionUtil.4
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.privacy.interfaces.d
                    public final void onResult(String str3, int i) {
                        Object[] objArr2 = {str3, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "17aee5a8b5ae39c45e8abadb6216b953", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "17aee5a8b5ae39c45e8abadb6216b953");
                        } else if (IRequestPermissionCallback.this != null) {
                            IRequestPermissionCallback.this.onResult(i > 0, PermissionResultCode.getResultCode(i));
                        }
                    }
                });
            } else if (iRequestPermissionCallback != null) {
                iRequestPermissionCallback.onResult(false, PermissionResultCode.getResultCode(-100));
            }
        }
    }

    public static void checkSelfPermission(Context context, String str, String str2, IRequestPermissionCallback iRequestPermissionCallback) {
        Object[] objArr = {context, str, str2, iRequestPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "303398721b58489124dbf0b316e99f4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "303398721b58489124dbf0b316e99f4c");
        } else {
            checkSelfPermission(context, str, str2, true, iRequestPermissionCallback);
        }
    }

    public static void requestPermissions(Activity activity, List<String> list, final String str, final boolean z, final IRequestPermissionCallback iRequestPermissionCallback) {
        Object[] objArr = {activity, list, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), iRequestPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e4018ab99c8797e6a671afd9e2e23901", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e4018ab99c8797e6a671afd9e2e23901");
        } else if (activity == null || list == null || list.size() == 0) {
            if (iRequestPermissionCallback != null) {
                iRequestPermissionCallback.onResult(false, PermissionResultCode.getResultCode(-100));
            }
        } else {
            final LinkedList linkedList = new LinkedList(list);
            final WeakReference weakReference = new WeakReference(activity);
            requestPermission(activity, (String) linkedList.poll(), str, z, new IRequestPermissionCallback() { // from class: com.sankuai.titans.result.TitansPermissionUtil.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.result.IRequestPermissionCallback
                public final void onResult(boolean z2, int i) {
                    Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c8a6da2610a2db563f506923bb9cc85e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c8a6da2610a2db563f506923bb9cc85e");
                    } else if (!z2) {
                        linkedList.clear();
                        if (iRequestPermissionCallback != null) {
                            iRequestPermissionCallback.onResult(false, i);
                        }
                    } else {
                        String str2 = (String) linkedList.poll();
                        if (str2 == null) {
                            if (iRequestPermissionCallback != null) {
                                iRequestPermissionCallback.onResult(true, i);
                                return;
                            }
                            return;
                        }
                        Activity activity2 = (Activity) weakReference.get();
                        if (activity2 == null || activity2.isDestroyed() || activity2.isFinishing()) {
                            if (iRequestPermissionCallback != null) {
                                iRequestPermissionCallback.onResult(false, PermissionResultCode.getResultCode(-100));
                                return;
                            }
                            return;
                        }
                        TitansPermissionUtil.requestPermission(activity2, str2, str, z, this);
                    }
                }
            });
        }
    }

    public static void requestPermissions(Activity activity, List<String> list, String str, IRequestPermissionCallback iRequestPermissionCallback) {
        Object[] objArr = {activity, list, str, iRequestPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d00e237a248fb5c7c8a316a53967fea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d00e237a248fb5c7c8a316a53967fea");
        } else {
            requestPermissions(activity, list, str, true, iRequestPermissionCallback);
        }
    }

    public static void requestPermission(Activity activity, String str, String str2, boolean z, final IRequestPermissionCallback iRequestPermissionCallback) {
        Object[] objArr = {activity, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), iRequestPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "922ac5d5127d85980b8fcf084869288d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "922ac5d5127d85980b8fcf084869288d");
            return;
        }
        e check = check(str);
        if (check != null) {
            check.a(activity, str, str2, z ? new g() { // from class: com.sankuai.titans.result.TitansPermissionUtil.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str3, int i) {
                    Object[] objArr2 = {str3, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "502f3b7d376d17860baace1d8f046b6f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "502f3b7d376d17860baace1d8f046b6f");
                    } else if (IRequestPermissionCallback.this != null) {
                        IRequestPermissionCallback.this.onResult(i > 0, PermissionResultCode.getResultCode(i));
                    }
                }
            } : new d() { // from class: com.sankuai.titans.result.TitansPermissionUtil.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str3, int i) {
                    Object[] objArr2 = {str3, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b615f9f8d1489dc17339dcb04165f6f0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b615f9f8d1489dc17339dcb04165f6f0");
                    } else if (IRequestPermissionCallback.this != null) {
                        IRequestPermissionCallback.this.onResult(i > 0, PermissionResultCode.getResultCode(i));
                    }
                }
            });
        } else if (iRequestPermissionCallback != null) {
            iRequestPermissionCallback.onResult(false, -1);
        }
    }

    public static void requestPermission(Activity activity, String str, String str2, IRequestPermissionCallback iRequestPermissionCallback) {
        Object[] objArr = {activity, str, str2, iRequestPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e5957669996a7b5007c480a02bcf2c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e5957669996a7b5007c480a02bcf2c5");
        } else {
            requestPermission(activity, str, str2, true, iRequestPermissionCallback);
        }
    }

    public static void requestPermission(Activity activity, String[] strArr, int i, IRequestPermissionCallback iRequestPermissionCallback) {
        Object[] objArr = {activity, strArr, Integer.valueOf(i), iRequestPermissionCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5d45cb7dbb4a273f2ff9996ce3d66dbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5d45cb7dbb4a273f2ff9996ce3d66dbf");
        } else if (activity instanceof FragmentActivity) {
            new TitansPermissionV4((FragmentActivity) activity).requestPermission(strArr, i, iRequestPermissionCallback);
        } else {
            new TitansPermission(activity).requestPermission(strArr, i, iRequestPermissionCallback);
        }
    }

    private static e check(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c33d9a0a47d150097d3593758d0b749", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c33d9a0a47d150097d3593758d0b749");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Privacy.createPermissionGuard();
    }
}
