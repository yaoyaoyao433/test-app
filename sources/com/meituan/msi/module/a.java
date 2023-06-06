package com.meituan.msi.module;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.meituan.msi.api.b;
import com.meituan.msi.api.network.NetworkStatusChangeEvent;
import com.meituan.msi.api.network.NetworkTypeApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.dispather.e;
import com.meituan.msi.util.m;
import com.meituan.msi.util.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements ApiModule {
    public static ChangeQuickRedirect a;
    boolean b;
    String c;
    b d;
    String e;
    NetworkTypeApi f;
    e g;
    private final C0497a h;

    @Override // com.meituan.msi.module.ApiModule
    public final void a(MsiContext msiContext) {
    }

    public a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c38f09851c6cfeb85b08fd127c7cf804", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c38f09851c6cfeb85b08fd127c7cf804");
            return;
        }
        this.h = new C0497a();
        this.b = false;
        this.c = "none";
        this.e = NetworkTypeApi.class.getCanonicalName();
        this.d = bVar;
    }

    @Override // com.meituan.msi.module.ApiModule
    public final void a(Context context, e eVar) {
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e25acbf0eab42bfcab2eec423a5aae5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e25acbf0eab42bfcab2eec423a5aae5d");
            return;
        }
        this.g = eVar;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(this.h, intentFilter);
        this.h.b = true;
    }

    @Override // com.meituan.msi.module.ApiModule
    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e20a04d660140f161d23497744d8e70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e20a04d660140f161d23497744d8e70");
            return;
        }
        try {
            if (this.h.b) {
                context.unregisterReceiver(this.h);
                this.h.b = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msi.module.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0497a extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        boolean b;

        private C0497a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be8c6542e55efd1260c7a3f98802aab9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be8c6542e55efd1260c7a3f98802aab9");
            } else {
                this.b = false;
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(final Context context, final Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75a0e1ffe3800f1841ae66790ccd8d18", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75a0e1ffe3800f1841ae66790ccd8d18");
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                m.b(new Runnable() { // from class: com.meituan.msi.module.a.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7be031a31c67aec0547159e865ff78ae", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7be031a31c67aec0547159e865ff78ae");
                            return;
                        }
                        a aVar = a.this;
                        Context context2 = context;
                        Object[] objArr3 = {context2, intent};
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "762d9bf96a2917d1dc5dda4353ea569f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "762d9bf96a2917d1dc5dda4353ea569f");
                            return;
                        }
                        Object[] objArr4 = {context2};
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "940abe22b66a7aa9ec4c13ab535c79d9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "940abe22b66a7aa9ec4c13ab535c79d9");
                        } else {
                            String a2 = s.a(context2, "pt-9f1ef3f5277a86db");
                            s.b = a2;
                            boolean b = s.b(context2);
                            if (aVar.b != b) {
                                aVar.b = b;
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!a2.equalsIgnoreCase(aVar.c)) {
                                aVar.c = a2;
                                z = true;
                            }
                            if (z) {
                                NetworkStatusChangeEvent networkStatusChangeEvent = new NetworkStatusChangeEvent();
                                networkStatusChangeEvent.isConnected = aVar.b;
                                networkStatusChangeEvent.networkType = aVar.c;
                                aVar.g.a("onNetworkStatusChange", networkStatusChangeEvent);
                            }
                        }
                        if (aVar.d != null) {
                            if (aVar.f != null) {
                                aVar.f.a(aVar.c, aVar.b);
                                return;
                            }
                            b bVar = aVar.d;
                            String str = aVar.e;
                            Object[] objArr5 = {str};
                            ChangeQuickRedirect changeQuickRedirect5 = b.a;
                            Object accessDispatch = PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "45ff39a3b55422e63657310b31dee3ba", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "45ff39a3b55422e63657310b31dee3ba") : bVar.b.get(str);
                            if (accessDispatch instanceof NetworkTypeApi) {
                                aVar.f = (NetworkTypeApi) accessDispatch;
                                aVar.f.a(aVar.c, aVar.b);
                            }
                        }
                    }
                });
            }
        }
    }
}
