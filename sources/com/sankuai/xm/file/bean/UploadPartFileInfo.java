package com.sankuai.xm.file.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class UploadPartFileInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean mExists;
    private String mUploadId;

    public UploadPartFileInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f28258af7174309a4ef1a52d9d8b901a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f28258af7174309a4ef1a52d9d8b901a");
            return;
        }
        this.mUploadId = "";
        this.mExists = false;
    }

    public String getUploadId() {
        return this.mUploadId;
    }

    public boolean isExists() {
        return this.mExists;
    }

    public void deserializeJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "847d20940c21dbfdc0e72472ca984bc5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "847d20940c21dbfdc0e72472ca984bc5");
        } else if (jSONObject == null) {
        } else {
            this.mUploadId = jSONObject.optString("uploadId");
            this.mExists = jSONObject.optBoolean("exists");
        }
    }
}
