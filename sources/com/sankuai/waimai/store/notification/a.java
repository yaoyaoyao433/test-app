package com.sankuai.waimai.store.notification;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiNotification;
import com.sankuai.waimai.store.router.d;
import com.sankuai.waimai.store.widgets.windows.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static WeakReference<com.sankuai.waimai.store.widgets.windows.a> c;
    private static int e;
    private boolean f;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a g;
    private final InterfaceC1249a h;
    private long i;
    private int j;
    private com.sankuai.waimai.store.widgets.windows.a k;
    private static HashSet<String> b = new HashSet<>();
    private static final HashMap<String, WeakReference<Activity>> d = new HashMap<>();

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.notification.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1249a {
    }

    public static /* synthetic */ void a(PoiNotification poiNotification, String str, int i) {
        Object[] objArr = {poiNotification, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8a7d68f968798f55150c0d265a9262f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8a7d68f968798f55150c0d265a9262f");
            return;
        }
        EventInfo eventInfo = new EventInfo();
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", str);
        hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(i));
        hashMap.put("event_type", Integer.valueOf(poiNotification.type));
        eventInfo.val_lab = hashMap;
        eventInfo.nm = EventName.MGE;
        eventInfo.val_bid = "b_frgCP";
        eventInfo.event_type = "click";
        Statistics.getChannel("waimai").writeEvent("", eventInfo);
    }

    public static /* synthetic */ void b(PoiNotification poiNotification, String str, int i) {
        Object[] objArr = {poiNotification, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "994c8fbfa3497221a3d8243b15deb8cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "994c8fbfa3497221a3d8243b15deb8cb");
            return;
        }
        EventInfo eventInfo = new EventInfo();
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", str);
        hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(i));
        hashMap.put("event_type", Integer.valueOf(poiNotification.type));
        eventInfo.val_lab = hashMap;
        eventInfo.nm = EventName.MGE;
        eventInfo.val_bid = "b_pksx1";
        eventInfo.event_type = "click";
        Statistics.getChannel("waimai").writeEvent("", eventInfo);
    }

    public a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        this((InterfaceC1249a) null, aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3d81e57b1f14cc919c3e2455bc2fe2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3d81e57b1f14cc919c3e2455bc2fe2f");
        }
    }

    public a(long j, int i) {
        this((InterfaceC1249a) null, (com.sankuai.waimai.store.platform.domain.manager.poi.a) null);
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "829a86ca75b7157f582fff5ed8372412", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "829a86ca75b7157f582fff5ed8372412");
            return;
        }
        this.i = j;
        this.j = i;
    }

    private a(InterfaceC1249a interfaceC1249a, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {null, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb827fb3a84c1d2110bd54b5d9d80cb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb827fb3a84c1d2110bd54b5d9d80cb0");
            return;
        }
        this.f = false;
        this.i = -1L;
        this.j = 0;
        this.g = aVar;
        this.h = null;
    }

    public final void a(Activity activity, boolean z, List<PoiNotification> list) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c795e3015b28855885374b9c823446c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c795e3015b28855885374b9c823446c7");
        } else {
            this.k = a(activity, d(), list, z);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0c08adee8f4d7ed85b1d5596a132c84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0c08adee8f4d7ed85b1d5596a132c84");
        } else {
            this.f = true;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46b9b2993f72f8d136540a3c9758cdf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46b9b2993f72f8d136540a3c9758cdf9");
            return;
        }
        this.f = false;
        if (this.k != null) {
            this.k.c();
            this.k = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010f, code lost:
        if (r0.isFinishing() == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.sankuai.waimai.store.widgets.windows.a a(android.app.Activity r25, java.lang.String r26, java.util.List<com.sankuai.waimai.store.platform.domain.core.poi.PoiNotification> r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.notification.a.a(android.app.Activity, java.lang.String, java.util.List, boolean):com.sankuai.waimai.store.widgets.windows.a");
    }

    private com.sankuai.waimai.store.widgets.windows.a a(Activity activity, @NonNull final PoiNotification poiNotification, int i, boolean z) {
        Object[] objArr = {activity, poiNotification, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67816517eb44b001605e956c2204db08", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.widgets.windows.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67816517eb44b001605e956c2204db08");
        }
        a("showNotification", new Object[0]);
        e();
        a.c cVar = null;
        if (z) {
            c(poiNotification, d(), c());
            cVar = new a.c() { // from class: com.sankuai.waimai.store.notification.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.widgets.windows.a.c
                public final void a(com.sankuai.waimai.store.widgets.windows.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a226ed3106ff2ec87386c3948e8081d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a226ed3106ff2ec87386c3948e8081d");
                    } else {
                        a.a(poiNotification, a.this.d(), a.this.c());
                    }
                }
            };
        }
        b b2 = new b(activity).a(poiNotification.icon).b(poiNotification.content);
        b2.j = i;
        b2.h = a(activity, poiNotification, z);
        b2.i = cVar;
        com.sankuai.waimai.store.widgets.windows.a a2 = b2.a();
        c = new WeakReference<>(a2);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e6bfaf550bef33d612e76eb0300b9c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e6bfaf550bef33d612e76eb0300b9c8")).intValue();
        }
        if (this.g != null) {
            return this.g.v();
        }
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3526a4ceec0da1720e9f7320747b4c8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3526a4ceec0da1720e9f7320747b4c8") : this.g != null ? this.g.d() : "-1";
    }

    @Nullable
    private a.b a(final Context context, @NonNull final PoiNotification poiNotification, final boolean z) {
        Object[] objArr = {context, poiNotification, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "882e8acf2f9e7ffb33cd5e7ec258d62b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "882e8acf2f9e7ffb33cd5e7ec258d62b");
        }
        switch (poiNotification.clickAction) {
            case 1:
                final String str = poiNotification.linkUrl;
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return new a.b() { // from class: com.sankuai.waimai.store.notification.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.widgets.windows.a.b
                    public final void a(com.sankuai.waimai.store.widgets.windows.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c37840dbca181bfee7d40bf205be537c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c37840dbca181bfee7d40bf205be537c");
                            return;
                        }
                        aVar.c();
                        if (z) {
                            a.b(poiNotification, a.this.d(), a.this.c());
                        }
                        aVar.h = null;
                        d.a(context, str);
                    }
                };
            case 2:
                final int i = poiNotification.type;
                return new a.b() { // from class: com.sankuai.waimai.store.notification.a.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.widgets.windows.a.b
                    public final void a(com.sankuai.waimai.store.widgets.windows.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37d1feda0f089e776dcc0fe19fe4044f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37d1feda0f089e776dcc0fe19fe4044f");
                            return;
                        }
                        aVar.c();
                        if (z) {
                            a.b(poiNotification, a.this.d(), a.this.c());
                        }
                        aVar.h = null;
                        if (i != 1) {
                            if (a.this.h == null || !a.this.f) {
                                return;
                            }
                            InterfaceC1249a unused = a.this.h;
                        } else if (a.this.h == null || !a.this.f) {
                        } else {
                            InterfaceC1249a unused2 = a.this.h;
                        }
                    }
                };
            default:
                return null;
        }
    }

    private static void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0eed16b56e6ca646cd413f1af6496003", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0eed16b56e6ca646cd413f1af6496003");
        } else if (c != null) {
            com.sankuai.waimai.store.widgets.windows.a aVar = c.get();
            if (aVar != null) {
                aVar.c();
            }
            c = null;
        }
    }

    private static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "e98955511410b16dc29d9cf551452f95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "e98955511410b16dc29d9cf551452f95");
        } else {
            com.sankuai.shangou.stone.util.log.a.a("PoiNotificationLogic", str, objArr);
        }
    }

    private static void c(@NonNull PoiNotification poiNotification, String str, int i) {
        Object[] objArr = {poiNotification, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cad4570f7b44086a9273f6dda84b24aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cad4570f7b44086a9273f6dda84b24aa");
            return;
        }
        EventInfo eventInfo = new EventInfo();
        HashMap hashMap = new HashMap();
        hashMap.put("poi_id", str);
        hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(i));
        hashMap.put("event_type", Integer.valueOf(poiNotification.type));
        eventInfo.val_lab = hashMap;
        eventInfo.nm = EventName.MGE;
        eventInfo.val_bid = "b_jk2hO";
        eventInfo.event_type = Constants.EventType.VIEW;
        Statistics.getChannel("waimai").writeEvent("", eventInfo);
    }
}
