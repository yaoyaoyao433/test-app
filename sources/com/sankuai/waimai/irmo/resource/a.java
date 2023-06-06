package com.sankuai.waimai.irmo.resource;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.resource.api.b;
import com.sankuai.waimai.irmo.utils.d;
import com.sankuai.waimai.irmo.utils.f;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    private AtomicBoolean b;
    private b c;
    private volatile boolean d;
    private String e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab09d3bc9c35f0ccd21102d97357698c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab09d3bc9c35f0ccd21102d97357698c");
            return;
        }
        this.b = new AtomicBoolean(false);
        this.e = "API_UNSET";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.irmo.resource.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0977a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c863ae33b43929ed714e0367bbea0c5", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c863ae33b43929ed714e0367bbea0c5") : C0977a.a;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b7b4b26063bc89e715d43bc58438eef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b7b4b26063bc89e715d43bc58438eef");
            return;
        }
        d.b("IrmoResManager Init : " + this.b, new Object[0]);
        if (this.b.compareAndSet(false, true)) {
            this.d = f.a();
            if (!this.d) {
                d.d("IrmoResManager Init 使用旧方案,不做初始化及预加载数据请求", new Object[0]);
                return;
            }
            this.c = new com.sankuai.waimai.irmo.resource.loader.a();
            d();
            d.b("IrmoResManager Init ,初始化完成 ", new Object[0]);
        }
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a0bcc4e21d3d507889c8f3085e243a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a0bcc4e21d3d507889c8f3085e243a5")).booleanValue();
        }
        if (TextUtils.equals(this.e, "API_UNSET")) {
            Context context = com.meituan.android.singleton.b.a;
            d.a("首次获取Api环境信息, envName: ", new Object[0]);
            if (!TextUtils.isEmpty("")) {
                if ("".toLowerCase().contains("test")) {
                    this.e = "API_TEST";
                } else {
                    this.e = "API_PROD";
                }
            } else {
                this.e = "API_PROD";
            }
        }
        return TextUtils.equals(this.e, "API_TEST");
    }

    @Override // com.sankuai.waimai.irmo.resource.api.b
    public final void a(String str, com.sankuai.waimai.irmo.resource.api.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81345137bd4d23f3e43ae0857ec6b170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81345137bd4d23f3e43ae0857ec6b170");
        } else if (TextUtils.isEmpty(str)) {
            if (aVar != null) {
                aVar.a(10001, null);
            }
        } else {
            b();
            if (this.c != null) {
                this.c.a(str, aVar);
            } else if (aVar != null) {
                aVar.a(10003, new IllegalStateException("Irmo un Init , loader == null"));
            }
        }
    }

    @Override // com.sankuai.waimai.irmo.resource.api.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4a04ef0df72f489113010b4a24bbbd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4a04ef0df72f489113010b4a24bbbd7");
        } else if (this.c != null) {
            this.c.d();
        }
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ef20fa764a61a0b2fd4f487ffbe2aca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ef20fa764a61a0b2fd4f487ffbe2aca")).booleanValue();
        }
        b();
        return this.d;
    }
}
