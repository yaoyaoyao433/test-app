package com.meituan.debug;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.meituan.android.privacy.impl.config.RealConfig;
import com.meituan.android.privacy.impl.config.m;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PrivacyDebugActivity extends Activity {
    public static ChangeQuickRedirect a;
    private TextView b;
    private String c;
    private StringBuffer d;
    private String e;

    public PrivacyDebugActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfe086834b976815b79a0e36c947d77e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfe086834b976815b79a0e36c947d77e");
            return;
        }
        this.c = PermissionGuard.PERMISSION_STORAGE;
        this.d = new StringBuffer();
    }

    public static /* synthetic */ void a(PrivacyDebugActivity privacyDebugActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, privacyDebugActivity, changeQuickRedirect, false, "ed946c06732e6bb76a46acb502a31b35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, privacyDebugActivity, changeQuickRedirect, false, "ed946c06732e6bb76a46acb502a31b35");
            return;
        }
        int a2 = Privacy.createPermissionGuard().a(privacyDebugActivity, privacyDebugActivity.c, privacyDebugActivity.e);
        Log.e("LDK", "retCode: " + a2);
        privacyDebugActivity.a(privacyDebugActivity.c, a2);
    }

    public static /* synthetic */ void a(PrivacyDebugActivity privacyDebugActivity, boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, privacyDebugActivity, changeQuickRedirect, false, "9cf911c313f99c280d5b62d9625c78b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, privacyDebugActivity, changeQuickRedirect, false, "9cf911c313f99c280d5b62d9625c78b6");
            return;
        }
        int a2 = Privacy.createPermissionGuard().a((Context) privacyDebugActivity, privacyDebugActivity.c, privacyDebugActivity.e, true);
        Log.e("LDK", "retCode: " + a2);
        privacyDebugActivity.a(privacyDebugActivity.c, a2);
    }

    public static /* synthetic */ void b(PrivacyDebugActivity privacyDebugActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, privacyDebugActivity, changeQuickRedirect, false, "59713fa5add8d48872d23dc7211be7aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, privacyDebugActivity, changeQuickRedirect, false, "59713fa5add8d48872d23dc7211be7aa");
        } else {
            Privacy.createPermissionGuard().a((Context) privacyDebugActivity, privacyDebugActivity.c, privacyDebugActivity.e, (com.meituan.android.privacy.interfaces.d) new g() { // from class: com.meituan.debug.PrivacyDebugActivity.7
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str, int i) {
                    Object[] objArr2 = {str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c4aee79748ed39bc4a20ecdb9b37bcd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c4aee79748ed39bc4a20ecdb9b37bcd");
                        return;
                    }
                    Log.e("LDK", "checkPermissionAsync retCode: " + i);
                    PrivacyDebugActivity.this.a(PrivacyDebugActivity.this.c, i);
                }
            });
        }
    }

    public static /* synthetic */ void c(PrivacyDebugActivity privacyDebugActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, privacyDebugActivity, changeQuickRedirect, false, "312668040607fe4359a65557acc28e19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, privacyDebugActivity, changeQuickRedirect, false, "312668040607fe4359a65557acc28e19");
        } else {
            Privacy.createPermissionGuard().a((Activity) privacyDebugActivity, privacyDebugActivity.c, privacyDebugActivity.e, (com.meituan.android.privacy.interfaces.d) new g() { // from class: com.meituan.debug.PrivacyDebugActivity.8
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.interfaces.d
                public final void onResult(String str, int i) {
                    Object[] objArr2 = {str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5872dffc0c31c259ad5f21b39a2b245", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5872dffc0c31c259ad5f21b39a2b245");
                        return;
                    }
                    Log.e("LDK", "onResult: " + i);
                    PrivacyDebugActivity.this.a(PrivacyDebugActivity.this.c, i);
                }
            });
        }
    }

    public static /* synthetic */ void d(PrivacyDebugActivity privacyDebugActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, privacyDebugActivity, changeQuickRedirect, false, "46378681a9ebd1f343e3502689d642e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, privacyDebugActivity, changeQuickRedirect, false, "46378681a9ebd1f343e3502689d642e8");
            return;
        }
        Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", privacyDebugActivity.getPackageName(), null));
        data.addFlags(y.a);
        privacyDebugActivity.startActivity(data);
    }

    public static /* synthetic */ void e(PrivacyDebugActivity privacyDebugActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, privacyDebugActivity, changeQuickRedirect, false, "7e0db557df4e85803692b5918dc8f128", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, privacyDebugActivity, changeQuickRedirect, false, "7e0db557df4e85803692b5918dc8f128");
            return;
        }
        privacyDebugActivity.b.setText("云控数据解析中.......");
        com.sankuai.android.jarvis.c.a("privacy-debug", new Runnable() { // from class: com.meituan.debug.PrivacyDebugActivity.9
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                String c;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bfcb44fc532ce0e88d15c1f4905c057", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bfcb44fc532ce0e88d15c1f4905c057");
                    return;
                }
                com.meituan.android.privacy.impl.config.d a2 = com.meituan.android.privacy.impl.config.d.a(PrivacyDebugActivity.this);
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.privacy.impl.config.d.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "f4ecfb03ff0b5073e6f6b5c60217e198", RobustBitConfig.DEFAULT_VALUE)) {
                    c = (String) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "f4ecfb03ff0b5073e6f6b5c60217e198");
                } else {
                    RealConfig realConfig = a2.b;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = RealConfig.a;
                    if (PatchProxy.isSupport(objArr4, realConfig, changeQuickRedirect4, false, "ed66f0d78480de566da36a17e8a5aafe", RobustBitConfig.DEFAULT_VALUE)) {
                        c = (String) PatchProxy.accessDispatch(objArr4, realConfig, changeQuickRedirect4, false, "ed66f0d78480de566da36a17e8a5aafe");
                    } else {
                        realConfig.b();
                        c = realConfig.h.c();
                    }
                }
                final String a3 = TextUtils.isEmpty(c) ? "云控数据为空" : PrivacyDebugActivity.this.a(c);
                PrivacyDebugActivity.this.b.post(new Runnable() { // from class: com.meituan.debug.PrivacyDebugActivity.9.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0c50ed661c34f8c1e992f897718251b9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0c50ed661c34f8c1e992f897718251b9");
                        } else {
                            PrivacyDebugActivity.this.b.setText(a3);
                        }
                    }
                });
            }
        }).start();
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1882006879f00f52a7c8d64561c1d0e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1882006879f00f52a7c8d64561c1d0e7");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.act_privacy_debug);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d97e580f8282305605af90afa0aa78f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d97e580f8282305605af90afa0aa78f5");
        } else {
            this.b = (TextView) findViewById(R.id.result);
            findViewById(R.id.btn_check).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.debug.PrivacyDebugActivity.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9400ece0c68c36795b466abcb4077498", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9400ece0c68c36795b466abcb4077498");
                    } else {
                        PrivacyDebugActivity.a(PrivacyDebugActivity.this);
                    }
                }
            });
            findViewById(R.id.btn_check_async).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.debug.PrivacyDebugActivity.10
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "714ff28452990f0b016165415b14b71e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "714ff28452990f0b016165415b14b71e");
                    } else {
                        PrivacyDebugActivity.b(PrivacyDebugActivity.this);
                    }
                }
            });
            findViewById(R.id.btn_request).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.debug.PrivacyDebugActivity.11
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1d273568d717ec6fa16a1d8281f9898a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1d273568d717ec6fa16a1d8281f9898a");
                    } else {
                        PrivacyDebugActivity.c(PrivacyDebugActivity.this);
                    }
                }
            });
            findViewById(R.id.btn_open_setting).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.debug.PrivacyDebugActivity.12
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "35a7678061ab9509c857099dafea8853", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "35a7678061ab9509c857099dafea8853");
                    } else {
                        PrivacyDebugActivity.d(PrivacyDebugActivity.this);
                    }
                }
            });
            CheckBox checkBox = (CheckBox) findViewById(R.id.enable_cb);
            checkBox.setChecked(com.meituan.android.privacy.impl.permission.d.a().d);
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.meituan.debug.PrivacyDebugActivity.13
                public static ChangeQuickRedirect a;

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Object[] objArr3 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dfd2942f2c7238a63d87f5ba1585ca3c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dfd2942f2c7238a63d87f5ba1585ca3c");
                    } else {
                        com.meituan.android.privacy.impl.permission.d.a().d = z;
                    }
                }
            });
            findViewById(R.id.info_btn).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.debug.PrivacyDebugActivity.14
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "58fbe07cf06947324578967afa9040d7", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "58fbe07cf06947324578967afa9040d7");
                    } else {
                        PrivacyDebugActivity.e(PrivacyDebugActivity.this);
                    }
                }
            });
            findViewById(R.id.refresh_btn).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.debug.PrivacyDebugActivity.15
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "867c387fdf29935756d98ac940e4b27b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "867c387fdf29935756d98ac940e4b27b");
                    } else {
                        com.sankuai.android.jarvis.c.a("privacy-debug-fetchSync", new Runnable() { // from class: com.meituan.debug.PrivacyDebugActivity.15.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4eff9775da996cfa004fc2ca9b99f4f5", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4eff9775da996cfa004fc2ca9b99f4f5");
                                } else {
                                    com.meituan.android.privacy.impl.config.d.a(PrivacyDebugActivity.this).b();
                                }
                            }
                        }).start();
                    }
                }
            });
            CheckBox checkBox2 = (CheckBox) findViewById(R.id.enable_mock);
            checkBox2.setChecked(m.b);
            checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.meituan.debug.PrivacyDebugActivity.16
                public static ChangeQuickRedirect a;

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Object[] objArr3 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "12a30f5d59c9f6c73707655f0cf3d7e8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "12a30f5d59c9f6c73707655f0cf3d7e8");
                    } else {
                        m.a(PrivacyDebugActivity.this, z);
                    }
                }
            });
            findViewById(R.id.btn_goto_netfilter).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.debug.PrivacyDebugActivity.17
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c53b5a11bc927951311206707b79ded8", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c53b5a11bc927951311206707b79ded8");
                        return;
                    }
                    Intent intent = new Intent(PrivacyDebugActivity.this, NetFilterDebugActivity.class);
                    try {
                        Method method = Activity.class.getMethod("startActivity", Intent.class);
                        method.setAccessible(true);
                        method.invoke(PrivacyDebugActivity.this, intent);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
            final CheckBox checkBox3 = (CheckBox) findViewById(R.id.cb_enable_floating);
            checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.meituan.debug.PrivacyDebugActivity.2
                public static ChangeQuickRedirect a;

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    Object[] objArr3 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5666b07c2131422ff17609c2a7ac7c43", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5666b07c2131422ff17609c2a7ac7c43");
                    } else if (Build.VERSION.SDK_INT >= 23) {
                        if (Settings.canDrawOverlays(PrivacyDebugActivity.this)) {
                            final a a2 = a.a(PrivacyDebugActivity.this);
                            if (z) {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "14cf905629a6612884fd4d490d56aebc", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "14cf905629a6612884fd4d490d56aebc");
                                    return;
                                } else if (a2.j) {
                                    return;
                                } else {
                                    if (a2.d == null) {
                                        a2.d = LayoutInflater.from(a2.b).inflate(R.layout.privacy_debug_floating, (ViewGroup) null);
                                        a2.e = (FrameLayout) a2.d.findViewById(R.id.fl_privacy_hint);
                                        a2.f = (TextView) a2.d.findViewById(R.id.tv_privacy_hint);
                                        a2.g = a2.d.findViewById(R.id.ll_privacy_list);
                                        a2.h = (ListView) a2.d.findViewById(R.id.lv_privacy_list);
                                        a2.i = (Button) a2.d.findViewById(R.id.btn_privacy_hide);
                                        a2.d.setOnTouchListener(a2);
                                        a2.d.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.debug.a.1
                                            public static ChangeQuickRedirect a;

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Object[] objArr5 = {view};
                                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4bbcbdeaf5b8b6a43b4b66bb1ca7238c", 4611686018427387906L)) {
                                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4bbcbdeaf5b8b6a43b4b66bb1ca7238c");
                                                } else if (a2.g.getVisibility() == 0) {
                                                } else {
                                                    if (a2.r.isEmpty()) {
                                                        Toast.makeText(a2.b, "隐私授权记录没有违规记录", 0).show();
                                                        return;
                                                    }
                                                    a2.e.setVisibility(8);
                                                    a2.g.setVisibility(0);
                                                }
                                            }
                                        });
                                        a2.i.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.debug.a.2
                                            public static ChangeQuickRedirect a;

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Object[] objArr5 = {view};
                                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8fb160e655630b2eb118b7c43a30b72d", 4611686018427387906L)) {
                                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8fb160e655630b2eb118b7c43a30b72d");
                                                    return;
                                                }
                                                a2.e.setVisibility(0);
                                                a2.g.setVisibility(8);
                                                a2.b();
                                            }
                                        });
                                        a2.h.setAdapter((ListAdapter) a2.l);
                                        a2.d.findViewById(R.id.btn_privacy_clear).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.debug.a.3
                                            public static ChangeQuickRedirect a;

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                Object[] objArr5 = {view};
                                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ad113dce95668eb1254e5094f1d46b88", 4611686018427387906L)) {
                                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ad113dce95668eb1254e5094f1d46b88");
                                                    return;
                                                }
                                                a2.r.clear();
                                                a2.a();
                                                a2.i.performClick();
                                            }
                                        });
                                    }
                                    a2.b();
                                    a2.a();
                                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        layoutParams.type = 2038;
                                    } else {
                                        layoutParams.type = 2006;
                                    }
                                    layoutParams.alpha = 0.8f;
                                    layoutParams.flags = 8;
                                    layoutParams.width = -2;
                                    layoutParams.height = -2;
                                    layoutParams.format = -2;
                                    a2.c.addView(a2.d, layoutParams);
                                    a2.j = true;
                                    return;
                                }
                            }
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a.a;
                            if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "ea5d4be1b31e7ec25aa5b0322c64b5a5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "ea5d4be1b31e7ec25aa5b0322c64b5a5");
                                return;
                            } else if (!a2.j || a2.d == null) {
                                return;
                            } else {
                                a2.c.removeView(a2.d);
                                a2.j = false;
                                return;
                            }
                        }
                        checkBox3.setChecked(false);
                        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                        intent.setData(Uri.parse("package:" + PrivacyDebugActivity.this.getPackageName()));
                        PrivacyDebugActivity.this.startActivityForResult(intent, 100);
                    } else {
                        checkBox3.setChecked(false);
                        Toast.makeText(PrivacyDebugActivity.this, "系统版本过低，不支持该功能", 0).show();
                    }
                }
            });
            findViewById(R.id.btn_check_ignore_monitor).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.debug.PrivacyDebugActivity.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "347f26a596681f78388a70e18ae423fd", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "347f26a596681f78388a70e18ae423fd");
                    } else {
                        PrivacyDebugActivity.a(PrivacyDebugActivity.this, true);
                    }
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dc2f2221719b49090cff5abd083b3dc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dc2f2221719b49090cff5abd083b3dc0");
            return;
        }
        final EditText editText = (EditText) findViewById(R.id.bu_et);
        editText.addTextChangedListener(new TextWatcher() { // from class: com.meituan.debug.PrivacyDebugActivity.4
            public static ChangeQuickRedirect a;

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                Object[] objArr4 = {editable};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "799c120c88fd74efe22ca1673748479b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "799c120c88fd74efe22ca1673748479b");
                } else {
                    PrivacyDebugActivity.this.e = editable.toString();
                }
            }
        });
        final String[] strArr = {"WaiMai-View", "homepage-like", "homepage-jingangqu", "homepage", "DDD", "Uptodate"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, strArr);
        arrayAdapter.setDropDownViewResource(17367049);
        Spinner spinner = (Spinner) findViewById(R.id.bu_spinner);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.meituan.debug.PrivacyDebugActivity.5
            public static ChangeQuickRedirect a;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                Object[] objArr4 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "358b30d85dfcbae94023203cc0cd10bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "358b30d85dfcbae94023203cc0cd10bd");
                    return;
                }
                editText.setText(strArr[i]);
                PrivacyDebugActivity.this.d = new StringBuffer();
                PrivacyDebugActivity.this.b.setText(PrivacyDebugActivity.this.d.toString());
            }
        });
        final String[] strArr2 = {PermissionGuard.PERMISSION_STORAGE, PermissionGuard.PERMISSION_STORAGE_READ, PermissionGuard.PERMISSION_STORAGE_WRITE, "Locate.once", "Locate.once", PermissionGuard.PERMISSION_LOCATION_CONTINUOUS, PermissionGuard.PERMISSION_CONTACTS_READ, PermissionGuard.PERMISSION_CONTACTS_WRITE, PermissionGuard.PERMISSION_CONTACTS, PermissionGuard.PERMISSION_CAMERA, PermissionGuard.PERMISSION_MICROPHONE, PermissionGuard.PERMISSION_CALENDAR_READ, PermissionGuard.PERMISSION_CALENDAR_WRITE, PermissionGuard.PERMISSION_CALENDAR, PermissionGuard.PERMISSION_PHONE_READ, PermissionGuard.PERMISSION_PHONE_CALL, PermissionGuard.PERMISSION_BODY_SENSORS, PermissionGuard.PERMISSION_MOTION, PermissionGuard.PERMISSION_BLUETOOTH, PermissionGuard.PERMISSION_BLUETOOTH_ADMIN, PermissionGuard.PERMISSION_BLUETOOTH_ADVERTISE, PermissionGuard.PERMISSION_BLUETOOTH_CONNECT, PermissionGuard.PERMISSION_BLUETOOTH_SCAN, PermissionGuard.PERMISSION_CLIPBOARD, PermissionGuard.PERMISSION_AL, PermissionGuard.PERMISSION_PHONE_BAN, PermissionGuard.PERMISSION_MULTIPLE_IMAGE_PICKERS};
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, 17367048, strArr2);
        arrayAdapter2.setDropDownViewResource(17367049);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner);
        spinner2.setAdapter((SpinnerAdapter) arrayAdapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.meituan.debug.PrivacyDebugActivity.6
            public static ChangeQuickRedirect a;

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                Object[] objArr4 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "427e143a19f3aec14db72a35e52a9764", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "427e143a19f3aec14db72a35e52a9764");
                    return;
                }
                PrivacyDebugActivity.this.c = strArr2[i];
                PrivacyDebugActivity.this.d = new StringBuffer();
                PrivacyDebugActivity.this.b.setText(PrivacyDebugActivity.this.d.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60df36a067bae74ea300e89ec04f9241", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60df36a067bae74ea300e89ec04f9241");
            return;
        }
        if (i != -100) {
            switch (i) {
                case -18:
                    StringBuffer stringBuffer = this.d;
                    stringBuffer.append(str);
                    stringBuffer.append(":RetCode=");
                    stringBuffer.append(i);
                    stringBuffer.append(":对应token未申请该权限\n");
                    break;
                case PermissionGuard.CODE_DENIED_DESTROYED /* -17 */:
                    StringBuffer stringBuffer2 = this.d;
                    stringBuffer2.append(str);
                    stringBuffer2.append(":RetCode=");
                    stringBuffer2.append(i);
                    stringBuffer2.append(":内存被回收导致没有授权结果 需要业务重新判断\n");
                    break;
                case -16:
                    StringBuffer stringBuffer3 = this.d;
                    stringBuffer3.append(str);
                    stringBuffer3.append(":RetCode=");
                    stringBuffer3.append(i);
                    stringBuffer3.append(":高版本权限，此手机不支持，拒绝\n");
                    break;
                case -15:
                    StringBuffer stringBuffer4 = this.d;
                    stringBuffer4.append(str);
                    stringBuffer4.append(":RetCode=");
                    stringBuffer4.append(i);
                    stringBuffer4.append(":触发行为为App自动触发的权限不允许弹窗\n");
                    break;
                case -14:
                    StringBuffer stringBuffer5 = this.d;
                    stringBuffer5.append(str);
                    stringBuffer5.append(":RetCode=");
                    stringBuffer5.append(i);
                    stringBuffer5.append(":ccheckOnly返回值，未授权\n");
                    break;
                case -13:
                    StringBuffer stringBuffer6 = this.d;
                    stringBuffer6.append(str);
                    stringBuffer6.append(":RetCode=");
                    stringBuffer6.append(i);
                    stringBuffer6.append(":checkOnly返回值 已授权\n");
                    break;
                case -12:
                    StringBuffer stringBuffer7 = this.d;
                    stringBuffer7.append(str);
                    stringBuffer7.append(":RetCode=");
                    stringBuffer7.append(i);
                    stringBuffer7.append(":权限未登记，同步接口调用，仅校验本地配置信息\n");
                    break;
                default:
                    switch (i) {
                        case -10:
                            StringBuffer stringBuffer8 = this.d;
                            stringBuffer8.append(str);
                            stringBuffer8.append(":RetCode=");
                            stringBuffer8.append(i);
                            stringBuffer8.append(":拒绝系统授予APP该权限\n");
                            break;
                        case -9:
                            StringBuffer stringBuffer9 = this.d;
                            stringBuffer9.append(str);
                            stringBuffer9.append(":RetCode=");
                            stringBuffer9.append(i);
                            stringBuffer9.append(":APP内该权限被拒绝\n");
                            break;
                        case -8:
                            StringBuffer stringBuffer10 = this.d;
                            stringBuffer10.append(str);
                            stringBuffer10.append(":RetCode=");
                            stringBuffer10.append(i);
                            stringBuffer10.append(":该权限不在App权限管控范围内\n");
                            break;
                        case -7:
                            StringBuffer stringBuffer11 = this.d;
                            stringBuffer11.append(str);
                            stringBuffer11.append(":RetCode=");
                            stringBuffer11.append(i);
                            stringBuffer11.append(":系统尚未授予App权限，需要系统弹窗 同shouldShowRequestPermissionRationale=true\n");
                            break;
                        case -6:
                            StringBuffer stringBuffer12 = this.d;
                            stringBuffer12.append(str);
                            stringBuffer12.append(":RetCode=");
                            stringBuffer12.append(i);
                            stringBuffer12.append(":App尚未同意授权该权限，需要弹窗\n");
                            break;
                        case -5:
                            StringBuffer stringBuffer13 = this.d;
                            stringBuffer13.append(str);
                            stringBuffer13.append(":RetCode=");
                            stringBuffer13.append(i);
                            stringBuffer13.append(":没有前台界面，拒绝弹出权限窗口\n");
                            break;
                        case -4:
                            StringBuffer stringBuffer14 = this.d;
                            stringBuffer14.append(str);
                            stringBuffer14.append(":RetCode=");
                            stringBuffer14.append(i);
                            stringBuffer14.append(":系统可能不允许再次弹出权限窗口, 此code不可信，用户可继续使用requestPermissions弹出系统权限窗口 同shouldShowRequestPermissionRationale=false\n");
                            break;
                        case -3:
                            StringBuffer stringBuffer15 = this.d;
                            stringBuffer15.append(str);
                            stringBuffer15.append(":RetCode=");
                            stringBuffer15.append(i);
                            stringBuffer15.append(":不允许弹出App内权限弹\n");
                            break;
                        case -2:
                            StringBuffer stringBuffer16 = this.d;
                            stringBuffer16.append(str);
                            stringBuffer16.append(":RetCode=");
                            stringBuffer16.append(i);
                            stringBuffer16.append(":未静态登记\n");
                            break;
                        case -1:
                            StringBuffer stringBuffer17 = this.d;
                            stringBuffer17.append(str);
                            stringBuffer17.append(":RetCode=");
                            stringBuffer17.append(i);
                            stringBuffer17.append(":对应业务的对应权限被云控关闭\n");
                            break;
                        case 0:
                            StringBuffer stringBuffer18 = this.d;
                            stringBuffer18.append(str);
                            stringBuffer18.append(":RetCode=");
                            stringBuffer18.append(i);
                            stringBuffer18.append(":权限未定或者用户在弹出窗口中点击了取消\n");
                            break;
                        case 1:
                            StringBuffer stringBuffer19 = this.d;
                            stringBuffer19.append(str);
                            stringBuffer19.append(":RetCode=");
                            stringBuffer19.append(i);
                            stringBuffer19.append(":权限被授予，来自于内存\n");
                            break;
                        case 2:
                            StringBuffer stringBuffer20 = this.d;
                            stringBuffer20.append(str);
                            stringBuffer20.append(":RetCode=");
                            stringBuffer20.append(i);
                            stringBuffer20.append(":权限被赋予\n");
                            break;
                        case 3:
                            StringBuffer stringBuffer21 = this.d;
                            stringBuffer21.append(str);
                            stringBuffer21.append(":RetCode=");
                            stringBuffer21.append(i);
                            stringBuffer21.append(":权限被赋予，该场景标识未注册\n");
                            break;
                        default:
                            StringBuffer stringBuffer22 = this.d;
                            stringBuffer22.append(str);
                            stringBuffer22.append(":RetCode=");
                            stringBuffer22.append(i);
                            stringBuffer22.append(":其他错误状态");
                            stringBuffer22.append(i);
                            stringBuffer22.append("\n");
                            break;
                    }
            }
        } else {
            StringBuffer stringBuffer23 = this.d;
            stringBuffer23.append(str);
            stringBuffer23.append(":RetCode=");
            stringBuffer23.append(i);
            stringBuffer23.append(":非法参数\n");
        }
        this.b.setText(this.d.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0044 -> B:14:0x0045). Please submit an issue!!! */
    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5966a644387359ccdc00fd61c08f3ca7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5966a644387359ccdc00fd61c08f3ca7");
        }
        if (str.startsWith(CommonConstant.Symbol.BIG_BRACKET_LEFT)) {
            return new JSONObject(str).toString(4);
        }
        if (str.startsWith("[")) {
            return new JSONArray(str).toString(4);
        }
        return str;
    }
}
