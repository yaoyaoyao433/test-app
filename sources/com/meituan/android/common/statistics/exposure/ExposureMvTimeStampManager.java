package com.meituan.android.common.statistics.exposure;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ExposureMvTimeStampManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<IExposureMvEvent> mvEventList;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class ExposureMvTimeStampManagerHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static ExposureMvTimeStampManager exposureMvTimeStampManager = new ExposureMvTimeStampManager();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface IExposureMvEvent {
        void onEvent(String str);
    }

    public ExposureMvTimeStampManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f19aca45f45a423b49c163bd89f3337", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f19aca45f45a423b49c163bd89f3337");
        } else {
            this.mvEventList = new ArrayList();
        }
    }

    public static ExposureMvTimeStampManager getInstance() {
        return ExposureMvTimeStampManagerHolder.exposureMvTimeStampManager;
    }

    public void onHandle(MvTimeStamp mvTimeStamp) {
        Object[] objArr = {mvTimeStamp};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13b8e0ec20bc498e49b7b816cdd31a60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13b8e0ec20bc498e49b7b816cdd31a60");
        } else if (!CollectionUtils.isEmpty(this.mvEventList) && mvTimeStamp != null) {
            for (IExposureMvEvent iExposureMvEvent : this.mvEventList) {
                if (iExposureMvEvent != null) {
                    iExposureMvEvent.onEvent(mvTimeStamp.toJson());
                }
            }
        }
    }

    public void register(IExposureMvEvent iExposureMvEvent) {
        Object[] objArr = {iExposureMvEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50e5040f4af493cd2730541b76a43efb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50e5040f4af493cd2730541b76a43efb");
            return;
        }
        synchronized (this.mvEventList) {
            this.mvEventList.add(iExposureMvEvent);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class MvTimeStamp {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String mReqId;
        public long tm;

        public MvTimeStamp(String str, long j) {
            Object[] objArr = {str, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6d787f6e8c7a1f8585f0042e8065fe8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6d787f6e8c7a1f8585f0042e8065fe8");
                return;
            }
            this.mReqId = str;
            this.tm = j;
        }

        public String toJson() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74ab29dd43b3cd0ac8598f311d127301", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74ab29dd43b3cd0ac8598f311d127301");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mreq_id", this.mReqId);
                jSONObject.put("current_tm", this.tm);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject.toString();
        }
    }
}
