package com.meituan.android.neohybrid.neo.bridge.presenter;

import android.text.TextUtils;
import com.meituan.android.neohybrid.neo.bridge.presenter.kit.DecryptBridgeHandler;
import com.meituan.android.neohybrid.neo.bridge.presenter.kit.EncryptBridgeHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class g extends b {
    public static ChangeQuickRedirect a = null;
    public static final String n = "g";
    private static final Map<String, Class<? extends com.meituan.android.neohybrid.neo.bridge.handler.a>> o;

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String k() {
        return "kit";
    }

    static {
        HashMap hashMap = new HashMap();
        o = hashMap;
        hashMap.put("encrypt", EncryptBridgeHandler.class);
        o.put("decrypt", DecryptBridgeHandler.class);
    }

    public g(com.meituan.android.neohybrid.core.a aVar, String str, String str2, String str3) {
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d9513446fc308490a71406481b11113", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d9513446fc308490a71406481b11113");
        } else {
            a(aVar, str, str2, str3);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cacfd6b60e04a708e64ab7907f417d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cacfd6b60e04a708e64ab7907f417d1");
        }
        Class<? extends com.meituan.android.neohybrid.neo.bridge.handler.a> cls = o.get(this.c);
        if (cls == null) {
            return a("can not find " + this.c + "'s kit");
        }
        try {
            com.meituan.android.neohybrid.neo.bridge.handler.a newInstance = cls.newInstance();
            newInstance.c = this;
            newInstance.b(this.g, this.d);
            a(h.a(this, newInstance));
            String c = newInstance.c(this.g, this.d);
            if (TextUtils.isEmpty(c)) {
                return i();
            }
            try {
                return a(new JSONObject(c));
            } catch (Exception unused) {
                return a(c);
            }
        } catch (IllegalAccessException | InstantiationException unused2) {
            return a("can not init " + this.c + "'s kit");
        }
    }

    public static /* synthetic */ void a(g gVar, com.meituan.android.neohybrid.neo.bridge.handler.a aVar) {
        Object[] objArr = {gVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd2f654fbb40e4817c1256b39a51e6c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd2f654fbb40e4817c1256b39a51e6c6");
        } else {
            aVar.a(gVar.g, gVar.d);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.bridge.presenter.b
    public final String j() {
        return n;
    }
}
