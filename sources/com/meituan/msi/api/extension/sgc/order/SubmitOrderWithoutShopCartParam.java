package com.meituan.msi.api.extension.sgc.order;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class SubmitOrderWithoutShopCartParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(required = true)
    public String cid;
    @MsiParamChecker(required = true)
    public Object extra;
    @MsiParamChecker(required = true)
    public List<Object> goodsList;
    @MsiParamChecker(required = true)
    public int pageSource;
    @MsiParamChecker(required = true)
    public Object poiInfo;
}
