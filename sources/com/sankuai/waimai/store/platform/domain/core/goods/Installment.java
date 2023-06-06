package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Installment implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bank_card_id_list")
    public List<String> bankCardIdList;
    @SerializedName("bank_type_id")
    public String bankTypeId;
    @SerializedName("pay_type")
    public String payType;
    @SerializedName("service_fee")
    public String serviceFee;
    @SerializedName("term")
    public int term;
    @SerializedName("term_key")
    public String termKey;
    @SerializedName("term_money")
    public String termMoney;
}
