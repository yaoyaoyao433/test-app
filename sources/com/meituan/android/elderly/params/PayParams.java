package com.meituan.android.elderly.params;

import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.common.q;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Map;
/* compiled from: ProGuard */
@JsonBean
@MTPaySuppressFBWarnings({"UWF_UNWRITTEN_PUBLIC_OR_PROTECTED_FIELD"})
/* loaded from: classes2.dex */
public class PayParams implements Serializable, Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4739964884799841680L;
    public String campaignId;
    public String cashierType;
    public String couponCode;
    public int fromSelectBankCard;
    public int moneyChanged;
    public String openWithholdInfoBefore;
    public String payPassword;
    public String payToken;
    public String payType;
    public String smsCode;
    public String tokenId;
    public String tradeNo;
    public String uniqueId;
    public String upsepayType;
    public Map<String, String> walletPayParams;

    /* renamed from: clone */
    public PayParams m8clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f986b9d6c21886c7bfb704ffcc0b8e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f986b9d6c21886c7bfb704ffcc0b8e4");
        }
        try {
            return (PayParams) super.clone();
        } catch (CloneNotSupportedException e) {
            q.b("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "PayParams_clone").a("message", e.getMessage()).b, this.uniqueId);
            return null;
        }
    }
}
