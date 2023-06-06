package com.meituan.debug;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NetFilterDebugActivity extends Activity {
    public static ChangeQuickRedirect a;
    private static final Map<String, Long> g = new ConcurrentHashMap();
    private static final Map<String, Long> h = new ConcurrentHashMap();
    public TextView b;
    public EditText c;
    public CheckBox d;
    public CheckBox e;
    public CheckBox f;

    public static /* synthetic */ void a(NetFilterDebugActivity netFilterDebugActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, netFilterDebugActivity, changeQuickRedirect, false, "17baa90c0403f2b089240c4297819b04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, netFilterDebugActivity, changeQuickRedirect, false, "17baa90c0403f2b089240c4297819b04");
            return;
        }
        com.meituan.android.privacy.interfaces.c createNetFilter = Privacy.createNetFilter();
        if (createNetFilter instanceof com.meituan.android.privacy.impl.c) {
            TextView textView = netFilterDebugActivity.b;
            com.meituan.android.privacy.impl.c cVar = (com.meituan.android.privacy.impl.c) createNetFilter;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.privacy.impl.c.a;
            textView.setText(PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "07d9fd94afc1c3c24582c94bfd0ffc14", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "07d9fd94afc1c3c24582c94bfd0ffc14") : cVar.c.c());
            return;
        }
        netFilterDebugActivity.b.setText("未集成管控");
    }

    public static /* synthetic */ void b(NetFilterDebugActivity netFilterDebugActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, netFilterDebugActivity, changeQuickRedirect, false, "a94b8c751ac5583193e63d19bc216f77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, netFilterDebugActivity, changeQuickRedirect, false, "a94b8c751ac5583193e63d19bc216f77");
            return;
        }
        String trim = netFilterDebugActivity.c.getText().toString().trim();
        StringBuilder sb = new StringBuilder();
        sb.append("url: ");
        sb.append(trim);
        sb.append("\n");
        com.meituan.android.privacy.interfaces.c createNetFilter = Privacy.createNetFilter();
        long a2 = createNetFilter.a(trim);
        sb.append("supportedPrivacyTypesForURL: ");
        sb.append(a2);
        sb.append('\n');
        sb.append("   ");
        sb.append(new JSONArray((Collection) netFilterDebugActivity.a(a2)));
        sb.append('\n');
        c.a b = createNetFilter.b(trim);
        sb.append("checkAndFilterURL: statusCode=");
        sb.append(b.a());
        sb.append('\n');
        sb.append('\t');
        sb.append("filteredURL=");
        sb.append(b.e());
        sb.append('\n');
        netFilterDebugActivity.b.setText(sb.toString());
        PrintStream printStream = System.out;
        printStream.println("NetFilter: " + sb.toString());
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "638d236450d07fe021ca4934525227ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "638d236450d07fe021ca4934525227ab");
            return;
        }
        super.onCreate(bundle);
        com.meituan.android.privacy.impl.config.d.a(this).f.setDebugExactlyMatch(g);
        com.meituan.android.privacy.impl.config.d.a(this).f.setDebugPatternMatch(h);
        if (getIntent().getData() != null) {
            Uri data = getIntent().getData();
            Object[] objArr2 = {data};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a42bca205691b817faee003dab0d5a07", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a42bca205691b817faee003dab0d5a07");
            } else {
                PrintStream printStream = System.out;
                printStream.println("Privacy: 发现注册:" + data.toString());
                String queryParameter = data.getQueryParameter(DeviceInfo.SIGN);
                if (queryParameter != null) {
                    (queryParameter.contains("*") ? h : g).put(queryParameter, Long.MAX_VALUE);
                    Toast.makeText(this, queryParameter + "隐私接口注册成功", 0).show();
                }
            }
            finish();
            return;
        }
        setContentView(R.layout.activity_debug_netfilter);
        this.b = (TextView) findViewById(R.id.tv_status);
        findViewById(R.id.btn_netfilter_show).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.debug.NetFilterDebugActivity.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1dd884814570295ec94c355252eeea5d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1dd884814570295ec94c355252eeea5d");
                } else {
                    NetFilterDebugActivity.a(NetFilterDebugActivity.this);
                }
            }
        });
        this.c = (EditText) findViewById(R.id.et_netfilter_input);
        findViewById(R.id.btn_check_netfilter).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.debug.NetFilterDebugActivity.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "46cfff8b9077c661f10f01d1a70a1178", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "46cfff8b9077c661f10f01d1a70a1178");
                } else {
                    NetFilterDebugActivity.b(NetFilterDebugActivity.this);
                }
            }
        });
        this.d = (CheckBox) findViewById(R.id.cb_overlay);
        this.d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.meituan.debug.NetFilterDebugActivity.3
            public static ChangeQuickRedirect a;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Object[] objArr3 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "06d6f5bc447f001677dc0a71e336a660", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "06d6f5bc447f001677dc0a71e336a660");
                } else if (z) {
                    if (!d.a(NetFilterDebugActivity.this)) {
                        NetFilterDebugActivity netFilterDebugActivity = NetFilterDebugActivity.this;
                        Object[] objArr4 = {netFilterDebugActivity};
                        ChangeQuickRedirect changeQuickRedirect4 = d.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "58f664787daf0e4394e50c41d546aed4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "58f664787daf0e4394e50c41d546aed4");
                            return;
                        } else if (Build.VERSION.SDK_INT >= 23) {
                            netFilterDebugActivity.startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION"), 300);
                            return;
                        } else {
                            return;
                        }
                    }
                    c.a(NetFilterDebugActivity.this.getApplicationContext());
                    c.a(true);
                } else {
                    c.a(NetFilterDebugActivity.this.getApplicationContext());
                    c.a(false);
                }
            }
        });
        this.e = (CheckBox) findViewById(R.id.cb_no_double_check);
        this.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.meituan.debug.NetFilterDebugActivity.4
            public static ChangeQuickRedirect a;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Object[] objArr3 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fcbad76d01872c3dcbb14e2d3fb6fcd0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fcbad76d01872c3dcbb14e2d3fb6fcd0");
                } else {
                    com.meituan.android.privacy.impl.config.d.a(NetFilterDebugActivity.this).f.g = !z ? 1 : 0;
                }
            }
        });
        this.f = (CheckBox) findViewById(R.id.cb_pass_host);
        this.f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.meituan.debug.NetFilterDebugActivity.5
            public static ChangeQuickRedirect a;

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Object[] objArr3 = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "556df7bbf6266b994919f65076a6d976", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "556df7bbf6266b994919f65076a6d976");
                    return;
                }
                com.meituan.android.privacy.impl.c a2 = com.meituan.android.privacy.impl.c.a();
                if (z) {
                    a2.b = e.a;
                } else {
                    a2.b = Collections.emptySet();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("passHost:");
                for (String str : a2.b) {
                    sb.append(str);
                    sb.append(CommonConstant.Symbol.COMMA);
                }
                NetFilterDebugActivity.this.b.setText(sb.toString());
            }
        });
        findViewById(R.id.btn_debug_sign).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.debug.NetFilterDebugActivity.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5e554a6d8ad7a5e67d53a669974316f6", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5e554a6d8ad7a5e67d53a669974316f6");
                    return;
                }
                String trim = NetFilterDebugActivity.this.c.getText().toString().trim();
                (trim.contains("*") ? NetFilterDebugActivity.h : NetFilterDebugActivity.g).put(trim, Long.MAX_VALUE);
            }
        });
        findViewById(R.id.btn_show_debug_sign).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.debug.NetFilterDebugActivity.7
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7a106745897786d05464906744010abc", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7a106745897786d05464906744010abc");
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("显示手动注册的URL信息:\n");
                sb.append("完全匹配:\n");
                for (String str : NetFilterDebugActivity.g.keySet()) {
                    sb.append(str);
                    sb.append("\n");
                }
                sb.append("模糊匹配: \n");
                for (String str2 : NetFilterDebugActivity.h.keySet()) {
                    sb.append(str2);
                    sb.append("\n");
                }
                NetFilterDebugActivity.this.b.setText(sb.toString());
            }
        });
    }

    @Override // android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2ad9b35171ed796ca1ef826a48c2655", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2ad9b35171ed796ca1ef826a48c2655");
            return;
        }
        super.onResume();
        this.d.setChecked(d.a(this));
        this.e.setChecked(!com.meituan.android.privacy.impl.config.d.a(this).f.g);
        this.f.setChecked(!com.meituan.android.privacy.impl.c.a().b.isEmpty());
    }

    @NonNull
    private List<String> a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20ec51f4f5b0b24aae10ecf76e4b9b1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20ec51f4f5b0b24aae10ecf76e4b9b1e");
        }
        if (j == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"定位信息", "手机号", "身份证", "IDFA", "OAID", "AndroidId", "不可变设备标识符"};
        for (int i = 0; i < 7; i++) {
            if (((1 << i) & j) != 0) {
                arrayList.add(strArr[i]);
            }
        }
        return arrayList;
    }
}
