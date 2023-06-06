package com.meituan.passport.pojo;

import android.support.annotation.RestrictTo;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class YodaError implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public String message;
    @SerializedName(OtherVerifyTypeConstants.REQUEST_CODE)
    public String requestCode;
}
