package com.meituan.android.common.aidata.ai.bundle.download.record;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.ai.bundle.load.BundleRequest;
import com.meituan.android.common.aidata.ai.utils.AiUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DownloadRecord {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isLazyDownload;
    private BundleRequest mBundleRequest;
    private List<RecordInfo> mRecordList;
    private String mTemplateId;

    public void reportSuccess() {
    }

    public DownloadRecord(@Nullable BundleRequest bundleRequest, boolean z) {
        Object[] objArr = {bundleRequest, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef25e10a29a78f8ad8147f9f604a3bc5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef25e10a29a78f8ad8147f9f604a3bc5");
            return;
        }
        this.mRecordList = new CopyOnWriteArrayList();
        this.mBundleRequest = bundleRequest;
        if (bundleRequest != null) {
            this.mTemplateId = bundleRequest.getJsId();
        }
        this.isLazyDownload = z;
    }

    public static DownloadRecord create(@Nullable BundleRequest bundleRequest, boolean z) {
        Object[] objArr = {bundleRequest, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f802477a3b1ba43a63bfea0c8fad4260", RobustBitConfig.DEFAULT_VALUE) ? (DownloadRecord) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f802477a3b1ba43a63bfea0c8fad4260") : new DownloadRecord(bundleRequest, z);
    }

    public void setTemplateId(String str) {
        this.mTemplateId = str;
    }

    public BundleRequest getBundleRequest() {
        return this.mBundleRequest;
    }

    public synchronized void add(RecordInfo recordInfo) {
        Object[] objArr = {recordInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b5ff5f79c32b5f0c27f8f30f9990f72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b5ff5f79c32b5f0c27f8f30f9990f72");
            return;
        }
        if (!this.mRecordList.contains(recordInfo)) {
            this.mRecordList.add(recordInfo);
        }
    }

    public synchronized void remove(RecordInfo recordInfo) {
        Object[] objArr = {recordInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11c816cf3ab9fb69bba53c48500c3110", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11c816cf3ab9fb69bba53c48500c3110");
        } else {
            this.mRecordList.remove(recordInfo);
        }
    }

    public void reportError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a917cfdedbfd584302940daf6b7e65a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a917cfdedbfd584302940daf6b7e65a2");
        } else if (!AiUtils.isEmpty(this.mRecordList)) {
            HashMap hashMap = new HashMap();
            hashMap.put("template_id", this.mTemplateId);
            for (RecordInfo recordInfo : this.mRecordList) {
                String createKey = createKey(recordInfo);
                String createValue = createValue(recordInfo);
                StringBuilder sb = new StringBuilder("reportError::key=");
                sb.append(createKey);
                sb.append(",value=");
                sb.append(createValue);
                hashMap.put(createKey, createValue);
            }
            this.mRecordList.clear();
        }
    }

    private String createValue(RecordInfo recordInfo) {
        Object[] objArr = {recordInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad9b76b9c5d3473ca138526c501b8cb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad9b76b9c5d3473ca138526c501b8cb3");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(recordInfo.getTrace());
        sb.append("::");
        sb.append(recordInfo.getDesc());
        sb.append(" [" + this.mTemplateId + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (recordInfo.getErrorCode() > 0) {
            sb.append(">>>异常Code=");
            sb.append(recordInfo.getErrorCode());
        }
        return sb.toString();
    }

    private String createKey(RecordInfo recordInfo) {
        Object[] objArr = {recordInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cffc81354002c83111513280532e8d79", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cffc81354002c83111513280532e8d79") : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date(recordInfo.getTimestamp()));
    }
}
