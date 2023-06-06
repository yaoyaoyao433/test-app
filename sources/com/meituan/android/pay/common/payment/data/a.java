package com.meituan.android.pay.common.payment.data;

import com.meituan.android.pay.common.promotion.bean.CardInfo;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface a extends e, Serializable {
    String getBankType();

    String getBankTypeId();

    CardInfo getCardInfo();

    String getCardType();

    List<CombineLabel> getLabels();

    String getPayTypeId();

    String getPayTypeUniqueKey();

    String getSubmitUrl();

    String getTransparentAttributes();
}
