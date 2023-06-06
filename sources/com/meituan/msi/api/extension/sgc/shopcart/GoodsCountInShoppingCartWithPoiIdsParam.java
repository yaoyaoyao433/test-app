package com.meituan.msi.api.extension.sgc.shopcart;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class GoodsCountInShoppingCartWithPoiIdsParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(required = true)
    public List<String> poiIds;
}
