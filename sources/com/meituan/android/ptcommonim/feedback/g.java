package com.meituan.android.ptcommonim.feedback;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g extends com.meituan.android.ptcommonim.pageadapter.message.item.a {
    public static ChangeQuickRedirect a;
    public final com.meituan.android.ptcommonim.pageadapter.message.utils.b b;
    public View c;
    public String d;

    public g(com.meituan.android.ptcommonim.pageadapter.message.utils.b bVar, String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49a244605b8f1b46b7006d6e9b8ea932", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49a244605b8f1b46b7006d6e9b8ea932");
            return;
        }
        this.b = bVar;
        this.d = str;
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.message.item.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3152847d01445bdbf2c8ca3b8274e12c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3152847d01445bdbf2c8ca3b8274e12c");
            return;
        }
        Context context = view.getContext();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c7c4a0f9da65d04fbe647cdba31eef66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c7c4a0f9da65d04fbe647cdba31eef66");
        } else if (context != null) {
            com.meituan.android.ptcommonim.utils.f.b("b_group_hhpjqchu_mv", "c_group_hjkzttqg", f.a(context, 0), null);
        }
    }

    @Override // com.meituan.android.ptcommonim.pageadapter.message.item.a
    public final View a() {
        return this.c;
    }
}
