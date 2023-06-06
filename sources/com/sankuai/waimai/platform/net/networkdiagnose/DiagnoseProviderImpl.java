package com.sankuai.waimai.platform.net.networkdiagnose;

import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.waimai.platform.net.diagnose.IDiagnoseProvider;
import com.sankuai.waimai.platform.net.diagnose.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DiagnoseProviderImpl implements IDiagnoseProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.net.diagnose.IDiagnoseProvider
    public void startDiagnose(final a.InterfaceC1068a interfaceC1068a) {
        Object[] objArr = {interfaceC1068a};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4090f8ecf658faf7204e6d76c06ee15c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4090f8ecf658faf7204e6d76c06ee15c");
            return;
        }
        Object[] objArr2 = {interfaceC1068a};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.net.networkdiagnose.strategy.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "7fe25114b544310a0e448dc45167dd4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "7fe25114b544310a0e448dc45167dd4c");
            return;
        }
        final b bVar = new b(com.meituan.android.singleton.b.a.getApplicationContext());
        b.a(com.sankuai.waimai.platform.net.networkdiagnose.strategy.b.a());
        bVar.a(new a() { // from class: com.sankuai.waimai.platform.net.networkdiagnose.strategy.b.1
            public static ChangeQuickRedirect a;
            public MetricsSpeedMeterTask b;
            public int c = 0;
            public boolean d = false;

            @Override // com.sankuai.waimai.platform.net.networkdiagnose.a
            public final void a(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6ae16de8cf46ca18617f81374b45725e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6ae16de8cf46ca18617f81374b45725e");
                } else {
                    this.b = MetricsSpeedMeterTask.createCustomSpeedMeterTask("network_diagnose");
                }
            }

            @Override // com.sankuai.waimai.platform.net.networkdiagnose.a
            public final void b(String str) {
                int i = 0;
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "46d1f35fe7a4839fb93b30258d63c73b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "46d1f35fe7a4839fb93b30258d63c73b");
                } else if (interfaceC1068a != null) {
                    int i2 = this.c + 1;
                    this.c = i2;
                    int i3 = i2 * 100;
                    com.sankuai.waimai.platform.net.networkdiagnose.b bVar2 = bVar;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.platform.net.networkdiagnose.b.a;
                    if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect5, false, "550d7ba2494d4277f0eb96e0ecec1383", RobustBitConfig.DEFAULT_VALUE)) {
                        i = ((Integer) PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect5, false, "550d7ba2494d4277f0eb96e0ecec1383")).intValue();
                    } else if (bVar2.c != null) {
                        i = bVar2.c.size();
                    }
                    int i4 = i3 / i;
                    if (i4 <= 100) {
                        interfaceC1068a.a(i4);
                    }
                }
            }

            @Override // com.sankuai.waimai.platform.net.networkdiagnose.a
            public final void c(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "abd479a955db54c4d9ab58a6096ad5e7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "abd479a955db54c4d9ab58a6096ad5e7");
                } else if (interfaceC1068a == null || this.d) {
                } else {
                    interfaceC1068a.a("");
                    this.d = true;
                }
            }

            @Override // com.sankuai.waimai.platform.net.networkdiagnose.a
            public final void d(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "393fc6a8804bf0577c9c75ff2efcc1ad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "393fc6a8804bf0577c9c75ff2efcc1ad");
                    return;
                }
                if (interfaceC1068a != null && !this.d) {
                    interfaceC1068a.a(str);
                    this.d = true;
                }
                if (this.b != null) {
                    h.a(this.b.recordStep("finished"));
                }
            }
        });
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect4, false, "3554a0cb7990536eefa506e3161bacfc", RobustBitConfig.DEFAULT_VALUE)) {
            b bVar2 = (b) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect4, false, "3554a0cb7990536eefa506e3161bacfc");
            return;
        }
        if (bVar.e == 1) {
            return;
        }
        if (bVar.e == 2) {
            return;
        }
        bVar.e = 1;
        if (bVar.d != null) {
            for (com.sankuai.waimai.platform.net.networkdiagnose.strategy.a aVar : bVar.c) {
                aVar.diagnose();
            }
        }
    }
}
