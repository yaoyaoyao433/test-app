package com.meituan.android.customerservice.callkefuuisdk.callkf;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.customerservice.callbase.utils.CallLog;
import com.meituan.android.customerservice.callkefuuisdk.callkf.a;
import com.meituan.android.customerservice.callkefuuisdk.d;
import com.meituan.android.customerservice.callkefuuisdk.e;
import com.meituan.android.customerservice.callkefuuisdk.widget.CallKFKeyboardView;
import com.meituan.android.customerservice.callkefuuisdk.widget.CallKFOperationView;
import com.meituan.android.customerservice.callkefuuisdk.widget.CallKFStateView;
import com.meituan.android.customerservice.cscallsdk.d;
import com.meituan.android.customerservice.kit.call.CallBaseFragmentActivity;
import com.meituan.android.customerservice.kit.utils.HeadSetChangedManager;
import com.meituan.android.customerservice.kit.utils.c;
import com.meituan.android.customerservice.kit.widget.PercentRelativeLayout;
import com.meituan.android.recce.props.gens.CaretHidden;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.smtt.sdk.TbsListener;
import io.agora.rtc.Constants;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallKFActivity extends CallBaseFragmentActivity implements a.InterfaceC0241a {
    public static ChangeQuickRedirect a;
    private static d e;
    private a d;
    private PercentRelativeLayout f;
    private ImageView g;
    private ImageView h;
    private TextView i;
    private CallKFStateView j;
    private CallKFKeyboardView k;
    private CallKFOperationView l;
    private LinearLayout m;
    private ImageView n;
    private LinearLayout o;

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final Activity a() {
        return this;
    }

    @Override // com.meituan.android.customerservice.kit.call.CallBaseFragmentActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        HashMap<String, String> hashMap;
        String str;
        HashMap hashMap2;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fe691056395bcfce34aab72474c0974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fe691056395bcfce34aab72474c0974");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.cs_voip_activity_call_kf);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd5efc4beb2f79ba1d47802d551f2682", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd5efc4beb2f79ba1d47802d551f2682");
        } else if (!f.a(getIntent(), "form_tip", false)) {
            try {
                hashMap = (HashMap) f.c(getIntent(), "call_init_data");
            } catch (Exception unused) {
                hashMap = null;
            }
            if (hashMap != null && !hashMap.isEmpty()) {
                e a2 = e.a(getApplication());
                Object[] objArr3 = {hashMap};
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "b43f658a4a103950aade35d075afbe78", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "b43f658a4a103950aade35d075afbe78");
                } else if (hashMap == null || hashMap.isEmpty()) {
                    CallLog.e(a2.getClass(), "call init with null data ");
                } else {
                    a2.h = hashMap;
                    com.meituan.android.pike.a aVar = com.meituan.android.pike.a.ENV_PROD;
                    String str2 = hashMap.get("call_init_env");
                    if (!TextUtils.isEmpty(str2)) {
                        char c = 65535;
                        int hashCode = str2.hashCode();
                        if (hashCode != -2054630910) {
                            if (hashCode != -2054201495) {
                                if (hashCode != -2054094684) {
                                    if (hashCode == -1298225421 && str2.equals("env_st")) {
                                        c = 1;
                                    }
                                } else if (str2.equals("env_test")) {
                                    c = 3;
                                }
                            } else if (str2.equals("env_prod")) {
                                c = 0;
                            }
                        } else if (str2.equals("env_beta")) {
                            c = 2;
                        }
                        switch (c) {
                            case 0:
                                aVar = com.meituan.android.pike.a.ENV_PROD;
                                break;
                            case 1:
                                aVar = com.meituan.android.pike.a.ENV_STAGING;
                                break;
                            case 2:
                                aVar = com.meituan.android.pike.a.ENV_BETA;
                                break;
                            case 3:
                                aVar = com.meituan.android.pike.a.ENV_TEST;
                                break;
                            default:
                                aVar = com.meituan.android.pike.a.ENV_PROD;
                                break;
                        }
                    }
                    CallLog.i(a2.getClass(), "init with env " + aVar.toString());
                    String str3 = a2.a().get("call_init_appkey");
                    String str4 = hashMap.get("call_init_appName");
                    e.a aVar2 = new e.a();
                    HashMap<String, Object> hashMap3 = new HashMap<>();
                    if (!TextUtils.isEmpty(str4)) {
                        hashMap3.put("appName", str4);
                    } else {
                        Short valueOf = Short.valueOf(aVar2.b());
                        Object[] objArr4 = {valueOf};
                        ChangeQuickRedirect changeQuickRedirect4 = e.a;
                        if (!PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "e385b01f25214eb975bc3e2712dad66b", RobustBitConfig.DEFAULT_VALUE)) {
                            switch (valueOf.shortValue()) {
                                case 1:
                                    str = "dianping";
                                    break;
                                case 3:
                                    str = "dianpingguanjia";
                                    break;
                                case 5:
                                    str = "jiehun";
                                    break;
                                case 6:
                                    str = "jiehunshangjia";
                                    break;
                                case 10:
                                    str = AbsApiFactory.PASSPORT_ONLINE_URL;
                                    break;
                                case 11:
                                    str = "waimai";
                                    break;
                                case 12:
                                    str = "maoyan";
                                    break;
                                case 14:
                                    str = "kaidianbao";
                                    break;
                                case 15:
                                    str = "waimaishangjia";
                                    break;
                                case 16:
                                    str = "qishou";
                                    break;
                                case 17:
                                    str = "zhongbao";
                                    break;
                                case 18:
                                    str = "lvxing";
                                    break;
                                case 22:
                                    str = "jiudianshangjia";
                                    break;
                                case 25:
                                    str = "waimaimifeng";
                                    break;
                                case 37:
                                    str = "qianbao";
                                    break;
                                case 41:
                                    str = "daxiang";
                                    break;
                                case 43:
                                    str = "meituanshangjia";
                                    break;
                                case 56:
                                    str = "xiaoxiang";
                                    break;
                                case 64:
                                    str = "zhenguo";
                                    break;
                                case 71:
                                    str = "zhenguoguanjia";
                                    break;
                                case 72:
                                    str = "paotuishangjia";
                                    break;
                                case 76:
                                    str = "dache";
                                    break;
                                case 84:
                                    str = "MTWaimaishangjia";
                                    break;
                                case CaretHidden.INDEX_ID /* 96 */:
                                    str = "xiaodai";
                                    break;
                                case 110:
                                    str = "kuailvjinhuo";
                                    break;
                                case Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED /* 153 */:
                                    str = "xinghuo";
                                    break;
                                case TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_5 /* 175 */:
                                    str = "shangoushangjia";
                                    break;
                                case 181:
                                    str = "neixin";
                                    break;
                                case 194:
                                    str = "haixing";
                                    break;
                                case TbsListener.ErrorCode.INCR_UPDATE_EXCEPTION /* 218 */:
                                    str = "kuailvjiagong";
                                    break;
                                case TbsListener.ErrorCode.RENAME_FAIL /* 231 */:
                                    str = "mobai";
                                    break;
                                default:
                                    if (valueOf.shortValue() > 0) {
                                        str = String.valueOf(valueOf);
                                        break;
                                    } else {
                                        str = "unknown";
                                        break;
                                    }
                            }
                        } else {
                            str = (String) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "e385b01f25214eb975bc3e2712dad66b");
                        }
                        hashMap3.put("appName", str);
                    }
                    com.meituan.android.customerservice.cscallsdk.d.j().a(a2.e, aVar2, (byte) 0, TextUtils.isEmpty(str3) ? "0736c281cd5b4d419c23f00115104618" : str3, aVar, hashMap3);
                }
            }
            com.meituan.android.customerservice.kit.floating.b.a().a("call_kf");
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ba822f4f1f63a474edc7c02418c1726a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ba822f4f1f63a474edc7c02418c1726a");
        } else {
            this.c = new int[]{0, 0, 0, c.a(this, 85.0f)};
            this.f = (PercentRelativeLayout) findViewById(R.id.root_view);
            this.g = (ImageView) findViewById(R.id.iv_zoom_in);
            this.j = (CallKFStateView) findViewById(R.id.state_view);
            this.k = (CallKFKeyboardView) findViewById(R.id.keyboard_view);
            this.l = (CallKFOperationView) findViewById(R.id.operation_view);
            this.m = (LinearLayout) findViewById(R.id.ll_upload_proofs);
            this.n = (ImageView) findViewById(R.id.btn_upload_proofs);
            TypedArray typedArray = e.a(getApplication()).f;
            if (typedArray != null) {
                this.f.setBackgroundResource(typedArray.getResourceId(0, R.drawable.cs_voip_bg_call_kf));
                this.j.setCallStateColor(typedArray.getColor(2, ContextCompat.getColor(this, R.color.cs_voip_black)));
                this.j.setCallTimeTextColor(typedArray.getColor(3, ContextCompat.getColor(this, R.color.cs_voip_grey_666666)));
                this.j.setNameTextColor(typedArray.getColor(1, ContextCompat.getColor(this, R.color.cs_voip_grey_333333)));
                this.l.setHangUpImgRes(typedArray.getResourceId(14, R.drawable.cs_voip_btn_hangup_normal));
                this.l.setKeyboardImgRes(typedArray.getResourceId(7, R.drawable.cs_voip_keyboard));
                this.l.setKeyboardViewEnabled(typedArray.getBoolean(10, true));
                this.l.setHandsFreeTvTextColor(typedArray.getColor(13, ContextCompat.getColor(this, R.color.cs_voip_grey_666666)));
                this.l.setHangUpTextColor(typedArray.getColor(15, ContextCompat.getColor(this, R.color.cs_voip_grey_666666)));
                this.l.setMuteTextColor(typedArray.getColor(6, ContextCompat.getColor(this, R.color.cs_voip_grey_666666)));
                this.l.setKeyboardTextColor(typedArray.getColor(9, ContextCompat.getColor(this, R.color.cs_voip_grey_666666)));
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(c.a(this, 52.0f), c.a(this, 52.0f));
                if (typedArray.getBoolean(16, true)) {
                    layoutParams.addRule(11);
                } else {
                    layoutParams.addRule(9);
                }
                this.g.setLayoutParams(layoutParams);
            }
            this.h = (ImageView) findViewById(R.id.iv_signal);
            this.i = (TextView) findViewById(R.id.iv_signal_tip);
            this.o = (LinearLayout) findViewById(R.id.iv_signal_content);
            try {
                hashMap2 = (HashMap) f.c(getIntent(), "call_init_data");
            } catch (Exception unused2) {
                hashMap2 = null;
            }
            if (com.meituan.android.customerservice.cscallsdk.d.j().g().d() == 0 && !f.a(getIntent(), "form_tip", false)) {
                if (!f.a(getIntent(), "form_tip", false) && hashMap2 != null) {
                    e.a(getApplication()).b = (String) hashMap2.get("call_avatar_url");
                    if (!TextUtils.isEmpty((CharSequence) hashMap2.get("call_avatar_url"))) {
                        this.j.setAvatarImgUrl((String) hashMap2.get("call_avatar_url"));
                    }
                    e.a(getApplication()).c = (String) hashMap2.get("call_name");
                    if (!TextUtils.isEmpty((CharSequence) hashMap2.get("call_name"))) {
                        this.j.setNameText((String) hashMap2.get("call_name"));
                    }
                    if (hashMap2.get("call_is_show_upload_btn") != null) {
                        e.a(getApplication()).d = Boolean.valueOf((String) hashMap2.get("call_is_show_upload_btn")).booleanValue();
                        if (e.a(getApplication()).d) {
                            this.m.setVisibility(0);
                        } else {
                            this.m.setVisibility(8);
                        }
                    } else {
                        e.a(getApplication()).d = false;
                        this.m.setVisibility(8);
                    }
                } else {
                    e.a(getApplication()).c = null;
                    e.a(getApplication()).b = null;
                    e.a(getApplication()).d = false;
                }
            } else {
                String str5 = e.a(getApplication()).b;
                if (!TextUtils.isEmpty(str5)) {
                    this.j.setAvatarImgUrl(str5);
                }
                String str6 = e.a(getApplication()).c;
                if (!TextUtils.isEmpty(str6)) {
                    this.j.setNameText(str6);
                }
                if (e.a(getApplication()).d) {
                    this.m.setVisibility(0);
                } else {
                    this.m.setVisibility(8);
                }
            }
            if (com.meituan.android.customerservice.cscallsdk.d.j().g().d() != 0 && !f.a(getIntent(), "form_tip", false)) {
                com.meituan.android.customerservice.callkefuuisdk.utils.a.a(this, (int) R.string.cs_voip_in_call);
            }
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8fa51775d4696310198b1f251ae80d9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8fa51775d4696310198b1f251ae80d9e");
        } else {
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.CallKFActivity.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i;
                    com.meituan.android.customerservice.kit.floating.a aVar3;
                    com.meituan.android.customerservice.kit.floating.a aVar4;
                    Object[] objArr7 = {view};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "e65099aa828182fa406c26b3b2a135a8", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "e65099aa828182fa406c26b3b2a135a8");
                        return;
                    }
                    a aVar5 = CallKFActivity.this.d;
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = a.a;
                    if (PatchProxy.isSupport(objArr8, aVar5, changeQuickRedirect8, false, "23a3d12697ebbae25078d442b06b183e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, aVar5, changeQuickRedirect8, false, "23a3d12697ebbae25078d442b06b183e");
                    } else if (aVar5.f()) {
                    } else {
                        Intent intent = new Intent(aVar5.c.a(), CallKFRingService.class);
                        intent.putExtra("show_call_kf_notification", true);
                        Activity a3 = aVar5.c.a();
                        Object[] objArr9 = {a3, intent};
                        ChangeQuickRedirect changeQuickRedirect9 = c.a;
                        if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "c488c38625e3a4ac05ced014604d4d71", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "c488c38625e3a4ac05ced014604d4d71");
                        } else if (Build.VERSION.SDK_INT >= 26) {
                            a3.startForegroundService(intent);
                        } else {
                            a3.startService(intent);
                        }
                        com.meituan.android.customerservice.callkefuuisdk.widget.a aVar6 = new com.meituan.android.customerservice.callkefuuisdk.widget.a(aVar5.b);
                        if (aVar5.l != null) {
                            aVar6.setFloatImgRes(aVar5.l.getResourceId(17, R.drawable.cs_voip_layer_online));
                            aVar6.setTimeTextColor(aVar5.l.getColor(18, ContextCompat.getColor(aVar5.b, R.color.cs_voip_floating_text)));
                        }
                        a.b bVar = new a.b(aVar6);
                        com.meituan.android.customerservice.kit.floating.a aVar7 = new com.meituan.android.customerservice.kit.floating.a(aVar5.b);
                        Object[] objArr10 = {aVar6};
                        ChangeQuickRedirect changeQuickRedirect10 = com.meituan.android.customerservice.kit.floating.a.a;
                        if (PatchProxy.isSupport(objArr10, aVar7, changeQuickRedirect10, false, "77f35dccee5fdc85f70ca84907322454", RobustBitConfig.DEFAULT_VALUE)) {
                            aVar3 = (com.meituan.android.customerservice.kit.floating.a) PatchProxy.accessDispatch(objArr10, aVar7, changeQuickRedirect10, false, "77f35dccee5fdc85f70ca84907322454");
                            i = 3;
                        } else {
                            Object[] objArr11 = {aVar6, -2, -2};
                            ChangeQuickRedirect changeQuickRedirect11 = com.meituan.android.customerservice.kit.floating.a.a;
                            i = 3;
                            if (PatchProxy.isSupport(objArr11, aVar7, changeQuickRedirect11, false, "b275f380c770fc0a6c950a630be8cb81", RobustBitConfig.DEFAULT_VALUE)) {
                                com.meituan.android.customerservice.kit.floating.a aVar8 = (com.meituan.android.customerservice.kit.floating.a) PatchProxy.accessDispatch(objArr11, aVar7, changeQuickRedirect11, false, "b275f380c770fc0a6c950a630be8cb81");
                            } else {
                                aVar7.b.a(aVar6, -2, -2);
                            }
                            aVar3 = aVar7;
                        }
                        int a4 = c.a(aVar5.b, 10.0f);
                        Object[] objArr12 = new Object[i];
                        objArr12[0] = 8388629;
                        objArr12[1] = Integer.valueOf(a4);
                        objArr12[2] = 0;
                        ChangeQuickRedirect changeQuickRedirect12 = com.meituan.android.customerservice.kit.floating.a.a;
                        if (PatchProxy.isSupport(objArr12, aVar3, changeQuickRedirect12, false, "ffa25cdac18d3ce1c0686cb9f3a923b2", RobustBitConfig.DEFAULT_VALUE)) {
                            aVar3 = (com.meituan.android.customerservice.kit.floating.a) PatchProxy.accessDispatch(objArr12, aVar3, changeQuickRedirect12, false, "ffa25cdac18d3ce1c0686cb9f3a923b2");
                        } else {
                            aVar3.b.a(8388629, a4, 0);
                        }
                        Object[] objArr13 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect13 = com.meituan.android.customerservice.kit.floating.a.a;
                        if (PatchProxy.isSupport(objArr13, aVar3, changeQuickRedirect13, false, "dfbbf5163b5e03b4ebb22239b49bc24d", RobustBitConfig.DEFAULT_VALUE)) {
                            com.meituan.android.customerservice.kit.floating.a aVar9 = (com.meituan.android.customerservice.kit.floating.a) PatchProxy.accessDispatch(objArr13, aVar3, changeQuickRedirect13, false, "dfbbf5163b5e03b4ebb22239b49bc24d");
                        } else {
                            aVar3.b.a(bVar);
                        }
                        com.meituan.android.customerservice.kit.floating.b a5 = com.meituan.android.customerservice.kit.floating.b.a();
                        Object[] objArr14 = {"call_kf", aVar7};
                        ChangeQuickRedirect changeQuickRedirect14 = com.meituan.android.customerservice.kit.floating.b.a;
                        if (PatchProxy.isSupport(objArr14, a5, changeQuickRedirect14, false, "b5ec483e2b0b65379041a0d914ef8282", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr14, a5, changeQuickRedirect14, false, "b5ec483e2b0b65379041a0d914ef8282");
                        } else if (!TextUtils.isEmpty("call_kf")) {
                            com.meituan.android.customerservice.kit.floating.a aVar10 = a5.b.get("call_kf");
                            if (aVar10 != null) {
                                aVar10.a();
                            }
                            a5.b.put("call_kf", aVar7);
                        }
                        com.meituan.android.customerservice.kit.floating.b a6 = com.meituan.android.customerservice.kit.floating.b.a();
                        Object[] objArr15 = {"call_kf"};
                        ChangeQuickRedirect changeQuickRedirect15 = com.meituan.android.customerservice.kit.floating.b.a;
                        if (PatchProxy.isSupport(objArr15, a6, changeQuickRedirect15, false, "69b3416d1752ab9404b79a9874b58ff3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr15, a6, changeQuickRedirect15, false, "69b3416d1752ab9404b79a9874b58ff3");
                        } else if (!TextUtils.isEmpty("call_kf") && (aVar4 = a6.b.get("call_kf")) != null) {
                            Object[] objArr16 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect16 = com.meituan.android.customerservice.kit.floating.a.a;
                            if (PatchProxy.isSupport(objArr16, aVar4, changeQuickRedirect16, false, "fe668d10b30bcd5b9b8fe2ff514cb51e", RobustBitConfig.DEFAULT_VALUE)) {
                                com.meituan.android.customerservice.kit.floating.a aVar11 = (com.meituan.android.customerservice.kit.floating.a) PatchProxy.accessDispatch(objArr16, aVar4, changeQuickRedirect16, false, "fe668d10b30bcd5b9b8fe2ff514cb51e");
                            } else if (!aVar4.c && aVar4.b.a()) {
                                aVar4.b.a(0);
                                aVar4.c = true;
                            }
                        }
                        if (!TextUtils.isEmpty(aVar5.h())) {
                            Statistics.getChannel("cs").writeModelClick(aVar5.i, "b_cs_w6wmxqej_mc", com.meituan.android.customerservice.callkefuuisdk.utils.a.a(aVar5.c.a()), aVar5.h());
                        }
                        aVar5.c.a().finish();
                        aVar5.c.a().overridePendingTransition(0, R.anim.cs_voip_anim_call_out);
                    }
                }
            });
            this.l.setClickListener(new View.OnClickListener() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.CallKFActivity.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z;
                    Object[] objArr7 = {view};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "3d94065815d1140bff10b756e08b16c7", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "3d94065815d1140bff10b756e08b16c7");
                        return;
                    }
                    final a aVar3 = CallKFActivity.this.d;
                    Object[] objArr8 = {view};
                    ChangeQuickRedirect changeQuickRedirect8 = a.a;
                    if (PatchProxy.isSupport(objArr8, aVar3, changeQuickRedirect8, false, "a48f774f0449956f42b60ffe34cd8b70", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr8, aVar3, changeQuickRedirect8, false, "a48f774f0449956f42b60ffe34cd8b70");
                        return;
                    }
                    int id = view.getId();
                    if (id == R.id.iv_mute) {
                        Object[] objArr9 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect9 = a.a;
                        if (PatchProxy.isSupport(objArr9, aVar3, changeQuickRedirect9, false, "b22f18acaf0dfb7b29573a0896483f01", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, aVar3, changeQuickRedirect9, false, "b22f18acaf0dfb7b29573a0896483f01");
                            return;
                        }
                        aVar3.g = !aVar3.g;
                        aVar3.a();
                        if (com.meituan.android.customerservice.cscallsdk.d.j().g().d() == 3) {
                            com.meituan.android.customerservice.cscallsdk.d.j().b(aVar3.g);
                        }
                        if (TextUtils.isEmpty(aVar3.h())) {
                            return;
                        }
                        Statistics.getChannel("cs").writeModelClick(aVar3.i, "b_cs_x4vgn43o_mc", com.meituan.android.customerservice.callkefuuisdk.utils.a.a(aVar3.c.a()), aVar3.h());
                    } else if (id == R.id.iv_hands_free) {
                        Object[] objArr10 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect10 = a.a;
                        if (PatchProxy.isSupport(objArr10, aVar3, changeQuickRedirect10, false, "81224071c0943130bec6fd2f42448825", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, aVar3, changeQuickRedirect10, false, "81224071c0943130bec6fd2f42448825");
                            return;
                        }
                        Object[] objArr11 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect11 = a.a;
                        if (PatchProxy.isSupport(objArr11, aVar3, changeQuickRedirect11, false, "233a8f3946f32a2a159cefc717a86ee6", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr11, aVar3, changeQuickRedirect11, false, "233a8f3946f32a2a159cefc717a86ee6")).booleanValue();
                        } else {
                            z = aVar3.d.isWiredHeadsetOn() || aVar3.d.isBluetoothA2dpOn() || aVar3.d.isBluetoothScoOn();
                        }
                        if (z) {
                            return;
                        }
                        aVar3.h = !aVar3.h;
                        aVar3.b();
                        com.meituan.android.customerservice.cscallsdk.d.j().a(aVar3.h);
                        if (TextUtils.isEmpty(aVar3.h())) {
                            return;
                        }
                        Statistics.getChannel("cs").writeModelClick(aVar3.i, "b_cs_67uqm20l_mc", com.meituan.android.customerservice.callkefuuisdk.utils.a.a(aVar3.c.a()), aVar3.h());
                    } else if (id == R.id.iv_keyboard) {
                        Object[] objArr12 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect12 = a.a;
                        if (PatchProxy.isSupport(objArr12, aVar3, changeQuickRedirect12, false, "5f2a6f5bfe402bdc07487c9a4cc824e1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr12, aVar3, changeQuickRedirect12, false, "5f2a6f5bfe402bdc07487c9a4cc824e1");
                        } else {
                            aVar3.f = !aVar3.f;
                            if (aVar3.f) {
                                aVar3.c.b(0);
                                aVar3.c.c(8);
                                aVar3.c.d(8);
                                aVar3.c.g().setVisibility(8);
                                aVar3.c.e(8);
                                aVar3.c.a(-1);
                                if (aVar3.l != null) {
                                    aVar3.c.h(aVar3.l.getResourceId(8, R.drawable.cs_voip_keyboard_checked));
                                } else {
                                    aVar3.c.h(R.drawable.cs_voip_keyboard_checked);
                                }
                            } else {
                                aVar3.c.b(8);
                                aVar3.c.c(0);
                                aVar3.c.d(0);
                                aVar3.c.g().setVisibility(0);
                                if (aVar3.l != null) {
                                    aVar3.c.a(aVar3.l.getResourceId(0, R.drawable.cs_voip_bg_call_kf));
                                    aVar3.c.h(aVar3.l.getResourceId(7, R.drawable.cs_voip_keyboard));
                                } else {
                                    aVar3.c.a(R.drawable.cs_voip_bg_call_kf);
                                    aVar3.c.h(R.drawable.cs_voip_keyboard);
                                }
                                if (e.a(aVar3.b).d) {
                                    aVar3.c.e(0);
                                }
                                aVar3.c.a("");
                            }
                        }
                        if (TextUtils.isEmpty(aVar3.h())) {
                            return;
                        }
                        Statistics.getChannel("cs").writeModelClick(aVar3.i, "b_cs_71vh33g1_mc", com.meituan.android.customerservice.callkefuuisdk.utils.a.a(aVar3.c.a()), aVar3.h());
                    } else if (id != R.id.iv_hang_up || aVar3.f()) {
                    } else {
                        if (com.meituan.android.customerservice.cscallsdk.d.j().g().d() == 3) {
                            Object[] objArr13 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect13 = a.a;
                            if (PatchProxy.isSupport(objArr13, aVar3, changeQuickRedirect13, false, "ee74f10d75e64ea176185cabbff37f18", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr13, aVar3, changeQuickRedirect13, false, "ee74f10d75e64ea176185cabbff37f18");
                            } else {
                                com.meituan.android.customerservice.cscallsdk.d.j().b((d.c) aVar3);
                                aVar3.c.a().runOnUiThread(new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.a.4
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr14 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect14 = a;
                                        if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "8d1ab567bc3115f09872b7f888374e2d", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "8d1ab567bc3115f09872b7f888374e2d");
                                            return;
                                        }
                                        com.meituan.android.customerservice.callkefuuisdk.utils.a.a(a.this.c.a(), (int) R.string.cs_voip_call_end);
                                        a.this.c.d().setVisibility(4);
                                    }
                                });
                            }
                        } else {
                            com.meituan.android.customerservice.callkefuuisdk.utils.a.a(aVar3.c.a(), (int) R.string.cs_voip_call_self_cancel);
                        }
                        aVar3.g();
                        if (!TextUtils.isEmpty(aVar3.h())) {
                            Statistics.getChannel("cs").writeModelClick(aVar3.i, "b_cs_34pfypax_mc", com.meituan.android.customerservice.callkefuuisdk.utils.a.a(aVar3.c.a()), aVar3.h());
                        }
                        com.meituan.android.customerservice.cscallsdk.d.j().d();
                    }
                }
            });
            this.k.setClickListener(new View.OnClickListener() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.CallKFActivity.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr7 = {view};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "aac39c5890db18cd550df906112edaad", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "aac39c5890db18cd550df906112edaad");
                        return;
                    }
                    a aVar3 = CallKFActivity.this.d;
                    Object[] objArr8 = {view};
                    ChangeQuickRedirect changeQuickRedirect8 = a.a;
                    if (PatchProxy.isSupport(objArr8, aVar3, changeQuickRedirect8, false, "b4abe5686fda467fcf8d83383ad03815", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, aVar3, changeQuickRedirect8, false, "b4abe5686fda467fcf8d83383ad03815");
                        return;
                    }
                    String str7 = "";
                    int id = view.getId();
                    if (id == R.id.tv_number_one) {
                        str7 = "1";
                    } else if (id == R.id.tv_number_two) {
                        str7 = "2";
                    } else if (id == R.id.tv_number_three) {
                        str7 = "3";
                    } else if (id == R.id.tv_number_four) {
                        str7 = "4";
                    } else if (id == R.id.tv_number_five) {
                        str7 = "5";
                    } else if (id == R.id.number_six) {
                        str7 = "6";
                    } else if (id == R.id.tv_number_seven) {
                        str7 = "7";
                    } else if (id == R.id.tv_number_eight) {
                        str7 = "8";
                    } else if (id == R.id.tv_number_nine) {
                        str7 = "9";
                    } else if (id == R.id.tv_number_asterisk) {
                        str7 = "*";
                    } else if (id == R.id.tv_number_zero) {
                        str7 = "0";
                    } else if (id == R.id.tv_number_sign) {
                        str7 = "#";
                    }
                    String str8 = str7;
                    if (TextUtils.isEmpty(str8)) {
                        return;
                    }
                    Object[] objArr9 = {str8};
                    ChangeQuickRedirect changeQuickRedirect9 = a.a;
                    if (PatchProxy.isSupport(objArr9, aVar3, changeQuickRedirect9, false, "0aa25621bb6774f99cd7a0a4f7eb62c7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, aVar3, changeQuickRedirect9, false, "0aa25621bb6774f99cd7a0a4f7eb62c7");
                    } else {
                        com.meituan.android.customerservice.cscallsdk.d.j().a(str8);
                    }
                    Object[] objArr10 = {str8};
                    ChangeQuickRedirect changeQuickRedirect10 = a.a;
                    if (PatchProxy.isSupport(objArr10, aVar3, changeQuickRedirect10, false, "315d983176592ea30c6b6172b1539345", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, aVar3, changeQuickRedirect10, false, "315d983176592ea30c6b6172b1539345");
                        return;
                    }
                    aVar3.c.a(aVar3.c.c().getText().toString() + str8);
                }
            });
            this.n.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.CallKFActivity.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr7 = {view};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "f819a77c14a2af47fd66cda8da2ab568", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "f819a77c14a2af47fd66cda8da2ab568");
                        return;
                    }
                    if (CallKFActivity.e != null) {
                        CallKFActivity.e.a(CallKFActivity.this);
                    }
                    Statistics.getChannel("cs").writeModelClick(AppUtil.generatePageInfoKey(CallKFActivity.this), "b_cs_7i815dau_mc", com.meituan.android.customerservice.callkefuuisdk.utils.a.a(CallKFActivity.this), "c_cs_h0wake03");
                }
            });
        }
        this.d = new a(this, getApplication());
        final a aVar3 = this.d;
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = a.a;
        if (PatchProxy.isSupport(objArr7, aVar3, changeQuickRedirect7, false, "6cadfee019ff70b02a55b380435329e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, aVar3, changeQuickRedirect7, false, "6cadfee019ff70b02a55b380435329e7");
        } else {
            com.meituan.android.customerservice.kit.floating.b.a().a("call_kf");
            com.meituan.android.customerservice.cscallsdk.d.j().a((com.meituan.android.customerservice.cscallsdk.b) aVar3);
            com.meituan.android.customerservice.cscallsdk.d.j().a((d.a) aVar3);
            HeadSetChangedManager.a().a(aVar3.c.a().getApplicationContext());
            HeadSetChangedManager.a().a(aVar3);
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = a.a;
            if (PatchProxy.isSupport(objArr8, aVar3, changeQuickRedirect8, false, "83d56dd08974b394e729ffc56de145f2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, aVar3, changeQuickRedirect8, false, "83d56dd08974b394e729ffc56de145f2");
            } else {
                aVar3.h = com.meituan.android.customerservice.cscallsdk.d.j().e();
                aVar3.c();
                aVar3.g = com.meituan.android.customerservice.cscallsdk.d.j().f();
                aVar3.a();
            }
            aVar3.a(com.meituan.android.customerservice.cscallsdk.d.j().g().d());
            Intent intent = new Intent(aVar3.c.a(), CallKFRingService.class);
            intent.putExtra("show_call_kf_notification", true);
            aVar3.c.a().startService(intent);
            if (aVar3.j == null) {
                aVar3.j = new ServiceConnection() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.ServiceConnection
                    public final void onServiceDisconnected(ComponentName componentName) {
                    }

                    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
                    @Override // android.content.ServiceConnection
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onServiceConnected(android.content.ComponentName r14, android.os.IBinder r15) {
                        /*
                            Method dump skipped, instructions count: 234
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.customerservice.callkefuuisdk.callkf.a.AnonymousClass1.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
                    }
                };
                aVar3.c.a().bindService(intent, aVar3.j, 1);
            }
            if (a.m != null) {
                a.m.a("PAGE", "");
            }
            com.meituan.android.customerservice.cscallsdk.a aVar4 = com.meituan.android.customerservice.cscallsdk.a.CONNECTED;
            Object[] objArr9 = {aVar4};
            ChangeQuickRedirect changeQuickRedirect9 = a.a;
            if (PatchProxy.isSupport(objArr9, aVar3, changeQuickRedirect9, false, "5022349758a2ef50999faece0f50689e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, aVar3, changeQuickRedirect9, false, "5022349758a2ef50999faece0f50689e");
            } else {
                com.meituan.android.customerservice.callbase.avengine.c cVar = new com.meituan.android.customerservice.callbase.avengine.c();
                if (aVar4 == com.meituan.android.customerservice.cscallsdk.a.CONNECTED) {
                    cVar.a = 0;
                }
            }
        }
        if (f.a(getIntent(), "form_tip", false)) {
            Statistics.getChannel("cs").writeModelClick(AppUtil.generatePageInfoKey(this), "b_cs_kf6e0n9l_mv", com.meituan.android.customerservice.callkefuuisdk.utils.a.a(this), "c_cs_jhkfam5v");
        }
    }

    @Override // com.meituan.android.customerservice.kit.call.CallBaseFragmentActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96a6770ef31fb83c7e9475b031884994", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96a6770ef31fb83c7e9475b031884994");
            return;
        }
        super.onResume();
        if (e != null) {
            e.b();
        }
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "376eb44949da55fb26309c1e88b290a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "376eb44949da55fb26309c1e88b290a5");
        } else if (i <= 0) {
            this.f.setBackgroundColor(-1);
        } else {
            this.f.setBackgroundResource(i);
        }
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c18845890e84980a54bfee57ae28ad4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c18845890e84980a54bfee57ae28ad4e");
        } else {
            this.k.setVisibility(i);
        }
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53ad4f1f7dcd5411f83fcd493c30ea94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53ad4f1f7dcd5411f83fcd493c30ea94");
        } else {
            this.j.setVisibility(i);
        }
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb4aed40548840acd88e981136372726", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb4aed40548840acd88e981136372726");
        } else {
            this.g.setVisibility(i);
        }
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ce89862290566eaf018fc8a5714895c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ce89862290566eaf018fc8a5714895c");
        } else {
            this.m.setVisibility(i);
        }
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final ImageView b() {
        return this.n;
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final TextView c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54498c2262fdba91fe94b40e52572eb4", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54498c2262fdba91fe94b40e52572eb4") : this.k.getNumberInput();
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final void a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9d9e475a8313fdbab237f2ca4f70e93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9d9e475a8313fdbab237f2ca4f70e93");
        } else {
            this.k.setInputText(charSequence);
        }
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final void b(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1b7e897cadaa642bba44415af778c9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1b7e897cadaa642bba44415af778c9d");
        } else {
            this.j.setCallState(charSequence);
        }
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final TextView d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cee78a45009b7d823dac8adc539e4a48", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cee78a45009b7d823dac8adc539e4a48") : this.j.getTimeTextView();
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final ImageView e() {
        return this.h;
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final TextView f() {
        return this.i;
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final LinearLayout g() {
        return this.o;
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final void f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a6ee79e9096c283ce4b5318b2bdeebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a6ee79e9096c283ce4b5318b2bdeebb");
        } else {
            this.l.setMuteImgRes(i);
        }
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final void g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bed57e20be65a7f92b43f338955b13c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bed57e20be65a7f92b43f338955b13c");
        } else {
            this.l.setHandsFreeImgRes(i);
        }
    }

    @Override // com.meituan.android.customerservice.callkefuuisdk.callkf.a.InterfaceC0241a
    public final void h(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "825700f9e9fca2bad889841997f12931", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "825700f9e9fca2bad889841997f12931");
        } else {
            this.l.setKeyboardImgRes(i);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a1140195d99c9029af13b76e5d50250", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a1140195d99c9029af13b76e5d50250")).booleanValue();
        }
        if (i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.meituan.android.customerservice.kit.call.CallBaseFragmentActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f9ec3ccde6a225ab9b749d797690e3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f9ec3ccde6a225ab9b749d797690e3d");
            return;
        }
        if (e != null) {
            e.a();
        }
        a aVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "b1281cf80dd3cd97870a791df93d9248", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "b1281cf80dd3cd97870a791df93d9248");
        } else {
            b bVar = aVar.e;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "c84a5e0979637aa2b8f361a6aa31ed8d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "c84a5e0979637aa2b8f361a6aa31ed8d");
            } else {
                bVar.d.removeCallbacks(bVar.e);
                bVar.b = 0;
            }
            com.meituan.android.customerservice.cscallsdk.d.j().b((d.c) aVar);
            com.meituan.android.customerservice.cscallsdk.d.j().b((com.meituan.android.customerservice.cscallsdk.b) aVar);
            com.meituan.android.customerservice.cscallsdk.d.j().b((d.a) aVar);
            HeadSetChangedManager.a().b(aVar);
            HeadSetChangedManager.a().b(aVar.c.a().getApplicationContext());
            if (aVar.k != null) {
                aVar.k.a(null);
            }
            if (aVar.j != null) {
                aVar.c.a().unbindService(aVar.j);
            }
        }
        if (this.f != null) {
            this.f.setBackgroundResource(0);
        }
        super.onDestroy();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f346b5bfff1c5beb5867f38262f4ce14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f346b5bfff1c5beb5867f38262f4ce14");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (e != null) {
            e.a(this, i, i2, intent);
        }
        com.meituan.android.privacy.aop.a.b();
    }

    public static void a(com.meituan.android.customerservice.callkefuuisdk.d dVar) {
        e = dVar;
    }
}
