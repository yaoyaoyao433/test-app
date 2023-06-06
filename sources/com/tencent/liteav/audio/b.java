package com.tencent.liteav.audio;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    private final SharedPreferences a;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        private static final b a = new b();
    }

    public static b a() {
        return a.a;
    }

    private b() {
        this.a = TXCCommonUtil.getAppContext().getSharedPreferences("txc_audio_settings", 0);
    }

    public void a(String str, long j) {
        a(str, Long.valueOf(j));
    }

    public long b(String str, long j) {
        return ((Long) b(str, Long.valueOf(j))).longValue();
    }

    @SuppressLint({"ApplySharedPref"})
    private void a(String str, Object obj) {
        SharedPreferences.Editor edit = this.a.edit();
        if (obj instanceof Integer) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof String) {
            edit.putString(str, obj.toString());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Long) {
            edit.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            edit.putLong(str, Double.doubleToRawLongBits(((Double) obj).doubleValue()));
        }
        edit.commit();
    }

    private Object b(String str, Object obj) {
        try {
            if (obj instanceof String) {
                return this.a.getString(str, obj.toString());
            }
            if (obj instanceof Integer) {
                return Integer.valueOf(this.a.getInt(str, ((Integer) obj).intValue()));
            }
            if (obj instanceof Boolean) {
                return Boolean.valueOf(this.a.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            if (obj instanceof Long) {
                return Long.valueOf(this.a.getLong(str, ((Long) obj).longValue()));
            }
            if (obj instanceof Float) {
                return Float.valueOf(this.a.getFloat(str, ((Float) obj).floatValue()));
            }
            return obj instanceof Double ? Double.valueOf(Double.longBitsToDouble(this.a.getLong(str, Double.doubleToLongBits(((Double) obj).doubleValue())))) : obj;
        } catch (Exception e) {
            TXCLog.e("TXCAudioSettings", "get value from sharedpreference failed for key: %s", str, e);
            return obj;
        }
    }
}
