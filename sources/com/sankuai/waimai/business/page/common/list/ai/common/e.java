package com.sankuai.waimai.business.page.common.list.ai.common;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public c b;
    public b c;
    public final AlitaAutoRunManager.b d;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec0bc5d14485f4f70a90ba80360dc41d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec0bc5d14485f4f70a90ba80360dc41d");
        } else {
            this.d = new AlitaAutoRunManager.b() { // from class: com.sankuai.waimai.business.page.common.list.ai.common.e.1
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.b
                public final void a(@NonNull String str, @Nullable String str2, @Nullable AlitaJSValue alitaJSValue) {
                    Object[] objArr2 = {str, str2, alitaJSValue};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "734d7beb3a7bc1fb5d273de56bfd29ed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "734d7beb3a7bc1fb5d273de56bfd29ed");
                    } else {
                        super.a(str, str2, alitaJSValue);
                    }
                }

                @Override // com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.b
                public final void a(@NonNull String str, @Nullable Exception exc) {
                    Object[] objArr2 = {str, exc};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9cfb10cf12a01fa085715ec52d72191b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9cfb10cf12a01fa085715ec52d72191b");
                    } else {
                        super.a(str, exc);
                    }
                }

                @Override // com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.b
                public final void a(@NonNull String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00c9fd3a0ffc8cc4ed548c8c2d92330c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00c9fd3a0ffc8cc4ed548c8c2d92330c");
                    } else {
                        super.a(str);
                    }
                }

                @Override // com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.b
                public final void b(@NonNull String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bb694fd0fa6687ca735ad44dd9d2be4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bb694fd0fa6687ca735ad44dd9d2be4");
                    } else {
                        super.b(str);
                    }
                }

                @Override // com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.b
                public final void b(@NonNull String str, @Nullable String str2, @Nullable AlitaJSValue alitaJSValue) {
                    Object[] objArr2 = {str, str2, alitaJSValue};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "beffb498344758bc6fb863484707c1ac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "beffb498344758bc6fb863484707c1ac");
                        return;
                    }
                    super.b(str, str2, alitaJSValue);
                    if (e.this.b == null || !str.equals(e.this.b.a()) || e.this.c == null || alitaJSValue == null) {
                        return;
                    }
                    try {
                        e.this.c.a((b) e.this.c.a(alitaJSValue));
                    } catch (Exception unused) {
                    }
                }

                @Override // com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.b
                public final void b(@NonNull String str, @Nullable Exception exc) {
                    Object[] objArr2 = {str, exc};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4363f3f9e5aeafef02875eb0bcd737bb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4363f3f9e5aeafef02875eb0bcd737bb");
                        return;
                    }
                    super.b(str, exc);
                    if (e.this.b == null || !str.equals(e.this.b.a()) || e.this.c == null) {
                        return;
                    }
                    e.this.c.a();
                }
            };
        }
    }
}
