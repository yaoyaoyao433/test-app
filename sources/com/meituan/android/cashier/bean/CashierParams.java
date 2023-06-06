package com.meituan.android.cashier.bean;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.cashier.common.CashierTypeConstant;
import com.meituan.android.cashier.common.ProductTypeConstant;
import com.meituan.android.cashier.common.d;
import com.meituan.android.cashier.common.o;
import com.meituan.android.cashier.common.q;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CashierParams implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8376376276414697199L;
    private String businessInputCashierType;
    private String callbackUrl;
    private CashierRouterInfo cashierRouterInfo;
    private String cif;
    private String extraData;
    private String extraStatics;
    private String lastResumedFeature;
    @MTPaySuppressFBWarnings({"SE_BAD_FIELD"})
    private o mCashierRouterInfoParse;
    private String mDowngradeInfo;
    private String mProductType;
    private String mWebCashierUrl;
    private String merchantNo;
    private String payToken;
    private String tradeNo;
    private Uri uri;

    public void setProductType(@ProductTypeConstant.ProductType String str) {
        this.mProductType = str;
    }

    public String getProductType() {
        return this.mProductType;
    }

    public Uri getUri() {
        return this.uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public String getBusinessInputCashierType() {
        return this.businessInputCashierType;
    }

    public void setBusinessInputCashierType(String str) {
        this.businessInputCashierType = str;
    }

    public String getCif() {
        return this.cif;
    }

    public void setCif(String str) {
        this.cif = str;
    }

    public String getTradeNo() {
        return this.tradeNo;
    }

    public void setTradeNo(String str) {
        this.tradeNo = str;
    }

    public String getPayToken() {
        return this.payToken;
    }

    public void setPayToken(String str) {
        this.payToken = str;
    }

    public String getExtraData() {
        return this.extraData;
    }

    public void setExtraData(String str) {
        this.extraData = str;
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public void setCallbackUrl(String str) {
        this.callbackUrl = str;
    }

    public String getExtraStatics() {
        return this.extraStatics;
    }

    public void setExtraStatics(String str) {
        this.extraStatics = str;
    }

    public CashierRouterInfo getCashierRouterInfo() {
        return this.cashierRouterInfo;
    }

    public void setCashierRouterInfo(CashierRouterInfo cashierRouterInfo) {
        this.cashierRouterInfo = cashierRouterInfo;
    }

    public String getDowngradeInfo() {
        return this.mDowngradeInfo;
    }

    public void setDowngradeInfo(String str) {
        this.mDowngradeInfo = str;
    }

    public String getMerchantNo() {
        return this.merchantNo;
    }

    public void setMerchantNo(String str) {
        this.merchantNo = str;
    }

    public String getWebCashierUrl() {
        return this.mWebCashierUrl;
    }

    public void setWebCashierUrl(String str) {
        this.mWebCashierUrl = str;
    }

    public String getLastResumedFeature() {
        return this.lastResumedFeature;
    }

    public void setLastResumedFeature(String str) {
        this.lastResumedFeature = str;
    }

    public Map<String, List<CashierScopeBean>> getPreDispatcherArrange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a994265b57f07a594547167ae75222d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a994265b57f07a594547167ae75222d");
        }
        if (this.mCashierRouterInfoParse == null) {
            this.mCashierRouterInfoParse = new o(this.cashierRouterInfo);
        } else {
            this.mCashierRouterInfoParse.b = this.cashierRouterInfo;
        }
        return this.mCashierRouterInfoParse.a();
    }

    public String getPreDispatcherMerchantNo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af1edfceb9112587ed8dab30b5f11cc1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af1edfceb9112587ed8dab30b5f11cc1");
        }
        if (this.mCashierRouterInfoParse == null) {
            this.mCashierRouterInfoParse = new o(this.cashierRouterInfo);
        } else {
            this.mCashierRouterInfoParse.b = this.cashierRouterInfo;
        }
        o oVar = this.mCashierRouterInfoParse;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = o.a;
        if (PatchProxy.isSupport(objArr2, oVar, changeQuickRedirect3, false, "45bdb835766d939dc31b906b22365c8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, oVar, changeQuickRedirect3, false, "45bdb835766d939dc31b906b22365c8b");
        }
        Object a = oVar.a("merchantNo");
        return a != null ? a.toString() : "";
    }

    public Map<String, List<CashierScopeBean>> getFinalCashierArrange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "089d4cd71f0663c84a8e5604609a7ca2", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "089d4cd71f0663c84a8e5604609a7ca2") : d.a(this);
    }

    public CashierScopeBean getCashierScope(@CashierTypeConstant.CashierType String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70fc4ad89c1d3395a5606b3287aa466e", RobustBitConfig.DEFAULT_VALUE)) {
            return (CashierScopeBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70fc4ad89c1d3395a5606b3287aa466e");
        }
        List<CashierScopeBean> a = d.a(this, this.mProductType);
        if (i.a((Collection) a)) {
            q.a("cashier_route_getCashierScope_is_empty", (Map<String, Object>) null, (List<Float>) null, str2);
            return CashierScopeBean.getDefault(str);
        }
        for (CashierScopeBean cashierScopeBean : a) {
            if (TextUtils.equals(cashierScopeBean.getDestCashier(), str)) {
                return cashierScopeBean;
            }
        }
        q.a("cashier_route_getCashierScope_is_empty", (Map<String, Object>) null, (List<Float>) null, str2);
        return CashierScopeBean.getDefault(str);
    }

    public String getPreDispatcherCashierConfig(@CashierTypeConstant.CashierType String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7021df42a49453b162e6bafbf658023", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7021df42a49453b162e6bafbf658023");
        }
        if (this.mCashierRouterInfoParse == null) {
            this.mCashierRouterInfoParse = new o(this.cashierRouterInfo);
        } else {
            this.mCashierRouterInfoParse.b = this.cashierRouterInfo;
        }
        o oVar = this.mCashierRouterInfoParse;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect3 = o.a;
        if (PatchProxy.isSupport(objArr2, oVar, changeQuickRedirect3, false, "13b45428a20b888e15a3847944d8aed0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, oVar, changeQuickRedirect3, false, "13b45428a20b888e15a3847944d8aed0");
        }
        Object a = oVar.a(str);
        if (a != null) {
            return a.toString();
        }
        return null;
    }

    public HashMap<String, String> getExtendTransmissionParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb788d0868b88bf0b511059672677746", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb788d0868b88bf0b511059672677746");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(getCif()) && !TextUtils.equals(StringUtil.NULL, getCif().toLowerCase())) {
            hashMap.put("cif", getCif());
        }
        return hashMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final CashierParams mCashierParams;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a04af6eb7490874d502f578582c9bcd9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a04af6eb7490874d502f578582c9bcd9");
            } else {
                this.mCashierParams = new CashierParams();
            }
        }

        public Builder uri(Uri uri) {
            Object[] objArr = {uri};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12ccd325089762c13f4759563f1627d6", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12ccd325089762c13f4759563f1627d6");
            }
            this.mCashierParams.setUri(uri);
            return this;
        }

        public Builder businessInputCashierType(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b09bfcb9cdf53258bb9362573043251c", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b09bfcb9cdf53258bb9362573043251c");
            }
            this.mCashierParams.setBusinessInputCashierType(str);
            return this;
        }

        public Builder tradeNo(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d7c2f282364ff041058d689967436f8", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d7c2f282364ff041058d689967436f8");
            }
            this.mCashierParams.setTradeNo(str);
            return this;
        }

        public Builder cif(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ebcc683d8f9ca36639a5a5d80ffb98e", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ebcc683d8f9ca36639a5a5d80ffb98e");
            }
            this.mCashierParams.setCif(str);
            return this;
        }

        public Builder payToken(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e184956722ec2682c2c9d5f85a31d37e", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e184956722ec2682c2c9d5f85a31d37e");
            }
            this.mCashierParams.setPayToken(str);
            return this;
        }

        public Builder extraData(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "054f7862ed957a06a8a7680c046c33f3", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "054f7862ed957a06a8a7680c046c33f3");
            }
            this.mCashierParams.setExtraData(str);
            return this;
        }

        public Builder extraStatics(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3b17250ece4465b281f5a8a0bfca6c4", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3b17250ece4465b281f5a8a0bfca6c4");
            }
            this.mCashierParams.setExtraStatics(str);
            return this;
        }

        public Builder callbackUrl(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f67f2891e8f86e95fa62fb23bcfbbaa", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f67f2891e8f86e95fa62fb23bcfbbaa");
            }
            this.mCashierParams.setCallbackUrl(str);
            return this;
        }

        public Builder merchantNo(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca4b509ce809593bc15d06b37b3b3279", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca4b509ce809593bc15d06b37b3b3279");
            }
            this.mCashierParams.setMerchantNo(str);
            return this;
        }

        public Builder lastResumedFeature(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c3c8b41d2b379f5f6db6383316978d9", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c3c8b41d2b379f5f6db6383316978d9");
            }
            this.mCashierParams.setLastResumedFeature(str);
            return this;
        }

        public Builder cashierRouterInfo(CashierRouterInfo cashierRouterInfo) {
            Object[] objArr = {cashierRouterInfo};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f242781db5e2c6e32fb05d78e2be043", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f242781db5e2c6e32fb05d78e2be043");
            }
            this.mCashierParams.setCashierRouterInfo(cashierRouterInfo);
            return this;
        }

        public CashierParams build() {
            return this.mCashierParams;
        }
    }
}
