package com.meituan.android.legwork.bean.monitor;

import android.support.annotation.Keep;
import com.meituan.android.legwork.bean.TopBarBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ClientConfigBean implements Serializable {
    public static final int FEEDBACK_PAGE_USE_MRN = 1;
    public static final int SEARCH_ADDRESS_INFO_IS_DEGRADE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public BusinessConfig businessConfig;
    public int cancelFeeRefreshInterval;
    public int feedbackUseMRN;
    public Map<String, FuncConfigBean> funcConfigResult;
    public int homeRefreshInterval;
    public int isAddressInfoDegrade;
    public int pollingInterval;
    public int processingOrderRefreshInterval;
    public Map<String, String> testIdMapping;
    public ABTestParams testIdParams;
    public List<TopBarBean> topBar;

    public boolean isFeedbackPageUseMRN() {
        return this.feedbackUseMRN == 1;
    }

    public boolean isAddressInfoDegrade() {
        return this.isAddressInfoDegrade == 1;
    }
}
