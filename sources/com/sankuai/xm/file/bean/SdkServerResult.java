package com.sankuai.xm.file.bean;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SdkServerResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private JSONObject mData;
    private SdkErrorMessage mErrorMessage;
    private int mResCode;

    public SdkServerResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be709d67e469e526d0b573171727f866", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be709d67e469e526d0b573171727f866");
            return;
        }
        this.mResCode = 0;
        this.mData = null;
    }

    public int getResCode() {
        return this.mResCode;
    }

    public JSONObject getData() {
        return this.mData;
    }

    public boolean hasError() {
        return this.mResCode != 0;
    }

    public void deserializeJson(String str) throws JSONException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dda69f93b39c68909083bb7bdcc030f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dda69f93b39c68909083bb7bdcc030f3");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject = new JSONObject(str);
            this.mResCode = jSONObject.optInt("rescode");
            this.mData = jSONObject.optJSONObject("data");
        }
    }

    public String getErrorMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90d339600bb2aeec910d197946b35dad", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90d339600bb2aeec910d197946b35dad");
        }
        if (!hasError() || this.mData == null) {
            return null;
        }
        if (this.mErrorMessage == null) {
            this.mErrorMessage = new SdkErrorMessage();
            this.mErrorMessage.deserializeJson(this.mData);
        }
        return this.mErrorMessage.getMessage();
    }
}
