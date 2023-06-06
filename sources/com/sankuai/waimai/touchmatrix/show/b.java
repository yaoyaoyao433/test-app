package com.sankuai.waimai.touchmatrix.show;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.touchmatrix.a;
import com.sankuai.waimai.touchmatrix.show.a;
import com.sankuai.waimai.touchmatrix.views.ITMatrixView;
import java.util.Map;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes5.dex */
public final class b implements a.InterfaceC1357a {
    public static ChangeQuickRedirect a;
    private ITMatrixView b;
    private Context c;
    private com.sankuai.waimai.touchmatrix.data.a d;

    public b(ITMatrixView iTMatrixView, Context context) {
        Object[] objArr = {iTMatrixView, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61ced3f2c4958e0ec0dd3675427bcfa7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61ced3f2c4958e0ec0dd3675427bcfa7");
            return;
        }
        this.b = iTMatrixView;
        this.c = context;
    }

    @Override // com.sankuai.waimai.touchmatrix.show.a.InterfaceC1357a
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        a.C1348a b;
        a.c cVar;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6c928923164d793fc15f1a811854629", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6c928923164d793fc15f1a811854629");
        } else if (TextUtils.equals(str, "close")) {
            if (this.b != null) {
                this.b.dismiss();
            }
        } else if (TextUtils.equals(str, "jump_with_close")) {
            if (this.d != null && this.d.k.bizId != null && (b = com.sankuai.waimai.touchmatrix.a.a().b(this.d.k.bizId)) != null && (cVar = b.b) != null) {
                cVar.b(map.get("url").toString());
            } else {
                com.sankuai.waimai.router.a.a(new j(this.c, map.get("url").toString()));
            }
        }
    }
}
