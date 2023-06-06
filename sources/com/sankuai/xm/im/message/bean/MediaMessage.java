package com.sankuai.xm.im.message.bean;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.im.utils.a;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class MediaMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected String mCustom;
    private JSONObject mCustomJson;
    private final Object mCustomLock;
    protected String mName;
    protected int mOperationType;
    protected String mPath;
    protected long mSize;
    protected String mToken;
    protected String mUrl;

    public MediaMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ae58950e18a6389d5bd28ee082ecfc9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ae58950e18a6389d5bd28ee082ecfc9");
            return;
        }
        this.mPath = "";
        this.mUrl = "";
        this.mName = "";
        this.mSize = 0L;
        this.mToken = "";
        this.mOperationType = 0;
        this.mCustom = "";
        this.mCustomLock = new Object();
    }

    public String getPath() {
        return this.mPath;
    }

    public void setPath(String str) {
        this.mPath = str;
    }

    public String getName() {
        return this.mName;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public long getSize() {
        return this.mSize;
    }

    public void setSize(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebd18b3ef801a9d59732eb257e498629", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebd18b3ef801a9d59732eb257e498629");
        } else {
            this.mSize = j;
        }
    }

    public String getToken() {
        return this.mToken;
    }

    public void setToken(String str) {
        this.mToken = str;
    }

    public int getOperationType() {
        return this.mOperationType;
    }

    public void setOperationType(int i) {
        this.mOperationType = i;
    }

    public void setCustom(Object obj, String... strArr) {
        Object[] objArr = {obj, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "812ead639919cac997cc0393fedb81ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "812ead639919cac997cc0393fedb81ed");
        } else if (!b.b(strArr)) {
            try {
                synchronized (this.mCustomLock) {
                    if (this.mCustomJson == null) {
                        if (TextUtils.isEmpty(this.mCustom)) {
                            this.mCustomJson = new JSONObject();
                        } else {
                            this.mCustomJson = new JSONObject(this.mCustom);
                        }
                    }
                    JSONObject jSONObject = this.mCustomJson;
                    for (int i = 0; i < strArr.length - 1; i++) {
                        JSONObject optJSONObject = jSONObject.optJSONObject(strArr[i]);
                        if (optJSONObject == null) {
                            optJSONObject = new JSONObject();
                            jSONObject.put(strArr[i], optJSONObject);
                        }
                        jSONObject = optJSONObject;
                    }
                    jSONObject.put(strArr[strArr.length - 1], obj);
                    this.mCustom = this.mCustomJson.toString();
                }
            } catch (JSONException e) {
                a.a(e, "%s::setCustomJson exception.", getClass().getSimpleName());
            }
        } else if (obj != null) {
            this.mCustom = obj.toString();
        } else {
            this.mCustom = null;
        }
    }

    public Object getCustom(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc9f15ea01a2f5357fd684f9f7252d3b", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc9f15ea01a2f5357fd684f9f7252d3b");
        }
        if (b.b(strArr)) {
            return this.mCustom;
        }
        try {
            synchronized (this.mCustomLock) {
                if (this.mCustomJson == null) {
                    if (TextUtils.isEmpty(this.mCustom)) {
                        this.mCustomJson = new JSONObject();
                    } else {
                        this.mCustomJson = new JSONObject(this.mCustom);
                    }
                }
                JSONObject jSONObject = this.mCustomJson;
                for (int i = 0; i < strArr.length - 1; i++) {
                    jSONObject = jSONObject.optJSONObject(strArr[i]);
                    if (jSONObject == null) {
                        return null;
                    }
                }
                return jSONObject.opt(strArr[strArr.length - 1]);
            }
        } catch (JSONException e) {
            a.a(e, "%s::getCustom exception.", getClass().getSimpleName());
            return null;
        }
    }

    public boolean containsUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b9f82efed6bd4f5011345a28ab74f59", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b9f82efed6bd4f5011345a28ab74f59")).booleanValue() : !TextUtils.isEmpty(getUrl()) && getUrl().equals(str);
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3f56b28a95e0c2629d29df941cda17f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3f56b28a95e0c2629d29df941cda17f");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof MediaMessage) {
            MediaMessage mediaMessage = (MediaMessage) iMMessage;
            mediaMessage.mPath = this.mPath;
            mediaMessage.mUrl = this.mUrl;
            mediaMessage.mName = this.mName;
            mediaMessage.mSize = this.mSize;
            mediaMessage.mToken = this.mToken;
            mediaMessage.mOperationType = this.mOperationType;
            mediaMessage.mCustom = this.mCustom;
        }
    }
}
