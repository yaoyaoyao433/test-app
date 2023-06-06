package com.meituan.android.cashier.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OrderInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2881620820883468099L;
    @SerializedName("block_count")
    private int blockCount;
    @SerializedName(ConfigInfo.MODULE_BLOCK)
    private List<OrderInfoBlock> orderInfoBlocks;

    public int getBlockCount() {
        return this.blockCount;
    }

    public void setBlockCount(int i) {
        this.blockCount = i;
    }

    public List<OrderInfoBlock> getOrderInfoBlocks() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05e3eb04e46566f9f9b5d8f415d83a96", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05e3eb04e46566f9f9b5d8f415d83a96");
        }
        i.a((List) this.orderInfoBlocks);
        return this.orderInfoBlocks;
    }

    public void setOrderInfoBlocks(List<OrderInfoBlock> list) {
        this.orderInfoBlocks = list;
    }
}
