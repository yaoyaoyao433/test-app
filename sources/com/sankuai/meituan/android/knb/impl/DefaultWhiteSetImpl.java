package com.sankuai.meituan.android.knb.impl;

import android.support.annotation.NonNull;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class DefaultWhiteSetImpl implements KNBWebManager.IWhiteSet {
    private static final List<String> URL_SCHEMA = Arrays.asList("http", "https");
    public static ChangeQuickRedirect changeQuickRedirect;
    private final List<String> URI_PREFIX;

    public DefaultWhiteSetImpl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9960d6b0337596b85cb5401164380338", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9960d6b0337596b85cb5401164380338");
        } else {
            this.URI_PREFIX = Arrays.asList("tel", "geo", "mailto", "imeituan", "meituanpayment", UserCenter.OAUTH_TYPE_WEIXIN, "mqqapi", "alipay", "alipays", "mttower", "wtloginmqq", "qqmap", "bizmeituan", "baidumap", "iosamap", "comgooglemaps", "paesuperbank", "meituanwaimai", "market", "dianping", "mobike", "yoda");
        }
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IWhiteSet
    @NonNull
    public final Set<String> getSchemeWhiteSet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f87b42a9ff83adae9fd2763b28ec276b", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f87b42a9ff83adae9fd2763b28ec276b") : new HashSet(URL_SCHEMA);
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IWhiteSet
    @NonNull
    @Deprecated
    public final Set<String> getHostWhiteSet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69060806d7b57c28da8053fcaf5b78fd", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69060806d7b57c28da8053fcaf5b78fd") : new HashSet();
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IWhiteSet
    @NonNull
    public final Set<String> getPrefixWhiteSet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f299cb4d8f772d85508193373d355148", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f299cb4d8f772d85508193373d355148") : new HashSet(this.URI_PREFIX);
    }
}
