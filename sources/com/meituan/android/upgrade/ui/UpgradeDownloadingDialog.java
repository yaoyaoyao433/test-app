package com.meituan.android.upgrade.ui;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.meituan.android.upgrade.f;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UpgradeDownloadingDialog extends UpgradeBaseDialog {
    public static ChangeQuickRedirect g;
    private TextView h;
    private ProgressBar i;
    private TextView j;
    private TextView k;
    private TextView l;

    public UpgradeDownloadingDialog(Context context, VersionInfo versionInfo, f fVar) {
        super(context, versionInfo, fVar);
        Object[] objArr = {context, versionInfo, fVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6683c76c575ac8278b2febc52aeb37b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6683c76c575ac8278b2febc52aeb37b3");
            return;
        }
        this.d = a.DOWNLOADING;
        setContentView(R.layout.upgrade_dialog_downloading);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fadfda51639e11e2eca79b09bd8c1314", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fadfda51639e11e2eca79b09bd8c1314");
        } else {
            this.h = (TextView) findViewById(R.id.title);
            this.i = (ProgressBar) findViewById(R.id.progress);
            this.j = (TextView) findViewById(R.id.percent_count);
            this.k = (TextView) findViewById(R.id.btn_background);
            this.l = (TextView) findViewById(R.id.btn_cancel);
            this.k.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.upgrade.ui.UpgradeDownloadingDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3c6a4858034166597f9d2d78d57cef3f", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3c6a4858034166597f9d2d78d57cef3f");
                        return;
                    }
                    UpgradeDownloadingDialog.this.c();
                    if (UpgradeDownloadingDialog.this.c == null) {
                        return;
                    }
                    UpgradeDownloadingDialog.this.a("DDUpdateProcessBackground", 1L, new HashMap());
                }
            });
            this.l.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.upgrade.ui.UpgradeDownloadingDialog.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7ad5b391925787ab15bfa0c8e189cd70", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7ad5b391925787ab15bfa0c8e189cd70");
                        return;
                    }
                    UpgradeDownloadingDialog.this.d();
                    if (UpgradeDownloadingDialog.this.c == null) {
                        return;
                    }
                    UpgradeDownloadingDialog.this.a("DDUpdateProcessCancel", 1L, new HashMap());
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = g;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "35d7b5ba63d9aaadafe0841c57683700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "35d7b5ba63d9aaadafe0841c57683700");
        } else if (this.e != null) {
            a(this.h, this.e.a);
            a(this.h, this.e.b);
            a(this.k, this.e.d);
            a(this.k, this.e.e);
            a((View) this.k, this.e.c);
            a(this.l, this.e.g);
            a(this.l, this.e.h);
            a((View) this.l, this.e.f);
            if (this.e.k > 0) {
                this.i.setProgressDrawable(this.b.getResources().getDrawable(this.e.k));
            }
        }
    }

    @Override // com.meituan.android.upgrade.ui.UpgradeBaseDialog
    public final void a(VersionInfo versionInfo) {
        Object[] objArr = {versionInfo};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ea5ee724fa27b557ab2787ec8de29be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ea5ee724fa27b557ab2787ec8de29be");
        } else if (versionInfo == null) {
        } else {
            this.c = versionInfo;
            if (this.c.forceupdate == 1) {
                this.k.setVisibility(8);
                this.l.setVisibility(8);
            } else {
                this.k.setVisibility(0);
                this.l.setVisibility(0);
            }
            if (isShowing()) {
                return;
            }
            show();
            if (this.c == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("force", Integer.valueOf(this.c.forceupdate));
            a("DDUpdateProcessShow", 1L, hashMap);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8376f1ba0e7b46a2cbc0afc7d3e0d98f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8376f1ba0e7b46a2cbc0afc7d3e0d98f");
            return;
        }
        this.i.setProgress(i);
        TextView textView = this.j;
        textView.setText(i + "%");
    }
}
