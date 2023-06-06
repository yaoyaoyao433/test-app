package com.meituan.android.upgrade.ui;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.upgrade.f;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UpgradeDownloadedDialog extends UpgradeBaseDialog {
    public static ChangeQuickRedirect g;
    private ImageView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private boolean m;

    public UpgradeDownloadedDialog(Context context, boolean z, VersionInfo versionInfo, f fVar) {
        super(context, versionInfo, fVar);
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), versionInfo, fVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bffac49674706b190a9c9d0fac4930b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bffac49674706b190a9c9d0fac4930b9");
            return;
        }
        this.m = z;
        this.d = z ? a.DOWNLOAD_SUCCESS : a.DOWNLOAD_FAIL;
        setContentView(R.layout.upgrade_dialog_downloaded);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d47eadbc475ab5932a97378570b1c27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d47eadbc475ab5932a97378570b1c27");
        } else {
            this.h = (ImageView) findViewById(R.id.icon_state);
            this.i = (TextView) findViewById(R.id.title);
            this.j = (TextView) findViewById(R.id.state_tips);
            this.k = (TextView) findViewById(R.id.btn_ok);
            this.l = (TextView) findViewById(R.id.btn_cancel);
            this.k.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.upgrade.ui.UpgradeDownloadedDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "da185ce56885fe818e2b29a0df5e7355", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "da185ce56885fe818e2b29a0df5e7355");
                        return;
                    }
                    UpgradeDownloadedDialog.this.c();
                    if (UpgradeDownloadedDialog.this.c == null) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("result", Integer.valueOf(1 ^ (UpgradeDownloadedDialog.this.m ? 1 : 0)));
                    UpgradeDownloadedDialog.this.a("DDUpdateFinishedConfirm", 1L, hashMap);
                }
            });
            this.l.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.upgrade.ui.UpgradeDownloadedDialog.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "46b16d4e4ddc09bc8600901654294f73", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "46b16d4e4ddc09bc8600901654294f73");
                        return;
                    }
                    UpgradeDownloadedDialog.this.d();
                    if (UpgradeDownloadedDialog.this.c == null) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("result", Integer.valueOf(1 ^ (UpgradeDownloadedDialog.this.m ? 1 : 0)));
                    UpgradeDownloadedDialog.this.a("DDUpdateFinishedCancel", 1L, hashMap);
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = g;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9c81f8be2d0d2c9b11a13ffa422a9b89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9c81f8be2d0d2c9b11a13ffa422a9b89");
        } else if (this.e != null) {
            a(this.i, this.e.a);
            a(this.i, this.e.b);
            a(this.k, this.e.d);
            a(this.k, this.e.e);
            a((View) this.k, this.e.c);
            a(this.l, this.e.g);
            a(this.l, this.e.h);
            a((View) this.l, this.e.f);
        }
    }

    @Override // com.meituan.android.upgrade.ui.UpgradeBaseDialog
    public final void a(VersionInfo versionInfo) {
        Object[] objArr = {versionInfo};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "604098081fcc1fe612180d6e8a78ebeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "604098081fcc1fe612180d6e8a78ebeb");
        } else if (versionInfo == null) {
        } else {
            this.c = versionInfo;
            if (this.c.forceupdate == 1) {
                this.l.setVisibility(8);
            } else {
                this.l.setVisibility(0);
            }
            if (this.m) {
                this.h.setImageResource(this.e.o > 0 ? this.e.o : R.drawable.upgrade_icon_scucces);
                this.i.setText(R.string.update_download_success_title);
                this.j.setVisibility(8);
                this.k.setText(R.string.update_download_success_btn_ok);
                this.l.setText(R.string.update_download_success_btn_cancel);
            } else {
                this.h.setImageResource(this.e.p > 0 ? this.e.p : R.drawable.upgrade_icon_fail);
                this.i.setText(R.string.update_download_fail_title);
                this.j.setVisibility(0);
                this.j.setText(R.string.update_download_fail_tips);
                this.k.setText(R.string.update_download_fail_btn_ok);
                this.l.setText(R.string.update_download_fail_btn_cancel);
            }
            if (isShowing()) {
                return;
            }
            show();
            if (this.c == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("result", Integer.valueOf(1 ^ (this.m ? 1 : 0)));
            hashMap.put("force", Integer.valueOf(this.c.forceupdate));
            a("DDUpdateFinishedShow", 1L, hashMap);
        }
    }
}
