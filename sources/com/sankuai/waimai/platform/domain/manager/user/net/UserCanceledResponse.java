package com.sankuai.waimai.platform.domain.manager.user.net;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class UserCanceledResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("userIdCanceled")
    public int userIdCanceled = -1;
    @SerializedName("uuidCanceled")
    public int uuidCanceled = -1;
}
