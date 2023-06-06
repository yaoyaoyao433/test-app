package com.sankuai.waimai.alita.core.feature.repo;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter;
import com.sankuai.waimai.alita.core.event.facade.b;
import com.sankuai.waimai.alita.core.feature.e;
import com.sankuai.waimai.alita.core.utils.i;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private final String b;
    private String c;
    private JSONObject d;

    public d(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2db1bf14fe1e499048f50c526b48d7f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2db1bf14fe1e499048f50c526b48d7f2");
            return;
        }
        this.b = str;
        this.c = str2;
        a();
    }

    public final void a(@Nullable e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f4a1ca3266e55d2ae15044d125ea3fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f4a1ca3266e55d2ae15044d125ea3fe");
        } else if (eVar != null) {
            try {
                if (TextUtils.isEmpty(this.c) || !this.c.equals(eVar.c) || eVar.d == null) {
                    return;
                }
                c();
                a(eVar.d);
            } catch (Exception unused) {
            }
        }
    }

    @Nullable
    public final JSONObject a(@Nullable com.sankuai.waimai.alita.core.feature.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e96549866208bd2cfc3154016cdcd4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e96549866208bd2cfc3154016cdcd4f");
        }
        if (dVar != null) {
            return com.sankuai.waimai.alita.core.base.util.b.a(b(), dVar);
        }
        return null;
    }

    public final String b(@Nullable e eVar) {
        String str;
        boolean z = true;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba72bfafd054dbfa3b141ba7663a0435", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba72bfafd054dbfa3b141ba7663a0435");
        }
        if (eVar == null || eVar.d == null) {
            return "";
        }
        JSONObject jSONObject = eVar.d;
        Object[] objArr2 = {CommonConstant.Symbol.COMMA};
        ChangeQuickRedirect changeQuickRedirect2 = i.a.a;
        i.a aVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f2d7576d2a5de6f6df8b94ab651e3dde", RobustBitConfig.DEFAULT_VALUE) ? (i.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f2d7576d2a5de6f6df8b94ab651e3dde") : new i.a(CommonConstant.Symbol.COMMA);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                b().put(next, jSONObject.opt(next));
                Object[] objArr3 = {next};
                ChangeQuickRedirect changeQuickRedirect3 = i.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "e068f790964679d9582a52f456a97ee1", RobustBitConfig.DEFAULT_VALUE)) {
                    i.a aVar2 = (i.a) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "e068f790964679d9582a52f456a97ee1");
                } else if (!TextUtils.isEmpty(next)) {
                    aVar.c.add(next);
                }
            } catch (Exception unused) {
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = i.a.a;
        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "3362b10333ef5d69dd763d40d7ac80ab", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "3362b10333ef5d69dd763d40d7ac80ab");
        } else {
            str = "";
            if (aVar.c != null) {
                boolean z2 = !aVar.b.isEmpty();
                StringBuilder sb = new StringBuilder();
                for (String str2 : aVar.c) {
                    if (!TextUtils.isEmpty(str2)) {
                        if (!z && z2) {
                            sb.append(aVar.b);
                        }
                        sb.append(str2);
                        z = false;
                    }
                }
                str = sb.toString();
            }
        }
        return str;
    }

    @NonNull
    private JSONObject b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e8481ed6225aade212eb4c68a51d859", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e8481ed6225aade212eb4c68a51d859");
        }
        if (this.d == null) {
            a();
        }
        return this.d;
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bde983daa9f5b07d9d0b8910c4e61afc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bde983daa9f5b07d9d0b8910c4e61afc");
        } else if (jSONObject != null) {
            this.d = jSONObject;
        } else {
            a();
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c1d7ecaf30fb42c8ec49c49fd963bc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c1d7ecaf30fb42c8ec49c49fd963bc8");
        } else {
            this.d = new JSONObject();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c4fa931dd8a0b99e596ce8b4362fade", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c4fa931dd8a0b99e596ce8b4362fade");
            return;
        }
        b.a a2 = b.a.a(this.b);
        a2.b = this.d;
        AlitaRealTimeEventCenter.getInstance().writeAlitaCustomEvent(this.b, a2.a());
    }
}
