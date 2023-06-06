package com.dianping.agentsdk.framework;

import android.support.annotation.NonNull;
import com.dianping.agentsdk.framework.aa;
import com.dianping.agentsdk.framework.ar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class at {
    public static ChangeQuickRedirect a;
    protected aa<ar.a> b;
    protected aa<ar.b> c;

    public at() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b19e6f19f42be789081d7df4db7927d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b19e6f19f42be789081d7df4db7927d");
            return;
        }
        this.b = new aa<>("WhiteBoard_Message_Handler_Registration_", new aa.a<ar.a>() { // from class: com.dianping.agentsdk.framework.at.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.agentsdk.framework.aa.a
            public final /* synthetic */ Object a(String str, Object obj, ar.a aVar) {
                ar.a aVar2 = aVar;
                Object[] objArr2 = {str, obj, aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb0b438d2fbc112338596d26004e1ba3", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb0b438d2fbc112338596d26004e1ba3");
                }
                if (aVar2 != null) {
                    return aVar2.handleMessage(obj);
                }
                return null;
            }
        });
        this.c = new aa<>("WhiteBoard_Message_Handler_With_Key_Registration_", new aa.a<ar.b>() { // from class: com.dianping.agentsdk.framework.at.2
            public static ChangeQuickRedirect a;

            @Override // com.dianping.agentsdk.framework.aa.a
            public final /* synthetic */ Object a(String str, Object obj, ar.b bVar) {
                ar.b bVar2 = bVar;
                Object[] objArr2 = {str, obj, bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8dca01593bf06269065eece42c58de9f", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8dca01593bf06269065eece42c58de9f");
                }
                if (bVar2 != null) {
                    return bVar2.a(str, obj);
                }
                return null;
            }
        });
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f52506b36dfdd7a5d72afaa6754f4ecd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f52506b36dfdd7a5d72afaa6754f4ecd");
            return;
        }
        this.b.a();
        this.c.a();
    }

    public final ArrayList<Object> a(@NonNull String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c45747e9cd3845f113c86cbdd2ac76a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c45747e9cd3845f113c86cbdd2ac76a");
        }
        ArrayList<Object> arrayList = new ArrayList<>();
        if (this.b != null) {
            arrayList.addAll(this.b.c(str, obj));
        }
        if (this.c != null) {
            arrayList.addAll(this.c.c(str, obj));
        }
        return arrayList;
    }

    public final String a(@NonNull String str, @NonNull ar.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d6ef31723164de325bd85f0051e9603", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d6ef31723164de325bd85f0051e9603") : this.b.a(str, aVar);
    }

    public final void a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7514dd9a2eca57630b9f4c0e0986b85e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7514dd9a2eca57630b9f4c0e0986b85e");
            return;
        }
        this.b.a(str);
        this.c.a(str);
    }

    public final void b(@NonNull String str, @NonNull ar.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a55d4d27db322c2230982529dc6bb5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a55d4d27db322c2230982529dc6bb5e");
        } else {
            this.b.b(str, aVar);
        }
    }

    public final void a(@NonNull ar.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8470a23457373d3306d76ab78a53e88c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8470a23457373d3306d76ab78a53e88c");
        } else {
            this.b.a((aa<ar.a>) aVar);
        }
    }
}
