package com.meituan.android.elderly.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OrderInfoBlock implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -3010449896942067559L;
    @SerializedName("title")
    private String blockTitle;
    @SerializedName("type")
    private String blockType;
    @SerializedName("content")
    private List<OrderInfoContent> orderInfoContents;

    public String getBlockType() {
        return this.blockType;
    }

    public void setBlockType(String str) {
        this.blockType = str;
    }

    public String getBlockTitle() {
        return this.blockTitle;
    }

    public void setBlockTitle(String str) {
        this.blockTitle = str;
    }

    public List<OrderInfoContent> getOrderInfoContents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23d7079d06e4fa82d22e4c75a1228eba", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23d7079d06e4fa82d22e4c75a1228eba");
        }
        i.a((List) this.orderInfoContents);
        return this.orderInfoContents;
    }

    public void setOrderInfoContents(List<OrderInfoContent> list) {
        this.orderInfoContents = list;
    }
}
