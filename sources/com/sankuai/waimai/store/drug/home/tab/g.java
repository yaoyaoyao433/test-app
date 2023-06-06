package com.sankuai.waimai.store.drug.home.tab;

import android.support.annotation.NonNull;
import com.sankuai.waimai.store.repository.model.DrugTabItem;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public boolean h;

    public g(@NonNull DrugTabItem drugTabItem) {
        this.a = drugTabItem.tabId;
        this.b = drugTabItem.tabName;
        this.c = drugTabItem.tabSelectedIcon;
        this.d = drugTabItem.tabDefaultIcon;
        this.e = drugTabItem.tabCartonFileUrl;
        this.f = drugTabItem.scheme;
        this.g = drugTabItem.containerType;
    }
}
