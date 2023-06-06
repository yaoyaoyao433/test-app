package com.meituan.android.common.horn;

import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.util.ArrayMap;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titans.utils.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MonitorRecord {
    public static final String MODE_ACCESS_CACHE = "access_cache";
    public static final String MODE_BATCH_NET = "net_batch";
    public static final String MODE_BATCH_NET_304 = "net_batch_304";
    public static final String MODE_CACHE = "cache";
    public static final String MODE_CACHE_DURATION = "cache_duration";
    public static final String MODE_LOW_PRIORITY = "cache_low_priority";
    public static final String MODE_NET_EXCEPTION = "net_exception";
    public static final String MODE_NO_NET = "no_net";
    public static final String MODE_SINGLE_NET = "net_single";
    public static final String MODE_SINGLE_NET_304 = "net_single_304";
    private static final String TOTAL = "$batch$";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mCallbackError;
    private long mCallbackTime;
    private long mConstructorTime;
    private String mETag;
    private String mMode;
    private String mSource;
    @NonNull
    private final String mType;
    private String mVersion;

    public MonitorRecord() {
        this(TOTAL);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b9520c8e51a3ca40062b3bd8e044049", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b9520c8e51a3ca40062b3bd8e044049");
        }
    }

    public MonitorRecord(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1004148c4b8a8303f8d365a34b57578", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1004148c4b8a8303f8d365a34b57578");
            return;
        }
        this.mType = str;
        this.mConstructorTime = SystemClock.elapsedRealtime();
    }

    public MonitorRecord childRecord(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baf015700e7a8a159577ba1315978599", 6917529027641081856L)) {
            return (MonitorRecord) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baf015700e7a8a159577ba1315978599");
        }
        MonitorRecord monitorRecord = new MonitorRecord(str);
        monitorRecord.setMode(this.mMode);
        monitorRecord.setSource(this.mSource);
        monitorRecord.setVersion(this.mVersion);
        monitorRecord.setETag(this.mETag);
        monitorRecord.setCallbackTime(this.mCallbackTime);
        monitorRecord.setCallbackError(this.mCallbackError);
        monitorRecord.mConstructorTime = this.mConstructorTime;
        return monitorRecord;
    }

    public void setCallbackError(String str) {
        this.mCallbackError = str;
    }

    public void setCallbackTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05a6c8416c12f10750dd1bd256705f10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05a6c8416c12f10750dd1bd256705f10");
        } else {
            this.mCallbackTime = j;
        }
    }

    public void setMode(String str) {
        this.mMode = str;
    }

    public void setSource(String str) {
        this.mSource = str;
    }

    public void setVersion(String str) {
        this.mVersion = str;
    }

    public void setETag(String str) {
        this.mETag = str;
    }

    public String getETag() {
        return this.mETag;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> hashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6615d77e9bb9a46847b2aa5ee662889c", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6615d77e9bb9a46847b2aa5ee662889c");
        }
        if (Build.VERSION.SDK_INT >= 19) {
            hashMap = new ArrayMap<>();
        } else {
            hashMap = new HashMap<>();
        }
        hashMap.put("sdkVersion", com.meituan.android.common.horn.core.BuildConfig.VERSION_NAME_HORN);
        hashMap.put(JsBridgeResult.ARG_KEY_LOCATION_MODE, this.mMode);
        hashMap.put("source", this.mSource);
        hashMap.put("name", this.mType);
        hashMap.put("version", this.mVersion);
        hashMap.put(Constants.HTTP_HEADER_KEY_E_TAG, this.mETag);
        hashMap.put("callbackTime", Long.valueOf(this.mCallbackTime));
        hashMap.put("callbackError", this.mCallbackError);
        hashMap.put("totalTime", Long.valueOf(SystemClock.elapsedRealtime() - this.mConstructorTime));
        return hashMap;
    }
}
