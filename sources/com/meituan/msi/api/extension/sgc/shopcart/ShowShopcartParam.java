package com.meituan.msi.api.extension.sgc.shopcart;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class ShowShopcartParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String cid;
    @MsiParamChecker(required = true)
    public Object data;
    @MsiParamChecker(required = true)
    public String poiID;
    public String poi_id_str;
    public String spuID;
}
