package com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.order.api.model.DinersOption;
import com.sankuai.waimai.business.order.submit.model.BusinessType;
import com.sankuai.waimai.business.order.submit.model.FieldInfo;
import com.sankuai.waimai.business.order.submit.model.TablewareSettingsInfo;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CodeDesc;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ExtendInfoModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_info")
    public AddressItem addressItem;
    @SerializedName("address_type")
    public int addressType;
    @SerializedName("business_type")
    public long businessType;
    @SerializedName("business_type_list")
    public List<BusinessType> businessTypeList;
    @SerializedName("diners_option")
    public List<DinersOption> dinersOptionList;
    public int dinnersCount;
    @SerializedName("experiment_type")
    public int experimentType;
    @SerializedName("has_invoice")
    public int has_invoice;
    @SerializedName("invoice_link")
    public String invoice_link;
    @SerializedName("invoice_make_type")
    public int invoice_make_type;
    @SerializedName("invoice_show")
    public boolean invoice_show;
    @SerializedName("invoice_support")
    public int invoice_support;
    @SerializedName("invoice_text")
    public String invoice_text;
    @SerializedName("invoice_title")
    public String invoice_title;
    @SerializedName("invoice_type")
    public int invoice_type;
    public boolean isMultiPersonOrder;
    @SerializedName("min_invoice_price")
    public double min_invoice_price;
    @SerializedName("no_product_reminds")
    public List<CodeDesc> noProductReminds;
    public String recipient_notes;
    @SerializedName("remark_field")
    public FieldInfo remark_field;
    public int select_dinner_count;
    public int show_remark_buddle;
    @SerializedName("tableware_advocate_tip")
    public String tablewareAdvocateTip;
    @SerializedName("tableware_settings_info")
    public TablewareSettingsInfo tablewareSettingsInfo;
    @SerializedName("default_tableware_tip")
    public String tablewareTip;
    @SerializedName("taxpayer_id_number")
    public String taxpayer_id_number;
}
