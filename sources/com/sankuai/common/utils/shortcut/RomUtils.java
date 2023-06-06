package com.sankuai.common.utils.shortcut;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RomUtils {
    private static final String KEY_VERSION_EMUI = "ro.build.version.emui";
    private static final String KEY_VERSION_MIUI = "ro.miui.ui.version.name";
    private static final String KEY_VERSION_OPPO = "ro.build.version.opporom";
    private static final String KEY_VERSION_SMARTISAN = "ro.smartisan.version";
    private static final String KEY_VERSION_VIVO = "ro.vivo.os.version";
    private static final String ROM_EMUI = "EMUI";
    private static final String ROM_FLYME = "FLYME";
    private static final String ROM_MIUI = "MIUI";
    private static final String ROM_NUBIA = "NUBIA";
    private static final String ROM_ONEPLUS = "ONEPLUS";
    private static final String ROM_OPPO = "OPPO";
    private static final String ROM_QIKU = "QIKU";
    private static final String ROM_SAMSUNG = "SAMSUNG";
    private static final String ROM_SMARTISAN = "SMARTISAN";
    private static final String ROM_VIVO = "VIVO";
    private static final String TAG = "RomUtils";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String sName;
    private static String sVersion;

    public static boolean isEmui() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "80b9f21045f973645d6f57af5cba9cde", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "80b9f21045f973645d6f57af5cba9cde")).booleanValue() : check("EMUI");
    }

    public static boolean isMiui() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8d95d10daa57963152a3ffa8803558c5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8d95d10daa57963152a3ffa8803558c5")).booleanValue() : check("MIUI");
    }

    public static boolean isVivo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c615e6a8ce6cc0c8dd4f97d41622eaf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c615e6a8ce6cc0c8dd4f97d41622eaf")).booleanValue() : check("VIVO");
    }

    public static boolean isOppo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "12e0aa6b383f1522126c24425435dde5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "12e0aa6b383f1522126c24425435dde5")).booleanValue() : check("OPPO");
    }

    public static boolean isSamsung() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "734e2aa53ebb884b0f0eb1a3f6730f41", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "734e2aa53ebb884b0f0eb1a3f6730f41")).booleanValue() : check("SAMSUNG");
    }

    public static boolean isOneplus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb65d817c14c81cc68afdc55392b0825", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb65d817c14c81cc68afdc55392b0825")).booleanValue() : check("ONEPLUS");
    }

    public static boolean isFlyme() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "23cf401b6c51f3cb112a74956cf5ed85", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "23cf401b6c51f3cb112a74956cf5ed85")).booleanValue() : check("FLYME");
    }

    public static boolean is360() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1b55cde73209a4a9eb00ef69e126673a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1b55cde73209a4a9eb00ef69e126673a")).booleanValue() : check("QIKU") || check("360");
    }

    public static boolean isSmartisan() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ff7c2ede1385288609b0a6df3933276", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ff7c2ede1385288609b0a6df3933276")).booleanValue() : check(ROM_SMARTISAN);
    }

    public static boolean isNubia() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "13431bc0620b11fae665c1c0a75bd45a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "13431bc0620b11fae665c1c0a75bd45a")).booleanValue() : check(ROM_NUBIA);
    }

    public static String getName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f4ed1d15d376a2e56457f0cfe17cb3a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f4ed1d15d376a2e56457f0cfe17cb3a2");
        }
        if (sName == null) {
            check("");
        }
        return sName;
    }

    public static String getVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a650b34eefcdaf0290c90081c3b92a77", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a650b34eefcdaf0290c90081c3b92a77");
        }
        if (sVersion == null) {
            check("");
        }
        return sVersion;
    }

    public static boolean check(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5be6fc2021f26856a6b551cd79216781", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5be6fc2021f26856a6b551cd79216781")).booleanValue();
        }
        StringBuilder sb = new StringBuilder("check sName: ");
        sb.append(sName);
        sb.append(" ,sVersion: ");
        sb.append(sVersion);
        if (sName != null) {
            return sName.equals(str);
        }
        String prop = getProp(KEY_VERSION_MIUI);
        sVersion = prop;
        if (!TextUtils.isEmpty(prop)) {
            sName = "MIUI";
        } else {
            String prop2 = getProp(KEY_VERSION_EMUI);
            sVersion = prop2;
            if (!TextUtils.isEmpty(prop2)) {
                sName = "EMUI";
            } else {
                String prop3 = getProp(KEY_VERSION_OPPO);
                sVersion = prop3;
                if (!TextUtils.isEmpty(prop3)) {
                    sName = "OPPO";
                } else {
                    String prop4 = getProp(KEY_VERSION_VIVO);
                    sVersion = prop4;
                    if (!TextUtils.isEmpty(prop4)) {
                        sName = "VIVO";
                    } else {
                        String prop5 = getProp(KEY_VERSION_SMARTISAN);
                        sVersion = prop5;
                        if (!TextUtils.isEmpty(prop5)) {
                            sName = ROM_SMARTISAN;
                        } else {
                            String str2 = Build.DISPLAY;
                            sVersion = str2;
                            if (!TextUtils.isEmpty(str2) && sVersion.toUpperCase().contains("FLYME")) {
                                sName = "FLYME";
                            } else {
                                sVersion = "unknown";
                                String str3 = Build.MANUFACTURER;
                                if (!TextUtils.isEmpty(str3)) {
                                    if (str3.toUpperCase().contains(ROM_NUBIA)) {
                                        sName = ROM_NUBIA;
                                    } else {
                                        sName = Build.MANUFACTURER.toUpperCase();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return sName.equals(str);
    }

    public static String getProp(String str) {
        BufferedReader bufferedReader;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        BufferedReader bufferedReader2 = null;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64428ffce5235d55c2a909078e8c2018", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64428ffce5235d55c2a909078e8c2018");
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
                try {
                    String readLine = bufferedReader.readLine();
                    bufferedReader.close();
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    new StringBuilder("getProp: ").append(readLine);
                    return readLine;
                } catch (IOException unused) {
                    Log.e(TAG, "getProp exception");
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (IOException unused2) {
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = 1;
        }
    }
}
