package com.meituan.android.quickpass.qpdev.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import com.meituan.android.quickpass.qpdev.QuickPassDevManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class QuickPassDevActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect a;
    private ProgressDialog b;
    private Switch c;
    private LinearLayout d;

    public QuickPassDevActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07cbbb7e1ccdf7bb9711afc155d535ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07cbbb7e1ccdf7bb9711afc155d535ae");
        } else {
            this.b = null;
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba04b1b5ebfb45a47520be4ba7252a01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba04b1b5ebfb45a47520be4ba7252a01");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_config);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08c070ff50d99fdc79f223f2f71e9397", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08c070ff50d99fdc79f223f2f71e9397");
        } else {
            this.c = (Switch) findViewById(R.id.swt_online_debug);
            this.d = (LinearLayout) findViewById(R.id.lv_container);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8da728119d8a65918a669ca3eefd86b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8da728119d8a65918a669ca3eefd86b0");
            } else {
                HashMap hashMap = QuickPassDevManager.a().c;
                if (hashMap != null) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        final String str2 = (String) entry.getValue();
                        Object[] objArr4 = {str, str2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "207a7a163594e5246832343a74de7984", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "207a7a163594e5246832343a74de7984");
                        } else {
                            Button button = new Button(this);
                            button.setText(str);
                            button.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.quickpass.qpdev.activity.QuickPassDevActivity.1
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    Object[] objArr5 = {view};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "928d0fadac23a26af39146afd702a96b", 4611686018427387906L)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "928d0fadac23a26af39146afd702a96b");
                                    } else {
                                        QuickPassDevActivity.this.startActivity(new Intent(str2));
                                    }
                                }
                            });
                            this.d.addView(button);
                        }
                    }
                }
            }
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f3311b4dcfbb044852f0484cfeb83857", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f3311b4dcfbb044852f0484cfeb83857");
        } else {
            this.c.setOnCheckedChangeListener(this);
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4bc2252879122c7caacf46297a56c5be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4bc2252879122c7caacf46297a56c5be");
        } else {
            this.c.setChecked(QuickPassDevManager.a().b.isOnlineLogOn());
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dbfe0e772297a087005368cf86d5c5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dbfe0e772297a087005368cf86d5c5c");
        } else if (compoundButton == this.c) {
            QuickPassDevManager.a().b.setOnlineLogOn(z);
        }
    }

    public void onOnlineLogClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0385b40eca81348bcb83924c75b22506", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0385b40eca81348bcb83924c75b22506");
        } else {
            startActivity(new Intent("com.meituan.android.quickpass.uptsm.onlinelog"));
        }
    }
}
