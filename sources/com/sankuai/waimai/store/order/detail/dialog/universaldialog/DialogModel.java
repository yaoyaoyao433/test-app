package com.sankuai.waimai.store.order.detail.dialog.universaldialog;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DialogModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("button_list")
    public List<BtnInfo> buttonList;
    @SerializedName("lx_info")
    public JudasModel judasModel;
    @SerializedName("message")
    public String message;
    @SerializedName("title")
    public String title;
}
