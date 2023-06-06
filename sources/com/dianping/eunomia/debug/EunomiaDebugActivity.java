package com.dianping.eunomia.debug;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.dianping.eunomia.f;
import com.dianping.eunomia.model.models.Group;
import com.dianping.eunomia.model.models.ModuleConfig;
import com.dianping.eunomia.model.models.ModuleConfigResponse;
import com.dianping.eunomia.model.models.ModuleItem;
import com.dianping.eunomia.model.models.ModuleProp;
import com.dianping.util.c;
import com.dianping.util.j;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class EunomiaDebugActivity extends AppCompatActivity {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(EunomiaDebugActivity eunomiaDebugActivity, String str, List list, String str2) {
        Object[] objArr = {str, list, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eunomiaDebugActivity, changeQuickRedirect, false, "1e731125a8e100c5e03ed7451859d65d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eunomiaDebugActivity, changeQuickRedirect, false, "1e731125a8e100c5e03ed7451859d65d");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("key:" + str);
        if (c.a(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add("=====group=====");
                for (com.dianping.eunomia.c cVar : (List) it.next()) {
                    StringBuilder sb = new StringBuilder("key:");
                    sb.append(cVar.a);
                    sb.append("\ntype:");
                    sb.append(cVar.c);
                    sb.append("\npriority:");
                    sb.append(cVar.d == Integer.MAX_VALUE ? "default" : Integer.valueOf(cVar.d));
                    sb.append("\nurl:");
                    sb.append(cVar.b);
                    sb.append("\n------");
                    arrayList.add(sb.toString());
                }
            }
        } else {
            arrayList.add(str2);
        }
        new AlertDialog.a(eunomiaDebugActivity).a((CharSequence[]) arrayList.toArray(new String[0]), (DialogInterface.OnClickListener) null).b();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b949364c87e37705f060a0fad57de25d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b949364c87e37705f060a0fad57de25d");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.eunomia_debug_activity);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.eunomia_request_container);
        Object[] objArr2 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc4a2e1e35b10add554862c28fdcff83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc4a2e1e35b10add554862c28fdcff83");
        } else {
            viewGroup.addView(a("全量请求", new View.OnClickListener() { // from class: com.dianping.eunomia.debug.EunomiaDebugActivity.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d3a91ac0b8ee9e5a6b89b66a7876d8fc", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d3a91ac0b8ee9e5a6b89b66a7876d8fc");
                        return;
                    }
                    f.a().a(true);
                    new com.sankuai.meituan.android.ui.widget.a(EunomiaDebugActivity.this, "全量请求已发送", -1).e(17).a();
                }
            }));
            viewGroup.addView(a("增量请求", new View.OnClickListener() { // from class: com.dianping.eunomia.debug.EunomiaDebugActivity.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d463c2a15bb11b01334bfc31206c94f3", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d463c2a15bb11b01334bfc31206c94f3");
                        return;
                    }
                    f.a().a(false);
                    new com.sankuai.meituan.android.ui.widget.a(EunomiaDebugActivity.this, "增量请求已发送", -1).e(17).a();
                }
            }));
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.eunomia_clear_container);
        Object[] objArr3 = {viewGroup2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "973a4f040782a58176e681370b5efe58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "973a4f040782a58176e681370b5efe58");
        } else {
            viewGroup2.addView(a("清除Cache", new View.OnClickListener() { // from class: com.dianping.eunomia.debug.EunomiaDebugActivity.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3b9e6e846115c9f2c17f9c94d6fc40ef", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3b9e6e846115c9f2c17f9c94d6fc40ef");
                        return;
                    }
                    a.e();
                    new com.sankuai.meituan.android.ui.widget.a(EunomiaDebugActivity.this, "已清除Cache", -1).e(17).a();
                }
            }));
            viewGroup2.addView(a("清除本地存储", new View.OnClickListener() { // from class: com.dianping.eunomia.debug.EunomiaDebugActivity.7
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6ab9a0add3bd686d16419f7b31e34842", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6ab9a0add3bd686d16419f7b31e34842");
                        return;
                    }
                    a.f();
                    new com.sankuai.meituan.android.ui.widget.a(EunomiaDebugActivity.this, "已清除本地存储", -1).e(17).a();
                }
            }));
        }
        ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.eunomia_template_container);
        Object[] objArr4 = {viewGroup3};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6164c99f7eff1492fa6d6a1cb74b4120", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6164c99f7eff1492fa6d6a1cb74b4120");
        } else {
            viewGroup3.addView(a("最近一次业务调用的模板", new View.OnClickListener() { // from class: com.dianping.eunomia.debug.EunomiaDebugActivity.8
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "024cc1408fa60b20f645adc8abd97bfe", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "024cc1408fa60b20f645adc8abd97bfe");
                        return;
                    }
                    String a2 = a.a();
                    List<ArrayList<com.dianping.eunomia.c>> list = null;
                    if (TextUtils.isEmpty(a2)) {
                        new AlertDialog.a(EunomiaDebugActivity.this).a(new String[]{"没有检测到"}, (DialogInterface.OnClickListener) null).b();
                        return;
                    }
                    for (String str : a2.split("&")) {
                        list = a.b(str);
                        if (c.a(list)) {
                            break;
                        }
                    }
                    EunomiaDebugActivity.a(EunomiaDebugActivity.this, a2, list, "没有在Cache中找到");
                }
            }));
            final View inflate = LayoutInflater.from(this).inflate(R.layout.eunomia_debug_item, viewGroup3, false);
            TextView textView = (TextView) inflate.findViewById(R.id.eunomia_item_text_view);
            textView.setText("获取模板");
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.eunomia.debug.EunomiaDebugActivity.9
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d23f9777dc2aac0b1389fac1b05318e9", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d23f9777dc2aac0b1389fac1b05318e9");
                        return;
                    }
                    String trim = ((EditText) inflate.findViewById(R.id.eunomia_item_edit_text)).getText().toString().trim();
                    if (TextUtils.isEmpty(trim)) {
                        new AlertDialog.a(EunomiaDebugActivity.this).a(new String[]{"请输入有效key"}, (DialogInterface.OnClickListener) null).b();
                    } else {
                        EunomiaDebugActivity.a(EunomiaDebugActivity.this, trim, a.b(trim), "没有找到");
                    }
                }
            });
            viewGroup3.addView(inflate);
            final View inflate2 = LayoutInflater.from(this).inflate(R.layout.eunomia_debug_item, viewGroup3, false);
            TextView textView2 = (TextView) inflate2.findViewById(R.id.eunomia_item_text_view);
            textView2.setText("获取组装前的原始模板");
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.eunomia.debug.EunomiaDebugActivity.10
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Group[] groupArr;
                    ModuleItem[] moduleItemArr;
                    Object[] objArr5 = {view};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a7c3a86e63ad6bf256d7df3acc4b88be", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a7c3a86e63ad6bf256d7df3acc4b88be");
                        return;
                    }
                    String trim = ((EditText) inflate2.findViewById(R.id.eunomia_item_edit_text)).getText().toString().trim();
                    ArrayList arrayList = new ArrayList();
                    if (TextUtils.isEmpty(trim)) {
                        arrayList.add("请输入有效key");
                    } else {
                        ModuleConfig c = a.c(trim);
                        arrayList.add("key:" + trim);
                        if (c != null && c.a(c.groups)) {
                            for (Group group : c.groups) {
                                arrayList.add("=====group=====");
                                if (c.a(group.modules)) {
                                    for (ModuleItem moduleItem : group.modules) {
                                        StringBuilder sb = new StringBuilder("key:");
                                        sb.append(moduleItem.key);
                                        sb.append("\npriority:");
                                        sb.append(moduleItem.pri == Integer.MAX_VALUE ? "default" : Integer.valueOf(moduleItem.pri));
                                        sb.append("\n------");
                                        arrayList.add(sb.toString());
                                    }
                                }
                            }
                        } else {
                            arrayList.add("没有找到");
                        }
                    }
                    new AlertDialog.a(EunomiaDebugActivity.this).a((CharSequence[]) arrayList.toArray(new String[0]), (DialogInterface.OnClickListener) null).b();
                }
            });
            viewGroup3.addView(inflate2);
        }
        ViewGroup viewGroup4 = (ViewGroup) findViewById(R.id.eunomia_module_container);
        Object[] objArr5 = {viewGroup4};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "15c4831e274c96e1a91245d8c74b0185", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "15c4831e274c96e1a91245d8c74b0185");
        } else {
            final View inflate3 = LayoutInflater.from(this).inflate(R.layout.eunomia_debug_item, viewGroup4, false);
            TextView textView3 = (TextView) inflate3.findViewById(R.id.eunomia_item_text_view);
            textView3.setText("获取模块独立属性");
            textView3.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.eunomia.debug.EunomiaDebugActivity.11
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8b2a1aaf8522e9f0e1deda42388d9186", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8b2a1aaf8522e9f0e1deda42388d9186");
                        return;
                    }
                    String trim = ((EditText) inflate3.findViewById(R.id.eunomia_item_edit_text)).getText().toString().trim();
                    ArrayList arrayList = new ArrayList();
                    if (TextUtils.isEmpty(trim)) {
                        arrayList.add("请输入有效key");
                    } else {
                        arrayList.add("key:" + trim);
                        ModuleProp d = a.d(trim);
                        if (d != null) {
                            arrayList.add("type:" + d.type + "\nurl:" + d.url + "\ndata:" + new Gson().toJson(d.data) + "\noperation:" + d.operation + "\ntargetModule:" + d.targetModule);
                        } else {
                            arrayList.add("没有找到");
                        }
                    }
                    new AlertDialog.a(EunomiaDebugActivity.this).a((CharSequence[]) arrayList.toArray(new String[0]), (DialogInterface.OnClickListener) null).b();
                }
            });
            viewGroup4.addView(inflate3);
        }
        ViewGroup viewGroup5 = (ViewGroup) findViewById(R.id.eunomia_other_container);
        Object[] objArr6 = {viewGroup5};
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "40690e33029ed644cf81c5176969a527", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "40690e33029ed644cf81c5176969a527");
            return;
        }
        viewGroup5.addView(a("最近一次商户页调用的框架标识", new View.OnClickListener() { // from class: com.dianping.eunomia.debug.EunomiaDebugActivity.12
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object obj;
                Object[] objArr7 = {view};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "7825031c826f85572e3d018ddee8cb8a", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "7825031c826f85572e3d018ddee8cb8a");
                    return;
                }
                String b = a.b();
                ArrayList arrayList = new ArrayList();
                if (TextUtils.isEmpty(b)) {
                    arrayList.add("没有检测到");
                } else {
                    arrayList.add("key:" + b);
                    if (!TextUtils.isEmpty(b)) {
                        obj = null;
                        for (String str : b.split("&")) {
                            obj = a.e(str);
                            if (obj != null) {
                                break;
                            }
                        }
                    } else {
                        obj = null;
                    }
                    StringBuilder sb = new StringBuilder("frame:");
                    if (obj == null) {
                        obj = "没有在Cache中找到";
                    }
                    sb.append(obj);
                    arrayList.add(sb.toString());
                }
                new AlertDialog.a(EunomiaDebugActivity.this).a((CharSequence[]) arrayList.toArray(new String[0]), (DialogInterface.OnClickListener) null).b();
            }
        }));
        viewGroup5.addView(a("获取本地存储的timeStamp/md5/env", new View.OnClickListener() { // from class: com.dianping.eunomia.debug.EunomiaDebugActivity.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr7 = {view};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "a609d671040bd8f98073989f1373a188", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "a609d671040bd8f98073989f1373a188");
                    return;
                }
                ModuleConfigResponse c = a.c();
                ArrayList arrayList = new ArrayList();
                if (c == null) {
                    arrayList.add("没有本地存储");
                } else {
                    arrayList.add("timeStamp:" + c.timeStamp + "\nmd5:" + c.md5 + "\nenv:" + c.env);
                }
                new AlertDialog.a(EunomiaDebugActivity.this).a((CharSequence[]) arrayList.toArray(new String[0]), (DialogInterface.OnClickListener) null).b();
            }
        }));
        viewGroup5.addView(a("生成本地兜底资源(由于隐私合规整改，该逻辑已被注释掉)", new View.OnClickListener() { // from class: com.dianping.eunomia.debug.EunomiaDebugActivity.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr7 = {view};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "6a14bcdbd1ff210aa399386757ed6d56", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "6a14bcdbd1ff210aa399386757ed6d56");
                }
            }
        }));
        viewGroup5.addView(a("获取本地兜底资源(timeStamp/md5)", new View.OnClickListener() { // from class: com.dianping.eunomia.debug.EunomiaDebugActivity.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr7 = {view};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "fc6bfc00edd73583c4ba439965af020b", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "fc6bfc00edd73583c4ba439965af020b");
                    return;
                }
                ModuleConfigResponse d = a.d();
                ArrayList arrayList = new ArrayList();
                if (d == null || !c.a(d.configs) || !c.a(d.moduleProps)) {
                    arrayList.add("本地资源异常");
                } else {
                    arrayList.add("timeStamp:" + d.timeStamp + "\nmd5:" + d.md5);
                }
                new AlertDialog.a(EunomiaDebugActivity.this).a((CharSequence[]) arrayList.toArray(new String[0]), (DialogInterface.OnClickListener) null).b();
            }
        }));
    }

    private TextView a(String str, View.OnClickListener onClickListener) {
        Object[] objArr = {str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22290007346044385a546eadd6cc8177", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22290007346044385a546eadd6cc8177");
        }
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(16.0f);
        textView.setTextColor(ContextCompat.getColor(this, R.color.gray_light_333333));
        textView.setGravity(19);
        int a2 = j.a(this, 10.0f);
        textView.setPadding(a2, a2, a2, a2);
        textView.setOnClickListener(onClickListener);
        return textView;
    }
}
