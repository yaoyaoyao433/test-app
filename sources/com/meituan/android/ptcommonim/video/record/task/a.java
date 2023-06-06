package com.meituan.android.ptcommonim.video.record.task;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.ptcommonim.video.record.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.ugc.library.b;
import com.sankuai.meituan.mtlive.ugc.library.d;
import com.sankuai.meituan.mtlive.ugc.library.interfaces.d;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a extends c<com.meituan.android.ptcommonim.video.record.entity.a> {
    public static ChangeQuickRedirect c;
    private final String a;
    private final String b;
    private Context e;

    @Override // com.meituan.android.ptcommonim.video.record.utils.c
    public final /* synthetic */ com.meituan.android.ptcommonim.video.record.entity.a a() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85e1d4f6c946775ad31602b73e0dd3cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.ptcommonim.video.record.entity.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85e1d4f6c946775ad31602b73e0dd3cb");
        }
        if (TextUtils.isEmpty(this.a)) {
            return null;
        }
        com.meituan.android.ptcommonim.video.record.entity.a aVar = new com.meituan.android.ptcommonim.video.record.entity.a();
        aVar.a = this.a;
        aVar.b = this.b;
        d a = b.a(this.e, 453197);
        d.C0618d a2 = a.a(this.a);
        a.cancel();
        if (a2 != null) {
            aVar.c = a2.b;
        }
        return aVar;
    }

    public a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50705f32b6eefb6b638bda47358332a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50705f32b6eefb6b638bda47358332a9");
            return;
        }
        this.e = context.getApplicationContext();
        this.a = str;
        this.b = str2;
    }
}
