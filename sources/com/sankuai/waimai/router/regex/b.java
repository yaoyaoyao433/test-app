package com.sankuai.waimai.router.regex;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.common.j;
import com.sankuai.waimai.router.core.h;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends j {
    public static ChangeQuickRedirect b;
    private final Pattern c;
    private final int d;

    public b(@NonNull Pattern pattern, int i, @NonNull h hVar) {
        super(hVar);
        Object[] objArr = {pattern, Integer.valueOf(i), hVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a633b4f0bd4b57f3fea6ffbe85eac2fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a633b4f0bd4b57f3fea6ffbe85eac2fe");
            return;
        }
        this.c = pattern;
        this.d = i;
    }

    @Override // com.sankuai.waimai.router.common.j, com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull com.sankuai.waimai.router.core.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd2ccdd10786b78889616688a5dff08f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd2ccdd10786b78889616688a5dff08f")).booleanValue() : this.c.matcher(jVar.d.toString()).matches();
    }

    @Override // com.sankuai.waimai.router.common.j, com.sankuai.waimai.router.core.h
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14dbbb7fc56c909bdeea0be16685aaa5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14dbbb7fc56c909bdeea0be16685aaa5");
        }
        return "RegexWrapperHandler(" + this.c + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}
