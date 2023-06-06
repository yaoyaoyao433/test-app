package com.meituan.android.recce.shark;

import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p<T> implements com.sankuai.meituan.retrofit2.i<ap, T> {
    public static ChangeQuickRedirect a;
    private final TypeToken<T> b;
    private String c;

    @Override // com.sankuai.meituan.retrofit2.i
    public final /* synthetic */ Object a(ap apVar) throws IOException {
        ap apVar2 = apVar;
        Object[] objArr = {apVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dae9a4a83762c9f6bf0f765c4d81a3d", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dae9a4a83762c9f6bf0f765c4d81a3d");
        }
        if (apVar2 == null) {
            throw new IOException("Failed to get response's entity");
        }
        String string = apVar2.string();
        if (string == null || string.length() == 0) {
            throw new IOException("Failed to get response's entity");
        }
        return g.a().fromJson(string, this.b.getType());
    }

    public p(TypeToken<T> typeToken, String str) {
        Object[] objArr = {typeToken, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acf63fe9a7ffca9449c1f017e4fc4526", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acf63fe9a7ffca9449c1f017e4fc4526");
            return;
        }
        this.b = typeToken;
        this.c = str;
    }
}
