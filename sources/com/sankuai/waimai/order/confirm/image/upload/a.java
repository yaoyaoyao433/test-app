package com.sankuai.waimai.order.confirm.image.upload;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.order.confirm.image.upload.c;
import com.sankuai.waimai.store.base.net.sg.e;
import com.tencent.mapsdk.internal.jw;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static com.sankuai.waimai.ugc.image.a a(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b800e8fe72baca1a855b7ab15d5dcc1f", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.ugc.image.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b800e8fe72baca1a855b7ab15d5dcc1f") : new AbstractC1033a(i, i2, str) { // from class: com.sankuai.waimai.order.confirm.image.upload.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.order.confirm.image.upload.a.AbstractC1033a
            public final String a(Context context, String str2, byte[] bArr, int i3, final com.sankuai.waimai.ugc.image.b bVar) {
                Object[] objArr2 = {context, str2, bArr, 95, bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b146e6c0dda0e7c38309fda29898d70", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b146e6c0dda0e7c38309fda29898d70");
                }
                if (bArr == null || bArr.length == 0) {
                    return null;
                }
                c.b bVar2 = new c.b() { // from class: com.sankuai.waimai.order.confirm.image.upload.a.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.order.confirm.image.upload.c.b
                    public final void a(long j, long j2) {
                        Object[] objArr3 = {new Long(j), new Long(j2)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6545ba96476f1149f819f9d338aa7c73", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6545ba96476f1149f819f9d338aa7c73");
                        } else {
                            bVar.a((int) ((r3 * j) / j2));
                        }
                    }
                };
                Object[] objArr3 = {context, str2, bArr, bVar2};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "08f7054eac33da7e49eed7de7cb6e404", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "08f7054eac33da7e49eed7de7cb6e404");
                }
                if (bArr == null || bArr.length == 0) {
                    return null;
                }
                String str3 = new e().c() + str2;
                String str4 = "/api/" + str2;
                Object[] objArr4 = {context, str3, str4, bVar2, bArr};
                ChangeQuickRedirect changeQuickRedirect4 = b.a;
                return PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "314dc916a55e0250e0609a6a2f3734af", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "314dc916a55e0250e0609a6a2f3734af") : b.a(context, str3, str4, "file", bArr, bVar2, null);
            }
        };
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.order.confirm.image.upload.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC1033a implements com.sankuai.waimai.ugc.image.a {
        public static ChangeQuickRedirect b;
        private int a;
        private int c;
        private String d;

        public abstract String a(Context context, String str, byte[] bArr, int i, com.sankuai.waimai.ugc.image.b bVar);

        public AbstractC1033a(int i, int i2, String str) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91d6e736cbeacfa49c91f2afcb119b4e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91d6e736cbeacfa49c91f2afcb119b4e");
                return;
            }
            this.c = i <= 0 ? jw.h : i;
            this.a = i2 <= 0 ? jw.h : i2;
            this.d = (str == null || str.length() <= 0) ? "/comment/picture/upload" : "/comment/picture/upload";
        }

        @Override // com.sankuai.waimai.ugc.image.a
        public final String a(@NonNull Context context, String str, @NonNull com.sankuai.waimai.ugc.image.b bVar) throws Exception {
            JSONObject optJSONObject;
            Object[] objArr = {context, str, bVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13eb69f432662b341fb3c7804b66cd4d", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13eb69f432662b341fb3c7804b66cd4d");
            }
            if (p.a(com.meituan.android.singleton.b.a)) {
                String a = a(context, this.d, com.sankuai.waimai.platform.utils.e.a(str, this.c, this.a), 95, bVar);
                if (TextUtils.isEmpty(a)) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(a);
                int optInt = jSONObject.optInt("code");
                String optString = jSONObject.optString("msg");
                if ((optInt == 0 || TextUtils.isEmpty(optString)) && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                    String optString2 = optJSONObject.optString("url");
                    if (TextUtils.isEmpty(optString2)) {
                        return null;
                    }
                    bVar.a(100);
                    return optString2;
                }
                return null;
            }
            return null;
        }
    }
}
