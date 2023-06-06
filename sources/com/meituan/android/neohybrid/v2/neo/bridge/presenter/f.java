package com.meituan.android.neohybrid.v2.neo.bridge.presenter;

import android.text.TextUtils;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.kit.DecryptBridgeHandler;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.kit.EncryptBridgeHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class f extends b {
    public static ChangeQuickRedirect a = null;
    public static final String o = "f";
    private static final Map<String, Class<? extends com.meituan.android.neohybrid.v2.neo.bridge.handler.a>> p;

    public static /* synthetic */ void a(f fVar, com.meituan.android.neohybrid.v2.neo.bridge.handler.a aVar) {
        Object[] objArr = {fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dba3aed75af938c9e8766f6f370265e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dba3aed75af938c9e8766f6f370265e2");
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String k() {
        return "kit";
    }

    static {
        HashMap hashMap = new HashMap();
        p = hashMap;
        hashMap.put("encrypt", EncryptBridgeHandler.class);
        p.put("decrypt", DecryptBridgeHandler.class);
    }

    public f(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, String str3) {
        Object[] objArr = {aVar, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba398b67d752c75379627444bf72fb9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba398b67d752c75379627444bf72fb9b");
        } else {
            a(aVar, str, str2, str3);
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4c18118ba7c9a7619434b6ab20e1383", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4c18118ba7c9a7619434b6ab20e1383");
        }
        Class<? extends com.meituan.android.neohybrid.v2.neo.bridge.handler.a> cls = p.get(this.c);
        if (cls == null) {
            return a("can not find " + this.c + "'s kit");
        }
        try {
            com.meituan.android.neohybrid.v2.neo.bridge.handler.a newInstance = cls.newInstance();
            newInstance.b = this;
            newInstance.a(this.h, this.d);
            a(g.a(this, newInstance));
            com.meituan.android.neohybrid.v2.core.a aVar = this.h;
            String str = this.d;
            String str2 = com.meituan.android.neohybrid.v2.neo.bridge.handler.a.c;
            if (TextUtils.isEmpty(str2)) {
                return i();
            }
            try {
                return a(new JSONObject(str2));
            } catch (Exception unused) {
                return a(str2);
            }
        } catch (IllegalAccessException | InstantiationException unused2) {
            return a("can not init " + this.c + "'s kit");
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String j() {
        return o;
    }
}
