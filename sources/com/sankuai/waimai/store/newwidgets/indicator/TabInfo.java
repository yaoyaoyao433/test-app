package com.sankuai.waimai.store.newwidgets.indicator;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.TabItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class TabInfo {
    public static ChangeQuickRedirect a;
    public int A;
    public int B;
    public int C;
    public transient boolean D;
    public Fragment b;
    public int c;
    public String d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public String i;
    public String j;
    public String k;
    public boolean l;
    public String m;
    public int n;
    public boolean o;
    public String p;
    public int q;
    public boolean r;
    public boolean s;
    public String t;
    public String u;
    public int v;
    public int w;
    public int x;
    public int y;
    public String z;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface PoiTabAnimState {
    }

    public TabInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55e3b965a7e6ccb56a1e6f5bce2834ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55e3b965a7e6ccb56a1e6f5bce2834ae");
            return;
        }
        this.b = null;
        this.e = -999;
        this.h = 0;
        this.A = R.drawable.wm_sc_poi_normal;
        this.B = R.drawable.wm_sc_new_poi_normal;
        this.C = R.drawable.wm_sc_poi_selected;
        this.D = false;
    }

    public final void a(@NonNull TabItem tabItem) {
        Object[] objArr = {tabItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d8fa719559f117a7a6cacc9dc928013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d8fa719559f117a7a6cacc9dc928013");
            return;
        }
        this.i = tabItem.tabSelectedIcon;
        this.j = tabItem.tabDefaultIcon;
        this.c = tabItem.tabType;
        this.d = tabItem.tabName;
        this.k = tabItem.cartonFileUrl;
    }
}
