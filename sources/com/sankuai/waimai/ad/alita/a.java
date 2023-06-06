package com.sankuai.waimai.ad.alita;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.engine.h;
import com.sankuai.waimai.alita.core.intention.AlitaIntention;
import com.sankuai.waimai.alita.core.intention.d;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    public static final String b = "a";
    public String c;
    public d d;
    private String e;
    private JSONObject f;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.ad.alita.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0674a {
        void a(@Nullable AlitaIntention alitaIntention);

        void a(@Nullable Exception exc);

        void a(@Nullable JSONObject jSONObject);
    }

    public static /* synthetic */ void a(a aVar, final InterfaceC0674a interfaceC0674a) {
        Object[] objArr = {interfaceC0674a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "96135da9216cf3b15e8a03e1a4467c04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "96135da9216cf3b15e8a03e1a4467c04");
        } else if (interfaceC0674a == null) {
            com.sankuai.waimai.foundation.utils.log.a.a(b, "executeAlitaBundle - intentionListener is empty!");
        } else {
            try {
                com.sankuai.waimai.alita.platform.a.a().a(aVar.e, Collections.singletonList(aVar.f != null ? aVar.f : new JSONObject()), new h() { // from class: com.sankuai.waimai.ad.alita.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.alita.core.engine.h
                    public final void a(@Nullable String str, @Nullable AlitaJSValue alitaJSValue) {
                        Object[] objArr2 = {str, alitaJSValue};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6691a8bb6166e00d4409e7c39d4bd9ea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6691a8bb6166e00d4409e7c39d4bd9ea");
                        } else if (alitaJSValue == null) {
                            interfaceC0674a.a((JSONObject) null);
                        } else {
                            try {
                                interfaceC0674a.a(new JSONObject(alitaJSValue.stringValue()));
                            } catch (JSONException e) {
                                e.printStackTrace();
                                interfaceC0674a.a(e);
                            }
                        }
                    }

                    @Override // com.sankuai.waimai.alita.core.engine.h
                    public final void a(@Nullable Exception exc) {
                        Object[] objArr2 = {exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9532d34b70acec0b8987b1019d0d34e0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9532d34b70acec0b8987b1019d0d34e0");
                        } else {
                            interfaceC0674a.a(exc);
                        }
                    }
                });
            } catch (Exception e) {
                interfaceC0674a.a(e);
                e.printStackTrace();
            }
        }
    }

    public a(String str, String str2, JSONObject jSONObject) {
        Object[] objArr = {str, str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e89efb4a6db2b232c82012151faf3c75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e89efb4a6db2b232c82012151faf3c75");
            return;
        }
        this.c = str;
        this.e = str2;
        this.f = jSONObject;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4e31510489173c4b3889d39559d0669", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4e31510489173c4b3889d39559d0669");
        } else if (this.d != null) {
            this.d.a();
        }
    }
}
