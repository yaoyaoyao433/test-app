package com.sankuai.xm.monitor.report.db;

import android.content.ContentValues;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.db.BaseDBProxy;
import com.sankuai.xm.base.db.c;
import com.sankuai.xm.base.db.g;
import com.sankuai.xm.base.db.i;
import com.sankuai.xm.base.db.l;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.service.m;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ReportDB extends BaseDBProxy {
    public static ChangeQuickRedirect j;
    private Context k;

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void b() {
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final String c() {
        return "dx_sdk_statistics_report.db";
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final String d() {
        return "dx_sdk_statistics_report.db";
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void d(c cVar) {
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void e(c cVar) {
    }

    public static ReportDB l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96ce01f98a36dcb05e8845544ca63561", 6917529027641081856L) ? (ReportDB) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96ce01f98a36dcb05e8845544ca63561") : (ReportDB) m.a(ReportDB.class);
    }

    @Override // com.sankuai.xm.base.service.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "644c2b66d823bdaa6d09fe6a5c1221c3", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "644c2b66d823bdaa6d09fe6a5c1221c3")).intValue();
        }
        a(f.m().g());
        return super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e98178de3c847b2e54a2b991d8d6ef7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e98178de3c847b2e54a2b991d8d6ef7");
            return;
        }
        this.k = context.getApplicationContext();
        com.sankuai.xm.base.db.a aVar = new com.sankuai.xm.base.db.a(6, new a());
        aVar.d = 22;
        a(context, aVar, "dx_sdk_statistics_report.db", true);
    }

    public final void a(final List<ReportBean> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c3a6d648869cb1dcff6d3ee97039922", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c3a6d648869cb1dcff6d3ee97039922");
        } else {
            a(new Runnable() { // from class: com.sankuai.xm.monitor.report.db.ReportDB.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    c bR_;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "312564a35df4df27a5ff7ebde2c7f979", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "312564a35df4df27a5ff7ebde2c7f979");
                    } else if (list != null && !list.isEmpty() && (bR_ = ReportDB.this.bR_()) != null) {
                        try {
                            try {
                                bR_.b();
                                for (int i = 0; i < list.size(); i++) {
                                    ReportBean reportBean = (ReportBean) list.get(i);
                                    if (reportBean != null) {
                                        final ReportDB reportDB = ReportDB.this;
                                        final int i2 = reportBean.id;
                                        Object[] objArr3 = {Integer.valueOf(i2)};
                                        ChangeQuickRedirect changeQuickRedirect3 = ReportDB.j;
                                        if (PatchProxy.isSupport(objArr3, reportDB, changeQuickRedirect3, false, "b0e1fb8f681abaffdede28e7f55cabcf", 6917529027641081856L)) {
                                            PatchProxy.accessDispatch(objArr3, reportDB, changeQuickRedirect3, false, "b0e1fb8f681abaffdede28e7f55cabcf");
                                        } else {
                                            reportDB.a(new Runnable() { // from class: com.sankuai.xm.monitor.report.db.ReportDB.4
                                                public static ChangeQuickRedirect a;

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    Object[] objArr4 = new Object[0];
                                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3cb119c76de1194fce5b4012c6298ba5", 6917529027641081856L)) {
                                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3cb119c76de1194fce5b4012c6298ba5");
                                                        return;
                                                    }
                                                    c bR_2 = ReportDB.this.bR_();
                                                    if (bR_2 == null) {
                                                        return;
                                                    }
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(i2);
                                                    bR_2.a(ReportBean.TABLE_NAME, "id=?", new String[]{sb.toString()});
                                                }
                                            }, (Callback) null);
                                        }
                                    }
                                }
                                bR_.d();
                                if (bR_ != null) {
                                    bR_.c();
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                if (bR_ != null) {
                                    bR_.c();
                                }
                            }
                        } catch (Throwable th) {
                            if (bR_ != null) {
                                bR_.c();
                            }
                            throw th;
                        }
                    }
                }
            }, (Callback) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.sankuai.xm.monitor.report.db.ReportBean> a(java.lang.String r27, java.lang.String r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.monitor.report.db.ReportDB.a(java.lang.String, java.lang.String, int, int):java.util.List");
    }

    public final void a(final List<ReportBean> list, final int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c986871a4118c7a199e2e6a84df0313a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c986871a4118c7a199e2e6a84df0313a");
        } else {
            a(new Runnable() { // from class: com.sankuai.xm.monitor.report.db.ReportDB.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "228bc7f86c4b1b02a27cbb6c3dc159df", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "228bc7f86c4b1b02a27cbb6c3dc159df");
                        return;
                    }
                    c bR_ = ReportDB.this.bR_();
                    if (bR_ == null) {
                        return;
                    }
                    int size = list.size();
                    try {
                        bR_.b();
                        for (int i2 = 0; i2 < size; i2++) {
                            int i3 = ((ReportBean) list.get(i2)).id;
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("status", Integer.valueOf(i));
                            StringBuilder sb = new StringBuilder();
                            sb.append(i3);
                            bR_.a(ReportBean.TABLE_NAME, contentValues, "id= ? ", new String[]{sb.toString()});
                        }
                        bR_.d();
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        bR_.c();
                    }
                }
            }, (Callback) null);
        }
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b9976d6323df2edc39a12e63f4bd21b", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b9976d6323df2edc39a12e63f4bd21b")).intValue() : (str == null || !str.contains("dx_sdk_statistics_report.db")) ? -1 : 6;
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final i i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27c525e53e1ca1ef48f308e9ce96518", 6917529027641081856L) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27c525e53e1ca1ef48f308e9ce96518") : new a();
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1cf1a88149c9f6323ddff9ef30c83ba", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1cf1a88149c9f6323ddff9ef30c83ba") : !g.a().f() ? "" : l.b(this.k, "dx_sdk_statistics_report.db");
    }
}
