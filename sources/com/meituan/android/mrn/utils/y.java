package com.meituan.android.mrn.utils;

import android.text.TextUtils;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class y {
    public static ChangeQuickRedirect a;
    private static y b;
    private String c;
    private List<a> d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        CreateShadowNode,
        EnqueueCreateView,
        ExecuteCreateView;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9350f6f265a0eddcf1d53a64076d3b7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9350f6f265a0eddcf1d53a64076d3b7");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7cb14dce824dbb8c613153957c938e7", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7cb14dce824dbb8c613153957c938e7") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef947e362749c86e79239edb5e295682", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef947e362749c86e79239edb5e295682") : (a[]) values().clone();
        }
    }

    public static y a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc1d6e0029ef787d86b0ae4445527722", RobustBitConfig.DEFAULT_VALUE)) {
            return (y) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc1d6e0029ef787d86b0ae4445527722");
        }
        if (b == null) {
            synchronized (y.class) {
                b = new y();
            }
        }
        return b;
    }

    public y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d2b69fa3c6a502821f35f37d61dad28", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d2b69fa3c6a502821f35f37d61dad28");
            return;
        }
        this.c = "";
        this.d = new CopyOnWriteArrayList();
    }

    public final void a(ao aoVar, a aVar, int i) {
        Object[] objArr = {aoVar, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e287bdbf6968f1e0c8534c1c9979ca6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e287bdbf6968f1e0c8534c1c9979ca6e");
        } else if (aoVar != null) {
            String str = aoVar.getCurrentActivity() + "@" + System.identityHashCode(aoVar.getCurrentActivity());
            if (!TextUtils.equals(this.c, str)) {
                this.c = str;
                this.d.clear();
            }
            if (this.d.contains(aVar)) {
                return;
            }
            this.d.add(aVar);
            com.facebook.common.logging.a.a("[MonitorUtil@reportFirstOperateTime]", "%s %s %s tagId: %s", str, aVar.toString(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i));
        }
    }
}
