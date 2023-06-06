package com.sankuai.waimai.router.regex;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.components.h;
import com.sankuai.waimai.router.components.j;
import com.sankuai.waimai.router.core.d;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.router.utils.c;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.router.core.b {
    public static ChangeQuickRedirect a;
    private final c b;

    @Override // com.sankuai.waimai.router.core.h
    public final String toString() {
        return "RegexAnnotationHandler";
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39829ab8456ed95de3427c9e06a52ad8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39829ab8456ed95de3427c9e06a52ad8");
        } else {
            this.b = new c("RegexAnnotationHandler") { // from class: com.sankuai.waimai.router.regex.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.router.utils.c
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9489fb16a40ece0b842f2475975fd977", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9489fb16a40ece0b842f2475975fd977");
                        return;
                    }
                    a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "691a6c09cde8f0cc89a461cb4c806df1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "691a6c09cde8f0cc89a461cb4c806df1");
                    } else {
                        h.a(aVar, IRegexAnnotationInit.class);
                    }
                }
            };
        }
    }

    public final void a(String str, Object obj, boolean z, int i, i... iVarArr) {
        com.sankuai.waimai.router.core.h a2;
        Object[] objArr = {str, obj, (byte) 1, Integer.valueOf(i), iVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e36e10baacdabbf664cd76793507103e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e36e10baacdabbf664cd76793507103e");
            return;
        }
        Pattern a3 = a(str);
        if (a3 == null || (a2 = j.a(obj, true, iVarArr)) == null) {
            return;
        }
        a(new b(a3, i, a2), i);
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void b(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db107f6be5d90c4ec917c3e6064be0f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db107f6be5d90c4ec917c3e6064be0f1");
            return;
        }
        this.b.b();
        super.b(jVar, gVar);
    }

    private Pattern a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c370700e3f00837b9d2d0792cbd23c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pattern) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c370700e3f00837b9d2d0792cbd23c0");
        }
        if (str != null) {
            try {
                return Pattern.compile(str);
            } catch (PatternSyntaxException e) {
                d.b(e);
                return null;
            }
        }
        return null;
    }
}
