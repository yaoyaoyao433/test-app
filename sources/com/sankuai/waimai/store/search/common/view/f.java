package com.sankuai.waimai.store.search.common.view;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.search.model.GlobalPageResponse;
import com.sankuai.waimai.store.search.model.GlobalSearchExtraInfo;
import com.sankuai.waimai.store.search.statistics.g;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.view.FloatCardOutInAnimation;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public Activity b;
    SearchShareData c;
    public ImageView d;
    Map<String, Object> e;
    public FloatCardOutInAnimation f;
    public boolean g;
    private b h;

    public f(@NonNull Activity activity, @NonNull SearchShareData searchShareData, b bVar) {
        Object[] objArr = {activity, searchShareData, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9c98c7f8690d058ad5c9df1b90a758f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9c98c7f8690d058ad5c9df1b90a758f");
            return;
        }
        this.e = new HashMap();
        this.g = false;
        this.b = activity;
        this.c = searchShareData;
        this.h = bVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9931c4be957e0f0c5afd3bb2d25b390", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9931c4be957e0f0c5afd3bb2d25b390");
        } else if (this.g || this.f == null) {
        } else {
            this.g = true;
            FloatCardOutInAnimation floatCardOutInAnimation = this.f;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = FloatCardOutInAnimation.a;
            if (PatchProxy.isSupport(objArr2, floatCardOutInAnimation, changeQuickRedirect2, false, "755fe7f96edca12cbcee94518fa3e3c9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, floatCardOutInAnimation, changeQuickRedirect2, false, "755fe7f96edca12cbcee94518fa3e3c9");
            } else if (floatCardOutInAnimation.b == null || floatCardOutInAnimation.b.isFinishing()) {
            } else {
                if (floatCardOutInAnimation.i != null) {
                    floatCardOutInAnimation.i.removeCallbacks(floatCardOutInAnimation.j);
                }
                if (floatCardOutInAnimation.h != null && floatCardOutInAnimation.h.isRunning()) {
                    floatCardOutInAnimation.h.cancel();
                    floatCardOutInAnimation.d.setAlpha(0.5f);
                    if (floatCardOutInAnimation.c == 1) {
                        floatCardOutInAnimation.d.setTranslationX(floatCardOutInAnimation.e);
                    } else {
                        floatCardOutInAnimation.d.setTranslationX(-floatCardOutInAnimation.e);
                    }
                } else if (floatCardOutInAnimation.g == null || !floatCardOutInAnimation.g.isRunning()) {
                    floatCardOutInAnimation.f = (int) Math.abs(floatCardOutInAnimation.d.getTranslationX());
                    if (floatCardOutInAnimation.f != floatCardOutInAnimation.e) {
                        if (floatCardOutInAnimation.g == null) {
                            floatCardOutInAnimation.g = floatCardOutInAnimation.a(floatCardOutInAnimation.d, 0, floatCardOutInAnimation.e, 1.0f, 0.5f);
                        }
                        floatCardOutInAnimation.g.start();
                    }
                }
            }
        }
    }

    public final void a(GlobalPageResponse globalPageResponse) {
        Object[] objArr = {globalPageResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ffad9bbb504ea501d9351f892a001cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ffad9bbb504ea501d9351f892a001cb");
        } else if (globalPageResponse == null || globalPageResponse.globalSearchExtraInfo == null) {
        } else {
            GlobalSearchExtraInfo globalSearchExtraInfo = globalPageResponse.globalSearchExtraInfo;
            if (globalSearchExtraInfo.mSearchSidebarDrugIm == null || TextUtils.isEmpty(globalSearchExtraInfo.mSearchSidebarDrugIm.icon)) {
                if (this.c.au != null) {
                    c();
                    return;
                }
                return;
            }
            c();
            if (this.c.au == null) {
                this.c.au = globalPageResponse.globalSearchExtraInfo.mSearchSidebarDrugIm;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8769a1e7d94d2805df7a16b6c5bf3d2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8769a1e7d94d2805df7a16b6c5bf3d2");
                return;
            }
            this.e.put("search_log_id", this.c.q);
            this.e.put("search_global_id", this.c.r);
            this.e.put("keyword", this.c.h);
            this.e.put("template_type", Integer.valueOf(this.c.D));
            this.e.put("stid", g.f(this.c));
            this.e.put("tab_code", this.c.al);
            this.e.put("cat_id", Integer.valueOf(this.c.z));
            this.e.put("new_message_badge", 0);
            this.e.put("status", "-999");
            this.e.put("source_type", 24);
            if (this.c.bg) {
                this.e.put("if_med_poi", 0);
                this.e.put("sec_cat_id", Integer.valueOf(this.c.C > 0 ? this.c.C : this.c.B));
            }
        }
    }

    public final void a(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17fcc171b25353a9b0da94415c9e611f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17fcc171b25353a9b0da94415c9e611f");
        } else if (this.c.au == null) {
            u.c(this.d);
        } else if (this.d.getVisibility() == 0) {
        } else {
            if (z) {
                if (i + 1 == this.c.au.index) {
                    b();
                }
            } else if (i + 1 >= this.c.au.index) {
                b();
            }
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9c4f0f914c9ffe2d41835fd42521fee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9c4f0f914c9ffe2d41835fd42521fee");
            return;
        }
        m.a(this.c.au.icon, com.sankuai.waimai.platform.widget.tag.util.b.a(this.b, 85.0f), com.sankuai.waimai.platform.widget.tag.util.b.a(this.b, 59.0f), ImageQualityUtil.c()).a(this.d);
        u.a(this.d);
        com.sankuai.waimai.store.manager.judas.b.b("c_nfqbfvw", "b_waimai_1f89fno0_mv").b(this.e).a();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05626d6e1c59b62d6b6ce02c34f34ba5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05626d6e1c59b62d6b6ce02c34f34ba5");
        } else if (this.h == null) {
        } else {
            this.h.b();
        }
    }
}
