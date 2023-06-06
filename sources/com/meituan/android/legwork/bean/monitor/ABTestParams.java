package com.meituan.android.legwork.bean.monitor;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ABTestParams implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("business_order")
    public Map<String, String> business_order;
    @SerializedName("homepage_category_test")
    public Map<String, Object> homepageTuningCatagoryData;
    @SerializedName("addresspage_autorecognition_native")
    public Map<String, String> isRecognitionOpen;
    @SerializedName("recognition_address_pic_native")
    public Map<String, String> isRecognitionPhotoOpen;
    @SerializedName("paotui_menu_test")
    public Map<String, String> isUseMenuPage;
    @SerializedName("recognition_address_gif_native")
    public Map<String, String> recognitionGif;
    @SerializedName("searchaddresspage_addressorder")
    public Map<String, String> searchAddress;
    @SerializedName("strengthen_buy_entrance")
    public Map<String, String> strengthenBuyEntrance;
}
