package com.sankuai.meituan.takeoutnew.scan;

import android.content.Intent;
import android.os.Bundle;
import com.meituan.android.edfu.mbar.util.i;
import com.meituan.android.edfu.mbar.util.l;
import com.meituan.android.edfu.mbar.view.QRScanActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.scan.b;
import com.sankuai.meituan.takeoutnew.scan.handler.ScanResultHandler;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMScanQRCodeActivity extends QRScanActivity {
    public static ChangeQuickRedirect c;

    @Override // com.meituan.android.edfu.mbar.view.QRScanActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a299cec2c78073393956e812a1989cbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a299cec2c78073393956e812a1989cbe");
            return;
        }
        a(new i.a().a("dj-cc6d59bb27b83f45").a());
        super.onCreate(bundle);
    }

    @Override // com.meituan.android.edfu.mbar.view.QRScanActivity
    public final void a(l lVar) {
        boolean z;
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7f48ce3402d9173550b718b7aad9971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7f48ce3402d9173550b718b7aad9971");
            return;
        }
        Intent intent = getIntent();
        if (intent == null || intent.getExtras() == null) {
            return;
        }
        if (intent.getExtras().getInt("needResult", 0) == 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            b bVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e09eda21fd6f8c6ae391c2242c6a5c05", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e09eda21fd6f8c6ae391c2242c6a5c05") : b.a.a;
            Object[] objArr3 = {lVar};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (!PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "fce7d3c786393db55d93eaea2e2db8d6", RobustBitConfig.DEFAULT_VALUE)) {
                a aVar = bVar.b;
                Object[] objArr4 = {lVar};
                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                if (!PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "715ae701a76f30ef0783b7b4158317af", RobustBitConfig.DEFAULT_VALUE)) {
                    Iterator<ScanResultHandler> it = aVar.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (it.next().process(lVar)) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "715ae701a76f30ef0783b7b4158317af")).booleanValue();
                }
            } else {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "fce7d3c786393db55d93eaea2e2db8d6")).booleanValue();
            }
            if (z) {
                com.sankuai.waimai.foundation.utils.log.a.b("WMScanQRCodeResult", "QR Code is %s,has been process", lVar.a());
            } else {
                com.sankuai.waimai.foundation.utils.log.a.b("WMScanQRCodeResult", "QR Code is %s,no handler response", lVar.a());
            }
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("result", lVar.a());
            setResult(100, intent2);
        }
        super.a(lVar);
    }
}
