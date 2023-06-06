package com.sankuai.waimai.business.knb.webview;

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
public final class c implements KNBWebManager.IWhiteSet {
    public static ChangeQuickRedirect a;
    public static List<String> b;
    private static final List<String> d = Arrays.asList("tel", "geo", "mailto", "imeituan", "meituanpayment", UserCenter.OAUTH_TYPE_WEIXIN, "mqqapi", "alipay", "alipays", "mttower", "wtloginmqq", "qqmap", "bizmeituan", "baidumap", "iosamap", "comgooglemaps", "paesuperbank", "meituanwaimai", "itakeawaybiz", "meituanshangou", "yoda");
    private static final List<String> e = Arrays.asList("http", "https");
    public static boolean c = false;

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IWhiteSet
    @NonNull
    public final Set<String> getSchemeWhiteSet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3de295ad5a253e8e45296e9f68a2ba32", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3de295ad5a253e8e45296e9f68a2ba32") : new HashSet(e);
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IWhiteSet
    @NonNull
    @Deprecated
    public final Set<String> getHostWhiteSet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c7ede6759c4bcc66bcc1981b3aa4505", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c7ede6759c4bcc66bcc1981b3aa4505") : new HashSet();
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebManager.IWhiteSet
    @NonNull
    public final Set<String> getPrefixWhiteSet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9e950a49236575bf7f524ea6131714d", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9e950a49236575bf7f524ea6131714d") : new HashSet(d);
    }
}
