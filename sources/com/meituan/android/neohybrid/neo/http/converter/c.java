package com.meituan.android.neohybrid.neo.http.converter;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.paybase.utils.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.i;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c<T> implements i<ap, T> {
    public static ChangeQuickRedirect a;
    private final TypeToken<T> b;
    private String c;

    public c(TypeToken<T> typeToken, String str) {
        Object[] objArr = {typeToken, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d32d42a128629fac217bd64133db086", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d32d42a128629fac217bd64133db086");
            return;
        }
        this.b = typeToken;
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.meituan.retrofit2.i
    public T a(ap apVar) throws IOException {
        Object[] objArr = {apVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d70ede88fbbcfbc3ba83edda9fbca9ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d70ede88fbbcfbc3ba83edda9fbca9ab");
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (apVar == null) {
                throw new IOException("Failed to get response's entity");
            }
            String string = apVar.string();
            if (string == null || string.length() == 0) {
                throw new IOException("Failed to get response's entity");
            }
            return (T) com.meituan.android.neohybrid.util.gson.b.a().fromJson(string, this.b.getType());
        } finally {
            if (!TextUtils.isEmpty(this.c)) {
                y.d(this.c, System.currentTimeMillis() - currentTimeMillis);
            }
        }
    }
}
