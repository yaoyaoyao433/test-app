package com.meituan.android.common.statistics.exposure;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ExposureStatisticInfo {
    private static final String TAG = "ExposureStatisticInfo";
    public static ChangeQuickRedirect changeQuickRedirect;
    public String app_msid;
    public List<Long> duration_gap_list;
    public String log_category;
    public int mduration_cnt;
    public List<Long> mduration_list;
    public long mduration_total;
    public String mreq_id;
    public String msid;
    public int nt;
    public String req_id;
    public String sdk_version;
    public String val_bid;
    public String val_cid;
    public String web_req_id;

    public ExposureStatisticInfo(AbstractExposureInfo abstractExposureInfo) {
        Object[] objArr = {abstractExposureInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3068155a429e76e7dbbbf20b5693d134", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3068155a429e76e7dbbbf20b5693d134");
            return;
        }
        this.mduration_list = new ArrayList();
        this.duration_gap_list = new ArrayList();
        this.sdk_version = abstractExposureInfo.getSdkVersion();
        this.log_category = abstractExposureInfo.getLogCategory();
        this.msid = abstractExposureInfo.getMsid();
        this.app_msid = abstractExposureInfo.getAppMsid();
        this.req_id = abstractExposureInfo.getReqId();
        this.web_req_id = abstractExposureInfo.getWebReqId();
        this.val_bid = abstractExposureInfo.getValBid();
        this.val_cid = abstractExposureInfo.getValCid();
        this.nt = abstractExposureInfo.getNt();
        this.mreq_id = abstractExposureInfo.getMreqId();
        this.mduration_total = abstractExposureInfo.getMdurationTotal();
        this.mduration_cnt = abstractExposureInfo.getMdurationCnt();
        if (abstractExposureInfo.getDuration() != -1) {
            this.mduration_list.add(Long.valueOf(abstractExposureInfo.getDuration()));
        }
        if (abstractExposureInfo.getDurationGap() != -1) {
            this.duration_gap_list.add(Long.valueOf(abstractExposureInfo.getDurationGap()));
        }
    }

    public synchronized void addExposureDuration(List<Long> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "191dc423a5b8b0719dd557febe3fda23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "191dc423a5b8b0719dd557febe3fda23");
        } else {
            this.mduration_list.addAll(list);
        }
    }

    public synchronized void updateStatisticInfoMv(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2466566cca9106d1a617d5bfa40367e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2466566cca9106d1a617d5bfa40367e");
            return;
        }
        if (this.duration_gap_list != null) {
            if (z) {
                this.duration_gap_list.add(Long.valueOf(j));
            } else if (this.duration_gap_list.size() > 0) {
                this.duration_gap_list.set(this.duration_gap_list.size() - 1, Long.valueOf(j));
            }
            LogUtil.log("ExposureInfo jsonObject，duration_gap_list：" + this.duration_gap_list.toString());
        }
    }

    public synchronized void updateStatisticInfoMd(int i, long j, long j2) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85efcafbc44062c5cbc97687eb28a1a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85efcafbc44062c5cbc97687eb28a1a7");
            return;
        }
        this.mduration_cnt = i;
        this.mduration_total = j;
        this.mduration_list.add(Long.valueOf(j2));
        LogUtil.log("ExposureInfo jsonObject，mduration_list：" + this.mduration_list.toString());
    }

    public boolean isPageInfoReady() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b543f59d8fb67a7fb86446471d7cfcbc", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b543f59d8fb67a7fb86446471d7cfcbc")).booleanValue() : (TextUtils.isEmpty(this.val_cid) || TextUtils.isEmpty(this.req_id)) ? false : true;
    }

    public synchronized JSONObject toJSonObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c9a92c8a70d65adfa38ff3d0418ef192", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c9a92c8a70d65adfa38ff3d0418ef192");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_version", this.sdk_version);
            jSONObject.put("log_category", this.log_category);
            jSONObject.put("msid", this.msid);
            jSONObject.put(Constants.Environment.KEY_APP_SESSION, this.app_msid);
            jSONObject.put(Constants.EventInfoConsts.KEY_REQ_ID, this.req_id);
            if (this.nt == 2) {
                jSONObject.put(Constants.Web.KEY_WEB_REQ_ID, this.web_req_id);
            }
            jSONObject.put("val_bid", this.val_bid);
            jSONObject.put("val_cid", this.val_cid);
            jSONObject.put("nt", this.nt);
            jSONObject.put("mreq_id", this.mreq_id);
            jSONObject.put("mduration_cnt", this.mduration_cnt);
            jSONObject.put("mduration_total", this.mduration_total);
            JSONArray jSONArray = new JSONArray();
            for (Long l : this.mduration_list) {
                jSONArray.put(l.longValue());
            }
            jSONObject.put("mduration_list", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (Long l2 : this.duration_gap_list) {
                jSONArray2.put(l2.longValue());
            }
            jSONObject.put("mduration_gaplist", jSONArray2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
