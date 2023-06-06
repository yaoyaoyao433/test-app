package com.meituan.android.quickpass.uptsm.test;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import com.meituan.android.quickpass.uptsm.common.utils.h;
import com.meituan.android.quickpass.uptsm.manage.a;
import com.meituan.android.quickpass.uptsm.test.bean.TsmDevConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.ui.widget.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class TsmTestActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect a;
    private ProgressDialog b;
    private Switch c;
    private EditText d;
    private EditText e;
    private EditText f;
    private TextView g;

    public TsmTestActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe04b0d887afe026ee541ab1fbe8e948", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe04b0d887afe026ee541ab1fbe8e948");
        } else {
            this.b = null;
        }
    }

    public static /* synthetic */ void a(TsmTestActivity tsmTestActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, tsmTestActivity, changeQuickRedirect, false, "6f443e6bb24851bdb1089ed76f9f45ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, tsmTestActivity, changeQuickRedirect, false, "6f443e6bb24851bdb1089ed76f9f45ae");
        } else if (tsmTestActivity.b == null || !tsmTestActivity.b.isShowing()) {
        } else {
            tsmTestActivity.b.dismiss();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5df7e894141646813db8ddbce1e0351a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5df7e894141646813db8ddbce1e0351a");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_test);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1d163640762a160d79c74a239872642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1d163640762a160d79c74a239872642");
        } else {
            this.c = (Switch) findViewById(R.id.swt_tsm_component);
            this.d = (EditText) findViewById(R.id.et_url);
            this.e = (EditText) findViewById(R.id.et_wallet_version);
            this.f = (EditText) findViewById(R.id.et_tsm_version);
            this.g = (TextView) findViewById(R.id.tv_cpcl);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "636c0e8e18910d80c11b5bfae00eab89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "636c0e8e18910d80c11b5bfae00eab89");
        } else {
            this.c.setOnCheckedChangeListener(this);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e006b7e5a6d2ad30cb5bf477c66aa216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e006b7e5a6d2ad30cb5bf477c66aa216");
            return;
        }
        this.c.setChecked(TsmDevConfig.getInstance().isDevOn());
        this.d.setText(TsmDevConfig.getInstance().getTsmUrl());
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45964657d07d7022b4e6ee2d32dbdd3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45964657d07d7022b4e6ee2d32dbdd3d");
        } else if (compoundButton == this.c) {
            if (z) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f99962936c1a6e810616a0be3ef472d6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f99962936c1a6e810616a0be3ef472d6");
                    return;
                }
                String obj = this.d.getText().toString();
                String obj2 = this.e.getText().toString();
                String obj3 = this.f.getText().toString();
                if (TextUtils.isEmpty(obj)) {
                    this.d.setError("tsm组件下载地址不能为空");
                }
                TsmDevConfig.getInstance().init(true, obj, obj2, obj3);
                a.a(this, "已经切换到Tsm组件更新 测试模式", 0).a();
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2a3a700610c2ee4c8af48733ea062353", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2a3a700610c2ee4c8af48733ea062353");
            } else {
                TsmDevConfig.getInstance().setDevOn(false);
            }
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1b64b9e3ae28cf76b7c45e7f274481c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1b64b9e3ae28cf76b7c45e7f274481c");
        } else {
            this.b = ProgressDialog.show(this, null, getString(R.string.quickpass_uptsm_update_loading), false, true);
        }
    }

    public void onPrepareProcess(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5521441233361b08c5e5a89e9e60a6ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5521441233361b08c5e5a89e9e60a6ef");
        } else {
            a.C0361a.a().a(getApplicationContext(), new a.d() { // from class: com.meituan.android.quickpass.uptsm.test.TsmTestActivity.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.quickpass.uptsm.manage.a.d
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51fd36f3d53b35387b3d3fad1334d43e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51fd36f3d53b35387b3d3fad1334d43e");
                        return;
                    }
                    h.a("拉起进程结果:" + i);
                    TsmTestActivity tsmTestActivity = TsmTestActivity.this;
                    com.sankuai.meituan.android.ui.widget.a.a(tsmTestActivity, "拉起进程结果:" + i, 0).a();
                }
            });
        }
    }

    public void onCreateSSDClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "362f102e41509620e28c22f73302149f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "362f102e41509620e28c22f73302149f");
            return;
        }
        a();
        a.C0361a.a().a(getApplicationContext(), true, new a.c() { // from class: com.meituan.android.quickpass.uptsm.test.TsmTestActivity.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.quickpass.uptsm.manage.a.c
            public final void a(final int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd053f1294bf119c63d94880cd0b149f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd053f1294bf119c63d94880cd0b149f");
                } else {
                    TsmTestActivity.this.runOnUiThread(new Runnable() { // from class: com.meituan.android.quickpass.uptsm.test.TsmTestActivity.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4bc3dc18cce7669f5c951a329808f217", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4bc3dc18cce7669f5c951a329808f217");
                                return;
                            }
                            TsmTestActivity.a(TsmTestActivity.this);
                            if (i == 0) {
                                com.sankuai.meituan.android.ui.widget.a.a(TsmTestActivity.this, "华为安全域创建成功", 0).a();
                            } else {
                                com.sankuai.meituan.android.ui.widget.a.a(TsmTestActivity.this, "华为安全域创建失败", 0).a();
                            }
                        }
                    });
                }
            }
        });
    }

    public void onGetCPCLClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5177d9f77f07210af1267ecae9424f30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5177d9f77f07210af1267ecae9424f30");
            return;
        }
        a();
        final com.meituan.android.quickpass.uptsm.manage.a aVar = new com.meituan.android.quickpass.uptsm.manage.a();
        final a.b bVar = new a.b() { // from class: com.meituan.android.quickpass.uptsm.test.TsmTestActivity.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.quickpass.uptsm.manage.a.b
            public final void a(final String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ad75e2764bc0978a086d8c02d93f572", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ad75e2764bc0978a086d8c02d93f572");
                } else {
                    TsmTestActivity.this.runOnUiThread(new Runnable() { // from class: com.meituan.android.quickpass.uptsm.test.TsmTestActivity.3.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "af5ac28cb28a5436d4abc64314a823ac", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "af5ac28cb28a5436d4abc64314a823ac");
                                return;
                            }
                            TsmTestActivity.a(TsmTestActivity.this);
                            if (!TextUtils.isEmpty(str)) {
                                TextView textView = TsmTestActivity.this.g;
                                textView.setText("CPCL : " + str);
                                return;
                            }
                            com.sankuai.meituan.android.ui.widget.a.a(TsmTestActivity.this, "获取CPCL失败", 0).a();
                        }
                    });
                }
            }
        };
        Object[] objArr2 = {this, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.quickpass.uptsm.manage.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "56b7d07df477b90326d93a255428ebfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "56b7d07df477b90326d93a255428ebfe");
        } else {
            new Thread(new Runnable() { // from class: com.meituan.android.quickpass.uptsm.manage.a.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "08271b178f4d96aede079c3484e27d9b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "08271b178f4d96aede079c3484e27d9b");
                        return;
                    }
                    synchronized (aVar.d) {
                        a.a(aVar, this);
                        if (aVar.c != null) {
                            try {
                                String cplc = aVar.c.getCplc();
                                Log.e("aaa", " getCplc cplc = " + cplc);
                                bVar.a(cplc);
                            } catch (RemoteException e) {
                                h.b(Log.getStackTraceString(e));
                                bVar.a(null);
                            }
                        } else {
                            h.b("HuaweiSSDManager getCplc() error, mNFCOpenService = null");
                            bVar.a(null);
                        }
                    }
                }
            }).start();
        }
    }
}
