package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MemberInfoEntity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("my_member_scheme")
    public String myMemberScheme;
    @SerializedName("my_member_status")
    public boolean myMemberStatus;
}
