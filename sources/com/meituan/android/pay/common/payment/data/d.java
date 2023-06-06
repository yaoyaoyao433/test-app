package com.meituan.android.pay.common.payment.data;

import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface d extends e {
    String getAttachIcon();

    List<CombineLabel> getBottomLabels();

    String getNameSuffix();

    List<CombineLabel> getRightLabels();

    boolean isShowIcon();
}
