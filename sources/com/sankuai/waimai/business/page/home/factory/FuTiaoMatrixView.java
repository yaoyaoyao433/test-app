package com.sankuai.waimai.business.page.home.factory;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import com.dianping.networklog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.bubble.g;
import com.sankuai.waimai.mach.container.e;
import com.sankuai.waimai.touchmatrix.data.AlertInfo;
import com.sankuai.waimai.touchmatrix.monitor.j;
import com.sankuai.waimai.touchmatrix.show.b;
import com.sankuai.waimai.touchmatrix.utils.f;
import com.sankuai.waimai.touchmatrix.views.ITMatrixView;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FuTiaoMatrixView extends FrameLayout implements ITMatrixView {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.touchmatrix.show.a b;
    String c;
    String d;
    com.sankuai.waimai.touchmatrix.data.a e;
    AlertInfo.Module f;
    b g;
    final e h;
    private boolean i;
    private int j;
    private boolean k;

    @Override // com.sankuai.waimai.touchmatrix.views.ITMatrixView
    public Dialog getDialog() {
        return null;
    }

    public static /* synthetic */ void a(FuTiaoMatrixView fuTiaoMatrixView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fuTiaoMatrixView, changeQuickRedirect, false, "7970ff939df1bc6755531183df547889", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fuTiaoMatrixView, changeQuickRedirect, false, "7970ff939df1bc6755531183df547889");
        } else {
            fuTiaoMatrixView.a("模板加载失败");
        }
    }

    public FuTiaoMatrixView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47013793dae32127b64e974042e9a112", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47013793dae32127b64e974042e9a112");
        }
    }

    public FuTiaoMatrixView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ef0b62ab47dcdeed2211b6cf064b679", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ef0b62ab47dcdeed2211b6cf064b679");
        }
    }

    public FuTiaoMatrixView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38532fdf6642cb8d33f5faed5fa00426", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38532fdf6642cb8d33f5faed5fa00426");
            return;
        }
        this.j = 0;
        this.h = new e() { // from class: com.sankuai.waimai.business.page.home.factory.FuTiaoMatrixView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83724d2dc1f7632ee980465bc2a6250d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83724d2dc1f7632ee980465bc2a6250d");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("FuTiaoMatrixView", "Mach onMachRenderFailure() ", new Object[0]);
                FuTiaoMatrixView.a(FuTiaoMatrixView.this);
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c711b1eb1b9568c677de3ebf310b7adf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c711b1eb1b9568c677de3ebf310b7adf");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("FuTiaoMatrixView", "Mach onMachBundleLoadFailure() ", new Object[0]);
                FuTiaoMatrixView.a(FuTiaoMatrixView.this);
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1636d1b204fea395957cf950d13704f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1636d1b204fea395957cf950d13704f");
                    return;
                }
                FuTiaoMatrixView.a(FuTiaoMatrixView.this);
                com.sankuai.waimai.foundation.utils.log.a.b("FuTiaoMatrixView", "Mach onInputParamsError() ", new Object[0]);
            }
        };
    }

    @Override // com.sankuai.waimai.touchmatrix.views.ITMatrixView
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "520bd73d5595e5db812ba6e5c654af9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "520bd73d5595e5db812ba6e5c654af9c");
        } else if (this.k && (this.j != 0 || g.a().e())) {
            com.sankuai.waimai.touchmatrix.rebuild.message.b.a().b();
            a("内容冲突");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5c818dbb711a1f1b04e45979d234d95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5c818dbb711a1f1b04e45979d234d95");
            return;
        }
        setVisibility(0);
        this.b.a(this.f.templateId, this.f.defaultTemplateId, a(this.f), 0, 0);
        this.i = true;
    }

    @Override // com.sankuai.waimai.touchmatrix.views.ITMatrixView
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e4454bd5cdc1fb4016e861d886c1bb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e4454bd5cdc1fb4016e861d886c1bb5");
            return;
        }
        setVisibility(8);
        Log.e("futiaoflags", "dimiss");
        c.a("FuTiaoMatrixView,showFlag = " + this.j + " dimiss", 3);
        if (this.i) {
            this.i = false;
            com.sankuai.waimai.touchmatrix.rebuild.message.b.a().b();
        }
    }

    @Override // com.sankuai.waimai.touchmatrix.views.ITMatrixView
    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b6b214c9e79fe0ffc0197ff58caf331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b6b214c9e79fe0ffc0197ff58caf331");
            return;
        }
        c.a("FuTiaoMatrixView,showFlag = " + this.j + " cancel", 3);
        Log.e("futiaoflags", "cancel");
        setVisibility(8);
        if (this.i) {
            this.i = false;
            com.sankuai.waimai.touchmatrix.rebuild.message.b.a().b();
        }
    }

    @Override // com.sankuai.waimai.touchmatrix.views.ITMatrixView
    public boolean isShowing() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.Object> a(@android.support.annotation.NonNull com.sankuai.waimai.touchmatrix.data.AlertInfo.Module r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.page.home.factory.FuTiaoMatrixView.a
            java.lang.String r11 = "c4ce5cce492b09a2330956d3c334a7c5"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.util.Map r13 = (java.util.Map) r13
            return r13
        L1e:
            r1 = 0
            int r2 = r13.dataType
            if (r2 != 0) goto L32
            com.google.gson.JsonObject r0 = r13.jsonData
            if (r0 != 0) goto L2b
            java.lang.String r13 = ""
        L29:
            r1 = r13
            goto L55
        L2b:
            com.google.gson.JsonObject r13 = r13.jsonData
            java.lang.String r13 = r13.toString()
            goto L29
        L32:
            int r2 = r13.dataType
            if (r2 != r0) goto L55
            java.lang.String r13 = r13.stringData
            org.json.JSONTokener r0 = new org.json.JSONTokener     // Catch: java.lang.Exception -> L55
            r0.<init>(r13)     // Catch: java.lang.Exception -> L55
            java.lang.Object r0 = r0.nextValue()     // Catch: java.lang.Exception -> L55
            boolean r2 = r0 instanceof org.json.JSONArray     // Catch: java.lang.Exception -> L55
            if (r2 == 0) goto L56
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Exception -> L55
            r13.<init>()     // Catch: java.lang.Exception -> L55
            java.lang.String r2 = "list"
            r13.put(r2, r0)     // Catch: java.lang.Exception -> L55
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> L55
            goto L56
        L55:
            r13 = r1
        L56:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L61
            java.util.Map r13 = java.util.Collections.emptyMap()
            return r13
        L61:
            java.util.Map r13 = com.sankuai.waimai.mach.utils.b.a(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.factory.FuTiaoMatrixView.a(com.sankuai.waimai.touchmatrix.data.AlertInfo$Module):java.util.Map");
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff2e09ed5d42dd1ce4d04a1b7de36ad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff2e09ed5d42dd1ce4d04a1b7de36ad9");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("message_id", this.e.c);
        hashMap.put("failure_status", str);
        hashMap.put("page_cid", f.b());
        hashMap.putAll(this.e.e());
        j.a().a(hashMap);
        com.sankuai.waimai.touchmatrix.rebuild.message.b.a().b();
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57f9fba7fe038123e25a10c6fd67bcc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57f9fba7fe038123e25a10c6fd67bcc8");
        } else {
            this.j = i | this.j;
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f531df2f46eb0a9cae591847fa7964b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f531df2f46eb0a9cae591847fa7964b");
        } else {
            this.j = (~i) & this.j;
        }
    }

    public void setIsHomePage(boolean z) {
        this.k = z;
    }
}
