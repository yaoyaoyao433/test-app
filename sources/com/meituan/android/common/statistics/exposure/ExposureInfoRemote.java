package com.meituan.android.common.statistics.exposure;

import com.google.gson.Gson;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.ipc.DataRequest;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.common.statistics.ipc.RequestManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ExposureInfoRemote extends AbstractExposureInfo {
    private static final String TAG = ExposureInfo.class.getSimpleName();
    public static ChangeQuickRedirect changeQuickRedirect;

    public ExposureInfoRemote(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, Object> map, int i, String str9, long j, EventName eventName) {
        super(str, str2, str3, str4, str5, str6, str7, str8, map, i, str9, j, eventName);
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, map, Integer.valueOf(i), str9, new Long(j), eventName};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d6d6d11843337d38dfc46721a004303", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d6d6d11843337d38dfc46721a004303");
        }
    }

    @Override // com.meituan.android.common.statistics.exposure.AbstractExposureInfo
    public void mv() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d794d91c735f7fe0849ca29992a041f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d794d91c735f7fe0849ca29992a041f8");
        } else if (ConfigManager.getInstance(Statistics.getContext()).isModelExposureOn()) {
            super.mv();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", this.log_category);
                jSONObject.put("pageInfoKey", this.mPageInfoKey);
                jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_START_EVENT);
            } catch (JSONException unused) {
            }
            final DataRequest build = new DataRequest.Builder().method("ExposureInfoRemote.mv").nm(EventName.MODEL_VIEW.toString()).parameter(new Gson().toJson(this)).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(Statistics.getContext())).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.exposure.ExposureInfoRemote.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ee387be28923584466f967400e77890d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ee387be28923584466f967400e77890d");
                    } else {
                        RequestManager.getInstance().request(Statistics.getContext(), build);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.statistics.exposure.AbstractExposureInfo
    public void md() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0b73b6b2a631450ad874ee1354340bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0b73b6b2a631450ad874ee1354340bc");
        } else if (!ConfigManager.getInstance(Statistics.getContext()).isModelExposureOn() || this.curEventName == EventName.MODEL_DISAPPEAR) {
        } else {
            this.curEventName = EventName.MODEL_DISAPPEAR;
            super.md();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", this.log_category);
                jSONObject.put("pageInfoKey", this.mPageInfoKey);
                jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_STOP_EVENT);
            } catch (JSONException unused) {
            }
            final DataRequest build = new DataRequest.Builder().method("ExposureInfoRemote.md").nm(EventName.MODEL_DISAPPEAR.toString()).parameter(new Gson().toJson(this)).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(Statistics.getContext())).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.exposure.ExposureInfoRemote.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d73761cf37aee8effae3a144e1b2e0de", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d73761cf37aee8effae3a144e1b2e0de");
                    } else {
                        RequestManager.getInstance().request(Statistics.getContext(), build);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.statistics.exposure.AbstractExposureInfo
    public void mrnModelDisappear(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c8a7f843cfc709eb0e045b5c6b7bf54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c8a7f843cfc709eb0e045b5c6b7bf54");
        } else if (!ConfigManager.getInstance(Statistics.getContext()).isModelExposureOn() || this.curEventName == EventName.MODEL_DISAPPEAR) {
        } else {
            this.curEventName = EventName.MODEL_DISAPPEAR;
            super.mrnModelDisappear(j, j2, i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("category", this.log_category);
                jSONObject.put("pageInfoKey", this.mPageInfoKey);
                jSONObject.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_MRN_STOP_EVENT);
            } catch (JSONException unused) {
            }
            final DataRequest build = new DataRequest.Builder().method("ExposureInfoRemote.mrnModelDisappear").nm(EventName.MODEL_DISAPPEAR.toString()).parameter(new Gson().toJson(this)).options(jSONObject.toString()).process(ProcessUtils.getCurrentProcessName(Statistics.getContext())).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.exposure.ExposureInfoRemote.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1116c0818b8d260814fa0d3b1d50d549", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1116c0818b8d260814fa0d3b1d50d549");
                    } else {
                        RequestManager.getInstance().request(Statistics.getContext(), build);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.common.statistics.exposure.AbstractExposureInfo
    public void commit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5316f2a7dc5b8070269b5db3fba12f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5316f2a7dc5b8070269b5db3fba12f9");
        } else {
            commit(this.mreq_id);
        }
    }

    public static void commit(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa6b66ce939554d8afcaaaed2c61b2f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa6b66ce939554d8afcaaaed2c61b2f3");
        } else if (ConfigManager.getInstance(Statistics.getContext()).isModelExposureOn()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mreq_id", str);
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("OpType", RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_MD_COMMIT_EVENT);
            } catch (JSONException unused2) {
            }
            final DataRequest build = new DataRequest.Builder().method("ExposureInfoRemote.commit").nm(EventName.MODEL_DISAPPEAR.toString()).parameter(jSONObject.toString()).options(jSONObject2.toString()).process(ProcessUtils.getCurrentProcessName(Statistics.getContext())).build();
            submitOnThread(new Runnable() { // from class: com.meituan.android.common.statistics.exposure.ExposureInfoRemote.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8d7ead4ec820782a3ecde307383dbd39", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8d7ead4ec820782a3ecde307383dbd39");
                    } else {
                        RequestManager.getInstance().request(Statistics.getContext(), DataRequest.this);
                    }
                }
            });
        }
    }
}
