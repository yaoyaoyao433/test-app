package com.meituan.android.yoda.retrofit;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class Error implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("YODErrorUserInteractionKey")
    public int YODErrorUserInteractionKey;
    @SerializedName("category")
    public String category;
    @SerializedName("code")
    public int code;
    @SerializedName("icons")
    public List<String> icons;
    @SerializedName("message")
    public String message;
    @SerializedName(OtherVerifyTypeConstants.REQUEST_CODE)
    public String requestCode;

    public Error() {
    }

    public Error(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2fdcf85f974260dba300e7478ced4af", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2fdcf85f974260dba300e7478ced4af");
        } else {
            this.code = i;
        }
    }

    public Error(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b48ac92fd4c3a1afdbc70dc937390915", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b48ac92fd4c3a1afdbc70dc937390915");
            return;
        }
        this.code = i;
        this.message = str;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb9ef08eb450040d430f654a2ec9c0ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb9ef08eb450040d430f654a2ec9c0ab");
        }
        return "Error{code=" + this.code + ", message='" + this.message + "', requestCode='" + this.requestCode + "'}";
    }
}
