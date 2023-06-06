package com.sankuai.waimai.store.poi.list.refactor.bean;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiRequestError {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isNetError;
    public boolean isPageLoad;
    public String msg;

    public PoiRequestError(String str, boolean z, boolean z2) {
        this.msg = str;
        this.isPageLoad = z;
        this.isNetError = z2;
    }
}
