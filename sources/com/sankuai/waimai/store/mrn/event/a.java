package com.sankuai.waimai.store.mrn.event;

import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public RestMenuResponse.NavigateItem a;
    public String b;
    public String c;

    public a(RestMenuResponse.NavigateItem navigateItem, String str) {
        this.a = navigateItem;
        this.b = str;
    }

    public a(RestMenuResponse.NavigateItem navigateItem, String str, String str2) {
        this.a = navigateItem;
        this.b = str;
        this.c = str2;
    }
}
