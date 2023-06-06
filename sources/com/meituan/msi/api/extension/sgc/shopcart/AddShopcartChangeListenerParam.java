package com.meituan.msi.api.extension.sgc.shopcart;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class AddShopcartChangeListenerParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String cartType;
    @MsiParamChecker(required = true)
    public String poi_id;
    public String poi_id_str;
}
