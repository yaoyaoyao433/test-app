package com.sankuai.waimai.store.manager.marketing.parser.inner;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public abstract class SGBaseTemplateData<Data, Lx> implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("log_info")
    public Lx logInfo;
    @SerializedName("response_info")
    public Data responseInfo;
}
