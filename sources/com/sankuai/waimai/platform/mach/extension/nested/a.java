package com.sankuai.waimai.platform.mach.extension.nested;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.cache.e;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.mach.component.base.a<FrameLayout> {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private String d;
    private String e;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(FrameLayout frameLayout) {
        b bVar;
        WeakReference<b> weakReference;
        FrameLayout frameLayout2 = frameLayout;
        Object[] objArr = {frameLayout2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "595142a188cce69d16782d28454495cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "595142a188cce69d16782d28454495cd");
            return;
        }
        super.a((a) frameLayout2);
        if (i(this.b) && i(this.c) && i(this.d)) {
            c a2 = c.a();
            String str = this.b;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            e eVar = null;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "0dc44e461b5de6f14a07dc28585bdb62", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (b) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "0dc44e461b5de6f14a07dc28585bdb62");
            } else {
                bVar = (TextUtils.isEmpty(str) || (weakReference = a2.b.get(str)) == null) ? null : weakReference.get();
            }
            c a3 = c.a();
            String str2 = this.c;
            Object[] objArr3 = {str2};
            ChangeQuickRedirect changeQuickRedirect3 = c.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "edfffe378445da033dd62548532f5664", RobustBitConfig.DEFAULT_VALUE)) {
                eVar = (e) PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "edfffe378445da033dd62548532f5664");
            } else if (!TextUtils.isEmpty(str2)) {
                Iterator<e> it = a3.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e next = it.next();
                    if (next != null && str2.equals(next.j)) {
                        eVar = next;
                        break;
                    }
                }
            }
            Map<String, Object> a4 = com.sankuai.waimai.mach.utils.b.a(this.d);
            com.sankuai.waimai.mach.utils.b.a(this.e);
            if (bVar == null || eVar == null) {
                return;
            }
            com.sankuai.waimai.mach.utils.e.a(a4);
            return;
        }
        frameLayout2.setVisibility(8);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ FrameLayout b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44a7dd736944c1fa02cd3dfa56412bc8", RobustBitConfig.DEFAULT_VALUE) ? (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44a7dd736944c1fa02cd3dfa56412bc8") : new FrameLayout(context);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ef923c44a0cd3a328dd21d4a6bbe50b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ef923c44a0cd3a328dd21d4a6bbe50b");
            return;
        }
        this.b = a("native-id");
        this.c = a("template-id");
        this.d = a("template-data");
        this.e = a("context");
        com.sankuai.waimai.foundation.utils.log.a.b("MachEmbed", "EmbedComponent#onBind::mNativeId=" + this.b + ",mTemplateId=" + this.c + ",mTemplateData=" + this.d, new Object[0]);
    }
}
