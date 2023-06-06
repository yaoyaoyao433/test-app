package com.sankuai.mads.internal;

import android.os.Handler;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.f;
import com.sankuai.mads.g;
import com.sankuai.mads.h;
import com.sankuai.mads.internal.utils.b;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/sankuai/mads/internal/RealReport;", "Lcom/sankuai/mads/Report;", "reporter", "Lcom/sankuai/mads/MadsReporter;", "originEvent", "Lcom/sankuai/mads/Event;", "(Lcom/sankuai/mads/MadsReporter;Lcom/sankuai/mads/Event;)V", "checkErrorAndReport", "", "chargeInfo", "", "eventId", "commit", "createErrorLog", "Companion", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class d implements f {
    public static ChangeQuickRedirect a;
    public static final a b = new a(null);
    private final com.sankuai.mads.d c;
    private final com.sankuai.mads.b d;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class b extends i implements kotlin.jvm.functions.a<r> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ g c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar) {
            super(0);
            this.c = gVar;
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ r invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2088ab0de677ffb6e9e378e4e33fd7ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2088ab0de677ffb6e9e378e4e33fd7ab");
            } else {
                h hVar = d.this.c.c;
                if (hVar != null) {
                    hVar.a(this.c);
                }
            }
            return r.a;
        }
    }

    public d(@NotNull com.sankuai.mads.d dVar, @NotNull com.sankuai.mads.b bVar) {
        kotlin.jvm.internal.h.b(dVar, "reporter");
        kotlin.jvm.internal.h.b(bVar, "originEvent");
        Object[] objArr = {dVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f2dbbb0a337f07f686dc794a6fc2364", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f2dbbb0a337f07f686dc794a6fc2364");
            return;
        }
        this.c = dVar;
        this.d = bVar;
    }

    @Override // com.sankuai.mads.f
    public final void a() {
        boolean a2;
        Integer num;
        int i;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68dfd73a6734236d38055eec3f48e0e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68dfd73a6734236d38055eec3f48e0e6");
            return;
        }
        com.sankuai.mads.b bVar = this.d;
        String str = bVar.c;
        String str2 = bVar.b;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f555ecf57a24f95b227316db714b2717", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f555ecf57a24f95b227316db714b2717");
        } else {
            if (str == null) {
                d dVar = this;
                String str3 = "eventId=" + str2 + " and chargeInfo is empty";
                com.sankuai.mads.internal.utils.b.a(com.sankuai.mads.internal.utils.b.b, str3);
                b.InterfaceC0580b a3 = com.sankuai.mads.internal.utils.b.a();
                if (a3 != null) {
                    a3.b(str3);
                }
                com.sankuai.mads.internal.tracker.b.a(new com.sankuai.mads.internal.tracker.a(null, "illegal_argument", "report_error_chargeInfo_empty", "chargeInfo_empty", dVar.a(str, str2), 1, null));
                r rVar = r.a;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            if (isEmpty && str != null) {
                a2 = kotlin.text.g.a((CharSequence) str, (CharSequence) "&event_id=", false);
                isEmpty = !a2;
            }
            if (isEmpty) {
                com.sankuai.mads.internal.utils.b.a(com.sankuai.mads.internal.utils.b.b, "eventId is empty");
                b.InterfaceC0580b a4 = com.sankuai.mads.internal.utils.b.a();
                if (a4 != null) {
                    a4.b("eventId is empty");
                }
                com.sankuai.mads.internal.tracker.b.a(new com.sankuai.mads.internal.tracker.a(null, "illegal_argument", "report_error_event_id_empty", "event_id_empty", a(str, str2), 1, null));
            }
        }
        String str4 = bVar.c;
        if (str4 == null || (num = bVar.e) == null) {
            return;
        }
        int intValue = num.intValue();
        String str5 = bVar.b;
        String str6 = bVar.d;
        a aVar = b;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "087b8cb66b2cb3d2abeaeaf8355f7a43", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "087b8cb66b2cb3d2abeaeaf8355f7a43")).intValue();
        } else {
            c cVar = c.l;
            com.sankuai.mads.internal.cache.b<String> d = c.d();
            String a5 = d != null ? d.a() : null;
            if (a5 != null) {
                int hashCode = a5.hashCode();
                if (hashCode != 1621) {
                    if (hashCode != 1652) {
                        if (hashCode != 1683) {
                            if (hashCode != 1714) {
                                if (hashCode == 2694997 && a5.equals("WiFi")) {
                                    i = 0;
                                }
                            } else if (a5.equals("5G")) {
                                i = 4;
                            }
                        } else if (a5.equals("4G")) {
                            i = 3;
                        }
                    } else if (a5.equals("3G")) {
                        i = 2;
                    }
                } else if (a5.equals("2G")) {
                    i = 1;
                }
            }
            i = -1;
        }
        g gVar = new g(bVar, com.sankuai.mads.internal.a.a(str4, intValue, str5, str6, i), 0, 4, null);
        com.sankuai.mads.internal.utils.a.a(this, new b(gVar));
        if (bVar.f != 1) {
            this.c.b.a(gVar);
            return;
        }
        com.sankuai.mads.internal.b bVar2 = this.c.b;
        Object[] objArr4 = {gVar};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.mads.internal.b.a;
        if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "c45d0a87f5ac6f33a31439dd7da25608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "c45d0a87f5ac6f33a31439dd7da25608");
            return;
        }
        kotlin.jvm.internal.h.b(gVar, "eventData");
        com.sankuai.mads.internal.manager.a aVar2 = com.sankuai.mads.internal.manager.a.g;
        com.sankuai.mads.internal.manager.a.b().a(1);
        com.sankuai.mads.internal.cache.a aVar3 = bVar2.b;
        Object[] objArr5 = {gVar};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.mads.internal.cache.a.a;
        if (PatchProxy.isSupport(objArr5, aVar3, changeQuickRedirect5, false, "d50409de7b7d6294a2b467402f78b811", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, aVar3, changeQuickRedirect5, false, "d50409de7b7d6294a2b467402f78b811");
        } else {
            kotlin.jvm.internal.h.b(gVar, "eventData");
            aVar3.b.add(gVar);
            com.sankuai.mads.internal.manager.a.g.a(aVar3.b.size());
        }
        com.sankuai.mads.internal.cache.a aVar4 = bVar2.b;
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.mads.internal.cache.a.a;
        if (PatchProxy.isSupport(objArr6, aVar4, changeQuickRedirect6, false, "09bc12c301cfd9790f7f5e8773d2713c", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr6, aVar4, changeQuickRedirect6, false, "09bc12c301cfd9790f7f5e8773d2713c")).booleanValue();
        } else {
            int size = aVar4.b.size();
            com.sankuai.mads.internal.horn.a aVar5 = com.sankuai.mads.internal.horn.a.c;
            if (size >= com.sankuai.mads.internal.horn.a.a().b.b()) {
                z = true;
            }
        }
        if (z) {
            bVar2.c.sendEmptyMessage(101);
        } else if (bVar2.c.hasMessages(101)) {
        } else {
            Handler handler = bVar2.c;
            com.sankuai.mads.internal.horn.a aVar6 = com.sankuai.mads.internal.horn.a.c;
            handler.sendEmptyMessageDelayed(101, com.sankuai.mads.internal.horn.a.a().b.c());
        }
    }

    private final String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5adbf1c3056233bd9a28b80d6c0eb234", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5adbf1c3056233bd9a28b80d6c0eb234");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.isEmpty(str)) {
                str = "unknown";
            }
            jSONObject.put("chargeInfo", str);
            if (TextUtils.isEmpty(str2)) {
                str2 = "unknown";
            }
            jSONObject.put("event_id", str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.h.a((Object) jSONObject2, "log.toString()");
        return jSONObject2;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sankuai/mads/internal/RealReport$Companion;", "", "()V", "NETWORK_2G", "", "NETWORK_3G", "NETWORK_4G", "NETWORK_5G", "NETWORK_UNKNOWN", "NETWORK_WIFI", "networkType", "getNetworkType", "()I", "sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class a {
        public static ChangeQuickRedirect a;

        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }
}
