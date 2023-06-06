package com.meituan.android.common.unionid.oneid.statstics;

import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.monitor.MonitorLog;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StatUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    public JSONObject mark;
    public MonitorLog monitorLog;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class Use {
        public static final int FOR_DID = 0;
        public static final int FOR_IMEI1 = 1;
        public static final int FOR_IMEI2 = 2;
        public static final int FOR_MEID = 3;
        public static ChangeQuickRedirect changeQuickRedirect;

        public static final String getForUse(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4283459a77fd0073d9c2afaae284d305", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4283459a77fd0073d9c2afaae284d305");
            }
            switch (i) {
                case 1:
                    return DeviceInfo.IMEI_1;
                case 2:
                    return "imei2";
                case 3:
                    return "meid";
                default:
                    return "did";
            }
        }
    }

    public StatUtil() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40be8d68c5adec06ca32777f670936e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40be8d68c5adec06ca32777f670936e8");
        } else {
            this.mark = null;
        }
    }

    public void markStat(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93812b26de039a3ef62bea8d611dbb74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93812b26de039a3ef62bea8d611dbb74");
        } else if (TextUtils.isEmpty(str) || i < 0) {
        } else {
            String convertKey = convertKey(str);
            if (this.mark == null) {
                this.mark = new JSONObject();
            }
            if (this.mark != null) {
                try {
                    this.mark.put(convertKey, i);
                } catch (Throwable unused) {
                }
            }
        }
    }

    private String convertKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a33c2482b52db00322cb274fd1fe160", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a33c2482b52db00322cb274fd1fe160") : DeviceInfo.IMEI_1.equals(str) ? "token1" : "imei2".equals(str) ? "token2" : "meid".equals(str) ? "token3" : "oaid".equals(str) ? "tokeno" : str;
    }

    public void markStat(String str, int i, JSONObject jSONObject) {
        Object[] objArr = {str, Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6731593d070b0b6c8a0e501177b87718", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6731593d070b0b6c8a0e501177b87718");
        } else if (TextUtils.isEmpty(str) || i < 0) {
        } else {
            if (this.mark == null) {
                this.mark = new JSONObject();
            }
            if (this.mark != null) {
                try {
                    this.mark.put(str, i);
                } catch (Throwable unused) {
                }
            }
            MonitorManager.addEvent(this, str, i, false, jSONObject);
        }
    }

    public boolean hasMark(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12b5f8fa779e14c77bf4dff033080a5b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12b5f8fa779e14c77bf4dff033080a5b")).booleanValue() : (TextUtils.isEmpty(str) || this.mark == null || !this.mark.has(str)) ? false : true;
    }

    public void clear(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74db6648801b5bfd64defc1234ebf909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74db6648801b5bfd64defc1234ebf909");
        } else if (TextUtils.isEmpty(str) || this.mark == null) {
        } else {
            try {
                this.mark.remove(str);
            } catch (Throwable unused) {
            }
        }
    }

    public JSONObject getMark() {
        return this.mark;
    }

    public String toJsonStr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c1d155ef06c8372eb923b40e9583dad", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c1d155ef06c8372eb923b40e9583dad");
        }
        if (this.mark != null) {
            try {
                return this.mark.toString();
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }
}
