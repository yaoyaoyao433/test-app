package com.sankuai.waimai.ad.view.mach.tierslide;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.CardLayoutManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public int b;
    public boolean c;
    public boolean d;
    public float e;
    CardLayoutManager.a f;
    public long g;
    public long h;
    long i;
    public com.sankuai.waimai.mach.parser.d j;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6b2fbbecb3a55d6aa6a0a5f4358ab20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6b2fbbecb3a55d6aa6a0a5f4358ab20");
            return;
        }
        this.b = 0;
        this.c = true;
        this.d = true;
        this.e = 0.9f;
        this.f = CardLayoutManager.a.SINGLE_LEFT;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2281b0a04497b45f03f4dfabac56e1d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2281b0a04497b45f03f4dfabac56e1d9");
            return;
        }
        this.d = true;
        this.c = true;
        this.e = 0.9f;
        this.b = 0;
    }

    public final float b() {
        if (this.e <= 0.0f || this.e > 1.0f) {
            return 0.9f;
        }
        return this.e;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b200a44a15825525c732cc7c61a51ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b200a44a15825525c732cc7c61a51ec");
        } else {
            this.g = j;
        }
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46dbbb20f58fa1938d97cda0a89029ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46dbbb20f58fa1938d97cda0a89029ed");
        } else {
            this.h = j;
        }
    }

    public final void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d503d531345c23f0159e2dfa4876f80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d503d531345c23f0159e2dfa4876f80");
        } else {
            this.i = j;
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "146a7846962c4700111ca095338b35d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "146a7846962c4700111ca095338b35d7");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (str.equals(CardLayoutManager.a.HORIZONTAL.d)) {
                this.f = CardLayoutManager.a.HORIZONTAL;
            } else if (str.equals(CardLayoutManager.a.SINGLE_LEFT.d)) {
                this.f = CardLayoutManager.a.SINGLE_LEFT;
            }
        }
    }
}
