package com.sankuai.meituan.kernel.net.report;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.base.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.dianping.monitor.impl.a {
    public static ChangeQuickRedirect a;
    private String b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.kernel.net.report.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0592a {
        public static ChangeQuickRedirect a;
        private static a b;

        static {
            a aVar;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c8527d937a535236fbbaf47922ea367", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c8527d937a535236fbbaf47922ea367");
            } else {
                aVar = new a(c.b, c.a() != null ? c.a().h() : -1);
            }
            b = aVar;
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4fed3f15dfa87f96a5bac78ff8b794d3", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4fed3f15dfa87f96a5bac78ff8b794d3") : C0592a.b;
    }

    private a(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35b99a9cda445b646f695683c046bbbc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35b99a9cda445b646f695683c046bbbc");
        }
    }

    @Override // com.dianping.monitor.impl.a
    public final String getUnionid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15570db2f2a8c85b01fb6686bfccba16", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15570db2f2a8c85b01fb6686bfccba16");
        }
        if (TextUtils.isEmpty(this.b) && c.a() != null) {
            this.b = c.a().g();
        }
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }
}
