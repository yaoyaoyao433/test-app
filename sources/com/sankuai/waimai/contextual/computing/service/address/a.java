package com.sankuai.waimai.contextual.computing.service.address;

import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.contextual.computing.storage.sp.ContextualComputingSP;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a d;
    public volatile boolean b;
    public final com.sankuai.waimai.contextual.computing.config.a c;
    private final com.sankuai.waimai.contextual.computing.reasoning.a e;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.contextual.computing.service.address.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0930a {
        void a(@Nullable List<AddressItem> list);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df34d85eef4dd27260e4b523cc0a956f", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df34d85eef4dd27260e4b523cc0a956f");
        }
        if (d == null) {
            synchronized (a.class) {
                if (d == null) {
                    d = new a();
                }
            }
        }
        return d;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa5696d003a1e0ce3f38a5a442bc56ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa5696d003a1e0ce3f38a5a442bc56ec");
            return;
        }
        this.b = false;
        this.e = new com.sankuai.waimai.contextual.computing.reasoning.a();
        this.c = ContextualComputingSP.a();
    }

    @WorkerThread
    public final List<AddressItem> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0748c73736872616cc68c83b9dc7227b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0748c73736872616cc68c83b9dc7227b");
        }
        if (this.c.b) {
            try {
                return this.e.a();
            } catch (Exception unused) {
                return Collections.emptyList();
            }
        }
        return Collections.emptyList();
    }
}
