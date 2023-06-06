package com.meituan.android.common.dfingerprint.dfpid.oaid.helpers;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.oaid.OaidCallback;
import com.meituan.android.common.unionid.oneid.oaid.OaidManager;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public class DevicesIDsHelper {
    public static final long TIME_OUT_IN_SEC = 4;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>(1);
    private static String sOAID = "";

    /* loaded from: classes2.dex */
    public interface AppIdsUpdater {
        void OnIdsAvalid(@NonNull String str);
    }

    private String getBrand() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eefcd8e712f64ae2c640e83469c64b48", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eefcd8e712f64ae2c640e83469c64b48") : Build.BRAND.toUpperCase();
    }

    private static String getManufacturer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bf41a6726631b39a1d278db26da3dcfa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bf41a6726631b39a1d278db26da3dcfa") : Build.MANUFACTURER.toUpperCase();
    }

    public static String getOAID(Context context) {
        ZTEDeviceIDHelper zTEDeviceIDHelper;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a2454fd71295379ab6b199597436bd4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a2454fd71295379ab6b199597436bd4");
        }
        if (TextUtils.isEmpty(sOAID)) {
            String str = "";
            if ("ASUS".equals(getManufacturer().toUpperCase())) {
                str = new ASUSDeviceIDHelper(context).getID();
            } else if ("LENOVO".equals(getManufacturer().toUpperCase()) || "MOTOLORA".equals(getManufacturer().toUpperCase())) {
                str = new LenovoDeviceIDHelper(context).getIdRun();
            } else if ("MEIZU".equals(getManufacturer().toUpperCase())) {
                str = new MeizuDeviceIDHelper(context).getMeizuID();
            } else if ("NUBIA".equals(getManufacturer().toUpperCase())) {
                str = new NubiaDeviceIDHelper(context).getNubiaID();
            } else if ("BLACKSHARK".equals(getManufacturer().toUpperCase())) {
                str = new XiaomiDeviceIDHelper(context).getOAID();
            } else {
                if ("ZTE".equals(getManufacturer().toUpperCase())) {
                    zTEDeviceIDHelper = new ZTEDeviceIDHelper(context);
                } else if ("FERRMEOS".equals(getManufacturer().toUpperCase()) || isFreeMeOS()) {
                    zTEDeviceIDHelper = new ZTEDeviceIDHelper(context);
                } else if ("SSUI".equals(getManufacturer().toUpperCase()) || isSSUIOS()) {
                    zTEDeviceIDHelper = new ZTEDeviceIDHelper(context);
                } else {
                    OaidManager.getInstance().getOaid(context, new OaidCallback() { // from class: com.meituan.android.common.dfingerprint.dfpid.oaid.helpers.DevicesIDsHelper.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
                        public final void onFail(String str2) {
                            Object[] objArr2 = {str2};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "03ade9b7bf252d326fa055fe871269bf", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "03ade9b7bf252d326fa055fe871269bf");
                            } else {
                                MTGuardLog.setLogan("getOaid fail:".concat(String.valueOf(str2)));
                            }
                        }

                        @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
                        public final void onSuccuss(boolean z, String str2, boolean z2) {
                            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8985a806413cad9978141d20d52d7fe7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8985a806413cad9978141d20d52d7fe7");
                                return;
                            }
                            MTGuardLog.setLogan("getOaid success, changed = " + z + ", oaid = " + str2 + ", enabled = " + z2);
                            try {
                                DevicesIDsHelper.linkedBlockingQueue.offer(str2, 4L, TimeUnit.SECONDS);
                            } catch (InterruptedException e) {
                                MTGuardLog.setErrorLogan(e);
                            }
                        }
                    });
                    try {
                        str = linkedBlockingQueue.poll(4L, TimeUnit.SECONDS);
                    } catch (InterruptedException e) {
                        MTGuardLog.setErrorLogan(e);
                    }
                }
                str = zTEDeviceIDHelper.getID();
            }
            if (str == null) {
                str = "";
            }
            sOAID = str;
            return str;
        }
        return sOAID;
    }

    public static String getProperty(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bbcc264e7cf2a7c62c60bc05f2c7fe41", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bbcc264e7cf2a7c62c60bc05f2c7fe41");
        }
        if (str == null) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "unknown");
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
            return null;
        }
    }

    public static boolean isFreeMeOS() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "23a9eaa3d245cd28414c05ac9db7c2a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "23a9eaa3d245cd28414c05ac9db7c2a7")).booleanValue();
        }
        String property = getProperty("ro.build.freeme.label");
        return !TextUtils.isEmpty(property) && property.equalsIgnoreCase("FREEMEOS");
    }

    public static boolean isSSUIOS() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "29b9b973b44bdd214d57ae7fed92d65f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "29b9b973b44bdd214d57ae7fed92d65f")).booleanValue();
        }
        String property = getProperty("ro.ssui.product");
        return (TextUtils.isEmpty(property) || property.equalsIgnoreCase("unknown")) ? false : true;
    }
}
