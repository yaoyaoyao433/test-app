package com.sankuai.waimai.store.drug.consultation;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.util.PoiListIconAnim;
import com.sankuai.waimai.store.platform.domain.core.im.DrugImEntranceEntity;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Activity b;
    public String c;
    public String d;
    public String e;
    public com.sankuai.waimai.store.im.entrance.drug.a f;
    public PoiListIconAnim g;
    boolean h;
    public boolean i;
    public View j;
    public DrugImEntranceEntity k;
    public RecyclerView.k l;

    public a(@NonNull Activity activity, String str, String str2, String str3) {
        Object[] objArr = {activity, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d49ee1a29759a0d14ddb1d575875657b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d49ee1a29759a0d14ddb1d575875657b");
            return;
        }
        this.c = "";
        this.d = "";
        this.h = true;
        this.i = false;
        this.l = new RecyclerView.k() { // from class: com.sankuai.waimai.store.drug.consultation.a.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c48d961872b32b7b930705f3dcc0c3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c48d961872b32b7b930705f3dcc0c3a");
                } else if (i == 0) {
                    a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "a56bc53da64c0b599def8213149608ea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "a56bc53da64c0b599def8213149608ea");
                    } else if (!aVar.h || aVar.g == null) {
                    } else {
                        aVar.h = false;
                        aVar.g.b();
                    }
                } else if (i == 1) {
                    a aVar2 = a.this;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "679ef66e0ede53f1322a02c4f7374915", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "679ef66e0ede53f1322a02c4f7374915");
                    } else if (aVar2.h || aVar2.g == null) {
                    } else {
                        aVar2.h = true;
                        aVar2.g.a();
                    }
                }
            }
        };
        this.b = activity;
        this.e = str;
        if (str2 != null) {
            this.c = str2;
        }
        this.d = str3;
    }
}
