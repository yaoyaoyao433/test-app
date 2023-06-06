package com.sankuai.waimai.router.components;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.widget.Toast;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class g implements com.sankuai.waimai.router.core.e {
    public static ChangeQuickRedirect b;
    public static final g c = new g();

    @Override // com.sankuai.waimai.router.core.e
    public void a(@NonNull com.sankuai.waimai.router.core.j jVar) {
    }

    @Override // com.sankuai.waimai.router.core.e
    public void a(@NonNull com.sankuai.waimai.router.core.j jVar, int i) {
        Object[] objArr = {jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55a8e46c6e83b95457a2b1554ef56145", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55a8e46c6e83b95457a2b1554ef56145");
            return;
        }
        String b2 = jVar.b("com.sankuai.waimai.router.core.error.msg", (String) null);
        if (TextUtils.isEmpty(b2)) {
            switch (i) {
                case 403:
                    b2 = "没有权限";
                    break;
                case 404:
                    b2 = "不支持的跳转链接";
                    break;
                default:
                    b2 = "跳转失败";
                    break;
            }
        }
        String str = b2 + CommonConstant.Symbol.BRACKET_LEFT + i + CommonConstant.Symbol.BRACKET_RIGHT;
        if (com.sankuai.waimai.router.core.d.a()) {
            str = str + "\n" + jVar.d.toString();
        }
        Toast.makeText(jVar.c, str, 1).show();
    }
}
