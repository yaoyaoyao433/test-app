package com.meituan.android.neohybrid.neo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.android.neohybrid.core.horn.bean.NeoHornConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends com.meituan.android.neohybrid.neo.a {
    public static ChangeQuickRedirect d;
    private final Map<String, com.meituan.android.neohybrid.neo.a> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(com.meituan.android.neohybrid.neo.a aVar);
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final String h() {
        return "manager";
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0061e056efdc15a57e3313a0c8afa70b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0061e056efdc15a57e3313a0c8afa70b");
        } else {
            this.e = new HashMap();
        }
    }

    private void a(com.meituan.android.neohybrid.neo.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bf63860b909ccbda90f66c0cc45ba9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bf63860b909ccbda90f66c0cc45ba9a");
            return;
        }
        aVar.a(this.b);
        this.e.put(aVar.h(), aVar);
    }

    @Nullable
    public final com.meituan.android.neohybrid.neo.a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d03900d830340d81ba3601b13af5c5c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.neo.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d03900d830340d81ba3601b13af5c5c3");
        }
        if (this.e == null || this.e.isEmpty()) {
            return null;
        }
        return this.e.get(str);
    }

    private void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c597c12f7bec0a0f1e038b70f37324de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c597c12f7bec0a0f1e038b70f37324de");
        } else {
            a(aVar, true);
        }
    }

    private void a(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12ab81baca57395dfd2867be1fb8730c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12ab81baca57395dfd2867be1fb8730c");
        } else if (aVar != null) {
            for (com.meituan.android.neohybrid.neo.a aVar2 : this.e.values()) {
                if (aVar2 != null && !aVar2.c && !aVar2.a(z)) {
                    aVar.a(aVar2);
                }
            }
        }
    }

    private void a(com.meituan.android.neohybrid.core.a aVar, Bundle bundle) {
        Object[] objArr = {aVar, null};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e283f8add8fc4e67d73c9d226929313", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e283f8add8fc4e67d73c9d226929313");
            return;
        }
        a(aVar);
        a(new com.meituan.android.neohybrid.neo.loading.d());
        a(new com.meituan.android.neohybrid.neo.ssr.a());
        a(new com.meituan.android.neohybrid.neo.bridge.b());
        if (((NeoHornConfig) com.meituan.android.neohybrid.core.horn.a.a().a(NeoHornConfig.class)).getRenderProcessGoneOptions() != null) {
            a(new com.meituan.android.neohybrid.neo.plugin.a());
        }
        Object[] objArr2 = {null};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4193c59d52668d4b57339ff67335a729", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4193c59d52668d4b57339ff67335a729") : new c(null), false);
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "469758dd83c226ae26a7ce8ddd0fc890", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "469758dd83c226ae26a7ce8ddd0fc890");
        } else {
            a(f.a());
        }
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8a1a94179289a48d4027ec2aea66eed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8a1a94179289a48d4027ec2aea66eed");
        } else {
            a(h.a());
        }
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4dfcf152e4c6ff07175bcf00c4eb4d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4dfcf152e4c6ff07175bcf00c4eb4d3");
        } else {
            a(i.a());
        }
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "115824e1a3ff56e9213736b5cb3814d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "115824e1a3ff56e9213736b5cb3814d8");
        } else {
            a(j.a());
        }
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717402b784b6463276d4b3a5ead965c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717402b784b6463276d4b3a5ead965c7");
        } else {
            a(k.a());
        }
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e6de69e59ffb62b6e9c7b29cd3efacc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e6de69e59ffb62b6e9c7b29cd3efacc");
            return;
        }
        a(l.a());
        a(m.a());
        this.e.clear();
        a();
    }

    public static b b(com.meituan.android.neohybrid.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbb7f5cb9ca7c8adcd980a43ba74734d", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbb7f5cb9ca7c8adcd980a43ba74734d");
        }
        b bVar = new b();
        bVar.a(aVar, (Bundle) null);
        return bVar;
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b23b58ccd3e7163ab267ae5890f4c207", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b23b58ccd3e7163ab267ae5890f4c207");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b149bc3ebf06d67d7220dbab6df59c9c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b149bc3ebf06d67d7220dbab6df59c9c") : new g(view));
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de7b4169d8147878f063562c3e97c82d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de7b4169d8147878f063562c3e97c82d");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f44c74f7408e97a26e513ab3e5c5b7b8", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f44c74f7408e97a26e513ab3e5c5b7b8") : new d(i, i2, intent));
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void a(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "847b788ff4bad4441e99d08d6f23a51c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "847b788ff4bad4441e99d08d6f23a51c");
            return;
        }
        Object[] objArr2 = {nVar};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3ff0d8849fbfe5833624efb4336be252", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3ff0d8849fbfe5833624efb4336be252") : new e(nVar));
    }
}
